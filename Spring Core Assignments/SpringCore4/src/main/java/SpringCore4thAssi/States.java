package SpringCore4thAssi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public class States {
	
	private capitals state1;
	private capitals state2;
	public capitals getState1() {
		return state1;
	}
	
	
	public capitals getState2() {
		return state2;
	}
	@Autowired
	public void setState2(capitals state2) {
		this.state2 = state2;
	}
	@Autowired
	public void setState1(capitals state1) {
		this.state1 = state1;
	}
	public void print()
	{
	    System.out.println("state1 :" + state1.getStatename()+ "  capital :" +state1.getCapital() );
	    System.out.println("state2 :" + state1.getStatename()+"   capital :" +state1.getCapital() );
	}
	
	
}