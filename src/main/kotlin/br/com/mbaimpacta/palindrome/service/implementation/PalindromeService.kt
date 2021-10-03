package br.com.mbaimpacta.palindrome.service.implementation

import br.com.mbaimpacta.palindrome.service.PalindromeService
import org.springframework.stereotype.Service

@Service
class PalindromeService : PalindromeService {
    override fun isValid(inputString: String): Boolean {
        val cleanString = clearString(inputString)
        return (cleanString == cleanString.reversed())
    }

    override fun clearString(inputString: String): String {
        val cleanString = inputString.replace(("[^\\w\\d]").toRegex(), "")
        return cleanString.lowercase()
    }
}