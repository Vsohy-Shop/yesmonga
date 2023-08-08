package com.google.android.gms.common.api.internal;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C40808s;
import com.urbanairship.analytics.C35567m;

/* renamed from: com.google.android.gms.common.api.internal.x1 */
public final class C40647x1 {

    /* renamed from: a */
    public final C40525c f103610a;

    /* renamed from: b */
    public final Feature f103611b;

    public /* synthetic */ C40647x1(C40525c cVar, Feature feature, C40642w1 w1Var) {
        this.f103610a = cVar;
        this.f103611b = feature;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj != null && (obj instanceof C40647x1)) {
            C40647x1 x1Var = (C40647x1) obj;
            if (!C40808s.m166010b(this.f103610a, x1Var.f103610a) || !C40808s.m166010b(this.f103611b, x1Var.f103611b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f103610a, this.f103611b);
    }

    public final String toString() {
        return C40808s.m166012d(this).mo134475a("key", this.f103610a).mo134475a(C35567m.f87870w, this.f103611b).toString();
    }
}
