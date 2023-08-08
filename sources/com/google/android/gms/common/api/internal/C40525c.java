package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40477a.C40481d;
import com.google.android.gms.common.internal.C40808s;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.c */
public final class C40525c<O extends C40477a.C40481d> {

    /* renamed from: a */
    public final int f103325a;

    /* renamed from: b */
    public final C40477a f103326b;
    @C0363p0

    /* renamed from: c */
    public final C40477a.C40481d f103327c;
    @C0363p0

    /* renamed from: d */
    public final String f103328d;

    public C40525c(C40477a aVar, @C0363p0 C40477a.C40481d dVar, @C0363p0 String str) {
        this.f103326b = aVar;
        this.f103327c = dVar;
        this.f103328d = str;
        this.f103325a = C40808s.m166011c(aVar, dVar, str);
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static <O extends C40477a.C40481d> C40525c<O> m164950a(@C0359n0 C40477a<O> aVar, @C0363p0 O o, @C0363p0 String str) {
        return new C40525c<>(aVar, o, str);
    }

    @C0359n0
    /* renamed from: b */
    public final String mo133841b() {
        return this.f103326b.mo133663d();
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40525c)) {
            return false;
        }
        C40525c cVar = (C40525c) obj;
        if (!C40808s.m166010b(this.f103326b, cVar.f103326b) || !C40808s.m166010b(this.f103327c, cVar.f103327c) || !C40808s.m166010b(this.f103328d, cVar.f103328d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f103325a;
    }
}
