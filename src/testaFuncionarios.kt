fun testaFuncionarios() {
    val alex = Analista(
        "Alex",
        "123456789-93",
        1000.0
    )
    val fran = Gerente(
        "Fran",
        "123456789-93",
        2000.0,
        123456
    )
    val lucas = Diretor(
        "lucas",
        "123.465.789-97",
        6000.0,
        123456,
        2000.0
    )
    val maria = Analista(
        "maria",
        "123.465.789-97",
        3000.0,
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("Bonificação ${alex.bonificacao}")
    println()
    println(fran.nome)
    println(fran.cpf)
    println(fran.salario)
    println(fran.bonificacao)
    println()
    println(lucas.nome)
    println(lucas.cpf)
    println(lucas.salario)
    println(lucas.bonificacao)
    println()
    println(maria.nome)
    println(maria.cpf)
    println(maria.salario)
    println(maria.bonificacao)
    println()


    if (fran.autentica(123456)) {
        println("Autenticação com sucesso")
    } else {
        println("falha")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(lucas)
    calculadora.registra(maria)

    println("total de bonificacao: ${calculadora.total}")
}