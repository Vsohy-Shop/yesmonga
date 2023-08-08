package com.google.zxing.pdf417.decoder;

import com.google.zxing.C34762l;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;

/* renamed from: com.google.zxing.pdf417.decoder.c */
public final class C34837c {

    /* renamed from: a */
    public final C34710b f84596a;

    /* renamed from: b */
    public final C34762l f84597b;

    /* renamed from: c */
    public final C34762l f84598c;

    /* renamed from: d */
    public final C34762l f84599d;

    /* renamed from: e */
    public final C34762l f84600e;

    /* renamed from: f */
    public final int f84601f;

    /* renamed from: g */
    public final int f84602g;

    /* renamed from: h */
    public final int f84603h;

    /* renamed from: i */
    public final int f84604i;

    public C34837c(C34710b bVar, C34762l lVar, C34762l lVar2, C34762l lVar3, C34762l lVar4) throws NotFoundException {
        boolean z = false;
        boolean z2 = lVar == null || lVar2 == null;
        z = (lVar3 == null || lVar4 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                lVar = new C34762l(0.0f, lVar3.mo102884d());
                lVar2 = new C34762l(0.0f, lVar4.mo102884d());
            } else if (z) {
                lVar3 = new C34762l((float) (bVar.mo102674o() - 1), lVar.mo102884d());
                lVar4 = new C34762l((float) (bVar.mo102674o() - 1), lVar2.mo102884d());
            }
            this.f84596a = bVar;
            this.f84597b = lVar;
            this.f84598c = lVar2;
            this.f84599d = lVar3;
            this.f84600e = lVar4;
            this.f84601f = (int) Math.min(lVar.mo102883c(), lVar2.mo102883c());
            this.f84602g = (int) Math.max(lVar3.mo102883c(), lVar4.mo102883c());
            this.f84603h = (int) Math.min(lVar.mo102884d(), lVar3.mo102884d());
            this.f84604i = (int) Math.max(lVar2.mo102884d(), lVar4.mo102884d());
            return;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: j */
    public static C34837c m142263j(C34837c cVar, C34837c cVar2) throws NotFoundException {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new C34837c(cVar.f84596a, cVar.f84597b, cVar.f84598c, cVar2.f84599d, cVar2.f84600e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.pdf417.decoder.C34837c mo103054a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            com.google.zxing.l r0 = r12.f84597b
            com.google.zxing.l r1 = r12.f84598c
            com.google.zxing.l r2 = r12.f84599d
            com.google.zxing.l r3 = r12.f84600e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo102884d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            com.google.zxing.l r13 = new com.google.zxing.l
            float r4 = r4.mo102883c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            com.google.zxing.l r13 = r12.f84598c
            goto L_0x0034
        L_0x0032:
            com.google.zxing.l r13 = r12.f84600e
        L_0x0034:
            float r0 = r13.mo102884d()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.google.zxing.common.b r14 = r12.f84596a
            int r14 = r14.mo102670k()
            if (r0 < r14) goto L_0x004a
            com.google.zxing.common.b r14 = r12.f84596a
            int r14 = r14.mo102670k()
            int r0 = r14 + -1
        L_0x004a:
            com.google.zxing.l r14 = new com.google.zxing.l
            float r13 = r13.mo102883c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            com.google.zxing.pdf417.decoder.c r13 = new com.google.zxing.pdf417.decoder.c
            com.google.zxing.common.b r7 = r12.f84596a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.C34837c.mo103054a(int, int, boolean):com.google.zxing.pdf417.decoder.c");
    }

    /* renamed from: b */
    public C34762l mo103055b() {
        return this.f84598c;
    }

    /* renamed from: c */
    public C34762l mo103056c() {
        return this.f84600e;
    }

    /* renamed from: d */
    public int mo103057d() {
        return this.f84602g;
    }

    /* renamed from: e */
    public int mo103058e() {
        return this.f84604i;
    }

    /* renamed from: f */
    public int mo103059f() {
        return this.f84601f;
    }

    /* renamed from: g */
    public int mo103060g() {
        return this.f84603h;
    }

    /* renamed from: h */
    public C34762l mo103061h() {
        return this.f84597b;
    }

    /* renamed from: i */
    public C34762l mo103062i() {
        return this.f84599d;
    }

    public C34837c(C34837c cVar) {
        this.f84596a = cVar.f84596a;
        this.f84597b = cVar.mo103061h();
        this.f84598c = cVar.mo103055b();
        this.f84599d = cVar.mo103062i();
        this.f84600e = cVar.mo103056c();
        this.f84601f = cVar.mo103059f();
        this.f84602g = cVar.mo103057d();
        this.f84603h = cVar.mo103060g();
        this.f84604i = cVar.mo103058e();
    }
}
