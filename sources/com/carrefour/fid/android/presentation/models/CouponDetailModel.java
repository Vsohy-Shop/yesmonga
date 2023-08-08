package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.entities.coupons.CouponType;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.presentation.models.CouponModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CouponDetailModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/presentation/models/CouponModel;", "a", "", "b", "couponModel", "numberActivateCoupon", "c", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/presentation/models/CouponModel;", "e", "()Lcom/carrefour/fid/android/presentation/models/CouponModel;", "I", "f", "()I", "<init>", "(Lcom/carrefour/fid/android/presentation/models/CouponModel;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CouponDetailModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CouponDetailModel> CREATOR = new C38417a();

    /* renamed from: c */
    public static final int f97308c = 8;
    @C12579k

    /* renamed from: a */
    public final CouponModel f97309a;

    /* renamed from: b */
    public final int f97310b;

    /* renamed from: com.carrefour.fid.android.presentation.models.CouponDetailModel$a */
    public static final class C38417a implements Parcelable.Creator<CouponDetailModel> {
        @C12579k
        /* renamed from: a */
        public final CouponDetailModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CouponDetailModel(CouponModel.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final CouponDetailModel[] newArray(int i) {
            return new CouponDetailModel[i];
        }
    }

    public CouponDetailModel(@C12579k CouponModel couponModel, int i) {
        Intrinsics.checkNotNullParameter(couponModel, "couponModel");
        this.f97309a = couponModel;
        this.f97310b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ CouponDetailModel m159006d(CouponDetailModel couponDetailModel, CouponModel couponModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            couponModel = couponDetailModel.f97309a;
        }
        if ((i2 & 2) != 0) {
            i = couponDetailModel.f97310b;
        }
        return couponDetailModel.mo121359c(couponModel, i);
    }

    @C12579k
    /* renamed from: a */
    public final CouponModel mo121357a() {
        return this.f97309a;
    }

    /* renamed from: b */
    public final int mo121358b() {
        return this.f97310b;
    }

    @C12579k
    /* renamed from: c */
    public final CouponDetailModel mo121359c(@C12579k CouponModel couponModel, int i) {
        Intrinsics.checkNotNullParameter(couponModel, "couponModel");
        return new CouponDetailModel(couponModel, i);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final CouponModel mo121361e() {
        return this.f97309a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponDetailModel)) {
            return false;
        }
        CouponDetailModel couponDetailModel = (CouponDetailModel) obj;
        return Intrinsics.areEqual((Object) this.f97309a, (Object) couponDetailModel.f97309a) && this.f97310b == couponDetailModel.f97310b;
    }

    /* renamed from: f */
    public final int mo121363f() {
        return this.f97310b;
    }

    public int hashCode() {
        return (this.f97309a.hashCode() * 31) + Integer.hashCode(this.f97310b);
    }

    @C12579k
    public String toString() {
        CouponModel couponModel = this.f97309a;
        int i = this.f97310b;
        return "CouponDetailModel(couponModel=" + couponModel + ", numberActivateCoupon=" + i + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f97309a.writeToParcel(parcel, i);
        parcel.writeInt(this.f97310b);
    }

    public /* synthetic */ CouponDetailModel(CouponModel couponModel, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        CouponDetailModel couponDetailModel;
        CouponModel couponModel2;
        if ((i2 & 1) != 0) {
            couponModel2 = new CouponModel(0, (String) null, (String) null, (String) null, (CouponType) null, (String) null, (String) null, 0, (String) null, (List) null, (String) null, (Double) null, (DiscountType) null, (String) null, (CouponStatus) null, (Image) null, (List) null, (String) null, (Facility) null, (String) null, (CouponModel.State) null, (String) null, 4194303, (DefaultConstructorMarker) null);
            couponDetailModel = this;
        } else {
            couponDetailModel = this;
            couponModel2 = couponModel;
        }
        new CouponDetailModel(couponModel2, i);
    }
}
