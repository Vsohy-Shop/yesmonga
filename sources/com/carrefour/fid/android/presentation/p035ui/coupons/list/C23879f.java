package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.models.CouponDetailModel;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.nav.C23954a;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.f */
public final class C23879f {
    @C12579k

    /* renamed from: a */
    public static final C23883d f60042a = new C23883d((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60043b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.f$a */
    public static final class C23880a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final CouponDetailModel f60044a;

        /* renamed from: b */
        public final int f60045b = R.id.action_couponsFragment_to_couponDetails;

        public C23880a(@C12579k CouponDetailModel couponDetailModel) {
            Intrinsics.checkNotNullParameter(couponDetailModel, C23954a.f60133a);
            this.f60044a = couponDetailModel;
        }

        /* renamed from: c */
        public static /* synthetic */ C23880a m105677c(C23880a aVar, CouponDetailModel couponDetailModel, int i, Object obj) {
            if ((i & 1) != 0) {
                couponDetailModel = aVar.f60044a;
            }
            return aVar.mo69935b(couponDetailModel);
        }

        @C12579k
        /* renamed from: a */
        public final CouponDetailModel mo69934a() {
            return this.f60044a;
        }

        @C12579k
        /* renamed from: b */
        public final C23880a mo69935b(@C12579k CouponDetailModel couponDetailModel) {
            Intrinsics.checkNotNullParameter(couponDetailModel, C23954a.f60133a);
            return new C23880a(couponDetailModel);
        }

        @C12579k
        /* renamed from: d */
        public final CouponDetailModel mo69936d() {
            return this.f60044a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23880a) && Intrinsics.areEqual((Object) this.f60044a, (Object) ((C23880a) obj).f60044a);
        }

        public int getActionId() {
            return this.f60045b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<CouponDetailModel> cls = CouponDetailModel.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                CouponDetailModel couponDetailModel = this.f60044a;
                Intrinsics.checkNotNull(couponDetailModel, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable(C23954a.f60133a, couponDetailModel);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                CouponDetailModel couponDetailModel2 = this.f60044a;
                Intrinsics.checkNotNull(couponDetailModel2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable(C23954a.f60133a, (Serializable) couponDetailModel2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return this.f60044a.hashCode();
        }

        @C12579k
        public String toString() {
            CouponDetailModel couponDetailModel = this.f60044a;
            return "ActionCouponsFragmentToCouponDetails(selectedCoupon=" + couponDetailModel + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.f$c */
    public static final class C23882c implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final CouponModel f60050a;

        /* renamed from: b */
        public final int f60051b = R.id.action_couponsFragment_to_couponsScanBarcodeFragment;

        public C23882c(@C12579k CouponModel couponModel) {
            Intrinsics.checkNotNullParameter(couponModel, C23954a.f60133a);
            this.f60050a = couponModel;
        }

        /* renamed from: c */
        public static /* synthetic */ C23882c m105689c(C23882c cVar, CouponModel couponModel, int i, Object obj) {
            if ((i & 1) != 0) {
                couponModel = cVar.f60050a;
            }
            return cVar.mo69951b(couponModel);
        }

        @C12579k
        /* renamed from: a */
        public final CouponModel mo69950a() {
            return this.f60050a;
        }

        @C12579k
        /* renamed from: b */
        public final C23882c mo69951b(@C12579k CouponModel couponModel) {
            Intrinsics.checkNotNullParameter(couponModel, C23954a.f60133a);
            return new C23882c(couponModel);
        }

        @C12579k
        /* renamed from: d */
        public final CouponModel mo69952d() {
            return this.f60050a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23882c) && Intrinsics.areEqual((Object) this.f60050a, (Object) ((C23882c) obj).f60050a);
        }

        public int getActionId() {
            return this.f60051b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<CouponModel> cls = CouponModel.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                CouponModel couponModel = this.f60050a;
                Intrinsics.checkNotNull(couponModel, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable(C23954a.f60133a, couponModel);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                CouponModel couponModel2 = this.f60050a;
                Intrinsics.checkNotNull(couponModel2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable(C23954a.f60133a, (Serializable) couponModel2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return this.f60050a.hashCode();
        }

        @C12579k
        public String toString() {
            CouponModel couponModel = this.f60050a;
            return "ActionCouponsFragmentToCouponsScanBarcodeFragment(selectedCoupon=" + couponModel + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.f$d */
    public static final class C23883d {
        public /* synthetic */ C23883d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m105693d(C23883d dVar, CouponModel[] couponModelArr, CouponsFilter[] couponsFilterArr, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            return dVar.mo69958c(couponModelArr, couponsFilterArr, z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo69956a() {
            return new C19690a(R.id.action_couponsFragment_to_couponBarcodeFragment);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo69957b(@C12579k CouponDetailModel couponDetailModel) {
            Intrinsics.checkNotNullParameter(couponDetailModel, C23954a.f60133a);
            return new C23880a(couponDetailModel);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo69958c(@C12579k CouponModel[] couponModelArr, @C12579k CouponsFilter[] couponsFilterArr, boolean z) {
            Intrinsics.checkNotNullParameter(couponModelArr, "couponsList");
            Intrinsics.checkNotNullParameter(couponsFilterArr, "filtersList");
            return new C23881b(couponModelArr, couponsFilterArr, z);
        }

        @C12579k
        /* renamed from: e */
        public final C19693b0 mo69959e(@C12579k CouponModel couponModel) {
            Intrinsics.checkNotNullParameter(couponModel, C23954a.f60133a);
            return new C23882c(couponModel);
        }

        @C12579k
        /* renamed from: f */
        public final C19693b0 mo69960f() {
            return new C19690a(R.id.action_couponsFragment_to_loyaltyCardFragment);
        }

        public C23883d() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.f$b */
    public static final class C23881b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final CouponModel[] f60046a;
        @C12579k

        /* renamed from: b */
        public final CouponsFilter[] f60047b;

        /* renamed from: c */
        public final boolean f60048c;

        /* renamed from: d */
        public final int f60049d;

        public C23881b(@C12579k CouponModel[] couponModelArr, @C12579k CouponsFilter[] couponsFilterArr, boolean z) {
            Intrinsics.checkNotNullParameter(couponModelArr, "couponsList");
            Intrinsics.checkNotNullParameter(couponsFilterArr, "filtersList");
            this.f60046a = couponModelArr;
            this.f60047b = couponsFilterArr;
            this.f60048c = z;
            this.f60049d = R.id.action_couponsFragment_to_couponsFilterFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C23881b m105681e(C23881b bVar, CouponModel[] couponModelArr, CouponsFilter[] couponsFilterArr, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                couponModelArr = bVar.f60046a;
            }
            if ((i & 2) != 0) {
                couponsFilterArr = bVar.f60047b;
            }
            if ((i & 4) != 0) {
                z = bVar.f60048c;
            }
            return bVar.mo69943d(couponModelArr, couponsFilterArr, z);
        }

        @C12579k
        /* renamed from: a */
        public final CouponModel[] mo69940a() {
            return this.f60046a;
        }

        @C12579k
        /* renamed from: b */
        public final CouponsFilter[] mo69941b() {
            return this.f60047b;
        }

        /* renamed from: c */
        public final boolean mo69942c() {
            return this.f60048c;
        }

        @C12579k
        /* renamed from: d */
        public final C23881b mo69943d(@C12579k CouponModel[] couponModelArr, @C12579k CouponsFilter[] couponsFilterArr, boolean z) {
            Intrinsics.checkNotNullParameter(couponModelArr, "couponsList");
            Intrinsics.checkNotNullParameter(couponsFilterArr, "filtersList");
            return new C23881b(couponModelArr, couponsFilterArr, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23881b)) {
                return false;
            }
            C23881b bVar = (C23881b) obj;
            return Intrinsics.areEqual((Object) this.f60046a, (Object) bVar.f60046a) && Intrinsics.areEqual((Object) this.f60047b, (Object) bVar.f60047b) && this.f60048c == bVar.f60048c;
        }

        @C12579k
        /* renamed from: f */
        public final CouponModel[] mo69945f() {
            return this.f60046a;
        }

        @C12579k
        /* renamed from: g */
        public final CouponsFilter[] mo69946g() {
            return this.f60047b;
        }

        public int getActionId() {
            return this.f60049d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("couponsList", (Parcelable[]) this.f60046a);
            bundle.putParcelableArray("filtersList", (Parcelable[]) this.f60047b);
            bundle.putBoolean("isInStore", this.f60048c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo69947h() {
            return this.f60048c;
        }

        public int hashCode() {
            int hashCode = ((Arrays.hashCode(this.f60046a) * 31) + Arrays.hashCode(this.f60047b)) * 31;
            boolean z = this.f60048c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            String arrays = Arrays.toString(this.f60046a);
            String arrays2 = Arrays.toString(this.f60047b);
            boolean z = this.f60048c;
            return "ActionCouponsFragmentToCouponsFilterFragment(couponsList=" + arrays + ", filtersList=" + arrays2 + ", isInStore=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23881b(CouponModel[] couponModelArr, CouponsFilter[] couponsFilterArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(couponModelArr, couponsFilterArr, (i & 4) != 0 ? true : z);
        }
    }
}
