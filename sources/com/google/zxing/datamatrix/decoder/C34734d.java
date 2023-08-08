package com.google.zxing.datamatrix.decoder;

import com.contentsquare.android.api.C14092c;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.zxing.FormatException;

/* renamed from: com.google.zxing.datamatrix.decoder.d */
public final class C34734d {

    /* renamed from: h */
    public static final C34734d[] f84156h = m141736a();

    /* renamed from: a */
    public final int f84157a;

    /* renamed from: b */
    public final int f84158b;

    /* renamed from: c */
    public final int f84159c;

    /* renamed from: d */
    public final int f84160d;

    /* renamed from: e */
    public final int f84161e;

    /* renamed from: f */
    public final C34737c f84162f;

    /* renamed from: g */
    public final int f84163g;

    /* renamed from: com.google.zxing.datamatrix.decoder.d$b */
    public static final class C34736b {

        /* renamed from: a */
        public final int f84164a;

        /* renamed from: b */
        public final int f84165b;

        /* renamed from: a */
        public int mo102771a() {
            return this.f84164a;
        }

        /* renamed from: b */
        public int mo102772b() {
            return this.f84165b;
        }

        public C34736b(int i, int i2) {
            this.f84164a = i;
            this.f84165b = i2;
        }
    }

    public C34734d(int i, int i2, int i3, int i4, int i5, C34737c cVar) {
        this.f84157a = i;
        this.f84158b = i2;
        this.f84159c = i3;
        this.f84160d = i4;
        this.f84161e = i5;
        this.f84162f = cVar;
        int b = cVar.mo102774b();
        int i6 = 0;
        for (C34736b bVar : cVar.mo102773a()) {
            i6 += bVar.mo102771a() * (bVar.mo102772b() + b);
        }
        this.f84163g = i6;
    }

    /* renamed from: a */
    public static C34734d[] m141736a() {
        return new C34734d[]{new C34734d(1, 10, 10, 8, 8, new C34737c(5, new C34736b(1, 3))), new C34734d(2, 12, 12, 10, 10, new C34737c(7, new C34736b(1, 5))), new C34734d(3, 14, 14, 12, 12, new C34737c(10, new C34736b(1, 8))), new C34734d(4, 16, 16, 14, 14, new C34737c(12, new C34736b(1, 12))), new C34734d(5, 18, 18, 16, 16, new C34737c(14, new C34736b(1, 18))), new C34734d(6, 20, 20, 18, 18, new C34737c(18, new C34736b(1, 22))), new C34734d(7, 22, 22, 20, 20, new C34737c(20, new C34736b(1, 30))), new C34734d(8, 24, 24, 22, 22, new C34737c(24, new C34736b(1, 36))), new C34734d(9, 26, 26, 24, 24, new C34737c(28, new C34736b(1, 44))), new C34734d(10, 32, 32, 14, 14, new C34737c(36, new C34736b(1, 62))), new C34734d(11, 36, 36, 16, 16, new C34737c(42, new C34736b(1, 86))), new C34734d(12, 40, 40, 18, 18, new C34737c(48, new C34736b(1, 114))), new C34734d(13, 44, 44, 20, 20, new C34737c(56, new C34736b(1, C14092c.f34532K1))), new C34734d(14, 48, 48, 22, 22, new C34737c(68, new C34736b(1, C14092c.f34545P))), new C34734d(15, 52, 52, 24, 24, new C34737c(42, new C34736b(2, 102))), new C34734d(16, 64, 64, 14, 14, new C34737c(56, new C34736b(2, 140))), new C34734d(17, 72, 72, 16, 16, new C34737c(36, new C34736b(4, 92))), new C34734d(18, 80, 80, 18, 18, new C34737c(48, new C34736b(4, 114))), new C34734d(19, 88, 88, 20, 20, new C34737c(56, new C34736b(4, C14092c.f34532K1))), new C34734d(20, 96, 96, 22, 22, new C34737c(68, new C34736b(4, C14092c.f34545P))), new C34734d(21, 104, 104, 24, 24, new C34737c(56, new C34736b(6, C14092c.f34527J))), new C34734d(22, 120, 120, 18, 18, new C34737c(68, new C34736b(6, HideBottomViewOnScrollBehavior.f74656f))), new C34734d(23, C14092c.f34515F, C14092c.f34515F, 20, 20, new C34737c(62, new C34736b(8, 163))), new C34734d(24, C14092c.f34532K1, C14092c.f34532K1, 22, 22, new C34737c(62, new C34736b(8, C14092c.f34536M), new C34736b(2, 155))), new C34734d(25, 8, 18, 6, 16, new C34737c(7, new C34736b(1, 5))), new C34734d(26, 8, 32, 6, 14, new C34737c(11, new C34736b(1, 10))), new C34734d(27, 12, 26, 10, 24, new C34737c(14, new C34736b(1, 16))), new C34734d(28, 12, 36, 10, 16, new C34737c(18, new C34736b(1, 22))), new C34734d(29, 16, 36, 14, 16, new C34737c(24, new C34736b(1, 32))), new C34734d(30, 16, 48, 14, 22, new C34737c(28, new C34736b(1, 49)))};
    }

    /* renamed from: h */
    public static C34734d m141737h(int i, int i2) throws FormatException {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C34734d dVar : f84156h) {
                if (dVar.f84158b == i && dVar.f84159c == i2) {
                    return dVar;
                }
            }
            throw FormatException.m141227a();
        }
        throw FormatException.m141227a();
    }

    /* renamed from: b */
    public int mo102763b() {
        return this.f84161e;
    }

    /* renamed from: c */
    public int mo102764c() {
        return this.f84160d;
    }

    /* renamed from: d */
    public C34737c mo102765d() {
        return this.f84162f;
    }

    /* renamed from: e */
    public int mo102766e() {
        return this.f84159c;
    }

    /* renamed from: f */
    public int mo102767f() {
        return this.f84158b;
    }

    /* renamed from: g */
    public int mo102768g() {
        return this.f84163g;
    }

    /* renamed from: i */
    public int mo102769i() {
        return this.f84157a;
    }

    public String toString() {
        return String.valueOf(this.f84157a);
    }

    /* renamed from: com.google.zxing.datamatrix.decoder.d$c */
    public static final class C34737c {

        /* renamed from: a */
        public final int f84166a;

        /* renamed from: b */
        public final C34736b[] f84167b;

        /* renamed from: a */
        public C34736b[] mo102773a() {
            return this.f84167b;
        }

        /* renamed from: b */
        public int mo102774b() {
            return this.f84166a;
        }

        public C34737c(int i, C34736b bVar) {
            this.f84166a = i;
            this.f84167b = new C34736b[]{bVar};
        }

        public C34737c(int i, C34736b bVar, C34736b bVar2) {
            this.f84166a = i;
            this.f84167b = new C34736b[]{bVar, bVar2};
        }
    }
}
