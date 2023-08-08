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

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/InvoicesInfoDomain;", "Landroid/os/Parcelable;", "", "a", "b", "invoiceUrl", "invoiceType", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class InvoicesInfoDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<InvoicesInfoDomain> CREATOR = new C37913a();

    /* renamed from: c */
    public static final int f95168c = 0;
    @C12579k

    /* renamed from: a */
    public final String f95169a;
    @C12579k

    /* renamed from: b */
    public final String f95170b;

    /* renamed from: com.carrefour.fid.android.domain.models.InvoicesInfoDomain$a */
    public static final class C37913a implements Parcelable.Creator<InvoicesInfoDomain> {
        @C12579k
        /* renamed from: a */
        public final InvoicesInfoDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvoicesInfoDomain(parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final InvoicesInfoDomain[] newArray(int i) {
            return new InvoicesInfoDomain[i];
        }
    }

    public InvoicesInfoDomain() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ InvoicesInfoDomain m155455d(InvoicesInfoDomain invoicesInfoDomain, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invoicesInfoDomain.f95169a;
        }
        if ((i & 2) != 0) {
            str2 = invoicesInfoDomain.f95170b;
        }
        return invoicesInfoDomain.mo115848c(str, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo115846a() {
        return this.f95169a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo115847b() {
        return this.f95170b;
    }

    @C12579k
    /* renamed from: c */
    public final InvoicesInfoDomain mo115848c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "invoiceUrl");
        Intrinsics.checkNotNullParameter(str2, "invoiceType");
        return new InvoicesInfoDomain(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo115850e() {
        return this.f95170b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoicesInfoDomain)) {
            return false;
        }
        InvoicesInfoDomain invoicesInfoDomain = (InvoicesInfoDomain) obj;
        return Intrinsics.areEqual((Object) this.f95169a, (Object) invoicesInfoDomain.f95169a) && Intrinsics.areEqual((Object) this.f95170b, (Object) invoicesInfoDomain.f95170b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo115852f() {
        return this.f95169a;
    }

    public int hashCode() {
        return (this.f95169a.hashCode() * 31) + this.f95170b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95169a;
        String str2 = this.f95170b;
        return "InvoicesInfoDomain(invoiceUrl=" + str + ", invoiceType=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95169a);
        parcel.writeString(this.f95170b);
    }

    public InvoicesInfoDomain(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "invoiceUrl");
        Intrinsics.checkNotNullParameter(str2, "invoiceType");
        this.f95169a = str;
        this.f95170b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvoicesInfoDomain(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
