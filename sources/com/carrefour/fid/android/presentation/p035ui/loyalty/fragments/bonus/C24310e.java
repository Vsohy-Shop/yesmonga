package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.e */
public final class C24310e implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C24311a f60744b = new C24311a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f60745c = 0;

    /* renamed from: a */
    public final boolean f60746a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.e$a */
    public static final class C24311a {
        public /* synthetic */ C24311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24310e mo71124a(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24310e.class.getClassLoader());
            if (bundle.containsKey("isFromActiveFid")) {
                z = bundle.getBoolean("isFromActiveFid");
            } else {
                z = false;
            }
            return new C24310e(z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24310e mo71125b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("isFromActiveFid")) {
                bool = (Boolean) p0Var.mo57648h("isFromActiveFid");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"isFromActiveFid\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new C24310e(bool.booleanValue());
        }

        public C24311a() {
        }
    }

    public C24310e() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C24310e m106857c(C24310e eVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = eVar.f60746a;
        }
        return eVar.mo71117b(z);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C24310e m106858d(@C12579k C19456p0 p0Var) {
        return f60744b.mo71125b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24310e fromBundle(@C12579k Bundle bundle) {
        return f60744b.mo71124a(bundle);
    }

    /* renamed from: a */
    public final boolean mo71116a() {
        return this.f60746a;
    }

    @C12579k
    /* renamed from: b */
    public final C24310e mo71117b(boolean z) {
        return new C24310e(z);
    }

    /* renamed from: e */
    public final boolean mo71118e() {
        return this.f60746a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24310e) && this.f60746a == ((C24310e) obj).f60746a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo71120f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromActiveFid", this.f60746a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo71121g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("isFromActiveFid", Boolean.valueOf(this.f60746a));
        return p0Var;
    }

    public int hashCode() {
        boolean z = this.f60746a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f60746a;
        return "LoyaltyBonusListFragmentArgs(isFromActiveFid=" + z + ")";
    }

    public C24310e(boolean z) {
        this.f60746a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24310e(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
