package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.material.badge.C31132a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzdc implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    public static final zzdc f99077a = new zzcz(C39084x2.f98962c);

    /* renamed from: b */
    public static final Comparator<zzdc> f99078b = new C38944i1();

    /* renamed from: c */
    public static final C38993n1 f99079c = new C38993n1((C38984m1) null);
    private int zzc = 0;

    static {
        int i = C38874b1.f98808a;
    }

    /* renamed from: X */
    public static int m161076X(int i, int i2, int i3) {
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

    /* renamed from: f0 */
    public static zzdc m161077f0(byte[] bArr, int i, int i2) {
        m161076X(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzcz(bArr2);
    }

    /* renamed from: i */
    public static zzdc m161078i(Iterator<zzdc> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            zzdc i3 = m161078i(it, i2);
            zzdc i4 = m161078i(it, i - i2);
            if (Integer.MAX_VALUE - i3.mo123184k() >= i4.mo123184k()) {
                return zzgh.m161115s0(i3, i4);
            }
            int k = i3.mo123184k();
            int k2 = i4.mo123184k();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(k);
            sb.append(C31132a.f74628J0);
            sb.append(k2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: k0 */
    public static zzdc m161079k0(String str) {
        return new zzcz(str.getBytes(C39084x2.f98960a));
    }

    /* renamed from: l0 */
    public static zzdc m161080l0(InputStream inputStream) throws IOException {
        zzdc zzdc;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                zzdc = null;
            } else {
                zzdc = m161077f0(bArr, 0, i2);
            }
            if (zzdc == null) {
                break;
            }
            arrayList.add(zzdc);
            i = Math.min(i + i, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f99077a;
        }
        return m161078i(arrayList.iterator(), size);
    }

    /* renamed from: o0 */
    public static void m161081o0(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: A */
    public abstract int mo123190A(int i, int i2, int i3);

    /* renamed from: H */
    public abstract zzdc mo123191H(int i, int i2);

    /* renamed from: M */
    public abstract String mo123192M(Charset charset);

    /* renamed from: Q */
    public abstract void mo123193Q(C38914f1 f1Var) throws IOException;

    /* renamed from: W */
    public abstract boolean mo123194W();

    /* renamed from: Y */
    public final int mo123197Y() {
        return this.zzc;
    }

    /* renamed from: e */
    public abstract byte mo123182e(int i);

    /* renamed from: e0 */
    public C38964k1 iterator() {
        return new C38924g1(this);
    }

    public abstract boolean equals(Object obj);

    /* renamed from: h */
    public abstract byte mo123183h(int i);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int k = mo123184k();
            i = mo123196y(k, 0, k);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* renamed from: k */
    public abstract int mo123184k();

    /* renamed from: m0 */
    public final String mo123201m0(Charset charset) {
        if (mo123184k() == 0) {
            return "";
        }
        return mo123192M(charset);
    }

    /* renamed from: n0 */
    public final String mo123202n0() {
        return mo123201m0(C39084x2.f98960a);
    }

    @Deprecated
    /* renamed from: p0 */
    public final void mo123203p0(byte[] bArr, int i, int i2, int i3) {
        m161076X(0, i3, mo123184k());
        m161076X(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo123185q(bArr, 0, i2, i3);
        }
    }

    /* renamed from: q */
    public abstract void mo123185q(byte[] bArr, int i, int i2, int i3);

    /* renamed from: r */
    public abstract int mo123187r();

    /* renamed from: r0 */
    public final byte[] mo123204r0() {
        int k = mo123184k();
        if (k == 0) {
            return C39084x2.f98962c;
        }
        byte[] bArr = new byte[k];
        mo123185q(bArr, 0, 0, k);
        return bArr;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo123184k());
        if (mo123184k() <= 50) {
            str = C38908e5.m160482a(this);
        } else {
            str = String.valueOf(C38908e5.m160482a(mo123191H(0, 47))).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: w */
    public abstract boolean mo123189w();

    /* renamed from: y */
    public abstract int mo123196y(int i, int i2, int i3);
}
