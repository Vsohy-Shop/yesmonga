package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/OfferUnavailableModel;", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/a;", "", "id", "Lcom/carrefour/fid/android/design/components/widgets/productcard/b$a;", "typeFactory", "", "getType", "", "a", "", "b", "list", "isExpanded", "c", "", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/util/List;", "e", "()Ljava/util/List;", "Z", "f", "()Z", "g", "(Z)V", "<init>", "(Ljava/util/List;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OfferUnavailableModel implements OfferModel, C37369a {
    @C12579k
    public static final Parcelable.Creator<OfferUnavailableModel> CREATOR = new C38440a();

    /* renamed from: c */
    public static final int f97482c = 8;
    @C12579k

    /* renamed from: a */
    public final List<OfferModel> f97483a;

    /* renamed from: b */
    public boolean f97484b;

    /* renamed from: com.carrefour.fid.android.presentation.models.OfferUnavailableModel$a */
    public static final class C38440a implements Parcelable.Creator<OfferUnavailableModel> {
        @C12579k
        /* renamed from: a */
        public final OfferUnavailableModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z = false;
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(OfferUnavailableModel.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new OfferUnavailableModel(arrayList, z);
        }

        @C12579k
        /* renamed from: b */
        public final OfferUnavailableModel[] newArray(int i) {
            return new OfferUnavailableModel[i];
        }
    }

    public OfferUnavailableModel(@C12579k List<? extends OfferModel> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f97483a = list;
        this.f97484b = z;
    }

    /* renamed from: d */
    public static /* synthetic */ OfferUnavailableModel m159340d(OfferUnavailableModel offerUnavailableModel, List<OfferModel> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = offerUnavailableModel.f97483a;
        }
        if ((i & 2) != 0) {
            z = offerUnavailableModel.f97484b;
        }
        return offerUnavailableModel.mo121758c(list, z);
    }

    @C12579k
    /* renamed from: a */
    public final List<OfferModel> mo121756a() {
        return this.f97483a;
    }

    /* renamed from: b */
    public final boolean mo121757b() {
        return this.f97484b;
    }

    @C12579k
    /* renamed from: c */
    public final OfferUnavailableModel mo121758c(@C12579k List<? extends OfferModel> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new OfferUnavailableModel(list, z);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final List<OfferModel> mo121760e() {
        return this.f97483a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferUnavailableModel)) {
            return false;
        }
        OfferUnavailableModel offerUnavailableModel = (OfferUnavailableModel) obj;
        return Intrinsics.areEqual((Object) this.f97483a, (Object) offerUnavailableModel.f97483a) && this.f97484b == offerUnavailableModel.f97484b;
    }

    /* renamed from: f */
    public final boolean mo121762f() {
        return this.f97484b;
    }

    /* renamed from: g */
    public final void mo121763g(boolean z) {
        this.f97484b = z;
    }

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return 11;
    }

    public int hashCode() {
        int hashCode = this.f97483a.hashCode() * 31;
        boolean z = this.f97484b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    /* renamed from: id */
    public long mo121471id() {
        return -2;
    }

    @C12579k
    public String toString() {
        List<OfferModel> list = this.f97483a;
        boolean z = this.f97484b;
        return "OfferUnavailableModel(list=" + list + ", isExpanded=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<OfferModel> list = this.f97483a;
        parcel.writeInt(list.size());
        for (OfferModel writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.f97484b ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfferUnavailableModel(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z);
    }
}
