package com.marcusscalet.pokedex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;

import com.marcusscalet.pokedex.model.Pokemon;
import com.marcusscalet.pokedex.repository.PokemonRepository;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
	}

	@Bean
	CommandLineRunner init (ReactiveMongoOperations operations, PokemonRepository repository) {
		return args -> {
			Flux<Pokemon> pokemonFlux = Flux.just(
					new Pokemon(null, "Primeape", "Lutador", "Chute baixo", "32.0"),
					new Pokemon(null, "Abra", "Psíquico", "Teleporte", "5.0"),
					new Pokemon(null, "Lucario", "Lutador/Metal", "Punho sônico", "25.0"))
					.flatMap(repository::save);
			
			pokemonFlux
			.thenMany(repository.findAll())
			.subscribe(System.out::println);
		};
	}
}
