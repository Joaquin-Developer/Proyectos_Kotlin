package Unidad2

/**
 * Created by Joaquín Parrilla on 08/03/2020.
 * Clase 2: Úso del When como expresión
 * Página del teórico: 57 a 61
 * Temas:
 *      When
 *      Ejemplos del úso del when como expresión
 * <>
 */

fun main(args:Array<String>){
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()

}

private fun ejercicio1(){
    // Ingresar los sueldos de 10 empleados por teclado. Mostrar un mensaje según el valor del sueldo :
    // "sueldo alto" si es > 5000
    // "sueldo medio" si es <=5000 y > 2000
    // "sueldo bajo" si es <= 2000
    // Ademas, mostrar el total acumulado de gastos en sueldos altos
    var total = 0 // se debe inicializar
    for (i in 1..10){
        println("Ingrese sueldo del operario: ")
        val sueldo = readLine()!!.toInt()
        total += when {
            sueldo > 5000 ->{
                println("Sueldo alto")
                sueldo
            }
            sueldo <=5000 && sueldo > 2000 ->{
                println("Sueldo medio")
                0
            }
            else -> {
                println("Sueldo bajo")
                0
            }
        } //When
    }// for
    println("Cantidad de gastos en sueldos altos = $total");

}

private fun ejercicio2(){
    /**
     * Se ingresa por teclado un valor entero, mostrar una leyenda por pantalla que indique si
     * el número es positivo, nulo o negativo
     */

    println("Ingrese un numero entero :")
    val num : Int = readLine()!!.toInt()
    when{
        num >= 0 -> println("El número ingresado es POSITIVO")
        num == 0 -> println("El número ingresado es CERO")
        else -> println("El número ingresado es NEGATIVO")
    }
}

private fun ejercicio3(){
    /**
     * Plantear una estructura que se repita 5 veces y dentro de la misma cargar 3 valores
     * enteros. Acumular solo el mayor del cada lista de tres valores.
     */
    for(i in 1..5){
        println("Ingrese i° numero:")
        var num1 = readLine()!!.toInt()
        println("Ingrese i° numero:")
        var num2 = readLine()!!.toInt()
        println("Ingrese i° numero:")       // ->
        var num3 = readLine()!!.toInt()
        val mayor = when{
            num1 > num2 && num1 > num3 -> num1
            num2 > num1 && num2 > num3 -> num2
            else -> num3
        }
        println("De los tres números ingresados ($num1, $num2, y $num3), el mayor es $mayor")
    }

}

private fun ejercicio4(){
    /**
     * Realizar un programa que lea los lados de n triángulos, e informar:
        a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
        isósceles (dos lados iguales), o escaleno (ningún lado igual)
        b) Cantidad de triángulos de cada tipo.
     */
    println("Ingresar cantidad de triángulos a analizar: ")
    val cant : Int = readLine()!!.toInt()
    for(i in 1..cant){
        println("********************* $i° TRIÁNGULO **********************")
        println("Ingresar medida de lado 1 del triángulo")
        val lado1 = readLine()!!.toInt()
        println("Ingresar medida de lado 2 del triángulo")
        val lado2 = readLine()!!.toInt()
        println("Ingresar medida de lado 3 del triángulo")
        val lado3 = readLine()!!.toInt()
        var totalIsoceles : Int = 0
        var totalEquilatero : Int = 0
        var totalEscaleno : Int = 0
        when{       // ->
            lado1 == lado2 && lado1 == lado3 -> {
                println("El triángulo es EQUILÁTERO")
                totalEquilatero++
            }
            lado1 != lado2 && lado1 != lado3 && lado2 != lado3 -> {
                println("El triángulo es ESCALENO")
                totalEscaleno++
            }
            else ->{
                println("El triángulo es ISÓSCELES")
                totalIsoceles++
            }
        } //when
    }//for
}//FUN








