package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u0000 \u00072\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001!B=\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b7\u00108J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0002J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003JK\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0019\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/FacetModel;", "Landroid/os/Parcelable;", "", "other", "", "b", "", "g", "q", "r", "", "Lcom/carrefour/fid/android/presentation/models/TermModel;", "w", "y", "", "z", "name", "type", "totalTerms", "topTerms", "field", "selected", "M", "toString", "hashCode", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "a", "Ljava/lang/String;", "X", "()Ljava/lang/String;", "h0", "c", "I", "f0", "()I", "d", "Ljava/util/List;", "e0", "()Ljava/util/List;", "j0", "(Ljava/util/List;)V", "e", "W", "f", "Z", "()Z", "i0", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class FacetModel implements Parcelable, Comparable<FacetModel> {
    @C12579k
    public static final Parcelable.Creator<FacetModel> CREATOR = new C38428b();
    @C12579k

    /* renamed from: g */
    public static final C38427a f97405g = new C38427a((DefaultConstructorMarker) null);

    /* renamed from: v */
    public static final int f97406v = 8;
    @C12579k

    /* renamed from: w */
    public static final String f97407w = "rayon";
    @C12579k

    /* renamed from: a */
    public final String f97408a;
    @C12579k

    /* renamed from: b */
    public final String f97409b;

    /* renamed from: c */
    public final int f97410c;
    @C12579k

    /* renamed from: d */
    public List<TermModel> f97411d;
    @C12579k

    /* renamed from: e */
    public final String f97412e;

    /* renamed from: f */
    public boolean f97413f;

    /* renamed from: com.carrefour.fid.android.presentation.models.FacetModel$a */
    public static final class C38427a {
        public /* synthetic */ C38427a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C38427a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.models.FacetModel$b */
    public static final class C38428b implements Parcelable.Creator<FacetModel> {
        @C12579k
        /* renamed from: a */
        public final FacetModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(TermModel.CREATOR.createFromParcel(parcel));
            }
            return new FacetModel(readString, readString2, readInt, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final FacetModel[] newArray(int i) {
            return new FacetModel[i];
        }
    }

    public FacetModel(@C12579k String str, @C12579k String str2, int i, @C12579k List<TermModel> list, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(list, "topTerms");
        Intrinsics.checkNotNullParameter(str3, "field");
        this.f97408a = str;
        this.f97409b = str2;
        this.f97410c = i;
        this.f97411d = list;
        this.f97412e = str3;
        this.f97413f = z;
    }

    /* renamed from: Q */
    public static /* synthetic */ FacetModel m159191Q(FacetModel facetModel, String str, String str2, int i, List<TermModel> list, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = facetModel.f97408a;
        }
        if ((i2 & 2) != 0) {
            str2 = facetModel.f97409b;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = facetModel.f97410c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = facetModel.f97411d;
        }
        List<TermModel> list2 = list;
        if ((i2 & 16) != 0) {
            str3 = facetModel.f97412e;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            z = facetModel.f97413f;
        }
        return facetModel.mo121571M(str, str4, i3, list2, str5, z);
    }

    @C12579k
    /* renamed from: M */
    public final FacetModel mo121571M(@C12579k String str, @C12579k String str2, int i, @C12579k List<TermModel> list, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(list, "topTerms");
        Intrinsics.checkNotNullParameter(str3, "field");
        return new FacetModel(str, str2, i, list, str3, z);
    }

    @C12579k
    /* renamed from: W */
    public final String mo121572W() {
        return this.f97412e;
    }

    @C12579k
    /* renamed from: X */
    public final String mo121573X() {
        return this.f97408a;
    }

    /* renamed from: Z */
    public final boolean mo121574Z() {
        return this.f97413f;
    }

    /* renamed from: b */
    public int compareTo(@C12579k FacetModel facetModel) {
        Intrinsics.checkNotNullParameter(facetModel, "other");
        if (C11622t.equals(this.f97408a, f97407w, true)) {
            return -1;
        }
        if (C11622t.equals(facetModel.f97408a, f97407w, true)) {
            return 1;
        }
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e0 */
    public final List<TermModel> mo121578e0() {
        return this.f97411d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FacetModel)) {
            return false;
        }
        FacetModel facetModel = (FacetModel) obj;
        return Intrinsics.areEqual((Object) this.f97408a, (Object) facetModel.f97408a) && Intrinsics.areEqual((Object) this.f97409b, (Object) facetModel.f97409b) && this.f97410c == facetModel.f97410c && Intrinsics.areEqual((Object) this.f97411d, (Object) facetModel.f97411d) && Intrinsics.areEqual((Object) this.f97412e, (Object) facetModel.f97412e) && this.f97413f == facetModel.f97413f;
    }

    /* renamed from: f0 */
    public final int mo121580f0() {
        return this.f97410c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo121581g() {
        return this.f97408a;
    }

    @C12579k
    /* renamed from: h0 */
    public final String mo121582h0() {
        return this.f97409b;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f97408a.hashCode() * 31) + this.f97409b.hashCode()) * 31) + Integer.hashCode(this.f97410c)) * 31) + this.f97411d.hashCode()) * 31) + this.f97412e.hashCode()) * 31;
        boolean z = this.f97413f;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    /* renamed from: i0 */
    public final void mo121584i0(boolean z) {
        this.f97413f = z;
    }

    /* renamed from: j0 */
    public final void mo121585j0(@C12579k List<TermModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97411d = list;
    }

    @C12579k
    /* renamed from: q */
    public final String mo121586q() {
        return this.f97409b;
    }

    /* renamed from: r */
    public final int mo121587r() {
        return this.f97410c;
    }

    @C12579k
    public String toString() {
        String str = this.f97408a;
        String str2 = this.f97409b;
        int i = this.f97410c;
        List<TermModel> list = this.f97411d;
        String str3 = this.f97412e;
        boolean z = this.f97413f;
        return "FacetModel(name=" + str + ", type=" + str2 + ", totalTerms=" + i + ", topTerms=" + list + ", field=" + str3 + ", selected=" + z + ")";
    }

    @C12579k
    /* renamed from: w */
    public final List<TermModel> mo121589w() {
        return this.f97411d;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97408a);
        parcel.writeString(this.f97409b);
        parcel.writeInt(this.f97410c);
        List<TermModel> list = this.f97411d;
        parcel.writeInt(list.size());
        for (TermModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f97412e);
        parcel.writeInt(this.f97413f ? 1 : 0);
    }

    @C12579k
    /* renamed from: y */
    public final String mo121591y() {
        return this.f97412e;
    }

    /* renamed from: z */
    public final boolean mo121592z() {
        return this.f97413f;
    }
}
