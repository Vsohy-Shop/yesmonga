package com.urbanairship.iam;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9669o0;

/* renamed from: com.urbanairship.iam.a0 */
public class C9127a0 implements C9333e {
    @C0359n0

    /* renamed from: d */
    public static final String f24709d = "image";
    @C0359n0

    /* renamed from: e */
    public static final String f24710e = "video";
    @C0359n0

    /* renamed from: f */
    public static final String f24711f = "youtube";

    /* renamed from: g */
    public static final String f24712g = "url";

    /* renamed from: v */
    public static final String f24713v = "description";

    /* renamed from: w */
    public static final String f24714w = "type";

    /* renamed from: a */
    public final String f24715a;

    /* renamed from: b */
    public final String f24716b;

    /* renamed from: c */
    public final String f24717c;

    @C0359n0
    /* renamed from: d */
    public static C9127a0 m34132d(@C0359n0 JsonValue jsonValue) throws JsonException {
        try {
            return m34133h().mo18221g(jsonValue.mo18749A().mo18801A("url").mo18750B()).mo18220f(jsonValue.mo18749A().mo18801A("type").mo18750B()).mo18219e(jsonValue.mo18749A().mo18801A("description").mo18750B()).mo18218d();
        } catch (IllegalArgumentException e) {
            throw new JsonException("Invalid media object json: " + jsonValue, e);
        }
    }

    @C0359n0
    /* renamed from: h */
    public static C9129b m34133h() {
        return new C9129b();
    }

    @C0359n0
    /* renamed from: i */
    public static C9129b m34134i(@C0359n0 C9127a0 a0Var) {
        return new C9129b();
    }

    @C0359n0
    /* renamed from: e */
    public String mo18212e() {
        return this.f24716b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9127a0 a0Var = (C9127a0) obj;
        String str = this.f24715a;
        if (str == null ? a0Var.f24715a != null : !str.equals(a0Var.f24715a)) {
            return false;
        }
        String str2 = this.f24716b;
        if (str2 == null ? a0Var.f24716b != null : !str2.equals(a0Var.f24716b)) {
            return false;
        }
        String str3 = this.f24717c;
        String str4 = a0Var.f24717c;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: f */
    public String mo18214f() {
        return this.f24717c;
    }

    @C0359n0
    /* renamed from: g */
    public String mo18215g() {
        return this.f24715a;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f24715a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.f24716b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f24717c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g("url", this.f24715a).mo18823g("description", this.f24716b).mo18823g("type", this.f24717c).mo18817a().mo17264q();
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }

    /* renamed from: com.urbanairship.iam.a0$b */
    public static class C9129b {

        /* renamed from: a */
        public String f24718a;

        /* renamed from: b */
        public String f24719b;

        /* renamed from: c */
        public String f24720c;

        @C0359n0
        /* renamed from: d */
        public C9127a0 mo18218d() {
            C9654i.m36165a(!C9669o0.m36224e(this.f24718a), "Missing URL");
            C9654i.m36165a(!C9669o0.m36224e(this.f24719b), "Missing type");
            C9654i.m36165a(!C9669o0.m36224e(this.f24720c), "Missing description");
            return new C9127a0(this);
        }

        @C0359n0
        /* renamed from: e */
        public C9129b mo18219e(@C0359n0 String str) {
            this.f24720c = str;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C9129b mo18220f(@C0359n0 String str) {
            this.f24719b = str;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C9129b mo18221g(@C0359n0 String str) {
            this.f24718a = str;
            return this;
        }

        public C9129b() {
        }

        public C9129b(C9127a0 a0Var) {
            this.f24718a = a0Var.f24715a;
            this.f24720c = a0Var.f24716b;
            this.f24719b = a0Var.f24717c;
        }
    }

    public C9127a0(@C0359n0 C9129b bVar) {
        this.f24715a = bVar.f24718a;
        this.f24716b = bVar.f24720c;
        this.f24717c = bVar.f24719b;
    }
}
