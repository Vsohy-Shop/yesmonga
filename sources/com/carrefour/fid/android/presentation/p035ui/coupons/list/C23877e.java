package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.viewmodels.coupons.C26236h;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.e */
public final class C23877e implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C23878a f60039b = new C23878a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f60040c = 0;

    /* renamed from: a */
    public final boolean f60041a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.e$a */
    public static final class C23878a {
        public /* synthetic */ C23878a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23877e mo69932a(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23877e.class.getClassLoader());
            if (bundle.containsKey(C26236h.f64162a)) {
                z = bundle.getBoolean(C26236h.f64162a);
            } else {
                z = false;
            }
            return new C23877e(z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23877e mo69933b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(C26236h.f64162a)) {
                bool = (Boolean) p0Var.mo57648h(C26236h.f64162a);
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"isOnlineOnly\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new C23877e(bool.booleanValue());
        }

        public C23878a() {
        }
    }

    public C23877e() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C23877e m105668c(C23877e eVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = eVar.f60041a;
        }
        return eVar.mo69925b(z);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C23877e m105669d(@C12579k C19456p0 p0Var) {
        return f60039b.mo69933b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23877e fromBundle(@C12579k Bundle bundle) {
        return f60039b.mo69932a(bundle);
    }

    /* renamed from: a */
    public final boolean mo69924a() {
        return this.f60041a;
    }

    @C12579k
    /* renamed from: b */
    public final C23877e mo69925b(boolean z) {
        return new C23877e(z);
    }

    /* renamed from: e */
    public final boolean mo69926e() {
        return this.f60041a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23877e) && this.f60041a == ((C23877e) obj).f60041a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo69928f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C26236h.f64162a, this.f60041a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo69929g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(C26236h.f64162a, Boolean.valueOf(this.f60041a));
        return p0Var;
    }

    public int hashCode() {
        boolean z = this.f60041a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f60041a;
        return "CouponsListFragmentArgs(isOnlineOnly=" + z + ")";
    }

    public C23877e(boolean z) {
        this.f60041a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23877e(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
