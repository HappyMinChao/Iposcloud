package com.beijing.cloud.ServiceDemo.service;

import com.beijing.cloud.ServiceDemo.ServiceDemoApplication;
import com.beijing.cloud.ServiceDemo.service.dto.UserDTO;
import com.beijing.ds.EnableLefuds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ServiceDemoApplication.class)
@EnableLefuds
@WebAppConfiguration
public class TestApp {
    @Autowired
    private  UserService userService;


    @Test
    public void TestService() throws Exception {
        UserDTO udto = new UserDTO();
        userService.save(udto);
    }
}