package com.urbanairship.json;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36064q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.json.c */
public class C9326c implements C9333e, C36064q<C9333e> {

    /* renamed from: e */
    public static final String f25443e = "value";

    /* renamed from: f */
    public static final String f25444f = "key";

    /* renamed from: g */
    public static final String f25445g = "scope";

    /* renamed from: v */
    public static final String f25446v = "ignore_case";
    @C0363p0

    /* renamed from: a */
    public final String f25447a;
    @C0359n0

    /* renamed from: b */
    public final List<String> f25448b;
    @C0359n0

    /* renamed from: c */
    public final C9335g f25449c;
    @C0363p0

    /* renamed from: d */
    public final Boolean f25450d;

    /* renamed from: com.urbanairship.json.c$b */
    public static class C9328b {

        /* renamed from: a */
        public C9335g f25451a;
        @C0359n0

        /* renamed from: b */
        public List<String> f25452b;
        @C0363p0

        /* renamed from: c */
        public String f25453c;
        @C0363p0

        /* renamed from: d */
        public Boolean f25454d;

        @C0359n0
        /* renamed from: e */
        public C9326c mo18830e() {
            return new C9326c(this);
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: f */
        public C9328b mo18831f(boolean z) {
            this.f25454d = Boolean.valueOf(z);
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C9328b mo18832g(@C0363p0 String str) {
            this.f25453c = str;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9328b mo18833h(@C0359n0 String str) {
            ArrayList arrayList = new ArrayList();
            this.f25452b = arrayList;
            arrayList.add(str);
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9328b mo18834i(@C0363p0 List<String> list) {
            ArrayList arrayList = new ArrayList();
            this.f25452b = arrayList;
            if (list != null) {
                arrayList.addAll(list);
            }
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C9328b mo18835j(@C0363p0 C9335g gVar) {
            this.f25451a = gVar;
            return this;
        }

        public C9328b() {
            this.f25452b = new ArrayList(1);
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C9328b m35039b() {
        return new C9328b();
    }

    @C0359n0
    /* renamed from: c */
    public static C9326c m35040c(@C0363p0 JsonValue jsonValue) throws JsonException {
        if (jsonValue == null || !jsonValue.mo18778u() || jsonValue.mo18749A().isEmpty()) {
            throw new JsonException("Unable to parse empty JsonValue: " + jsonValue);
        }
        C9323b A = jsonValue.mo18749A();
        if (A.mo18805e("value")) {
            C9328b j = m35039b().mo18832g(A.mo18801A("key").mo18769l()).mo18835j(C9335g.m35078k(A.mo18812k("value")));
            JsonValue A2 = A.mo18801A("scope");
            if (A2.mo18783y()) {
                j.mo18833h(A2.mo18750B());
            } else if (A2.mo18776t()) {
                ArrayList arrayList = new ArrayList();
                for (JsonValue l : A2.mo18784z().mo18793i()) {
                    arrayList.add(l.mo18769l());
                }
                j.mo18834i(arrayList);
            }
            if (A.mo18805e(f25446v)) {
                j.mo18831f(A.mo18801A(f25446v).mo18757c(false));
            }
            return j.mo18830e();
        }
        throw new JsonException("JsonMatcher must contain a value matcher.");
    }

    /* renamed from: a */
    public boolean apply(@C0363p0 C9333e eVar) {
        JsonValue jsonValue;
        boolean z;
        if (eVar == null) {
            jsonValue = JsonValue.f25436b;
        } else {
            jsonValue = eVar.mo17264q();
        }
        for (String A : this.f25448b) {
            jsonValue = jsonValue.mo18749A().mo18801A(A);
            if (jsonValue.mo18780w()) {
                break;
            }
        }
        if (this.f25447a != null) {
            jsonValue = jsonValue.mo18749A().mo18801A(this.f25447a);
        }
        C9335g gVar = this.f25449c;
        Boolean bool = this.f25450d;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        return gVar.mo18851c(jsonValue, z);
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9326c cVar = (C9326c) obj;
        String str = this.f25447a;
        if (str == null ? cVar.f25447a != null : !str.equals(cVar.f25447a)) {
            return false;
        }
        if (!this.f25448b.equals(cVar.f25448b)) {
            return false;
        }
        Boolean bool = this.f25450d;
        if (bool == null ? cVar.f25450d == null : bool.equals(cVar.f25450d)) {
            return this.f25449c.equals(cVar.f25449c);
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f25447a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((((i * 31) + this.f25448b.hashCode()) * 31) + this.f25449c.hashCode()) * 31;
        Boolean bool = this.f25450d;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j("key", this.f25447a).mo18826j("scope", this.f25448b).mo18822f("value", this.f25449c).mo18826j(f25446v, this.f25450d).mo18817a().mo17264q();
    }

    public C9326c(@C0359n0 C9328b bVar) {
        this.f25447a = bVar.f25453c;
        this.f25448b = bVar.f25452b;
        this.f25449c = bVar.f25451a == null ? C9335g.m35074g() : bVar.f25451a;
        this.f25450d = bVar.f25454d;
    }
}
