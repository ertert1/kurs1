/**
 * указывает на то, что класс принадлежит пакету 
 */
package main1; 
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
 * Импортируем класс с формой об ошибке
 */
import main1.error; 
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
 * Импортируем класс-слушатель для передачи информации о событии
 */
import java.awt.event.ActionListener; 
/**
 * Импортируем класс для обработки нажатий на кнопки
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
 * Импортируем класс задания системного цвета
 */
import java.awt.SystemColor; 
/**
 * Импортируем класс панели
 */
import javax.swing.JEditorPane; 
/**
 * Импортируем класс задания цвета
 */
import java.awt.Color; 
/**
 * импортируем класс форматированных полей
 */
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent; 

public class registration extends JFrame {
	private JFormattedTextField formattedTextField;
/**
 * создаём метод, который будет запускаться
 */
	public static void main(String[] args) { 
/**
 * запускаем форму из очереди потоков
 */
		EventQueue.invokeLater(new Runnable() { 
/**
 * запуск
 */
			public void run() {
					try {
/**
 * создаём переменную для формы регистрации
 */
					registration frame = new registration(); 
/**
 * задаём видимость для фрейма
 */
					frame.setVisible(true); 
/**
 * указание на исключение
 */
				} catch (Exception e) { 
/**
 * отображает трассировку стека
 */
					e.printStackTrace(); 
				}
			}
		});
	}

/**
 * Create the frame.
 */
	public registration () {
/**
 * задаём заголовок для фрейма
 */
		setTitle("\u041E\u043A\u043D\u043E \u0430\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u0438 \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F");
/**
 * указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм
 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
/**
 * задаём координаты и размеры панели. В данном случае координаты: 100 по Х и 100 по У координаты самой левой верхней точки компонента; 450 пикселей - ширина 273 высота
 */
		setBounds(100, 100, 588, 411);  
/**
 *  устанавливаем менеджер компоновки
 */
		getContentPane().setLayout(null);
/**
 * создаём выпадающий список 
 */
				final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * Задаём варианты для выпадающего списка 
 */
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u0410\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440", "\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E", "\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E"})); 
/**
 * Задаём координаты 
 */
				comboBox.setBounds(253, 84, 212, 30); 
/**
 * Добавляем на нашу панель 
 */
				getContentPane().add(comboBox);
formattedTextField = new JFormattedTextField(); 
formattedTextField.addKeyListener(new KeyAdapter() {
	@Override
	
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar(); 
/**
 *переменной 'c' передается символ типа char, связанный с нажатой клавишей
 */
				if ( (c < '0') || (c > '9')) { //если не цифры от 0 до 9
/**
 * событие расходуется , чтобы оно не обрабатывалось по умолчанию источником, который его инициировал. 
 * Таким образом достигается запрет на ввод недопустимых значений
 */
					e.consume(); 
					}
	}
});
		formattedTextField.setFont(new Font("Tahoma", Font.BOLD, 20));
/**
 * Задаём координаты
 */
		formattedTextField.setBounds(253, 201, 192, 34); 
/**
 * Добавляем на нашу панель
 */
		getContentPane().add(formattedTextField); 
/**
 * создаём кнопку для авторизации (Вход)
 */
		JButton btnNewButton_1 = new JButton("\u0412\u0445\u043E\u0434"); 
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
/**
 * Задаём координаты
 */
		btnNewButton_1.setBounds(100, 295, 114, 36); 
/**
 * Добавляем на нашу панель
 */
		getContentPane().add(btnNewButton_1);
/**
 * обработка события по кнопке
 */
		btnNewButton_1.addActionListener(new ActionListener() { 
		
			public void actionPerformed(ActionEvent e) {
/**
 * задаём переменную для пароля
 */
 			int P; 
/**
 * 	считываем пароль
 */
				P=Integer.parseInt(formattedTextField.getText());	
/**
 * Считываем модель авторизации 
 */
				int model = comboBox.getSelectedIndex(); 
/**
 * если выбран администратор и пароль 0, то открывается форма для физических лиц
 */
				if ((model==0) && (P==0)) {
/**
 * 
 */					
					physhical nc = new physhical(1); 
/**
 * задаём видимость формы
 */
					nc.setVisible(true); 
	                                     }
				else
/**
 * если выбраны физичсекие лица и пароль 1, то открывается форма для физических лиц с парметром 0 
 */
					if ((model==1) && (P==1)) {
						physhical nc = new physhical(0);
/**
 * задаём видимость формы
 */
						nc.setVisible(true); 
/**
 * скрываем кнопку Юридические лица на форме Расчет объема памяти для хранения аудиофайлов телефонных разговоров для физических лиц
 */
}
				else
/**
* если выбраны юридические лица и пароль 2, то открывается форма для физических лиц
*/
					if ((model==2) && (P==2)) {
						korporate nc = new korporate(0); 
/**
* задаём видимость формы
*/
						nc.setVisible(true); 
					}
					else {
/**
* если логин пароль неверные, то выдаём сообщение об ошибке
*/
							error bc = new error(); 
/**
* задаём видимость
*/							
							bc.setVisible(true);  
							}			
						}			
					});

		
		JLabel lblNewLabel = new JLabel("\u0412\u044B\u0431\u0435\u0440\u0438\u0442\u0435 \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(100, 13, 263, 48);
		getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\u041B\u043E\u0433\u0438\u043D");
		textPane.setFont(new Font("Tahoma", Font.BOLD, 20));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(30, 84, 101, 30);
		getContentPane().add(textPane);
		
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("\u041F\u0430\u0440\u043E\u043B\u044C");
		textPane_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setBounds(34, 199, 101, 36);
		getContentPane().add(textPane_2);
		
		JButton button = new JButton("\u0412\u044B\u0445\u043E\u0434");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(337, 297, 114, 34);
		getContentPane().add(button);
	}
}
