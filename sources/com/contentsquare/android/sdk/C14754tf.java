package com.contentsquare.android.sdk;

import java.nio.charset.Charset;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.contentsquare.android.sdk.tf */
public class C14754tf {

    /* renamed from: c */
    public static final C14453jf f36527c = new C14453jf("BatchedData");

    /* renamed from: a */
    public String f36528a;

    /* renamed from: b */
    public final byte[] f36529b;

    /* renamed from: com.contentsquare.android.sdk.tf$a */
    public static class C14755a {
        /* renamed from: a */
        public static int m63598a(byte[] bArr, int i) {
            return ((bArr[i + 3] & 255) << 0) | ((bArr[i + 0] & 255) << 24) | ((bArr[i + 1] & 255) << DateTimeFieldType.f30603E0) | ((bArr[i + 2] & 255) << 8);
        }

        /* renamed from: b */
        public static byte[] m63599b(int i) {
            return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) (i >> 0)};
        }

        /* renamed from: c */
        public static byte[] m63600c(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        /* renamed from: d */
        public static String m63601d(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new String(bArr2, Charset.forName("UTF-8"));
        }
    }

    public C14754tf(String str, byte[] bArr) {
        this.f36528a = str;
        this.f36529b = bArr;
    }

    /* renamed from: a */
    public static C14754tf m63594a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length <= 4) {
            f36527c.mo35677f("couldn't transform bytes because data is too small", new Object[0]);
            return null;
        }
        int a = C14755a.m63598a(bArr, 0);
        if (a == 1) {
            try {
                int a2 = C14755a.m63598a(bArr, 4);
                String d = C14755a.m63601d(bArr, 8, a2);
                int i = a2 + 8;
                return new C14754tf(d, C14755a.m63600c(bArr, i + 4, C14755a.m63598a(bArr, i)));
            } catch (Exception e) {
                f36527c.mo35678g(e, "couldn't transform bytes because of an unexpected error", new Object[0]);
            }
        } else {
            f36527c.mo35677f("couldn't transform bytes because version %d is unknown", Integer.valueOf(a));
            return null;
        }
    }

    /* renamed from: b */
    public String mo36541b() {
        return this.f36528a;
    }

    /* renamed from: c */
    public byte[] mo36542c() {
        return this.f36529b;
    }

    /* renamed from: d */
    public byte[] mo36543d() {
        byte[] bytes = this.f36528a.getBytes(Charset.forName("UTF-8"));
        int length = bytes.length;
        int length2 = this.f36529b.length;
        byte[] bArr = new byte[(length + 12 + length2)];
        System.arraycopy(C14755a.m63599b(1), 0, bArr, 0, 4);
        System.arraycopy(C14755a.m63599b(length), 0, bArr, 4, 4);
        System.arraycopy(bytes, 0, bArr, 8, length);
        int i = length + 8;
        System.arraycopy(C14755a.m63599b(length2), 0, bArr, i, 4);
        System.arraycopy(this.f36529b, 0, bArr, i + 4, length2);
        return bArr;
    }
}
