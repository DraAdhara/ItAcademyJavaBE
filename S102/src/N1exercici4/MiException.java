package N1exercici4;

    public class MiException extends Exception {

        String mensaje;

        public MiException(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getMessage() {
            return mensaje;
        }

    }

