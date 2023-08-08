package com.urbanairship.json;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36064q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.urbanairship.json.d */
public class C9329d implements C9333e, C36064q<C9333e> {
    @C0359n0

    /* renamed from: c */
    public static final String f25455c = "or";
    @C0359n0

    /* renamed from: d */
    public static final String f25456d = "and";
    @C0359n0

    /* renamed from: e */
    public static final String f25457e = "not";

    /* renamed from: a */
    public final List<C36064q<C9333e>> f25458a;

    /* renamed from: b */
    public final String f25459b;

    /* renamed from: com.urbanairship.json.d$b */
    public static class C9331b {

        /* renamed from: a */
        public String f25460a = "or";

        /* renamed from: b */
        public final List<C36064q<C9333e>> f25461b = new ArrayList();

        @C0359n0
        /* renamed from: c */
        public C9331b mo18839c(@C0359n0 C9326c cVar) {
            this.f25461b.add(cVar);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C9331b mo18840d(@C0359n0 C9329d dVar) {
            this.f25461b.add(dVar);
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C9329d mo18841e() {
            if (this.f25460a.equals("not") && this.f25461b.size() > 1) {
                throw new IllegalArgumentException("`NOT` predicate type only supports a single matcher or predicate.");
            } else if (!this.f25461b.isEmpty()) {
                return new C9329d(this);
            } else {
                throw new IllegalArgumentException("Predicate must contain at least 1 matcher or child predicate.");
            }
        }

        @C0359n0
        /* renamed from: f */
        public C9331b mo18842f(@C0359n0 String str) {
            this.f25460a = str;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.json.d$c */
    public @interface C9332c {
    }

    @C0363p0
    /* renamed from: b */
    public static String m35053b(@C0359n0 C9323b bVar) {
        if (bVar.mo18805e("and")) {
            return "and";
        }
        if (bVar.mo18805e("or")) {
            return "or";
        }
        if (bVar.mo18805e("not")) {
            return "not";
        }
        return null;
    }

    @C0359n0
    /* renamed from: c */
    public static C9331b m35054c() {
        return new C9331b();
    }

    @C0359n0
    /* renamed from: d */
    public static C9329d m35055d(@C0363p0 JsonValue jsonValue) throws JsonException {
        if (jsonValue == null || !jsonValue.mo18778u() || jsonValue.mo18749A().isEmpty()) {
            throw new JsonException("Unable to parse empty JsonValue: " + jsonValue);
        }
        C9323b A = jsonValue.mo18749A();
        C9331b c = m35054c();
        String b = m35053b(A);
        if (b != null) {
            c.mo18842f(b);
            Iterator<JsonValue> it = A.mo18801A(b).mo18784z().iterator();
            while (it.hasNext()) {
                JsonValue next = it.next();
                if (next.mo18778u()) {
                    if (m35053b(next.mo18749A()) != null) {
                        c.mo18840d(m35055d(next));
                    } else {
                        c.mo18839c(C9326c.m35040c(next));
                    }
                }
            }
        } else {
            c.mo18839c(C9326c.m35040c(jsonValue));
        }
        try {
            return c.mo18841e();
        } catch (IllegalArgumentException e) {
            throw new JsonException("Unable to parse JsonPredicate.", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean apply(@androidx.annotation.C0363p0 com.urbanairship.json.C9333e r6) {
        /*
            r5 = this;
            java.util.List<com.urbanairship.q<com.urbanairship.json.e>> r0 = r5.f25458a
            int r0 = r0.size()
            r1 = 1
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = r5.f25459b
            int r2 = r0.hashCode()
            r3 = 3555(0xde3, float:4.982E-42)
            r4 = 0
            if (r2 == r3) goto L_0x0034
            r3 = 96727(0x179d7, float:1.35543E-40)
            if (r2 == r3) goto L_0x002a
            r3 = 109267(0x1aad3, float:1.53116E-40)
            if (r2 == r3) goto L_0x0020
            goto L_0x003e
        L_0x0020:
            java.lang.String r2 = "not"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003e
            r0 = r4
            goto L_0x003f
        L_0x002a:
            java.lang.String r2 = "and"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003e
            r0 = r1
            goto L_0x003f
        L_0x0034:
            java.lang.String r2 = "or"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003e
            r0 = 2
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            if (r0 == 0) goto L_0x0077
            if (r0 == r1) goto L_0x005d
            java.util.List<com.urbanairship.q<com.urbanairship.json.e>> r0 = r5.f25458a
            java.util.Iterator r0 = r0.iterator()
        L_0x0049:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005c
            java.lang.Object r2 = r0.next()
            com.urbanairship.q r2 = (com.urbanairship.C36064q) r2
            boolean r2 = r2.apply(r6)
            if (r2 == 0) goto L_0x0049
            return r1
        L_0x005c:
            return r4
        L_0x005d:
            java.util.List<com.urbanairship.q<com.urbanairship.json.e>> r0 = r5.f25458a
            java.util.Iterator r0 = r0.iterator()
        L_0x0063:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r0.next()
            com.urbanairship.q r2 = (com.urbanairship.C36064q) r2
            boolean r2 = r2.apply(r6)
            if (r2 != 0) goto L_0x0063
            return r4
        L_0x0076:
            return r1
        L_0x0077:
            java.util.List<com.urbanairship.q<com.urbanairship.json.e>> r0 = r5.f25458a
            java.lang.Object r0 = r0.get(r4)
            com.urbanairship.q r0 = (com.urbanairship.C36064q) r0
            boolean r6 = r0.apply(r6)
            r6 = r6 ^ r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.json.C9329d.apply(com.urbanairship.json.e):boolean");
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9329d dVar = (C9329d) obj;
        List<C36064q<C9333e>> list = this.f25458a;
        if (list == null ? dVar.f25458a != null : !list.equals(dVar.f25458a)) {
            return false;
        }
        String str = this.f25459b;
        String str2 = dVar.f25459b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        List<C36064q<C9333e>> list = this.f25458a;
        int i2 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.f25459b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18822f(this.f25459b, JsonValue.m34975U(this.f25458a)).mo18817a().mo17264q();
    }

    public C9329d(C9331b bVar) {
        this.f25458a = bVar.f25461b;
        this.f25459b = bVar.f25460a;
    }
}
