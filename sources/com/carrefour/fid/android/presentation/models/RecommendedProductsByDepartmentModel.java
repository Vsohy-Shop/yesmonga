package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J#\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/RecommendedProductsByDepartmentModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "", "id", "Lcom/carrefour/fid/android/presentation/models/OfferDepartmentModel;", "a", "", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "b", "department", "products", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/presentation/models/OfferDepartmentModel;", "e", "()Lcom/carrefour/fid/android/presentation/models/OfferDepartmentModel;", "Ljava/util/List;", "f", "()Ljava/util/List;", "<init>", "(Lcom/carrefour/fid/android/presentation/models/OfferDepartmentModel;Ljava/util/List;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class RecommendedProductsByDepartmentModel implements Parcelable, OfferModel {
    @C12579k
    public static final Parcelable.Creator<RecommendedProductsByDepartmentModel> CREATOR = new C38447a();

    /* renamed from: c */
    public static final int f97535c = 8;
    @C12579k

    /* renamed from: a */
    public final OfferDepartmentModel f97536a;
    @C12579k

    /* renamed from: b */
    public final List<OfferProductModel> f97537b;

    /* renamed from: com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel$a */
    public static final class C38447a implements Parcelable.Creator<RecommendedProductsByDepartmentModel> {
        @C12579k
        /* renamed from: a */
        public final RecommendedProductsByDepartmentModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OfferDepartmentModel createFromParcel = OfferDepartmentModel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(RecommendedProductsByDepartmentModel.class.getClassLoader()));
            }
            return new RecommendedProductsByDepartmentModel(createFromParcel, arrayList);
        }

        @C12579k
        /* renamed from: b */
        public final RecommendedProductsByDepartmentModel[] newArray(int i) {
            return new RecommendedProductsByDepartmentModel[i];
        }
    }

    public RecommendedProductsByDepartmentModel(@C12579k OfferDepartmentModel offerDepartmentModel, @C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(offerDepartmentModel, "department");
        Intrinsics.checkNotNullParameter(list, "products");
        this.f97536a = offerDepartmentModel;
        this.f97537b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ RecommendedProductsByDepartmentModel m159447d(RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel, OfferDepartmentModel offerDepartmentModel, List<OfferProductModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            offerDepartmentModel = recommendedProductsByDepartmentModel.f97536a;
        }
        if ((i & 2) != 0) {
            list = recommendedProductsByDepartmentModel.f97537b;
        }
        return recommendedProductsByDepartmentModel.mo121905c(offerDepartmentModel, list);
    }

    @C12579k
    /* renamed from: a */
    public final OfferDepartmentModel mo121903a() {
        return this.f97536a;
    }

    @C12579k
    /* renamed from: b */
    public final List<OfferProductModel> mo121904b() {
        return this.f97537b;
    }

    @C12579k
    /* renamed from: c */
    public final RecommendedProductsByDepartmentModel mo121905c(@C12579k OfferDepartmentModel offerDepartmentModel, @C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(offerDepartmentModel, "department");
        Intrinsics.checkNotNullParameter(list, "products");
        return new RecommendedProductsByDepartmentModel(offerDepartmentModel, list);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final OfferDepartmentModel mo121907e() {
        return this.f97536a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedProductsByDepartmentModel)) {
            return false;
        }
        RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = (RecommendedProductsByDepartmentModel) obj;
        return Intrinsics.areEqual((Object) this.f97536a, (Object) recommendedProductsByDepartmentModel.f97536a) && Intrinsics.areEqual((Object) this.f97537b, (Object) recommendedProductsByDepartmentModel.f97537b);
    }

    @C12579k
    /* renamed from: f */
    public final List<OfferProductModel> mo121909f() {
        return this.f97537b;
    }

    public int hashCode() {
        return (this.f97536a.hashCode() * 31) + this.f97537b.hashCode();
    }

    /* renamed from: id */
    public long mo121471id() {
        return (long) this.f97536a.hashCode();
    }

    @C12579k
    public String toString() {
        OfferDepartmentModel offerDepartmentModel = this.f97536a;
        List<OfferProductModel> list = this.f97537b;
        return "RecommendedProductsByDepartmentModel(department=" + offerDepartmentModel + ", products=" + list + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f97536a.writeToParcel(parcel, i);
        List<OfferProductModel> list = this.f97537b;
        parcel.writeInt(list.size());
        for (OfferProductModel writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendedProductsByDepartmentModel(OfferDepartmentModel offerDepartmentModel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(offerDepartmentModel, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }
}
