package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\n\u0010\u0014\u001a\u00060\u000fj\u0002`\u0010\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\t\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001R\u001b\u0010\u0014\u001a\u00060\u000fj\u0002`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/OfferMixingModel;", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/a;", "", "id", "Lcom/carrefour/fid/android/design/components/widgets/productcard/b$a;", "typeFactory", "", "getType", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "Lcom/carrefour/fid/android/presentation/models/OfferDiscountModel;", "a", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "()Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "discount", "", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "b", "Ljava/util/List;", "()Ljava/util/List;", "offers", "<init>", "(Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;Ljava/util/List;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OfferMixingModel implements OfferModel, C37369a {
    @C12579k
    public static final Parcelable.Creator<OfferMixingModel> CREATOR = new C38438a();

    /* renamed from: c */
    public static final int f97445c = 8;
    @C12579k

    /* renamed from: a */
    public final OfferDiscountDomain f97446a;
    @C12579k

    /* renamed from: b */
    public final List<OfferProductModel> f97447b;

    /* renamed from: com.carrefour.fid.android.presentation.models.OfferMixingModel$a */
    public static final class C38438a implements Parcelable.Creator<OfferMixingModel> {
        @C12579k
        /* renamed from: a */
        public final OfferMixingModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OfferDiscountDomain createFromParcel = OfferDiscountDomain.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(OfferMixingModel.class.getClassLoader()));
            }
            return new OfferMixingModel(createFromParcel, arrayList);
        }

        @C12579k
        /* renamed from: b */
        public final OfferMixingModel[] newArray(int i) {
            return new OfferMixingModel[i];
        }
    }

    public OfferMixingModel(@C12579k OfferDiscountDomain offerDiscountDomain, @C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(offerDiscountDomain, FirebaseAnalytics.C32532b.f78937Y);
        Intrinsics.checkNotNullParameter(list, "offers");
        this.f97446a = offerDiscountDomain;
        this.f97447b = list;
    }

    @C12579k
    /* renamed from: a */
    public final OfferDiscountDomain mo121718a() {
        return this.f97446a;
    }

    @C12579k
    /* renamed from: b */
    public final List<OfferProductModel> mo121719b() {
        return this.f97447b;
    }

    public int describeContents() {
        return 0;
    }

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return 14;
    }

    /* renamed from: id */
    public long mo121471id() {
        return -1;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f97446a.writeToParcel(parcel, i);
        List<OfferProductModel> list = this.f97447b;
        parcel.writeInt(list.size());
        for (OfferProductModel writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
