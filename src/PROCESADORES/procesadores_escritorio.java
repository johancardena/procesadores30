package PROCESADORES;

public class procesadores_escritorio {
    String socket;


    public procesadores_escritorio(String nombre) {
    }

    public procesadores_escritorio(int nucleos, double consumo, double velocidad, String nombre, String socket) {
        super(nucleos,consumo,velocidad,nombre);
        this.socket = socket;
    }

    public String getsocket() {
        return socket;
    }

    public void setsocket(String socket) {
        this.socket = socket;
    }

    public void imprimir_




}
