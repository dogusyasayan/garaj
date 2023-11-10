package com.garaj.domain.car;

import com.garaj.domain.timestamp.AuditTime;
import com.garaj.model.enums.CarRentalOption;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car_status", schema = "car_schema")
public class CarStatus extends AuditTime implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "car_id")
    private Long carId;

    @Enumerated(value = EnumType.STRING)
    private CarRentalOption carRentalOption;

    @Column(name = "active")
    private boolean active;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarStatus carStatus = (CarStatus) o;
        return Objects.equals(this.hashCode(), carStatus.hashCode());
    }

    @Override
    public int hashCode() {
        if (isActive()) {
            return Objects.hash(carRentalOption, active);
        }
        return Objects.hash(id);
    }
}

