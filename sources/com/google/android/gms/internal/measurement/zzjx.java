package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

class zzjx extends zzjw {
    protected final byte[] zza;

    public zzjx(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    /* renamed from: W */
    public int mo137590W() {
        return 0;
    }

    /* renamed from: e */
    public byte mo137591e(int i) {
        return this.zza[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzka) || mo137593i() != ((zzka) obj).mo137593i()) {
            return false;
        }
        if (mo137593i() == 0) {
            return true;
        }
        if (!(obj instanceof zzjx)) {
            return obj.equals(this);
        }
        zzjx zzjx = (zzjx) obj;
        int H = mo137600H();
        int H2 = zzjx.mo137600H();
        if (H != 0 && H2 != 0 && H != H2) {
            return false;
        }
        int i = mo137593i();
        if (i > zzjx.mo137593i()) {
            throw new IllegalArgumentException("Length too large: " + i + mo137593i());
        } else if (i <= zzjx.mo137593i()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzjx.zza;
            zzjx.mo137590W();
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                if (bArr[i2] != bArr2[i3]) {
                    return false;
                }
                i2++;
                i3++;
            }
            return true;
        } else {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i + ", " + zzjx.mo137593i());
        }
    }

    /* renamed from: h */
    public byte mo137592h(int i) {
        return this.zza[i];
    }

    /* renamed from: i */
    public int mo137593i() {
        return this.zza.length;
    }

    /* renamed from: k */
    public final int mo137595k(int i, int i2, int i3) {
        return C41860aa.m169667b(i, this.zza, 0, i3);
    }

    /* renamed from: q */
    public final zzka mo137596q(int i, int i2) {
        int A = zzka.m171360A(0, i2, mo137593i());
        if (A == 0) {
            return zzka.f106708a;
        }
        return new zzju(this.zza, 0, A);
    }

    /* renamed from: r */
    public final String mo137597r(Charset charset) {
        return new String(this.zza, 0, mo137593i(), charset);
    }

    /* renamed from: w */
    public final void mo137598w(C42056l8 l8Var) throws IOException {
        ((C42261x8) l8Var).mo137455B(this.zza, 0, mo137593i());
    }

    /* renamed from: y */
    public final boolean mo137599y() {
        return C42078mc.m170569e(this.zza, 0, mo137593i());
    }
}
