package com.airbnb.lottie.network;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.network.c */
public interface C21595c extends Closeable {
    @C0363p0
    /* renamed from: f3 */
    String mo64521f3();

    @C0363p0
    /* renamed from: h */
    String mo64522h();

    boolean isSuccessful();

    @C0359n0
    /* renamed from: u1 */
    InputStream mo64524u1() throws IOException;
}
