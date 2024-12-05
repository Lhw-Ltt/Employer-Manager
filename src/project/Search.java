package project;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Search extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Search() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"请选择", "工号", "姓名"}));
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("开始查询");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		FlowLayout f=(FlowLayout)panel.getLayout();//水平间距
		f.setHgap(60);//水平间距
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u59D3\u540D", "\u6027\u522B", "\u5DE5\u53F7", "\u7535\u8BDD\u53F7\u7801"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(170);
		table.getColumnModel().getColumn(3).setPreferredWidth(225);
		table.setPreferredScrollableViewportSize(new Dimension(800,700));
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.SOUTH);
		
		
		scrollPane.add(table.getTableHeader());
        
	}
}
