/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foot;

/**
 *
 * @author tomaeyo
 */
public class FootShape {
    public String shape;
    
    public void drawAsElipse() {
        Elipse elipse = new Elipse();
        shape = elipse.draw();
    }
    
    public void drawAsRectangle() {
        Rectangle rectangle = new Rectangle();
        shape = rectangle.draw();
    }
    
}
