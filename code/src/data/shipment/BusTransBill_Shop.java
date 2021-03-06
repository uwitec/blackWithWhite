package data.shipment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.BusShipmentBill_Shop;
import data.Iphelper.Iphelper;

public class BusTransBill_Shop implements BusTransBill_ShopHelper{
	BusShipmentBill_Shop a;
	boolean result;
	
	private String getURL() throws FileNotFoundException, ClassNotFoundException, IOException{
		String s="rmi://"+Iphelper.getIP()+":37005/bustransbillshop";
		return s;
	}
	
	public boolean insert(BusShipmentBill_Shop bill){
		try {
			BusTransBill_ShopHelper x=(BusTransBill_ShopHelper) Naming.lookup(getURL());
			 result=x.insert(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public BusShipmentBill_Shop get(String id){
		try {
			BusTransBill_ShopHelper x=(BusTransBill_ShopHelper) Naming.lookup(getURL());
			 a=x.get(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return a;
	}
	
	public boolean change(BusShipmentBill_Shop bill){
		try {
			BusTransBill_ShopHelper x=(BusTransBill_ShopHelper) Naming.lookup(getURL());
			 result=x.change(bill);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(String id){
		try {
			BusTransBill_ShopHelper x=(BusTransBill_ShopHelper) Naming.lookup(getURL());
			 result=x.delete(id);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return result;
	}
	
	public boolean init(){
		try {
			BusTransBill_ShopHelper x=(BusTransBill_ShopHelper) Naming.lookup(getURL());
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

	@Override
	public ArrayList<BusShipmentBill_Shop> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<BusShipmentBill_Shop> array=new ArrayList<BusShipmentBill_Shop>();
		try {
			BusTransBill_ShopHelper x=(BusTransBill_ShopHelper) Naming.lookup(getURL());
			 array=x.getUnjudged();
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
					// TODO Auto-generated catch block
			  e.printStackTrace();
		}
		return array;
	}
}
