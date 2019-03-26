package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import java.util.Random;

public class Main {
public static Shape[] shapes = new Shape [10];
    
public static void main(String[] args) {
        
        
        Random rand = new Random();
        
         
        for (int i = 0; i < 10; i++){
        int prob = (int) (1 + rand.nextDouble()*3);
        int a = (int) (1 + rand.nextDouble()*90);
        int b = (int) (1 + rand.nextDouble()*90);
        int c = (int) (1 + rand.nextDouble()*90);
          /*  switch (prob){
            case 1: 
            shapes[i] = new Circle(a);
            System.out.println("Circle "  + shapes[i].getArea());
            break;
            case 2:
            shapes[i] = new Rectangle(a, b);
            System.out.println("Rectangle " + shapes[i].getArea());
            break;
            case 3:
            shapes[i] = new Triangle(a, b, c);
            System.out.println("Triangle "  + shapes[i].getArea());
        }
        }
        */
           if (prob < 30) {
            shapes[i] = new Circle(a);
            //System.out.println("Радиус= " + a);
            System.out.println("Circle "  + shapes[i].getArea());
                }
            else if (prob < 60 & prob > 30){
            shapes[i] = new Rectangle(a, b);
            System.out.println("Rectangle " + shapes[i].getArea());
            }
            else {
            shapes[i] = new Triangle(a, b, c);
            System.out.println("Triangle "  + shapes[i].getArea());}
        }  
        
        System.out.println("Max S = " + getmaxS());
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }
            public static float getmaxS() {
            float max = 0;
            for (int j = 0; j < 10; j++ ){
            if (shapes[j].getArea() > max){
            max = shapes[j].getArea();
            }
            }
            return max;
            }          
    
}
