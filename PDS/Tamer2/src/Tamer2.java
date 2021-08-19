import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Tamer2 implements ActionListener 
{
	// Inicialização de Variáveis
	JFrame frame = new JFrame("IMC");
	
	JLabel lbl1 = new JLabel("Altura (cm)");
	JTextField TextAltura = new JTextField(4);
	
	JLabel lbl2 = new JLabel("Peso (kg)");
	JTextField TextPeso = new JTextField(4);
	
	JButton button1 = new JButton("Calcular");
	//*
	
	// Imagens
	ImageIcon fig = new ImageIcon("Img/imc1.jpg");
	JLabel saida = new JLabel(fig);
	
	ImageIcon figMuitoAbaixo = new ImageIcon("Img/01.jpg");
	JLabel saidaMuitoAbaixo = new JLabel(figMuitoAbaixo);
	
	ImageIcon figAbaixo = new ImageIcon("Img/02.jpg");
	JLabel saidaAbaixo = new JLabel(figAbaixo);
	
	ImageIcon figNormal = new ImageIcon("Img/03.jpg");
	JLabel saidaNormal = new JLabel(figNormal);
	
	ImageIcon figAcima = new ImageIcon("Img/04.jpg");
	JLabel saidaAcima = new JLabel(figAcima);
	
	ImageIcon figObesidade1 = new ImageIcon("Img/05.jpg");
	JLabel saidaObesidade1 = new JLabel(figObesidade1);
	
	ImageIcon figObesidade2 = new ImageIcon("Img/06.jpg");
	JLabel saidaObesidade2 = new JLabel(figObesidade2);
	
	ImageIcon figObesidade3 = new ImageIcon("Img/07.jpg");
	JLabel saidaObesidade3 = new JLabel(figObesidade3);
	//*
	
	//	Label de aviso
	JLabel lblErro = new JLabel("Digite todos os Valores!");
	//*
	
	public Tamer2() 
	{
		// Montando o Frame inicial
		frame.setVisible(true);
		frame.setSize(350, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		frame.add(lbl1);
		frame.add(TextAltura);
		
		frame.add(lbl2);
		frame.add(TextPeso);
		
		frame.add(button1);
		button1.addActionListener(this);
		
		frame.add(saida);
		//*
	}
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run() 
			{
				new Tamer2();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// Pegando resposta do click
		String response = e.getActionCommand();
		
		if(response == "Calcular")
		{
			System.out.println("Calculando...");
			Calcular();
			frame.repaint();
			frame.validate();
			System.out.println("Calculado.");
		}
		//*
	}

	private void Calcular() {
		
		// Pegando a exceção
		try {
			
			// Transformando o texto dos TextFields em valor numérico 
			int altura = Integer.parseInt(TextAltura.getText());
			double peso = Double.parseDouble(TextPeso.getText());
			//*
			
			//	Fazendo o Caluculo de IMC
			double pesoCorreto = peso * 10000;
			double valor = pesoCorreto/(altura*altura);
			System.out.println("Valor: " + valor);
			//*
			
			//	Verificando o valor
			if(valor >= 40) {
				System.out.println("Obesidade 3!");
				LimparSaida();
				frame.add(saidaObesidade3);
				frame.setSize(350, 400);
				
			}else if(valor >= 35 && valor <= 39.99){
				System.out.println("Obesidade 2!");
				LimparSaida();
				frame.add(saidaObesidade2);
				frame.setSize(350, 400);
				
			}else if(valor >= 30 && valor <= 34.99) {
				System.out.println("Obesidade 1!");
				LimparSaida();
				frame.add(saidaObesidade1);
				frame.setSize(350, 400);
				
			}else if(valor >= 25 && valor <= 29.99){
				System.out.println("Acima!");
				LimparSaida();
				frame.add(saidaAcima);
				frame.setSize(350, 400);
				
			}else if(valor >= 18.5 && valor <= 24.99){
				System.out.println("Normal!");
				LimparSaida();
				frame.add(saidaNormal);
				frame.setSize(350, 400);
				
			}else if(valor >= 17 && valor <= 18.49){
				System.out.println("Abaixo!");
				LimparSaida();
				frame.add(saidaAbaixo);
				frame.setSize(350, 400);
				
			}else{
				System.out.println("Muito Abaixo!");
				LimparSaida();
				frame.add(saidaMuitoAbaixo);
				frame.setSize(350, 400);
			}
			//*
			
		// Tratando a exceção
		}catch(Exception e) {
			System.out.println("Digite todos os valores");
			System.out.println(e.getMessage());
			LimparSaida();
			frame.add(lblErro);
		}
		
	}

	private void LimparSaida() {
	// Limpando as saidas e as labels auto preenchidas
		frame.remove(saida);
		frame.remove(saidaMuitoAbaixo);
		frame.remove(saidaAbaixo);
		frame.remove(saidaNormal);
		frame.remove(saidaAcima);
		frame.remove(saidaObesidade1);
		frame.remove(saidaObesidade2);
		frame.remove(saidaObesidade3);
		
		frame.remove(lblErro);
		frame.setSize(350, 310);
		}
}
