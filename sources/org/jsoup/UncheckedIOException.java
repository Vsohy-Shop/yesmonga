package org.jsoup;

import java.io.IOException;

public class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(IOException iOException) {
        super(iOException);
    }

    /* renamed from: a */
    public IOException mo29587a() {
        return (IOException) getCause();
    }

    public UncheckedIOException(String str) {
        super(new IOException(str));
    }
}
