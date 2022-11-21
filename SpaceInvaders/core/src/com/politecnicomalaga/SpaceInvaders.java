package com.politecnicomalaga;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class SpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	Texture nave, enemigo;
	int xN, yN, xE, yE;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Texture nave = new Texture("nave.png");
		Texture enemigo = new Texture("enemigo.png");

		xN = 100;
		yN = 100;
		xE = 100;
		yE = 100;
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();


		batch.draw(nave, xN, yN);
		batch.draw(enemigo, xE, yE);


		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		nave.dispose();
		enemigo.dispose();
	}
}
