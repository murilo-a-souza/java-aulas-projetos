package br.com.fiap.bo;

import br.com.fiap.dao.PokemonDAO;
import br.com.fiap.to.PokemonTO;

import java.util.ArrayList;

public class PokemonBO {

    private PokemonDAO pokemonDAO;


    public ArrayList<PokemonTO> findAll(){
        pokemonDAO = new PokemonDAO();
        return pokemonDAO.findAll();
    }

    public PokemonTO findByCodigo(Long codigo){
        pokemonDAO = new PokemonDAO();
        return pokemonDAO.findByCodigo(codigo);
    }

    public PokemonTO save(PokemonTO remedio){
        pokemonDAO = new PokemonDAO();
        return pokemonDAO.save(remedio);
    }

    public PokemonTO delete(PokemonTO remedio) {
        pokemonDAO = new PokemonDAO();
        return pokemonDAO.delete(remedio);
    }

}
