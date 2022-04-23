package com.adil.repository;

import com.adil.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface PaymentRepository extends JpaRepository<Payment, BigInteger> {
}
