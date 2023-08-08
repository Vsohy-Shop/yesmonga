package com.carrefour.fid.android.domain.models.catalog.productdetails;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J/\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rHÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProductDescription;", "Landroid/os/Parcelable;", "", "a", "b", "", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProductPicto;", "c", "label", "content", "pictos", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "f", "Ljava/util/List;", "h", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CatalogProductDescription implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CatalogProductDescription> CREATOR = new C37988a();
    @C12579k

    /* renamed from: a */
    public final String f95610a;
    @C12579k

    /* renamed from: b */
    public final String f95611b;
    @C12580l

    /* renamed from: c */
    public final List<CatalogProductPicto> f95612c;

    /* renamed from: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription$a */
    public static final class C37988a implements Parcelable.Creator<CatalogProductDescription> {
        @C12579k
        /* renamed from: a */
        public final CatalogProductDescription createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(CatalogProductPicto.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CatalogProductDescription(readString, readString2, arrayList);
        }

        @C12579k
        /* renamed from: b */
        public final CatalogProductDescription[] newArray(int i) {
            return new CatalogProductDescription[i];
        }
    }

    public CatalogProductDescription() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ CatalogProductDescription m156351e(CatalogProductDescription catalogProductDescription, String str, String str2, List<CatalogProductPicto> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogProductDescription.f95610a;
        }
        if ((i & 2) != 0) {
            str2 = catalogProductDescription.f95611b;
        }
        if ((i & 4) != 0) {
            list = catalogProductDescription.f95612c;
        }
        return catalogProductDescription.mo117251d(str, str2, list);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117248a() {
        return this.f95610a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117249b() {
        return this.f95611b;
    }

    @C12580l
    /* renamed from: c */
    public final List<CatalogProductPicto> mo117250c() {
        return this.f95612c;
    }

    @C12579k
    /* renamed from: d */
    public final CatalogProductDescription mo117251d(@C12579k String str, @C12579k String str2, @C12580l List<CatalogProductPicto> list) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "content");
        return new CatalogProductDescription(str, str2, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogProductDescription)) {
            return false;
        }
        CatalogProductDescription catalogProductDescription = (CatalogProductDescription) obj;
        return Intrinsics.areEqual((Object) this.f95610a, (Object) catalogProductDescription.f95610a) && Intrinsics.areEqual((Object) this.f95611b, (Object) catalogProductDescription.f95611b) && Intrinsics.areEqual((Object) this.f95612c, (Object) catalogProductDescription.f95612c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117254f() {
        return this.f95611b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo117255g() {
        return this.f95610a;
    }

    @C12580l
    /* renamed from: h */
    public final List<CatalogProductPicto> mo117256h() {
        return this.f95612c;
    }

    public int hashCode() {
        int hashCode = ((this.f95610a.hashCode() * 31) + this.f95611b.hashCode()) * 31;
        List<CatalogProductPicto> list = this.f95612c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.f95610a;
        String str2 = this.f95611b;
        List<CatalogProductPicto> list = this.f95612c;
        return "CatalogProductDescription(label=" + str + ", content=" + str2 + ", pictos=" + list + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95610a);
        parcel.writeString(this.f95611b);
        List<CatalogProductPicto> list = this.f95612c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (CatalogProductPicto writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    public CatalogProductDescription(@C12579k String str, @C12579k String str2, @C12580l List<CatalogProductPicto> list) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "content");
        this.f95610a = str;
        this.f95611b = str2;
        this.f95612c = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogProductDescription(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? null : list);
    }
}
