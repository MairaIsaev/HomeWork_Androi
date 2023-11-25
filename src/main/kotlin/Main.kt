import java.util.*

fun main(args: Array<String>) {
    val store = Store()
    val user = User("Mарат","Улица Кожонбердиева106 ").apply { balance += 75000 }

    val scanner = Scanner(System.`in`)
    store.printAllProducts()
    println("Введите ID товара для покупки: ")
    val product = scanner.nextInt()

    with(store){
        buy(product,user)
    }
}