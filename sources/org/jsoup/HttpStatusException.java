package org.jsoup;

import java.io.IOException;

public class HttpStatusException extends IOException {
    private final int statusCode;
    private final String url;

    public HttpStatusException(String str, int i, String str2) {
        super(str + ". Status=" + i + ", URL=[" + str2 + "]");
        this.statusCode = i;
        this.url = str2;
    }

    /* renamed from: a */
    public int mo29585a() {
        return this.statusCode;
    }

    /* renamed from: b */
    public String mo29586b() {
        return this.url;
    }
}
