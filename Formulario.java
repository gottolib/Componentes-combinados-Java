import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener{
	
JLabel l1,l2,l3;
JLabel lnumero,lsorteo,lresultado;
JButton bsube,bbaja,bsorteo;
JButton salir;

Formulario()
{
	setLayout(null);
	setBackground(new Color(255,255,0));
	l1 = new JLabel("Seleccion de numero");
	l1.setBounds(10,100,150,30);
    lnumero = new JLabel("1");
    lnumero.setBounds(10,150,100,30);
    lnumero.setBackground(Color.red);
    bsube=new JButton("^");
    bsube.setBounds(130,130,50,30);
    bbaja=new JButton("v");
    bbaja.setBounds(130,170,50,30);
    bsorteo = new JButton("Sortear");
    bsorteo.setBounds(300,130,150,30);
    l2 = new JLabel("Numero sorteado: ");
    l2.setBounds(230,170,150,30);
    lsorteo = new JLabel("");
    lsorteo.setBackground(Color.red);
    lsorteo.setBounds(410,170,80,30);
    l3=new JLabel ("¿Acerto?");
    l3.setBounds(300,230,80,30);
    lresultado= new JLabel("");
    lresultado.setBounds(410,230,80,30);
    lresultado.setBackground(Color.green);
    salir = new JButton("Salir");
    salir.setBounds(10,230,100,30);
    bsube.addActionListener(this);
    bbaja.addActionListener(this);
    bsorteo.addActionListener(this);
    salir.addActionListener(this);
    add(l1);
    add(l2);
    add(l3);
    add(bsube);
    add(bbaja);
    add(bsorteo);
    add(lsorteo);
    add(lresultado);
    add(lnumero);
    add(salir);
}

public void actionPerformed (ActionEvent e)
{
	if (bsube==e.getSource())
	{
		int x;
		x=Integer.parseInt(lnumero.getText());
		x++;
		if(x<=10)
			lnumero.setText(String.valueOf(x));
	}
	if(bbaja==e.getSource())
	{
		int x;
		x=Integer.parseInt(lnumero.getText());
		x--;
		if (x>=1)
			lnumero.setText(String.valueOf(x));
	}
	if(bsorteo==e.getSource())
	{
		int ale;
		ale =1+(int)(Math.random()*10);
		lsorteo.setText(String.valueOf(ale));
		if(ale==Integer.parseInt(lnumero.getText()))
				
				lresultado.setText("Si");
		else
			lresultado.setText("No");
				}
	if(salir==e.getSource())
	{
		System.exit(0);
	}
	
}
public static void main (String[]args)
{
	Formulario formulario1 = new Formulario();
	formulario1.setBounds(0,0,540,320);
	formulario1.setVisible(true);
}
}
