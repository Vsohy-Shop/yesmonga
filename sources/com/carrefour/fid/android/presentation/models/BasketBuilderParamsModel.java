package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.models.BasketDomain;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J+\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eHÖ\u0001R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/BasketBuilderParamsModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "a", "Lcom/carrefour/fid/android/core/types/RequestType;", "b", "", "c", "basket", "shoppingListRequestType", "hasFidCard", "d", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "f", "()Lcom/carrefour/fid/android/domain/models/BasketDomain;", "Lcom/carrefour/fid/android/core/types/RequestType;", "h", "()Lcom/carrefour/fid/android/core/types/RequestType;", "Z", "g", "()Z", "<init>", "(Lcom/carrefour/fid/android/domain/models/BasketDomain;Lcom/carrefour/fid/android/core/types/RequestType;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketBuilderParamsModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketBuilderParamsModel> CREATOR = new C38415a();

    /* renamed from: d */
    public static final int f97267d = 8;
    @C12580l

    /* renamed from: a */
    public final BasketDomain f97268a;
    @C12580l

    /* renamed from: b */
    public final RequestType f97269b;

    /* renamed from: c */
    public final boolean f97270c;

    /* renamed from: com.carrefour.fid.android.presentation.models.BasketBuilderParamsModel$a */
    public static final class C38415a implements Parcelable.Creator<BasketBuilderParamsModel> {
        @C12579k
        /* renamed from: a */
        public final BasketBuilderParamsModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            RequestType requestType = null;
            BasketDomain createFromParcel = parcel.readInt() == 0 ? null : BasketDomain.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                requestType = RequestType.valueOf(parcel.readString());
            }
            return new BasketBuilderParamsModel(createFromParcel, requestType, parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final BasketBuilderParamsModel[] newArray(int i) {
            return new BasketBuilderParamsModel[i];
        }
    }

    public BasketBuilderParamsModel(@C12580l BasketDomain basketDomain, @C12580l RequestType requestType, boolean z) {
        this.f97268a = basketDomain;
        this.f97269b = requestType;
        this.f97270c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ BasketBuilderParamsModel m158979e(BasketBuilderParamsModel basketBuilderParamsModel, BasketDomain basketDomain, RequestType requestType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            basketDomain = basketBuilderParamsModel.f97268a;
        }
        if ((i & 2) != 0) {
            requestType = basketBuilderParamsModel.f97269b;
        }
        if ((i & 4) != 0) {
            z = basketBuilderParamsModel.f97270c;
        }
        return basketBuilderParamsModel.mo121324d(basketDomain, requestType, z);
    }

    @C12580l
    /* renamed from: a */
    public final BasketDomain mo121321a() {
        return this.f97268a;
    }

    @C12580l
    /* renamed from: b */
    public final RequestType mo121322b() {
        return this.f97269b;
    }

    /* renamed from: c */
    public final boolean mo121323c() {
        return this.f97270c;
    }

    @C12579k
    /* renamed from: d */
    public final BasketBuilderParamsModel mo121324d(@C12580l BasketDomain basketDomain, @C12580l RequestType requestType, boolean z) {
        return new BasketBuilderParamsModel(basketDomain, requestType, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketBuilderParamsModel)) {
            return false;
        }
        BasketBuilderParamsModel basketBuilderParamsModel = (BasketBuilderParamsModel) obj;
        return Intrinsics.areEqual((Object) this.f97268a, (Object) basketBuilderParamsModel.f97268a) && this.f97269b == basketBuilderParamsModel.f97269b && this.f97270c == basketBuilderParamsModel.f97270c;
    }

    @C12580l
    /* renamed from: f */
    public final BasketDomain mo121327f() {
        return this.f97268a;
    }

    /* renamed from: g */
    public final boolean mo121328g() {
        return this.f97270c;
    }

    @C12580l
    /* renamed from: h */
    public final RequestType mo121329h() {
        return this.f97269b;
    }

    public int hashCode() {
        BasketDomain basketDomain = this.f97268a;
        int i = 0;
        int hashCode = (basketDomain == null ? 0 : basketDomain.hashCode()) * 31;
        RequestType requestType = this.f97269b;
        if (requestType != null) {
            i = requestType.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f97270c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        BasketDomain basketDomain = this.f97268a;
        RequestType requestType = this.f97269b;
        boolean z = this.f97270c;
        return "BasketBuilderParamsModel(basket=" + basketDomain + ", shoppingListRequestType=" + requestType + ", hasFidCard=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        BasketDomain basketDomain = this.f97268a;
        if (basketDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basketDomain.writeToParcel(parcel, i);
        }
        RequestType requestType = this.f97269b;
        if (requestType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(requestType.name());
        }
        parcel.writeInt(this.f97270c ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketBuilderParamsModel(BasketDomain basketDomain, RequestType requestType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : basketDomain, (i & 2) != 0 ? RequestType.NONE : requestType, z);
    }
}
