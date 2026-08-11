import kotlin.math.min

class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        var maxArea = 0
        val rows = grid.size
        val columns = grid[0].size

    fun findIslandArea(
        row: Int,
        column: Int,
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

                count += findIslandArea(row, column + 1) 
                count += findIslandArea(row, column - 1) 
                count += findIslandArea(row + 1, column) 
                count += findIslandArea(row - 1, column) 

                return count
            }

            return 0
        }

        grid.forEachIndexed { rowIndex, row ->
            row.forEachIndexed { columnIndex, column ->
                val area = findIslandArea(
                    rowIndex, 
                    columnIndex, 
                )
                if(area > maxArea) maxArea = area
            }
        }

        return maxArea
    }
}


