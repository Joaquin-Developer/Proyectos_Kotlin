/**
 * Created by Joaquín Parrilla on 07/02/2020.
 * Clase 3: Uso del FOR en Kotlin
 * Página del teórico: 52
 *
 * <>
 */

fun main(args:Array<String>){
    introduccion_a_los_rangos()
    ejerc_1()
}

fun introduccion_a_los_rangos(){
    //Ejemplos de definición de rangos en Kotlin:
    // úso del in

    var digito = 1..9   // variable digito (tipo Int), con valores en un rango de 1 a 9
    var letras = "a".."z"   // variable tipo char con  valores en un rango de a a z (letras abcdario)
    // Si necesitamos conocer si un valor se encuentra dentro de un rango debemos emplear el
    // operador in o el !in:

    if(5 in digito){
        println("El numero 5 pertenece al rango de Digito.")
    }else{
        println("El numero 5 no pertenece al rango de Digito.")
    }
    // ejemplo con !in
    if(5 !in digito)
        println("El numero 5 NO pertenece al rango de Digito.")

    // Uso de rangos en un FOR
    // Imprimir todos los numeros del 1 al 100
    for(i in 1..100){
        println(i)
    }
    // Nota: la variable i se define por defecto de tipo Int ya que el rango es de 1 a 100
}
fun ejerc_1(){
    /**
     * Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre
        posteriormente la suma de los valores ingresados y su promedio. E
     */
    var suma : Int = 0 // se debe inicializar
    for(i in 1..10){
        println("Ingrese un numero: ")
        var numero : Int = readLine()!!.toInt()
        suma += numero
    }
    println("La suma de los valores ingresados es $suma")
    val promedio = suma / 10
    println("El promedio de los valores ingresados es $promedio")

}

fun ejerc_2(){
    /**
     * Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen notas
        mayores o iguales a 8 y cuántos menores.
     */
    var aprobados : Int = 0
    var reprobados : Int = 0
    for(i in 1..10){
        println("Ingrese la nota #$i :")
        var nota = readLine()!!.toInt()
        if(nota >= 8)
            aprobados++
        else
            reprobados++
    }
    println("Cantidad de alumnos aprobados : $aprobados")
    println("Cantidad de alumnos reprobados : $reprobados")
}