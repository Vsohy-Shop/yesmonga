package org.jsoup;

import java.io.IOException;

public class UnsupportedMimeTypeException extends IOException {
    private final String mimeType;
    private final String url;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.mimeType = str2;
        this.url = str3;
    }

    /* renamed from: a */
    public String mo29588a() {
        return this.mimeType;
    }

    /* renamed from: b */
    public String mo29589b() {
        return this.url;
    }

    public String toString() {
        return super.toString() + ". Mimetype=" + this.mimeType + ", URL=" + this.url;
    }
}
