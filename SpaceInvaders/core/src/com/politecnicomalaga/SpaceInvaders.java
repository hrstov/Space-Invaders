package com.politecnicomalaga;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class SpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	NaveAliada jugador;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("navejugador.png");
		jugador = new NaveAliada(img);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		jugador.Pintarse(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
