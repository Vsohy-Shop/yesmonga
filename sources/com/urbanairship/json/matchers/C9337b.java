package com.urbanairship.json.matchers;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9335g;
import com.urbanairship.json.JsonValue;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.json.matchers.b */
public class C9337b extends C9335g {
    @C0359n0

    /* renamed from: b */
    public static final String f25466b = "equals";

    /* renamed from: a */
    public final JsonValue f25467a;

    public C9337b(@C0359n0 JsonValue jsonValue) {
        this.f25467a = jsonValue;
    }

    /* renamed from: c */
    public boolean mo18851c(@C0359n0 JsonValue jsonValue, boolean z) {
        return mo18857l(this.f25467a, jsonValue, z);
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f25467a.equals(((C9337b) obj).f25467a);
    }

    public int hashCode() {
        return this.f25467a.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18857l(@androidx.annotation.C0363p0 com.urbanairship.json.JsonValue r6, @androidx.annotation.C0363p0 com.urbanairship.json.JsonValue r7, boolean r8) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0004
            com.urbanairship.json.JsonValue r6 = com.urbanairship.json.JsonValue.f25436b
        L_0x0004:
            if (r7 != 0) goto L_0x0008
            com.urbanairship.json.JsonValue r7 = com.urbanairship.json.JsonValue.f25436b
        L_0x0008:
            if (r8 != 0) goto L_0x000f
            boolean r6 = r6.equals(r7)
            return r6
        L_0x000f:
            boolean r0 = r6.mo18783y()
            r1 = 0
            if (r0 == 0) goto L_0x002a
            boolean r8 = r7.mo18783y()
            if (r8 != 0) goto L_0x001d
            return r1
        L_0x001d:
            java.lang.String r6 = r6.mo18750B()
            java.lang.String r7 = r7.mo18769l()
            boolean r6 = r6.equalsIgnoreCase(r7)
            return r6
        L_0x002a:
            boolean r0 = r6.mo18776t()
            r2 = 1
            if (r0 == 0) goto L_0x0065
            boolean r0 = r7.mo18776t()
            if (r0 != 0) goto L_0x0038
            return r1
        L_0x0038:
            com.urbanairship.json.a r6 = r6.mo18784z()
            com.urbanairship.json.a r7 = r7.mo18784z()
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r1
        L_0x004c:
            int r3 = r6.size()
            if (r0 >= r3) goto L_0x0064
            com.urbanairship.json.JsonValue r3 = r6.mo18791h(r0)
            com.urbanairship.json.JsonValue r4 = r7.mo18791h(r0)
            boolean r3 = r5.mo18857l(r3, r4, r8)
            if (r3 != 0) goto L_0x0061
            return r1
        L_0x0061:
            int r0 = r0 + 1
            goto L_0x004c
        L_0x0064:
            return r2
        L_0x0065:
            boolean r0 = r6.mo18778u()
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r7.mo18778u()
            if (r0 != 0) goto L_0x0072
            return r1
        L_0x0072:
            com.urbanairship.json.b r6 = r6.mo18749A()
            com.urbanairship.json.b r7 = r7.mo18749A()
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L_0x0085
            return r1
        L_0x0085:
            java.util.Iterator r6 = r6.iterator()
        L_0x0089:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r7.mo18805e(r3)
            if (r3 != 0) goto L_0x00a2
            return r1
        L_0x00a2:
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            com.urbanairship.json.JsonValue r3 = r7.mo18812k(r3)
            java.lang.Object r0 = r0.getValue()
            com.urbanairship.json.JsonValue r0 = (com.urbanairship.json.JsonValue) r0
            boolean r0 = r5.mo18857l(r3, r0, r8)
            if (r0 != 0) goto L_0x0089
            return r1
        L_0x00b9:
            return r2
        L_0x00ba:
            boolean r6 = r6.equals(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.json.matchers.C9337b.mo18857l(com.urbanairship.json.JsonValue, com.urbanairship.json.JsonValue, boolean):boolean");
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j(f25466b, this.f25467a).mo18817a().mo17264q();
    }
}
