package project;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class Delete extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Delete() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setText("工号/姓名");
		textField.setColumns(10);
		panel.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"请选择", "工号", "性别"}));
		panel.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("开始删除");
		panel.add(btnNewButton_1);
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u59D3\u540D", "\u59D3\u540D", "\u5DE5\u53F7", "\u7535\u8BDD\u53F7\u7801"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);

	}

}
