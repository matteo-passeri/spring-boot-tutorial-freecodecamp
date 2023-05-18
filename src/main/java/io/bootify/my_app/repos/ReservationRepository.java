package io.bootify.my_app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import io.bootify.my_app.model.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
