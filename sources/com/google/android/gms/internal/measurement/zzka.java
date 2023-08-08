package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzka implements Iterable, Serializable {

    /* renamed from: a */
    public static final zzka f106708a = new zzjx(C41860aa.f105998d);

    /* renamed from: b */
    public static final Comparator f106709b = new C42091n8();

    /* renamed from: c */
    public static final C42159r8 f106710c = new C42159r8((C42142q8) null);
    private int zzc = 0;

    static {
        int i = C41984h8.f106189a;
    }

    /* renamed from: A */
    public static int m171360A(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: M */
    public static zzka m171361M(byte[] bArr, int i, int i2) {
        m171360A(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzjx(bArr2);
    }

    /* renamed from: H */
    public final int mo137600H() {
        return this.zzc;
    }

    /* renamed from: Q */
    public final String mo137601Q(Charset charset) {
        return mo137593i() == 0 ? "" : mo137597r(charset);
    }

    /* renamed from: e */
    public abstract byte mo137591e(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: h */
    public abstract byte mo137592h(int i);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int i2 = mo137593i();
            i = mo137595k(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract int mo137593i();

    public final /* synthetic */ Iterator iterator() {
        return new C42074m8(this);
    }

    /* renamed from: k */
    public abstract int mo137595k(int i, int i2, int i3);

    /* renamed from: q */
    public abstract zzka mo137596q(int i, int i2);

    /* renamed from: r */
    public abstract String mo137597r(Charset charset);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo137593i());
        if (mo137593i() <= 50) {
            str = C42264xb.m171118a(this);
        } else {
            str = C42264xb.m171118a(mo137596q(0, 47)).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: w */
    public abstract void mo137598w(C42056l8 l8Var) throws IOException;

    /* renamed from: y */
    public abstract boolean mo137599y();
}
