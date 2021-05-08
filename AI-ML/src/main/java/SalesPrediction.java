import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;

public class SalesPrediction {
	public static void main(String args[]) {
		System.out.println("Hello Welcome to the data Vizualization");
		try {
			Table superstore_data = Table.read()
					.csv("C:\\Users\\Sai Satya\\eclipse-workspace\\AI-ML\\src\\main\\java\\Sample - Superstore.csv");
			//System.out.println(superstore_data.shape());
			// System.out.println(superstore_data.first(7));
			// System.out.println(superstore_data.last(7));
			// System.out.println(superstore_data.structure());
			// System.out.println(superstore_data.summary());
			// System.out.println(superstore_data.inRange(20, 30));
			/*  Layout layout1 = Layout.builder().title("Distribution of Sales").build();
			  HistogramTrace trace1 =
			  HistogramTrace.builder(superstore_data.nCol("Sales")).build(); Plot.show(new
			  Figure(layout1, trace1));
	        */
			/*
			 Layout layout1 = Layout.builder().title("Distribution of Profits").build();
			  HistogramTrace trace1 =
			  HistogramTrace.builder(superstore_data.nCol("Profit")).build(); Plot.show(new
			  Figure(layout1, trace1));
			  */
			 /*Layout layout1 = Layout.builder().title("Distribution of Discounts").build();
			  HistogramTrace trace1 =
			  HistogramTrace.builder(superstore_data.nCol("Discount")).build(); Plot.show(new
			  Figure(layout1, trace1));
			  */
			/*
			  Layout layout2 = Layout.builder().title(" Income By Pep").build(); BoxTrace
			  trace2 = BoxTrace.builder(bank_data.categoricalColumn("pep"),
			  bank_data.nCol("income")).build(); Plot.show(new Figure(layout2, trace2));
			 */
			/*Figure fig = BubblePlot.create("Average Discount  for products by Quantity ",
					superstore_data,// table name
	                "Quantity",// x variable column name
	                "Discount",// y variable column name
	                "Quantity"// bubble size
	               );
			Plot.show(fig);*/
				/*Layout layout2 = Layout.builder().title("Quantity By Country").build();
				BoxTrace trace2 = BoxTrace.builder(superstore_data.categoricalColumn("Country"), superstore_data.nCol("Quantity")).build();
				Plot.show(new Figure(layout2, trace2));
				*/
			Layout layout2 = Layout.builder().title("Dicsount for Product id").build();
			BoxTrace trace2 = BoxTrace.builder(superstore_data.categoricalColumn("Product ID"), superstore_data.nCol("Discount")).build();
			Plot.show(new Figure(layout2, trace2));
          
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Table categoricalColumn(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
