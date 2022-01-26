fun testaAutenticacao() {
    val gerente = Gerente(
        "Alex",
        "111.111.111-11",
        1000.0,
        1000
    )
    val diretor = Diretor(
        "Lucas",
        "222.222.222-22",
        2000.0,
        2000,
        200.0
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
}
