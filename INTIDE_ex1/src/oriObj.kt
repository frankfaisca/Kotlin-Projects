

class pessoa2 (var nome: String) {

    var ano: Int? = null

    constructor(nome:String,ano:Int) : this(nome){
        this.ano = ano
    }

    fun saudacao(){
        println("olá meu nome é: $nome e nasci em $ano")
    }

}

class pessoa3 ( nome: String?, ano:Int?)


fun main(){

    var pessoa:pessoa2 = pessoa2("Frank", 1989)
    var pessoinha:pessoa3 = pessoa3(null,null)
    pessoa.saudacao()

    //println("oi")
}