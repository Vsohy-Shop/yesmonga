package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.h0 */
public final class C25125h0 implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C25126a f61925b = new C25126a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61926c = 0;
    @C12580l

    /* renamed from: a */
    public final String f61927a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.h0$a */
    public static final class C25126a {
        public /* synthetic */ C25126a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25125h0 mo73018a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25125h0.class.getClassLoader());
            if (bundle.containsKey("orderId")) {
                return new C25125h0(bundle.getString("orderId"));
            }
            throw new IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25125h0 mo73019b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("orderId")) {
                return new C25125h0((String) p0Var.mo57648h("orderId"));
            }
            throw new IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue");
        }

        public C25126a() {
        }
    }

    public C25125h0(@C12580l String str) {
        this.f61927a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C25125h0 m108721c(C25125h0 h0Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = h0Var.f61927a;
        }
        return h0Var.mo73011b(str);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C25125h0 m108722d(@C12579k C19456p0 p0Var) {
        return f61925b.mo73019b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25125h0 fromBundle(@C12579k Bundle bundle) {
        return f61925b.mo73018a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final String mo73010a() {
        return this.f61927a;
    }

    @C12579k
    /* renamed from: b */
    public final C25125h0 mo73011b(@C12580l String str) {
        return new C25125h0(str);
    }

    @C12580l
    /* renamed from: e */
    public final String mo73012e() {
        return this.f61927a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25125h0) && Intrinsics.areEqual((Object) this.f61927a, (Object) ((C25125h0) obj).f61927a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo73014f() {
        Bundle bundle = new Bundle();
        bundle.putString("orderId", this.f61927a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo73015g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("orderId", this.f61927a);
        return p0Var;
    }

    public int hashCode() {
        String str = this.f61927a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f61927a;
        return "CheckoutStepTwoAdditionalOderFragmentArgs(orderId=" + str + ")";
    }
}
