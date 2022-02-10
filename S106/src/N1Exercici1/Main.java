package N1exercici1;

public class Main {
    public static void main(String[]args){
/*Exercici 1. Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, juntament amb
els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres. Comprova que
els arguments es poden posar en qualsevol posició en la crida al constructor..
 */

        NoGenericMethods noGenericMethods1 = new NoGenericMethods("arg1","arg2","arg3");
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("arg2","arg1","arg3");
        NoGenericMethods noGenericMethods3 = new NoGenericMethods("arg3","arg2","arg1");


    }

}
