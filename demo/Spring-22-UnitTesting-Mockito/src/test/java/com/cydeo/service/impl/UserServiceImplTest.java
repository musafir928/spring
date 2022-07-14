package com.cydeo.service.impl;

import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;


    @Test
    void deleteByUserName_test() {
        userService.deleteByUserName("mikesmith@gmail.com");
//        verify(userRepository).deleteByUserName("mikesmith@gmail.com");
//        verify(userRepository, times(2)).deleteByUserName("mikesmith@gmail.com");
//        verify(userRepository, atLeastOnce()).deleteByUserName("mikesmith@gmail.com");

        // in order
        InOrder inOrder = inOrder(userRepository);

        inOrder.verify(userRepository).findAll();
        inOrder.verify(userRepository).deleteByUserName("mikesmith@gmail.com");
    }

}