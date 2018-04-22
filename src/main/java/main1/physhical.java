/**
 * указываем на то, что класс принадлежит пакету 
 */
package main1;
/**
 * Импортируем класс, который разделяет окно на Южную,Западную, Северную, Восточную и Центральную области 
 */
import java.awt.BorderLayout; 
/**
 * импортируем класс для запуска формы из потока очереди 
 */
import java.awt.EventQueue; 
/**
 * Импортируем класс для создания фрейма 
 */
import javax.swing.JFrame; 
/**
 * Импортируем класс для создания панели 
 */
import javax.swing.JPanel; 
/**
 * Импортируем класс для создания пустой рамки, которая позволяет создать отступы вокруг панели 
 */
import javax.swing.border.EmptyBorder; 
/**
 * Импортируем класс для текстового поля с возможностью переносить строку 
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
 * Импортируем класс значения по умолчанию для выпадающего списка 
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
import Calc.physhicalCalc;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class physhical extends JFrame {
/**
 * задаём переменную для считывания данных 
 */
	private JTextField textField; 
/**
 * задаём переменную для считывания данных 
 */
	private JTextField textField_1; 
	public physhical(int vis) {
/**
 * задаём заголовок для фрейма 
 */
		setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0430\u0443\u0434\u0438\u043E\u0444\u0430\u0439\u043B\u043E\u0432 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u043E\u0432"); 
/**
 * указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм 
 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
/**
 * Задаём координаты 
 */
		setBounds(100, 100, 921, 586);  
/**
 *  устанавливаем менеджер компоновки 
 */
		getContentPane().setLayout(null);
		
/**
 * задаём текст 
 */
		JButton btnNewButton_1 = new JButton("Ok");  
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * создаём событие при нажатии на кнопку 
 */
		btnNewButton_1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
/**
 *Выход из текущего окна 
 */
				setVisible(false);
					}		
			});
/**
 * Задаём координаты 
 */
		btnNewButton_1.setBounds(401, 439, 89, 29); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(btnNewButton_1); 		
/**
 * создаём текстовую панель 
 */
		JTextPane textPane = new JTextPane(); 
/**
 * Задаём шрифт для текста 
 */
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
/**
 * Задаём цвет для текста 
 */
		textPane.setBackground(SystemColor.control);
/**
 * задаём текст 
 */
		textPane.setText("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0430\u0443\u0434\u0438\u043E\u0444\u0430\u0439\u043B\u043E\u0432 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u043E\u0432 \u0434\u043B\u044F \u0444\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u0438\u0445 \u043B\u0438\u0446");  
/**
 * Задаём координаты 
 */
		textPane.setBounds(10, 11, 867, 34); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane); 
/**
 * создаём текстовую панель 
 */
		JTextPane textPane_3 = new JTextPane(); 
		textPane_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * задаём текст 
 */
		textPane_3.setText("\u0412\u0440\u0435\u043C\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0444\u0430\u0439\u043B\u043E\u0432 (\u0434\u043D\u0435\u0439)");  
/**
 * задаём цвет 
 */
		textPane_3.setBackground(SystemColor.menu); 
/**
 * Задаём координаты 
 */
		textPane_3.setBounds(37, 157, 313, 49); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane_3); 
		
/**
 * создаём текстовую панель 
 */
		JTextPane textPane_4 = new JTextPane(); 
		textPane_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * задаём текст 
 */
		textPane_4.setText("\u0414\u043B\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0441\u0442\u044C \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u0430 (\u0447)"); 
/**
 * задаём цвет 
 */
		textPane_4.setBackground(SystemColor.menu); 
/**
 * Задаём координаты 
 */
		textPane_4.setBounds(37, 231, 265, 29); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane_4);
/**
 * создаём текстовую панель 
 */
		JTextPane textPane_7 = new JTextPane(); 
/**
 * задаём текст 
 */
		textPane_7.setText("\u041D\u0435\u043E\u0431\u0445\u043E\u0434\u0438\u043C\u044B\u0439 \u0440\u0430\u0437\u043C\u0435\u0440 \u043C\u0435\u0441\u0442\u0430 \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F");  
/**
 * Задаём шрифт для текста 
 */
		textPane_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * Задаём цвет для текста 
 */
		textPane_7.setBackground(SystemColor.menu);
/**
 * Задаём координаты 
 */
		textPane_7.setBounds(22, 368, 394, 30); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane_7); 
/**
 * создаём поле для вывода результата 
 */
		final JFormattedTextField formattedTextField = new JFormattedTextField(); 
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * запрещаем его редактирование 
 */
		formattedTextField.setEditable(false);
/**
 * Задаём координаты 
 */
		formattedTextField.setBounds(511, 368, 132, 30); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(formattedTextField); 
/**
 * создаём текстовую панель 
 */
		JTextPane textPane_8 = new JTextPane(); 
/**
 * задаём текст 
 */
		textPane_8.setText("\u0413\u0411");  
/**
 * Задаём шрифт для текста 
 */
		textPane_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * задаём цвет 
 */
		textPane_8.setBackground(SystemColor.menu); 
/**
 * Задаём координаты 
 */
		textPane_8.setBounds(701, 368, 76, 30); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane_8); 
/**
 * создаём текстовую панель 
 */
		JTextPane textPane_1 = new JTextPane(); 
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * задаём текст 
 */
		textPane_1.setText("\u0420\u0435\u0436\u0438\u043C \u043A\u043E\u043C\u043F\u0440\u0435\u0441\u0441\u0438\u0438");
/**
 * задаём цвет 
 */
		textPane_1.setBackground(SystemColor.menu);
/**
 * Задаём координаты 
 */
		textPane_1.setBounds(37, 86, 180, 49); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textPane_1); 
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
		comboBox.setBounds(378, 91, 265, 39); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(comboBox); 
/**
 * создаём текстовое поле для ввода данных 
 */
		textField = new JTextField(); 
		textField.addKeyListener(new KeyAdapter() {
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
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * Задаём координаты 
 */
		textField.setBounds(378, 162, 86, 29); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textField);
/**
 * задаём ширину поля 
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
 * Задаём координаты 
 */
		textField_1.setBounds(378, 231, 86, 29); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(textField_1);
/**
 * задаём текст 
 */
		JButton button = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");  
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
/**
 *	Иницилизируем переменную для коэффициента компрессии   
 */
				double m = 0;
/**
 *	Иницилизируем переменную для длительности разговора  
 */
				int t = 0;
/**
 *	Иницилизируем переменную для хранения дней 
 */
				int d = 0;
/**
 *	Иницилизируем переменную для расчтёа итогового результата 
 */
				double V = 0;
/**
 * Считываем модель режима копресии 
 */
				int model = comboBox.getSelectedIndex(); 
/**
 * В зависимости от режима компрессии определяем коэффициент сжатия  
 */
				switch(model){ 
/**
 * Если выбран первый формат сжатия то присваиваем следующий коэффициент
 */
				case 0: m = 27.5; break;
/**
 * Если выбран первый формат сжатия то присваиваем следующий коэффициент 
 */
				case 1: m = 27.5; break;
/**
 * Если выбран первый формат сжатия то присваиваем следующий коэффициент 
 */
				case 2: m = 55; break;
/**
 * Если выбран первый формат сжатия то присваиваем следующий коэффициент 
 */
				case 3: m = 5.6; break; 
			}
/**
 * задаём переменную для длительности разговора
 */
				t = Integer.parseInt(textField.getText()); 
/**
 * задаём переменную для времени хранения дней 
 */
				d = Integer.parseInt(textField_1.getText());
/**
 * указываем на метод расчёта объёма памяти 
 */
				physhicalCalc cc = new physhicalCalc();
				
/**
 * выводим результат в текстовое поле и обращаемся к методу для расчёта памяти 
 */
				formattedTextField.setText("" + cc.getK(t, d, m));  
					}
		});
/**
 *  Задаём координаты 
 */
		button.setBounds(315, 308, 181, 29);
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(button); 
		
		JButton button_1 = new JButton("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E");
		//button_1.setVisible(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
/**
 * скрываем форму для физических клиентов
 */	
				setVisible(false);
/**
 * открываем окно для юридических клиентов 
 */
				korporate nc = new korporate(1); 
/**
 * задаём видимость формы
 */
				nc.setVisible(true); 
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBounds(694, 439, 183, 71);
		getContentPane().add(button_1);
/**
 * если параметр, переданный в korporate равен 1, то кнопка Фидическое лицо становится видимой иначе скрытой
 */
		 if (vis == 1) { 
/**
 * Смена видимости кноки в physhical
 */
		  button_1.setVisible(true); 
		   }
		  else button_1.setVisible(false);
		
	}
}
