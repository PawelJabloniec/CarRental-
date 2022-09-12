package com.example.carrental.domain.RentalOffice;

import com.example.carrental.domain.Car.Car;
import com.example.carrental.domain.User.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CarRentalOffice {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Car car;

    private LocalDateTime localDateTimeOfRent;

    private LocalDateTime getLocalDateTimeOfReturn;

}
