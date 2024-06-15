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
            "Lewis Hamilton detém o recorde de mais pole positions na história da Fórmula 1, com mais de 100 poles.",
            "O piloto com mais voltas mais rápidas em corridas de Fórmula 1 é Michael Schumacher, com 77 voltas mais rápidas.",
            "O brasileiro Ayrton Senna é amplamente considerado um dos maiores pilotos de Fórmula 1 de todos os tempos, conhecido por suas incríveis habilidades em corridas com pista molhada.",
            "Lewis Hamilton detém o recorde de maior número de pole positions na história da Fórmula 1, com mais de 100 poles.",
            "Sebastian Vettel é o piloto mais jovem a conquistar um campeonato mundial de Fórmula 1, vencendo o título em 2010 aos 23 anos e 134 dias.",
            "Juan Manuel Fangio venceu cinco campeonatos mundiais de Fórmula 1 na década de 1950, um recorde que durou quase 50 anos até ser superado por Michael Schumacher",
            "Niki Lauda, tricampeão mundial, sobreviveu a um grave acidente no Grande Prêmio da Alemanha de 1976 e voltou a competir apenas seis semanas depois."


    );


    @GetMapping("")
    public String getFacts(){
        Random random = new Random();
        int randomIndex = random.nextInt(FACTS.size());
        return FACTS.get(randomIndex);
    }
}
