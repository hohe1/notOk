package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.MyGdxGame;

public class MenuState extends State{

    public MenuState(final MyGdxGame game) {
        super(game);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        if(Gdx.input.justTouched()) {
            game.setScreen(new PlayState(game));

        }
    }

    @Override
    void drawGame() {

    }

    @Override
    public void dispose() {

    }
}
