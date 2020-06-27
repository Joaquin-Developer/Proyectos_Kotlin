package Unidad7
/**
 * Created by JoaquínParrilla on 26/06/2020.
 * Clase 6: Sobrecarga de Paréntesis y ej.6
 * Página del teórico: inicia en 220
 * Temas:
 *      Sobrecarga de Paréntesis
 *      Ejercicio 6
 * <>
Ejercicio 6:
Plantear una clase Dados que administre 10 valores de dados en un arreglo de tipo IntArray.
Sobrecargar el operador de paréntesis para la clase y acceder mediante una posición al
valor de un dado específico.
 **/

class Dados{

    var valores: IntArray = IntArray(10)

    fun imprime(){
        // esta funcion pasa a no tener mucho sentido,
        // al implementar la sobrecarga invoke
        for(i in valores.indices)
            println("Elemento $i = ${valores[i]}")
    }

    operator fun invoke(pos: Int) = valores[pos]

}



fun main(args: Array<String>) {
    val unDado = Dados()

    for(i in unDado.valores.indices) {
        // aleatorios entre 1 y 6
        unDado.valores[i] = ((Math.random() * 6) + 1).toInt()
    }

    for(i in 0..9){
        println("Elemento $i = ${unDado(i)}")
    }
    println("**********************************")
    unDado.imprime()    // mismo resultado que "for ... unDado(i)" de arriba

}
