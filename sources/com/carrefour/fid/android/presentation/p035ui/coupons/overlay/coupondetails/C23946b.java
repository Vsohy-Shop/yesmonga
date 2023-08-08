package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.models.CouponDetailModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.nav.C23954a;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.b */
public final class C23946b implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C23947a f60115b = new C23947a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f60116c = 8;
    @C12579k

    /* renamed from: a */
    public final CouponDetailModel f60117a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.b$a */
    public static final class C23947a {
        public /* synthetic */ C23947a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23946b mo70089a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23946b.class.getClassLoader());
            if (bundle.containsKey(C23954a.f60133a)) {
                Class<CouponDetailModel> cls = CouponDetailModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    CouponDetailModel couponDetailModel = (CouponDetailModel) bundle.get(C23954a.f60133a);
                    if (couponDetailModel != null) {
                        return new C23946b(couponDetailModel);
                    }
                    throw new IllegalArgumentException("Argument \"selectedCoupon\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"selectedCoupon\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23946b mo70090b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(C23954a.f60133a)) {
                Class<CouponDetailModel> cls = CouponDetailModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    CouponDetailModel couponDetailModel = (CouponDetailModel) p0Var.mo57648h(C23954a.f60133a);
                    if (couponDetailModel != null) {
                        return new C23946b(couponDetailModel);
                    }
                    throw new IllegalArgumentException("Argument \"selectedCoupon\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"selectedCoupon\" is missing and does not have an android:defaultValue");
        }

        public C23947a() {
        }
    }

    public C23946b(@C12579k CouponDetailModel couponDetailModel) {
        Intrinsics.checkNotNullParameter(couponDetailModel, C23954a.f60133a);
        this.f60117a = couponDetailModel;
    }

    /* renamed from: c */
    public static /* synthetic */ C23946b m105817c(C23946b bVar, CouponDetailModel couponDetailModel, int i, Object obj) {
        if ((i & 1) != 0) {
            couponDetailModel = bVar.f60117a;
        }
        return bVar.mo70082b(couponDetailModel);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C23946b m105818d(@C12579k C19456p0 p0Var) {
        return f60115b.mo70090b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23946b fromBundle(@C12579k Bundle bundle) {
        return f60115b.mo70089a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final CouponDetailModel mo70081a() {
        return this.f60117a;
    }

    @C12579k
    /* renamed from: b */
    public final C23946b mo70082b(@C12579k CouponDetailModel couponDetailModel) {
        Intrinsics.checkNotNullParameter(couponDetailModel, C23954a.f60133a);
        return new C23946b(couponDetailModel);
    }

    @C12579k
    /* renamed from: e */
    public final CouponDetailModel mo70083e() {
        return this.f60117a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23946b) && Intrinsics.areEqual((Object) this.f60117a, (Object) ((C23946b) obj).f60117a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo70085f() {
        Bundle bundle = new Bundle();
        Class<CouponDetailModel> cls = CouponDetailModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            CouponDetailModel couponDetailModel = this.f60117a;
            Intrinsics.checkNotNull(couponDetailModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable(C23954a.f60133a, couponDetailModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            CouponDetailModel couponDetailModel2 = this.f60117a;
            Intrinsics.checkNotNull(couponDetailModel2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable(C23954a.f60133a, (Serializable) couponDetailModel2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo70086g() {
        C19456p0 p0Var = new C19456p0();
        Class<CouponDetailModel> cls = CouponDetailModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            CouponDetailModel couponDetailModel = this.f60117a;
            Intrinsics.checkNotNull(couponDetailModel, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q(C23954a.f60133a, couponDetailModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            CouponDetailModel couponDetailModel2 = this.f60117a;
            Intrinsics.checkNotNull(couponDetailModel2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q(C23954a.f60133a, (Serializable) couponDetailModel2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f60117a.hashCode();
    }

    @C12579k
    public String toString() {
        CouponDetailModel couponDetailModel = this.f60117a;
        return "CouponDetailsOverlayBottomSheetFragmentArgs(selectedCoupon=" + couponDetailModel + ")";
    }
}
