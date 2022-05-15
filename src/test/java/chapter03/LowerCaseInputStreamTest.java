package chapter03;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class LowerCaseInputStreamTest {

    @Test
    void read() throws IOException {
        // given
        String text = "i know the Decorator Pattern therefore I RULE!";
        // 결과 값
        StringBuilder actual = new StringBuilder();
        // 기대 값
        String expect = "i know the decorator pattern therefore i rule!";
        // 임시 파일 생성
        Path tempFile = Files.createTempFile("head-first-", ".txt");
        try (FileOutputStream out = new FileOutputStream(tempFile.toFile())) {
            out.write(text.getBytes());
        }
        // when
        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(tempFile.toFile())))) {
            int c;
            while ((c = in.read()) >= 0) {
                actual.append((char) c);
            }
        }
        // then
        assertThat(actual.toString(), is(expect));
    }
}
