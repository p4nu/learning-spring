package com.panuvaltanen.lil.learningspring;

import com.panuvaltanen.lil.learningspring.data.entity.Guest;
import com.panuvaltanen.lil.learningspring.data.entity.Reservation;
import com.panuvaltanen.lil.learningspring.data.entity.Room;
import com.panuvaltanen.lil.learningspring.data.repository.GuestRepository;
import com.panuvaltanen.lil.learningspring.data.repository.ReservationRepository;
import com.panuvaltanen.lil.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringApplication.class, args);
    }

    // TODO: Put this in a new controller file
    @RestController
    @RequestMapping("/rooms")
    public class RoomController {
        @Autowired
        private RoomRepository roomRepository;

        @GetMapping
        public Iterable<Room> getRooms() {
            return this.roomRepository.findAll();
        }
    }

    // TODO: Put this in a new controller file
    @RestController
    @RequestMapping("/guests")
    public class GuestController {
        @Autowired
        private GuestRepository guestRepository;

        @GetMapping
        public Iterable<Guest> getGuests() {
            return this.guestRepository.findAll();
        }
    }

    // TODO: Put this in a new controller file
    @RestController
    @RequestMapping("/reservations")
    public class ReservationController {
        @Autowired
        private ReservationRepository reservationRepository;

        @GetMapping
        public Iterable<Reservation> getReservations() {
            return this.reservationRepository.findAll();
        }
    }
}
