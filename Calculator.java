import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame
   {
	private JTextField calculatorField;
	public JButton one,two,three,four,five,six,
	seven,eight,nine,zero,add,sub,multiply,div,equals,
	factorial,square,root,point,pi,exp,modulas,reset,inverse,mode,
	sin,cos,tan,log,brace1,brace2,power,ln,minus,percentage,close;
	private String number1,number2,sanswer;
	private double answer=0.0;
	private JPanel calculatePanel;
	private boolean equalsClicked=false,option=false;
	char operation =' ';
	char p;
	char k;
	
	
	public Calculator()
	{
		super(" Calculator ");
		calculatorField=new JTextField(null,34);
		Dimension dim1= new Dimension(25,34);
		
		calculatorField.setPreferredSize(dim1);
        calculatorField.setEditable(true);
		factorial=new JButton("!");
		factorial.setBackground(Color.WHITE);
		inverse=new JButton("x^-1");
		inverse.setBackground(Color.WHITE);
		mode=new JButton("[x]");
		mode.setBackground(Color.WHITE);
		pi=new JButton("π");pi.setBackground(Color.WHITE);
		sin=new JButton("sin"); sin.setBackground(Color.WHITE);
		cos=new JButton("cos"); cos.setBackground(Color.WHITE);
		tan=new JButton("tan"); tan.setBackground(Color.WHITE);
		modulas=new JButton("Rem"); modulas.setBackground(Color.WHITE);
		log=new JButton("log"); log.setBackground(Color.WHITE);
		ln=new JButton("ln"); ln.setBackground(Color.WHITE);
		power=new JButton("x^y"); power.setBackground(Color.WHITE);
		square=new JButton(" x2"); square.setBackground(Color.WHITE);
		brace1=new JButton("("); brace1.setBackground(Color.WHITE);
		brace2=new JButton(")"); brace2.setBackground(Color.WHITE);
		reset=new JButton("AC"); reset.setBackground(Color.RED);
		seven=new JButton("7"); seven.setBackground(Color.YELLOW);
		eight=new JButton("8"); eight.setBackground(Color.YELLOW);
		nine=new JButton("9"); nine.setBackground(Color.YELLOW);
		multiply=new JButton("*"); multiply.setBackground(Color.GRAY);
		exp=new JButton("e"); exp.setBackground(Color.WHITE);
		div=new JButton("÷"); div.setBackground(Color.GRAY);
		four=new JButton("4"); four.setBackground(Color.YELLOW);
		five=new JButton("5"); five.setBackground(Color.YELLOW);
		six=new JButton("6"); six.setBackground(Color.YELLOW);
		add=new JButton("+"); add.setBackground(Color.GRAY);
		one=new JButton("1"); one.setBackground(Color.YELLOW);
		two=new JButton("2"); two.setBackground(Color.YELLOW);
		three=new JButton("3"); three.setBackground(Color.YELLOW);
		zero=new JButton("0"); zero.setBackground(Color.YELLOW);
		point=new JButton("."); point.setBackground(Color.YELLOW);
		root=new JButton("√"); root.setBackground(Color.WHITE);
		equals=new JButton("="); equals.setBackground(Color.YELLOW);
		sub=new JButton("-"); sub.setBackground(Color.GRAY);
		minus=new JButton("+/-"); minus.setBackground(Color.WHITE);
		percentage=new JButton("%"); percentage.setBackground(Color.WHITE);
		close=new JButton("OFF"); close.setBackground(Color.RED);
		
		Dimension dim= new Dimension(90,50);
		one.setPreferredSize(dim);two.setPreferredSize(dim);three.setPreferredSize(dim);four.setPreferredSize(dim);
		five.setPreferredSize(dim);six.setPreferredSize(dim);seven.setPreferredSize(dim);eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);zero.setPreferredSize(dim);add.setPreferredSize(new Dimension (dim));sub.setPreferredSize(new Dimension (dim));
		multiply.setPreferredSize(new Dimension (dim));div.setPreferredSize(new Dimension (dim));equals.setPreferredSize(dim);
		factorial.setPreferredSize(dim);square.setPreferredSize(dim);root.setPreferredSize(dim);pi.setPreferredSize(dim);
		modulas.setPreferredSize(dim);reset.setPreferredSize(dim);inverse.setPreferredSize(dim);mode.setPreferredSize(dim);
		sin.setPreferredSize(dim);cos.setPreferredSize(dim);tan.setPreferredSize(dim);log.setPreferredSize(dim);point.setPreferredSize(dim);
		brace1.setPreferredSize(dim);brace2.setPreferredSize(dim);power.setPreferredSize(dim);ln.setPreferredSize(dim);minus.setPreferredSize(dim);
		percentage.setPreferredSize(dim); close.setPreferredSize(dim); exp.setPreferredSize(dim);
		Numbers no= new Numbers();
		calc c= new calc();
		one.addActionListener(no); two.addActionListener(no); three.addActionListener(no); four.addActionListener(no); five.addActionListener(no);
		six.addActionListener(no);seven.addActionListener(no);eight.addActionListener(no);nine.addActionListener(no);zero.addActionListener(no);
		add.addActionListener(c);sub.addActionListener(c);multiply.addActionListener(c);div.addActionListener(c);equals.addActionListener(c);
		reset.addActionListener(c);
		pi.addActionListener(no);
		exp.addActionListener(no);
		modulas.addActionListener(c);
		root.addActionListener(c);
		square.addActionListener(c);
		power.addActionListener(c);
		factorial.addActionListener(c);
		log.addActionListener(c);
		sin.addActionListener(c);
		cos.addActionListener(c);
		tan.addActionListener(c);
		brace1.addActionListener(no);
		brace2.addActionListener(no);
	    point.addActionListener(no);
	    inverse.addActionListener(c);
	    mode.addActionListener(c);
	    minus.addActionListener(no);
	    close.addActionListener(c);
	    percentage.addActionListener(c);
	    
	    
		
		calculatePanel=new JPanel();
		calculatePanel.setBackground(Color.BLUE);

		calculatePanel.setLayout(new FlowLayout());
	
		calculatePanel.add(calculatorField,BorderLayout.NORTH);
		calculatePanel.add(power);calculatePanel.add(ln);calculatePanel.add(exp);
		
		calculatePanel.add(inverse);
		calculatePanel.add(mode);
		calculatePanel.add(factorial);
		calculatePanel.add(brace1);calculatePanel.add(brace2);calculatePanel.add(sin);
		calculatePanel.add(cos);calculatePanel.add(tan);
		calculatePanel.add(minus);
		
		calculatePanel.add(modulas);calculatePanel.add(percentage);
		calculatePanel.add(log);calculatePanel.add(root);calculatePanel.add(pi);
		calculatePanel.add(square);calculatePanel.add(reset);calculatePanel.add(close);
        calculatePanel.add(div);calculatePanel.add(seven);calculatePanel.add(eight);calculatePanel.add(nine);
		calculatePanel.add(multiply);calculatePanel.add(four);calculatePanel.add(five);calculatePanel.add(six);
		
		calculatePanel.add(sub);
		calculatePanel.add(one);
		calculatePanel.add(two);
		calculatePanel.add(three);
		calculatePanel.add(add);
		calculatePanel.add(zero);
		
		calculatePanel.add(point);
		
		
		calculatePanel.add(equals);
		
		
		
		add(calculatePanel);
		
		
	}
	private class Numbers implements ActionListener     //inner class
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton button=(JButton) e.getSource();
			
			if(button.equals(one))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="1";
					}else{
						number1=number1+"1";
					}
				}else
					{
						if(number2==null)
						{
							number2="1";
						}else{
							number2=number2+"1";
						}
						
					}
				
			}
			if(button.equals(two))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="2";
					}else{
						number1=number1+"2";
					}
				}else
					{
						if(number2==null)
						{
							number2="2";
						}else{
							number2=number2+"2";
						}
						
					}
				
			}
			if(button.equals(three))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="3";
					}else{
						number1=number1+"3";
					}
				}else
					{
						if(number2==null)
						{
							number2="3";
						}else{
							number2=number2+"3";
						}
						
					}
				
			}
			if(button.equals(four))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="4";
					}else{
						number1=number1+"4";
					}
				}else
					{
						if(number2==null)
						{
							number2="4";
						}else{
							number2=number2+"4";
						}
						
					}
				
			}
			if(button.equals(five))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="5";
					}else{
						number1=number1+"5";
					}
				}else
					{
						if(number2==null)
						{
							number2="5";
						}else{
							number2=number2+"5";
						}
						
					}
				
			}
			if(button.equals(six))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="6";
					}else{
						number1=number1+"6";
					}
				}else
					{
						if(number2==null)
						{
							number2="6";
						}else{
							number2=number2+"6";
						}
						
					}
				
			}
			if(button.equals(seven))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="7";
					}else{
						number1=number1+"7";
					}
				}else
					{
						if(number2==null)
						{
							number2="7";
						}else{
							number2=number2+"7";
						}
						
					}
				
			}
			if(button.equals(eight))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="8";
					}else{
						number1=number1+"8";
					}
				}else
					{
						if(number2==null)
						{
							number2="8";
						}else{
							number2=number2+"8";
						}
						
					}
				
			}
			if(button.equals(nine))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="9";
					}else{
						number1=number1+"9";
					}
				}else
					{
						if(number2==null)
						{
							number2="9";
						}else{
							number2=number2+"9";
						}
						
					}
				
			}
			if(button.equals(zero))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="0";
					}else{
						number1=number1+"0";
					}
				}else
					{
						if(number2==null)
						{
							number2="0";
						}else{
							number2=number2+"0";
						}
						
					}
				
			}
			if(button.equals(point))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1=".";
					}else{
						number1=number1+".";
					}
				}else
					{
						if(number2==null)
						{
							number2=".";
						}else{
							number2=number2+".";
						}
						
					}
				
			}
			if(button.equals(brace1))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="(";
					}else{
						number1=number1+"(";
					}
				}else
					{
						if(number2==null)
						{
							number2="(";
						}else{
							number2=number2+"(";
						}
						
					}
				
			}
			if(button.equals(brace2))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1=")";
					}else{
						number1=number1+")";
					}
				}else
					{
						if(number2==null)
						{
							number2=")";
						}else{
							number2=number2+")";
						}
						
					}
				
			}
			if(button.equals(pi))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="3.14";
						
					}else{
						number1=number1+"3.14";
						
					}
				}else
					{
						if(number2==null)
						{
							number2="3.14";
							
						}else{
							number2=number2+"3.14";
		
						}
						
					}
				
			}
			if(button.equals(exp))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="2.71";
						
					}else{
						number1=number1+"2.71";
						
					}
				}else
					{
						if(number2==null)
						{
							number2="2.71";
							
						}else{
							number2=number2+"2.71";
		
						}
						
					}
				
			}
			if(button.equals(minus))
			{
				if(option==false)
				{
					if(number1==null)
					{
						number1="-";
						
					}else{
						number1=number1+"-";
						
					}
				}else
					{
						if(number2==null)
						{
							number2="-";
							
						}else{
							number2=number2+"-";
		
						}
						
					}
				
			}
			
			
			

			
				if(equalsClicked==false)
				{
					if(option==false)
					{
						calculatorField.setText(number1);
					}
					else
					{
						calculatorField.setText(number2);
						
					}
				}
		}
	}
		private class calc implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton button= (JButton) e.getSource();
				
				
				
				if(button.equals(add))
				
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null && number2==null)
					{
						option=true;
						operation ='+';
						
					}else
						if(number1!=null&& number2!=null)
						{
						
							option=true;
							operation ='+';
						}
					
				}
				if(button.equals(sub))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null && number2==null)
					{
						option=true;
						operation ='-';
						
					}else
						if(number1!=null&& number2!=null)
						{
							//System.out.println(" Two operations only ");
							option=true;
							operation ='-';
						}
					
				}
				if(button.equals(multiply))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null && number2==null)
					{
						option=true;
						operation ='*';
						
					}else
						if(number1!=null&& number2!=null)
						{
							//System.out.println(" Two operations only ");
							option=true;
							operation ='*';
						}
					
				}
				if(button.equals(div))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null && number2==null)
					{
						option=true;
						operation ='÷';
						
					}else
						if(number1!=null&& number2!=null)
						{
							//System.out.println(" Two operations only ");
							option=true;
							operation ='÷';
						}
					
				}
				if(button.equals(modulas))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null && number2==null)
					{
						option=true;
						operation ='%';
						
					}else
						if(number1!=null&& number2!=null)
						{
							//System.out.println(" Two operations only ");
							option=true;
							operation ='%';
						}
					
				}
				if(button.equals(root))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null)
					{
						option=true;
						operation ='√';
					
							    double d1=0.0;
							    d1=Double.parseDouble(number1);
							    switch (operation)
							    {
								case'√':
								answer=Math.sqrt(d1);
								break;
								
								
								
				               }
				             sanswer=Double.toString(answer);
							  calculatorField.setText(sanswer);
						
					}
					
				}
				if(button.equals(square))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null)
					{
						option=true;
						
							    double d1=0.0;
							    d1=Double.parseDouble(number1);
								answer= d1*d1;
	
								
								

				             
				             sanswer=Double.toString(answer);
							 calculatorField.setText(sanswer);
						
					}
					
				}
				if(button.equals(factorial))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null)
					{
						option=true;
						operation ='!';
					
							    double d1=1.0;
							    d1=Double.parseDouble(number1);
							    double answer=1.0;
							    while(d1>0)
							    {
							        answer=answer*d1;
							        d1--;
							        
							    }
							        
							    
							    
							    
					
					
								
				
				               
				              sanswer=Double.toString(answer);
							  calculatorField.setText(sanswer);
						
					}
					
				}
				if(button.equals(log))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null)
					{
						//option=true;
						
					
							    double d1;
							    d1=Double.parseDouble(number1);
							    answer=Math.log(d1);
							        
							    
							        
				               
				              sanswer=Double.toString(answer);
							  calculatorField.setText(sanswer);
						
					}
					
				}
				if(button.equals(sin))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null)
					{
						//option=true;
						
					
							    double d1=0;
							    d1=Double.parseDouble(number1);
							    answer=Math.sin(d1);
							        
							    
							        
				               
				              sanswer=Double.toString(answer);
							  calculatorField.setText(sanswer);
						
					}
					
				}
				if(button.equals(cos))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null)
					{
						//option=true;
						
					
							    double d1;
							    d1=Double.parseDouble(number1);
							    answer=Math.cos(d1);
							        
							    
							        
				               
				              sanswer=Double.toString(answer);
							  calculatorField.setText(sanswer);
						
					}
					
				}
				if(button.equals(tan))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null)
					{
						//option=true;
						
					
							    double d1;
							    d1=Double.parseDouble(number1);
							    answer=Math.tan(d1);
							        
							    
							        
				               
				              sanswer=Double.toString(answer);
							  calculatorField.setText(sanswer);
						
					}
					
				}
				if(button.equals(power))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null && number2==null)
					{
						option=true;
						operation ='p';
						
						
						
					}else
						if(number1!=null&& number2!=null)
						{
					
							option=true;

							operation ='p';
					    
						}
					
				}
				if(button.equals(inverse))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null)
					{
						double d1;
						d1=Double.parseDouble(number1);
						answer=1/d1;
						
						sanswer=Double.toString(answer);
					    calculatorField.setText(sanswer);
						
					
						}
					
				}
				if(button.equals(mode))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null)
					{
						double d1;
						d1=Double.parseDouble(number1);
						if(d1<0)
						{ 
						    answer=-1*d1;
						  }
						  else
						  answer=d1;
						
						sanswer=Double.toString(answer);
					    calculatorField.setText(sanswer);
						
					
						}
					
				}
				if(button.equals(percentage))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}else
					
					if(number1!=null && number2==null)
					{
						option=true;
						operation ='k';
						
					}else
						if(number1!=null&& number2!=null)
						{
							//System.out.println(" Two operations only ");
							option=true;
							operation ='k';
						}
					
				}
				if(button.equals(close))
				{
					
					{
						System.exit(0);
					}
					
				}
				
				
				
				
					
				
				if(button.equals(equals))
				{
					if(number1==null)
					{
						System.out.println(" Enter Number Ist ");
					}
	
	              
					
					if(number1!=null && number2==null)
					{
					  
					        
				   
						System.out.println(" Enter both Numbers ");
					}
							
							if(number1!=null && number2!=null)
							{
								double d1=0.0,d2=0.0;
								d1=Double.parseDouble(number1);
								d2=Double.parseDouble(number2);
								switch (operation){
								case '+':
									answer=d1+d2;
									break;
								case '-':
									answer=d1-d2;
								    break;
								case '*':
								answer=d1*d2;
								break;
								case '÷':
									answer=d1/d2;
									break;
								case '%':
								    answer=d1%d2;
								    break;
								case 'p':
								answer=Math.pow(d1,d2);
								break;
								case 'k':
								answer=(d1*100)/d2;
								break;
								
								   
							    
								
								
								}
								
								sanswer=Double.toString(answer);
								calculatorField.setText(sanswer);
								if(operation=='÷'&& d2==0.0)
								{
									calculatorField.setText(" Divide by Zero Error ");
								}
									
								
							}
							
							    
							 }
							 if(button.equals(reset))
						{
						    number1=null;
						    number2=null;
						    equalsClicked=false;
						    operation=' ';
						    calculatorField.setText("");
						    
						    
						   
						    
						  }
							
						}
						
					}
					
				
				}
				
