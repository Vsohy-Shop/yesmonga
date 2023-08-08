package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.i */
public final class C25175i implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C25176a f62014c = new C25176a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f62015d = OrderType.f70277d;
    @C12580l

    /* renamed from: a */
    public final OrderType f62016a;

    /* renamed from: b */
    public final int f62017b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.i$a */
    public static final class C25176a {
        public /* synthetic */ C25176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25175i mo73164a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25175i.class.getClassLoader());
            if (bundle.containsKey("orderType")) {
                Class<OrderType> cls = OrderType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    OrderType orderType = (OrderType) bundle.get("orderType");
                    if (bundle.containsKey("sourceGraphId")) {
                        return new C25175i(orderType, bundle.getInt("sourceGraphId"));
                    }
                    throw new IllegalArgumentException("Required argument \"sourceGraphId\" is missing and does not have an android:defaultValue");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"orderType\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25175i mo73165b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("orderType")) {
                Class<OrderType> cls = OrderType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    OrderType orderType = (OrderType) p0Var.mo57648h("orderType");
                    if (p0Var.mo57647f("sourceGraphId")) {
                        Integer num = (Integer) p0Var.mo57648h("sourceGraphId");
                        if (num != null) {
                            return new C25175i(orderType, num.intValue());
                        }
                        throw new IllegalArgumentException("Argument \"sourceGraphId\" of type reference does not support null values");
                    }
                    throw new IllegalArgumentException("Required argument \"sourceGraphId\" is missing and does not have an android:defaultValue");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"orderType\" is missing and does not have an android:defaultValue");
        }

        public C25176a() {
        }
    }

    public C25175i(@C12580l OrderType orderType, int i) {
        this.f62016a = orderType;
        this.f62017b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C25175i m108832d(C25175i iVar, OrderType orderType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            orderType = iVar.f62016a;
        }
        if ((i2 & 2) != 0) {
            i = iVar.f62017b;
        }
        return iVar.mo73156c(orderType, i);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C25175i m108833e(@C12579k C19456p0 p0Var) {
        return f62014c.mo73165b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25175i fromBundle(@C12579k Bundle bundle) {
        return f62014c.mo73164a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final OrderType mo73154a() {
        return this.f62016a;
    }

    /* renamed from: b */
    public final int mo73155b() {
        return this.f62017b;
    }

    @C12579k
    /* renamed from: c */
    public final C25175i mo73156c(@C12580l OrderType orderType, int i) {
        return new C25175i(orderType, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25175i)) {
            return false;
        }
        C25175i iVar = (C25175i) obj;
        return Intrinsics.areEqual((Object) this.f62016a, (Object) iVar.f62016a) && this.f62017b == iVar.f62017b;
    }

    @C12580l
    /* renamed from: f */
    public final OrderType mo73158f() {
        return this.f62016a;
    }

    /* renamed from: g */
    public final int mo73159g() {
        return this.f62017b;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo73160h() {
        Bundle bundle = new Bundle();
        Class<OrderType> cls = OrderType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("orderType", this.f62016a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("orderType", (Serializable) this.f62016a);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        bundle.putInt("sourceGraphId", this.f62017b);
        return bundle;
    }

    public int hashCode() {
        OrderType orderType = this.f62016a;
        return ((orderType == null ? 0 : orderType.hashCode()) * 31) + Integer.hashCode(this.f62017b);
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo73162i() {
        C19456p0 p0Var = new C19456p0();
        Class<OrderType> cls = OrderType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("orderType", this.f62016a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("orderType", (Serializable) this.f62016a);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        p0Var.mo57656q("sourceGraphId", Integer.valueOf(this.f62017b));
        return p0Var;
    }

    @C12579k
    public String toString() {
        OrderType orderType = this.f62016a;
        int i = this.f62017b;
        return "BasketAdditionalOrderFragmentArgs(orderType=" + orderType + ", sourceGraphId=" + i + ")";
    }
}
