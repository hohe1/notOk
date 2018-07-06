package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.states.MenuState;

public class MyGdxGame extends Game {
	SpriteBatch batch;
	Texture img;

	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;
	public static final String TITLE = "title";


	@Override
	public void create () {
		img = new Texture("badlogic.jpg");
		setScreen(new MenuState(this));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
	
	@Override
	public void dispose () {
	}
}
