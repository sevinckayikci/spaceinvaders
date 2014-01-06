package org.newdawn.spaceinvaders;

/**
 * The entity that represents the players ship
 *
 * @author Kevin Glass
 */
public class ShipEntity extends Entity {
    /**
     * The game in which the ship exists
     */
    private Game game;

    /**
     * Create a new entity to represent the players ship
     *
     * @param game The game in which the ship is being created
     * @param ref  The reference to the sprite to show for the ship
     * @param x    The initial x location of the player's ship
     * @param y    The initial y location of the player's ship
     */
    public ShipEntity(Game game, String ref, int x, int y) {
        super(ref, x, y);

        this.game = game;
    }

    /**
     * Request that the ship move itself based on an elapsed ammount of
     * time
     *
     * @param delta The time that has elapsed since last move (ms)
     */
    public void move(long delta) {
        // if we're moving left and have reached the left hand side
        // of the screen, don't move
        if ((dx < 0) && (x < 10)) {
            return;
        }
        // if we're moving right and have reached the right hand side
        // of the screen, don't move
        if ((dx > 0) && (x > 750)) {
            return;
        }

        super.move(delta);
    }

    public void rotate(int angle) {
        String spriteRef;
        switch (angle) {
            case 0:
                spriteRef = "sprites/ships/ship.gif";
                break;
            case 10:
                spriteRef = "sprites/ships/ship10.gif";
                break;
            case 20:
                spriteRef = "sprites/ships/ship20.gif";
                break;
            case 30:
                spriteRef = "sprites/ships/ship30.gif";
                break;
            case 40:
                spriteRef = "sprites/ships/ship40.gif";
                break;
            case 50:
                spriteRef = "sprites/ships/ship50.gif";
                break;
            case 60:
                spriteRef = "sprites/ships/ship60.gif";
                break;
            case 70:
                spriteRef = "sprites/ships/ship70.gif";
                break;
            case 80:
                spriteRef = "sprites/ships/ship80.gif";
                break;
            case -10:
                spriteRef = "sprites/ships/ship-10.gif";
                break;
            case -20:
                spriteRef = "sprites/ships/ship-20.gif";
                break;
            case -30:
                spriteRef = "sprites/ships/ship-30.gif";
                break;
            case -40:
                spriteRef = "sprites/ships/ship-40.gif";
                break;
            case -50:
                spriteRef = "sprites/ships/ship-50.gif";
                break;
            case -60:
                spriteRef = "sprites/ships/ship-60.gif";
                break;
            case -70:
                spriteRef = "sprites/ships/ship-70.gif";
                break;
            case -80:
                spriteRef = "sprites/ships/ship-80.gif";
                break;
            default:
                spriteRef = "sprites/ships/ship.gif";
                break;
        }
        this.sprite = SpriteStore.get().getSprite(spriteRef);
    }

    /**
     * Notification that the player's ship has collided with something
     *
     * @param other The entity with which the ship has collided
     */
    public void collidedWith(Entity other) {
        // if its an alien, notify the game that the player
        // is dead
        if (other instanceof AlienEntity) {
            game.notifyDeath();
        }
    }
}