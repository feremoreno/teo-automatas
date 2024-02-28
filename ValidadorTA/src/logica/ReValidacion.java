
package logica;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

public class ReValidacion {
    
    // METODO QUE RENOMBRA LA VARIABLE ' NOMBRE ' ==============================
    public String ReNombre (String nombre) {
        
        String renombre = nombre.replaceAll("[^a-zA-Z]", "");
        
        renombre = renombre.toLowerCase();
        
        //Tengo un return y no se donde guardarlo ==================== (1)
        return renombre;
    }
    
    //METODO QUE RENOMBRA LA VARIABLE ' MATRICULA ' ============================
    public String FiltrarMatricula (String matricula) {
        
        String rematricula = matricula.replace("\\D", "");
        
        if(rematricula.length() > 7){
            rematricula = rematricula.substring(0, 7);
        }
        
        //Tengo un return y no se donde guardarlo ==================== (2)
        return rematricula;
    }
    
    // Metodo para ordenar las palabaras y eliminar repeticiones ===============
    public String ordenarLetras(String nombre) {
        // Convertir la cadena a un conjunto para eliminar duplicados
        Set<Character> letrasSinDuplicados = new HashSet<>();
        for (char c : nombre.toCharArray()) {
            letrasSinDuplicados.add(c);
        }

        // Convertir el conjunto a un array de caracteres
        char[] letrasOrdenadas = new char[letrasSinDuplicados.size()];
        int i = 0;
        for (char letra : letrasSinDuplicados) {
            letrasOrdenadas[i++] = letra;
        }

        // Convertir el array de caracteres a una cadena
        return new String(letrasOrdenadas);
    }
    
    // Metodo para ordenar numeros y eliminar repeticiones =====================
    public String ordenarNumeros(String matricula) {
        // Convertir la cadena a un conjunto para eliminar duplicados
        Set<Character> numerosSinDuplicados = new HashSet<>();
        for (char c : matricula.toCharArray()) {
            numerosSinDuplicados.add(c);
        }

        // Convertir el conjunto a una lista para poder ordenarlo
        List<Character> numerosOrdenados = new ArrayList<>(numerosSinDuplicados);
        Collections.sort(numerosOrdenados);

        // Convertir la lista de caracteres a una cadena
        StringBuilder resultado = new StringBuilder();
        for (char numero : numerosOrdenados) {
            resultado.append(numero);
        }

        return resultado.toString();
    }

    // Metodo para separar unca cadena con ' , '
    public String separarConComas(String cadena) {
        // Crear un StringBuilder para construir la cadena con comas
        StringBuilder resultado = new StringBuilder();

        // Iterar sobre cada caracter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            // Agregar el caracter actual al resultado
            resultado.append(cadena.charAt(i));
            // Agregar una coma si no es el último caracter
            if (i < cadena.length() - 1) {
                resultado.append(",");
            }
        }

        return resultado.toString();
    }
    
    //Metodo para crear el alfaabeto que contiene letras y numeross ============
    public String Alfabeto (String nombre, String matricula){
        
        //Creo la instancia de la propia clase para poder utilizar los metodos
        ReValidacion miclase = new ReValidacion();
        
        //Mando la variable con 'nombre' para ordenarlo
        String nombreOrdenado = miclase.ordenarLetras(nombre);
        
        //Mando la variable con 'matricula' para ordenarla
        String matriculaOrdenada = miclase.ordenarNumeros(matricula);
        
        //Concateno las cadenas 'nombre' y 'matricula' para mostrarlas
        String concatenado = nombreOrdenado + matriculaOrdenada + ".";
        
        String concatenadoComa = miclase.separarConComas(concatenado);
        
        return concatenadoComa;
        
    }
    
}
