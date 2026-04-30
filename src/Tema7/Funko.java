package Tema7;

import java.io.Serializable;
import java.time.LocalDate;

public class Funko implements Serializable {
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private LocalDate fechaLanzamiento;
    private String BASE_COD = "primero1";
    private String BASE_NOMBRE = "funko_base";
    private String BASE_MODELO = "modelo1";
    private double BASE_PRECIO = 10.0;
    private LocalDate BASE_FECHA = LocalDate.of(2023, 1, 1);

    public Funko(String cod, String nombre, String modelo, double precio, LocalDate fechaLanzamiento) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Funko() {
        this.cod = this.BASE_COD;
        this.nombre = this.BASE_NOMBRE;
        this.modelo = this.BASE_MODELO;
        this.precio = this.BASE_PRECIO;
        this.fechaLanzamiento = this.BASE_FECHA;
    }

    public String getCod() {
        return this.cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaLanzamiento() {
        return this.fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Funko{" +
                "cod='" + cod + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}';
    }
}