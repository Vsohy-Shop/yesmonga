package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.C34710b;

/* renamed from: com.google.zxing.qrcode.decoder.a */
public final class C34866a {

    /* renamed from: a */
    public final C34710b f84727a;

    /* renamed from: b */
    public C34873g f84728b;

    /* renamed from: c */
    public C34871e f84729c;

    /* renamed from: d */
    public boolean f84730d;

    public C34866a(C34710b bVar) throws FormatException {
        int k = bVar.mo102670k();
        if (k < 21 || (k & 3) != 1) {
            throw FormatException.m141227a();
        }
        this.f84727a = bVar;
    }

    /* renamed from: a */
    public final int mo103159a(int i, int i2, int i3) {
        return this.f84730d ? this.f84727a.mo102666h(i2, i) : this.f84727a.mo102666h(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* renamed from: b */
    public void mo103160b() {
        int i = 0;
        while (i < this.f84727a.mo102674o()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f84727a.mo102670k(); i3++) {
                if (this.f84727a.mo102666h(i, i3) != this.f84727a.mo102666h(i3, i)) {
                    this.f84727a.mo102665f(i3, i);
                    this.f84727a.mo102665f(i, i3);
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public byte[] mo103161c() throws FormatException {
        int i;
        C34871e d = mo103162d();
        C34873g e = mo103163e();
        DataMask dataMask = DataMask.values()[d.mo103174c()];
        int k = this.f84727a.mo102670k();
        dataMask.mo103155g(this.f84727a, k);
        C34710b a = e.mo103180a();
        byte[] bArr = new byte[e.mo103184h()];
        int i2 = k - 1;
        boolean z = true;
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            if (i3 == 6) {
                i3--;
            }
            for (int i7 = 0; i7 < k; i7++) {
                if (z) {
                    i = i2 - i7;
                } else {
                    i = i7;
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i3 - i8;
                    if (!a.mo102666h(i9, i)) {
                        i5++;
                        i6 <<= 1;
                        if (this.f84727a.mo102666h(i9, i)) {
                            i6 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i4] = (byte) i6;
                            i4++;
                            i5 = 0;
                            i6 = 0;
                        }
                    }
                }
            }
            z = !z;
            i3 -= 2;
        }
        if (i4 == e.mo103184h()) {
            return bArr;
        }
        throw FormatException.m141227a();
    }

    /* renamed from: d */
    public C34871e mo103162d() throws FormatException {
        C34871e eVar = this.f84729c;
        if (eVar != null) {
            return eVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = mo103159a(i3, 8, i2);
        }
        int a = mo103159a(8, 7, mo103159a(8, 8, mo103159a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = mo103159a(8, i4, a);
        }
        int k = this.f84727a.mo102670k();
        int i5 = k - 7;
        for (int i6 = k - 1; i6 >= i5; i6--) {
            i = mo103159a(8, i6, i);
        }
        for (int i7 = k - 8; i7 < k; i7++) {
            i = mo103159a(i7, 8, i);
        }
        C34871e a2 = C34871e.m142464a(a, i);
        this.f84729c = a2;
        if (a2 != null) {
            return a2;
        }
        throw FormatException.m141227a();
    }

    /* renamed from: e */
    public C34873g mo103163e() throws FormatException {
        C34873g gVar = this.f84728b;
        if (gVar != null) {
            return gVar;
        }
        int k = this.f84727a.mo102670k();
        int i = (k - 17) / 4;
        if (i <= 6) {
            return C34873g.m142474i(i);
        }
        int i2 = k - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = k - 9; i6 >= i2; i6--) {
                i4 = mo103159a(i6, i5, i4);
            }
        }
        C34873g c = C34873g.m142472c(i4);
        if (c == null || c.mo103182e() != k) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = k - 9; i8 >= i2; i8--) {
                    i3 = mo103159a(i7, i8, i3);
                }
            }
            C34873g c2 = C34873g.m142472c(i3);
            if (c2 == null || c2.mo103182e() != k) {
                throw FormatException.m141227a();
            }
            this.f84728b = c2;
            return c2;
        }
        this.f84728b = c;
        return c;
    }

    /* renamed from: f */
    public void mo103164f() {
        if (this.f84729c != null) {
            DataMask.values()[this.f84729c.mo103174c()].mo103155g(this.f84727a, this.f84727a.mo102670k());
        }
    }

    /* renamed from: g */
    public void mo103165g(boolean z) {
        this.f84728b = null;
        this.f84729c = null;
        this.f84730d = z;
    }
}
