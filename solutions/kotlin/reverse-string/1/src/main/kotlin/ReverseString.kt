fun reverse(input: String) : String {
    val stringBuffer = StringBuffer(input.length)
    for (charPosition in input.lastIndex downTo 0) {
        stringBuffer.append(input[charPosition])
    }
    return stringBuffer.toString()
    //kotlin way = input.reversed()
}

//other version using java StringBuffer (faster by bit computation)
//fun reverse(input: String) = input.reversed()

//other version using java StringBuffer (faster by bit computation)
//fun reverse(input: String) = StringBuffer(input).reverse().toString()


