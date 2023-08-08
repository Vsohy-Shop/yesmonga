package com.journeyapps.barcodescanner;

import androidx.annotation.C0359n0;

/* renamed from: com.journeyapps.barcodescanner.u */
public class C34959u implements Comparable<C34959u> {

    /* renamed from: a */
    public final int f85046a;

    /* renamed from: b */
    public final int f85047b;

    public C34959u(int i, int i2) {
        this.f85046a = i;
        this.f85047b = i2;
    }

    /* renamed from: b */
    public int compareTo(@C0359n0 C34959u uVar) {
        int i = this.f85047b * this.f85046a;
        int i2 = uVar.f85047b * uVar.f85046a;
        if (i2 < i) {
            return 1;
        }
        if (i2 > i) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C34959u uVar = (C34959u) obj;
        if (this.f85046a == uVar.f85046a && this.f85047b == uVar.f85047b) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo103553g(C34959u uVar) {
        return this.f85046a <= uVar.f85046a && this.f85047b <= uVar.f85047b;
    }

    public int hashCode() {
        return (this.f85046a * 31) + this.f85047b;
    }

    /* renamed from: q */
    public C34959u mo103555q() {
        return new C34959u(this.f85047b, this.f85046a);
    }

    /* renamed from: r */
    public C34959u mo103556r(int i, int i2) {
        return new C34959u((this.f85046a * i) / i2, (this.f85047b * i) / i2);
    }

    public String toString() {
        return this.f85046a + "x" + this.f85047b;
    }

    /* renamed from: w */
    public C34959u mo103558w(C34959u uVar) {
        int i = this.f85046a;
        int i2 = uVar.f85047b;
        int i3 = i * i2;
        int i4 = uVar.f85046a;
        int i5 = this.f85047b;
        if (i3 <= i4 * i5) {
            return new C34959u(i4, (i5 * i4) / i);
        }
        return new C34959u((i * i2) / i5, i2);
    }

    /* renamed from: y */
    public C34959u mo103559y(C34959u uVar) {
        int i = this.f85046a;
        int i2 = uVar.f85047b;
        int i3 = i * i2;
        int i4 = uVar.f85046a;
        int i5 = this.f85047b;
        if (i3 >= i4 * i5) {
            return new C34959u(i4, (i5 * i4) / i);
        }
        return new C34959u((i * i2) / i5, i2);
    }
}
