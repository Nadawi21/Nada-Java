/*package src.oop.Sprint3.Övningsuppgifter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class FifteenPuzzle {import javax.swing.*; // Importing Swing components for GUI
import java.awt.; // Importing AWT components for layout
import java.awt.event.ActionEvent; // Importing ActionEvent for button clicks
import java.awt.event.ActionListener; // Importing ActionListener for handling events
import java.util.Collections; // Importing Collections for shuffling
import java.util.List; // Importing List interface
import java.util.ArrayList; // Importing ArrayList class

    public class FifteenPuzzle extends JFrame {
        private static final int SIZE = 4; // Define the size of the grid (4x4)
        private JButton[][] buttons = new JButton[SIZE][SIZE]; // 2D array to hold buttons
        private int[][] board = new int[SIZE][SIZE]; // 2D array to represent the board state
        private int emptyRow = SIZE - 1; // Track the row of the empty space
        private int emptyCol = SIZE - 1; // Track the column of the empty space

        public FifteenPuzzle() {
            setTitle("15-spel"); // Set the title of the window
            setSize(400, 400); // Set the size of the window
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
            setLayout(new GridLayout(SIZE, SIZE)); // Set layout to grid with SIZE x SIZE
            initializeBoard(); // Initialize the board with numbers
            shuffleBoard(); // Shuffle the board to start the game
            updateButtons(); // Update the button labels to match the board state
        }

        private void initializeBoard() {
            int num = 1; // Start numbering from 1
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (i == SIZE - 1 && j == SIZE - 1) {
                        board[i][j] = 0; // Set the last position as empty
                    } else {
                        board[i][j] = num++; // Assign numbers to the board
                    }
                    buttons[i][j] = new JButton(); // Create a new button
                    buttons[i][j].addActionListener(new ButtonClickListener(i, j)); // Add action listener
                    add(buttons[i][j]); // Add button to the frame
                }
            }
        }

        private void shuffleBoard() {
            List<Integer> numbers = new ArrayList<>(); // Create a list to hold numbers
            for (int i = 0; i < SIZE * SIZE - 1; i++) {
                numbers.add(i + 1); // Add numbers 1 to 15
            }
            Collections.shuffle(numbers); // Shuffle the numbers
            numbers.add(0); // Add the empty space (0)

            int index = 0; // Index to track position in the list
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    board[i][j] = numbers.get(index++); // Assign shuffled numbers to the board
                    if (board[i][j] == 0) {
                        emptyRow = i; // Update empty row position
                        emptyCol = j; // Update empty column position
                    }
                }
            }
        }

        private void updateButtons() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (board[i][j] == 0) {
                        buttons[i][j].setText(""); // Set empty space as blank
                    } else {
                        buttons[i][j].setText(String.valueOf(board[i][j])); // Set button text to number
                    }
                }
            }
        }

        private boolean isSolved() {
            int num = 1; // Start checking from 1
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (i == SIZE - 1 && j == SIZE - 1) {
                        return true; // If last position is reached, puzzle is solved
                    }
                    if (board[i][j] != num++) {
                        return false; // If any number is out of order, puzzle is not solved
                    }
                }
            }
            return true;
        }

        private class ButtonClickListener implements ActionListener {
            private int row; // Row of the button
            private int col; // Column of the button

            public ButtonClickListener(int row, int col) {
                this.row = row; // Initialize row
                this.col = col; // Initialize column
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if the clicked button is adjacent to the empty space
                if ((Math.abs(emptyRow - row) == 1 && emptyCol == col) ||
                        (Math.abs(emptyCol - col) == 1 && emptyRow == row)) {
                    board[emptyRow][emptyCol] = board[row][col]; // Move the number to the empty space
                    board[row][col] = 0; // Set the clicked button's position as empty
                    emptyRow = row; // Update empty row position
                    emptyCol = col; // Update empty column position
                    updateButtons(); // Refresh the button labels
                    if (isSolved()) {
                        JOptionPane.showMessageDialog(null, "Grattis, du vann!"); // Show win message
                    }
                }
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new FifteenPuzzle().setVisible(true); // Create and show the game window
            });
        }
    }
}
*/