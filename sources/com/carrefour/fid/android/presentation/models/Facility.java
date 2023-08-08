package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/Facility;", "Landroid/os/Parcelable;", "", "a", "b", "name", "banner", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class Facility implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Facility> CREATOR = new C38429a();

    /* renamed from: c */
    public static final int f97414c = 0;
    @C12579k

    /* renamed from: a */
    public final String f97415a;
    @C12579k

    /* renamed from: b */
    public final String f97416b;

    /* renamed from: com.carrefour.fid.android.presentation.models.Facility$a */
    public static final class C38429a implements Parcelable.Creator<Facility> {
        @C12579k
        /* renamed from: a */
        public final Facility createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Facility(parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final Facility[] newArray(int i) {
            return new Facility[i];
        }
    }

    public Facility(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "banner");
        this.f97415a = str;
        this.f97416b = str2;
    }

    /* renamed from: d */
    public static /* synthetic */ Facility m159210d(Facility facility, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = facility.f97415a;
        }
        if ((i & 2) != 0) {
            str2 = facility.f97416b;
        }
        return facility.mo121599c(str, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo121597a() {
        return this.f97415a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo121598b() {
        return this.f97416b;
    }

    @C12579k
    /* renamed from: c */
    public final Facility mo121599c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "banner");
        return new Facility(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo121601e() {
        return this.f97416b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Facility)) {
            return false;
        }
        Facility facility = (Facility) obj;
        return Intrinsics.areEqual((Object) this.f97415a, (Object) facility.f97415a) && Intrinsics.areEqual((Object) this.f97416b, (Object) facility.f97416b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo121603f() {
        return this.f97415a;
    }

    public int hashCode() {
        return (this.f97415a.hashCode() * 31) + this.f97416b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f97415a;
        String str2 = this.f97416b;
        return "Facility(name=" + str + ", banner=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97415a);
        parcel.writeString(this.f97416b);
    }
}
