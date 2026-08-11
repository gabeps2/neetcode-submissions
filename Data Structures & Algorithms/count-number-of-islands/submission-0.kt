import kotlin.math.min

class Solution {

    //DFS

    fun findIsland(
        grid: Array<CharArray>,
        column: Int,
        row: Int,
        visited: HashMap<Pair<Int, Int>, Unit>
    ): Int {
        val rows = grid.size
        val columns = grid[0].size


        if (min(row, column) < 0 
        || column == columns
        || row == rows
        || visited[row to column] != null
        ) {
            // println("Ignored $row, $column")
            // println("$rows, $columns")
            return 0
        }

        if(grid[row][column] == '1') {
            visited.put(row to column, Unit)
            // println("Visited $row, $column")

            findIsland(grid, column + 1, row, visited)
            findIsland(grid, column - 1, row, visited)
            findIsland(grid, column, row + 1, visited)
            findIsland(grid, column, row - 1, visited)

            return 1
        }

        return 0
    }

    fun numIslands(grid: Array<CharArray>): Int {
        val visited = HashMap<Pair<Int, Int>, Unit>()
        var lands = 0

        grid.forEachIndexed { rowIndex, row ->
            row.forEachIndexed { columnIndex, column ->
                lands += findIsland(grid, columnIndex, rowIndex, visited)
            }
        }

        return lands
    }
}
