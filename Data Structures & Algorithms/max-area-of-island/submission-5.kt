import kotlin.math.min

class Solution {
    fun findIslandArea(
        grid: Array<IntArray>,
        row: Int,
        column: Int,
        rows: Int,
        columns: Int,
    ): Int {
        if(
            min(row, column) < 0
            || row >= rows 
            || column >= columns
        ) {
            return 0
        }

        if(grid[row][column] == 1) {
            var count = 1
            grid[row][column] = 0

            count += findIslandArea(grid, row, column + 1, rows, columns) 
            count += findIslandArea(grid, row, column - 1, rows, columns) 
            count += findIslandArea(grid, row + 1, column, rows, columns) 
            count += findIslandArea(grid, row - 1, column, rows, columns) 

            return count
        }

        return 0
    }

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
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
                )
                if(area > maxArea) maxArea = area
            }
        }

        return maxArea
    }
}


