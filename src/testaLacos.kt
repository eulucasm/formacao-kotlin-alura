fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("Titular: $titular")
        println("Numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
}
