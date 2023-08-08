package com.urbanairship.json.matchers;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9335g;
import com.urbanairship.json.JsonValue;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.json.matchers.c */
public class C9338c extends C9335g {
    @C0359n0

    /* renamed from: c */
    public static final String f25468c = "at_least";
    @C0359n0

    /* renamed from: d */
    public static final String f25469d = "at_most";
    @C0363p0

    /* renamed from: a */
    public final Double f25470a;
    @C0363p0

    /* renamed from: b */
    public final Double f25471b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9338c(@C0363p0 Double d, @C0363p0 Double d2) {
        this.f25470a = d;
        this.f25471b = d2;
    }

    /* renamed from: c */
    public boolean mo18851c(@C0359n0 JsonValue jsonValue, boolean z) {
        if (this.f25470a != null && (!jsonValue.mo18782x() || jsonValue.mo18758d(0.0d) < this.f25470a.doubleValue())) {
            return false;
        }
        if (this.f25471b == null || (jsonValue.mo18782x() && jsonValue.mo18758d(0.0d) <= this.f25471b.doubleValue())) {
            return true;
        }
        return false;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9338c cVar = (C9338c) obj;
        Double d = this.f25470a;
        if (d == null ? cVar.f25470a != null : !d.equals(cVar.f25470a)) {
            return false;
        }
        Double d2 = this.f25471b;
        Double d3 = cVar.f25471b;
        if (d2 != null) {
            return d2.equals(d3);
        }
        if (d3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        Double d = this.f25470a;
        int i2 = 0;
        if (d != null) {
            i = d.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Double d2 = this.f25471b;
        if (d2 != null) {
            i2 = d2.hashCode();
        }
        return i3 + i2;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j(f25468c, this.f25470a).mo18826j(f25469d, this.f25471b).mo18817a().mo17264q();
    }
}
