fun main() {
    fun isPalindrome(x: Int): Boolean {
        var convertToString = x.toString()
        for (index in 0..<(convertToString.length / 2)) {
            if (convertToString[index] != convertToString[(convertToString.length - 1) - index]) {
                return false
            }
        }
        return true
    }


    println(isPalindrome(12324))
}
