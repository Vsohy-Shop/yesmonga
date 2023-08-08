package com.urbanairship.push.notifications;

import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.push.notifications.f */
public class C9507f {

    /* renamed from: a */
    public final List<C9504e> f25963a;

    /* renamed from: com.urbanairship.push.notifications.f$b */
    public static class C9509b {

        /* renamed from: a */
        public final List<C9504e> f25964a = new ArrayList();

        @C0359n0
        /* renamed from: a */
        public C9509b mo19311a(@C0359n0 C9504e eVar) {
            this.f25964a.add(eVar);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C9507f mo19312b() {
            return new C9507f(this.f25964a);
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C9509b m35651c() {
        return new C9509b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<androidx.core.app.C17075f2.C17077b> mo19309a(@androidx.annotation.C0359n0 android.content.Context r6, @androidx.annotation.C0359n0 com.urbanairship.push.notifications.C9510g r7, @androidx.annotation.C0363p0 java.lang.String r8) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = com.urbanairship.util.C9669o0.m36224e(r8)
            r2 = 0
            if (r1 != 0) goto L_0x0021
            com.urbanairship.json.JsonValue r1 = com.urbanairship.json.JsonValue.m34960C(r8)     // Catch:{ JsonException -> 0x0015 }
            com.urbanairship.json.b r8 = r1.mo18749A()     // Catch:{ JsonException -> 0x0015 }
            goto L_0x0022
        L_0x0015:
            r1 = move-exception
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r8
            java.lang.String r8 = "Failed to parse notification actions payload: %s"
            com.urbanairship.C36059m.m148411g(r1, r8, r3)
        L_0x0021:
            r8 = r2
        L_0x0022:
            java.util.List r1 = r5.mo19310b()
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x004e
            java.lang.Object r3 = r1.next()
            com.urbanairship.push.notifications.e r3 = (com.urbanairship.push.notifications.C9504e) r3
            if (r8 != 0) goto L_0x003a
            r4 = r2
            goto L_0x0046
        L_0x003a:
            java.lang.String r4 = r3.mo19297e()
            com.urbanairship.json.JsonValue r4 = r8.mo18801A(r4)
            java.lang.String r4 = r4.toString()
        L_0x0046:
            androidx.core.app.f2$b r3 = r3.mo19293a(r6, r4, r7)
            r0.add(r3)
            goto L_0x002a
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.push.notifications.C9507f.mo19309a(android.content.Context, com.urbanairship.push.notifications.g, java.lang.String):java.util.List");
    }

    @C0359n0
    /* renamed from: b */
    public List<C9504e> mo19310b() {
        return new ArrayList(this.f25963a);
    }

    public C9507f(@C0359n0 List<C9504e> list) {
        this.f25963a = new ArrayList(list);
    }
}
