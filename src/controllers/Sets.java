package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Sets {
    public Sets() {
    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        System.out.println(palabras.size());
        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        System.out.println(palabras.size());
        return palabras;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        System.out.println(palabras.size());
        return palabras;
    }

    public Set<String> construirTreeSetConComparador() {
        Comparator<String> comparator=new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                //Por longitud
                int result=Integer.compare(s1.length(),s2.length());
                //si son igual en tamaño,que sea alfabetico
                if(result==0){
                    result=s1.compareTo(s2);
                    return result;
                }
                return result;
            }
        };
        Set<String> palabras = new TreeSet<>(comparator);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        // palabras.add("celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        System.out.println(palabras.size());
        return palabras;
    }


    public Set<String> construirTreeSetConComparador2() {
        Comparator<String> comparator=new Comparator<String>(){
            
            @Override
            public int compare(String s2, String s1){
                //Por longitud
                int result=Integer.compare(s1.length(),s2.length());
                //si son igual en tamaño,que sea alfabetico
                if(result==0){
                    result=s1.compareTo(s2);
                    return result;
                }
                return result;
            }
        };
        Set<String> palabras = new TreeSet<>(comparator);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        System.out.println(palabras.size());
        return palabras;
    }
}
