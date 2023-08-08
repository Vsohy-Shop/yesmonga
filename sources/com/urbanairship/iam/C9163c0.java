package com.urbanairship.iam;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.iam.C9139b;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.urbanairship.iam.c0 */
public final class C9163c0 implements C9333e {
    @C0359n0

    /* renamed from: c */
    public static final String f24853c = "button_click";
    @C0359n0

    /* renamed from: d */
    public static final String f24854d = "message_click";
    @C0359n0

    /* renamed from: e */
    public static final String f24855e = "user_dismissed";
    @C0359n0

    /* renamed from: f */
    public static final String f24856f = "timed_out";
    @C0359n0

    /* renamed from: g */
    public static final String f24857g = "type";
    @C0359n0

    /* renamed from: v */
    public static final String f24858v = "button_info";
    @C0359n0

    /* renamed from: a */
    public final String f24859a;
    @C0363p0

    /* renamed from: b */
    public final C9139b f24860b;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.c0$a */
    public @interface C9164a {
    }

    public C9163c0(@C0359n0 String str) {
        this.f24859a = str;
        this.f24860b = null;
    }

    @C0359n0
    /* renamed from: a */
    public static C9163c0 m34347a(@C0359n0 C9139b bVar) {
        return new C9163c0(f24853c, bVar);
    }

    @C0359n0
    /* renamed from: b */
    public static C9163c0 m34348b(@C0359n0 String str, @C0363p0 String str2, boolean z) {
        String str3;
        C9139b.C9142c r = C9139b.m34197r();
        if (z) {
            str3 = "cancel";
        } else {
            str3 = "dismiss";
        }
        C9139b.C9142c p = r.mo18271m(str3).mo18274p(str);
        C9168d0.C9171c p2 = C9168d0.m34367p();
        if (str2 != null) {
            str = str2;
        }
        return new C9163c0(f24853c, p.mo18275q(p2.mo18400p(str).mo18394j()).mo18268j(Boolean.FALSE));
    }

    @C0359n0
    /* renamed from: c */
    public static C9163c0 m34349c() {
        return new C9163c0(f24855e);
    }

    @C0359n0
    /* renamed from: d */
    public static C9163c0 m34350d(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9139b bVar;
        C9323b A = jsonValue.mo18749A();
        String l = A.mo18801A("type").mo18769l();
        if (l != null) {
            if (A.mo18801A(f24858v).mo18778u()) {
                bVar = C9139b.m34195h(A.mo18801A(f24858v));
            } else {
                bVar = null;
            }
            return new C9163c0(l, bVar);
        }
        throw new JsonException("ResolutionInfo must contain a type");
    }

    @C0359n0
    /* renamed from: g */
    public static C9163c0 m34351g() {
        return new C9163c0(f24854d);
    }

    @C0359n0
    /* renamed from: h */
    public static C9163c0 m34352h() {
        return new C9163c0(f24856f);
    }

    @C0363p0
    /* renamed from: e */
    public C9139b mo18375e() {
        return this.f24860b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9163c0.class != obj.getClass()) {
            return false;
        }
        C9163c0 c0Var = (C9163c0) obj;
        if (!this.f24859a.equals(c0Var.f24859a)) {
            return false;
        }
        C9139b bVar = this.f24860b;
        C9139b bVar2 = c0Var.f24860b;
        if (bVar != null) {
            return bVar.equals(bVar2);
        }
        if (bVar2 == null) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: f */
    public String mo18377f() {
        return this.f24859a;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f24859a.hashCode() * 31;
        C9139b bVar = this.f24860b;
        if (bVar != null) {
            i = bVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g("type", mo18377f()).mo18826j(f24858v, mo18375e()).mo18817a().mo17264q();
    }

    public C9163c0(@C0359n0 String str, @C0363p0 C9139b bVar) {
        this.f24859a = str;
        this.f24860b = bVar;
    }
}
