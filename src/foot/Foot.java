/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foot;

import java.util.Scanner;

/**
 *
 * @author tomaeyo
 */
public class Foot {
    public void draw() {
        FootShape f = new FootShape();
        Scanner sc = new Scanner(System.in);
        System.out.print("What to draw? 1.Elipse, 2.Rectangle ");
        int draw = sc.nextInt();
        
        switch(draw) {
            case 1 -> f.drawAsElipse();
            case 2 -> f.drawAsRectangle();
        }
        System.out.println(f.shape);
    }
    
    public static void main(String[] args) {
        Foot s = new Foot();
        s.draw();
    }
}
