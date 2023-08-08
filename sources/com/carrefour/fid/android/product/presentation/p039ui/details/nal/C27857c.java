package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.c */
public final class C27857c implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C27858a f67463b = new C27858a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f67464c = 0;

    /* renamed from: a */
    public final boolean f67465a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.c$a */
    public static final class C27858a {
        public /* synthetic */ C27858a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C27857c mo80941a(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C27857c.class.getClassLoader());
            if (bundle.containsKey("relayPointEligible")) {
                z = bundle.getBoolean("relayPointEligible");
            } else {
                z = false;
            }
            return new C27857c(z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C27857c mo80942b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("relayPointEligible")) {
                bool = (Boolean) p0Var.mo57648h("relayPointEligible");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"relayPointEligible\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new C27857c(bool.booleanValue());
        }

        public C27858a() {
        }
    }

    public C27857c() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C27857c m116934c(C27857c cVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cVar.f67465a;
        }
        return cVar.mo80934b(z);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C27857c m116935d(@C12579k C19456p0 p0Var) {
        return f67463b.mo80942b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C27857c fromBundle(@C12579k Bundle bundle) {
        return f67463b.mo80941a(bundle);
    }

    /* renamed from: a */
    public final boolean mo80933a() {
        return this.f67465a;
    }

    @C12579k
    /* renamed from: b */
    public final C27857c mo80934b(boolean z) {
        return new C27857c(z);
    }

    /* renamed from: e */
    public final boolean mo80935e() {
        return this.f67465a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27857c) && this.f67465a == ((C27857c) obj).f67465a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo80937f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("relayPointEligible", this.f67465a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo80938g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("relayPointEligible", Boolean.valueOf(this.f67465a));
        return p0Var;
    }

    public int hashCode() {
        boolean z = this.f67465a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f67465a;
        return "DeliveryChoiceInfoFragmentArgs(relayPointEligible=" + z + ")";
    }

    public C27857c(boolean z) {
        this.f67465a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27857c(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
