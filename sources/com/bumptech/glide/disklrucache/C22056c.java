package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.disklrucache.c */
public class C22056c implements Closeable {

    /* renamed from: f */
    public static final byte f56610f = 13;

    /* renamed from: g */
    public static final byte f56611g = 10;

    /* renamed from: a */
    public final InputStream f56612a;

    /* renamed from: b */
    public final Charset f56613b;

    /* renamed from: c */
    public byte[] f56614c;

    /* renamed from: d */
    public int f56615d;

    /* renamed from: e */
    public int f56616e;

    /* renamed from: com.bumptech.glide.disklrucache.c$a */
    public class C22057a extends ByteArrayOutputStream {
        public C22057a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C22056c.this.f56613b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C22056c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public final void mo65565b() throws IOException {
        InputStream inputStream = this.f56612a;
        byte[] bArr = this.f56614c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f56615d = 0;
            this.f56616e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public boolean mo65566c() {
        return this.f56616e == -1;
    }

    public void close() throws IOException {
        synchronized (this.f56612a) {
            if (this.f56614c != null) {
                this.f56614c = null;
                this.f56612a.close();
            }
        }
    }

    /* renamed from: d */
    public String mo65568d() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f56612a) {
            if (this.f56614c != null) {
                if (this.f56615d >= this.f56616e) {
                    mo65565b();
                }
                for (int i3 = this.f56615d; i3 != this.f56616e; i3++) {
                    byte[] bArr2 = this.f56614c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f56615d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f56613b.name());
                                this.f56615d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f56613b.name());
                        this.f56615d = i3 + 1;
                        return str2;
                    }
                }
                C22057a aVar = new C22057a((this.f56616e - this.f56615d) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f56614c;
                    int i5 = this.f56615d;
                    aVar.write(bArr3, i5, this.f56616e - i5);
                    this.f56616e = -1;
                    mo65565b();
                    i = this.f56615d;
                    while (true) {
                        if (i != this.f56616e) {
                            bArr = this.f56614c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f56615d;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f56615d = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C22056c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C22058d.f56618a)) {
            this.f56612a = inputStream;
            this.f56613b = charset;
            this.f56614c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
