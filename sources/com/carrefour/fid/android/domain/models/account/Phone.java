package com.carrefour.fid.android.domain.models.account;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/account/Phone;", "Landroid/os/Parcelable;", "", "a", "", "b", "number", "preference", "c", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Z", "f", "()Z", "<init>", "(Ljava/lang/String;Z)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Phone implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Phone> CREATOR = new C37945a();
    @C12579k

    /* renamed from: a */
    public final String f95429a;

    /* renamed from: b */
    public final boolean f95430b;

    /* renamed from: com.carrefour.fid.android.domain.models.account.Phone$a */
    public static final class C37945a implements Parcelable.Creator<Phone> {
        @C12579k
        /* renamed from: a */
        public final Phone createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Phone(parcel.readString(), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final Phone[] newArray(int i) {
            return new Phone[i];
        }
    }

    public Phone() {
        this((String) null, false, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ Phone m155919d(Phone phone, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phone.f95429a;
        }
        if ((i & 2) != 0) {
            z = phone.f95430b;
        }
        return phone.mo116739c(str, z);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116737a() {
        return this.f95429a;
    }

    /* renamed from: b */
    public final boolean mo116738b() {
        return this.f95430b;
    }

    @C12579k
    /* renamed from: c */
    public final Phone mo116739c(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "number");
        return new Phone(str, z);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo116741e() {
        return this.f95429a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) obj;
        return Intrinsics.areEqual((Object) this.f95429a, (Object) phone.f95429a) && this.f95430b == phone.f95430b;
    }

    /* renamed from: f */
    public final boolean mo116743f() {
        return this.f95430b;
    }

    public int hashCode() {
        int hashCode = this.f95429a.hashCode() * 31;
        boolean z = this.f95430b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        String str = this.f95429a;
        boolean z = this.f95430b;
        return "Phone(number=" + str + ", preference=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95429a);
        parcel.writeInt(this.f95430b ? 1 : 0);
    }

    public Phone(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "number");
        this.f95429a = str;
        this.f95430b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Phone(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? false : z);
    }
}
