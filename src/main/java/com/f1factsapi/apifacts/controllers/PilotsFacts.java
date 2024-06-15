package com.f1factsapi.apifacts.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/pilotos")


public class PilotsFacts {

    private static final List<String> FACTS = Arrays.asList(
            "O piloto mais jovem a ganhar uma corrida de Fórmula 1 foi Max Verstappen, aos 18 anos e 228 dias, no Grande Prêmio da Espanha de 2016.",
            "O piloto com mais títulos de Campeão Mundial de Fórmula 1 é Michael Schumacher, com 7 títulos (empatado com Lewis Hamilton).",
            "A corrida de Fórmula 1 mais longa de todos os tempos foi o Grande Prêmio do Canadá de 2011, que durou 4 horas, 4 minutos e 39 segundos devido a várias interrupções e uma longa pausa causada pela chuva.",
            "O circuito de Mônaco é o mais curto do calendário da Fórmula 1, com apenas 3,337 km de extensão.",
            "A primeira corrida oficial de Fórmula 1 foi realizada no Circuito de Silverstone, no Reino Unido, em 13 de maio de 1950.",
            "Lewis Hamilton detém o recorde de mais pole positions na história da Fórmula 1, com mais de 100 poles.",
            "O Grande Prêmio de Mônaco é um dos eventos mais prestigiados da Fórmula 1, conhecido por seu circuito estreito e desafiador nas ruas de Monte Carlo.",
            "O piloto com mais voltas mais rápidas em corridas de Fórmula 1 é Michael Schumacher, com 77 voltas mais rápidas.",
            "O brasileiro Ayrton Senna é amplamente considerado um dos maiores pilotos de Fórmula 1 de todos os tempos, conhecido por suas incríveis habilidades em corridas com pista molhada."
    );


    @GetMapping("")
    public String getFacts(){
        Random random = new Random();
        int randomIndex = random.nextInt(FACTS.size());
        return FACTS.get(randomIndex);
    }
}
