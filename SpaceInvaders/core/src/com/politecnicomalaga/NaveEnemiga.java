package com.politecnicomalaga;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class NaveEnemiga {

    public Vector2 position;
    public Sprite sprite;
    public NaveEnemiga(Vector2 _position, Texture img, Color color){
        position = _position;
        sprite = new Sprite(img);
        sprite.setColor(color);
        sprite.setScale(4);
    }
    public void Pintarse(SpriteBatch batch) {
        sprite.setPosition(position.x, position.y);
        sprite.draw(batch);

    }


}
