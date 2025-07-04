package controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios{
    public Ejercicios(){
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        String texto0 = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5}));
        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5,4,3,2,45}));
        System.out.println("===================");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));
        System.out.println("====================");
        System.out.println(("Texto0 tiene "+contarPalabrasUnicas(texto0)+" palabras"));
        System.out.println("====================");
        System.out.println(("Texto1 tiene "+contarPalabrasUnicas(texto1)+" palabras"));
        System.out.println(("Texto2 tiene "+contarPalabrasUnicas(texto2)+" palabras"));
        compararTexto(texto1, texto2);

    }

    public boolean tieneDuplicados(int[] numeros){
        Set<Integer> numerosNew=new HashSet<>();
        for (int numero : numeros) {
            if(!numerosNew.add(numero)){
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra){
        Set<Character> word=new HashSet<>();
        for (Character character : word) {
            if (!word.add(character)){
                return false;
            }
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase){
        String[] newFrase=frase.split(" ");
        Set<String> palabras=new HashSet<>();
        int contador=0;
        for (String palabra:newFrase){
            if(palabras.add(palabra)){
                contador++;
            }
        }
        return contador;
    }
    public Set<String> palabrasUnicas(String frase){
        String[] newFrase=frase.split(" ");
        Set<String> palabras=new HashSet<>();
        for (String palabra:newFrase){
            palabras.add(palabra);
        }
        return palabras;
    }

    public void compararTexto(String texto1, String texto2){
        Set<String> palabras1=palabrasUnicas(texto1);
        Set<String> palabras2=palabrasUnicas(texto2);

        Set<String> soloEn1=new HashSet<>(palabras1);
        soloEn1.removeAll(palabras2);

        Set<String> soloEn2=new HashSet<>(palabras2);
        soloEn2.removeAll(palabras1);
        
        Set<String> total=new HashSet<>();
        total.addAll(palabras1);
        total.addAll(palabras2);

        Set<String> comunes=new HashSet<>(palabras1);
        comunes.retainAll(palabras2);

        double porcentaje=(comunes.size()*100.0)/total.size();
        
        System.out.println("palabras Unicas: "+comunes.size());
        System.out.println("Coincidencia Lexica: "+ porcentaje+"%");
        System.out.println("Solo en texto 1: "+ soloEn1);
        System.out.println("SOlo en texto 2: "+ soloEn2);
    }
}