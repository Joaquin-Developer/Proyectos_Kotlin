/**
 * Created by Joaquín Parrilla on 07/02/2020.
 * Clase 5: Uso del WHEN en Kotlin
 * Página del teórico: 57-58
 *
 * <>
 */

fun main(args:Array<String>){
    intro()

}

fun intro(){
    // Además de la estructura condicional if Kotlin nos proporciona una estructura condicional
    // para situaciones que tenemos que verificar múltiples condiciones que se resuelven con if anidados. El "When"
    // Mediante una serie de ejemplos veremos la sintaxis de la estructura when.

    // Ejemplo 1:
    // Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos
    // valores enteros x e y.
    // Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si
    // x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, 3º Cuadrante: x < 0 Y y < 0, 4º Cuadrante: x > 0 Y
    // y < 0) Si alguno o los dos valores son cero luego el punto se encuentra en un eje.

    println("CUADRANTE DE UN PUNTO P(x,y) EN EL PLANO CARTESIANO")
    println("Ingrese coordenada del punto x :")
    val x = readLine()!!.toInt()
    println("Ingrese coordenada del punto y :")
    val y = readLine()!!.toInt()
    when{
        x > 0 && y > 0 -> println("Primer cuadrante")
        x > 0 && y < 0 -> println("Cuarto cuadrante")
        x < 0 && y > 0 -> println("Segundo cuadrante")
        x < 0 && y < 0 -> println("Tercer cuadrante")
        else -> println("El punto (x,y) pertenece a un eje")
    }

    //Ejemplo 2: Notificar fallo final de un alumno.
    println("Ingrese nota final :")
    val notaFinal = readLine()!!.toInt()
    when{   // <>
        notaFinal >= 8 -> println("Exonerado")
        notaFinal < 8 && notaFinal >= 4 -> println("Examen diciembre")
        else -> println("Examen febrero")
    }


}