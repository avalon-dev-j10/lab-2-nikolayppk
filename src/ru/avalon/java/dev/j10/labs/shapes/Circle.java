package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
     public Circle (float r){
        this.r = r;
           }
    static float PI = 3.14f;
    String name = "Circle";
    float a; //полуось эллипса 1
    float b; //полуось эллипса 2
    public String getName(String name){
        this.name = name;
        return name;
    }
    
    float r; //радиус
    //float s = r;//PI*r*r; //Площадь круга
   
    @Override
    public float getArea(){
        return PI*r*r;
    }
   @Override
    public float getLength(){
        return PI * (a + b);
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
