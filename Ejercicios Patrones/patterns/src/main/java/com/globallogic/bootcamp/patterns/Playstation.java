package com.globallogic.bootcamp.patterns;

public class Playstation {

	private Game videogame=null;

	public Playstation() {
		
	}
	
	public Playstation(Game videogame) {
		this.videogame = videogame;
	}

	public Game getVideogame() {
		return videogame;
	}

	public void setVideogame(Game videogame) {
		this.videogame = videogame;
	}
	public void askMyGame() {
		if (this.videogame!=null)
		    System.out.println("El videojuego que estoy corriendo es: "+this.videogame.getTitle());
		System.out.println("¡Estoy vacío!");
	}
	
}
