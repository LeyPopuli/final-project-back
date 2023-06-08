package com.charactergeneratorgroup.charactergenerator.controller;

import com.charactergeneratorgroup.charactergenerator.model.Hero;
import com.charactergeneratorgroup.charactergenerator.model.User;
import com.charactergeneratorgroup.charactergenerator.repository.HeroRepository;
import com.charactergeneratorgroup.charactergenerator.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


// !IMPORTANT: CREATE THE DDBB BEFORE RUNNING ANY TEST
@SpringBootTest
@AutoConfigureMockMvc
public class tests {

    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    UserRepository userRepository;

    @Autowired
    HeroRepository heroRepository;

    @BeforeAll
    static void userCreation(@Autowired UserRepository userRepository, @Autowired HeroRepository heroRepository) {
        User user = new User();
        user.setUserName("leypopuli3");
        user.setPassword("leypopuli3");
        userRepository.save(user);
        Hero hero = new Hero();
        hero.setUser(user);
        heroRepository.save(hero);

    }

    @Test
    void getAllHeroes_WithoutError() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/api/v1/hero/leypopuli3"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        System.out.println(mvcResult.getResponse().getContentAsString());
    }

    @Test
    void createRandomHero_WithoutError() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/api/v1/hero/leypopuli3/random")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andReturn();
    }

    @Test
    void saveHero() throws Exception {
        Hero hero = new Hero();
        String requestBody = objectMapper.writeValueAsString(hero);

        MvcResult mvcResult = mockMvc.perform(post("/api/v1/hero/leypopuli3")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isCreated())
                .andReturn();

        heroRepository.delete(hero);
    }

//    !! CHANGE THE ID AND THE USER IN THE URL
    @Test
    void deleteHero() throws Exception {

        MvcResult mvcResult = mockMvc.perform(delete("/api/v1/hero/leypopuli3/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent())
                .andReturn();
    }
}
