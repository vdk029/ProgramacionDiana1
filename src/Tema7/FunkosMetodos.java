package Tema7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class FunkosMetodos {
    public void crearFunkos(String lineaCrear, List<Funko> listaFunkos) {
        String[] infoFiguras = lineaCrear.split(",");
        String cod = infoFiguras[0];
        String nombre = infoFiguras[1];
        String modelo = infoFiguras[2];
        double precio = Double.parseDouble(infoFiguras[3]);
        LocalDate fecha = LocalDate.parse(infoFiguras[4]);
        Funko nuevoFunko = new Funko(cod, nombre, modelo, precio, fecha);
        listaFunkos.add(nuevoFunko);
    }

    public void eliminarFunkos(String lineaBorrar, List<Funko> listaFunkos) {
        boolean encontrarFunko = false;

        for (int i = 0; i < listaFunkos.size(); ++i) {

            if ((listaFunkos.get(i)).getCod().equals(lineaBorrar)) {
                listaFunkos.remove(i);
                encontrarFunko = true;
                System.out.println("Funko se ha eliminado ");
               // this.saveFunkos(listaFunkos);
            }

            System.out.println("");
        }

        if (encontrarFunko) {
            this.saveFunkos(listaFunkos);
            System.out.println("se ha actualizado la lista");
        } else {
            System.out.println("no se ha elimiado porque no se ha encontrado el getCod");
        }

    }
    public void saveFunkos(List<Funko> listaFunkos) {

        File fichero = new File("funkos.csv");



        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {

            bw.write("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");

            bw.newLine();

            for (Funko f : listaFunkos) {

                String linea = f.getCod() + "," + f.getNombre() + "," + f.getModelo() + "," + f.getPrecio() + "," + f.getFechaLanzamiento();
                bw.write(linea);
                bw.newLine();
            }

        }
        catch (IOException e) {

            System.out.println("Error al guardar en el archivo: " + e.getMessage());

        }

    }
    public void mediaFunkos(List<Funko> listaFunkos) {
        double preciosFunko = 0.0;

        for (int i = 0; i < listaFunkos.size(); ++i) {
            double precios = listaFunkos.get(i).getPrecio();
            preciosFunko += precios;
        }

        double mediaFunko = preciosFunko / (double) listaFunkos.size();
        System.out.println("Precio total funkos" + preciosFunko);
        System.out.println("La media de los funkos " + mediaFunko);
    }

    public void masCaro(List<Funko> listaFunkos) {
        Funko funkoMasCaro = listaFunkos.get(0);

        for (int i = 1; i < listaFunkos.size(); ++i) {

            if (listaFunkos.get(i).getPrecio() > funkoMasCaro.getPrecio()) {
                funkoMasCaro = listaFunkos.get(i);
            }
        }

        System.out.println("el funko mas caro es " + funkoMasCaro.getNombre());
    }

    public void filtroYear(List<Funko> listaFunkos) {
        boolean encontrado = false;

        for (int i = 0; i < listaFunkos.size(); i++) {
            int anio = listaFunkos.get(i).getFechaLanzamiento().getYear();

            if (anio == 2023) {
                System.out.println(listaFunkos.get(i).toString());
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("No se han encontrado Funkos del año 2023.");
        }else{
            System.out.println("Se ha encontrado");
        }
    }

    public void loadFunkos(List<Funko> listaFunkos) throws IOException {
        File archivo = new File("C:\\Users\\Voski\\Downloads\\funkos.csv");

        if (!archivo.exists()) {
            System.out.println("No existe");
        } else {
            System.out.println("Si existe");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null) {
                crearFunkos(linea, listaFunkos);

                for(int i=0;i< listaFunkos.size();i++) {
                    listaFunkos.get(i);
                    System.out.println("imprimir" + listaFunkos.get(i));
                    }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    }

