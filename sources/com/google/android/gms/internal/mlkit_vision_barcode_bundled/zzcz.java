package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.nio.charset.Charset;

class zzcz extends zzcy {
    protected final byte[] zza;

    public zzcz(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    /* renamed from: A */
    public final int mo123190A(int i, int i2, int i3) {
        int t0 = mo123186t0() + i2;
        return C39060u5.m160888f(i, this.zza, t0, i3 + t0);
    }

    /* renamed from: H */
    public final zzdc mo123191H(int i, int i2) {
        int X = zzdc.m161076X(i, i2, mo123184k());
        if (X == 0) {
            return zzdc.f99077a;
        }
        return new zzcw(this.zza, mo123186t0() + i, X);
    }

    /* renamed from: M */
    public final String mo123192M(Charset charset) {
        return new String(this.zza, mo123186t0(), mo123184k(), charset);
    }

    /* renamed from: Q */
    public final void mo123193Q(C38914f1 f1Var) throws IOException {
        ((C39038s1) f1Var).mo123031H(this.zza, mo123186t0(), mo123184k());
    }

    /* renamed from: W */
    public final boolean mo123194W() {
        int t0 = mo123186t0();
        return C39060u5.m160891i(this.zza, t0, mo123184k() + t0);
    }

    /* renamed from: e */
    public byte mo123182e(int i) {
        return this.zza[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdc) || mo123184k() != ((zzdc) obj).mo123184k()) {
            return false;
        }
        if (mo123184k() == 0) {
            return true;
        }
        if (!(obj instanceof zzcz)) {
            return obj.equals(this);
        }
        zzcz zzcz = (zzcz) obj;
        int Y = mo123197Y();
        int Y2 = zzcz.mo123197Y();
        if (Y == 0 || Y2 == 0 || Y == Y2) {
            return mo123188s0(zzcz, 0, mo123184k());
        }
        return false;
    }

    /* renamed from: h */
    public byte mo123183h(int i) {
        return this.zza[i];
    }

    /* renamed from: k */
    public int mo123184k() {
        return this.zza.length;
    }

    /* renamed from: q */
    public void mo123185q(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    /* renamed from: s0 */
    public final boolean mo123188s0(zzdc zzdc, int i, int i2) {
        if (i2 <= zzdc.mo123184k()) {
            int i3 = i + i2;
            if (i3 > zzdc.mo123184k()) {
                int k = zzdc.mo123184k();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(k);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(zzdc instanceof zzcz)) {
                return zzdc.mo123191H(i, i3).equals(mo123191H(0, i2));
            } else {
                zzcz zzcz = (zzcz) zzdc;
                byte[] bArr = this.zza;
                byte[] bArr2 = zzcz.zza;
                int t0 = mo123186t0() + i2;
                int t02 = mo123186t0();
                int t03 = zzcz.mo123186t0() + i;
                while (t02 < t0) {
                    if (bArr[t02] != bArr2[t03]) {
                        return false;
                    }
                    t02++;
                    t03++;
                }
                return true;
            }
        } else {
            int k2 = mo123184k();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(k2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: t0 */
    public int mo123186t0() {
        return 0;
    }

    /* renamed from: y */
    public final int mo123196y(int i, int i2, int i3) {
        return C39084x2.m160968d(i, this.zza, mo123186t0() + i2, i3);
    }
}
