package Company.Handle;

import java.util.Scanner;

import Company.Handle.Company;

public class Company 
{

	// company info
    String CompanyName;
    String CompanyNumber;
    String CompanyEmail;
    String CompanyLocation;

    public Company()
	{
        // set company info
        setVariables();
        
        // introduce company
        showInformation();
        
        // start handling inputs
        Scanner in = new Scanner(System.in);
        
        
        HandleClient handleClient = new HandleClient();
        handleClient.HandleClients(in);
        
       in.close();
    }
    private void setVariables()
    {
        CompanyName = "TlouTrans";
        CompanyNumber = "122576628";
        CompanyEmail = "transtloumakhola.co.za";
        CompanyLocation = "@Matatiele67Matatiele4730";
    }
    private void showInformation()
	{
        System.out.println("                        Hello Welcome to the TlouTrans Tour and Adventure below are the details you can use to book.                        ");
        System.out.println("The Company name is: " + CompanyName );
        System.out.println("The Company Telephone is: " + CompanyNumber);
        System.out.println("The Company email is: " + CompanyEmail);
        System.out.println("The Company location is: " + CompanyLocation + "\n");
    }
}
