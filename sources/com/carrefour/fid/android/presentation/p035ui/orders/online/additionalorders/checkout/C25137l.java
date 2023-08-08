package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.l */
public final class C25137l implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C25138a f61942b = new C25138a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61943c = 8;
    @C12580l

    /* renamed from: a */
    public final Bundle f61944a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.l$a */
    public static final class C25138a {
        public /* synthetic */ C25138a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25137l mo73058a(@C12579k Bundle bundle) {
            Bundle bundle2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25137l.class.getClassLoader());
            if (bundle.containsKey("error_payment")) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle2 = (Bundle) bundle.get("error_payment");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle2 = null;
            }
            return new C25137l(bundle2);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25137l mo73059b(@C12579k C19456p0 p0Var) {
            Bundle bundle;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("error_payment")) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle = (Bundle) p0Var.mo57648h("error_payment");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle = null;
            }
            return new C25137l(bundle);
        }

        public C25138a() {
        }
    }

    public C25137l() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C25137l m108754c(C25137l lVar, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = lVar.f61944a;
        }
        return lVar.mo73051b(bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C25137l m108755d(@C12579k C19456p0 p0Var) {
        return f61942b.mo73059b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25137l fromBundle(@C12579k Bundle bundle) {
        return f61942b.mo73058a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final Bundle mo73050a() {
        return this.f61944a;
    }

    @C12579k
    /* renamed from: b */
    public final C25137l mo73051b(@C12580l Bundle bundle) {
        return new C25137l(bundle);
    }

    @C12580l
    /* renamed from: e */
    public final Bundle mo73052e() {
        return this.f61944a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25137l) && Intrinsics.areEqual((Object) this.f61944a, (Object) ((C25137l) obj).f61944a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo73054f() {
        Bundle bundle = new Bundle();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("error_payment", this.f61944a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("error_payment", (Serializable) this.f61944a);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo73055g() {
        C19456p0 p0Var = new C19456p0();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("error_payment", this.f61944a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("error_payment", (Serializable) this.f61944a);
        }
        return p0Var;
    }

    public int hashCode() {
        Bundle bundle = this.f61944a;
        if (bundle == null) {
            return 0;
        }
        return bundle.hashCode();
    }

    @C12579k
    public String toString() {
        Bundle bundle = this.f61944a;
        return "CheckoutPaymentErrorFragmentArgs(errorPayment=" + bundle + ")";
    }

    public C25137l(@C12580l Bundle bundle) {
        this.f61944a = bundle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25137l(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }
}
