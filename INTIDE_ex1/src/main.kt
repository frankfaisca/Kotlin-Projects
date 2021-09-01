import kotlin.io.readLine as readLine

fun main(){
    var nome:String
    var idade:Long
    var verifica:Boolean

    idade = 13
    nome = "Frank"
    verifica=false

    println(idade)
    println("Double: Max:" + Double.MAX_VALUE + " - Min: " + Double.MIN_VALUE)
    println("Float: Max:" + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE)
    println("Long: Max:" + Long.MAX_VALUE + " - Min: " + Long.MIN_VALUE)
    println("Int: Max:" + Int.MAX_VALUE + " - Min: " + Int.MIN_VALUE)
    println("Short: Max:" + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE)
    println("Byte: Max:" + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE)

    // variáveis mutáveis

    var idade2 =11

    // variavel imutável

    val idade3: Int
    idade3 = 7
    println(idade3)

    // manipulando string

    val frase = "Kotlin é"
    val caracteristica = " Show!"
    //var x:String

    val aviso = """
        **********************
        *       AVISO        *
        **********************
    """.trimIndent()

    println("${aviso.length}")
    println (message = frase + caracteristica)
    println ("Kotlin é$caracteristica")
    println("Kotlin é?")
    //x = readLine().toString()
    //println("Kotlin é $x")

    val a = 10
    val b = 20
    val c:Int = 30

    println("O Bonus é: ${calculaBonus(a,b,c)}")
    println(hello2("Frank"))
}

fun calculaBonus(a:Int,b:Int,c:Int):Int {
    var d:Int
    d = a+b+c
    return d
}

fun hello(nome:String): String{
    return "Olá, $nome"
}

fun hello2(nome:String) = "Olá, $nome"