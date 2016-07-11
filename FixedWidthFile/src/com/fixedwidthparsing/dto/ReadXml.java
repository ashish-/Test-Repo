package com.fixedwidthparsing.dto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class ReadXml {
	
	public static void main(String[] args) {
		try {
			ArrayList <ItemDto> items=new ArrayList<ItemDto>();
	        JAXBContext jc = JAXBContext.newInstance(BCPFORMAT.class);
	
	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        File xml = new File("files/volume_format.xml");
	        BCPFORMAT bcp = (BCPFORMAT) unmarshaller.unmarshal(xml);
	        System.out.println(bcp.getRecord().getItems().size());
	        List<Column> columns=bcp.getRow().getItems();
	        List <Field>fields=bcp.getRecord().getItems();
	        
	        //Read Sample volume file
	        FileInputStream file=new FileInputStream(new File("files/sampleVolume.txt"));
	        BufferedReader reader=new BufferedReader(new InputStreamReader(file));
	        String strLine;
	
	       //Read File Line By Line
	       int i=0;
	       while ((strLine = reader.readLine()) != null)   {
	       // Print the content on the console
	    	 if(i==0){
	    		 i++;
	    		 continue;
	    		
	    	 }
	       String temp="";
	       ItemDto item=new ItemDto();
	       
	       //Set Attributes of ItemDto object
	       item.setFclty_nbr(Integer.valueOf(strLine.substring(0, fields.get(0).getLENGTH()-1).trim()));
	       item.setDept_nbr(Integer.valueOf(strLine.substring(fields.get(0).getLENGTH(),fields.get(0).getLENGTH()+ fields.get(1).getLENGTH()-1).trim()));
	       item.setBill_cod(strLine.substring(fields.get(0).getLENGTH()+fields.get(1).getLENGTH(),fields.get(0).getLENGTH()+fields.get(1).getLENGTH()+ fields.get(2).getLENGTH()-1).trim());
	       item.setBill_cod_desc(strLine.substring(fields.get(0).getLENGTH()+fields.get(1).getLENGTH()+ fields.get(2).getLENGTH(), fields.get(0).getLENGTH()+fields.get(1).getLENGTH()+ fields.get(2).getLENGTH()+fields.get(3).getLENGTH()-1).trim());
	       item.setVol_qty(Float.valueOf(strLine.substring(fields.get(0).getLENGTH()+fields.get(1).getLENGTH()+ fields.get(2).getLENGTH()+fields.get(3).getLENGTH(), fields.get(0).getLENGTH()+fields.get(1).getLENGTH()+ fields.get(2).getLENGTH()+fields.get(3).getLENGTH()+fields.get(4).getLENGTH()-1).trim()));
	       item.setPost_date(strLine.substring(fields.get(0).getLENGTH()+fields.get(1).getLENGTH()+ fields.get(2).getLENGTH()+fields.get(3).getLENGTH()+fields.get(4).getLENGTH(), fields.get(0).getLENGTH()+fields.get(1).getLENGTH()+ fields.get(2).getLENGTH()+fields.get(3).getLENGTH()+fields.get(4).getLENGTH()+fields.get(5).getLENGTH()-1).trim());
	       item.setSvc_date(strLine.substring(fields.get(0).getLENGTH()+fields.get(1).getLENGTH()+ fields.get(2).getLENGTH()+fields.get(3).getLENGTH()+fields.get(4).getLENGTH()+fields.get(5).getLENGTH(), fields.get(0).getLENGTH()+fields.get(1).getLENGTH()+ fields.get(2).getLENGTH()+fields.get(3).getLENGTH()+fields.get(4).getLENGTH()+fields.get(5).getLENGTH()+fields.get(6).getLENGTH()-1).trim());
	       items.add(item);
	     }
	
	     //Close the input stream
	     reader.close();
	     Float sumQty=0.0f;
	     HashSet<String> hs = new HashSet<String>();
	     for(ItemDto item:items){
	    	// System.out.println(item.getBill_cod_desc());
	    	 hs.add(item.getBill_cod());
	    	 sumQty+=item.getVol_qty();
	     }
	     System.out.println("Sum of Volume Quantity: "+sumQty);
	     System.out.println(hs.size()+" unique Bill Cods");
	}catch (FileNotFoundException e) {
		System.out.println("File not found");
        }
		
	catch(Exception e) {
			System.out.println("Error in running program");
		}
	}
}
