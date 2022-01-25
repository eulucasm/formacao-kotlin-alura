fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = 10
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    var contaMaria = contaJoao

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}
