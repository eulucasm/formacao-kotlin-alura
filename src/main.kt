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
}