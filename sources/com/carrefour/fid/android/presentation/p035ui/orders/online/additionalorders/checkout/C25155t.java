package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.t */
public final class C25155t implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C25156a f61990b = new C25156a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61991c = OrderType.f70277d;
    @C12580l

    /* renamed from: a */
    public final OrderType f61992a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.t$a */
    public static final class C25156a {
        public /* synthetic */ C25156a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25155t mo73106a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25155t.class.getClassLoader());
            if (bundle.containsKey("orderType")) {
                Class<OrderType> cls = OrderType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    return new C25155t((OrderType) bundle.get("orderType"));
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"orderType\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25155t mo73107b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("orderType")) {
                Class<OrderType> cls = OrderType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    return new C25155t((OrderType) p0Var.mo57648h("orderType"));
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"orderType\" is missing and does not have an android:defaultValue");
        }

        public C25156a() {
        }
    }

    public C25155t(@C12580l OrderType orderType) {
        this.f61992a = orderType;
    }

    /* renamed from: c */
    public static /* synthetic */ C25155t m108782c(C25155t tVar, OrderType orderType, int i, Object obj) {
        if ((i & 1) != 0) {
            orderType = tVar.f61992a;
        }
        return tVar.mo73099b(orderType);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C25155t m108783d(@C12579k C19456p0 p0Var) {
        return f61990b.mo73107b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25155t fromBundle(@C12579k Bundle bundle) {
        return f61990b.mo73106a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final OrderType mo73098a() {
        return this.f61992a;
    }

    @C12579k
    /* renamed from: b */
    public final C25155t mo73099b(@C12580l OrderType orderType) {
        return new C25155t(orderType);
    }

    @C12580l
    /* renamed from: e */
    public final OrderType mo73100e() {
        return this.f61992a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25155t) && Intrinsics.areEqual((Object) this.f61992a, (Object) ((C25155t) obj).f61992a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo73102f() {
        Bundle bundle = new Bundle();
        Class<OrderType> cls = OrderType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("orderType", this.f61992a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("orderType", (Serializable) this.f61992a);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo73103g() {
        C19456p0 p0Var = new C19456p0();
        Class<OrderType> cls = OrderType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("orderType", this.f61992a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("orderType", (Serializable) this.f61992a);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        OrderType orderType = this.f61992a;
        if (orderType == null) {
            return 0;
        }
        return orderType.hashCode();
    }

    @C12579k
    public String toString() {
        OrderType orderType = this.f61992a;
        return "CheckoutStepOneAdditionalOrderFragmentArgs(orderType=" + orderType + ")";
    }
}
