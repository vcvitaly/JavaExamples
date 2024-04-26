package io.github.vcvitaly;

import java.nio.file.Paths;

public class FileServiceLinux {

    public static void main(String[] args) {
        System.out.println(Paths.get("/home").getFileName().toString());
    }
}
