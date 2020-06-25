package com.marcusscalet.pokedex.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.marcusscalet.pokedex.model.Pokemon;

public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String> {

	
}
