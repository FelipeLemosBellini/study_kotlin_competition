package leetcode

fun main() {
    println(
        CircularSentence().isCircularSentence("Leetcode é legal")
    )
}

class CircularSentence {

    fun isCircularSentence(sentence: String): Boolean {

        var circularSentence = true
        var listWords = sentence.split(" ")
        println(listWords);

        for (i in 0..listWords.size - 1) {
            val currentWord = listWords[i]

            println(currentWord.lastIndex);

            if (i != listWords.size - 1) {
                val nextWord = listWords[i + 1]
                if (currentWord[currentWord.length - 1] != nextWord[0]) {
                    circularSentence = false
                }
            } else {
                if (listWords[0][0] != currentWord[currentWord.length - 1]) {
                    circularSentence = false
                }
            }
        }
        return circularSentence
    }
}

