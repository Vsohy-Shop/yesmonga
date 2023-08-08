package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J9\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CouponsFilter;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/presentation/models/FilterSection;", "a", "", "", "b", "", "c", "section", "content", "checkedContent", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/presentation/models/FilterSection;", "h", "()Lcom/carrefour/fid/android/presentation/models/FilterSection;", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "Ljava/util/List;", "f", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "<init>", "(Lcom/carrefour/fid/android/presentation/models/FilterSection;Ljava/util/Map;Ljava/util/List;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CouponsFilter implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CouponsFilter> CREATOR = new C38420a();

    /* renamed from: d */
    public static final int f97344d = 8;
    @C12579k

    /* renamed from: a */
    public final FilterSection f97345a;
    @C12579k

    /* renamed from: b */
    public final Map<String, String> f97346b;
    @C12579k

    /* renamed from: c */
    public List<String> f97347c;

    /* renamed from: com.carrefour.fid.android.presentation.models.CouponsFilter$a */
    public static final class C38420a implements Parcelable.Creator<CouponsFilter> {
        @C12579k
        /* renamed from: a */
        public final CouponsFilter createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            FilterSection valueOf = FilterSection.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new CouponsFilter(valueOf, linkedHashMap, parcel.createStringArrayList());
        }

        @C12579k
        /* renamed from: b */
        public final CouponsFilter[] newArray(int i) {
            return new CouponsFilter[i];
        }
    }

    public CouponsFilter(@C12579k FilterSection filterSection, @C12579k Map<String, String> map, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(filterSection, "section");
        Intrinsics.checkNotNullParameter(map, "content");
        Intrinsics.checkNotNullParameter(list, "checkedContent");
        this.f97345a = filterSection;
        this.f97346b = map;
        this.f97347c = list;
    }

    /* renamed from: e */
    public static /* synthetic */ CouponsFilter m159076e(CouponsFilter couponsFilter, FilterSection filterSection, Map<String, String> map, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            filterSection = couponsFilter.f97345a;
        }
        if ((i & 2) != 0) {
            map = couponsFilter.f97346b;
        }
        if ((i & 4) != 0) {
            list = couponsFilter.f97347c;
        }
        return couponsFilter.mo121447d(filterSection, map, list);
    }

    @C12579k
    /* renamed from: a */
    public final FilterSection mo121444a() {
        return this.f97345a;
    }

    @C12579k
    /* renamed from: b */
    public final Map<String, String> mo121445b() {
        return this.f97346b;
    }

    @C12579k
    /* renamed from: c */
    public final List<String> mo121446c() {
        return this.f97347c;
    }

    @C12579k
    /* renamed from: d */
    public final CouponsFilter mo121447d(@C12579k FilterSection filterSection, @C12579k Map<String, String> map, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(filterSection, "section");
        Intrinsics.checkNotNullParameter(map, "content");
        Intrinsics.checkNotNullParameter(list, "checkedContent");
        return new CouponsFilter(filterSection, map, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponsFilter)) {
            return false;
        }
        CouponsFilter couponsFilter = (CouponsFilter) obj;
        return this.f97345a == couponsFilter.f97345a && Intrinsics.areEqual((Object) this.f97346b, (Object) couponsFilter.f97346b) && Intrinsics.areEqual((Object) this.f97347c, (Object) couponsFilter.f97347c);
    }

    @C12579k
    /* renamed from: f */
    public final List<String> mo121450f() {
        return this.f97347c;
    }

    @C12579k
    /* renamed from: g */
    public final Map<String, String> mo121451g() {
        return this.f97346b;
    }

    @C12579k
    /* renamed from: h */
    public final FilterSection mo121452h() {
        return this.f97345a;
    }

    public int hashCode() {
        return (((this.f97345a.hashCode() * 31) + this.f97346b.hashCode()) * 31) + this.f97347c.hashCode();
    }

    /* renamed from: i */
    public final void mo121454i(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97347c = list;
    }

    @C12579k
    public String toString() {
        FilterSection filterSection = this.f97345a;
        Map<String, String> map = this.f97346b;
        List<String> list = this.f97347c;
        return "CouponsFilter(section=" + filterSection + ", content=" + map + ", checkedContent=" + list + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97345a.name());
        Map<String, String> map = this.f97346b;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
        parcel.writeStringList(this.f97347c);
    }
}
