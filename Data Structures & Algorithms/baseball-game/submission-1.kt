class Solution {
    fun calPoints(operations: Array<String>): Int {
        val score = mutableListOf<Int>()

        operations.forEach {
            when(it) {
                "+" -> score.add(score[score.size - 1] + score[score.size - 2])
                "C" -> score.removeLast()
                "D" -> score.add(score[score.size - 1] * 2)
                else -> score.add(it.toInt())
            }
        }   

        return score.sum()
    }
}
