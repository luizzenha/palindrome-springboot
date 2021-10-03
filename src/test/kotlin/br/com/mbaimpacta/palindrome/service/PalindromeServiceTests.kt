package br.com.mbaimpacta.palindrome.service

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Bean
import org.springframework.util.Assert

@SpringBootTest()
class PalindromeServiceTests {

    @Autowired
    lateinit var service: PalindromeService;


    @Test
    fun validate_clear_string(){
        //arrange
        var text: String = "Text with special chars / , 1 !"

        //act
        var clearText = service.clearString(text)


        //assert
        Assert.doesNotContain( clearText," ", "Clean text should not contains space")
        Assert.doesNotContain(clearText,",", "Clean text should not contains commas")
        Assert.doesNotContain(clearText,"/", "Clean text should not contains /")
        Assert.doesNotContain(clearText,"!","Clean text should not contains exclamation marks")
    }

    @Test
    fun validate_valid_palindrome_result (){

        //arrange
        var valid_values = arrayOf( "Rotator", "bob" ,"madam", "mAlAyAlam",
            "1", "Able was I, ere I saw Elba",  "Madam I’m Adam", "Step on no pets.",
            "Top spot!", "02/02/2020")

        for (value in valid_values){
            //act
            var response = service.isValid(value)

            //assert
            Assert.isTrue(response, "$value Should be a valid palindrome")
        }

    }

    @Test
    fun validate_invalid_palindrome_result (){

        //arrange
        var invalid_values = arrayOf("xyz", "elephant", "Country", "Top . post!",  "Wonderful-fool",
         "Wild imagination!")

        for (value in invalid_values){
            //act
            var response = service.isValid(value)

            //assert
            Assert.isTrue(!response, "$value Should be a invalid palindrome")
        }

    }
}
