package bl.shipment.Impl;

import bill.TransportBill_Plane;
import bl.shipment.Service.AirTransportBLService;

public class AirTransportController implements AirTransportBLService {
	AirTransport airTransport;
	public AirTransportController(){
		airTransport=new AirTransport();
	}
	@Override
	public boolean submitills(TransportBill_Plane planeBill) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
