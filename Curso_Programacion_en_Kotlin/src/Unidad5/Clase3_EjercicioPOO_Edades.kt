package Unidad5
/**
 * Created by Joaquín Parrilla on 18/06/2020.
 * Clase 3: POO en Kotlin: Ejercicio POO
 * Página del teórico: inicia en 124
 * Temas:
 *      Programación Orientada a Objetos
 *      Llamada a métodos desde otro método
 *      Ejercicio
 * <>
Declarar una clase llamada Hijos. Definir dentro de la misma un arreglo para
almacenar las edades de 5 personas. Definir un método cargar donde se ingrese por
teclado el arreglo de las edades y llame a otros dos método que impriman la mayor
edad y el promedio de edades.
 **/
class Hijos{
    var edades: IntArray = IntArray(5)

    fun cargarArray(){
        for(i in 0..4){
            println("Ingrese ${i+1}° edad:")
            edades[i] = readLine()!!.toInt()
        }
        mayorEdad()
        promedioEdades()
    }

    fun mayorEdad(){
        var mayor: Int = 0
        for(actual in edades){ //for each Array edades
            if(actual > mayor)
                mayor = actual
        }
        println("La edad mayor es $mayor años")
    }

    fun promedioEdades(){
        var promedio: Int = 0
        for(actual in edades)
            promedio += actual
        promedio = promedio / 5
        println("El promedio de edades es de $promedio")
    }
}

fun main(args:Array<String>){
    //val h : Hijos = new Hijos()
    //h.cargarArray()


}