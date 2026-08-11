import kotlin.math.min

class Solution {
    fun findIslandArea(
        grid: Array<IntArray>,
        row: Int,
        column: Int,
        rows: Int,
        columns: Int,
        visited: HashSet<Pair<Int, Int>>
    ): Int {
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

            count += findIslandArea(grid, row, column + 1, rows, columns, visited) 
            count += findIslandArea(grid, row, column - 1, rows, columns, visited) 
            count += findIslandArea(grid, row + 1, column, rows, columns, visited) 
            count += findIslandArea(grid, row - 1, column, rows, columns, visited) 

            return count
        }

        return 0
    }

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val visited = HashSet<Pair<Int,Int>>()
        var maxArea = 0
        val rows = grid.size
        val columns = grid[0].size

        grid.forEachIndexed { rowIndex, row ->
            row.forEachIndexed { columnIndex, column ->
                val area = findIslandArea(
                    grid, 
                    rowIndex, 
                    columnIndex, 
                    rows,
                    columns,
                    visited
                )
                if(area > maxArea) maxArea = area
            }
        }

        return maxArea
    }
}


