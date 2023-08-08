package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.contentsquare.android.api.C14092c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

final class zzgh extends zzdc {

    /* renamed from: d */
    public static final int[] f99145d = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, C14092c.f34532K1, 233, 377, C16717v.C16722e.f42273z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    /* access modifiers changed from: private */
    public final zzdc zzd;
    /* access modifiers changed from: private */
    public final zzdc zze;
    private final int zzf;
    private final int zzg;

    /* renamed from: s0 */
    public static zzdc m161115s0(zzdc zzdc, zzdc zzdc2) {
        if (zzdc2.mo123184k() == 0) {
            return zzdc;
        }
        if (zzdc.mo123184k() == 0) {
            return zzdc2;
        }
        int k = zzdc.mo123184k() + zzdc2.mo123184k();
        if (k < 128) {
            return m161116t0(zzdc, zzdc2);
        }
        if (zzdc instanceof zzgh) {
            zzgh zzgh = (zzgh) zzdc;
            if (zzgh.zze.mo123184k() + zzdc2.mo123184k() < 128) {
                return new zzgh(zzgh.zzd, m161116t0(zzgh.zze, zzdc2));
            } else if (zzgh.zzd.mo123187r() > zzgh.zze.mo123187r() && zzgh.zzg > zzdc2.mo123187r()) {
                return new zzgh(zzgh.zzd, new zzgh(zzgh.zze, zzdc2));
            }
        }
        if (k >= m161117u0(Math.max(zzdc.mo123187r(), zzdc2.mo123187r()) + 1)) {
            return new zzgh(zzdc, zzdc2);
        }
        return C38977l4.m160591a(new C38977l4((C38967k4) null), zzdc, zzdc2);
    }

    /* renamed from: t0 */
    public static zzdc m161116t0(zzdc zzdc, zzdc zzdc2) {
        int k = zzdc.mo123184k();
        int k2 = zzdc2.mo123184k();
        byte[] bArr = new byte[(k + k2)];
        zzdc.mo123203p0(bArr, 0, 0, k);
        zzdc2.mo123203p0(bArr, 0, k, k2);
        return new zzcz(bArr);
    }

    /* renamed from: u0 */
    public static int m161117u0(int i) {
        int[] iArr = f99145d;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* renamed from: A */
    public final int mo123190A(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.mo123190A(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.mo123190A(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.mo123190A(this.zzd.mo123190A(i, i2, i5), 0, i3 - i5);
    }

    /* renamed from: H */
    public final zzdc mo123191H(int i, int i2) {
        int X = zzdc.m161076X(i, i2, this.zzc);
        if (X == 0) {
            return zzdc.f99077a;
        }
        if (X == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.mo123191H(i, i2);
        }
        if (i >= i3) {
            return this.zze.mo123191H(i - i3, i2 - i3);
        }
        zzdc zzdc = this.zzd;
        return new zzgh(zzdc.mo123191H(i, zzdc.mo123184k()), this.zze.mo123191H(0, i2 - this.zzf));
    }

    /* renamed from: M */
    public final String mo123192M(Charset charset) {
        return new String(mo123204r0(), charset);
    }

    /* renamed from: Q */
    public final void mo123193Q(C38914f1 f1Var) throws IOException {
        this.zzd.mo123193Q(f1Var);
        this.zze.mo123193Q(f1Var);
    }

    /* renamed from: W */
    public final boolean mo123194W() {
        int A = this.zzd.mo123190A(0, 0, this.zzf);
        zzdc zzdc = this.zze;
        if (zzdc.mo123190A(A, 0, zzdc.mo123184k()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final byte mo123182e(int i) {
        zzdc.m161081o0(i, this.zzc);
        return mo123183h(i);
    }

    /* renamed from: e0 */
    public final C38964k1 mo123198e0() {
        return new C38957j4(this);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdc)) {
            return false;
        }
        zzdc zzdc = (zzdc) obj;
        if (this.zzc != zzdc.mo123184k()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int Y = mo123197Y();
        int Y2 = zzdc.mo123197Y();
        if (Y != 0 && Y2 != 0 && Y != Y2) {
            return false;
        }
        C38996n4 n4Var = new C38996n4(this, (C38987m4) null);
        zzcy b = n4Var.next();
        C38996n4 n4Var2 = new C38996n4(zzdc, (C38987m4) null);
        zzcy b2 = n4Var2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int k = b.mo123184k() - i;
            int k2 = b2.mo123184k() - i2;
            int min = Math.min(k, k2);
            if (i == 0) {
                z = b.mo123188s0(b2, i2, min);
            } else {
                z = b2.mo123188s0(b, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 < i4) {
                if (min == k) {
                    b = n4Var.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == k2) {
                    b2 = n4Var2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: h */
    public final byte mo123183h(int i) {
        int i2 = this.zzf;
        if (i < i2) {
            return this.zzd.mo123183h(i);
        }
        return this.zze.mo123183h(i - i2);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C38957j4(this);
    }

    /* renamed from: k */
    public final int mo123184k() {
        return this.zzc;
    }

    /* renamed from: q */
    public final void mo123185q(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i + i3 <= i4) {
            this.zzd.mo123185q(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.zze.mo123185q(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.zzd.mo123185q(bArr, i, i2, i5);
            this.zze.mo123185q(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* renamed from: r */
    public final int mo123187r() {
        return this.zzg;
    }

    /* renamed from: w */
    public final boolean mo123189w() {
        if (this.zzc >= m161117u0(this.zzg)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final int mo123196y(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.mo123196y(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.mo123196y(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.mo123196y(this.zzd.mo123196y(i, i2, i5), 0, i3 - i5);
    }

    public zzgh(zzdc zzdc, zzdc zzdc2) {
        this.zzd = zzdc;
        this.zze = zzdc2;
        int k = zzdc.mo123184k();
        this.zzf = k;
        this.zzc = k + zzdc2.mo123184k();
        this.zzg = Math.max(zzdc.mo123187r(), zzdc2.mo123187r()) + 1;
    }
}
