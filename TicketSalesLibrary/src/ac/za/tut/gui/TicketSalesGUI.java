package ac.za.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TicketSalesGUI extends JFrame{
    
    //Panel
    private JPanel headingPnl;
    
    private JPanel custPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    
    private JPanel ticketPnl;
    private JPanel homeTePnl;
    private JPanel awayTeamPnl;
    private JPanel costTeamPnl;
    private JPanel numberPnl;
    private JPanel totalPnl;
    
    private JPanel btnPnl;
     private JPanel mainPnl;
    
    //Label
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel homeLbl;
    private JLabel awayLbl;
    private JLabel costpriceLbl;
    private JLabel numberLbl;
    private JLabel totalLbl;
    
    //fields
    private JTextField nameTxt;
    private JTextField surnameTxt;
    private JTextField homeTxt;
    private JTextField awayTxt;
    private JTextField costTxt;
    
    private JTextField totalTxt;
    
    //slider
    private JSlider numbeSlider;
    
    //Button
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
    public TicketSalesGUI()
    {
        setTitle("Ticket sales");
        setSize(700, 750);
        setResizable(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD+Font.ITALIC, 40));
        
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setFocusable(true);
        headingPnl.add(headingLbl);
        add(headingPnl,BorderLayout.NORTH);
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nameLbl = new JLabel("Name : ");
        nameTxt = new JTextField(20);
        namePnl.add(nameLbl);
        namePnl.add(nameTxt);
        
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnameLbl = new JLabel("Name : ");
        surnameTxt = new JTextField(20);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxt);
        
        custPnl = new JPanel(new GridLayout(2, 1, 1, 1));
        custPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2),"Customer details"));
        custPnl.add(namePnl);
        custPnl.add(surnamePnl);
        //add(custPnl);/*ad to main frame**************************************/
        
        homeTePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        homeLbl = new JLabel("Home team : ");
        homeTxt = new JTextField(20);
        homeTePnl.add(homeLbl);
        homeTePnl.add(homeTxt);
        
        awayTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayLbl = new JLabel("Away team : ");
        awayTxt = new JTextField(20);
        awayTeamPnl.add(awayLbl);
        awayTeamPnl.add(awayTxt);
        
        costTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        costpriceLbl = new JLabel("Cost price : R");
        costTxt = new JTextField(20);
        costTeamPnl.add(costpriceLbl);
        costTeamPnl.add(costTxt);
        
        numberPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numberLbl = new JLabel("Number of tikects required : ");
        numbeSlider = new JSlider(0, 100, 0);
        numberPnl.add(numberLbl);
        numberPnl.add(numbeSlider);
        
        totalPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalLbl = new JLabel("Total amount due : R ");
        totalTxt = new JTextField(20);
        totalTxt.setEditable(false);
        totalTxt.setText("To be calculated later. ");
        totalPnl.add(totalLbl);
        totalPnl.add(totalTxt);
        
        ticketPnl = new JPanel(new GridLayout(5, 1, 1, 1));
        ticketPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2),"Ticket details"));
        ticketPnl.add(homeTePnl);
        ticketPnl.add(awayTeamPnl);
        ticketPnl.add(costTeamPnl);
        ticketPnl.add(numberPnl);
        ticketPnl.add(totalPnl);
        
        btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buyBtn = new JButton("BUY");
        clearBtn = new JButton("CLEAR");
        exitBtn = new JButton("EXIT");
        
        btnPnl.add(buyBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        mainPnl = new JPanel(new BorderLayout());
        mainPnl.add(custPnl,BorderLayout.NORTH);
        mainPnl.add(ticketPnl,BorderLayout.CENTER);
        mainPnl.add(btnPnl,BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
    }
    
}
