/**
 * Módulo 3: Condicionales IF-ELSE
 * <>
 */

fun main(args:Array<String>){
    //ejer_1()
    //ej2_cifras()
    ej3_porcentajes()
    //ejer2_Arrays()

}

fun ejer_1(){
    /**
     *   Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el
     *   promedio e imprima alguno de estos mensajes:
     *   Si el promedio es >=7 mostrar "Promocionado".
     *   Si el promedio es >=4 y <7 mostrar "Regular".
     *  Si el promedio es <4 mostrar "Reprobado".
     */
    println("Ingrese primer nota: ")
    val nota1 : Int = readLine()!!.toInt()
    println("Ingrese segunda nota: ")
    val nota2 : Int = readLine()!!.toInt()
    println("Ingrese tercer nota: ")
    val nota3 : Int = readLine()!!.toInt()
    val promedio : Int = (nota1 + nota2 + nota3)/(3)
    val estado : String = if(promedio >=7 ) "Promocionado" else if (promedio >=4 && promedio <7) "Regular" else "Reprobado"
    println("Estado del alumno: $estado")
}

fun ej3_porcentajes(){
    /**
     * 5  - 100 %
     * 4  - ? %
     * ? = 100 * 4 / 5
     */
    println("Cálculo de Nivel del Test de Capacitación.")
    println("Ingrese cantidad de preguntas del test: ")
    val preguntas : Int = readLine()!!.toInt()
    println("Ingrese cantidad de preguntas que acertó: ")
    val aciertos : Int = readLine()!!.toInt()
    if(aciertos > preguntas){
        println("Imposible, crack.")
    }else{
        val porcentaje : Int = (100 * aciertos) / (preguntas)   //lógica. cálculo de porcentaje
        val nivel : String =
            if(porcentaje >= 90){
                "Nivel máximo"
            }else if(porcentaje >=75 && porcentaje <90){
                "Nivel medio"
            }else if(porcentaje >= 50 && porcentaje < 75){
                "Nivel regular"
            }else{
                "Fuera de nivel. Looser :)"
            }
        println("Resultado del test : $nivel")
    }

}

fun ej2_cifras(){
    var numero : Int
    do {
        println("Ingrese un numero de hasta tres cifras, y positivo.")
        numero = readLine()!!.toInt()
        var cifras : Int = if(numero < 10){
            1
        }else if (numero >= 10 && numero < 100){
            2
        }else if(numero >= 100 && numero < 999){
            3
        }else{
            0
        }
        if(cifras == 0){
            println("Error: Numero inválido.")
        }else{
            println("El total de cifras del numero $numero es : $cifras")
        }

    }while(numero > 999)
}

fun ejer2_Arrays(){
    /**
     * Introducción al uso de Arrays. Cálculo de promedio de tres notas de un estudiante.
     */
    var notas : IntArray
    notas = IntArray(3) //tamaño del array
    var auxiliar : Int
    println("Ingrese primer nota: ")
    auxiliar = readLine()!!.toInt()
    notas.set(0, auxiliar)
    println("Ingrese segunda nota: ")
    auxiliar = readLine()!!.toInt()
    notas.set(1, auxiliar)
    println("Ingrese tercer nota: ")
    auxiliar = readLine()!!.toInt()
    notas.set(2, auxiliar)
    val promedio : Int = (notas.get(0) + notas.get(1) + notas.get(2)) / (notas.size)
    println("Promedio de notas = $promedio")


}