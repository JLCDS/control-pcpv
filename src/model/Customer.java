package model;

import java.io.*;

public class Customer extends Person {
    private OutputStream outputStream;
    public Customer(String rut, String name, String direccion, String telefono) {
        super(rut, name, direccion, telefono);
    }
    public void writerBufferesWiter(String texto){
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        try {
            writer.write(texto);
            writer.newLine();
            writer.flush();

        }catch (IOException e){

        }
    }
}
