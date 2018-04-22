/**
 * указываем на то, что класс принадлежит пакету 
 */
package main1;

/**
 *импортируем класс для запуска формы из потока очереди 
 */
import java.awt.EventQueue;
/**
 * импортируем класс, который рассчитывает объем памяти для юридических лиц
 */
import Calc.korporateCalc;  
/**
 *Импортируем класс для создания фрейма 
 */
import javax.swing.JFrame; 
/**
 *Импортируем класс для создания панели 
 */
import javax.swing.JPanel; 
/**
 *Импортируем класс для создания пустой рамки, которая позволяет создать отступы вокруг панели 
 */
import javax.swing.border.EmptyBorder; 
/**
 *Импортируем класс для текстового поля с возможностью переносить строку 
 */
import javax.swing.JTextArea; 
/**
 * Импортируем класс для произвольного текста 
 */
import javax.swing.JLabel; 
/**
 * Импортируем класс для  текстового поля 
 */
import javax.swing.JTextField; 
/**
 * Импортируем класс для отображения данных в виде списка 
 */
import javax.swing.JList; 
/**
 * Импортируем класс выпадающего списка 
 */
import javax.swing.JComboBox;
/**
 * Импортируем класс для обработки кнопки
 */
import javax.swing.AbstractButton;
/**
 *Импортируем класс значения по умолчанию для выпадающего списка 
 */
import javax.swing.DefaultComboBoxModel;
/**
 * Импортируем класс для чек-бокса 
 */
import javax.swing.JRadioButton; 
/**
 * Импортируем класс для кнопки 
 */
import javax.swing.JButton; 
/**
 * Импортируем класс шрифтов 
 */
import java.awt.Font; 
/**
 * Импортируем класс для обработки нажатий на кнопки 
 */
import java.awt.event.ActionListener; 
/**
 * Импортируем класс для обработки событий 
 */
import java.awt.event.ActionEvent; 
/**
 * Импортируем класс текстовых полей 
 */
import java.awt.TextField; 
/**
 * Импортируем класс текстовых панелей 
 */
import javax.swing.JTextPane; 
/**
 * Импортируем класс кнопок 
 */
import java.awt.Button; 
/**
 * Импортируем класс задания цвета 
 */
import java.awt.Color; 
/**
 * Импортируем класс задания системного цвета 
 */
import java.awt.SystemColor; 
/**
 * импортируем класс с константой 
 */
import javax.swing.SwingConstants; 
/**
 * импортируем класс форматированных полей 
 */
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;  

public class korporate extends JFrame {
/**
 * задаём переменную для считывания данных 
 */
	private JTextField textField; 
/**
 * задаём переменную для считывания данных 
 */
	private JTextField textField_1; 
	private JTextField textField_3;
	private JButton button_1;
	private JLabel label;
	public JCheckBox checkBox;
/**
 * переменная для длительности разговоров по умолчанию
 */
		public int tt=12;
	
    	public korporate(int vis) {
/**
 * задаём заголовок для фрейма 
 */
		setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0430\u0443\u0434\u0438\u043E\u0444\u0430\u0439\u043B\u043E\u0432 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u043E\u0432 ");
/**
 * указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм 
 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
/**
 * указываем координаты 
 */
		setBounds(100, 100, 966, 572);
/**
 *  устанавливаем менеджер компоновки 
 */
		getContentPane().setLayout(null);  
		
/**
 * задаём текст 
 */
		JButton btnNewButton_1 = new JButton("Ok"); 
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
/**
 *Выход из текущего окна 
 */
        		setVisible(false); 
			}
		});
/**
 * указываем координаты 
 */
			btnNewButton_1.setBounds(410, 453, 89, 34);
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(btnNewButton_1);
		
/**
 * создаём выпадающий список 
 */
		final JComboBox comboBox = new JComboBox();  
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * Задаём возможность изменять его пользователю 
 */
		comboBox.setEditable(true); 
/**
 * Задаём варианты для выпадающего списка 
 */
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"G.711 (\u041C\u044E-\u043A\u043E\u0434\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435)", "G.711 (\u0410-\u043A\u043E\u0434\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435)", "PCMGSM 0610", "GSM 0610"})); 
/**
 * Задаём координаты 
 */
		comboBox.setBounds(231, 84, 256, 23); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(comboBox);
		
/**
 * создаём тесктовую панель 
 */
		JTextPane textPane_4 = new JTextPane(); 
		textPane_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * Задаём текст 
 */
		textPane_4.setText("\u0412\u0440\u0435\u043C\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0444\u0430\u0439\u043B\u043E\u0432 (\u0434\u043D\u0435\u0439)"); 
/**
 * Устанавливаем цвет 
 */
		textPane_4.setBackground(SystemColor.menu); 
/**
 * Задаём координаты 
 */
		textPane_4.setBounds(20, 183, 202, 56); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane_4);
/**
 * создаём тесктовую панель 
 */
		JTextPane textPane_6 = new JTextPane(); 
		textPane_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * задаём текст 
 */
		textPane_6.setText("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u043B\u0438\u043D\u0438\u0439"); 
/**
 * задаём цвет 
 */
		textPane_6.setBackground(SystemColor.menu); 
/**
 * Задаём координаты 
 */
		textPane_6.setBounds(20, 265, 202, 56); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane_6); 
/**
 * создаём тесктовую панель 
 */
		JTextPane textPane_7 = new JTextPane(); 
/**
 * задаём текст 
 */
		textPane_7.setText("\u041D\u0435\u043E\u0431\u0445\u043E\u0434\u0438\u043C\u044B\u0439 \u0440\u0430\u0437\u043C\u0435\u0440 \u043C\u0435\u0441\u0442\u0430 \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F"); 
/**
 * задаём шрифт для текста 
 */
		textPane_7.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
/**
 * задаём цвет 
 */
		textPane_7.setBackground(SystemColor.menu); 
/**
 * Задаём координаты 
 */
		textPane_7.setBounds(20, 384, 292, 34); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane_7); 
		
/**
 * создаём поле для вывода результата 
 */
		final JFormattedTextField formattedTextField = new JFormattedTextField(); 
formattedTextField.addKeyListener(new KeyAdapter() {
	@Override
	public void keyTyped(KeyEvent e) {
	}
});
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * запрещаем его редактирование 
 */
		formattedTextField.setEditable(false);
/**
 * Задаём координаты 
 */
		formattedTextField.setBounds(364, 384, 100, 34); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(formattedTextField); 
		
/**
 * создаём тесктовую панель 
 */
		JTextPane textPane_8 = new JTextPane(); 
/**
 * задаём текст 
 */
		textPane_8.setText("\u0413\u0411");
/**
 * задаём шрифт для текста 
 */
		textPane_8.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
/**
 * задаём цвет 
 */
		textPane_8.setBackground(SystemColor.menu); 
/**
 * Задаём координаты 
 */
		textPane_8.setBounds(507, 384, 75, 34); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane_8); 
/**
 * задаём текст 
 */
		JButton button = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
/**
 *	Иницилизируем переменную для хранения коэффициента компрессии	 
 */
				double f = 0;
		
/**
 *	Иницилизируем переменную для количества телефонных линий 
 */
				int k = 0;
/**
 *	Иницилизируем переменную для времени хранения дней 
 */
				int d = 0;		
/**
 *	Иницилизируем переменную для расчтёа итогового результата 
 */
				double V = 0;						
/**
 * Считываем режим компрессии
 */
				int Format = comboBox.getSelectedIndex();
/**
 * В зависимости от режима компрессии определяем коэффициент сжатия 
 */
				switch(Format){ 
/**
 * Если выбран первый формат сжатия то присваиваем следующий коэффициент 
 */
				case 0: f = 27.5; break;
/**
 * Если выбран второй формат сжатия то присваиваем следующий коэффициент 
 */
				case 1: f = 27.5; break; 
/**
 * Если выбран третий формат сжатия то присваиваем следующий коэффициент 
 */
				case 2: f = 55; break;
/**
 * Если выбран четвёртое формат сжатия то присваиваем следующий коэффициент 
 */
				case 3: f = 5.6; break; 
			};
/**
 * задаём переменную для количества телефонных линий 
 */
				k = Integer.parseInt(textField_1.getText());
/**
 * задаём переменную для времени хранения дней 
 */
				d = Integer.parseInt(textField.getText());
				if (tt!=12) {	
				tt = Integer.parseInt(textField_3.getText());
				};				 
				int t=tt;
			
/**
 * вызываем метод расчёта объёма памяти 
 */
				korporateCalc cc = new korporateCalc();
/**
 * выводим результат в текстовое поле и обращаемся к методу для расчёта памяти 
 */
				formattedTextField.setText("" + cc.getP(t, k, d, f));  
			}
		});
/**
 * Задаём координаты кнопки
 */
		button.setBounds(354, 328, 172, 34); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(button);
		
/**
 * создаём текстовое поле для ввода данных 
 */
		textField = new JTextField(); 
		textField.addKeyListener(new KeyAdapter() {
			@Override
/**	
 * Разрешение ввода цифр
 */
		public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar(); 
/**
 *переменной 'c' передается символ типа char, связанный с нажатой клавишей
 */
		if ( ((c < '0') || (c > '9'))) { //если не цифры от 0 до 9
/**
 * событие расходуется , чтобы оно не обрабатывалось по умолчанию источником, который его инициировал. 
 * Таким образом достигается запрет на ввод недопустимых значений
 */
			e.consume(); 
			}

			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * Задаём координаты 
 */
		textField.setBounds(231, 205, 59, 34);
/**
 * задаём количество символов 
 */
		getContentPane().add(textField); 
/**
 * Добавляем на нашу панель 
 */
		textField.setColumns(10);
/**
 * создаём текстовое поле для ввода данных 
 */
		textField_1 = new JTextField(); 
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar(); 
/**
 *переменной 'c' передается символ типа char, связанный с нажатой клавишей
 */
						if ( ((c < '0') || (c > '9'))) { //если не цифры от 0 до 9
/**
 * событие расходуется , чтобы оно не обрабатывалось по умолчанию источником, который его инициировал. 
 * Таким образом достигается запрет на ввод недопустимых значений
 */
							e.consume(); 
							}
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * задаём количество символов 
 */
		textField_1.setColumns(10);  
/**
 *  Задаём координаты 
 */
		textField_1.setBounds(231, 287, 59, 34); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textField_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0430\u0443\u0434\u0438\u043E\u0444\u0430\u0439\u043B\u043E\u0432 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u043E\u0432 \u0434\u043B\u044F \u044E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0445 \u043B\u0438\u0446");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(47, 13, 749, 43);
		getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("\u0420\u0435\u0436\u0438\u043C \u043A\u043E\u043C\u043F\u0440\u0435\u0441\u0441\u0438\u0438");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(20, 73, 180, 34);
		getContentPane().add(textPane_1);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("\u0414\u043B\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0441\u0442\u044C \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u0430 (\u0447)");
		textPane_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane_5.setBackground(SystemColor.menu);
		textPane_5.setBounds(20, 120, 164, 56);
		getContentPane().add(textPane_5);
		
		JCheckBox checkBox = new JCheckBox("\u043F\u043E \u0443\u043C\u043E\u043B\u0447\u0430\u043D\u0438\u044E");
		checkBox.setSelected(true);
		
		
		checkBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
					if (checkBox.isSelected()) {
					 label.setVisible(false);
					 textField_3.setVisible(false);
					 tt=12;
								}
				else
				{
				label.setVisible(true);
				textField_3.setVisible(true);
				tt=0;
/**
 * задаём переменную для длительности разговора
 */
     };		
			}
		});	
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		checkBox.setBounds(231, 151, 164, 25);
		getContentPane().add(checkBox);		
		
		label = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435\r\n \u0434\u043B\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0441\u0442\u044C \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u0430");
		label.setVisible(false);
textField_3 = new JTextField();
textField_3.addKeyListener(new KeyAdapter() {
	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar(); 
/**
 *переменной 'c' передается символ типа char, связанный с нажатой клавишей
 */
				if ( ((c < '0') || (c > '9'))) { //если не цифры от 0 до 9
/**
 * событие расходуется , чтобы оно не обрабатывалось по умолчанию источником, который его инициировал. 
 * Таким образом достигается запрет на ввод недопустимых значений
 */
					e.consume(); 
					}
	}
});
textField_3.setVisible(false);
		
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(737, 148, 48, 28);
		getContentPane().add(textField_3);
		
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(413, 153, 312, 23);
		getContentPane().add(label);
	
		button_1 = new JButton("\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E");
		button_1.setVisible(false);
/**
 * если параметр, переданный в physhical равен 1, то кнопка Юридическое лицо становится видимой   
 */
		if (vis == 1) { 
			//Смена видимости в physhical
			   button_1.setVisible(true);
			}
			button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
/**
 * скрываем форму для юридических клиентов
 */	
				setVisible(false);
/**
 * открываем окно для физических лиц
 */
				physhical nc = new physhical(1); 
/**
 * задаём видимость формы
 */
				nc.setVisible(true); 
			}
		});
/**
 * Задаём координаты кнопки
 */
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBounds(737, 436, 183, 71);
		getContentPane().add(button_1);
	}
}
