package br.com.mbaimpacta.palindrome.service

interface PalindromeService {

    fun isValid (inputString: String) : Boolean;
    fun clearString (inputString: String) : String;

}