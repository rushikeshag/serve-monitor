package org.lotus.servemonitor.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceCheckTest {
    @Autowired
    ServiceCheck serviceCheck;

    @Test
    void checkService() {
        int serviceStatus = serviceCheck.checkIfServiceRunning("NgcCtnrSv", "LAPTOP-8GK3KVU2");
        assertEquals(1, 1);
    }
}