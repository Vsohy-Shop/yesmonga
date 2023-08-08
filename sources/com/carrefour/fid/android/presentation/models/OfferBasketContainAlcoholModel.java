package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import java.util.Comparator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/OfferBasketContainAlcoholModel;", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/a;", "other", "", "q", "", "id", "Lcom/carrefour/fid/android/design/components/widgets/productcard/b$a;", "typeFactory", "getType", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Z", "z", "()Z", "isChecked", "b", "y", "showError", "<init>", "(ZZ)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OfferBasketContainAlcoholModel implements OfferModel, Comparable<OfferBasketContainAlcoholModel>, C37369a {
    @C12579k
    public static final Parcelable.Creator<OfferBasketContainAlcoholModel> CREATOR = new C38434a();

    /* renamed from: c */
    public static final int f97433c = 0;

    /* renamed from: a */
    public final boolean f97434a;

    /* renamed from: b */
    public final boolean f97435b;

    /* renamed from: com.carrefour.fid.android.presentation.models.OfferBasketContainAlcoholModel$a */
    public static final class C38434a implements Parcelable.Creator<OfferBasketContainAlcoholModel> {
        @C12579k
        /* renamed from: a */
        public final OfferBasketContainAlcoholModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new OfferBasketContainAlcoholModel(z2, z);
        }

        @C12579k
        /* renamed from: b */
        public final OfferBasketContainAlcoholModel[] newArray(int i) {
            return new OfferBasketContainAlcoholModel[i];
        }
    }

    public OfferBasketContainAlcoholModel(boolean z, boolean z2) {
        this.f97434a = z;
        this.f97435b = z2;
    }

    /* renamed from: r */
    public static final Boolean m159251r(C11300l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* renamed from: w */
    public static final Boolean m159252w(C11300l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    public int describeContents() {
        return 0;
    }

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return 12;
    }

    /* renamed from: id */
    public long mo121471id() {
        return -1;
    }

    /* renamed from: q */
    public int compareTo(@C12579k OfferBasketContainAlcoholModel offerBasketContainAlcoholModel) {
        Intrinsics.checkNotNullParameter(offerBasketContainAlcoholModel, "other");
        return Comparator.comparing(new C38497m(OfferBasketContainAlcoholModel$compareTo$1.f97436a)).thenComparing(new C38522n(OfferBasketContainAlcoholModel$compareTo$2.f97437a)).compare(this, offerBasketContainAlcoholModel);
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f97434a ? 1 : 0);
        parcel.writeInt(this.f97435b ? 1 : 0);
    }

    /* renamed from: y */
    public final boolean mo121674y() {
        return this.f97435b;
    }

    /* renamed from: z */
    public final boolean mo121675z() {
        return this.f97434a;
    }
}
