package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento  + " acontecerá na data: " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 27), "Proximo evento", "Atracao aleatoria");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 9), "Segundo Evento", "Aulas de decolagem");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Terceiro evento", "Aulas de pilotagem");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 11), "Atentado as Torres Gemeas", "Avioes");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 9, 20), "Ultimo evento", "Sem atracoes");

        agendaEventos.exibirAgenda();
        System.out.println();

        agendaEventos.obterProximoEvento();
    }


}
