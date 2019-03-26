package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {
   public Triangle(float a, float b, float c){
        this.a = a; //сторона треугольника 1
        this.b = b; //сторона треугольника 2
        this.c = c; //сторона треугольника 3
    }
    String name = "Triangle";
    public String getName(String name){
        this.name = name;
        return name;
    }
    float a; //сторона 1 треугольника
    float b; //сторона 2 треугольника
    float c; //сторона 3 треугольника 
    
    @Override
    public float getArea(){
       float p =  getPerimeter() / 2; 
       return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c) );
    }
   
   
    @Override
   public float getPerimeter(){
   return a + b + c;
   }
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
