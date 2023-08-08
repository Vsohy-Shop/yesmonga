package com.google.zxing.multi;

import com.google.zxing.C34644b;
import com.google.zxing.C34760j;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* renamed from: com.google.zxing.multi.a */
public final class C34768a implements C34760j {

    /* renamed from: a */
    public final C34760j f84307a;

    public C34768a(C34760j jVar) {
        this.f84307a = jVar;
    }

    /* renamed from: b */
    public static void m141953b(C34762l[] lVarArr, int i, int i2) {
        if (lVarArr != null) {
            for (int i3 = 0; i3 < lVarArr.length; i3++) {
                C34762l lVar = lVarArr[i3];
                if (lVar != null) {
                    lVarArr[i3] = new C34762l(lVar.mo102883c() + ((float) i), lVar.mo102884d() + ((float) i2));
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r5.f84307a.mo102419a(r6.mo102477a(r0, r1, r0, r1), r7);
        m141953b(r2.mo102877f(), r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r2 = r0 / 2;
        r3 = r1 / 2;
        r6 = r5.f84307a.mo102419a(r6.mo102477a(r2, r3, r0, r1), r7);
        m141953b(r6.mo102877f(), r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r3 = r5.f84307a.mo102419a(r6.mo102477a(r0, 0, r0, r1), r7);
        m141953b(r3.mo102877f(), r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = r5.f84307a.mo102419a(r6.mo102477a(0, r1, r0, r1), r7);
        m141953b(r3.mo102877f(), 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0018 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C34761k mo102419a(com.google.zxing.C34644b r6, java.util.Map<com.google.zxing.DecodeHintType, ?> r7) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            r5 = this;
            int r0 = r6.mo102481e()
            int r1 = r6.mo102480d()
            int r0 = r0 / 2
            int r1 = r1 / 2
            r2 = 0
            com.google.zxing.j r3 = r5.f84307a     // Catch:{ NotFoundException -> 0x0018 }
            com.google.zxing.b r4 = r6.mo102477a(r2, r2, r0, r1)     // Catch:{ NotFoundException -> 0x0018 }
            com.google.zxing.k r6 = r3.mo102419a(r4, r7)     // Catch:{ NotFoundException -> 0x0018 }
            return r6
        L_0x0018:
            com.google.zxing.j r3 = r5.f84307a     // Catch:{ NotFoundException -> 0x002a }
            com.google.zxing.b r4 = r6.mo102477a(r0, r2, r0, r1)     // Catch:{ NotFoundException -> 0x002a }
            com.google.zxing.k r3 = r3.mo102419a(r4, r7)     // Catch:{ NotFoundException -> 0x002a }
            com.google.zxing.l[] r4 = r3.mo102877f()     // Catch:{ NotFoundException -> 0x002a }
            m141953b(r4, r0, r2)     // Catch:{ NotFoundException -> 0x002a }
            return r3
        L_0x002a:
            com.google.zxing.j r3 = r5.f84307a     // Catch:{ NotFoundException -> 0x003c }
            com.google.zxing.b r4 = r6.mo102477a(r2, r1, r0, r1)     // Catch:{ NotFoundException -> 0x003c }
            com.google.zxing.k r3 = r3.mo102419a(r4, r7)     // Catch:{ NotFoundException -> 0x003c }
            com.google.zxing.l[] r4 = r3.mo102877f()     // Catch:{ NotFoundException -> 0x003c }
            m141953b(r4, r2, r1)     // Catch:{ NotFoundException -> 0x003c }
            return r3
        L_0x003c:
            com.google.zxing.j r2 = r5.f84307a     // Catch:{ NotFoundException -> 0x004e }
            com.google.zxing.b r3 = r6.mo102477a(r0, r1, r0, r1)     // Catch:{ NotFoundException -> 0x004e }
            com.google.zxing.k r2 = r2.mo102419a(r3, r7)     // Catch:{ NotFoundException -> 0x004e }
            com.google.zxing.l[] r3 = r2.mo102877f()     // Catch:{ NotFoundException -> 0x004e }
            m141953b(r3, r0, r1)     // Catch:{ NotFoundException -> 0x004e }
            return r2
        L_0x004e:
            int r2 = r0 / 2
            int r3 = r1 / 2
            com.google.zxing.b r6 = r6.mo102477a(r2, r3, r0, r1)
            com.google.zxing.j r0 = r5.f84307a
            com.google.zxing.k r6 = r0.mo102419a(r6, r7)
            com.google.zxing.l[] r7 = r6.mo102877f()
            m141953b(r7, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.multi.C34768a.mo102419a(com.google.zxing.b, java.util.Map):com.google.zxing.k");
    }

    /* renamed from: c */
    public C34761k mo102420c(C34644b bVar) throws NotFoundException, ChecksumException, FormatException {
        return mo102419a(bVar, (Map<DecodeHintType, ?>) null);
    }

    public void reset() {
        this.f84307a.reset();
    }
}
