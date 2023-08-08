package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005HÖ\u0001¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/OfferClearModel;", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/a;", "other", "", "b", "", "id", "Lcom/carrefour/fid/android/design/components/widgets/productcard/b$a;", "typeFactory", "getType", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OfferClearModel implements OfferModel, Comparable<OfferClearModel>, C37369a {
    @C12579k
    public static final Parcelable.Creator<OfferClearModel> CREATOR = new C38435a();

    /* renamed from: a */
    public static final int f97438a = 0;

    /* renamed from: com.carrefour.fid.android.presentation.models.OfferClearModel$a */
    public static final class C38435a implements Parcelable.Creator<OfferClearModel> {
        @C12579k
        /* renamed from: a */
        public final OfferClearModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new OfferClearModel();
        }

        @C12579k
        /* renamed from: b */
        public final OfferClearModel[] newArray(int i) {
            return new OfferClearModel[i];
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

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return 13;
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
