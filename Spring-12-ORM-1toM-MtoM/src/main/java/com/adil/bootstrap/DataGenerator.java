package com.adil.bootstrap;

import com.adil.entity.Payment;
import com.adil.entity.PaymentDetail;
import com.adil.repository.PaymentRepository;
import net.bytebuddy.ClassFileVersion;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;

    public DataGenerator(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        ClassFileVersion LocalDate;
        Payment payment1 = new Payment(LocalDate.of(2022, 4, 19), new BigDecimal("150000"), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal("140000"), new BigDecimal("10000"), LocalDate.of(2022, 4, 24));

        payment1.setPaymentDetail(paymentDetail1);

        Payment payment2 = new Payment(LocalDate.of(2022, 4, 25), new BigDecimal("100000"), Status.FAILURE);
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal("90000"), new BigDecimal("5000"), LocalDate.of(2022, 4, 29));

        payment2.setPaymentDetail(paymentDetail2);
    }
}
