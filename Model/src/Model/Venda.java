package Model;

import java.util.Date;

public class Venda {
	Date DataVenda = new Date();
	double Total;
	
	public Date getDataVenda() {
		return DataVenda;
	}
	
	public void setDataVenda(Date dataVenda) {
		DataVenda = dataVenda;
	}
	
	public double getTotal() {
		return Total;
	}
	
	public void setTotal(double total) {
		Total = total;
	} 
}
