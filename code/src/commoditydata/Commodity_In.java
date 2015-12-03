package commoditydata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Iphelper.Iphelper;
import bill.StockBill_In;

public class Commodity_In implements Commodity_In_Manage{
	boolean result;
	StockBill_In bill;
	
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":32000/commodity_in_manage";
		return s;
	}
	
	
	public boolean insert(StockBill_In a){
		try {
			Commodity_In_Manage x=(Commodity_In_Manage) Naming.lookup(getURL());
			result=x.insert(a);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			Commodity_In_Manage x=(Commodity_In_Manage) Naming.lookup(getURL());
			result=x.delete(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean change(StockBill_In a){
		try {
			Commodity_In_Manage x=(Commodity_In_Manage) Naming.lookup(getURL());
			result=x.change(a);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public StockBill_In get(String id){
		try {
			Commodity_In_Manage x=(Commodity_In_Manage) Naming.lookup(getURL());
			bill=x.get(id);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bill;
	}
	
	public boolean init(){
		try {
			Commodity_In_Manage x=(Commodity_In_Manage) Naming.lookup(getURL());
			result=x.init();
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
