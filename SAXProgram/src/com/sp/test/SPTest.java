package com.sp.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sp.handler.POHandler;



public class SPTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		
		SAXParser parser = saxParserFactory.newSAXParser(); 
		
		POHandler handler = new POHandler();
		
		parser.parse(new File("E:/WEBSERVICES PRAcar.xml"), handler);
		
	}

}
