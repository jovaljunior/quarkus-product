package br.com.mp.product.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Product extends PanacheEntity {

    @NotBlank(message="Name may not be blank")
    private String name;

    @NotBlank(message="Brand may not be blank")
    private String brand;

    @NotNull
    @CreationTimestamp
    @Column(name="model_year")
    private LocalDate modelYear;

    @CreationTimestamp
    @Column(name="created_date_time", insertable=true)
    private LocalDateTime createdDateTime;

    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getModelYear() {
        return modelYear;
    }

    public void setModelYear(LocalDate modelYear) {
        this.modelYear = modelYear;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
