
import kotlin.math.min

class Solution {
    fun findIsland(
        grid: Array<CharArray>,
        row: Int,
        column: Int,
        visited: HashSet<Pair<Int, Int>>
    ): Int {
        val rows = grid.size
        val columns = grid[0].size

        if (
            row >= rows || column >= columns 
        || min(row, column) < 0
        || row to column in visited
        ) {
            return 0
        }

        if (grid[row][column] == '1') {
            visited.add(row to column)

            findIsland(grid, row + 1, column, visited)
            findIsland(grid, row - 1, column, visited)
            findIsland(grid, row, column + 1, visited)
            findIsland(grid, row, column - 1, visited)

            return 1
        }

        return 0
    }

    fun numIslands(grid: Array<CharArray>): Int {
        val visited = HashSet<Pair<Int, Int>>()
        var islands = 0

        grid.forEachIndexed { rowIndex, row ->
            row.forEachIndexed { columnIndex, column ->
                islands += findIsland(grid, rowIndex, columnIndex, visited)
            }
        }
        
        return islands
    }
}
