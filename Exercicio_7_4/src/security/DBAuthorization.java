package security;

import validation.*; 

public class DBAuthorization {
	static IAuthorization []list;
		
	public static IAuthorization getAuthorization(int cod) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].getCode() == cod) {
				return list[i];
			}
		}
		return null;
	}
	
	public static void carregaBD() {
		list=new IAuthorization[5];
		list[0]=new Authorization(1111,"aaaa");
		list[1]=new Authorization(2222,"bbbb");
		list[2]=new Authorization(3333,"cccc");
		list[3]=new Authorization(4444,"dddd");
		list[4]=new Authorization(5555,"eeee");
		
	}

}
