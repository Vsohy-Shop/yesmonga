package com.urbanairship.json.matchers;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9329d;
import com.urbanairship.json.C9335g;
import com.urbanairship.json.JsonValue;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.json.matchers.a */
public class C9336a extends C9335g {
    @C0359n0

    /* renamed from: c */
    public static final String f25462c = "array_contains";
    @C0359n0

    /* renamed from: d */
    public static final String f25463d = "index";

    /* renamed from: a */
    public final Integer f25464a;

    /* renamed from: b */
    public final C9329d f25465b;

    public C9336a(@C0359n0 C9329d dVar, @C0363p0 Integer num) {
        this.f25465b = dVar;
        this.f25464a = num;
    }

    /* renamed from: c */
    public boolean mo18851c(@C0359n0 JsonValue jsonValue, boolean z) {
        if (!jsonValue.mo18776t()) {
            return false;
        }
        C9322a z2 = jsonValue.mo18784z();
        Integer num = this.f25464a;
        if (num == null) {
            Iterator<JsonValue> it = z2.iterator();
            while (it.hasNext()) {
                if (this.f25465b.apply(it.next())) {
                    return true;
                }
            }
            return false;
        } else if (num.intValue() < 0 || this.f25464a.intValue() >= z2.size()) {
            return false;
        } else {
            return this.f25465b.apply(z2.mo18791h(this.f25464a.intValue()));
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9336a aVar = (C9336a) obj;
        Integer num = this.f25464a;
        if (num == null ? aVar.f25464a == null : num.equals(aVar.f25464a)) {
            return this.f25465b.equals(aVar.f25465b);
        }
        return false;
    }

    public int hashCode() {
        int i;
        Integer num = this.f25464a;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f25465b.hashCode();
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j(f25462c, this.f25465b).mo18826j("index", this.f25464a).mo18817a().mo17264q();
    }
}
