package N1exercici1;


import java.util.ArrayList;

public class Undo {

        //declaracion
        private static Undo instancia;
        //Declaramos Array para que se almacenen los comandos
        private static ArrayList<String> comandos = new ArrayList<String>();

        //Metodo constructor "private" para que no se pueda instanciar usando "new"
        private Undo (){

        }

        //Si el objeto instancia no existe, crea y devuelve instancia, si no, devuelve instancia
        public static Undo getInstancia() {
            if(instancia == null) {
                instancia = new Undo();
            }
            return instancia;
        }

        //Metodo para guardar el comando introducido por parametro en el arrayList
        public void guardarComando(String comando) {

            comandos.add(comando);
        }

        //metodo para mostrar los comandos guardados
        public void listadoComandos() {

            System.out.println(comandos);
        }

        //metodo para borrar el último comando a modo de funcion undo (ctrl z)
        public void eliminarComando() {
            if (comandos.isEmpty()==false) {
                comandos.remove(comandos.size()-1);
            }
        }

    }

