import java.lang.StringBuilder;
class Solution{

    /**
     *
     * @param s
     * @return
     */
    static String toCamelCase(String s){
        String letras[] = s.split("");
        String texto = "";

        for (int i = 0; i < letras.length; i++){
            if (letras[i].equals("-") || letras[i].equals("-")) {
                texto = texto + letras[i+1].toUpperCase();
                i++;
            }else{
                texto = texto + letras[i];
            }
        }
        return texto;
    }
}