package com.urbanairship.automation;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import com.urbanairship.automation.tags.C8968d;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9329d;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.C9335g;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9674q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.urbanairship.automation.b */
public class C8814b implements C9333e {

    /* renamed from: E0 */
    public static final String f23594E0 = "tags";

    /* renamed from: F0 */
    public static final String f23595F0 = "test_devices";

    /* renamed from: G0 */
    public static final String f23596G0 = "miss_behavior";

    /* renamed from: H0 */
    public static final String f23597H0 = "requires_analytics";

    /* renamed from: I0 */
    public static final String f23598I0 = "permissions";
    @C0359n0

    /* renamed from: J0 */
    public static final String f23599J0 = "cancel";
    @C0359n0

    /* renamed from: K0 */
    public static final String f23600K0 = "skip";
    @C0359n0

    /* renamed from: L0 */
    public static final String f23601L0 = "penalize";

    /* renamed from: X */
    public static final String f23602X = "location_opt_in";

    /* renamed from: Y */
    public static final String f23603Y = "locale";

    /* renamed from: Z */
    public static final String f23604Z = "app_version";

    /* renamed from: y */
    public static final String f23605y = "new_user";

    /* renamed from: z */
    public static final String f23606z = "notification_opt_in";

    /* renamed from: a */
    public final Boolean f23607a;

    /* renamed from: b */
    public final Boolean f23608b;

    /* renamed from: c */
    public final Boolean f23609c;

    /* renamed from: d */
    public final Boolean f23610d;

    /* renamed from: e */
    public final List<String> f23611e;

    /* renamed from: f */
    public final List<String> f23612f;

    /* renamed from: g */
    public final C8968d f23613g;

    /* renamed from: v */
    public final C9329d f23614v;

    /* renamed from: w */
    public final C9329d f23615w;

    /* renamed from: x */
    public final String f23616x;

    /* renamed from: com.urbanairship.automation.b$b */
    public static class C8816b {

        /* renamed from: a */
        public Boolean f23617a;

        /* renamed from: b */
        public Boolean f23618b;

        /* renamed from: c */
        public Boolean f23619c;

        /* renamed from: d */
        public Boolean f23620d;

        /* renamed from: e */
        public final List<String> f23621e;

        /* renamed from: f */
        public final List<String> f23622f;

        /* renamed from: g */
        public String f23623g;

        /* renamed from: h */
        public C8968d f23624h;

        /* renamed from: i */
        public C9329d f23625i;

        /* renamed from: j */
        public C9329d f23626j;

        @C0359n0
        /* renamed from: l */
        public C8816b mo17344l(@C0359n0 String str) {
            this.f23621e.add(str);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: m */
        public C8816b mo17345m(String str) {
            this.f23622f.add(str);
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C8814b mo17346n() {
            return new C8814b(this);
        }

        @C0359n0
        /* renamed from: o */
        public C8816b mo17347o(boolean z) {
            this.f23619c = Boolean.valueOf(z);
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C8816b mo17348p(@C0359n0 String str) {
            this.f23623g = str;
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: q */
        public C8816b mo17349q(boolean z) {
            this.f23617a = Boolean.valueOf(z);
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C8816b mo17350r(boolean z) {
            this.f23618b = Boolean.valueOf(z);
            return this;
        }

        @C0359n0
        /* renamed from: s */
        public C8816b mo17351s(@C0359n0 C9329d dVar) {
            this.f23626j = dVar;
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C8816b mo17352t(boolean z) {
            this.f23620d = Boolean.valueOf(z);
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C8816b mo17353u(@C0363p0 C8968d dVar) {
            this.f23624h = dVar;
            return this;
        }

        @C0359n0
        /* renamed from: v */
        public C8816b mo17354v(@C0363p0 C9335g gVar) {
            return mo17355w(gVar == null ? null : C9674q0.m36238c(gVar));
        }

        @C0359n0
        /* renamed from: w */
        public final C8816b mo17355w(@C0363p0 C9329d dVar) {
            this.f23625i = dVar;
            return this;
        }

        public C8816b() {
            this.f23621e = new ArrayList();
            this.f23622f = new ArrayList();
            this.f23623g = C8814b.f23601L0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.automation.b$c */
    public @interface C8817c {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0239, code lost:
        if (r2.equals("cancel") == false) goto L_0x0221;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.urbanairship.automation.C8814b m32733a(@androidx.annotation.C0359n0 com.urbanairship.json.JsonValue r9) throws com.urbanairship.json.JsonException {
        /*
            com.urbanairship.json.b r9 = r9.mo18749A()
            com.urbanairship.automation.b$b r0 = m32734l()
            java.lang.String r1 = "new_user"
            boolean r2 = r9.mo18805e(r1)
            r3 = 0
            if (r2 == 0) goto L_0x0042
            com.urbanairship.json.JsonValue r2 = r9.mo18801A(r1)
            boolean r2 = r2.mo18772o()
            if (r2 == 0) goto L_0x0027
            com.urbanairship.json.JsonValue r1 = r9.mo18801A(r1)
            boolean r1 = r1.mo18757c(r3)
            r0.mo17349q(r1)
            goto L_0x0042
        L_0x0027:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "new_user must be a boolean: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r9 = r9.mo18812k(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L_0x0042:
            java.lang.String r1 = "notification_opt_in"
            boolean r2 = r9.mo18805e(r1)
            if (r2 == 0) goto L_0x007b
            com.urbanairship.json.JsonValue r2 = r9.mo18801A(r1)
            boolean r2 = r2.mo18772o()
            if (r2 == 0) goto L_0x0060
            com.urbanairship.json.JsonValue r1 = r9.mo18801A(r1)
            boolean r1 = r1.mo18757c(r3)
            r0.mo17350r(r1)
            goto L_0x007b
        L_0x0060:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notification_opt_in must be a boolean: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r9 = r9.mo18812k(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L_0x007b:
            java.lang.String r1 = "location_opt_in"
            boolean r2 = r9.mo18805e(r1)
            if (r2 == 0) goto L_0x00b4
            com.urbanairship.json.JsonValue r2 = r9.mo18801A(r1)
            boolean r2 = r2.mo18772o()
            if (r2 == 0) goto L_0x0099
            com.urbanairship.json.JsonValue r1 = r9.mo18801A(r1)
            boolean r1 = r1.mo18757c(r3)
            r0.mo17347o(r1)
            goto L_0x00b4
        L_0x0099:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "location_opt_in must be a boolean: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r9 = r9.mo18812k(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L_0x00b4:
            java.lang.String r1 = "requires_analytics"
            boolean r2 = r9.mo18805e(r1)
            if (r2 == 0) goto L_0x00ed
            com.urbanairship.json.JsonValue r2 = r9.mo18801A(r1)
            boolean r2 = r2.mo18772o()
            if (r2 == 0) goto L_0x00d2
            com.urbanairship.json.JsonValue r1 = r9.mo18801A(r1)
            boolean r1 = r1.mo18757c(r3)
            r0.mo17352t(r1)
            goto L_0x00ed
        L_0x00d2:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "requires_analytics must be a boolean: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r9 = r9.mo18812k(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L_0x00ed:
            java.lang.String r1 = "locale"
            boolean r2 = r9.mo18805e(r1)
            if (r2 == 0) goto L_0x0153
            com.urbanairship.json.JsonValue r2 = r9.mo18801A(r1)
            boolean r2 = r2.mo18776t()
            if (r2 == 0) goto L_0x0138
            com.urbanairship.json.JsonValue r2 = r9.mo18801A(r1)
            com.urbanairship.json.a r2 = r2.mo18784z()
            java.util.Iterator r2 = r2.iterator()
        L_0x010b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0153
            java.lang.Object r4 = r2.next()
            com.urbanairship.json.JsonValue r4 = (com.urbanairship.json.JsonValue) r4
            java.lang.String r5 = r4.mo18769l()
            if (r5 == 0) goto L_0x0121
            r0.mo17344l(r5)
            goto L_0x010b
        L_0x0121:
            com.urbanairship.json.JsonException r9 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid locale: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0138:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "locales must be an array: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r9 = r9.mo18812k(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L_0x0153:
            java.lang.String r2 = "app_version"
            boolean r4 = r9.mo18805e(r2)
            if (r4 == 0) goto L_0x0166
            com.urbanairship.json.JsonValue r2 = r9.mo18812k(r2)
            com.urbanairship.json.d r2 = com.urbanairship.json.C9329d.m35055d(r2)
            com.urbanairship.automation.C8814b.C8816b unused = r0.mo17355w(r2)
        L_0x0166:
            java.lang.String r2 = "permissions"
            boolean r4 = r9.mo18805e(r2)
            if (r4 == 0) goto L_0x0179
            com.urbanairship.json.JsonValue r2 = r9.mo18812k(r2)
            com.urbanairship.json.d r2 = com.urbanairship.json.C9329d.m35055d(r2)
            r0.mo17351s(r2)
        L_0x0179:
            java.lang.String r2 = "tags"
            boolean r4 = r9.mo18805e(r2)
            if (r4 == 0) goto L_0x018c
            com.urbanairship.json.JsonValue r2 = r9.mo18801A(r2)
            com.urbanairship.automation.tags.d r2 = com.urbanairship.automation.tags.C8968d.m33366d(r2)
            r0.mo17353u(r2)
        L_0x018c:
            java.lang.String r2 = "test_devices"
            boolean r4 = r9.mo18805e(r2)
            if (r4 == 0) goto L_0x01f6
            com.urbanairship.json.JsonValue r4 = r9.mo18801A(r2)
            boolean r4 = r4.mo18776t()
            if (r4 == 0) goto L_0x01db
            com.urbanairship.json.JsonValue r1 = r9.mo18801A(r2)
            com.urbanairship.json.a r1 = r1.mo18784z()
            java.util.Iterator r1 = r1.iterator()
        L_0x01aa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01f6
            java.lang.Object r2 = r1.next()
            com.urbanairship.json.JsonValue r2 = (com.urbanairship.json.JsonValue) r2
            boolean r4 = r2.mo18783y()
            if (r4 == 0) goto L_0x01c4
            java.lang.String r2 = r2.mo18769l()
            r0.mo17345m(r2)
            goto L_0x01aa
        L_0x01c4:
            com.urbanairship.json.JsonException r9 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid test device: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x01db:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "test devices must be an array: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r9 = r9.mo18812k(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L_0x01f6:
            java.lang.String r1 = "miss_behavior"
            boolean r2 = r9.mo18805e(r1)
            if (r2 == 0) goto L_0x0281
            com.urbanairship.json.JsonValue r2 = r9.mo18801A(r1)
            boolean r2 = r2.mo18783y()
            if (r2 == 0) goto L_0x0266
            com.urbanairship.json.JsonValue r2 = r9.mo18801A(r1)
            java.lang.String r2 = r2.mo18750B()
            r2.hashCode()
            int r4 = r2.hashCode()
            java.lang.String r5 = "penalize"
            java.lang.String r6 = "skip"
            java.lang.String r7 = "cancel"
            r8 = -1
            switch(r4) {
                case -1367724422: goto L_0x0235;
                case 3532159: goto L_0x022c;
                case 311930832: goto L_0x0223;
                default: goto L_0x0221;
            }
        L_0x0221:
            r3 = r8
            goto L_0x023c
        L_0x0223:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x022a
            goto L_0x0221
        L_0x022a:
            r3 = 2
            goto L_0x023c
        L_0x022c:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0233
            goto L_0x0221
        L_0x0233:
            r3 = 1
            goto L_0x023c
        L_0x0235:
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x023c
            goto L_0x0221
        L_0x023c:
            switch(r3) {
                case 0: goto L_0x0262;
                case 1: goto L_0x025e;
                case 2: goto L_0x025a;
                default: goto L_0x023f;
            }
        L_0x023f:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid miss behavior: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r9 = r9.mo18801A(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L_0x025a:
            r0.mo17348p(r5)
            goto L_0x0281
        L_0x025e:
            r0.mo17348p(r6)
            goto L_0x0281
        L_0x0262:
            r0.mo17348p(r7)
            goto L_0x0281
        L_0x0266:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "miss_behavior must be a string: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r9 = r9.mo18812k(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.<init>(r9)
            throw r0
        L_0x0281:
            com.urbanairship.automation.b r9 = r0.mo17346n()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.C8814b.m32733a(com.urbanairship.json.JsonValue):com.urbanairship.automation.b");
    }

    @C0359n0
    /* renamed from: l */
    public static C8816b m32734l() {
        return new C8816b();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public List<String> mo17331b() {
        return this.f23611e;
    }

    @C0363p0
    /* renamed from: c */
    public Boolean mo17332c() {
        return this.f23609c;
    }

    @C0359n0
    /* renamed from: d */
    public String mo17333d() {
        return this.f23616x;
    }

    @C0363p0
    /* renamed from: e */
    public Boolean mo17334e() {
        return this.f23607a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8814b bVar = (C8814b) obj;
        if (!C17992m.m81740a(this.f23607a, bVar.f23607a) || !C17992m.m81740a(this.f23608b, bVar.f23608b) || !C17992m.m81740a(this.f23609c, bVar.f23609c) || !C17992m.m81740a(this.f23610d, bVar.f23610d) || !C17992m.m81740a(this.f23611e, bVar.f23611e) || !C17992m.m81740a(this.f23612f, bVar.f23612f) || !C17992m.m81740a(this.f23613g, bVar.f23613g) || !C17992m.m81740a(this.f23614v, bVar.f23614v) || !C17992m.m81740a(this.f23615w, bVar.f23615w) || !C17992m.m81740a(this.f23616x, bVar.f23616x)) {
            return false;
        }
        return true;
    }

    @C0363p0
    /* renamed from: f */
    public Boolean mo17336f() {
        return this.f23608b;
    }

    @C0363p0
    /* renamed from: g */
    public C9329d mo17337g() {
        return this.f23615w;
    }

    @C0363p0
    /* renamed from: h */
    public Boolean mo17338h() {
        return this.f23610d;
    }

    public int hashCode() {
        return C17992m.m81741b(this.f23607a, this.f23608b, this.f23609c, this.f23610d, this.f23611e, this.f23612f, this.f23613g, this.f23614v, this.f23615w, this.f23616x);
    }

    @C0363p0
    /* renamed from: i */
    public C8968d mo17340i() {
        return this.f23613g;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: j */
    public List<String> mo17341j() {
        return this.f23612f;
    }

    @C0363p0
    /* renamed from: k */
    public C9329d mo17342k() {
        return this.f23614v;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        JsonValue jsonValue;
        C9323b.C9325b j = C9323b.m35017y().mo18826j(f23605y, this.f23607a).mo18826j("notification_opt_in", this.f23608b).mo18826j(f23602X, this.f23609c).mo18826j(f23597H0, this.f23610d);
        JsonValue jsonValue2 = null;
        if (this.f23611e.isEmpty()) {
            jsonValue = null;
        } else {
            jsonValue = JsonValue.m34975U(this.f23611e);
        }
        C9323b.C9325b f = j.mo18822f("locale", jsonValue);
        if (!this.f23612f.isEmpty()) {
            jsonValue2 = JsonValue.m34975U(this.f23612f);
        }
        return f.mo18822f(f23595F0, jsonValue2).mo18822f("tags", this.f23613g).mo18822f("app_version", this.f23614v).mo18823g(f23596G0, this.f23616x).mo18822f(f23598I0, this.f23615w).mo18817a().mo17264q();
    }

    public String toString() {
        return "Audience{newUser=" + this.f23607a + ", notificationsOptIn=" + this.f23608b + ", locationOptIn=" + this.f23609c + ", requiresAnalytics=" + this.f23610d + ", languageTags=" + this.f23611e + ", testDevices=" + this.f23612f + ", tagSelector=" + this.f23613g + ", versionPredicate=" + this.f23614v + ", permissionsPredicate=" + this.f23615w + ", missBehavior='" + this.f23616x + '\'' + C12361b.f30259j;
    }

    public C8814b(@C0359n0 C8816b bVar) {
        this.f23607a = bVar.f23617a;
        this.f23608b = bVar.f23618b;
        this.f23609c = bVar.f23619c;
        this.f23610d = bVar.f23620d;
        this.f23611e = bVar.f23621e;
        this.f23613g = bVar.f23624h;
        this.f23614v = bVar.f23625i;
        this.f23612f = bVar.f23622f;
        this.f23616x = bVar.f23623g;
        this.f23615w = bVar.f23626j;
    }
}
