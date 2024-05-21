package util;

public abstract class Util {

    public static String contagemRegressiva(int cont){
        String texto = new String();
        for (int i = cont; i >= 0; i--) {
            texto += i + "\n"; 
        }
        return texto;
    }
    public static String contagemRegressiva(int cont, int ate){
        String texto = "";
        for (int i = cont; i >= 0; i--) {
            texto += i + "\n"; 
        }
        return texto;
    }
    
}
