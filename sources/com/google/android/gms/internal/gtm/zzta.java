package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.charset.Charset;

class zzta extends zzsz {
    protected final byte[] zza;

    public zzta(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    /* renamed from: A */
    public final boolean mo136147A() {
        int k0 = mo136146k0();
        return C41461nm.m168097f(this.zza, k0, mo136144i() + k0);
    }

    /* renamed from: e */
    public byte mo136142e(int i) {
        return this.zza[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zztd) || mo136144i() != ((zztd) obj).mo136144i()) {
            return false;
        }
        if (mo136144i() == 0) {
            return true;
        }
        if (!(obj instanceof zzta)) {
            return obj.equals(this);
        }
        zzta zzta = (zzta) obj;
        int M = mo136153M();
        int M2 = zzta.mo136153M();
        if (M != 0 && M2 != 0 && M != M2) {
            return false;
        }
        int i = mo136144i();
        if (i > zzta.mo136144i()) {
            int i2 = mo136144i();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= zzta.mo136144i()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzta.zza;
            int k0 = mo136146k0() + i;
            int k02 = mo136146k0();
            int k03 = zzta.mo136146k0();
            while (k02 < k0) {
                if (bArr[k02] != bArr2[k03]) {
                    return false;
                }
                k02++;
                k03++;
            }
            return true;
        } else {
            int i3 = zzta.mo136144i();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: h */
    public byte mo136143h(int i) {
        return this.zza[i];
    }

    /* renamed from: i */
    public int mo136144i() {
        return this.zza.length;
    }

    /* renamed from: k */
    public void mo136145k(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    /* renamed from: k0 */
    public int mo136146k0() {
        return 0;
    }

    /* renamed from: q */
    public final int mo136149q(int i, int i2, int i3) {
        return C41650vj.m168602d(i, this.zza, mo136146k0(), i3);
    }

    /* renamed from: r */
    public final zztd mo136150r(int i, int i2) {
        int H = zztd.m168977H(0, i2, mo136144i());
        if (H == 0) {
            return zztd.f105744a;
        }
        return new zzsx(this.zza, mo136146k0(), H);
    }

    /* renamed from: w */
    public final String mo136151w(Charset charset) {
        return new String(this.zza, mo136146k0(), mo136144i(), charset);
    }

    /* renamed from: y */
    public final void mo136152y(C41335ih ihVar) throws IOException {
        ((C41720yh) ihVar).mo136109H(this.zza, mo136146k0(), mo136144i());
    }
}
