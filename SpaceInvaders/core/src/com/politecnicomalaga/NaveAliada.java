package com.politecnicomalaga;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class NaveAliada {
    public float velocidad = 500;
    public Vector2 position;
    public Sprite sprite;
    public NaveAliada(Texture img)
    {
        sprite = new Sprite(img);
        sprite.setScale(4);
        position = new Vector2(Gdx.graphics.getWidth()/ 2, sprite.getScaleY()*sprite.getHeight()/2);

    }
    public void Movimiento(float deltatime){
        if(Gdx.input.isKeyPressed(Input.Keys.A)) position.x-=deltatime*velocidad;
        if(Gdx.input.isKeyPressed(Input.Keys.D)) position.x+=deltatime*velocidad;

        if(position.x-(sprite.getWidth()*sprite.getScaleX()/2)<=0) position.x = (sprite.getWidth()*sprite.getScaleX()/2);
        if(position.x+(sprite.getWidth()*sprite.getScaleX()/2)>=Gdx.graphics.getWidth()) position.x = Gdx.graphics.getWidth()-(sprite.getWidth()*sprite.getScaleX()/2);


    }
    public void Pintarse(SpriteBatch batch){
        Movimiento(Gdx.graphics.getDeltaTime());
        sprite.setPosition(position.x, position.y);
        sprite.draw(batch);
    }
}
