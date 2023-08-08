package com.carrefour.fid.android.presentation.p035ui.orders;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.j */
public final class C24691j implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C24692a f61310b = new C24692a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61311c = 0;
    @C12580l

    /* renamed from: a */
    public final String f61312a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.j$a */
    public static final class C24692a {
        public /* synthetic */ C24692a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24691j mo72171a(@C12579k Bundle bundle) {
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24691j.class.getClassLoader());
            if (bundle.containsKey("order_id")) {
                str = bundle.getString("order_id");
            } else {
                str = null;
            }
            return new C24691j(str);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24691j mo72172b(@C12579k C19456p0 p0Var) {
            String str;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("order_id")) {
                str = (String) p0Var.mo57648h("order_id");
            } else {
                str = null;
            }
            return new C24691j(str);
        }

        public C24692a() {
        }
    }

    public C24691j() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C24691j m107807c(C24691j jVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jVar.f61312a;
        }
        return jVar.mo72164b(str);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C24691j m107808d(@C12579k C19456p0 p0Var) {
        return f61310b.mo72172b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24691j fromBundle(@C12579k Bundle bundle) {
        return f61310b.mo72171a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final String mo72163a() {
        return this.f61312a;
    }

    @C12579k
    /* renamed from: b */
    public final C24691j mo72164b(@C12580l String str) {
        return new C24691j(str);
    }

    @C12580l
    /* renamed from: e */
    public final String mo72165e() {
        return this.f61312a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24691j) && Intrinsics.areEqual((Object) this.f61312a, (Object) ((C24691j) obj).f61312a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo72167f() {
        Bundle bundle = new Bundle();
        bundle.putString("order_id", this.f61312a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo72168g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("order_id", this.f61312a);
        return p0Var;
    }

    public int hashCode() {
        String str = this.f61312a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f61312a;
        return "OrdersSuccessHandleFragmentArgs(orderId=" + str + ")";
    }

    public C24691j(@C12580l String str) {
        this.f61312a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24691j(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
