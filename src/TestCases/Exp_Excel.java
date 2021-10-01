package TestCases;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_Excel {

	public static void main(String[] args) throws Exception {
		//import Employee.xls
		FileInputStream file = new FileInputStream("D:\\NiT\\SoftwareTesting\\html\\Employee.xls");
		//get Workbook
		Workbook wb = Workbook.getWorkbook(file);
		//get 1st Sheet provide arg as index 0
		Sheet st = wb.getSheet(0);
		// get 1 cell contents col=2, row =3
		String s1 = st.getCell(2, 3).getContents();
		System.out.println(s1+"\n");
		//get 1 row data say row =2
		int i=2;
		String empid=st.getCell(0,i).getContents();
		String name=st.getCell(1,i).getContents();
		String email=st.getCell(2,i).getContents();
		String mob=st.getCell(3,i).getContents();
		System.out.println(empid+" "+name+" "+email+" "+mob+"\n");
		// get whole sheet data, loop required so row count
		int rowcount = st.getRows(),col=0;
		for(int j=1;j<rowcount;j++,col=0)
		{
			empid=st.getCell(col++,j).getContents();
			name=st.getCell(col++,j).getContents();
			email=st.getCell(col++,j).getContents();
			mob=st.getCell(col,j).getContents();
			System.out.println(empid+" "+name+" "+email+" "+mob+"\n");
		}
	}

}
