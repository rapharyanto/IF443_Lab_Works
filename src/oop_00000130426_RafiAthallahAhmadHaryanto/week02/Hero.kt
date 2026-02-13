package oop_00000130426_RafiAthallahAhmadHaryanto.week02

import java.util.Scanner

class Hero (val name: String, var hp: Int = 100, val baseDamage: Int){
    fun attack(targetName: String) {
        println("$name menebas $targetName dengan damage: $baseDamage")
    }
    fun takeDamage(damage: Int) {
        hp -= damage
        if(hp < 0) hp = 0
    }
    fun isAlive(): Boolean = if(hp > 0) return true else false
}

fun main () {
    var scanner = Scanner(System.`in`)
    var enemyHp: Int = 100
    print("Hero name: ")
    val name = scanner.nextLine()

    print("Damage   : ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine() // free buffer
    val hero = Hero(name, baseDamage = baseDamage)  //buat object untuk hero


    println("Hero HP    : ${hero.hp}")
    println("Enemy HP   : $enemyHp\n\nMatch Begin!!")

    while(hero.isAlive() == true && enemyHp > 0){
        println("\nMenu:\n1. Serang\n2. Kabur\nChoose: ")
        var choose: Int = scanner.nextInt()
        when (choose){
            1 -> {
                enemyHp -= baseDamage
                if(enemyHp < 0) enemyHp = 0
                hero.attack("Enemy")
                println("Enemy HP Left: $enemyHp%")

                if(enemyHp > 0) {
                    var enemyDamage = (10..20).random()
                    hero.takeDamage(enemyDamage)
                    println("\nEnemy menebas ${hero.name} dengan damage $enemyDamage")
                    println("Hero HP Left: ${hero.hp}%")
                }else println("Enemy K.O")
                if(!hero.isAlive()) println("Hero K.O")
            }
            2 -> {
                println("Match has been ended..\n")
                break
            }
        }
    }
    if(hero.hp > enemyHp) {
        println("\nHero HP    :  ${hero.hp}\nEnemy HP   : ${enemyHp}\nHero Win")
    }else if(hero.hp < enemyHp) {
        println("\nHero HP    :  ${hero.hp}\nEnemy HP   : ${enemyHp}\nEnemy Win")
    }else println("\nHero HP    :  ${hero.hp}\nEnemy HP   : ${enemyHp}\nDraw")
}

