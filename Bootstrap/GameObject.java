import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Extension of Actor with helper methods
 * 
 * @author Christian Wang
 * @version 1.0
 */
public abstract class GameObject extends Actor
{   
    private int initCount = 0;
    
    //60 ticks per second
    final long RENDER_TICK = 1000/60;
    private Timer renderTime;
    
    //1000 ticks per second
    final long UPDATE_TICK = 1000/1000;
    private Timer updateTime;

    /**
     * Constructor of gameobject that calls create method at instantiation
     */
    public GameObject() {
        create();
    }

    /**
     * Called ONCE at object instantiation before init()
     */
    public Message create() {
        return new Message("Success");
    }

    /**
     * Called ONCE when object is added to the stage
     */
    public Message init() {
        renderTime = new Timer();
        updateTime = new Timer();
        return new Message("Success");
    }

    /**
     * Called EVERY update tick after init()
     */
    public Message update() {
        return new Message("Success");
    }

    /**
     * Called EVERY render tick after init()
     */
    public Message render() {
        return new Message("Success");
    }

    /**
     * Act - do whatever the GameObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        //Calls init() once when added to the world
        if(initCount == 0) {
            init();
            initCount++;
        }
        
        //Calls render() and update() accordingly and resets timers
        if(updateTime.millisElapsed() >= UPDATE_TICK) {update(); updateTime.mark(); }
        if(renderTime.millisElapsed() >= RENDER_TICK) {render(); renderTime.mark(); }
    }    
}
