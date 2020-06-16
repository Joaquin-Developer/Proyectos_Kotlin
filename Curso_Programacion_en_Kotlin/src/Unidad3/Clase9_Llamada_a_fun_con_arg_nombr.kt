package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 9: Llamada a funciones con parámetros nombrados
 * Página del teórico: inicia en 87
 * Temas:
 *      Funcion
 *      Llamada a funciones con parámetros nombrados
 * <>
 * Esta característica de Kotlin nos permite llamar a la función indicando en cualquier orden
    los parámetros de la misma, pero debemos especificar en la llamada el nombre del
    parámetro y el valor a enviarle.
 * Ejercicio:
    Confeccionar una función que reciba el nombre de un operario, el pago por hora y la
    cantidad de horas trabajadas. Debe mostrar su sueldo y el nombre. Hacer la llamada de la
    función mediante argumentos nombrados.
 */
fun main(args:Array<String>){
    sueldoOperario("Pedro", 2500.0, 8)
    sueldoOperario(nombre = "Felipe", cantHs = 8 ,valorHr = 1250.70)
    sueldoOperario(valorHr = 800.0, nombre = "Antonia", cantHs = 6)
}

private fun sueldoOperario(nombre:String, valorHr:Double, cantHs:Int){
    val sueldo : Double = (valorHr * cantHs)
    println("El empleado $nombre percibe un salario de $sueldo pesos.")
}
