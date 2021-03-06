package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {
    public Rectangle(float a, float b){
        this.a = a;
        this.b = b;
    }
     String name = "Rectangle";
    public String getName(String name){
        this.name = name;
        return name;
    }
    float a; //длина прямоугольника
    float b; //ширина прямоугольника
   // float s = a*b; //площадь 
    
    @Override
    public float getArea(){
        return a*b;
    }
   @Override
   public float getPerimeter(){
   return 2*(a + b);
   }                                         

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
