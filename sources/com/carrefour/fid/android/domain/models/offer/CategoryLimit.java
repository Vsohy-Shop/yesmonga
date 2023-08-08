package com.carrefour.fid.android.domain.models.offer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/CategoryLimit;", "Landroid/os/Parcelable;", "", "a", "", "b", "c", "label", "value", "unit", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "J", "h", "()J", "g", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CategoryLimit implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CategoryLimit> CREATOR = new C38052a();
    @C12579k

    /* renamed from: a */
    public final String f95943a;

    /* renamed from: b */
    public final long f95944b;
    @C12579k

    /* renamed from: c */
    public final String f95945c;

    /* renamed from: com.carrefour.fid.android.domain.models.offer.CategoryLimit$a */
    public static final class C38052a implements Parcelable.Creator<CategoryLimit> {
        @C12579k
        /* renamed from: a */
        public final CategoryLimit createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CategoryLimit(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CategoryLimit[] newArray(int i) {
            return new CategoryLimit[i];
        }
    }

    public CategoryLimit(@C12579k String str, long j, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "unit");
        this.f95943a = str;
        this.f95944b = j;
        this.f95945c = str2;
    }

    /* renamed from: e */
    public static /* synthetic */ CategoryLimit m156955e(CategoryLimit categoryLimit, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryLimit.f95943a;
        }
        if ((i & 2) != 0) {
            j = categoryLimit.f95944b;
        }
        if ((i & 4) != 0) {
            str2 = categoryLimit.f95945c;
        }
        return categoryLimit.mo117940d(str, j, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117937a() {
        return this.f95943a;
    }

    /* renamed from: b */
    public final long mo117938b() {
        return this.f95944b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117939c() {
        return this.f95945c;
    }

    @C12579k
    /* renamed from: d */
    public final CategoryLimit mo117940d(@C12579k String str, long j, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "unit");
        return new CategoryLimit(str, j, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryLimit)) {
            return false;
        }
        CategoryLimit categoryLimit = (CategoryLimit) obj;
        return Intrinsics.areEqual((Object) this.f95943a, (Object) categoryLimit.f95943a) && this.f95944b == categoryLimit.f95944b && Intrinsics.areEqual((Object) this.f95945c, (Object) categoryLimit.f95945c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117943f() {
        return this.f95943a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo117944g() {
        return this.f95945c;
    }

    /* renamed from: h */
    public final long mo117945h() {
        return this.f95944b;
    }

    public int hashCode() {
        return (((this.f95943a.hashCode() * 31) + Long.hashCode(this.f95944b)) * 31) + this.f95945c.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95943a;
        long j = this.f95944b;
        String str2 = this.f95945c;
        return "CategoryLimit(label=" + str + ", value=" + j + ", unit=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95943a);
        parcel.writeLong(this.f95944b);
        parcel.writeString(this.f95945c);
    }
}
