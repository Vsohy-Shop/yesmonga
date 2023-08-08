package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.d */
public final class C25191d implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C25192a f62060c = new C25192a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f62061d = 0;
    @C12579k

    /* renamed from: a */
    public final String f62062a;
    @C12579k

    /* renamed from: b */
    public final OrdersOnlineDetailType f62063b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.d$a */
    public static final class C25192a {
        public /* synthetic */ C25192a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25191d mo73212a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25191d.class.getClassLoader());
            if (bundle.containsKey("order_id")) {
                String string = bundle.getString("order_id");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"order_id\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("detail_type")) {
                    Class<OrdersOnlineDetailType> cls = OrdersOnlineDetailType.class;
                    if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                        OrdersOnlineDetailType ordersOnlineDetailType = (OrdersOnlineDetailType) bundle.get("detail_type");
                        if (ordersOnlineDetailType != null) {
                            return new C25191d(string, ordersOnlineDetailType);
                        }
                        throw new IllegalArgumentException("Argument \"detail_type\" is marked as non-null but was passed a null value.");
                    }
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                } else {
                    throw new IllegalArgumentException("Required argument \"detail_type\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"order_id\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25191d mo73213b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("order_id")) {
                String str = (String) p0Var.mo57648h("order_id");
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"order_id\" is marked as non-null but was passed a null value");
                } else if (p0Var.mo57647f("detail_type")) {
                    Class<OrdersOnlineDetailType> cls = OrdersOnlineDetailType.class;
                    if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                        OrdersOnlineDetailType ordersOnlineDetailType = (OrdersOnlineDetailType) p0Var.mo57648h("detail_type");
                        if (ordersOnlineDetailType != null) {
                            return new C25191d(str, ordersOnlineDetailType);
                        }
                        throw new IllegalArgumentException("Argument \"detail_type\" is marked as non-null but was passed a null value");
                    }
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                } else {
                    throw new IllegalArgumentException("Required argument \"detail_type\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"order_id\" is missing and does not have an android:defaultValue");
            }
        }

        public C25192a() {
        }
    }

    public C25191d(@C12579k String str, @C12579k OrdersOnlineDetailType ordersOnlineDetailType) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(ordersOnlineDetailType, "detailType");
        this.f62062a = str;
        this.f62063b = ordersOnlineDetailType;
    }

    /* renamed from: d */
    public static /* synthetic */ C25191d m108860d(C25191d dVar, String str, OrdersOnlineDetailType ordersOnlineDetailType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f62062a;
        }
        if ((i & 2) != 0) {
            ordersOnlineDetailType = dVar.f62063b;
        }
        return dVar.mo73204c(str, ordersOnlineDetailType);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C25191d m108861e(@C12579k C19456p0 p0Var) {
        return f62060c.mo73213b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25191d fromBundle(@C12579k Bundle bundle) {
        return f62060c.mo73212a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo73202a() {
        return this.f62062a;
    }

    @C12579k
    /* renamed from: b */
    public final OrdersOnlineDetailType mo73203b() {
        return this.f62063b;
    }

    @C12579k
    /* renamed from: c */
    public final C25191d mo73204c(@C12579k String str, @C12579k OrdersOnlineDetailType ordersOnlineDetailType) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(ordersOnlineDetailType, "detailType");
        return new C25191d(str, ordersOnlineDetailType);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25191d)) {
            return false;
        }
        C25191d dVar = (C25191d) obj;
        return Intrinsics.areEqual((Object) this.f62062a, (Object) dVar.f62062a) && this.f62063b == dVar.f62063b;
    }

    @C12579k
    /* renamed from: f */
    public final OrdersOnlineDetailType mo73206f() {
        return this.f62063b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo73207g() {
        return this.f62062a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo73208h() {
        Bundle bundle = new Bundle();
        bundle.putString("order_id", this.f62062a);
        Class<OrdersOnlineDetailType> cls = OrdersOnlineDetailType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OrdersOnlineDetailType ordersOnlineDetailType = this.f62063b;
            Intrinsics.checkNotNull(ordersOnlineDetailType, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("detail_type", (Parcelable) ordersOnlineDetailType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OrdersOnlineDetailType ordersOnlineDetailType2 = this.f62063b;
            Intrinsics.checkNotNull(ordersOnlineDetailType2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("detail_type", ordersOnlineDetailType2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    public int hashCode() {
        return (this.f62062a.hashCode() * 31) + this.f62063b.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo73210i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("order_id", this.f62062a);
        Class<OrdersOnlineDetailType> cls = OrdersOnlineDetailType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OrdersOnlineDetailType ordersOnlineDetailType = this.f62063b;
            Intrinsics.checkNotNull(ordersOnlineDetailType, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("detail_type", (Parcelable) ordersOnlineDetailType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OrdersOnlineDetailType ordersOnlineDetailType2 = this.f62063b;
            Intrinsics.checkNotNull(ordersOnlineDetailType2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("detail_type", ordersOnlineDetailType2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f62062a;
        OrdersOnlineDetailType ordersOnlineDetailType = this.f62063b;
        return "ListProductsOrderedFragmentArgs(orderId=" + str + ", detailType=" + ordersOnlineDetailType + ")";
    }
}
