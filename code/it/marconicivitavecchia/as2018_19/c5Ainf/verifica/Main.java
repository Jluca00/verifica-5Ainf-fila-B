
//package corretto
 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		
		super("SpeedTest");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>SpeedTest</h1>");

		// Create div for table
		sb.append("<div style='display:table'>");

		// create the first row
		sb.append("<div style='display:table-row'>");

		// create the date cell
		sb.append("<div style='display:table-cell'>");
		sb.append("<b>Date</b>");
		sb.append("</div>");
		// create the up(mbps) cell
		sb.append("<div style='display:table-cell'>");
		sb.append("<b>up(Mbps)</b>");
		sb.append("</div>");
		// create the down(mbps) cell
		sb.append("<div style='display:table-cell'>");
		sb.append("<b>down(Mbps)</b>");
		sb.append("</div>");

		// close first row
		sb.append("</div>");

		// create the second row
		sb.append("<div style='display:table-row'>");

		// create the Date cell
		sb.append("<div style='display:table-cell'>");
		sb.append("1/7/18");
		sb.append("</div>");
		// create the up(Mbps) cell
		sb.append("<div style='display:table-cell'>");
		sb.append("25.0");
		sb.append("</div>");
		// create the down(mbps) cell
		sb.append("<div style='display:table-cell'>");
		sb.append("28.9");
		sb.append("</div>");

		// close second row
		sb.append("</div>");

		// create the third row
		sb.append("<div style='display:table-row'>");

		// create the Date cell
		sb.append("<div style='display:table-cell'>");
		sb.append("7/9/18");
		sb.append("</div>");
		// create the up(Mbps) cell
		sb.append("<div style='display:table-cell'>");
		sb.append("24.6");
		sb.append("</div>");
		// create the down(mbps) cell
		sb.append("<div style='display:table-cell'>");
		sb.append("1.99");
		sb.append("</div>");

		// close third row
		sb.append("</div>");

		// close div for table
		sb.append("</div>");

		sb.append("</html>");

		String str = sb.toString();

		super.add(new JLabel(str));

		super.setSize(300,500);
		super.setVisible(true);

		System.out.println("Monolithics application from 5Ainf, TEST");
	}

	public static void main(String[] args) {
		Main test = new Main();
	}
}

