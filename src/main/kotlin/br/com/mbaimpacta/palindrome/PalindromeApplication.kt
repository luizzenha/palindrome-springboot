package br.com.mbaimpacta.palindrome

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PalindromeApplication

fun main(args: Array<String>) {
    runApplication<PalindromeApplication>(*args)
}
