package com.mygdx.game.stateControllers;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.GameManager;
import com.mygdx.game.states.State;

public class OptionsStateController extends AbstractStateController {
    private GameManager gameManager;

    public OptionsStateController(State state) {
        super(state);
        gameManager = GameManager.getInstance();
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
        if (gameManager.getCount() % 2 == 1) {
            gameManager.setFirstClicked(true);
            gameManager.getCurrentMusic().pause();
        }
        else {
            gameManager.setSecondClicked(true);
            gameManager.getCurrentMusic().play();
        }
        Gdx.gl.glClearColor(1, 0, 0, 0);
        Gdx.gl.glClearColor(0, 0, 1, 1);
    }
}