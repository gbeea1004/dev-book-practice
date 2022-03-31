package study.effectivejava.chap2.item9._01_before;

import java.io.*;

public class App {

    private static final int BUFFER_SIZE = 10;

    public static void main(String[] args) throws IOException {
        String text = firstLineOfFile("input.txt");
        System.out.println("text = " + text);

        copy("input.txt", "input2.txt");
    }

    public static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine(); // 불완전한 코드 -> readLine 중에 error 가 발생한다면..?
        } finally {
            br.close();
        }
    }

    public static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}
