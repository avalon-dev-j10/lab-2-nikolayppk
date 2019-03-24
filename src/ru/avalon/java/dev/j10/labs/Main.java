package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape [10];
        
        Random rand = new Random();
        Random rand1 = new Random(); // Рандомное значение 1
        Random rand2 = new Random(); // Рандомное значение 2
             
        
        for (int i = 0; i < 10; i++){
        int prob = (int) (rand.nextDouble()*90);
        int a = (int) (1 + rand1.nextDouble()*30);
        int b = (int) (1 + rand2.nextDouble()*30);
               
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
            shapes[i] = new Triangle(a, b);
            System.out.println("Triangle "  + shapes[i].getArea());}
        }  
        
            /*static  maxS(){
            for (int j = 0; j < 10; j++ ){
            if (this.shapes[j].getArea() > this.shapes[j + 1].getArea()){
            float max = shapes[j].getArea();
                return max;
                        }
            }
    }*/
    
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, ReRectanglectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }
}
