package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zbwp implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    public static final zbwp f71626a = new zbwm(C29909xz.f71543c);

    /* renamed from: b */
    public static final Comparator<zbwp> f71627b = new C29243fy();

    /* renamed from: c */
    public static final C29427ky f71628c = new C29427ky((C29390jy) null);
    private int zbc = 0;

    static {
        int i = C29759tx.f71479a;
    }

    /* renamed from: A */
    public static int m121495A(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: M */
    public static zbwp m121496M(byte[] bArr, int i, int i2) {
        m121495A(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zbwm(bArr2);
    }

    /* renamed from: Q */
    public static zbwp m121497Q(String str) {
        return new zbwm(str.getBytes(C29909xz.f71541a));
    }

    /* renamed from: H */
    public final int mo84998H() {
        return this.zbc;
    }

    /* renamed from: W */
    public final String mo84999W(Charset charset) {
        if (mo84991i() == 0) {
            return "";
        }
        return mo84995r(charset);
    }

    /* renamed from: e */
    public abstract byte mo84989e(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: h */
    public abstract byte mo84990h(int i);

    public final int hashCode() {
        int i = this.zbc;
        if (i == 0) {
            int i2 = mo84991i();
            i = mo84993k(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.zbc = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract int mo84991i();

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C29169dy(this);
    }

    /* renamed from: k */
    public abstract int mo84993k(int i, int i2, int i3);

    /* renamed from: q */
    public abstract zbwp mo84994q(int i, int i2);

    /* renamed from: r */
    public abstract String mo84995r(Charset charset);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo84991i());
        if (mo84991i() <= 50) {
            str = C29319i.m120492a(this);
        } else {
            str = String.valueOf(C29319i.m120492a(mo84994q(0, 47))).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: w */
    public abstract void mo84996w(C29132cy cyVar) throws IOException;

    /* renamed from: y */
    public abstract boolean mo84997y();
}
