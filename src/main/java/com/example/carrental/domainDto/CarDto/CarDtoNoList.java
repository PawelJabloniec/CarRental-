package com.example.carrental.domainDto.CarDto;

import com.example.carrental.domain.Car.CarStatus;
import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class CarDtoNoList {
    private Long id;
    private String mark;
    private String model;
    private String bodyType;
    private int yearOfProduction;
    private String colour;
    private int run;
    private CarStatus carStatus;
    private BigDecimal dayPrice;
}
