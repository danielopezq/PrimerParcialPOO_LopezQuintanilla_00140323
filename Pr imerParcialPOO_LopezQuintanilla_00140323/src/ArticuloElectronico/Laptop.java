package ArticuloElectronico;

import java.util.Scanner;

public class Laptop extends ArticuloElectronico {
    private String dimensiones;
    private String sistemaOperativo;
    private boolean RGB;
    public Laptop(String nombre, String modelo, String descripcion, double precio, String dimensiones, String sistemaOperativo, boolean RGB) {
        super(nombre, modelo, descripcion, precio);
        this.dimensiones = dimensiones;
        this.sistemaOperativo = sistemaOperativo;
        this.RGB = RGB;
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

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }


    @Override
    public void obtenerInfo() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Imprimiendo informacion:");
        System.out.println("Precio: $"+ getPrecio());
        System.out.println("Descripcion: "+ getDescripcion());
        System.out.println("Dimensiones: "+ getDimensiones());
        System.out.println("Sistema Operativo: "+ getSistemaOperativo());
        if(isRGB()){
            System.out.println("RGB: si");
        } else {
            System.out.println("RGB: no");
        }
    }
}
