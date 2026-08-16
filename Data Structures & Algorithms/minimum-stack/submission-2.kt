class MinStack() {
    val stack = ArrayDeque<Int>()
    val minStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.push(`val`)
        val minVal = if(minStack.isNotEmpty()) minOf(`val`, minStack.peek()) else `val`
        minStack.push(minVal)
    }

    fun pop() {
        minStack.pop()
        stack.pop()
    }

    fun top(): Int = stack.peek()

    fun getMin(): Int = minStack.peek()
}
