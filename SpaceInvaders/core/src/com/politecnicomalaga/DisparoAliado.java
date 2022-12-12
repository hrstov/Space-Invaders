package com.politecnicomalaga;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class DisparoAliado {

    private final Sprite spriteDA;
    private final Vector2 positionDA;

    public DisparoAliado(Texture imgDA){
        spriteDA = new Sprite(imgDA);
        spriteDA.setScale(2);
        positionDA = new Vector2(Gdx.graphics.getWidth()/ 2+5, spriteDA.getScaleY()*spriteDA.getHeight());
    }
    public void MovimientoDA(float deltatime){
        float velocidadDA = 300;
        positionDA.y+=deltatime* velocidadDA;

    }
    public void ActualizarseDA(SpriteBatch batch){
        spriteDA.setPosition(positionDA.x, positionDA.y*2);
        spriteDA.draw(batch);

    }
    public void PintarseDA(SpriteBatch batch,Vector2 position){
        MovimientoDA(Gdx.graphics.getDeltaTime());
        ActualizarseDA(batch);
        if(positionDA.y >=500){
            ActualizarseDA(batch);
            positionDA.y = position.y;
            positionDA.x = position.x+5;
        }




    }

    }


