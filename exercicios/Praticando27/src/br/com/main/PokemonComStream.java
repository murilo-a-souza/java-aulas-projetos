package br.com.main;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class PokemonComStream {
    static void main() {
        HashMap<String, String> pokedex = new HashMap<>();
        do {
            try {
                String pokemon, tipo;
                do {
                    pokemon = JOptionPane.showInputDialog(null, "Digite o nome de um POKEMON ou \"fim\" para encerrar: ").strip();
                    if (!pokemon.equals("fim")) {
                        if (!pokedex.containsKey(pokemon)) {
                            tipo = JOptionPane.showInputDialog(null, "Digite o tipo desse pokemon: ");
                            pokedex.put(pokemon, tipo);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esse pokemon já está na Pokedex", "Não registrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } while (!pokemon.equals("fim"));
                do {
                    tipo = JOptionPane.showInputDialog(null, "Digite o TIPO para pesquisar Pokemons ou \"fim\" para encerrar: ").strip();
                    if (!tipo.equals("fim")) {
                        if (pokedex.containsValue(tipo)) {
                            String mensagem = String.format("TIPO buscado: %s\n", tipo);
                            String finalTipo = tipo;
                            List<String> pokedexBusca = pokedex.entrySet()
                                    .stream()
                                    .filter(pkm -> pkm.getValue().equalsIgnoreCase(finalTipo))
                                    .map(Map.Entry::getKey)
                                    .collect(Collectors.toList());
                            mensagem += String.format("%s", pokedexBusca);
                            JOptionPane.showMessageDialog(null, mensagem, "Busca Pokedex", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Não há nenhum Pokemon deste tipo", "Não encontrado", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } while (!tipo.equals("fim"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa", "Fechando Pokedex", JOptionPane.WARNING_MESSAGE);
    }
}
