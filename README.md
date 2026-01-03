# N-Queens Problem

## Description

This project implements a solution to the classic N-Queens problem using backtracking in Java. The N-Queens problem is a combinatorial problem of placing N chess queens on an N×N chessboard so that no two queens threaten each other. Thus, a solution requires that no two queens share the same row, column, or diagonal.

The algorithm uses backtracking to explore all possible placements of queens on the board, ensuring that each placement is safe (no attacks) before proceeding to the next column.

## Features

- Solves the N-Queens problem for any given N
- Returns all possible solutions
- Uses backtracking for efficiency
- Visual representation of the board with 'Q' for queens and '.' for empty spaces

## How to Run

### Prerequisites

- Java Development Kit (JDK) installed on your system

### Compilation

Navigate to the project directory and compile the Java file:

```bash
javac NQueens.java
```

### Execution

Run the program:

```bash
java NQueens
```

By default, the program solves for N=4. To modify the value of N, edit the `main` method in `NQueens.java`.

## Example Output

For N=4, the program outputs the following solutions:

```
.Q..
...Q
Q...
..Q.

..Q.
Q...
...Q
.Q..
```

Each solution is represented as a grid where 'Q' denotes a queen and '.' denotes an empty square.

## Algorithm Explanation

1. **Initialization**: Create an empty N×N board filled with '.'.

2. **Backtracking Function**:
   - Try to place a queen in each row of the current column.
   - Check if the placement is safe (no attacks from existing queens).
   - If safe, place the queen and recurse to the next column.
   - If not safe, try the next row.
   - Backtrack by removing the queen if no placement works in a column.

3. **Safety Check**: The `isSafe` method checks:
   - Same column
   - Same row
   - Diagonals (both directions)

4. **Solution Collection**: When all columns are filled, save the board configuration.

## Complexity

- **Time Complexity**: O(N!) in the worst case, but typically much better due to pruning.
- **Space Complexity**: O(N^2) for the board, plus O(N) for recursion stack.


