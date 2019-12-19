package prob2;

public class Admin {
	//implement
	private Department[] depts;
	Admin(Department[] depts){
	// to do the array must be size 3
		this. depts = depts;
	}
	public String hourlyCompanyMessage()  {
		// to do
		String str="";
		for(Department d:depts) {
			try {
				str+= format(d.getName(),d.nextMessage())+"\n";
			} catch (EmptyQueueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return str;
	}
	public String format(String name, String msg) {
		// to do
		return name+":"+ msg;
		
	}
	
}
