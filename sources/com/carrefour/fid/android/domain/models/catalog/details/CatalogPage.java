package com.carrefour.fid.android.domain.models.catalog.details;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rHÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogPage;", "Landroid/os/Parcelable;", "", "a", "", "Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogArea;", "b", "c", "num", "area", "pageUrl", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Ljava/util/List;", "f", "()Ljava/util/List;", "h", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CatalogPage implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CatalogPage> CREATOR = new C37984a();
    @C12579k

    /* renamed from: a */
    public final String f95591a;
    @C12579k

    /* renamed from: b */
    public final List<CatalogArea> f95592b;
    @C12579k

    /* renamed from: c */
    public final String f95593c;

    /* renamed from: com.carrefour.fid.android.domain.models.catalog.details.CatalogPage$a */
    public static final class C37984a implements Parcelable.Creator<CatalogPage> {
        @C12579k
        /* renamed from: a */
        public final CatalogPage createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CatalogArea.CREATOR.createFromParcel(parcel));
            }
            return new CatalogPage(readString, arrayList, parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CatalogPage[] newArray(int i) {
            return new CatalogPage[i];
        }
    }

    public CatalogPage() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ CatalogPage m156301e(CatalogPage catalogPage, String str, List<CatalogArea> list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogPage.f95591a;
        }
        if ((i & 2) != 0) {
            list = catalogPage.f95592b;
        }
        if ((i & 4) != 0) {
            str2 = catalogPage.f95593c;
        }
        return catalogPage.mo117189d(str, list, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117186a() {
        return this.f95591a;
    }

    @C12579k
    /* renamed from: b */
    public final List<CatalogArea> mo117187b() {
        return this.f95592b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117188c() {
        return this.f95593c;
    }

    @C12579k
    /* renamed from: d */
    public final CatalogPage mo117189d(@C12579k String str, @C12579k List<CatalogArea> list, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "num");
        Intrinsics.checkNotNullParameter(list, "area");
        Intrinsics.checkNotNullParameter(str2, "pageUrl");
        return new CatalogPage(str, list, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogPage)) {
            return false;
        }
        CatalogPage catalogPage = (CatalogPage) obj;
        return Intrinsics.areEqual((Object) this.f95591a, (Object) catalogPage.f95591a) && Intrinsics.areEqual((Object) this.f95592b, (Object) catalogPage.f95592b) && Intrinsics.areEqual((Object) this.f95593c, (Object) catalogPage.f95593c);
    }

    @C12579k
    /* renamed from: f */
    public final List<CatalogArea> mo117192f() {
        return this.f95592b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo117193g() {
        return this.f95591a;
    }

    @C12579k
    /* renamed from: h */
    public final String mo117194h() {
        return this.f95593c;
    }

    public int hashCode() {
        return (((this.f95591a.hashCode() * 31) + this.f95592b.hashCode()) * 31) + this.f95593c.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95591a;
        List<CatalogArea> list = this.f95592b;
        String str2 = this.f95593c;
        return "CatalogPage(num=" + str + ", area=" + list + ", pageUrl=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95591a);
        List<CatalogArea> list = this.f95592b;
        parcel.writeInt(list.size());
        for (CatalogArea writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f95593c);
    }

    public CatalogPage(@C12579k String str, @C12579k List<CatalogArea> list, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "num");
        Intrinsics.checkNotNullParameter(list, "area");
        Intrinsics.checkNotNullParameter(str2, "pageUrl");
        this.f95591a = str;
        this.f95592b = list;
        this.f95593c = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogPage(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 4) != 0 ? new String() : str2);
    }
}
