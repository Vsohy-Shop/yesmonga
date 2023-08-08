package androidx.constraintlayout.core.widgets;

/* renamed from: androidx.constraintlayout.core.widgets.k */
public class C16807k {

    /* renamed from: a */
    public int f43053a;

    /* renamed from: b */
    public int f43054b;

    /* renamed from: c */
    public int f43055c;

    /* renamed from: d */
    public int f43056d;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r3 = r2.f43054b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo49814a(int r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f43053a
            if (r3 < r0) goto L_0x0014
            int r1 = r2.f43055c
            int r0 = r0 + r1
            if (r3 >= r0) goto L_0x0014
            int r3 = r2.f43054b
            if (r4 < r3) goto L_0x0014
            int r0 = r2.f43056d
            int r3 = r3 + r0
            if (r4 >= r3) goto L_0x0014
            r3 = 1
            goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C16807k.mo49814a(int, int):boolean");
    }

    /* renamed from: b */
    public int mo49815b() {
        return (this.f43053a + this.f43055c) / 2;
    }

    /* renamed from: c */
    public int mo49816c() {
        return (this.f43054b + this.f43056d) / 2;
    }

    /* renamed from: d */
    public void mo49817d(int i, int i2) {
        this.f43053a -= i;
        this.f43054b -= i2;
        this.f43055c += i * 2;
        this.f43056d += i2 * 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r3.f43054b;
        r1 = r4.f43054b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo49818e(androidx.constraintlayout.core.widgets.C16807k r4) {
        /*
            r3 = this;
            int r0 = r3.f43053a
            int r1 = r4.f43053a
            if (r0 < r1) goto L_0x0018
            int r2 = r4.f43055c
            int r1 = r1 + r2
            if (r0 >= r1) goto L_0x0018
            int r0 = r3.f43054b
            int r1 = r4.f43054b
            if (r0 < r1) goto L_0x0018
            int r4 = r4.f43056d
            int r1 = r1 + r4
            if (r0 >= r1) goto L_0x0018
            r4 = 1
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C16807k.mo49818e(androidx.constraintlayout.core.widgets.k):boolean");
    }

    /* renamed from: f */
    public void mo49819f(int i, int i2, int i3, int i4) {
        this.f43053a = i;
        this.f43054b = i2;
        this.f43055c = i3;
        this.f43056d = i4;
    }
}
