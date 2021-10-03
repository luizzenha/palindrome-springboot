package br.com.mbaimpacta.palindrome.controller

import br.com.mbaimpacta.palindrome.service.implementation.PalindromeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/palindrome")
class PalindromeController (
    val service : PalindromeService
        ) {

    @GetMapping
    @ResponseBody
    fun get_index(@RequestParam text: String): Boolean {
        return service.isValid(text)
    }
}