class Cliente {

    data class cliente(private var nome: String) {

        private var telefone = ""
        private var endereco = ""
        private var listaDeCompras = (mutableListOf<String>())

        constructor(nome: String, endereco: String) : this(nome) {
            this.endereco = endereco
        }


   constructor(
          nome: String, endereco: String, telefone: String)
          : this(nome, endereco)
           this.telefone = telefone
     }


      init {
    if (nome.isEmpty())
        throw Exception("Classe não esta  correta")
}


fun addCompra(valor: String) {
     if (valor.isEmpty()) {
         println("Valor inadequado")
     } else {
         listaDeCompras.add(valor)
     }
 }

fun  removeCompra(valor: String){
 if(valor.isEmpty()){
     println("Valor não permitido")

 }else if (listaDeCompras.contains(valor)){
     listaDeCompras.remove(valor)
     println("O item $valor já não esta na lista")
 }else {
     println(" O item nem estava na lista mané")



  }

fun listaCompras(){

    print("Comprinhas : $nome")

    listaDeCompras.forEach(){
        println(it)
    }
}





}
  }
}
