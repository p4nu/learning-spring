package com.panuvaltanen.lil.learningspring.data.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private long id;

    @Column(name = "ROOM_ID", nullable = false)
    private BigInteger roomId;

    @Column(name = "GUEST_ID", nullable = false)
    private BigInteger guestId;

    @Column(name = "RES_DATE")
    private Date reservationDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigInteger getRoomId() {
        return roomId;
    }

    public void setRoomId(BigInteger roomId) {
        this.roomId = roomId;
    }

    public BigInteger getGuestId() {
        return guestId;
    }

    public void setGuestId(BigInteger guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
