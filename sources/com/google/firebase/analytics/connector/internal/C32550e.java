package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.C30638a;
import com.google.firebase.analytics.connector.C32537a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.e */
public final class C32550e implements C32546a {

    /* renamed from: a */
    public final Set f79013a = new HashSet();

    /* renamed from: b */
    public final C32537a.C32539b f79014b;

    /* renamed from: c */
    public final C30638a f79015c;

    /* renamed from: d */
    public final C32549d f79016d;

    public C32550e(C30638a aVar, C32537a.C32539b bVar) {
        this.f79014b = bVar;
        this.f79015c = aVar;
        C32549d dVar = new C32549d(this);
        this.f79016d = dVar;
        aVar.mo86785s(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0010 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94660a(java.util.Set r10) {
        /*
            r9 = this;
            java.util.Set r0 = r9.f79013a
            r0.clear()
            java.util.Set r0 = r9.f79013a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0010:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r1.size()
            r4 = 50
            if (r3 < r4) goto L_0x0026
            goto L_0x00a0
        L_0x0026:
            int r3 = com.google.firebase.analytics.connector.internal.C32548c.f79011g
            r3 = 95
            r4 = 0
            if (r2 != 0) goto L_0x002f
        L_0x002d:
            r5 = r4
            goto L_0x0062
        L_0x002f:
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0036
            goto L_0x002d
        L_0x0036:
            int r5 = r2.codePointAt(r4)
            boolean r6 = java.lang.Character.isLetter(r5)
            if (r6 != 0) goto L_0x0044
            if (r5 == r3) goto L_0x0043
            goto L_0x002d
        L_0x0043:
            r5 = r3
        L_0x0044:
            int r6 = r2.length()
            int r5 = java.lang.Character.charCount(r5)
        L_0x004c:
            if (r5 >= r6) goto L_0x0061
            int r7 = r2.codePointAt(r5)
            if (r7 == r3) goto L_0x005b
            boolean r8 = java.lang.Character.isLetterOrDigit(r7)
            if (r8 != 0) goto L_0x005b
            goto L_0x002d
        L_0x005b:
            int r7 = java.lang.Character.charCount(r7)
            int r5 = r5 + r7
            goto L_0x004c
        L_0x0061:
            r5 = 1
        L_0x0062:
            if (r5 == 0) goto L_0x0010
            int r5 = r2.length()
            if (r5 == 0) goto L_0x0010
            int r4 = r2.codePointAt(r4)
            boolean r5 = java.lang.Character.isLetter(r4)
            if (r5 == 0) goto L_0x0010
            int r5 = r2.length()
            int r4 = java.lang.Character.charCount(r4)
        L_0x007c:
            if (r4 >= r5) goto L_0x0090
            int r6 = r2.codePointAt(r4)
            if (r6 == r3) goto L_0x008a
            boolean r7 = java.lang.Character.isLetterOrDigit(r6)
            if (r7 == 0) goto L_0x0010
        L_0x008a:
            int r6 = java.lang.Character.charCount(r6)
            int r4 = r4 + r6
            goto L_0x007c
        L_0x0090:
            java.lang.String r3 = com.google.android.gms.measurement.internal.C30706e6.m123695b(r2)
            if (r3 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r2 = r3
        L_0x0098:
            com.google.android.gms.common.internal.C40843u.m166202l(r2)
            r1.add(r2)
            goto L_0x0010
        L_0x00a0:
            r0.addAll(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.C32550e.mo94660a(java.util.Set):void");
    }

    /* renamed from: d */
    public final void mo94661d() {
        this.f79013a.clear();
    }

    public final C32537a.C32539b zza() {
        return this.f79014b;
    }
}
