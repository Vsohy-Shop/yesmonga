package com.google.zxing.aztec.encoder;

import com.google.zxing.common.C34709a;
import java.util.LinkedList;

/* renamed from: com.google.zxing.aztec.encoder.f */
public final class C34642f {

    /* renamed from: e */
    public static final C34642f f83807e = new C34642f(C34643g.f83812b, 0, 0, 0);

    /* renamed from: a */
    public final int f83808a;

    /* renamed from: b */
    public final C34643g f83809b;

    /* renamed from: c */
    public final int f83810c;

    /* renamed from: d */
    public final int f83811d;

    public C34642f(C34643g gVar, int i, int i2, int i3) {
        this.f83809b = gVar;
        this.f83808a = i;
        this.f83810c = i2;
        this.f83811d = i3;
    }

    /* renamed from: b */
    public static int m141307b(C34642f fVar) {
        int i = fVar.f83810c;
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }

    /* renamed from: a */
    public C34642f mo102463a(int i) {
        int i2;
        C34643g gVar = this.f83809b;
        int i3 = this.f83808a;
        int i4 = this.f83811d;
        if (i3 == 4 || i3 == 2) {
            int i5 = C34639d.f83800h[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVar = gVar.mo102474a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f83810c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else if (i8 == 62) {
            i2 = 9;
        } else {
            i2 = 8;
        }
        C34642f fVar = new C34642f(gVar, i3, i8 + 1, i4 + i2);
        if (fVar.f83810c == 2078) {
            return fVar.mo102464c(i + 1);
        }
        return fVar;
    }

    /* renamed from: c */
    public C34642f mo102464c(int i) {
        int i2 = this.f83810c;
        if (i2 == 0) {
            return this;
        }
        return new C34642f(this.f83809b.mo102475b(i - i2, i2), this.f83808a, 0, this.f83811d);
    }

    /* renamed from: d */
    public int mo102465d() {
        return this.f83810c;
    }

    /* renamed from: e */
    public int mo102466e() {
        return this.f83811d;
    }

    /* renamed from: f */
    public int mo102467f() {
        return this.f83808a;
    }

    /* renamed from: g */
    public C34643g mo102468g() {
        return this.f83809b;
    }

    /* renamed from: h */
    public boolean mo102469h(C34642f fVar) {
        int i = this.f83811d + (C34639d.f83800h[this.f83808a][fVar.f83808a] >> 16);
        int i2 = this.f83810c;
        int i3 = fVar.f83810c;
        if (i2 < i3) {
            i += m141307b(fVar) - m141307b(this);
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        if (i <= fVar.f83811d) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public C34642f mo102470i(int i, int i2) {
        int i3;
        int i4 = this.f83811d;
        C34643g gVar = this.f83809b;
        int i5 = this.f83808a;
        if (i != i5) {
            int i6 = C34639d.f83800h[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            gVar = gVar.mo102474a(i7, i8);
            i4 += i8;
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new C34642f(gVar.mo102474a(i2, i3), i, 0, i4 + i3);
    }

    /* renamed from: j */
    public C34642f mo102471j(int i, int i2) {
        int i3;
        C34643g gVar = this.f83809b;
        int i4 = this.f83808a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new C34642f(gVar.mo102474a(C34639d.f83802j[i4][i], i3).mo102474a(i2, 5), this.f83808a, 0, this.f83811d + i3 + 5);
    }

    /* renamed from: k */
    public C34709a mo102472k(byte[] bArr) {
        LinkedList<C34643g> linkedList = new LinkedList<>();
        for (C34643g gVar = mo102464c(bArr.length).f83809b; gVar != null; gVar = gVar.mo102476d()) {
            linkedList.addFirst(gVar);
        }
        C34709a aVar = new C34709a();
        for (C34643g c : linkedList) {
            c.mo102455c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C34639d.f83794b[this.f83808a], Integer.valueOf(this.f83811d), Integer.valueOf(this.f83810c)});
    }
}
