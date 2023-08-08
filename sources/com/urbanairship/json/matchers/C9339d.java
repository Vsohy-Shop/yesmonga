package com.urbanairship.json.matchers;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9335g;
import com.urbanairship.json.JsonValue;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.json.matchers.d */
public class C9339d extends C9335g {
    @C0359n0

    /* renamed from: b */
    public static final String f25472b = "is_present";

    /* renamed from: a */
    public final boolean f25473a;

    public C9339d(boolean z) {
        this.f25473a = z;
    }

    /* renamed from: c */
    public boolean mo18851c(@C0359n0 JsonValue jsonValue, boolean z) {
        if (this.f25473a) {
            return !jsonValue.mo18780w();
        }
        return jsonValue.mo18780w();
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.f25473a == ((C9339d) obj).f25473a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f25473a ? 1 : 0;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j(f25472b, Boolean.valueOf(this.f25473a)).mo18817a().mo17264q();
    }
}
