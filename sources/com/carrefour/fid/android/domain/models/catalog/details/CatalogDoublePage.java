package com.carrefour.fid.android.domain.models.catalog.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogDoublePage;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogPage;", "a", "b", "leftPage", "rightPage", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogPage;", "e", "()Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogPage;", "f", "<init>", "(Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogPage;Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogPage;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CatalogDoublePage implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CatalogDoublePage> CREATOR = new C37981a();
    @C12580l

    /* renamed from: a */
    public final CatalogPage f95570a;
    @C12580l

    /* renamed from: b */
    public final CatalogPage f95571b;

    /* renamed from: com.carrefour.fid.android.domain.models.catalog.details.CatalogDoublePage$a */
    public static final class C37981a implements Parcelable.Creator<CatalogDoublePage> {
        @C12579k
        /* renamed from: a */
        public final CatalogDoublePage createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CatalogPage catalogPage = null;
            CatalogPage createFromParcel = parcel.readInt() == 0 ? null : CatalogPage.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                catalogPage = CatalogPage.CREATOR.createFromParcel(parcel);
            }
            return new CatalogDoublePage(createFromParcel, catalogPage);
        }

        @C12579k
        /* renamed from: b */
        public final CatalogDoublePage[] newArray(int i) {
            return new CatalogDoublePage[i];
        }
    }

    public CatalogDoublePage() {
        this((CatalogPage) null, (CatalogPage) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ CatalogDoublePage m156247d(CatalogDoublePage catalogDoublePage, CatalogPage catalogPage, CatalogPage catalogPage2, int i, Object obj) {
        if ((i & 1) != 0) {
            catalogPage = catalogDoublePage.f95570a;
        }
        if ((i & 2) != 0) {
            catalogPage2 = catalogDoublePage.f95571b;
        }
        return catalogDoublePage.mo117116c(catalogPage, catalogPage2);
    }

    @C12580l
    /* renamed from: a */
    public final CatalogPage mo117114a() {
        return this.f95570a;
    }

    @C12580l
    /* renamed from: b */
    public final CatalogPage mo117115b() {
        return this.f95571b;
    }

    @C12579k
    /* renamed from: c */
    public final CatalogDoublePage mo117116c(@C12580l CatalogPage catalogPage, @C12580l CatalogPage catalogPage2) {
        return new CatalogDoublePage(catalogPage, catalogPage2);
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final CatalogPage mo117118e() {
        return this.f95570a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogDoublePage)) {
            return false;
        }
        CatalogDoublePage catalogDoublePage = (CatalogDoublePage) obj;
        return Intrinsics.areEqual((Object) this.f95570a, (Object) catalogDoublePage.f95570a) && Intrinsics.areEqual((Object) this.f95571b, (Object) catalogDoublePage.f95571b);
    }

    @C12580l
    /* renamed from: f */
    public final CatalogPage mo117120f() {
        return this.f95571b;
    }

    public int hashCode() {
        CatalogPage catalogPage = this.f95570a;
        int i = 0;
        int hashCode = (catalogPage == null ? 0 : catalogPage.hashCode()) * 31;
        CatalogPage catalogPage2 = this.f95571b;
        if (catalogPage2 != null) {
            i = catalogPage2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        CatalogPage catalogPage = this.f95570a;
        CatalogPage catalogPage2 = this.f95571b;
        return "CatalogDoublePage(leftPage=" + catalogPage + ", rightPage=" + catalogPage2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        CatalogPage catalogPage = this.f95570a;
        if (catalogPage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogPage.writeToParcel(parcel, i);
        }
        CatalogPage catalogPage2 = this.f95571b;
        if (catalogPage2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        catalogPage2.writeToParcel(parcel, i);
    }

    public CatalogDoublePage(@C12580l CatalogPage catalogPage, @C12580l CatalogPage catalogPage2) {
        this.f95570a = catalogPage;
        this.f95571b = catalogPage2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogDoublePage(CatalogPage catalogPage, CatalogPage catalogPage2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : catalogPage, (i & 2) != 0 ? null : catalogPage2);
    }
}
