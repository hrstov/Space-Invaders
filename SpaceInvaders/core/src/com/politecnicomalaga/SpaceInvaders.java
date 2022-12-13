package com.politecnicomalaga;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;


public class SpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, imgDA;
	NaveAliada jugador;
	DisparoAliado disparoDA;

	NaveEnemiga[] malos;
	Texture img_fondo;
	Texture img_NaveEnemiga;

	int ancho_enemigos = 11;
	int alto_enemigos = 5;
	int enemigos = 10;
	int i;




	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("navejugador.png");
		imgDA = new Texture("disparo.png");
		jugador = new NaveAliada(img);
		disparoDA = new DisparoAliado(imgDA);
		img_fondo = new Texture("background.jpg");
		

		img_NaveEnemiga = new Texture("navealien.png");
		malos = new NaveEnemiga[ancho_enemigos * alto_enemigos];
		img_fondo = (new Texture("istockphoto-910093098-612x612.jpg"));


		for (int y = 0; y < alto_enemigos; y++) {
			for (int x = 0; x < alto_enemigos; x++) {
				Vector2 position = new Vector2(x* enemigos,y* enemigos);
				position.x += Gdx.graphics.getWidth()/2;
				position.y +=Gdx.graphics.getHeight();
				position.x -= (ancho_enemigos / 2) * enemigos;
				position.y -= (alto_enemigos)* enemigos;
				malos[i] = new NaveEnemiga(position,img_NaveEnemiga, Color.ORANGE);
				i++;
			}
		}

	}



	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img_fondo,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		jugador.Pintarse(batch);
		disparoDA.PintarseDA(batch, jugador.position);


		for(i = 0; i < malos.length; i++) {
			malos[0].Pintarse(batch);
		}


		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();

	}
}
