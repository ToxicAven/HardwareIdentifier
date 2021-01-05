package aven.toxic.hwid;

import org.apache.commons.codec.digest.DigestUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class main
{
        public static void main(String[] args)
        {
                System.out.println("Generating HWID...");
                String var0 = String.valueOf(System.getenv("os")) + System.getProperty("os.name") + System.getProperty("os.arch") + System.getProperty("os.version") + System.getProperty("user.language") + System.getenv("SystemRoot") + System.getenv("HOMEDRIVE") + System.getenv("PROCESSOR_LEVEL") + System.getenv("PROCESSOR_REVISION") + System.getenv("PROCESSOR_IDENTIFIER") + System.getenv("PROCESSOR_ARCHITECTURE") + System.getenv("PROCESSOR_ARCHITEW6432") + System.getenv("NUMBER_OF_PROCESSORS");
                String sha512hex = DigestUtils.sha512Hex(var0);
                String key = DigestUtils.sha512Hex(sha512hex);

                try {
                        new File("hwid.txt");
                        FileWriter myWriter = new FileWriter("hwid.txt");
                        myWriter.write(key);
                        myWriter.close();
                        System.out.println("Saved HWID to hwid.txt!");
                }

                catch (IOException e) {
                        System.out.println("Something went wrong...");
                        e.printStackTrace();
                }
        }
}