package com.namafunction.namafunction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namafunction.namafunction.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
