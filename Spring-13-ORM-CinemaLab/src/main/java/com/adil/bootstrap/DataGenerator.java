package com.adil.bootstrap;

import com.adil.repository.AccountRepository;
import com.adil.repository.CinemaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DataGenerator implements CommandLineRunner {
    private final AccountRepository accountRepository;
    private final CinemaRepository cinemaRepository;

    public DataGenerator(AccountRepository accountRepository, CinemaRepository cinemaRepository) {
        this.accountRepository = accountRepository;
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("|=============================|");
//        accountRepository.findAllByAgeBetween(18,50).forEach(System.out::println);
//        System.out.println("|=============================|");
//        accountRepository.findAllByAddressStartingWith("Clark").forEach(System.out::println);
//        System.out.println("|=============================|");
//        accountRepository.findAllByOrderByAge().forEach(System.out::println);
//        System.out.println("|=============================|");
//        accountRepository.getAllAccounts().forEach(System.out::println);
//        System.out.println("|=============================|");

//        accountRepository.getAllAccounts(UserRole.ADMIN).forEach(System.out::println);
//        System.out.println("|=============================|");

//        accountRepository.getAllAccountAgeLessThan(36).forEach(System.out::println);
//        System.out.println("|=============================|");
//
//        System.out.println("|=============================|");
//        accountRepository.getAllByKeyword("u").forEach(System.out::println);
//        System.out.println("|=============================|");

//        System.out.println("|=============================|");
//        accountRepository.getAllAccountAgeLessThan(37).forEach(System.out::println);
//        System.out.println("|=============================|");

        System.out.println("|=============================|");
        cinemaRepository.sortDistinctCinemaWithSponsoredName().forEach(System.out::println);
        System.out.println("|=============================|");


    }
}
