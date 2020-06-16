/**
 * Created by Joaquín Parrilla on 31/01/2020.
 * Clase 2: Uso del condicional IF como expresión.
 *
 * <>
 */
fun main(args:Array<String>){
    //uso_del_if()    //invocamos a nuestra función.
    // mas ejemplos de su úso:
    numPar()
    ejercicio3()
}

fun uso_del_if(){
    /**
     * Primer ejemplo: Cargar dos valores enteros, almacenar el mayor de los mismos en otra variable y mostrarlo
     */
    println("Ingrese el primer número: ")
    var num1 : Int = readLine()!!.toInt()
    println("Ingrese el segundo número: ")
    var num2 : Int = readLine()!!.toInt()

    var mayor = if(num1 > num2 ) num1 else num2   //uso del if como expresión
    // Nota: no es necesario aclararle a Kotlin que mayor es del tipo Int, debido a que tanto num1 como num2 son Int.

    println("El mayor entre $num1 y $num2 es $mayor")   // mostramos resultado por consola
}// fin del método.

fun numPar(){
    /**
     * Ejercicio 2 : condicional if como expresión
     * Uso de Booleanos, determinamos si un numero es par o no.
     */
    println("Ingresar numero:")
    var numero = readLine()!!.toInt()
    var esPar : Boolean = if((numero % 2) == 0 ) true else false
    println("¿$numero es par? = $esPar")
}

fun ejercicio3(){
    /**
     * Pedimos un número, si este es par, calculamos y mostramos el cuadrado del numero
     * si es impoar, calculamos y mostramos el cubo de dicho núm.
     */
    print("Ingrese un número: ")
    val num : Int = readLine()!!.toInt()
    val resultado = if(num % 2 == 0){
        // dentro de las llaves del if, o else, se declarará el valor de "resultado"
        println("Cuadrado:")    // acción (procedimiento)
        num * num   // valor que se le  asignará a resultado, en caso de cumplir condicional del IF
    }else{
        println("Cubo:")
        num * num * num  // valor que se le asignará a resultado, en caso de cumplir condicional del ELSE
    }
    println("$resultado")   //mostramos el resultado por consola.

    // Nota: Es importante tener en cuenta que la última línea de cada bloque del if es la que se retorna y
    //       se almacena en la variable resultado
}