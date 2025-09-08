package main.java.abstractfactory;

public class UsuarioFactory implements AbstractFactory{

    /**Metodo que crea la interfaz de ususario**/
    public InterfazUI crearUI(){
        return new UsuarioUI();
    }

    /**Metodo que crea el envio normal**/
    public MetodoEnvio crearEnvio(){
        return new EnvioNormal();
    }

}
