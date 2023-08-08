package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.errorprone.annotations.C32488a;

@C40473a
/* renamed from: com.google.android.gms.common.internal.c0 */
public class C40738c0 implements C40477a.C40481d.C40487f {
    @C0359n0

    /* renamed from: b */
    public static final C40738c0 f103789b = m165763a().mo134313a();
    @C0363p0

    /* renamed from: a */
    public final String f103790a;

    @C40473a
    /* renamed from: com.google.android.gms.common.internal.c0$a */
    public static class C40739a {
        @C0363p0

        /* renamed from: a */
        public String f103791a;

        public C40739a() {
        }

        @C40473a
        @C0359n0
        /* renamed from: a */
        public C40738c0 mo134313a() {
            return new C40738c0(this.f103791a, (C40766h0) null);
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: b */
        public C40739a mo134314b(@C0363p0 String str) {
            this.f103791a = str;
            return this;
        }

        public /* synthetic */ C40739a(C40762g0 g0Var) {
        }
    }

    public /* synthetic */ C40738c0(String str, C40766h0 h0Var) {
        this.f103790a = str;
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static C40739a m165763a() {
        return new C40739a((C40762g0) null);
    }

    @C0359n0
    /* renamed from: b */
    public final Bundle mo134310b() {
        Bundle bundle = new Bundle();
        String str = this.f103790a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40738c0)) {
            return false;
        }
        return C40808s.m166010b(this.f103790a, ((C40738c0) obj).f103790a);
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f103790a);
    }
}
