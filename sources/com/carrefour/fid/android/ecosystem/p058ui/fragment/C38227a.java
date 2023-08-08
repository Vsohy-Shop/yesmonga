package com.carrefour.fid.android.ecosystem.p058ui.fragment;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.ecosystem.ui.fragment.a */
public final class C38227a implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C38228a f96866b = new C38228a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f96867c = 0;

    /* renamed from: a */
    public final boolean f96868a;

    /* renamed from: com.carrefour.fid.android.ecosystem.ui.fragment.a$a */
    public static final class C38228a {
        public /* synthetic */ C38228a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C38227a mo119671a(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C38227a.class.getClassLoader());
            if (bundle.containsKey("show_mobile")) {
                z = bundle.getBoolean("show_mobile");
            } else {
                z = false;
            }
            return new C38227a(z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C38227a mo119672b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("show_mobile")) {
                bool = (Boolean) p0Var.mo57648h("show_mobile");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"show_mobile\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new C38227a(bool.booleanValue());
        }

        public C38228a() {
        }
    }

    public C38227a() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C38227a m158487c(C38227a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f96868a;
        }
        return aVar.mo119664b(z);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C38227a m158488d(@C12579k C19456p0 p0Var) {
        return f96866b.mo119672b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C38227a fromBundle(@C12579k Bundle bundle) {
        return f96866b.mo119671a(bundle);
    }

    /* renamed from: a */
    public final boolean mo119663a() {
        return this.f96868a;
    }

    @C12579k
    /* renamed from: b */
    public final C38227a mo119664b(boolean z) {
        return new C38227a(z);
    }

    /* renamed from: e */
    public final boolean mo119665e() {
        return this.f96868a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38227a) && this.f96868a == ((C38227a) obj).f96868a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo119667f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_mobile", this.f96868a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo119668g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("show_mobile", Boolean.valueOf(this.f96868a));
        return p0Var;
    }

    public int hashCode() {
        boolean z = this.f96868a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f96868a;
        return "EcosystemFragmentArgs(showMobile=" + z + ")";
    }

    public C38227a(boolean z) {
        this.f96868a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38227a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
