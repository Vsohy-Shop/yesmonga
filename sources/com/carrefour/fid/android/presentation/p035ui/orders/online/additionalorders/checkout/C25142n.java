package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.n */
public final class C25142n implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C25143a f61951c = new C25143a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61952d = 8;
    @C12580l

    /* renamed from: a */
    public final String f61953a;
    @C12580l

    /* renamed from: b */
    public final Bundle f61954b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.n$a */
    public static final class C25143a {
        public /* synthetic */ C25143a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25142n mo73074a(@C12579k Bundle bundle) {
            Bundle bundle2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25142n.class.getClassLoader());
            if (bundle.containsKey("arguments_payment_confirmation")) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle2 = (Bundle) bundle.get("arguments_payment_confirmation");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle2 = null;
            }
            if (bundle.containsKey(C38212b.f96799g)) {
                return new C25142n(bundle.getString(C38212b.f96799g), bundle2);
            }
            throw new IllegalArgumentException("Required argument \"initial_order_id\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25142n mo73075b(@C12579k C19456p0 p0Var) {
            Bundle bundle;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("arguments_payment_confirmation")) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle = (Bundle) p0Var.mo57648h("arguments_payment_confirmation");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle = null;
            }
            if (p0Var.mo57647f(C38212b.f96799g)) {
                return new C25142n((String) p0Var.mo57648h(C38212b.f96799g), bundle);
            }
            throw new IllegalArgumentException("Required argument \"initial_order_id\" is missing and does not have an android:defaultValue");
        }

        public C25143a() {
        }
    }

    public C25142n(@C12580l String str, @C12580l Bundle bundle) {
        this.f61953a = str;
        this.f61954b = bundle;
    }

    /* renamed from: d */
    public static /* synthetic */ C25142n m108767d(C25142n nVar, String str, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nVar.f61953a;
        }
        if ((i & 2) != 0) {
            bundle = nVar.f61954b;
        }
        return nVar.mo73066c(str, bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C25142n m108768e(@C12579k C19456p0 p0Var) {
        return f61951c.mo73075b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25142n fromBundle(@C12579k Bundle bundle) {
        return f61951c.mo73074a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final String mo73064a() {
        return this.f61953a;
    }

    @C12580l
    /* renamed from: b */
    public final Bundle mo73065b() {
        return this.f61954b;
    }

    @C12579k
    /* renamed from: c */
    public final C25142n mo73066c(@C12580l String str, @C12580l Bundle bundle) {
        return new C25142n(str, bundle);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25142n)) {
            return false;
        }
        C25142n nVar = (C25142n) obj;
        return Intrinsics.areEqual((Object) this.f61953a, (Object) nVar.f61953a) && Intrinsics.areEqual((Object) this.f61954b, (Object) nVar.f61954b);
    }

    @C12580l
    /* renamed from: f */
    public final Bundle mo73068f() {
        return this.f61954b;
    }

    @C12580l
    /* renamed from: g */
    public final String mo73069g() {
        return this.f61953a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo73070h() {
        Bundle bundle = new Bundle();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("arguments_payment_confirmation", this.f61954b);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("arguments_payment_confirmation", (Serializable) this.f61954b);
        }
        bundle.putString(C38212b.f96799g, this.f61953a);
        return bundle;
    }

    public int hashCode() {
        String str = this.f61953a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bundle bundle = this.f61954b;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo73072i() {
        C19456p0 p0Var = new C19456p0();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("arguments_payment_confirmation", this.f61954b);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("arguments_payment_confirmation", (Serializable) this.f61954b);
        }
        p0Var.mo57656q(C38212b.f96799g, this.f61953a);
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f61953a;
        Bundle bundle = this.f61954b;
        return "CheckoutPaymentFragmentArgs(initialOrderId=" + str + ", argumentsPaymentConfirmation=" + bundle + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25142n(String str, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle);
    }
}
