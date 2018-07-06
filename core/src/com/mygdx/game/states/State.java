package com.mygdx.game.states;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.MyGdxGame;

import javax.xml.ws.ServiceMode;

public abstract class State implements Screen{

    protected OrthographicCamera cam;
    protected Vector3 mouse;
    SpriteBatch batch;
    MyGdxGame game;


    protected State(MyGdxGame myGdxGame){
        cam = new OrthographicCamera();
        mouse = new Vector3();
        batch = new SpriteBatch();
        game = myGdxGame;

    }

    protected abstract void handleInput();
    public abstract void update(float dt);

    abstract void drawGame();

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        cam.update();
        batch.setProjectionMatrix(cam.combined);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    public abstract void dispose();

}
