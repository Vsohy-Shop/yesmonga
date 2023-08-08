package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.p035ui.coupons.filter.C23812d;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/FilterResult;", "Landroid/os/Parcelable;", "", "Lcom/carrefour/fid/android/presentation/models/CouponsFilter;", "a", "Lcom/carrefour/fid/android/presentation/models/CouponModel;", "b", "filters", "coupons", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class FilterResult implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<FilterResult> CREATOR = new C38430a();

    /* renamed from: c */
    public static final int f97417c = 8;
    @C12579k

    /* renamed from: a */
    public final List<CouponsFilter> f97418a;
    @C12579k

    /* renamed from: b */
    public final List<CouponModel> f97419b;

    /* renamed from: com.carrefour.fid.android.presentation.models.FilterResult$a */
    public static final class C38430a implements Parcelable.Creator<FilterResult> {
        @C12579k
        /* renamed from: a */
        public final FilterResult createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CouponsFilter.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(CouponModel.CREATOR.createFromParcel(parcel));
            }
            return new FilterResult(arrayList, arrayList2);
        }

        @C12579k
        /* renamed from: b */
        public final FilterResult[] newArray(int i) {
            return new FilterResult[i];
        }
    }

    public FilterResult(@C12579k List<CouponsFilter> list, @C12579k List<CouponModel> list2) {
        Intrinsics.checkNotNullParameter(list, C23812d.f59917a);
        Intrinsics.checkNotNullParameter(list2, "coupons");
        this.f97418a = list;
        this.f97419b = list2;
    }

    /* renamed from: d */
    public static /* synthetic */ FilterResult m159218d(FilterResult filterResult, List<CouponsFilter> list, List<CouponModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filterResult.f97418a;
        }
        if ((i & 2) != 0) {
            list2 = filterResult.f97419b;
        }
        return filterResult.mo121613c(list, list2);
    }

    @C12579k
    /* renamed from: a */
    public final List<CouponsFilter> mo121611a() {
        return this.f97418a;
    }

    @C12579k
    /* renamed from: b */
    public final List<CouponModel> mo121612b() {
        return this.f97419b;
    }

    @C12579k
    /* renamed from: c */
    public final FilterResult mo121613c(@C12579k List<CouponsFilter> list, @C12579k List<CouponModel> list2) {
        Intrinsics.checkNotNullParameter(list, C23812d.f59917a);
        Intrinsics.checkNotNullParameter(list2, "coupons");
        return new FilterResult(list, list2);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final List<CouponModel> mo121615e() {
        return this.f97419b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterResult)) {
            return false;
        }
        FilterResult filterResult = (FilterResult) obj;
        return Intrinsics.areEqual((Object) this.f97418a, (Object) filterResult.f97418a) && Intrinsics.areEqual((Object) this.f97419b, (Object) filterResult.f97419b);
    }

    @C12579k
    /* renamed from: f */
    public final List<CouponsFilter> mo121617f() {
        return this.f97418a;
    }

    public int hashCode() {
        return (this.f97418a.hashCode() * 31) + this.f97419b.hashCode();
    }

    @C12579k
    public String toString() {
        List<CouponsFilter> list = this.f97418a;
        List<CouponModel> list2 = this.f97419b;
        return "FilterResult(filters=" + list + ", coupons=" + list2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<CouponsFilter> list = this.f97418a;
        parcel.writeInt(list.size());
        for (CouponsFilter writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<CouponModel> list2 = this.f97419b;
        parcel.writeInt(list2.size());
        for (CouponModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }
}
