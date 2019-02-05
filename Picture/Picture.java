
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square trunk;
    private Triangle treetop;
   

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(250);
        wall.moveHorizontal(250);
        wall.changeSize(150,250);
        wall.makeVisible();

        window = new Square();
        window.changeSize(80,40);
        window.changeColor("magenta");
        window.moveHorizontal(355);
        window.moveVertical(320);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(75,310);
        roof.changeColor("red");
        roof.moveHorizontal(385);
        roof.moveVertical(210);
        roof.makeVisible();
        
        trunk = new Square();
        trunk.changeSize(140,20);
        trunk.changeColor("black");
        trunk.setLocation(150,310);
        trunk.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        treetop = new Triangle();
        treetop.changeColor("green");
        treetop.changeSize(110,50);
        treetop.moveHorizontal(110);
        treetop.moveVertical(190);
        treetop.makeVisible();
        
       
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
