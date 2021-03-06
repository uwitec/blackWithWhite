package bill;

import java.io.Serializable;

public class OrderBillPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4684078436648542786L;
	public static String billType="OrderBill";
	public String ID;
	public boolean judged;
	/*
	 * information of the sender
	 */
	public String nameOfSender;
	public String addressOfSender;
	public String workplaceOfSender;
	public String phoneOfSender;
	public String mobileOfSender;
	
	/*
	 * information of the receiver
	 */
	
	public String nameOfReceiver;
	public String addressOfReceiver;
	public String workplaceOfReceiver;
	public String phoneOfReceiver;
	public String mobileOfReceiver;
	
	/*
	 * information of the item
	 */
	public int numOfItem;
	public double weight;
	public double[] size;
	public String nameOfOrder;
	public String volume ;
	public double moneyForCover;
	public String speedLevel;
	public String kindOfSend;
	public String time;
	public double money;
	
	public OrderBillPO(String nameOfSender1,String phoneOfSender1,String mobileOfSender1,String workplaceOfSender1,String addressOfSender1,
	String nameOfReceiver1,String phoneOfReceiver1,String mobileOfReceiver1,String workplaceOfReceiver1,String addressOfReceiver1,
	String numOfItem1,String weight1,String length,String width,String height,
	String nameOfOrder1,String volume1,String moneyForCover1,String speedLevel1,String kindOfSend1,String time1,double money1,String id){
		size=new double[3];
		this.nameOfSender=nameOfSender1;
		this.addressOfSender=addressOfSender1;
		this.workplaceOfSender=workplaceOfSender1;
		this.phoneOfSender=phoneOfSender1;
		this.mobileOfSender=mobileOfSender1;
		
		this.nameOfReceiver=nameOfReceiver1;
		this.addressOfReceiver=addressOfReceiver1;
		this.workplaceOfReceiver=workplaceOfReceiver1;
		this.phoneOfReceiver=phoneOfReceiver1;
		this.mobileOfReceiver=mobileOfReceiver1;
		
		this.numOfItem=Integer.parseInt(numOfItem1);
		this.weight=Double.parseDouble(weight1);
		this.size[0]=Double.parseDouble(length);
		this.size[1]=Double.parseDouble(width);
		this.size[2]=Double.parseDouble(height);
		this.nameOfOrder=nameOfOrder1;
		this.volume=volume1 ;
		this.moneyForCover=Double.parseDouble(moneyForCover1);
		this.speedLevel=speedLevel1;
		this.kindOfSend=kindOfSend1;
		this.time=time1;
		this.money=money1;
		this.ID=id;
		
	}
	
	public OrderBillPO(){
		this.size=new double[]{1,2,3};
	}
	/*public OrderBillPO(OrderBillVO orderbill){
		
		nameOfSender=orderbill.nameOfSender;
		addressOfSender=orderbill.addressOfSender;
		workplaceOfSender=orderbill.workplaceOfSender;
		phoneOfSender=orderbill.phoneOfSender;
		mobileOfSender=orderbill.mobileOfSender;
		nameOfReceiver=orderbill.nameOfReceiver;
		addressOfReceiver=orderbill.addressOfReceiver;
		workplaceOfReceiver=orderbill.workplaceOfReceiver;
		phoneOfReceiver=orderbill.phoneOfReceiver;
		mobileOfReceiver=orderbill.mobileOfReceiver;
		numOfItem=orderbill.numOfItem;
		size=orderbill.size;
		moneyForCover=orderbill.moneyForCover;
		speedLevel=orderbill.speedLevel;
		kindOfSend=orderbill.kindOfSend;
		time=orderbill.time;
		money=orderbill.money;
		
	}*/

}
