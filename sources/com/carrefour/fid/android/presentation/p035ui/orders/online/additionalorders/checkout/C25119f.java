package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.f */
public final class C25119f implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C25120a f61919b = new C25120a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61920c = 8;
    @C12580l

    /* renamed from: a */
    public final Bundle f61921a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.f$a */
    public static final class C25120a {
        public /* synthetic */ C25120a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25119f mo73006a(@C12579k Bundle bundle) {
            Bundle bundle2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25119f.class.getClassLoader());
            if (bundle.containsKey(CheckoutConfirmationFragment.f59773I0)) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle2 = (Bundle) bundle.get(CheckoutConfirmationFragment.f59773I0);
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle2 = null;
            }
            return new C25119f(bundle2);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25119f mo73007b(@C12579k C19456p0 p0Var) {
            Bundle bundle;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(CheckoutConfirmationFragment.f59773I0)) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle = (Bundle) p0Var.mo57648h(CheckoutConfirmationFragment.f59773I0);
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle = null;
            }
            return new C25119f(bundle);
        }

        public C25120a() {
        }
    }

    public C25119f() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C25119f m108707c(C25119f fVar, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = fVar.f61921a;
        }
        return fVar.mo72999b(bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C25119f m108708d(@C12579k C19456p0 p0Var) {
        return f61919b.mo73007b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25119f fromBundle(@C12579k Bundle bundle) {
        return f61919b.mo73006a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final Bundle mo72998a() {
        return this.f61921a;
    }

    @C12579k
    /* renamed from: b */
    public final C25119f mo72999b(@C12580l Bundle bundle) {
        return new C25119f(bundle);
    }

    @C12580l
    /* renamed from: e */
    public final Bundle mo73000e() {
        return this.f61921a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25119f) && Intrinsics.areEqual((Object) this.f61921a, (Object) ((C25119f) obj).f61921a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo73002f() {
        Bundle bundle = new Bundle();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable(CheckoutConfirmationFragment.f59773I0, this.f61921a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable(CheckoutConfirmationFragment.f59773I0, (Serializable) this.f61921a);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo73003g() {
        C19456p0 p0Var = new C19456p0();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q(CheckoutConfirmationFragment.f59773I0, this.f61921a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q(CheckoutConfirmationFragment.f59773I0, (Serializable) this.f61921a);
        }
        return p0Var;
    }

    public int hashCode() {
        Bundle bundle = this.f61921a;
        if (bundle == null) {
            return 0;
        }
        return bundle.hashCode();
    }

    @C12579k
    public String toString() {
        Bundle bundle = this.f61921a;
        return "CheckoutConfirmationFragmentArgs(orderConfirmation=" + bundle + ")";
    }

    public C25119f(@C12580l Bundle bundle) {
        this.f61921a = bundle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25119f(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }
}
