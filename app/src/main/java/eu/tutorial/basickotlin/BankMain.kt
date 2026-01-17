package eu.tutorial.basickotlin

fun main(){
   val kostasAccount = BankAccount("Kostas", 100.0)
   val adonisAccount = BankAccount("Adonis", 120.0)

   kostasAccount.deposit(20.0)
   kostasAccount.displayTransactionHistory()

   adonisAccount.transferMoney(kostasAccount, 10.0)
   adonisAccount.displayTransactionHistory()
   kostasAccount.displayTransactionHistory()

}