class Solution {
    fun isValid(s: String): Boolean {
        val map = hashMapOf(')' to '(', ']' to '[', '}' to '{')
        val stack = mutableListOf<Char>()

        for(i in 0 until s.length) {
            if(map.values.contains(s[i])) {
               stack.add(s[i])
            } else if(stack.isEmpty().not()) {
                if(map[s[i]] != stack.last()) return false
                stack.removeLast()
            } else return false
        }

        return stack.isEmpty()
    }
}
