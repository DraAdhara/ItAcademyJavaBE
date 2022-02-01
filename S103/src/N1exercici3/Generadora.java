package N1exercici3;

public class Generadora {
    private String personaje[] = new String[10];
    private static int indice = 0;

    public Generadora() {
        personaje[0] = "Vader";
        personaje[1] = "Sidious";
        personaje[2] = "Luke";
        personaje[3] = "Leia";
        personaje[4] = "Han";
        personaje[5] = "Chewbacca";
        personaje[6] = "Tarkin";
        personaje[7] = "Ben Kenobi";
        personaje[8] = "Lando";
        personaje[9] = "Dooku";
    }
    public String seguentPersonatge() {
        int i =indice;
        indice = indice+1;
        //usamos lo siguiente para que al final vuelva a posición 0.
        indice = indice % personaje.length;
        return personaje[i];
    }
}
