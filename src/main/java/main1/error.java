/**
 * указываем на то, что класс принадлежит пакету 
 */
package main1;
/**
 * Импортируем класс для создания фрейма 
 */
import javax.swing.JFrame; 
/**
 * импортируем класс с формой авторизации 
 */
import main1.registration; 
/**
 * Импортируем класс для кнопки 
 */
import javax.swing.JButton; 
/**
 * Импортируем класс для обработки нажатий на кнопки 
 */
import java.awt.event.ActionListener; 
/**
 * Импортируем класс для обработки событий 
 */
import java.awt.event.ActionEvent; 
/**
 * Импортируем класс текстовых панелей 
 */
import javax.swing.JTextPane; 
/**
 * Импортируем класс задания системного цвета 
 */
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font; 

public class error extends JFrame {

	public error () {
/**
 * задаём заголовок для фрейма 
 */
		setTitle("\u041D\u0435\u0432\u0435\u0440\u043D\u0430\u044F \u0430\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F\r\n");
/**
 * указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм 
 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
/**
 * Задаём координаты 
 */
		setBounds(100, 100, 485, 265); 
/**
 *  устанавливаем менеджер компоновки 
 */
		getContentPane().setLayout(null);
/**
 * задаём текст 
 */
		JButton btnOk = new JButton("Ok");  
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnOk.addActionListener(new ActionListener() {
/**
 * создаём событие при нажатии на кнопку 
 */
			public void actionPerformed(ActionEvent e) { 
			
/**
 * открываем окно с авторизацией 
 */
				setVisible(false); 
				}
		});
/**
 * Задаём координаты 
 */
		btnOk.setBounds(190, 158, 78, 33); 
/**
 * Добавляем на нашу панель 
 */
		getContentPane().add(btnOk); 
		
		JLabel label = new JLabel("\u0412\u043D\u0438\u043C\u0430\u043D\u0438\u0435, \u043E\u0448\u0438\u0431\u043A\u0430! ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(122, 23, 200, 25);
		getContentPane().add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\u041F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044C \u0441 \u0443\u043A\u0430\u0437\u0430\u043D\u043D\u044B\u043C \u0412\u0430\u043C\u0438 \u043B\u043E\u0433\u0438\u043D\u043E\u043C/\u043F\u0430\u0440\u043E\u043B\u0435\u043C \u043D\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442!");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(65, 61, 315, 56);
		getContentPane().add(textPane);
	}
}
