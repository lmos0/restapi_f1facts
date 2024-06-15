package com.f1factsapi.apifacts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/equipes")
public class TeamsFacts {
    private static final List<String> Facts = Arrays.asList(

            "A Ferrari é a equipe mais antiga e bem-sucedida da Fórmula 1, tendo participado de todas as temporadas desde o início do campeonato em 1950.",
            "A Haas F1 Team é a equipe mais recente a entrar na Fórmula 1, fazendo sua estreia em 2016 como a primeira equipe americana em várias décadas.",
            "A McLaren é a segunda equipe mais antiga da Fórmula 1, fundada em 1963 por Bruce McLaren. Eles têm 8 títulos de construtores e 12 títulos de pilotos.",
            "A equipe Williams, fundada em 1977 por Frank Williams e Patrick Head, é uma das mais bem-sucedidas da história, com 9 títulos de construtores."


    );

@GetMapping("")
    public String getTeamsFacts() {
        Random random = new Random();
        int randomIndex = random.nextInt(Facts.size());
        return Facts.get(randomIndex);

    };

}
