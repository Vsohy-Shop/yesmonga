package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.models.BasketDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JO\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/RecommendedProductsParamsModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "a", "Lcom/carrefour/fid/android/core/types/RequestType;", "b", "", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "c", "d", "", "e", "basket", "shoppingListRequestType", "lastFrequentPurchasesProducts", "lastMostRelevantProducts", "hasFidCard", "f", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "h", "()Lcom/carrefour/fid/android/domain/models/BasketDomain;", "Lcom/carrefour/fid/android/core/types/RequestType;", "l", "()Lcom/carrefour/fid/android/core/types/RequestType;", "Ljava/util/List;", "j", "()Ljava/util/List;", "k", "Z", "i", "()Z", "<init>", "(Lcom/carrefour/fid/android/domain/models/BasketDomain;Lcom/carrefour/fid/android/core/types/RequestType;Ljava/util/List;Ljava/util/List;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class RecommendedProductsParamsModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<RecommendedProductsParamsModel> CREATOR = new C38448a();

    /* renamed from: f */
    public static final int f97538f = 8;
    @C12580l

    /* renamed from: a */
    public final BasketDomain f97539a;
    @C12580l

    /* renamed from: b */
    public final RequestType f97540b;
    @C12580l

    /* renamed from: c */
    public final List<OfferProductModel> f97541c;
    @C12580l

    /* renamed from: d */
    public final List<OfferProductModel> f97542d;

    /* renamed from: e */
    public final boolean f97543e;

    /* renamed from: com.carrefour.fid.android.presentation.models.RecommendedProductsParamsModel$a */
    public static final class C38448a implements Parcelable.Creator<RecommendedProductsParamsModel> {
        @C12579k
        /* renamed from: a */
        public final RecommendedProductsParamsModel createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList2 = null;
            BasketDomain createFromParcel = parcel.readInt() == 0 ? null : BasketDomain.CREATOR.createFromParcel(parcel);
            RequestType valueOf = parcel.readInt() == 0 ? null : RequestType.valueOf(parcel.readString());
            Class<RecommendedProductsParamsModel> cls = RecommendedProductsParamsModel.class;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(parcel.readParcelable(cls.getClassLoader()));
                }
            }
            return new RecommendedProductsParamsModel(createFromParcel, valueOf, arrayList, arrayList2, parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final RecommendedProductsParamsModel[] newArray(int i) {
            return new RecommendedProductsParamsModel[i];
        }
    }

    public RecommendedProductsParamsModel(@C12580l BasketDomain basketDomain, @C12580l RequestType requestType, @C12580l List<? extends OfferProductModel> list, @C12580l List<? extends OfferProductModel> list2, boolean z) {
        this.f97539a = basketDomain;
        this.f97540b = requestType;
        this.f97541c = list;
        this.f97542d = list2;
        this.f97543e = z;
    }

    /* renamed from: g */
    public static /* synthetic */ RecommendedProductsParamsModel m159456g(RecommendedProductsParamsModel recommendedProductsParamsModel, BasketDomain basketDomain, RequestType requestType, List<OfferProductModel> list, List<OfferProductModel> list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            basketDomain = recommendedProductsParamsModel.f97539a;
        }
        if ((i & 2) != 0) {
            requestType = recommendedProductsParamsModel.f97540b;
        }
        RequestType requestType2 = requestType;
        if ((i & 4) != 0) {
            list = recommendedProductsParamsModel.f97541c;
        }
        List<OfferProductModel> list3 = list;
        if ((i & 8) != 0) {
            list2 = recommendedProductsParamsModel.f97542d;
        }
        List<OfferProductModel> list4 = list2;
        if ((i & 16) != 0) {
            z = recommendedProductsParamsModel.f97543e;
        }
        return recommendedProductsParamsModel.mo121924f(basketDomain, requestType2, list3, list4, z);
    }

    @C12580l
    /* renamed from: a */
    public final BasketDomain mo121917a() {
        return this.f97539a;
    }

    @C12580l
    /* renamed from: b */
    public final RequestType mo121918b() {
        return this.f97540b;
    }

    @C12580l
    /* renamed from: c */
    public final List<OfferProductModel> mo121919c() {
        return this.f97541c;
    }

    @C12580l
    /* renamed from: d */
    public final List<OfferProductModel> mo121920d() {
        return this.f97542d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo121922e() {
        return this.f97543e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedProductsParamsModel)) {
            return false;
        }
        RecommendedProductsParamsModel recommendedProductsParamsModel = (RecommendedProductsParamsModel) obj;
        return Intrinsics.areEqual((Object) this.f97539a, (Object) recommendedProductsParamsModel.f97539a) && this.f97540b == recommendedProductsParamsModel.f97540b && Intrinsics.areEqual((Object) this.f97541c, (Object) recommendedProductsParamsModel.f97541c) && Intrinsics.areEqual((Object) this.f97542d, (Object) recommendedProductsParamsModel.f97542d) && this.f97543e == recommendedProductsParamsModel.f97543e;
    }

    @C12579k
    /* renamed from: f */
    public final RecommendedProductsParamsModel mo121924f(@C12580l BasketDomain basketDomain, @C12580l RequestType requestType, @C12580l List<? extends OfferProductModel> list, @C12580l List<? extends OfferProductModel> list2, boolean z) {
        return new RecommendedProductsParamsModel(basketDomain, requestType, list, list2, z);
    }

    @C12580l
    /* renamed from: h */
    public final BasketDomain mo121925h() {
        return this.f97539a;
    }

    public int hashCode() {
        BasketDomain basketDomain = this.f97539a;
        int i = 0;
        int hashCode = (basketDomain == null ? 0 : basketDomain.hashCode()) * 31;
        RequestType requestType = this.f97540b;
        int hashCode2 = (hashCode + (requestType == null ? 0 : requestType.hashCode())) * 31;
        List<OfferProductModel> list = this.f97541c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<OfferProductModel> list2 = this.f97542d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f97543e;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo121927i() {
        return this.f97543e;
    }

    @C12580l
    /* renamed from: j */
    public final List<OfferProductModel> mo121928j() {
        return this.f97541c;
    }

    @C12580l
    /* renamed from: k */
    public final List<OfferProductModel> mo121929k() {
        return this.f97542d;
    }

    @C12580l
    /* renamed from: l */
    public final RequestType mo121930l() {
        return this.f97540b;
    }

    @C12579k
    public String toString() {
        BasketDomain basketDomain = this.f97539a;
        RequestType requestType = this.f97540b;
        List<OfferProductModel> list = this.f97541c;
        List<OfferProductModel> list2 = this.f97542d;
        boolean z = this.f97543e;
        return "RecommendedProductsParamsModel(basket=" + basketDomain + ", shoppingListRequestType=" + requestType + ", lastFrequentPurchasesProducts=" + list + ", lastMostRelevantProducts=" + list2 + ", hasFidCard=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        BasketDomain basketDomain = this.f97539a;
        if (basketDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basketDomain.writeToParcel(parcel, i);
        }
        RequestType requestType = this.f97540b;
        if (requestType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(requestType.name());
        }
        List<OfferProductModel> list = this.f97541c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (OfferProductModel writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        List<OfferProductModel> list2 = this.f97542d;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (OfferProductModel writeParcelable2 : list2) {
                parcel.writeParcelable(writeParcelable2, i);
            }
        }
        parcel.writeInt(this.f97543e ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendedProductsParamsModel(BasketDomain basketDomain, RequestType requestType, List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : basketDomain, (i & 2) != 0 ? RequestType.NONE : requestType, list, list2, z);
    }
}
