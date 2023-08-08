package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "()Ljava/lang/Long;", "label", "unit", "value", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "Ljava/lang/Long;", "h", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CategoryLimitDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CategoryLimitDomain> CREATOR = new C37903a();

    /* renamed from: d */
    public static final int f95091d = 0;
    @C12580l

    /* renamed from: a */
    public final String f95092a;
    @C12580l

    /* renamed from: b */
    public final String f95093b;
    @C12580l

    /* renamed from: c */
    public final Long f95094c;

    /* renamed from: com.carrefour.fid.android.domain.models.CategoryLimitDomain$a */
    public static final class C37903a implements Parcelable.Creator<CategoryLimitDomain> {
        @C12579k
        /* renamed from: a */
        public final CategoryLimitDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CategoryLimitDomain(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @C12579k
        /* renamed from: b */
        public final CategoryLimitDomain[] newArray(int i) {
            return new CategoryLimitDomain[i];
        }
    }

    public CategoryLimitDomain() {
        this((String) null, (String) null, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ CategoryLimitDomain m155342e(CategoryLimitDomain categoryLimitDomain, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryLimitDomain.f95092a;
        }
        if ((i & 2) != 0) {
            str2 = categoryLimitDomain.f95093b;
        }
        if ((i & 4) != 0) {
            l = categoryLimitDomain.f95094c;
        }
        return categoryLimitDomain.mo115668d(str, str2, l);
    }

    @C12580l
    /* renamed from: a */
    public final String mo115665a() {
        return this.f95092a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo115666b() {
        return this.f95093b;
    }

    @C12580l
    /* renamed from: c */
    public final Long mo115667c() {
        return this.f95094c;
    }

    @C12579k
    /* renamed from: d */
    public final CategoryLimitDomain mo115668d(@C12580l String str, @C12580l String str2, @C12580l Long l) {
        return new CategoryLimitDomain(str, str2, l);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryLimitDomain)) {
            return false;
        }
        CategoryLimitDomain categoryLimitDomain = (CategoryLimitDomain) obj;
        return Intrinsics.areEqual((Object) this.f95092a, (Object) categoryLimitDomain.f95092a) && Intrinsics.areEqual((Object) this.f95093b, (Object) categoryLimitDomain.f95093b) && Intrinsics.areEqual((Object) this.f95094c, (Object) categoryLimitDomain.f95094c);
    }

    @C12580l
    /* renamed from: f */
    public final String mo115671f() {
        return this.f95092a;
    }

    @C12580l
    /* renamed from: g */
    public final String mo115672g() {
        return this.f95093b;
    }

    @C12580l
    /* renamed from: h */
    public final Long mo115673h() {
        return this.f95094c;
    }

    public int hashCode() {
        String str = this.f95092a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95093b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f95094c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.f95092a;
        String str2 = this.f95093b;
        Long l = this.f95094c;
        return "CategoryLimitDomain(label=" + str + ", unit=" + str2 + ", value=" + l + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95092a);
        parcel.writeString(this.f95093b);
        Long l = this.f95094c;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }

    public CategoryLimitDomain(@C12580l String str, @C12580l String str2, @C12580l Long l) {
        this.f95092a = str;
        this.f95093b = str2;
        this.f95094c = l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryLimitDomain(String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l);
    }
}
