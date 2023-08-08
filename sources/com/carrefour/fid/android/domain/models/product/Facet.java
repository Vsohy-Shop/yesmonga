package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.presentation.p035ui.coupons.filter.C23812d;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0004B;\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003JG\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/Facet;", "Landroid/os/Parcelable;", "", "Lcom/carrefour/fid/android/domain/models/product/Filter;", "a", "Lcom/carrefour/fid/android/domain/models/product/Sort;", "b", "", "c", "", "d", "e", "filters", "sorts", "totalResult", "isSyncing", "isDefault", "f", "", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/util/List;", "h", "()Ljava/util/List;", "i", "I", "j", "()I", "Z", "l", "()Z", "k", "<init>", "(Ljava/util/List;Ljava/util/List;IZZ)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Facet implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Facet> CREATOR = new C38085b();
    @C12579k

    /* renamed from: f */
    public static final C38084a f96242f = new C38084a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final String f96243g = "score";
    @C12579k

    /* renamed from: a */
    public final List<Filter> f96244a;
    @C12579k

    /* renamed from: b */
    public final List<Sort> f96245b;

    /* renamed from: c */
    public final int f96246c;

    /* renamed from: d */
    public final boolean f96247d;

    /* renamed from: e */
    public final boolean f96248e;

    /* renamed from: com.carrefour.fid.android.domain.models.product.Facet$a */
    public static final class C38084a {
        public /* synthetic */ C38084a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final Facet mo118351a() {
            return new Facet(CollectionsKt__CollectionsKt.m40441E(), CollectionsKt__CollectionsKt.m40441E(), 0, false, false);
        }

        public C38084a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.product.Facet$b */
    public static final class C38085b implements Parcelable.Creator<Facet> {
        @C12579k
        /* renamed from: a */
        public final Facet createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(Facet.class.getClassLoader()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(Sort.CREATOR.createFromParcel(parcel));
            }
            return new Facet(arrayList, arrayList2, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final Facet[] newArray(int i) {
            return new Facet[i];
        }
    }

    public Facet(@C12579k List<? extends Filter> list, @C12579k List<Sort> list2, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, C23812d.f59917a);
        Intrinsics.checkNotNullParameter(list2, "sorts");
        this.f96244a = list;
        this.f96245b = list2;
        this.f96246c = i;
        this.f96247d = z;
        this.f96248e = z2;
    }

    /* renamed from: g */
    public static /* synthetic */ Facet m157278g(Facet facet, List<Filter> list, List<Sort> list2, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = facet.f96244a;
        }
        if ((i2 & 2) != 0) {
            list2 = facet.f96245b;
        }
        List<Sort> list3 = list2;
        if ((i2 & 4) != 0) {
            i = facet.f96246c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = facet.f96247d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = facet.f96248e;
        }
        return facet.mo118342f(list, list3, i3, z3, z2);
    }

    @C12579k
    /* renamed from: a */
    public final List<Filter> mo118335a() {
        return this.f96244a;
    }

    @C12579k
    /* renamed from: b */
    public final List<Sort> mo118336b() {
        return this.f96245b;
    }

    /* renamed from: c */
    public final int mo118337c() {
        return this.f96246c;
    }

    /* renamed from: d */
    public final boolean mo118338d() {
        return this.f96247d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo118340e() {
        return this.f96248e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Facet)) {
            return false;
        }
        Facet facet = (Facet) obj;
        return Intrinsics.areEqual((Object) this.f96244a, (Object) facet.f96244a) && Intrinsics.areEqual((Object) this.f96245b, (Object) facet.f96245b) && this.f96246c == facet.f96246c && this.f96247d == facet.f96247d && this.f96248e == facet.f96248e;
    }

    @C12579k
    /* renamed from: f */
    public final Facet mo118342f(@C12579k List<? extends Filter> list, @C12579k List<Sort> list2, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, C23812d.f59917a);
        Intrinsics.checkNotNullParameter(list2, "sorts");
        return new Facet(list, list2, i, z, z2);
    }

    @C12579k
    /* renamed from: h */
    public final List<Filter> mo118343h() {
        return this.f96244a;
    }

    public int hashCode() {
        int hashCode = ((((this.f96244a.hashCode() * 31) + this.f96245b.hashCode()) * 31) + Integer.hashCode(this.f96246c)) * 31;
        boolean z = this.f96247d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f96248e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final List<Sort> mo118345i() {
        return this.f96245b;
    }

    /* renamed from: j */
    public final int mo118346j() {
        return this.f96246c;
    }

    /* renamed from: k */
    public final boolean mo118347k() {
        return this.f96248e;
    }

    /* renamed from: l */
    public final boolean mo118348l() {
        return this.f96247d;
    }

    @C12579k
    public String toString() {
        List<Filter> list = this.f96244a;
        List<Sort> list2 = this.f96245b;
        int i = this.f96246c;
        boolean z = this.f96247d;
        boolean z2 = this.f96248e;
        return "Facet(filters=" + list + ", sorts=" + list2 + ", totalResult=" + i + ", isSyncing=" + z + ", isDefault=" + z2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<Filter> list = this.f96244a;
        parcel.writeInt(list.size());
        for (Filter writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<Sort> list2 = this.f96245b;
        parcel.writeInt(list2.size());
        for (Sort writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f96246c);
        parcel.writeInt(this.f96247d ? 1 : 0);
        parcel.writeInt(this.f96248e ? 1 : 0);
    }
}
