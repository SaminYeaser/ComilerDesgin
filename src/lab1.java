/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 17301063
 */
public class lab1 {


//    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner f = new Scanner(new File("file.txt"));
        String s = null;
        // FileReader r = new FileReader(ff);
        //  BufferedReader br = new BufferedReader(r);
//        String s;
//        while((s=br.readLine())!=null){
//            System.out.println(s);
//        }
        ArrayList<String> t = new ArrayList(Arrays.asList("int", "float", "if", "else"));
        ArrayList<String> var = new ArrayList(Arrays.asList("a", "b", "c", "d", "e"));
        ArrayList<String> sign = new ArrayList(Arrays.asList(">", "<", ">=", "<=", "||", "&&", "^", "|", "&", "!"));
        ArrayList<String> coma = new ArrayList(Arrays.asList(",", ";", "(", ")", "{", "}", "[", "]"));
        ArrayList<String> sym = new ArrayList(Arrays.asList("+", "-", "=", "/", "%", "*", "++", "--"));

        ArrayList<String> types = new ArrayList<>();
        ArrayList<String> varibles = new ArrayList<>();
        ArrayList<String> signs = new ArrayList<>();
        ArrayList<String> comas = new ArrayList<>();
        ArrayList<String> symbols = new ArrayList<>();

        // ff = new File("file.txt");
        while (f.hasNext()) {
            s = f.nextLine().trim();

            String[] k = s.split(" ");


            for (String k1 : k) {
                if (t.contains(k1) && !types.contains(k1)) {
                    types.add(k1);
                } else if (var.contains(k1) && !varibles.contains(k1)) {
                    varibles.add(k1);
                } else if (sign.contains(k1) && !signs.contains(k1)) {
                    signs.add(k1);
                } else if (coma.contains(k1) && !comas.contains(k1)) {
                    comas.add(k1);
                } else if (sym.contains(k1) && !symbols.contains(k1)) {
                    symbols.add(k1);
                }
            }
        }

        System.out.print("Keywords: ");
        for (int i = 0; i < types.size(); i++) {
            System.out.print(types.get(i) + ", ");
        }
        System.out.println();
        System.out.print("Identifiers: ");
        for (int i = 0; i < varibles.size(); i++) {
            System.out.print(varibles.get(i) + ", ");
        }
        System.out.println();
        System.out.print("Math Operators: ");
        for (int i = 0; i < signs.size(); i++) {
            System.out.print(signs.get(i) + ", ");
        }
        System.out.println();
        System.out.print("Logical Operators: ");
        for (int i = 0; i < comas.size(); i++) {
            System.out.print(comas.get(i) + ", ");
        }
        System.out.println();
        System.out.print("Numerical Values: ");
        for (int i = 0; i < symbols.size(); i++) {
            System.out.print(symbols.get(i) + ", ");
        }
        System.out.println();

    }
}
