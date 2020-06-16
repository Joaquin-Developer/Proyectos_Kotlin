/**
 * Created by Joaquín Parrilla on 30/01/2020.
 * <>
 */
fun main(args:Array<String>){
    println("Hola, de aqui nos vamos a la función misFatos, para ver mi info personal :)")
    //misDatos()
    //calculos()
    //calculadora()
    //perimetro()
    //descuentoSalario()
    //misNotas()
    valorNumerico()
}

fun misNotas(){
    /**
     * Ejercicio 1
     */
    var nota1 : Int
    var nota2 : Int
    var nota3 : Int
    println("Ingresar primer nota:")
    nota1 = readLine()!!.toInt()
    println("Ingresar segunda nota:")
    nota2 = readLine()!!.toInt()
    println("Ingresar tercer nota:")
    nota3 = readLine()!!.toInt()
    var promedio : Int = (nota1 + nota2 + nota3)/(3)
    if (promedio >= 7){
        println("Promovido.")
    }else{
        println("No promovido.")
    }
}
fun valorNumerico(){
    /**
     * Ejercicio 2
     */
    println("Ingrese un numero entre 1 y 99")
    var numero = readLine()!!.toInt()
    if(numero < 1 || numero > 99){
        println("Error. No ingresó un numero valido.")
    }else{
        var res = analizarNum(numero)
        println("$res")
    }
}
fun analizarNum(n : Int): String {  //función del tipo procedimiento, retorna un String (en este caso)
    var analisis : String
    if(n < 10){
        analisis = "Tiene 1 dígito"
    }else{
        analisis = "Tiene 2 dígitos"
    }
    return analisis

}

fun descuentoSalario(){
    /**
     * Letra del ejercicio:
     * Si el salario es menor de 15.000, no hay descuentos.
     * Si el salario es entre 15.000 y 25.000, hay un 2% de dcto.
     * Si el salario es entre 25.000 y 40.000, hay un 4 % de dcto.
     * Si el salario supera los 40000 hay un 7% de dcto.
     */
    println("Ingrese salario nominal: ")
    var salario : Double = readLine()!!.toDouble()
    var descuentos : Double    // almacenamos el total a descontar
    if(salario < 15000 ){
        descuentos = 0.0
    }else if(salario >= 15000 && salario < 25000){
        descuentos = (salario * 0.2)
    }else if(salario >= 25000 && salario < 40000){
        descuentos = (salario * 0.4)
    }else{
        descuentos = (salario * 0.7)
    }
    println("Total a descontar : $descuentos")
    var salarioFinal : Double = (salario - descuentos)
    println("El salario final será de $salarioFinal")

}



fun calculadora(){
    // Pedirle al usuario datos (por consola) para efectuar operaciones
    var num1 : Int
    var num2 : Int
    println("Ingrese el primer número: ")
    num1 = readLine()!!.toInt()
    println("Ingrese el segundo número: ")
    num2 = readLine()!!.toInt()
    var suma : Int = (num1 + num2)
    println("La suma de $num1 y $num2 es $suma")
    var division : Int = (num1 / num2)
    println("La division de $num1 y $num2 es $division")
}

fun perimetro(){
    println("Cálculo de perímetros")
    do{
        println("Ingrese 1 para hallar perímetro del Cuadrado")
        println("Ingrese 2 para hallar perímetro del Círculo")
        var opcion : Int = readLine()!!.toInt()
        if(opcion.equals(1)){
            println("Ingrese la medida del lado del cuadrado:")
            var lado : Int = readLine()!!.toInt()
            var perimetro : Int = lado * 4
            println("El perímetro del cuadrado de lado $lado es = $perimetro")
        }else {
            if(opcion.equals(2)){
                println("Ingrese el diámetro del Círculo:")
                var diam : Double = readLine()!!.toDouble()
                var perimetro : Double = (Math.PI * diam)   // Usamos la librería estática Math perteneciente a la API deJava
                // Nota: Math.PI devuelve el valor exacto del número pi
                println("El perímetro del Círculo es = $perimetro")
            }else{
                println("Error: Opción inválida")
            }
        }
    }while(opcion != 1 && opcion != 2)


}//fin metodo perimetro

fun misDatos(){
    println("Mi información personal.")
    // var : Variable mutable (espacio de memoria) No es fija.
    // val : Variable fija o inmutable, una vez que se le asigna un valor, no se podrá modificarlo.
    var edad : Short //declaré la variable de nombre edad, y de tipo Short (dato del tipo numérico)

    edad = 18   // le asigné el valor 18 a la variable edad.
    var nombre : String
    nombre = "Joaquín"
    val apellido : String   // valor inmutable (fijo), declarado con la sentencia "val"
    apellido = "Parrilla"
    println("Mi nombre es $nombre y mi apellido es $apellido")
    println("Mi edad es: $edad") //imprimo mi edad por consola
    var domicilio : String
    domicilio = "Av. 8 de Octubre 4567, esq. Comercio"
    var tengoMascotas : Boolean
    tengoMascotas = true
    println("Mi dirección es: $domicilio")
    if(tengoMascotas.equals(true)){
        println("Sí tengo mascotas.")
    }else{
        println("No tengo mascotas.")
    }
    var promedioNotas : Double  // variable del tipo Decimal
    promedioNotas = 8.0
    println("Mi promedio de calificaciónes es de $promedioNotas")
}

fun calculos(){
    var num1 : Int = 14     //declaro y le asigno valor a num1 en la misma línea
    var num2 : Int
    num2 = -2
    var suma : Int = num1 + num2    // a suma le asigno el valor obtenido de la suma de las variables num1 y num2
    var resta : Int = (num1 - num2)     // el paréntesis protege la declaración (similar a la parentización en matemática)
    println("La suma de $num1 y $num2 es $suma")
    println("La resta de $num1 y $num2 es $resta")

    var num3 : Double = 14.0
    var opuesto2 : Int = -1*(num2)  //opesto de -2 (2)
    var inverso1 : Double = 1.0/(num3)   // inverso de 14 (1/14)
    println("El opuesto del número $num2 es $opuesto2")
    println("El inverso del número $num1 es $inverso1")

}