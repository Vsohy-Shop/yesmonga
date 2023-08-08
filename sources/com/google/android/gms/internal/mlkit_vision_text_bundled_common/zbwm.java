package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.nio.charset.Charset;

class zbwm extends zbwl {
    protected final byte[] zba;

    public zbwm(byte[] bArr) {
        bArr.getClass();
        this.zba = bArr;
    }

    /* renamed from: X */
    public int mo84988X() {
        return 0;
    }

    /* renamed from: e */
    public byte mo84989e(int i) {
        return this.zba[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbwp) || mo84991i() != ((zbwp) obj).mo84991i()) {
            return false;
        }
        if (mo84991i() == 0) {
            return true;
        }
        if (!(obj instanceof zbwm)) {
            return obj.equals(this);
        }
        zbwm zbwm = (zbwm) obj;
        int H = mo84998H();
        int H2 = zbwm.mo84998H();
        if (H != 0 && H2 != 0 && H != H2) {
            return false;
        }
        int i = mo84991i();
        if (i > zbwm.mo84991i()) {
            int i2 = mo84991i();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= zbwm.mo84991i()) {
            byte[] bArr = this.zba;
            byte[] bArr2 = zbwm.zba;
            zbwm.mo84988X();
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                if (bArr[i3] != bArr2[i4]) {
                    return false;
                }
                i3++;
                i4++;
            }
            return true;
        } else {
            int i5 = zbwm.mo84991i();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i5);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: h */
    public byte mo84990h(int i) {
        return this.zba[i];
    }

    /* renamed from: i */
    public int mo84991i() {
        return this.zba.length;
    }

    /* renamed from: k */
    public final int mo84993k(int i, int i2, int i3) {
        return C29909xz.m121346d(i, this.zba, 0, i3);
    }

    /* renamed from: q */
    public final zbwp mo84994q(int i, int i2) {
        int A = zbwp.m121495A(0, i2, mo84991i());
        if (A == 0) {
            return zbwp.f71626a;
        }
        return new zbwi(this.zba, 0, A);
    }

    /* renamed from: r */
    public final String mo84995r(Charset charset) {
        return new String(this.zba, 0, mo84991i(), charset);
    }

    /* renamed from: w */
    public final void mo84996w(C29132cy cyVar) throws IOException {
        ((C29612py) cyVar).mo84770K(this.zba, 0, mo84991i());
    }

    /* renamed from: y */
    public final boolean mo84997y() {
        return C29873x.m121300f(this.zba, 0, mo84991i());
    }
}
