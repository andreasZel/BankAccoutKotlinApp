package eu.tutorial.basickotlin

class BankAccount(var accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount;
        transactionHistory.add("$accountHolder added ${amount}$")
    }

    fun withdraw(amount: Double) {
        if (balance < amount) {
            println("Account does not have enough money")
            return
        }

        balance -= amount;
        transactionHistory.add("$accountHolder withdrew ${amount}$")
    }

    fun transferMoney(accountToTransfer: BankAccount, amount: Double) {
        if (balance < amount) {
            println("Account does not have enough money")
        }

        balance -= amount
        accountToTransfer.balance += amount
        transactionHistory.add("$accountHolder send ${amount}$ to ${accountToTransfer.accountHolder}")
        accountToTransfer.transactionHistory.add("${accountToTransfer.accountHolder} received ${amount}$ from $accountHolder")
    }

    fun displayTransactionHistory() {
        println("Transaction History for $accountHolder:")

        for(transaction in transactionHistory) {
            println(transaction)
        }
    }
}