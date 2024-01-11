import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Syntax Analyzer");

        JLabel currentFileName = new JLabel("Currnet File : ");
        currentFileName.setBounds(100,70,350,30);
        frame.add(currentFileName);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(35,120,470,320);
        textArea.setEditable(false);
        frame.add(textArea);

        JTextPane errorArea = new JTextPane();
        errorArea.setBounds(35,120,470,330);
        errorArea.setEditable(false);
        frame.add(errorArea);

        appendToPane(errorArea, "flow", Color.RED);

        JButton button = new JButton("Select A Text File");
        button.setBounds(150,30,250,30);
        button.addActionListener(e -> {
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            jfc.setFileFilter(filter);

            int returnValue = jfc.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jfc.getSelectedFile();
                currentFileName.setText("Currnet File : " + selectedFile.getAbsolutePath());
                try {
                    PrintStream p = new PrintStream("temp.txt");
                    System.setErr(p);
                    CharStream stream = CharStreams.fromFileName(selectedFile.getAbsolutePath());
                    
                    Phase3Lexer lexer = new Phase3Lexer(stream);
                    CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
                    Phase3Parser parser = new Phase3Parser(commonTokenStream);
                    parser.setBuildParseTree(true);
                    RuleContext ruleContext = parser.pogram();
                    Trees.inspect(ruleContext,parser);

                    StringBuilder stringBuilder = new StringBuilder();

                    textArea.setText(stringBuilder.toString());
                    p.close();
                    StringBuilder errorBuilder = new StringBuilder();
                    try {
                        File myObj = new File("temp.txt");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            errorBuilder.append(data).append("\n");
                        }
                        myReader.close();
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    errorArea.setText(errorBuilder.toString());
                    Files.deleteIfExists(Paths.get("temp.txt"));

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        frame.add(button);

        frame.setSize(550,520);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setName("Java Swing Application");
    }

    private static void appendToPane(JTextPane tp, String msg, Color c)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }
}
