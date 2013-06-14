import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.geom.Line2D;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;


public class DemoMenu extends Ventana implements ActionListener{
	
	private JMenuBar menuBar;
	private JMenu fileMenu,editMenu,colorMenu;
	private JMenuItem newItem,openItem,closetItem,saveItem,saveAsItem,printItem;
	private JRadioButtonMenuItem lineItem, rectangleItem,circleItem,curveItem,textItem;
	private JCheckBoxMenuItem redItem,yellowItem,greenItem,blueItem;
	
	
	public DemoMenu(){
		menuBar=new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu fileMenu=new JMenu("Archivo");
		
		newItem=fileMenu.add("Nuevo");
		newItem.addActionListener(this);
		
		openItem=fileMenu.add("Abrir");
		openItem.addActionListener(this);
		
		closetItem=fileMenu.add("Cerrar");
		closetItem.addActionListener(this);
		
		fileMenu.addSeparator();
		
		saveItem=fileMenu.add("Guardar");
		saveItem.addActionListener(this);
		
		saveAsItem=fileMenu.add("Guardar como...");
		saveAsItem.addActionListener(this);
		
		fileMenu.addSeparator();
		
		printItem=fileMenu.add("Imprimir");
		printItem.addActionListener(this);
		
		fileMenu.setMnemonic('A');
		
		newItem.setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.CTRL_DOWN_MASK));
		openItem.setAccelerator(KeyStroke.getKeyStroke('C',InputEvent.CTRL_DOWN_MASK));
		
		editMenu=new JMenu("Editar");
		editMenu.add(lineItem=new JRadioButtonMenuItem("Linea",true));
		lineItem.addActionListener(this);
		editMenu.add(rectangleItem=new JRadioButtonMenuItem("Rectangulo",true));
		rectangleItem.addActionListener(this);
		editMenu.add(circleItem=new JRadioButtonMenuItem("Circulo",true));
		circleItem.addActionListener(this);
		editMenu.add(curveItem=new JRadioButtonMenuItem("Curva",true));
		curveItem.addActionListener(this);
		
		editMenu.setMnemonic('B');
		
		
		ButtonGroup types=new ButtonGroup();
		types.add(lineItem);
		types.add(rectangleItem);
		types.add(circleItem);
		types.add(curveItem);
		
		editMenu.addSeparator();
		
		colorMenu=new JMenu("Color");
		editMenu.add(colorMenu);
		
		colorMenu.add(redItem=new JCheckBoxMenuItem("Rojo",false));
		redItem.addActionListener(this);
		colorMenu.add(yellowItem=new JCheckBoxMenuItem("Amarillo",false));
		yellowItem.addActionListener(this);
		colorMenu.add(greenItem=new JCheckBoxMenuItem("Verde",false));
		greenItem.addActionListener(this);
		colorMenu.add(blueItem=new JCheckBoxMenuItem("Azul",false));
		blueItem.addActionListener(this);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.print(e.getActionCommand());
	}

}
