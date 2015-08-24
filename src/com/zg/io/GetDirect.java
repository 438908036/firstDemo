package com.zg.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetDirect {
	public static void main(String[] args) throws IOException {
		listDemo("C");
	}

	public static String[] listDemo(String s) {
		String ss = s+":\\";
		File file = new File(ss);
		String[] fileStrings = file.list();
		for (String sss : fileStrings) {
			System.out.println(sss);
		}

		return fileStrings;		
	}
}
