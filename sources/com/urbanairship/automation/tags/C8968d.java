package com.urbanairship.automation.tags;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import androidx.core.util.C17992m;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.urbanairship.automation.tags.d */
public class C8968d implements C9333e {

    /* renamed from: d */
    public static final String f24074d = "or";

    /* renamed from: e */
    public static final String f24075e = "and";

    /* renamed from: f */
    public static final String f24076f = "not";

    /* renamed from: g */
    public static final String f24077g = "tag";

    /* renamed from: a */
    public final String f24078a;

    /* renamed from: b */
    public String f24079b;

    /* renamed from: c */
    public List<C8968d> f24080c;

    public C8968d(@C0359n0 String str) {
        this.f24078a = "tag";
        this.f24079b = str;
    }

    @C0359n0
    /* renamed from: a */
    public static C8968d m33364a(@C0359n0 @C0386z0(min = 1) List<C8968d> list) {
        return new C8968d("and", list);
    }

    @C0359n0
    /* renamed from: b */
    public static C8968d m33365b(@C0359n0 @C0386z0(min = 1) C8968d... dVarArr) {
        return new C8968d("and", Arrays.asList(dVarArr));
    }

    @C0359n0
    /* renamed from: d */
    public static C8968d m33366d(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        if (A.mo18805e("tag")) {
            String l = A.mo18801A("tag").mo18769l();
            if (l != null) {
                return m33371i(l);
            }
            throw new JsonException("Tag selector expected a tag: " + A.mo18801A("tag"));
        } else if (A.mo18805e("or")) {
            C9322a h = A.mo18801A("or").mo18764h();
            if (h != null) {
                return m33368f(m33370h(h));
            }
            throw new JsonException("OR selector expected array of tag selectors: " + A.mo18801A("or"));
        } else if (A.mo18805e("and")) {
            C9322a h2 = A.mo18801A("and").mo18764h();
            if (h2 != null) {
                return m33364a(m33370h(h2));
            }
            throw new JsonException("AND selector expected array of tag selectors: " + A.mo18801A("and"));
        } else if (A.mo18805e("not")) {
            return m33367e(m33366d(A.mo18801A("not")));
        } else {
            throw new JsonException("Json value did not contain a valid selector: " + jsonValue);
        }
    }

    @C0359n0
    /* renamed from: e */
    public static C8968d m33367e(@C0359n0 C8968d dVar) {
        return new C8968d("not", Collections.singletonList(dVar));
    }

    @C0359n0
    /* renamed from: f */
    public static C8968d m33368f(@C0359n0 @C0386z0(min = 1) List<C8968d> list) {
        return new C8968d("or", list);
    }

    @C0359n0
    /* renamed from: g */
    public static C8968d m33369g(@C0359n0 @C0386z0(min = 1) C8968d... dVarArr) {
        return new C8968d("or", Arrays.asList(dVarArr));
    }

    /* renamed from: h */
    public static List<C8968d> m33370h(C9322a aVar) throws JsonException {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonValue> it = aVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m33366d(it.next()));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new JsonException("Expected 1 or more selectors");
    }

    @C0359n0
    /* renamed from: i */
    public static C8968d m33371i(@C0359n0 String str) {
        return new C8968d(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17704c(@androidx.annotation.C0359n0 java.util.Collection<java.lang.String> r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f24078a
            int r1 = r0.hashCode()
            r2 = 3555(0xde3, float:4.982E-42)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x003b
            r2 = 96727(0x179d7, float:1.35543E-40)
            if (r1 == r2) goto L_0x0031
            r2 = 109267(0x1aad3, float:1.53116E-40)
            if (r1 == r2) goto L_0x0027
            r2 = 114586(0x1bf9a, float:1.60569E-40)
            if (r1 == r2) goto L_0x001d
            goto L_0x0045
        L_0x001d:
            java.lang.String r1 = "tag"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = r4
            goto L_0x0046
        L_0x0027:
            java.lang.String r1 = "not"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = r5
            goto L_0x0046
        L_0x0031:
            java.lang.String r1 = "and"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = r3
            goto L_0x0046
        L_0x003b:
            java.lang.String r1 = "or"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 3
            goto L_0x0046
        L_0x0045:
            r0 = -1
        L_0x0046:
            if (r0 == 0) goto L_0x008e
            if (r0 == r5) goto L_0x0080
            if (r0 == r3) goto L_0x0066
            java.util.List<com.urbanairship.automation.tags.d> r0 = r6.f24080c
            java.util.Iterator r0 = r0.iterator()
        L_0x0052:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r0.next()
            com.urbanairship.automation.tags.d r1 = (com.urbanairship.automation.tags.C8968d) r1
            boolean r1 = r1.mo17704c(r7)
            if (r1 == 0) goto L_0x0052
            return r5
        L_0x0065:
            return r4
        L_0x0066:
            java.util.List<com.urbanairship.automation.tags.d> r0 = r6.f24080c
            java.util.Iterator r0 = r0.iterator()
        L_0x006c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007f
            java.lang.Object r1 = r0.next()
            com.urbanairship.automation.tags.d r1 = (com.urbanairship.automation.tags.C8968d) r1
            boolean r1 = r1.mo17704c(r7)
            if (r1 != 0) goto L_0x006c
            return r4
        L_0x007f:
            return r5
        L_0x0080:
            java.util.List<com.urbanairship.automation.tags.d> r0 = r6.f24080c
            java.lang.Object r0 = r0.get(r4)
            com.urbanairship.automation.tags.d r0 = (com.urbanairship.automation.tags.C8968d) r0
            boolean r7 = r0.mo17704c(r7)
            r7 = r7 ^ r5
            return r7
        L_0x008e:
            java.lang.String r0 = r6.f24079b
            boolean r7 = r7.contains(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.tags.C8968d.mo17704c(java.util.Collection):boolean");
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8968d dVar = (C8968d) obj;
        if (!C17992m.m81740a(this.f24078a, dVar.f24078a) || !C17992m.m81740a(this.f24079b, dVar.f24079b) || !C17992m.m81740a(this.f24080c, dVar.f24080c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17992m.m81741b(this.f24078a, this.f24079b, this.f24080c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    @androidx.annotation.C0359n0
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.urbanairship.json.JsonValue mo17264q() {
        /*
            r6 = this;
            com.urbanairship.json.b$b r0 = com.urbanairship.json.C9323b.m35017y()
            java.lang.String r1 = r6.f24078a
            int r2 = r1.hashCode()
            r3 = 3555(0xde3, float:4.982E-42)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x003e
            r3 = 96727(0x179d7, float:1.35543E-40)
            if (r2 == r3) goto L_0x0034
            r3 = 109267(0x1aad3, float:1.53116E-40)
            if (r2 == r3) goto L_0x002a
            r3 = 114586(0x1bf9a, float:1.60569E-40)
            if (r2 == r3) goto L_0x0020
            goto L_0x0048
        L_0x0020:
            java.lang.String r2 = "tag"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0048
            r1 = r4
            goto L_0x0049
        L_0x002a:
            java.lang.String r2 = "not"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0048
            r1 = r5
            goto L_0x0049
        L_0x0034:
            java.lang.String r2 = "and"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0048
            r1 = 3
            goto L_0x0049
        L_0x003e:
            java.lang.String r2 = "or"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0048
            r1 = 2
            goto L_0x0049
        L_0x0048:
            r1 = -1
        L_0x0049:
            if (r1 == 0) goto L_0x0067
            if (r1 == r5) goto L_0x0059
            java.lang.String r1 = r6.f24078a
            java.util.List<com.urbanairship.automation.tags.d> r2 = r6.f24080c
            com.urbanairship.json.JsonValue r2 = com.urbanairship.json.JsonValue.m34975U(r2)
            r0.mo18822f(r1, r2)
            goto L_0x006e
        L_0x0059:
            java.lang.String r1 = r6.f24078a
            java.util.List<com.urbanairship.automation.tags.d> r2 = r6.f24080c
            java.lang.Object r2 = r2.get(r4)
            com.urbanairship.json.e r2 = (com.urbanairship.json.C9333e) r2
            r0.mo18822f(r1, r2)
            goto L_0x006e
        L_0x0067:
            java.lang.String r1 = r6.f24078a
            java.lang.String r2 = r6.f24079b
            r0.mo18823g(r1, r2)
        L_0x006e:
            com.urbanairship.json.b r0 = r0.mo18817a()
            com.urbanairship.json.JsonValue r0 = r0.mo17264q()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.tags.C8968d.mo17264q():com.urbanairship.json.JsonValue");
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }

    public C8968d(@C0359n0 String str, @C0359n0 @C0386z0(min = 1) List<C8968d> list) {
        this.f24078a = str;
        this.f24080c = new ArrayList(list);
    }
}
