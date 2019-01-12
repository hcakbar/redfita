package com.akbar.redfita.controller;

import com.akbar.redfita.domain.entity.UserEntity;
import com.akbar.redfita.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private UserEntity userEntity;

    @Test
    public void shouldReturnAllUsers() throws Exception {
        mockMvc.perform(get("/user/all"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("All users")));
    }

    @Test
    public void shouldReturnOneUser() throws Exception {
        mockMvc.perform(get("/user/id/" + 0)).andExpect(status().isOk())
                .andExpect(content().string(containsString("")));
    }

    @Test
    public void shouldAddAUser() throws Exception {
        userEntity = new UserEntity();
        userEntity.setFirstName("Sam");
        userEntity.setLastName("John");

        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(userEntity);

        mockMvc.perform(get("/user/id/" + 0)).andExpect(status().isOk())
                .andExpect(content().string(containsString("")));


    }


}
