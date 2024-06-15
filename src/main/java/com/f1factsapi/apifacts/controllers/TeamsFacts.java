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
            "A equipe Williams, fundada em 1977 por Frank Williams e Patrick Head, é uma das mais bem-sucedidas da história, com 9 títulos de construtores.",
            "A Brabham Racing Team, fundada por Jack Brabham, é a única equipe a ter vencido um campeonato com seu fundador como piloto em 1966.",
            "A Mercedes-AMG Petronas Formula One Team é conhecida por sua era de domínio na era híbrida da Fórmula 1, vencendo 8 títulos consecutivos de construtores de 2014 a 2021",
            "A Brawn GP foi uma equipe de Fórmula 1 que competiu apenas na temporada de 2009 e venceu ambos os campeonatos de pilotos e construtores em sua única temporada.",
            "A Benetton Formula, ativa de 1986 a 2001, ganhou dois campeonatos mundiais de pilotos com Michael Schumacher em 1994 e 1995."
            );

@GetMapping("")
    public String getTeamsFacts() {
        Random random = new Random();
        int randomIndex = random.nextInt(Facts.size());
        return Facts.get(randomIndex);

    };

}
