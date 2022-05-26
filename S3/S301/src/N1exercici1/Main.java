package N1exercici1;

public class Main {

    public static void main(String[] args) {
/*Crea una classe que repliqui el funcionament del comando 'Undo'. Aquesta classe serà utilitzada per la classe Main,
 que permetrà introduir opcions per consola.

La classe 'Undo' ha de guardar memòria dels últims comandos introduïts, permetent afegir o eliminar comandos,
així com llistar els ultimos comandos introduïts (similar al comando 'history' en Linux).
La classe 'Undo' ha d'implementar imprescindiblement un patró Singleton.

 */

    //Instanciamos usando el metodo getInstancia
        Undo c = Undo.getInstancia();
    //Guardamos varios comandos en el array del objeto C de clase Undo usando el metodo guardarCommando
        c.guardarComando("ctrl + s");
        c.guardarComando("ctrl + c");
        c.guardarComando("ctrl + v");

    //Imprimimos listado de comandos guardados
        c.listadoComandos();

    //Intentamos instanciar un objeto de clase Undo diferente al anterior
        Undo s = Undo.getInstancia();

    //Imprimiomos el listado usando el nuevo objeto "s"
        s.listadoComandos();

    //Eliminamos el último comando introducido usando "s"
        c.eliminarComando();

    //Imprimimos el listado usando el objeto c
        c.listadoComandos();
    }

    }

