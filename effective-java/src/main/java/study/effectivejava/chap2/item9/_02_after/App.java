package study.effectivejava.chap2.item9._02_after;

import java.io.*;

/**
 * try-with-resources
 * - 자바 7 부터 등장
 * - try-catch 방식보다 짧고 읽기 수월하며, 문제를 진단하기도 좋다.
 * - 정확하고 쉽게 자원을 회수할 수 있다.
 */
public class App {

    private static final int BUFFER_SIZE = 10;

    public static void main(String[] args) throws IOException {
        String text = firstLineOfFile("input.txt");
        System.out.println("text = " + text);

        copy("input.txt", "input2.txt");
    }

    public static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)
        ) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }
}
