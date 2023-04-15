import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class QuizCardPlayer {
    private JButton nextButton;
    private boolean isShowAnswer;
    private JTextArea answer;
    private JTextArea display;
    private ArrayList<QuizCard> cardList;
    private int currentCardIndex;
    private QuizCard currentCard;

    private JFrame frame;
    public void go(){
     frame = new JFrame("Quiz Card Player");
     JPanel mainPanel = new JPanel();
     Font bigFont = new Font("sanserif", Font.BOLD,24);

    }
    class  NextCardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    class OpenMenuListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    private void loadFile(File file){

    }
    private void makeCard(String lineToParse){

    }
}
