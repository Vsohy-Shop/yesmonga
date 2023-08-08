package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.m */
public final class C24780m implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C24781a f61467d = new C24781a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f61468e = 0;
    @C12579k

    /* renamed from: a */
    public final OrderDetailParam f61469a;
    @C12579k

    /* renamed from: b */
    public final String f61470b;
    @C12579k

    /* renamed from: c */
    public final DownloadReceipt f61471c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.m$a */
    public static final class C24781a {
        public /* synthetic */ C24781a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24780m mo72336a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24780m.class.getClassLoader());
            if (bundle.containsKey("orderDetails")) {
                Class<Parcelable> cls = Parcelable.class;
                Class<OrderDetailParam> cls2 = OrderDetailParam.class;
                Class<Serializable> cls3 = Serializable.class;
                if (cls.isAssignableFrom(cls2) || cls3.isAssignableFrom(cls2)) {
                    OrderDetailParam orderDetailParam = (OrderDetailParam) bundle.get("orderDetails");
                    if (orderDetailParam == null) {
                        throw new IllegalArgumentException("Argument \"orderDetails\" is marked as non-null but was passed a null value.");
                    } else if (bundle.containsKey("filePath")) {
                        String string = bundle.getString("filePath");
                        if (string == null) {
                            throw new IllegalArgumentException("Argument \"filePath\" is marked as non-null but was passed a null value.");
                        } else if (bundle.containsKey("receipt")) {
                            Class<DownloadReceipt> cls4 = DownloadReceipt.class;
                            if (cls.isAssignableFrom(cls4) || cls3.isAssignableFrom(cls4)) {
                                DownloadReceipt downloadReceipt = (DownloadReceipt) bundle.get("receipt");
                                if (downloadReceipt != null) {
                                    return new C24780m(orderDetailParam, string, downloadReceipt);
                                }
                                throw new IllegalArgumentException("Argument \"receipt\" is marked as non-null but was passed a null value.");
                            }
                            String name = cls4.getName();
                            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                        } else {
                            throw new IllegalArgumentException("Required argument \"receipt\" is missing and does not have an android:defaultValue");
                        }
                    } else {
                        throw new IllegalArgumentException("Required argument \"filePath\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name2 = cls2.getName();
                    throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"orderDetails\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24780m mo72337b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("orderDetails")) {
                Class<Parcelable> cls = Parcelable.class;
                Class<OrderDetailParam> cls2 = OrderDetailParam.class;
                Class<Serializable> cls3 = Serializable.class;
                if (cls.isAssignableFrom(cls2) || cls3.isAssignableFrom(cls2)) {
                    OrderDetailParam orderDetailParam = (OrderDetailParam) p0Var.mo57648h("orderDetails");
                    if (orderDetailParam == null) {
                        throw new IllegalArgumentException("Argument \"orderDetails\" is marked as non-null but was passed a null value");
                    } else if (p0Var.mo57647f("filePath")) {
                        String str = (String) p0Var.mo57648h("filePath");
                        if (str == null) {
                            throw new IllegalArgumentException("Argument \"filePath\" is marked as non-null but was passed a null value");
                        } else if (p0Var.mo57647f("receipt")) {
                            Class<DownloadReceipt> cls4 = DownloadReceipt.class;
                            if (cls.isAssignableFrom(cls4) || cls3.isAssignableFrom(cls4)) {
                                DownloadReceipt downloadReceipt = (DownloadReceipt) p0Var.mo57648h("receipt");
                                if (downloadReceipt != null) {
                                    return new C24780m(orderDetailParam, str, downloadReceipt);
                                }
                                throw new IllegalArgumentException("Argument \"receipt\" is marked as non-null but was passed a null value");
                            }
                            String name = cls4.getName();
                            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                        } else {
                            throw new IllegalArgumentException("Required argument \"receipt\" is missing and does not have an android:defaultValue");
                        }
                    } else {
                        throw new IllegalArgumentException("Required argument \"filePath\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name2 = cls2.getName();
                    throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"orderDetails\" is missing and does not have an android:defaultValue");
            }
        }

        public C24781a() {
        }
    }

    public C24780m(@C12579k OrderDetailParam orderDetailParam, @C12579k String str, @C12579k DownloadReceipt downloadReceipt) {
        Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetails");
        Intrinsics.checkNotNullParameter(str, "filePath");
        Intrinsics.checkNotNullParameter(downloadReceipt, "receipt");
        this.f61469a = orderDetailParam;
        this.f61470b = str;
        this.f61471c = downloadReceipt;
    }

    /* renamed from: e */
    public static /* synthetic */ C24780m m107981e(C24780m mVar, OrderDetailParam orderDetailParam, String str, DownloadReceipt downloadReceipt, int i, Object obj) {
        if ((i & 1) != 0) {
            orderDetailParam = mVar.f61469a;
        }
        if ((i & 2) != 0) {
            str = mVar.f61470b;
        }
        if ((i & 4) != 0) {
            downloadReceipt = mVar.f61471c;
        }
        return mVar.mo72327d(orderDetailParam, str, downloadReceipt);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C24780m m107982f(@C12579k C19456p0 p0Var) {
        return f61467d.mo72337b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24780m fromBundle(@C12579k Bundle bundle) {
        return f61467d.mo72336a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final OrderDetailParam mo72324a() {
        return this.f61469a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo72325b() {
        return this.f61470b;
    }

    @C12579k
    /* renamed from: c */
    public final DownloadReceipt mo72326c() {
        return this.f61471c;
    }

    @C12579k
    /* renamed from: d */
    public final C24780m mo72327d(@C12579k OrderDetailParam orderDetailParam, @C12579k String str, @C12579k DownloadReceipt downloadReceipt) {
        Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetails");
        Intrinsics.checkNotNullParameter(str, "filePath");
        Intrinsics.checkNotNullParameter(downloadReceipt, "receipt");
        return new C24780m(orderDetailParam, str, downloadReceipt);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24780m)) {
            return false;
        }
        C24780m mVar = (C24780m) obj;
        return Intrinsics.areEqual((Object) this.f61469a, (Object) mVar.f61469a) && Intrinsics.areEqual((Object) this.f61470b, (Object) mVar.f61470b) && Intrinsics.areEqual((Object) this.f61471c, (Object) mVar.f61471c);
    }

    @C12579k
    /* renamed from: g */
    public final String mo72329g() {
        return this.f61470b;
    }

    @C12579k
    /* renamed from: h */
    public final OrderDetailParam mo72330h() {
        return this.f61469a;
    }

    public int hashCode() {
        return (((this.f61469a.hashCode() * 31) + this.f61470b.hashCode()) * 31) + this.f61471c.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final DownloadReceipt mo72332i() {
        return this.f61471c;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo72333j() {
        Bundle bundle = new Bundle();
        Class<Parcelable> cls = Parcelable.class;
        Class<OrderDetailParam> cls2 = OrderDetailParam.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            OrderDetailParam orderDetailParam = this.f61469a;
            Intrinsics.checkNotNull(orderDetailParam, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("orderDetails", orderDetailParam);
        } else if (cls3.isAssignableFrom(cls2)) {
            OrderDetailParam orderDetailParam2 = this.f61469a;
            Intrinsics.checkNotNull(orderDetailParam2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("orderDetails", (Serializable) orderDetailParam2);
        } else {
            String name = cls2.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        bundle.putString("filePath", this.f61470b);
        Class<DownloadReceipt> cls4 = DownloadReceipt.class;
        if (cls.isAssignableFrom(cls4)) {
            DownloadReceipt downloadReceipt = this.f61471c;
            Intrinsics.checkNotNull(downloadReceipt, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("receipt", downloadReceipt);
        } else if (cls3.isAssignableFrom(cls4)) {
            DownloadReceipt downloadReceipt2 = this.f61471c;
            Intrinsics.checkNotNull(downloadReceipt2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("receipt", (Serializable) downloadReceipt2);
        } else {
            String name2 = cls4.getName();
            throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo72334k() {
        C19456p0 p0Var = new C19456p0();
        Class<Parcelable> cls = Parcelable.class;
        Class<OrderDetailParam> cls2 = OrderDetailParam.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            OrderDetailParam orderDetailParam = this.f61469a;
            Intrinsics.checkNotNull(orderDetailParam, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("orderDetails", orderDetailParam);
        } else if (cls3.isAssignableFrom(cls2)) {
            OrderDetailParam orderDetailParam2 = this.f61469a;
            Intrinsics.checkNotNull(orderDetailParam2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("orderDetails", (Serializable) orderDetailParam2);
        } else {
            String name = cls2.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        p0Var.mo57656q("filePath", this.f61470b);
        Class<DownloadReceipt> cls4 = DownloadReceipt.class;
        if (cls.isAssignableFrom(cls4)) {
            DownloadReceipt downloadReceipt = this.f61471c;
            Intrinsics.checkNotNull(downloadReceipt, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("receipt", downloadReceipt);
        } else if (cls3.isAssignableFrom(cls4)) {
            DownloadReceipt downloadReceipt2 = this.f61471c;
            Intrinsics.checkNotNull(downloadReceipt2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("receipt", (Serializable) downloadReceipt2);
        } else {
            String name2 = cls4.getName();
            throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        OrderDetailParam orderDetailParam = this.f61469a;
        String str = this.f61470b;
        DownloadReceipt downloadReceipt = this.f61471c;
        return "OrdersOfflineReceiptFragmentArgs(orderDetails=" + orderDetailParam + ", filePath=" + str + ", receipt=" + downloadReceipt + ")";
    }
}
