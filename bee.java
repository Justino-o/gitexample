import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int sugma = 0;
        move(5+sugma);
        if(isAtEdge()){
            turn(45);
            sugma+=100;
        }
    }
}
