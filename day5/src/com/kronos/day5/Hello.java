package com.kronos.day5;

import java.io.File;
import java.net.UnknownHostException;

public class Hello {

	public static void main(String[] args) throws UnknownHostException {
		//java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
		//System.out.println("Hostname of local machine: " + localMachine.getHostName());
		//System.out.println(System.getProperty("user.name"));
		//String localhostname = java.net.InetAddress.getLocalHost().getHostName();
		File file = new File("E://WS//source//java//mstr_sdk");
        String[] fileList = file.list();
        int count=0;
        for ( int i = 0; i < fileList.length; i++ )
        {
        	count++;
            if ( fileList[i].startsWith( "build" ) )
            {
            	System.out.println(count);
            	System.exit(1);
            	
            }
        }
	}
}
