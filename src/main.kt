fun main() {
    println("Bem vindo ao Bytebank")

    testaComportamentosConta()

    val alex = Funcionario(
        "Alex",
        "123456789-93",
        1000.0
    )
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("Bonificação ${alex.bonificacao()}")
    println()

    val gerente = Gerente(
        "Fran",
        "123456789-93",
        2000.0,
        123456
    )
    println(gerente.nome)
    println(gerente.cpf)
    println(gerente.salario)
    println(gerente.bonificacao())
    if(gerente.autentica(123456)){
        println("Autenticação com sucesso")
    }else{
        println("falha")
    }
}