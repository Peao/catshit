package com.catshit.basic.io;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.*;

/**
 * @author Leon
 */
public class FileTest extends TestCase {
    public void testCreateFile() {
        File file = new File("E:\\iotest\\id.txt");
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getAbsolutePath());
        assertTrue(file.exists());
        System.out.println(file.getPath());
    }

    public void testInputStream() {
        try {
            InputStream is = new FileInputStream("E:\\iotest\\id.txt");

            InputStreamReader isr = new InputStreamReader(is);

            char[] data = new char[1024];
            while (isr.read(data, 0, data.length) != -1) {
                System.out.println(String.valueOf(data));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testStringBufferInputStream() {
        StringReader stringReader = new StringReader("123321");
        int read = 0;
        try {
            char[] data = new char[1024];
            read = stringReader.read(data, 0, 10);
            System.out.println(read);
            System.out.println(String.valueOf(data));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testBufferedReader() {
        try {
            FileReader in = new FileReader("E:\\iotest\\id.txt");
            BufferedReader reader = new BufferedReader(in);

            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testWriter() {
        try {
            FileOutputStream os = new FileOutputStream("E:\\iotest\\id.txt", true);
            os.write("liuqq".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

