package ArticuloElectronico;

import java.util.Scanner;

public class Celular extends ArticuloElectronico{
    private String dimensiones;
    private String sistemaOperativo;

    public Celular(String nombre, String modelo, String descripcion, double precio, String dimensiones, String sistemaOperativo) {
        super(nombre, modelo, descripcion, precio);
        this.dimensiones = dimensiones;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void obtenerInfo() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Imprimiendo informacion:");
        System.out.println("Precio: $"+ getPrecio());
        System.out.println("Descripcion: "+ getDescripcion());
        System.out.println("Dimensiones: "+ getDimensiones());
        System.out.println("Sistema Operativo: "+ getSistemaOperativo());
    }
}
