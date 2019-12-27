package ua.epam.javacore.hometask09.structuralpatterns.adapter;

import java.io.IOException;

public interface MyStringWriter {
    void flush() throws IOException;
    void writeString(String s) throws IOException;
    void close() throws IOException;
}
