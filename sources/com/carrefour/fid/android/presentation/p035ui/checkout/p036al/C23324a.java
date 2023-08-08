package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.a */
public final class C23324a implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C23325a f59048b = new C23325a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f59049c = 0;

    /* renamed from: a */
    public final boolean f59050a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.a$a */
    public static final class C23325a {
        public /* synthetic */ C23325a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23324a mo68315a(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23324a.class.getClassLoader());
            if (bundle.containsKey("is_non_food_basket")) {
                z = bundle.getBoolean("is_non_food_basket");
            } else {
                z = false;
            }
            return new C23324a(z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23324a mo68316b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("is_non_food_basket")) {
                bool = (Boolean) p0Var.mo57648h("is_non_food_basket");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"is_non_food_basket\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new C23324a(bool.booleanValue());
        }

        public C23325a() {
        }
    }

    public C23324a() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C23324a m104107c(C23324a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f59050a;
        }
        return aVar.mo68308b(z);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C23324a m104108d(@C12579k C19456p0 p0Var) {
        return f59048b.mo68316b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23324a fromBundle(@C12579k Bundle bundle) {
        return f59048b.mo68315a(bundle);
    }

    /* renamed from: a */
    public final boolean mo68307a() {
        return this.f59050a;
    }

    @C12579k
    /* renamed from: b */
    public final C23324a mo68308b(boolean z) {
        return new C23324a(z);
    }

    /* renamed from: e */
    public final boolean mo68309e() {
        return this.f59050a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23324a) && this.f59050a == ((C23324a) obj).f59050a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo68311f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_non_food_basket", this.f59050a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo68312g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("is_non_food_basket", Boolean.valueOf(this.f59050a));
        return p0Var;
    }

    public int hashCode() {
        boolean z = this.f59050a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f59050a;
        return "CheckoutFragmentArgs(isNonFoodBasket=" + z + ")";
    }

    public C23324a(boolean z) {
        this.f59050a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23324a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
