package POO3;


import java.util.ArrayList;

public class MainFiguras2D {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 4.00);
        Triangulo triangulo = new Triangulo("Triangulo", 4.00, 4.00);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 4.00, 4.00);
        Circulo circulo = new Circulo("Cirulo", 3.14, 4.00);
        ArrayList<Figura2D> figuritas = new ArrayList<>();
        figuritas.add(cuadrado);
        figuritas.add(triangulo);
        figuritas.add(rectangulo);
        figuritas.add(circulo);


        for (int i = 0; i < figuritas.size(); i++) {
            Figura2D figura2D = figuritas.get(i);
            System.out.println("Tipo" + figura2D.getTipo());
            System.out.println("AREA" + figura2D.area());
            System.out.println("PERIMETRO" + figura2D.perimetro());


        }

    }
}

