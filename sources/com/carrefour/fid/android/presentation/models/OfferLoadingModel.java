package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\t\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005HÖ\u0001¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/OfferLoadingModel;", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "", "Lcom/carrefour/fid/android/presentation/models/OfferClearModel;", "other", "", "b", "", "id", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OfferLoadingModel implements OfferModel, Comparable<OfferClearModel> {
    @C12579k
    public static final Parcelable.Creator<OfferLoadingModel> CREATOR = new C38437a();

    /* renamed from: a */
    public static final int f97444a = 0;

    /* renamed from: com.carrefour.fid.android.presentation.models.OfferLoadingModel$a */
    public static final class C38437a implements Parcelable.Creator<OfferLoadingModel> {
        @C12579k
        /* renamed from: a */
        public final OfferLoadingModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new OfferLoadingModel();
        }

        @C12579k
        /* renamed from: b */
        public final OfferLoadingModel[] newArray(int i) {
            return new OfferLoadingModel[i];
        }
    }

    /* renamed from: b */
    public int compareTo(@C12579k OfferClearModel offerClearModel) {
        Intrinsics.checkNotNullParameter(offerClearModel, "other");
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: id */
    public long mo121471id() {
        return -1;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(1);
    }
}
