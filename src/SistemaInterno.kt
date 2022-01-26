class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank autenticado")
        } else {
            println("Falha na autenticação")
        }
    }

}