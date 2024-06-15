package com.f1factsapi.apifacts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/circuitos")
public class CircuitsFacts {
    private static List<String> Facts = Arrays.asList(
            "O circuito de Mônaco é o mais curto do calendário da Fórmula 1, com apenas 3,337 km de extensão.",
            "A corrida de Fórmula 1 mais longa de todos os tempos foi o Grande Prêmio do Canadá de 2011, que durou 4 horas, 4 minutos e 39 segundos devido a várias interrupções e uma longa pausa causada pela chuva.",
            "A primeira corrida oficial de Fórmula 1 foi realizada no Circuito de Silverstone, no Reino Unido, em 13 de maio de 1950.",
            "O Circuito de Interlagos, no Brasil, está situado a uma altitude de cerca de 800 metros acima do nível do mar, o que afeta a performance dos motores.",
            "O Circuito de Suzuka, no Japão, é um dos poucos circuitos de Fórmula 1 em formato de '8', cruzando-se sobre ele mesmo."
    );

    @GetMapping("")
    public String getFact(){
        Random random = new Random();
        int randomIndex = random.nextInt(Facts.size());
        return Facts.get(randomIndex);
    }
}
