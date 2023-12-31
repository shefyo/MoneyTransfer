fun main() {
    var amount: Int = 100
    var commission: Int = ((amount * 0.75) / 100).toInt()
    if (commission < 35) {
        commission = 35
    }
    var result: Int = amount + commission
    println("Комиссия равна: " + commission + " рублей." + " Вместе с комиссией вы должны будете заплатить: " + result + " рублей.")
}
