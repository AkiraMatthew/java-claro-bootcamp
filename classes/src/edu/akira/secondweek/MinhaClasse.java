package edu.akira.secondweek;
public class MinhaClasse {
    public static void main (String[] args){
       String pN = "Akira";
       String sN = "Mateus";

       String nC = nC(pN, sN);

       System.out.println(nC);
    }

    public static String nC(String pN, String sN){
        // return pN.concat(" ").concat(sN);
        //or
        return pN + " " + sN;
    }
}
