package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.e */
public final class C24768e implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C24769a f61453b = new C24769a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61454c = 0;
    @C12579k

    /* renamed from: a */
    public final OrderDetailParam f61455a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.e$a */
    public static final class C24769a {
        public /* synthetic */ C24769a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24768e mo72308a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24768e.class.getClassLoader());
            if (bundle.containsKey("order_detail_param")) {
                Class<OrderDetailParam> cls = OrderDetailParam.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    OrderDetailParam orderDetailParam = (OrderDetailParam) bundle.get("order_detail_param");
                    if (orderDetailParam != null) {
                        return new C24768e(orderDetailParam);
                    }
                    throw new IllegalArgumentException("Argument \"order_detail_param\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"order_detail_param\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24768e mo72309b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("order_detail_param")) {
                Class<OrderDetailParam> cls = OrderDetailParam.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    OrderDetailParam orderDetailParam = (OrderDetailParam) p0Var.mo57648h("order_detail_param");
                    if (orderDetailParam != null) {
                        return new C24768e(orderDetailParam);
                    }
                    throw new IllegalArgumentException("Argument \"order_detail_param\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"order_detail_param\" is missing and does not have an android:defaultValue");
        }

        public C24769a() {
        }
    }

    public C24768e(@C12579k OrderDetailParam orderDetailParam) {
        Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetailParam");
        this.f61455a = orderDetailParam;
    }

    /* renamed from: c */
    public static /* synthetic */ C24768e m107953c(C24768e eVar, OrderDetailParam orderDetailParam, int i, Object obj) {
        if ((i & 1) != 0) {
            orderDetailParam = eVar.f61455a;
        }
        return eVar.mo72301b(orderDetailParam);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C24768e m107954d(@C12579k C19456p0 p0Var) {
        return f61453b.mo72309b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24768e fromBundle(@C12579k Bundle bundle) {
        return f61453b.mo72308a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final OrderDetailParam mo72300a() {
        return this.f61455a;
    }

    @C12579k
    /* renamed from: b */
    public final C24768e mo72301b(@C12579k OrderDetailParam orderDetailParam) {
        Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetailParam");
        return new C24768e(orderDetailParam);
    }

    @C12579k
    /* renamed from: e */
    public final OrderDetailParam mo72302e() {
        return this.f61455a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24768e) && Intrinsics.areEqual((Object) this.f61455a, (Object) ((C24768e) obj).f61455a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo72304f() {
        Bundle bundle = new Bundle();
        Class<OrderDetailParam> cls = OrderDetailParam.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OrderDetailParam orderDetailParam = this.f61455a;
            Intrinsics.checkNotNull(orderDetailParam, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("order_detail_param", orderDetailParam);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OrderDetailParam orderDetailParam2 = this.f61455a;
            Intrinsics.checkNotNull(orderDetailParam2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("order_detail_param", (Serializable) orderDetailParam2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo72305g() {
        C19456p0 p0Var = new C19456p0();
        Class<OrderDetailParam> cls = OrderDetailParam.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OrderDetailParam orderDetailParam = this.f61455a;
            Intrinsics.checkNotNull(orderDetailParam, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("order_detail_param", orderDetailParam);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OrderDetailParam orderDetailParam2 = this.f61455a;
            Intrinsics.checkNotNull(orderDetailParam2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("order_detail_param", (Serializable) orderDetailParam2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f61455a.hashCode();
    }

    @C12579k
    public String toString() {
        OrderDetailParam orderDetailParam = this.f61455a;
        return "OrdersOfflineDetailsFragmentArgs(orderDetailParam=" + orderDetailParam + ")";
    }
}
