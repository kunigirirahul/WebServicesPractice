package com.sp.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class POHandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		
		System.out.println("Start of the element");
		
	}

	@Override
	public void endDocument() throws SAXException {
		
		System.out.println("Run of the element");
		
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		System.out.println("<"+qName+">");
		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		System.out.println("</"+qName+">");
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		System.out.println(new String(ch,start,length));
		
	}

	
	
}
