package com.mygdx.game.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

import java.awt.Rectangle;

import javax.swing.Renderer;

public class Player {
    Texture playerImg;
    Rectangle playerBound;
    Vector3 playerPos;

    public Player(){
        playerImg = new Texture("badlogic.jpg");
        playerBound = new Rectangle();
    }

    private void Renderer(){

    }
    private void update(){

    }
    private void dispose(){
        playerImg.dispose();
    }



}
