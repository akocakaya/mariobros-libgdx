package com.akocakaya.supermario.gameObject;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;

public class Mario extends Sprite {

    private World world;
    private Body body;

    public Mario(GameWorld gameWorld) {
        this.world = gameWorld.getWorld();
    }
}