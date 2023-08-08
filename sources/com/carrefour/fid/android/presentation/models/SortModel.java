package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u0000 \b2\u00020\u0001:\u0003\u0003\u001f B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/SortModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/presentation/models/SortModel$SortValue;", "a", "Lcom/carrefour/fid/android/presentation/models/SortModel$SortOrder;", "b", "value", "order", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/presentation/models/SortModel$SortValue;", "f", "()Lcom/carrefour/fid/android/presentation/models/SortModel$SortValue;", "Lcom/carrefour/fid/android/presentation/models/SortModel$SortOrder;", "e", "()Lcom/carrefour/fid/android/presentation/models/SortModel$SortOrder;", "<init>", "(Lcom/carrefour/fid/android/presentation/models/SortModel$SortValue;Lcom/carrefour/fid/android/presentation/models/SortModel$SortOrder;)V", "SortOrder", "SortValue", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class SortModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SortModel> CREATOR = new C38450b();
    @C12579k

    /* renamed from: c */
    public static final C38449a f97547c = new C38449a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f97548d = 0;
    @C12579k

    /* renamed from: a */
    public final SortValue f97549a;
    @C12580l

    /* renamed from: b */
    public final SortOrder f97550b;

    @C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/SortModel$SortOrder;", "", "", "resourceId", "I", "q", "()I", "", "value", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum SortOrder {
        ASC(R.string.product_list_filters_sort_order_asc, "asc"),
        DESC(R.string.product_list_filters_sort_order_desc, "desc");
        
        private final int resourceId;
        @C12579k
        private final String value;

        /* access modifiers changed from: public */
        SortOrder(@C0324b1 int i, String str) {
            this.resourceId = i;
            this.value = str;
        }

        /* renamed from: q */
        public final int mo121948q() {
            return this.resourceId;
        }

        @C12579k
        /* renamed from: r */
        public final String mo121949r() {
            return this.value;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/SortModel$SortValue;", "", "", "resourceId", "I", "q", "()I", "", "value", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "b", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum SortValue {
        DEFAULT(R.string.product_list_filters_sort_default, (int) null),
        SALE_PRICE(R.string.product_list_filters_sort_sale_price, "offers.prices.sale_price"),
        PRICE_PER_UNIT(R.string.product_list_filters_sort_price_per_unit, "offers.prices.standard_price_per_unit.price_per_unit_value");
        
        private final int resourceId;
        @C12580l
        private final String value;

        /* access modifiers changed from: public */
        SortValue(@C0324b1 int i, String str) {
            this.resourceId = i;
            this.value = str;
        }

        /* renamed from: q */
        public final int mo121950q() {
            return this.resourceId;
        }

        @C12580l
        /* renamed from: r */
        public final String mo121951r() {
            return this.value;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.models.SortModel$a */
    public static final class C38449a {
        public /* synthetic */ C38449a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final SortModel mo121952a() {
            return new SortModel(SortValue.DEFAULT, (SortOrder) null, 2, (DefaultConstructorMarker) null);
        }

        public C38449a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.models.SortModel$b */
    public static final class C38450b implements Parcelable.Creator<SortModel> {
        @C12579k
        /* renamed from: a */
        public final SortModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SortModel(SortValue.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SortOrder.valueOf(parcel.readString()));
        }

        @C12579k
        /* renamed from: b */
        public final SortModel[] newArray(int i) {
            return new SortModel[i];
        }
    }

    public SortModel(@C12579k SortValue sortValue, @C12580l SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortValue, "value");
        this.f97549a = sortValue;
        this.f97550b = sortOrder;
    }

    /* renamed from: d */
    public static /* synthetic */ SortModel m159472d(SortModel sortModel, SortValue sortValue, SortOrder sortOrder, int i, Object obj) {
        if ((i & 1) != 0) {
            sortValue = sortModel.f97549a;
        }
        if ((i & 2) != 0) {
            sortOrder = sortModel.f97550b;
        }
        return sortModel.mo121940c(sortValue, sortOrder);
    }

    @C12579k
    /* renamed from: a */
    public final SortValue mo121938a() {
        return this.f97549a;
    }

    @C12580l
    /* renamed from: b */
    public final SortOrder mo121939b() {
        return this.f97550b;
    }

    @C12579k
    /* renamed from: c */
    public final SortModel mo121940c(@C12579k SortValue sortValue, @C12580l SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortValue, "value");
        return new SortModel(sortValue, sortOrder);
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final SortOrder mo121942e() {
        return this.f97550b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SortModel)) {
            return false;
        }
        SortModel sortModel = (SortModel) obj;
        return this.f97549a == sortModel.f97549a && this.f97550b == sortModel.f97550b;
    }

    @C12579k
    /* renamed from: f */
    public final SortValue mo121944f() {
        return this.f97549a;
    }

    public int hashCode() {
        int hashCode = this.f97549a.hashCode() * 31;
        SortOrder sortOrder = this.f97550b;
        return hashCode + (sortOrder == null ? 0 : sortOrder.hashCode());
    }

    @C12579k
    public String toString() {
        SortValue sortValue = this.f97549a;
        SortOrder sortOrder = this.f97550b;
        return "SortModel(value=" + sortValue + ", order=" + sortOrder + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97549a.name());
        SortOrder sortOrder = this.f97550b;
        if (sortOrder == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(sortOrder.name());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SortModel(SortValue sortValue, SortOrder sortOrder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sortValue, (i & 2) != 0 ? null : sortOrder);
    }
}
