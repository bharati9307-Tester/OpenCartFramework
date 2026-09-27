package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
	String path=".\\TestData\\OpenCart_LoginData1.xlsx";//taking xl file from testData
	ExcelUtiles1 xlutils= new ExcelUtiles1 (path);//creating an object for XLUtility
	int totalrows=xlutils.getRowCount("Sheet1");
	int totalcols=3;
	//int totalcols=xlutils.getCellCount("Sheet1", 3);
	String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store
	for(int i=1;i<=totalrows;i++) //1//read the data from xl storing in two deminsional array
	{
		for(int j=0;j<totalcols;j++) //0 i is row and j is col
		{
	      logindata[i-1][j]= xlutils.getCellData("Sheet1", i, j);//1, 0
		}
	}
	return logindata;//returning two dimension array
	}
}
