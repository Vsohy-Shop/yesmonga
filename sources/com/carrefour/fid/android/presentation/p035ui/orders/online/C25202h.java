package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.h */
public final class C25202h implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C25203a f62074d = new C25203a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f62075e = OrderType.f70277d;
    @C12579k

    /* renamed from: a */
    public final OrderType f62076a;
    @C12580l

    /* renamed from: b */
    public final String f62077b;

    /* renamed from: c */
    public final boolean f62078c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.h$a */
    public static final class C25203a {
        public /* synthetic */ C25203a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25202h mo73240a(@C12579k Bundle bundle) {
            String str;
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25202h.class.getClassLoader());
            if (bundle.containsKey("order_id")) {
                str = bundle.getString("order_id");
            } else {
                str = null;
            }
            if (bundle.containsKey(C36178i.f89310e)) {
                z = bundle.getBoolean(C36178i.f89310e);
            } else {
                z = false;
            }
            if (bundle.containsKey(C36178i.f89309d)) {
                Class<OrderType> cls = OrderType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    OrderType orderType = (OrderType) bundle.get(C36178i.f89309d);
                    if (orderType != null) {
                        return new C25202h(orderType, str, z);
                    }
                    throw new IllegalArgumentException("Argument \"order_type\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"order_type\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25202h mo73241b(@C12579k C19456p0 p0Var) {
            String str;
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("order_id")) {
                str = (String) p0Var.mo57648h("order_id");
            } else {
                str = null;
            }
            if (p0Var.mo57647f(C36178i.f89310e)) {
                bool = (Boolean) p0Var.mo57648h(C36178i.f89310e);
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"order_status_is_at_least_billed\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            if (p0Var.mo57647f(C36178i.f89309d)) {
                Class<OrderType> cls = OrderType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    OrderType orderType = (OrderType) p0Var.mo57648h(C36178i.f89309d);
                    if (orderType != null) {
                        return new C25202h(orderType, str, bool.booleanValue());
                    }
                    throw new IllegalArgumentException("Argument \"order_type\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"order_type\" is missing and does not have an android:defaultValue");
        }

        public C25203a() {
        }
    }

    public C25202h(@C12579k OrderType orderType, @C12580l String str, boolean z) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f62076a = orderType;
        this.f62077b = str;
        this.f62078c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ C25202h m108907e(C25202h hVar, OrderType orderType, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            orderType = hVar.f62076a;
        }
        if ((i & 2) != 0) {
            str = hVar.f62077b;
        }
        if ((i & 4) != 0) {
            z = hVar.f62078c;
        }
        return hVar.mo73231d(orderType, str, z);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C25202h m108908f(@C12579k C19456p0 p0Var) {
        return f62074d.mo73241b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25202h fromBundle(@C12579k Bundle bundle) {
        return f62074d.mo73240a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final OrderType mo73228a() {
        return this.f62076a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo73229b() {
        return this.f62077b;
    }

    /* renamed from: c */
    public final boolean mo73230c() {
        return this.f62078c;
    }

    @C12579k
    /* renamed from: d */
    public final C25202h mo73231d(@C12579k OrderType orderType, @C12580l String str, boolean z) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new C25202h(orderType, str, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25202h)) {
            return false;
        }
        C25202h hVar = (C25202h) obj;
        return Intrinsics.areEqual((Object) this.f62076a, (Object) hVar.f62076a) && Intrinsics.areEqual((Object) this.f62077b, (Object) hVar.f62077b) && this.f62078c == hVar.f62078c;
    }

    @C12580l
    /* renamed from: g */
    public final String mo73233g() {
        return this.f62077b;
    }

    /* renamed from: h */
    public final boolean mo73234h() {
        return this.f62078c;
    }

    public int hashCode() {
        int hashCode = this.f62076a.hashCode() * 31;
        String str = this.f62077b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f62078c;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final OrderType mo73236i() {
        return this.f62076a;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo73237j() {
        Bundle bundle = new Bundle();
        bundle.putString("order_id", this.f62077b);
        bundle.putBoolean(C36178i.f89310e, this.f62078c);
        Class<OrderType> cls = OrderType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OrderType orderType = this.f62076a;
            Intrinsics.checkNotNull(orderType, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable(C36178i.f89309d, orderType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OrderType orderType2 = this.f62076a;
            Intrinsics.checkNotNull(orderType2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable(C36178i.f89309d, (Serializable) orderType2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo73238k() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("order_id", this.f62077b);
        p0Var.mo57656q(C36178i.f89310e, Boolean.valueOf(this.f62078c));
        Class<OrderType> cls = OrderType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OrderType orderType = this.f62076a;
            Intrinsics.checkNotNull(orderType, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q(C36178i.f89309d, orderType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OrderType orderType2 = this.f62076a;
            Intrinsics.checkNotNull(orderType2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q(C36178i.f89309d, (Serializable) orderType2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        OrderType orderType = this.f62076a;
        String str = this.f62077b;
        boolean z = this.f62078c;
        return "OrdersOnlineDetailsFragmentArgs(orderType=" + orderType + ", orderId=" + str + ", orderStatusIsAtLeastBilled=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25202h(OrderType orderType, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
    }
}
