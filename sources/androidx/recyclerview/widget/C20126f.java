package androidx.recyclerview.widget;

import androidx.annotation.C0359n0;

/* renamed from: androidx.recyclerview.widget.f */
public class C20126f implements C20211u {

    /* renamed from: f */
    public static final int f51793f = 0;

    /* renamed from: g */
    public static final int f51794g = 1;

    /* renamed from: v */
    public static final int f51795v = 2;

    /* renamed from: w */
    public static final int f51796w = 3;

    /* renamed from: a */
    public final C20211u f51797a;

    /* renamed from: b */
    public int f51798b = 0;

    /* renamed from: c */
    public int f51799c = -1;

    /* renamed from: d */
    public int f51800d = -1;

    /* renamed from: e */
    public Object f51801e = null;

    public C20126f(@C0359n0 C20211u uVar) {
        this.f51797a = uVar;
    }

    /* renamed from: a */
    public void mo60230a(int i, int i2) {
        int i3;
        if (this.f51798b == 1 && i >= (i3 = this.f51799c)) {
            int i4 = this.f51800d;
            if (i <= i3 + i4) {
                this.f51800d = i4 + i2;
                this.f51799c = Math.min(i, i3);
                return;
            }
        }
        mo60356e();
        this.f51799c = i;
        this.f51800d = i2;
        this.f51798b = 1;
    }

    /* renamed from: b */
    public void mo60231b(int i, int i2) {
        int i3;
        if (this.f51798b != 2 || (i3 = this.f51799c) < i || i3 > i + i2) {
            mo60356e();
            this.f51799c = i;
            this.f51800d = i2;
            this.f51798b = 2;
            return;
        }
        this.f51800d += i2;
        this.f51799c = i;
    }

    /* renamed from: c */
    public void mo60232c(int i, int i2, Object obj) {
        int i3;
        if (this.f51798b == 3) {
            int i4 = this.f51799c;
            int i5 = this.f51800d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f51801e == obj) {
                this.f51799c = Math.min(i, i4);
                this.f51800d = Math.max(i5 + i4, i3) - this.f51799c;
                return;
            }
        }
        mo60356e();
        this.f51799c = i;
        this.f51800d = i2;
        this.f51801e = obj;
        this.f51798b = 3;
    }

    /* renamed from: d */
    public void mo60233d(int i, int i2) {
        mo60356e();
        this.f51797a.mo60233d(i, i2);
    }

    /* renamed from: e */
    public void mo60356e() {
        int i = this.f51798b;
        if (i != 0) {
            if (i == 1) {
                this.f51797a.mo60230a(this.f51799c, this.f51800d);
            } else if (i == 2) {
                this.f51797a.mo60231b(this.f51799c, this.f51800d);
            } else if (i == 3) {
                this.f51797a.mo60232c(this.f51799c, this.f51800d, this.f51801e);
            }
            this.f51801e = null;
            this.f51798b = 0;
        }
    }
}
