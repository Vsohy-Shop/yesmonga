package com.urbanairship.json.matchers;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9335g;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9689z;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.json.matchers.e */
public class C9340e extends C9335g {
    @C0359n0

    /* renamed from: b */
    public static final String f25474b = "version_matches";
    @C0359n0

    /* renamed from: c */
    public static final String f25475c = "version";

    /* renamed from: a */
    public final C9689z f25476a;

    public C9340e(@C0359n0 C9689z zVar) {
        this.f25476a = zVar;
    }

    /* renamed from: c */
    public boolean mo18851c(@C0359n0 JsonValue jsonValue, boolean z) {
        return jsonValue.mo18783y() && this.f25476a.apply(jsonValue.mo18769l());
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f25476a.equals(((C9340e) obj).f25476a);
    }

    public int hashCode() {
        return this.f25476a.hashCode();
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j(f25474b, this.f25476a).mo18817a().mo17264q();
    }
}
