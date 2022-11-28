package com.politecnicomalaga;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;


public class SpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, imgDA;
	NaveAliada jugador;
	DisparoAliado disparoDA;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("navejugador.png");
		imgDA = new Texture("disparo.png");
		jugador = new NaveAliada(img);
		disparoDA = new DisparoAliado(imgDA);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		jugador.Pintarse(batch);
		disparoDA.PintarseDA(batch, jugador.position);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();

	}
}
