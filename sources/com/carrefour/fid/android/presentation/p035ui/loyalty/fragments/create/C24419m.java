package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.m */
public final class C24419m implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C24420a f60896b = new C24420a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f60897c = 0;

    /* renamed from: a */
    public final boolean f60898a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.m$a */
    public static final class C24420a {
        public /* synthetic */ C24420a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24419m mo71431a(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24419m.class.getClassLoader());
            if (bundle.containsKey(C38212b.f96814v)) {
                z = bundle.getBoolean(C38212b.f96814v);
            } else {
                z = false;
            }
            return new C24419m(z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24419m mo71432b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(C38212b.f96814v)) {
                bool = (Boolean) p0Var.mo57648h(C38212b.f96814v);
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"error_balance\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new C24419m(bool.booleanValue());
        }

        public C24420a() {
        }
    }

    public C24419m() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C24419m m107168c(C24419m mVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mVar.f60898a;
        }
        return mVar.mo71424b(z);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C24419m m107169d(@C12579k C19456p0 p0Var) {
        return f60896b.mo71432b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24419m fromBundle(@C12579k Bundle bundle) {
        return f60896b.mo71431a(bundle);
    }

    /* renamed from: a */
    public final boolean mo71423a() {
        return this.f60898a;
    }

    @C12579k
    /* renamed from: b */
    public final C24419m mo71424b(boolean z) {
        return new C24419m(z);
    }

    /* renamed from: e */
    public final boolean mo71425e() {
        return this.f60898a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24419m) && this.f60898a == ((C24419m) obj).f60898a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo71427f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C38212b.f96814v, this.f60898a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo71428g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(C38212b.f96814v, Boolean.valueOf(this.f60898a));
        return p0Var;
    }

    public int hashCode() {
        boolean z = this.f60898a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f60898a;
        return "CreateOrAttachCardFragmentArgs(errorBalance=" + z + ")";
    }

    public C24419m(boolean z) {
        this.f60898a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24419m(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
