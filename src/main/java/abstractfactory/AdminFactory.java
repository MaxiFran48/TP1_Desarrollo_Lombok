package main.java.abstractfactory;

public class AdminFactory implements AbstractFactory{

    /**Metodo que crea la interfaz de admin**/
    public InterfazUI crearUI(){
        return new AdminUI();
    }

    /**Metodo que crea el envio express**/
    public MetodoEnvio crearEnvio(){
        return new EnvioExpress();
    }

}
