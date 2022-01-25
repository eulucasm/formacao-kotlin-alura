open class Conta (
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

/*construtor secundario
    constructor(titular: String, numero: Int){
        this.titular = titular
        this.numero = numero
    }
*/

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo insuficiente para Saque")
        }
    }

    fun tranfere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }

}
/*codigo apenas ilustrativo para estudo

    fun getSaldo(): Double {
        return saldo
    }
    fun setSaldo(valor: Double){
        if (valor > 0 ){
            saldo = valor
        }
    }
*/