package com.bumptech.glide.load.data;

import androidx.annotation.C0359n0;
import androidx.exifinterface.media.C19135a;
import com.google.android.material.color.C31234i;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.bumptech.glide.load.data.g */
public final class C22121g extends FilterInputStream {

    /* renamed from: c */
    public static final int f56806c = 2;

    /* renamed from: d */
    public static final byte[] f56807d;

    /* renamed from: e */
    public static final int f56808e;

    /* renamed from: f */
    public static final int f56809f;

    /* renamed from: a */
    public final byte f56810a;

    /* renamed from: b */
    public int f56811b;

    static {
        byte[] bArr = {-1, C19135a.f48700D7, 0, C31234i.C31240f.f75184f, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, DateTimeFieldType.f30605G0, 0, 2, 0, 0, 0, 1, 0};
        f56807d = bArr;
        int length = bArr.length;
        f56808e = length;
        f56809f = length + 2;
    }

    public C22121g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f56810a = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f56811b;
        if (i3 < 2 || i3 > (i2 = f56809f)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f56810a;
        } else {
            i = f56807d[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f56811b++;
        }
        return i;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f56811b = (int) (((long) this.f56811b) + skip);
        }
        return skip;
    }

    public int read(@C0359n0 byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f56811b;
        int i5 = f56809f;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f56810a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f56807d, this.f56811b - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f56811b += i3;
        }
        return i3;
    }
}
