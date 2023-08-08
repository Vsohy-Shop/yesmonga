package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zztd implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    public static final zztd f105744a = new zzta(C41650vj.f105171c);

    /* renamed from: b */
    public static final Comparator<zztd> f105745b = new C41408lh();

    /* renamed from: c */
    public static final C41528qh f105746c = new C41528qh((C41504ph) null);
    private int zzc = 0;

    static {
        int i = C41143ah.f104441a;
    }

    /* renamed from: H */
    public static int m168977H(int i, int i2, int i3) {
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

    /* renamed from: Q */
    public static zztd m168978Q(byte[] bArr) {
        return m168979W(bArr, 0, bArr.length);
    }

    /* renamed from: W */
    public static zztd m168979W(byte[] bArr, int i, int i2) {
        m168977H(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzta(bArr2);
    }

    /* renamed from: X */
    public static zztd m168980X(String str) {
        return new zzta(str.getBytes(C41650vj.f105169a));
    }

    /* renamed from: Y */
    public static zztd m168981Y(byte[] bArr) {
        return new zzta(bArr);
    }

    /* renamed from: e0 */
    public static zztd m168982e0(byte[] bArr, int i, int i2) {
        return new zzsx(bArr, i, i2);
    }

    /* renamed from: A */
    public abstract boolean mo136147A();

    /* renamed from: M */
    public final int mo136153M() {
        return this.zzc;
    }

    /* renamed from: e */
    public abstract byte mo136142e(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f0 */
    public final String mo136154f0(Charset charset) {
        if (mo136144i() == 0) {
            return "";
        }
        return mo136151w(charset);
    }

    /* renamed from: h */
    public abstract byte mo136143h(int i);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int i2 = mo136144i();
            i = mo136149q(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract int mo136144i();

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C41359jh(this);
    }

    /* renamed from: k */
    public abstract void mo136145k(byte[] bArr, int i, int i2, int i3);

    /* renamed from: q */
    public abstract int mo136149q(int i, int i2, int i3);

    /* renamed from: r */
    public abstract zztd mo136150r(int i, int i2);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo136144i());
        if (mo136144i() <= 50) {
            str = C41700xl.m168831a(this);
        } else {
            str = String.valueOf(C41700xl.m168831a(mo136150r(0, 47))).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: w */
    public abstract String mo136151w(Charset charset);

    /* renamed from: y */
    public abstract void mo136152y(C41335ih ihVar) throws IOException;
}
