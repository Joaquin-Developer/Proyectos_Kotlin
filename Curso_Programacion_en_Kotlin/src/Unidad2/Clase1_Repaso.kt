package Unidad2

/**
 * Created by Joaquín Parrilla on 07/03/2020.
 * Clase 1: Repaso de la Unidad 1
 * Página del teórico: 01-58
 * Temas:
 *      Conceptos Básicos
 *      If, If-Else, If-Else anidados
 *      For, Variantes del For
 *      When
 * <>
 */

fun main(args:Array<String>){
    basico()
    usoIf()
    usoFor()
    usoWhen()
    usoWhen2()

}

fun basico(){
    //Ejercicio 1 : Notas de un estudiante de Fing
    var parcial1 : Int  // máximo de 40 pts
    var parcial2 : Int  // máximo de 60 pts
    var puntaje : Int
    val falloFinal : String     //no se puede modificar, a diferencia de las variables del tipo VAR
    println("Ingrese nota del Primer Parcial")
    parcial1 = readLine()!!.toInt()
    println("Ingrese nota del Segundo Parcial")
    parcial2 = readLine()!!.toInt()
    if(parcial1 > 40 || parcial2 > 60){
        println("Error: Notas incorrectas")
        if(parcial1 > 40){
            println("Parcial 1 no puede superar los 40 puntos")
        }
        if(parcial2 > 60){
            println("Parcial 2 no puede superar los 60 puntos")
        }

    }else{
        puntaje = (parcial1 + parcial2)
        if(puntaje >= 60){
            falloFinal = "EXONERADO CON $puntaje ."
        }else if(puntaje >= 25){
            falloFinal = "APROBADO CON $puntaje , deberá rendir EXAMEN."
        }else{
            falloFinal = "NO APROBADO CON $puntaje , deberá RECURSAR asignatura."
        }
        println(falloFinal)
    }




}

fun usoIf(){
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
}

fun usoFor(){
    //Ejercicio 1 : Pedir 5 nombres, guardarlos en un Array, e imprimirlos
    var aux : String
    val nombres = arrayOfNulls<String>(5)

    for(i in 1..5){
        println("Ingresar $i° nombre:")
        aux = readLine()!!.toString()
        nombres.set(i, aux)
    }
    for(i in 1..5)
        println("$i° nombre del Array = "+nombres.get(i))   //implementación Java
}

fun usoWhen(){
    //Ejercicio 1:
    println("Ingrese nota del Primer Escrito:")
    val nota1 = readLine()!!.toInt()
    println("Ingrese nota del Segundo Escrito:")
    val nota2 = readLine()!!.toInt()
    println("Ingresar numero de semestre de las calificaciónes:")
    val numSemestre = readLine()!!.toInt()
    val promedio = ((nota1 + nota2) / 2)
    when{
        promedio >= 8 && numSemestre == 1 -> println("PRIMER SEMESTRE INSUFICIENTE")
        promedio < 8 && numSemestre == 1 -> println("PRIMER SEMESTRE SATISFACTORIO")
        promedio >= 8 && numSemestre == 2 -> println("SEGUNDO SEMESTRE INSUFICIENTE")
        promedio < 8 && numSemestre == 2 -> println("SEGUNDO SEMESTRE SATISFACTORIO")
    }
    println("Promedio = $promedio")

}

fun usoWhen2(){
    /**
     * Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. El proceso
    termina cuando ingresamos el valor 0.
    Se debe informar:
    a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.? y
    cuántas con menos de 9.8 Kg.?
    b) La cantidad total de piezas procesadas.
     */
    var cant1 : Int = 0     // mayor a 10,2 Kg
    var cant2 : Int = 0     // entre 9,8 y 10,2 Kg
    var cant3 : Int = 0     // menor a 9,8 Kg
    do{
        println("Ingrese el peso en Kg de una pieza (0 para salir)")
        var peso = readLine()!!.toInt()
        when{
            peso > 10.2 -> cant1++
            peso >= 9.8 && peso <= 10.2 -> cant2++
            peso < 9.8 -> cant3++
        }
    }while(peso != 0)
    println("Cantidad de piezas con peso mayor a 10,2 Kg : $cant1")
    println("Cantidad de piezas con peso entre 9,8 y 10,2 Kg : $cant2")
    println("Cantidad de piezas con peso menor a 9,8 Kg : $cant3")
    val suma = cant1 + cant2 + cant3
    println("Cantidad de piezas ingresadas : $suma ")
}