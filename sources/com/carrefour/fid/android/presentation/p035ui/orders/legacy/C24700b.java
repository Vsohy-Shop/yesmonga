package com.carrefour.fid.android.presentation.p035ui.orders.legacy;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.legacy.b */
public final class C24700b implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C24701a f61330b = new C24701a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61331c = 0;
    @C12579k

    /* renamed from: a */
    public final String f61332a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.legacy.b$a */
    public static final class C24701a {
        public /* synthetic */ C24701a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24700b mo72200a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24700b.class.getClassLoader());
            if (bundle.containsKey("order_id")) {
                String string = bundle.getString("order_id");
                if (string != null) {
                    return new C24700b(string);
                }
                throw new IllegalArgumentException("Argument \"order_id\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"order_id\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24700b mo72201b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("order_id")) {
                String str = (String) p0Var.mo57648h("order_id");
                if (str != null) {
                    return new C24700b(str);
                }
                throw new IllegalArgumentException("Argument \"order_id\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"order_id\" is missing and does not have an android:defaultValue");
        }

        public C24701a() {
        }
    }

    public C24700b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        this.f61332a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C24700b m107832c(C24700b bVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f61332a;
        }
        return bVar.mo72193b(str);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C24700b m107833d(@C12579k C19456p0 p0Var) {
        return f61330b.mo72201b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24700b fromBundle(@C12579k Bundle bundle) {
        return f61330b.mo72200a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo72192a() {
        return this.f61332a;
    }

    @C12579k
    /* renamed from: b */
    public final C24700b mo72193b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        return new C24700b(str);
    }

    @C12579k
    /* renamed from: e */
    public final String mo72194e() {
        return this.f61332a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24700b) && Intrinsics.areEqual((Object) this.f61332a, (Object) ((C24700b) obj).f61332a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo72196f() {
        Bundle bundle = new Bundle();
        bundle.putString("order_id", this.f61332a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo72197g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("order_id", this.f61332a);
        return p0Var;
    }

    public int hashCode() {
        return this.f61332a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f61332a;
        return "WithdrawalOrderDriveFragmentArgs(orderId=" + str + ")";
    }
}
