package com.carrefour.fid.android.domain.models.catalog.details;

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

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogFullDetails;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogHeaderDetails;", "a", "", "b", "", "Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogDoublePage;", "c", "", "d", "catalogHeader", "slug", "doublePages", "dateOfSave", "e", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogHeaderDetails;", "g", "()Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogHeaderDetails;", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Ljava/util/List;", "i", "()Ljava/util/List;", "J", "h", "()J", "<init>", "(Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogHeaderDetails;Ljava/lang/String;Ljava/util/List;J)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CatalogFullDetails implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CatalogFullDetails> CREATOR = new C37982a();
    @C12580l

    /* renamed from: a */
    public final CatalogHeaderDetails f95572a;
    @C12579k

    /* renamed from: b */
    public final String f95573b;
    @C12579k

    /* renamed from: c */
    public final List<CatalogDoublePage> f95574c;

    /* renamed from: d */
    public final long f95575d;

    /* renamed from: com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails$a */
    public static final class C37982a implements Parcelable.Creator<CatalogFullDetails> {
        @C12579k
        /* renamed from: a */
        public final CatalogFullDetails createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CatalogHeaderDetails createFromParcel = parcel.readInt() == 0 ? null : CatalogHeaderDetails.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CatalogDoublePage.CREATOR.createFromParcel(parcel));
            }
            return new CatalogFullDetails(createFromParcel, readString, arrayList, parcel.readLong());
        }

        @C12579k
        /* renamed from: b */
        public final CatalogFullDetails[] newArray(int i) {
            return new CatalogFullDetails[i];
        }
    }

    public CatalogFullDetails() {
        this((CatalogHeaderDetails) null, (String) null, (List) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ CatalogFullDetails m156255f(CatalogFullDetails catalogFullDetails, CatalogHeaderDetails catalogHeaderDetails, String str, List<CatalogDoublePage> list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            catalogHeaderDetails = catalogFullDetails.f95572a;
        }
        if ((i & 2) != 0) {
            str = catalogFullDetails.f95573b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            list = catalogFullDetails.f95574c;
        }
        List<CatalogDoublePage> list2 = list;
        if ((i & 8) != 0) {
            j = catalogFullDetails.f95575d;
        }
        return catalogFullDetails.mo117133e(catalogHeaderDetails, str2, list2, j);
    }

    @C12580l
    /* renamed from: a */
    public final CatalogHeaderDetails mo117128a() {
        return this.f95572a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117129b() {
        return this.f95573b;
    }

    @C12579k
    /* renamed from: c */
    public final List<CatalogDoublePage> mo117130c() {
        return this.f95574c;
    }

    /* renamed from: d */
    public final long mo117131d() {
        return this.f95575d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final CatalogFullDetails mo117133e(@C12580l CatalogHeaderDetails catalogHeaderDetails, @C12579k String str, @C12579k List<CatalogDoublePage> list, long j) {
        Intrinsics.checkNotNullParameter(str, "slug");
        Intrinsics.checkNotNullParameter(list, "doublePages");
        return new CatalogFullDetails(catalogHeaderDetails, str, list, j);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogFullDetails)) {
            return false;
        }
        CatalogFullDetails catalogFullDetails = (CatalogFullDetails) obj;
        return Intrinsics.areEqual((Object) this.f95572a, (Object) catalogFullDetails.f95572a) && Intrinsics.areEqual((Object) this.f95573b, (Object) catalogFullDetails.f95573b) && Intrinsics.areEqual((Object) this.f95574c, (Object) catalogFullDetails.f95574c) && this.f95575d == catalogFullDetails.f95575d;
    }

    @C12580l
    /* renamed from: g */
    public final CatalogHeaderDetails mo117135g() {
        return this.f95572a;
    }

    /* renamed from: h */
    public final long mo117136h() {
        return this.f95575d;
    }

    public int hashCode() {
        CatalogHeaderDetails catalogHeaderDetails = this.f95572a;
        return ((((((catalogHeaderDetails == null ? 0 : catalogHeaderDetails.hashCode()) * 31) + this.f95573b.hashCode()) * 31) + this.f95574c.hashCode()) * 31) + Long.hashCode(this.f95575d);
    }

    @C12579k
    /* renamed from: i */
    public final List<CatalogDoublePage> mo117138i() {
        return this.f95574c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo117139j() {
        return this.f95573b;
    }

    @C12579k
    public String toString() {
        CatalogHeaderDetails catalogHeaderDetails = this.f95572a;
        String str = this.f95573b;
        List<CatalogDoublePage> list = this.f95574c;
        long j = this.f95575d;
        return "CatalogFullDetails(catalogHeader=" + catalogHeaderDetails + ", slug=" + str + ", doublePages=" + list + ", dateOfSave=" + j + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        CatalogHeaderDetails catalogHeaderDetails = this.f95572a;
        if (catalogHeaderDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogHeaderDetails.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f95573b);
        List<CatalogDoublePage> list = this.f95574c;
        parcel.writeInt(list.size());
        for (CatalogDoublePage writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.f95575d);
    }

    public CatalogFullDetails(@C12580l CatalogHeaderDetails catalogHeaderDetails, @C12579k String str, @C12579k List<CatalogDoublePage> list, long j) {
        Intrinsics.checkNotNullParameter(str, "slug");
        Intrinsics.checkNotNullParameter(list, "doublePages");
        this.f95572a = catalogHeaderDetails;
        this.f95573b = str;
        this.f95574c = list;
        this.f95575d = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CatalogFullDetails(com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails r4, java.lang.String r5, java.util.List r6, long r7, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000e
            java.lang.String r5 = new java.lang.String
            r5.<init>()
        L_0x000e:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0017
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0017:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001e
            r7 = 0
        L_0x001e:
            r1 = r7
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r5.<init>(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails.<init>(com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails, java.lang.String, java.util.List, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
