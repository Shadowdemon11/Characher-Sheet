import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import java.awt.event.ActionEvent;

public class CharacterGui {

	private JFrame frame;
	private JTextField nameTF;
	public JTextField strengthTF;
	public JTextField DexterityTF;
	public JTextField constitutionTF;
	public JTextField intelligenceTF;
	public JTextField wisdomTF;
	public JTextField charismaTF;
	public JButton btnSaveCharacter;
	public int strengthINT = 0;
	public int dexterityINT = 0;
	public int ConstitutionINT = 0;
	public int intelligenceINT = 0;
	public int wisdomINT = 0;
	public int charismaINT = 0;
	//Characher createdChar = new Characher();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharacterGui window = new CharacterGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CharacterGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public int changeString(String num) {
		int result = Integer.parseInt(num); 
		return result;
	}
	public void saveToFile(String json) {
	    JFileChooser fileChooser = new JFileChooser();
	    int retval = fileChooser.showSaveDialog(btnSaveCharacter);
	    if (retval == JFileChooser.APPROVE_OPTION) {
	      File file = fileChooser.getSelectedFile();
	      if (file == null) {
	        return;
	      }
	      if (!file.getName().toLowerCase().endsWith(".txt")) {
	        file = new File(file.getParentFile(), file.getName() + ".txt");
	      }
	      try {
	    	  FileWriter file2 = new FileWriter(file);
	    	  file2.write(json);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    }
	  }

	private void initialize() {
		Characher createdChar = new Characher();
		frame = new JFrame();
		frame.setBounds(100, 100, 660, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(191, 8, 61, 26);
		panel.add(lblNewLabel);
		
		nameTF = new JTextField();
		nameTF.setBounds(257, 5, 186, 32);
		panel.add(nameTF);
		nameTF.setColumns(10);
		String[] gender = { "M", "F"};
		String[] Race = { "Dwarves", "Elves", "Gnomes", "Half-elves", "Half-orcs","Halflings","Humans" };
		String[] charclass = { "Barbarian", "Bard", "Cleric", "Druid", "Fighter","Monk","Paladin","Ranger","Rogue","Sorcerer","Wizard" };
		JComboBox raceCB = new JComboBox(Race);
		raceCB.setBounds(257, 88, 206, 32);
		panel.add(raceCB);
		
		JLabel lblRace = new JLabel("Race:");
		lblRace.setBounds(160, 91, 92, 26);
		panel.add(lblRace);
		
		JLabel lblCharacterClass = new JLabel("Character Class:");
		lblCharacterClass.setBounds(59, 153, 193, 26);
		panel.add(lblCharacterClass);
		
		JComboBox charClassCB = new JComboBox(charclass);
		charClassCB.setBounds(257, 150, 206, 32);
		panel.add(charClassCB);
		
		JLabel lblGenger = new JLabel("Gender:");
		lblGenger.setBounds(160, 44, 92, 26);
		panel.add(lblGenger);
		
		JComboBox gendercomboBox = new JComboBox(gender);
		gendercomboBox.setBounds(257, 41, 66, 32);
		panel.add(gendercomboBox);
		
		//int strengthINT = 0;
		JLabel lblStrength = new JLabel("Strength:");
		lblStrength.setBounds(160, 206, 92, 26);
		panel.add(lblStrength);
		
		strengthTF = new JTextField();
		strengthTF.setBounds(257, 203, 186, 32);
		panel.add(strengthTF);
		strengthTF.setColumns(10);
		
		//int dexterityINT = 0;
		JLabel lblNewLabel_1 = new JLabel("Dexterity:");
		lblNewLabel_1.setBounds(160, 253, 92, 26);
		panel.add(lblNewLabel_1);
		
		DexterityTF = new JTextField();
		DexterityTF.setBounds(257, 250, 186, 32);
		panel.add(DexterityTF);
		DexterityTF.setColumns(10);
		
		//int ConstitutionINT = 0;
		JLabel lblConstitution = new JLabel("Constitution:");
		lblConstitution.setBounds(134, 300, 118, 26);
		panel.add(lblConstitution);
		
		constitutionTF = new JTextField();
		constitutionTF.setBounds(257, 297, 186, 32);
		panel.add(constitutionTF);
		constitutionTF.setColumns(10);
		
		//int intelligenceINT = 0;
		JLabel lblIntelligence = new JLabel("Intelligence:");
		lblIntelligence.setBounds(134, 340, 118, 26);
		panel.add(lblIntelligence);
		
		intelligenceTF = new JTextField();
		intelligenceTF.setBounds(257, 337, 186, 32);
		panel.add(intelligenceTF);
		intelligenceTF.setColumns(10);
		
		//int wisdomINT = 0;
		JLabel lblWisdom = new JLabel("Wisdom:");
		lblWisdom.setBounds(171, 383, 81, 26);
		panel.add(lblWisdom);
		
		wisdomTF = new JTextField();
		wisdomTF.setBounds(257, 380, 186, 32);
		panel.add(wisdomTF);
		wisdomTF.setColumns(10);
		
		//int charismaINT = 0;
		JLabel lblCharisma = new JLabel("Charisma:");
		lblCharisma.setBounds(158, 420, 94, 26);
		panel.add(lblCharisma);
		
		charismaTF = new JTextField();
		charismaTF.setBounds(257, 417, 186, 32);
		panel.add(charismaTF);
		charismaTF.setColumns(10);
		int max = 6;
		int min = 1;
		JButton btnRollDice = new JButton("Roll dice");
		btnRollDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rand = new Random();
				strengthINT = rand.nextInt( max - min + 1) + min;
				dexterityINT = rand.nextInt( max - min + 1) + min;
				ConstitutionINT = rand.nextInt( max - min + 1) + min;
				intelligenceINT = rand.nextInt( max - min + 1) + min;
				wisdomINT = rand.nextInt( max - min + 1) + min;
				charismaINT = rand.nextInt( max - min + 1) + min;
				strengthTF.setText(Integer.toString(strengthINT));
				DexterityTF.setText(Integer.toString(dexterityINT));
				constitutionTF.setText(Integer.toString(ConstitutionINT));
				intelligenceTF.setText(Integer.toString(intelligenceINT));
				wisdomTF.setText(Integer.toString(wisdomINT));
				charismaTF.setText(Integer.toString(charismaINT));
				
			}
		});
		btnRollDice.setBounds(464, 296, 141, 35);
		panel.add(btnRollDice);
		
		btnSaveCharacter = new JButton("Save Character");
		btnSaveCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Characher createdChar = new Characher();
				createdChar.addStats(changeString(strengthTF.getText()), changeString(DexterityTF.getText()), changeString(constitutionTF.getText()), changeString(intelligenceTF.getText()), changeString(wisdomTF.getText()),changeString(charismaTF.getText()));
				String test = raceCB.getSelectedItem().toString();
				System.out.println(test);
				createdChar.addName(nameTF.getText(),gendercomboBox.getSelectedItem().toString());
				createdChar.raceChoose(raceCB.getSelectedItem().toString());
				createdChar.classChoose(charClassCB.getSelectedItem().toString());
				Gson json = new Gson();
				GsonBuilder builder = new GsonBuilder(); 
			    builder.setPrettyPrinting(); 
			      
			    Gson gson = builder.create();
			    String jsonString = json.toJson(createdChar);
			    System.out.println(jsonString);
			    saveToFile(jsonString);
			}
		});
		btnSaveCharacter.setBounds(399, 468, 206, 35);
		panel.add(btnSaveCharacter);
	}
}
