#!/usr/bin/env bash

mkdir -p "$HOME"/podman/volumes/postgres
rm -rf "$HOME"/podman/volumes/postgres/data

podman run --rm --name pg-podman -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=dev -d -p 5432:5432 -v "$HOME"/podman/volumes/postgres:/var/lib/postgresql postgres
sleep 3

podman cp schema.sql pg-podman:/var/lib/postgresql
podman cp data.sql pg-podman:/var/lib/postgresql

podman exec -it pg-podman bash

export PGPASSWORD=postgres

psql -U postgres -d dev -h localhost -f /var/lib/postgresql/schema.sql
psql -U postgres -d dev -h localhost -f /var/lib/postgresql/data.sql
