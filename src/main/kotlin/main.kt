fun main() {
    var amount: Int = 10000
    var commission: Double = (amount * 0.75) / 100
    var result: Double = amount + commission
    println("Комиссия равна: " + commission + " рублей." + " Вместе с комиссией вы должны будете заплатить: " + result + " рублей.")
}
