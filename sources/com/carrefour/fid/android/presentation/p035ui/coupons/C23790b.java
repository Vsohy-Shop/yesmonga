package com.carrefour.fid.android.presentation.p035ui.coupons;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.nav.C23954a;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.b */
public final class C23790b implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C23791a f59884b = new C23791a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f59885c = 8;
    @C12579k

    /* renamed from: a */
    public final CouponModel f59886a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.b$a */
    public static final class C23791a {
        public /* synthetic */ C23791a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23790b mo69699a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23790b.class.getClassLoader());
            if (bundle.containsKey(C23954a.f60133a)) {
                Class<CouponModel> cls = CouponModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    CouponModel couponModel = (CouponModel) bundle.get(C23954a.f60133a);
                    if (couponModel != null) {
                        return new C23790b(couponModel);
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
        public final C23790b mo69700b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(C23954a.f60133a)) {
                Class<CouponModel> cls = CouponModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    CouponModel couponModel = (CouponModel) p0Var.mo57648h(C23954a.f60133a);
                    if (couponModel != null) {
                        return new C23790b(couponModel);
                    }
                    throw new IllegalArgumentException("Argument \"selectedCoupon\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"selectedCoupon\" is missing and does not have an android:defaultValue");
        }

        public C23791a() {
        }
    }

    public C23790b(@C12579k CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(couponModel, C23954a.f60133a);
        this.f59886a = couponModel;
    }

    /* renamed from: c */
    public static /* synthetic */ C23790b m105462c(C23790b bVar, CouponModel couponModel, int i, Object obj) {
        if ((i & 1) != 0) {
            couponModel = bVar.f59886a;
        }
        return bVar.mo69692b(couponModel);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C23790b m105463d(@C12579k C19456p0 p0Var) {
        return f59884b.mo69700b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23790b fromBundle(@C12579k Bundle bundle) {
        return f59884b.mo69699a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final CouponModel mo69691a() {
        return this.f59886a;
    }

    @C12579k
    /* renamed from: b */
    public final C23790b mo69692b(@C12579k CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(couponModel, C23954a.f60133a);
        return new C23790b(couponModel);
    }

    @C12579k
    /* renamed from: e */
    public final CouponModel mo69693e() {
        return this.f59886a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23790b) && Intrinsics.areEqual((Object) this.f59886a, (Object) ((C23790b) obj).f59886a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo69695f() {
        Bundle bundle = new Bundle();
        Class<CouponModel> cls = CouponModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            CouponModel couponModel = this.f59886a;
            Intrinsics.checkNotNull(couponModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable(C23954a.f60133a, couponModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            CouponModel couponModel2 = this.f59886a;
            Intrinsics.checkNotNull(couponModel2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable(C23954a.f60133a, (Serializable) couponModel2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo69696g() {
        C19456p0 p0Var = new C19456p0();
        Class<CouponModel> cls = CouponModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            CouponModel couponModel = this.f59886a;
            Intrinsics.checkNotNull(couponModel, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q(C23954a.f60133a, couponModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            CouponModel couponModel2 = this.f59886a;
            Intrinsics.checkNotNull(couponModel2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q(C23954a.f60133a, (Serializable) couponModel2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f59886a.hashCode();
    }

    @C12579k
    public String toString() {
        CouponModel couponModel = this.f59886a;
        return "CouponsScanBarcodeFragmentArgs(selectedCoupon=" + couponModel + ")";
    }
}
