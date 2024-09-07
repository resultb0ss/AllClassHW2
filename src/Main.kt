fun main() {

    var personOne = Person<String, Long>("Виктор", 79287665524)
    var personTwo = Person<String, String>("Дмитрий","79829838454")

    println("Имя: ${personTwo.name}  Номер телефона: ${personTwo.phone}")
    println("Имя: ${personOne.name}  Номер телефона: ${personOne.phone}")
}

class Person<T,V>(val name: T, var phone: V)