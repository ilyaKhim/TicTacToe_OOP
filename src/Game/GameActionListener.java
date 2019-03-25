package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameActionListener implements ActionListener {
    private int row;
    private int cell;
    private GameButton button;

    public GameActionListener(int row, int cell, GameButton gameButton){
        this.row = row;
        this.cell = cell;
        this.button = gameButton;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
