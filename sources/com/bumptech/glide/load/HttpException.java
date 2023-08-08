package com.bumptech.glide.load;

import androidx.annotation.C0363p0;
import java.io.IOException;

public final class HttpException extends IOException {

    /* renamed from: a */
    public static final int f56773a = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(int i) {
        this("Http request failed", i);
    }

    /* renamed from: a */
    public int mo65763a() {
        return this.statusCode;
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public HttpException(String str, int i, @C0363p0 Throwable th) {
        super(str + ", status code: " + i, th);
        this.statusCode = i;
    }
}
