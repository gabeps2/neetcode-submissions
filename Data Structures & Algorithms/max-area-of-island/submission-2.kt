import kotlin.math.min

class Solution {

    //DFS

    fun findIslandArea(
        grid: Array<IntArray>,
        row: Int,
        column: Int,
        visited: HashSet<Pair<Int, Int>>
    ): Int {
        val rows = grid.size
        val columns = grid[0].size
        
        if(
            min(row, column) < 0
            || row >= rows 
            || column >= columns
            || row to column in visited
        ) {
            return 0
        }

        if(grid[row][column] == 1) {
            var count = 1
            visited.add(row to column)

            //if(row > 2 && row < 6 && column > 7 && column < 11) {
             //   println("Grid value: ${grid[row][column]}")
            //}

            count += findIslandArea(grid, row, column + 1, visited) 
            count += findIslandArea(grid, row, column - 1, visited) 
            count += findIslandArea(grid, row + 1, column, visited) 
            count += findIslandArea(grid, row - 1, column, visited) 

            println("Count: $count")
            return count
        }

        return 0
    }

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val visited = HashSet<Pair<Int,Int>>()
        var maxArea = 0

        grid.forEachIndexed { rowIndex, row ->
            row.forEachIndexed { columnIndex, column ->
                val area = findIslandArea(grid, rowIndex, columnIndex, visited)
                if(area > maxArea) maxArea = area
            }
        }

        return maxArea
    }
}


