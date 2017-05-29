import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Extension of World class with helper methods
 * 
 * @author Christian Wang 
 * @version 1.0
 */
public abstract class Stage extends World
{
    //By default width and height are 600
    public int width = 600, height = 600;
    
    /**
     * Constructor for objects of class Stage.
     */
    public Stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, 1); 
    }
}
