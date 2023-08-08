package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.df */
public final class C21985df extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private short AFInAppEventType;
    private long[] AFKeystoreWrapper;
    private int AFLogger$LogLevel = Integer.MAX_VALUE;
    private int AFVersionDeclaration;
    private int AppsFlyer2dXConversionCallback;
    private long[] valueOf;
    private final int values;

    public C21985df(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        int min = Math.min(Math.max(s, 4), 8);
        this.values = min;
        this.AFInAppEventParameterName = new byte[min];
        this.AFKeystoreWrapper = new long[4];
        this.valueOf = new long[4];
        this.AppsFlyer2dXConversionCallback = min;
        this.AFVersionDeclaration = min;
        this.AFKeystoreWrapper = C21981db.valueOf(i ^ i4, min ^ i4);
        this.valueOf = C21981db.valueOf(i2 ^ i4, i3 ^ i4);
    }

    private void valueOf() {
        long[] jArr = this.AFKeystoreWrapper;
        long[] jArr2 = this.valueOf;
        short s = this.AFInAppEventType;
        long j = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j) / 2147483647L;
        jArr[i] = ((jArr[s % 4] * 2147483085) + j) % 2147483647L;
        for (int i2 = 0; i2 < this.values; i2++) {
            byte[] bArr = this.AFInAppEventParameterName;
            bArr[i2] = (byte) ((int) (((long) bArr[i2]) ^ ((this.AFKeystoreWrapper[this.AFInAppEventType] >> (i2 << 3)) & 255)));
        }
        this.AFInAppEventType = (short) ((this.AFInAppEventType + 1) % 4);
    }

    private int values() throws IOException {
        int read;
        int i;
        if (this.AFLogger$LogLevel == Integer.MAX_VALUE) {
            this.AFLogger$LogLevel = this.in.read();
        }
        if (this.AppsFlyer2dXConversionCallback == this.values) {
            byte[] bArr = this.AFInAppEventParameterName;
            int i2 = this.AFLogger$LogLevel;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    read = this.in.read(this.AFInAppEventParameterName, i3, this.values - i3);
                    if (read <= 0 || (i3 = i3 + read) >= this.values) {
                    }
                    read = this.in.read(this.AFInAppEventParameterName, i3, this.values - i3);
                    break;
                } while ((i3 = i3 + read) >= this.values);
                if (i3 >= this.values) {
                    valueOf();
                    int read2 = this.in.read();
                    this.AFLogger$LogLevel = read2;
                    this.AppsFlyer2dXConversionCallback = 0;
                    if (read2 < 0) {
                        int i4 = this.values;
                        i = i4 - (this.AFInAppEventParameterName[i4 - 1] & 255);
                    } else {
                        i = this.values;
                    }
                    this.AFVersionDeclaration = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.AFVersionDeclaration;
    }

    public final int available() throws IOException {
        values();
        return this.AFVersionDeclaration - this.AppsFlyer2dXConversionCallback;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() throws IOException {
        values();
        int i = this.AppsFlyer2dXConversionCallback;
        if (i >= this.AFVersionDeclaration) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventParameterName;
        this.AppsFlyer2dXConversionCallback = i + 1;
        return bArr[i] & 255;
    }

    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            values();
            int i5 = this.AppsFlyer2dXConversionCallback;
            if (i5 < this.AFVersionDeclaration) {
                byte[] bArr2 = this.AFInAppEventParameterName;
                this.AppsFlyer2dXConversionCallback = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }
}
