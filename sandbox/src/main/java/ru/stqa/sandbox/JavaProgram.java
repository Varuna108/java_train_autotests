package ru.stqa.sandbox;



public class JavaProgram {

    public static void main(String[] args) {

        Square s = new Square(10);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(2, 10);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " and " + r.b + " = " + area(r));

        Point p1 = new Point (2, 10);
        Point p2 = new Point (2, 32);
        System.out.println("Расстояние между двумя точками" + " = " + p1.distance(p2));

    }
//        public static double distance(Point p1, Point p2) {
//            return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
//
//
//        }

        public static double area (Square s){
            return s.l * s.l;
        }

        public static double area (Rectangle r){
            return r.a * r.b;
        }


    }

