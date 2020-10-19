package org.lotus.servemonitor.mail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceImplementationTest {
    @Autowired
    EmailServiceImplementation emailServiceImplementation;

    @Test
    void testSendSimpleMessage(){
        emailServiceImplementation.sendSimpleMessage("rushigore6913@gmail.com","rushikeshagore@gmail.com","Test mail","Hello");
    }
}
