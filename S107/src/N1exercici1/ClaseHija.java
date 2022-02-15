package N1exercici1;


    public class ClaseHija extends ClasePadre {

        private int peso;

        public ClaseHija(int edad, String nombre, String apellido, int peso) {
            super(edad, nombre, apellido);
            this.peso = peso;

        }

        @Override
        public String programar() {
            return "La ClaseHija está programando";
        }

    }

