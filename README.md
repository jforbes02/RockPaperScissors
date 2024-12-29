Simple Rock-Paper-Scissors game implemented in Java. The game allows a user to play against the computer, which randomly selects Rock, Paper, or Scissors. The program determines the winner based on standard game rules set by a HashMap and displays the result.

## Code Overview

The core functionality is implemented in `RockPaperScissors.java`. The main steps are:

1. **Player Input**: The program prompts the user to enter their choice of the amount of rounds they want to play, and their move(rock, paper, or scissors).
2. **Computer Choice**: The program generates a random choice for the computer.
3. **Game Logic**: The winner is determined using the rules of Rock-Paper-Scissors.

## How to Run

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/jforbes02/RockPaperScissors.git
   cd RockPaperScissors/RockPaperScissors/src
   ```

2. **Compile the Java Program**:

   ```bash
   javac RockPaperScissors.java
   ```

3. **Run the Program**:

   ```bash
   java RockPaperScissors
   ```

4. **Play the Game**:

   - When prompted, enter your choice: `rock`, `paper`, or `scissors`.
   - The computer will randomly select its choice.
   - The result (win, lose, or tie) will be displayed.
  
  ## Future Enhancements

- **Score Tracking**: Implement a feature to keep track of the player's wins, losses, and ties.
- **Graphical User Interface (GUI)**: Develop a GUI for a more interactive experience.
- **Multiplayer Support**: Allow two players to play against each other.


