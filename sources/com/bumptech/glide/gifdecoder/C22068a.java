package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.gifdecoder.a */
public interface C22068a {

    /* renamed from: a */
    public static final int f56636a = 0;

    /* renamed from: b */
    public static final int f56637b = 1;

    /* renamed from: c */
    public static final int f56638c = 2;

    /* renamed from: d */
    public static final int f56639d = 3;

    /* renamed from: e */
    public static final int f56640e = 0;

    /* renamed from: com.bumptech.glide.gifdecoder.a$a */
    public interface C22069a {
        /* renamed from: a */
        void mo65628a(@C0359n0 Bitmap bitmap);

        @C0359n0
        /* renamed from: b */
        byte[] mo65629b(int i);

        @C0359n0
        /* renamed from: c */
        Bitmap mo65630c(int i, int i2, @C0359n0 Bitmap.Config config);

        @C0359n0
        /* renamed from: d */
        int[] mo65631d(int i);

        /* renamed from: e */
        void mo65632e(@C0359n0 byte[] bArr);

        /* renamed from: f */
        void mo65633f(@C0359n0 int[] iArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.bumptech.glide.gifdecoder.a$b */
    public @interface C22070b {
    }

    /* renamed from: a */
    int mo65606a(@C0363p0 InputStream inputStream, int i);

    @C0363p0
    /* renamed from: b */
    Bitmap mo65607b();

    /* renamed from: c */
    void mo65608c();

    void clear();

    /* renamed from: d */
    int mo65610d();

    /* renamed from: e */
    void mo65611e(@C0359n0 Bitmap.Config config);

    /* renamed from: f */
    int mo65612f(int i);

    /* renamed from: g */
    int mo65613g();

    @C0359n0
    ByteBuffer getData();

    int getHeight();

    int getStatus();

    int getWidth();

    @Deprecated
    /* renamed from: h */
    int mo65618h();

    /* renamed from: i */
    void mo65619i(@C0359n0 C22072c cVar, @C0359n0 byte[] bArr);

    /* renamed from: j */
    int mo65620j();

    /* renamed from: k */
    void mo65621k();

    /* renamed from: l */
    void mo65622l(@C0359n0 C22072c cVar, @C0359n0 ByteBuffer byteBuffer);

    /* renamed from: m */
    int mo65623m();

    /* renamed from: n */
    void mo65624n(@C0359n0 C22072c cVar, @C0359n0 ByteBuffer byteBuffer, int i);

    /* renamed from: o */
    int mo65625o();

    /* renamed from: p */
    int mo65626p();

    int read(@C0363p0 byte[] bArr);
}
