package com.marcusscalet.pokedex.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

public class PokemonEvent {

	@Id
	private Long eventId;
	private String eventType;

	public PokemonEvent() {
		super();
	}

	public PokemonEvent(Long eventId, String eventType) {
		super();
		this.eventId = eventId;
		this.eventType = eventType;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventId, eventType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PokemonEvent))
			return false;
		PokemonEvent other = (PokemonEvent) obj;
		return Objects.equals(eventId, other.eventId) && Objects.equals(eventType, other.eventType);
	}

	@Override
	public String toString() {
		return "PokemonEvent [eventId=" + eventId + ", eventType=" + eventType + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}
