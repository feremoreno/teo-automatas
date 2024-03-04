
package logica;

import java.util.HashSet;
import java.util.Set;

public class Automata {

    //Instancio la clase ' ReValidacion ' para reutilizar los metodos
    ReValidacion reutiliza = new ReValidacion();
    
    
    
    //Metodo encargacdo de regresar las iniciales del nombre
    public String obtenerIniciales(String nombre) {
        
        StringBuilder iniciales = new StringBuilder();
        boolean nuevaInicial = true;

        for (char caracter : nombre.toCharArray()) {
            if (Character.isLetter(caracter)) {
                if (nuevaInicial || caracter == ' ') {
                    iniciales.append(caracter);
                    nuevaInicial = false;
                }
            } else {
                nuevaInicial = true;
            }
        }

        return iniciales.toString();
    }

    //CODIGO TOCHOOOOOO =================================================================
    public String validarCadena(String matricula, String iniciales, String cadena, String oldMatricula) {
        
        // VERIFICAR QUE PRIMER DIGITO DE 'CADENA' SEA ALGUN NUMERO DE 'MATRICULA' ======
        
        // Paso 1: Obtener la subcadena de "matricula" sin el punto inicial
        String subMatricula = matricula.substring(1);

        // Paso 2: Verificar si el primer carácter de "cadena" es un número
        char primerCaracter = cadena.charAt(0);
        if (!Character.isDigit(primerCaracter)) {
            return "Cadena No Valida";
        }

        // Paso 3: Verificar si el número está contenido en la subcadena de "matricula"
        char numero = primerCaracter;
        if (subMatricula.indexOf(numero) == -1) {
            return "Cadena No Valida";
        }
        
        // Validar primer caracter de "cadena"
//        if (!Character.isDigit(cadena.charAt(0))) {
//            System.out.println("Aqui esta el error (1)");
//            return "Cadena No Valida";
//        }
//
//        // Convertir primer caracter de "cadena" a int
//        int numeroCadena = Character.getNumericValue(cadena.charAt(0));
//
//        // Validar "matricula"
//        matricula = matricula.substring(1); // Eliminar punto
//        char[] caracteresMatricula = matricula.toCharArray();
//
//        // Buscar coincidencia en "matricula"
//        boolean encontrado = false;
//        for (char caracter : caracteresMatricula) {
//            if (caracter == numeroCadena) {
//                encontrado = true;
//                break;
//            }
//        }
//
//        if ( !(encontrado) ) {
//            System.out.println("Aqui esta el error (2)");
//            return "Cadena No Valida";
//        }
        
//        //VERIFICAR QUE 'CADENA' CONTENGA AL MENOS UNA VEZ CADA UNA DE LAS LETRAS =======
//        // Convertir "nombre" a un conjunto de caracteres
//        Set<Character> caracteresNombre = new HashSet<>();
//
//        for (char caracter : nombre.toCharArray()) {
//            caracteresNombre.add(caracter);
//        }
//
//        // Recorrer cada caracter de "cadena"
//        for (char caracter : cadena.toCharArray()) {
//            // Si el caracter está en el conjunto "caracteresNombre", eliminarlo del conjunto
//            if (caracteresNombre.contains(caracter)) {
//                caracteresNombre.remove(caracter);
//            }
//        }
//
//        // Si el conjunto "caracteresNombre" está vacío, la cadena es válida
//        if (!(caracteresNombre.isEmpty())) {
//            System.out.println("Aqui esta el error (3)");
//            return "Cadena No Valida";
//        }
        
        //VERIFICAR QUE 'CADENA' CONTIENE AL MENOS UNA VEZ A 'INICIALES' ================
        if ( !(cadena.contains(iniciales)) ) {
            // La cadena "iniciales" se encuentra en la cadena "cadena"
            return "Cadena No Valida";
        }

        //VERIFICAR QUE 'CADENA' NO CONTENGA DOS PUNTOS SEGUIDOS " .. " =================
        if (cadena.contains("..")) {
            System.out.println("Aqui esta el error (5)");
            return "Cadena No Valida";
        }
        
        //VERIFICAR QUE ' CADENA ' TERMINE CON LA ' MATRICULA ' =========================
        
//        if ( !(cadena.endsWith(matricula)) ) {
//            //No hace nada
//        } else {
//            return "Cadena No Valida";
//        }
        
//        if (cadena.length() < matricula.length()) {
//            System.out.println("Aqui esta el error (6)");
//            return "Cadena No Valida";
//        }
//        
//        String sufijo = cadena.substring(cadena.length() - subMatricula.length());
//
//        if ( !(sufijo.equals(subMatricula)) ) {
//            System.out.println("Aqui esta el error (7)");
//            return "Cadena No Valida";
//        }

        if (cadena.endsWith(oldMatricula)) {
            return "Cadena Valida";
        } else {
            System.out.println("Perro Error");
            return "Cadena No Valida";
        }

        //Si nada de lo anterior se cumple, entonces la cadena es valida
//        return "Cadena Valida";
    }

    
    public String validacion(String nombre, String matricula, String cadena) {
        
        //Instancio esta clase para poder utilizar los demas metodos
        Automata estaClase = new Automata();
        
        //Reutilizo el metodo para ordenar letras y lo guardo en nuevo string
        String ordenarNombre = reutiliza.ordenarLetras(nombre);
        
        //Reutilizo el metodo para ordenar numeros y lo guardo en un nuevo string
        String ordenarMatricula = reutiliza.ordenarNumeros(matricula);
        ordenarMatricula = "." + ordenarMatricula;
        
        //Creo un metodo para eliminar caracteres que no esten en el alfabeto
        //y pasar a minusculas
        String reNombre = nombre.toLowerCase();
        
        //Obtengo las iniciales del nombre con ayuda del metodo 'obtenerIniciales'
        String iniciales = estaClase.obtenerIniciales(reNombre);
        
        //Envio 'nombre', 'matricula' y 'cadena' a validar y guardo la validacion
        System.out.println(matricula);
        String verificacion = estaClase.validarCadena(ordenarMatricula, iniciales, cadena, matricula);
        
        return verificacion;
    }
    
}