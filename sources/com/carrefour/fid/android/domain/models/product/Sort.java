package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B'\u0012\u000b\u0010\n\u001a\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\bø\u0001\u0002¢\u0006\u0004\b\"\u0010#J\u001e\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J9\u0010\r\u001a\u00020\u00002\r\b\u0002\u0010\n\u001a\u00070\u0002¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010HÖ\u0001R%\u0010\n\u001a\u00070\u0002¢\u0006\u0002\b\u00038\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u0005R\"\u0010\f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b\f\u0010\u001f\"\u0004\b \u0010!\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/Sort;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/product/e;", "Lkotlinx/parcelize/e;", "a", "()Ljava/lang/String;", "", "b", "", "c", "field", "label", "isSelected", "d", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/carrefour/fid/android/domain/models/product/Sort;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "g", "Z", "()Z", "h", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Sort implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Sort> CREATOR = new C38099a();
    @C12579k

    /* renamed from: a */
    public final String f96313a;
    @C12579k

    /* renamed from: b */
    public final String f96314b;

    /* renamed from: c */
    public boolean f96315c;

    /* renamed from: com.carrefour.fid.android.domain.models.product.Sort$a */
    public static final class C38099a implements Parcelable.Creator<Sort> {
        @C12579k
        /* renamed from: a */
        public final Sort createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Sort(((C38111e) parcel.readValue(Sort.class.getClassLoader())).mo118782h(), parcel.readString(), parcel.readInt() != 0, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final Sort[] newArray(int i) {
            return new Sort[i];
        }
    }

    public /* synthetic */ Sort(String str, String str2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z);
    }

    /* renamed from: e */
    public static /* synthetic */ Sort m157489e(Sort sort, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sort.f96313a;
        }
        if ((i & 2) != 0) {
            str2 = sort.f96314b;
        }
        if ((i & 4) != 0) {
            z = sort.f96315c;
        }
        return sort.mo118608d(str, str2, z);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118605a() {
        return this.f96313a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo118606b() {
        return this.f96314b;
    }

    /* renamed from: c */
    public final boolean mo118607c() {
        return this.f96315c;
    }

    @C12579k
    /* renamed from: d */
    public final Sort mo118608d(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "field");
        Intrinsics.checkNotNullParameter(str2, "label");
        return new Sort(str, str2, z, (DefaultConstructorMarker) null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sort)) {
            return false;
        }
        Sort sort = (Sort) obj;
        return C38111e.m157652d(this.f96313a, sort.f96313a) && Intrinsics.areEqual((Object) this.f96314b, (Object) sort.f96314b) && this.f96315c == sort.f96315c;
    }

    @C12579k
    /* renamed from: f */
    public final String mo118611f() {
        return this.f96313a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo118612g() {
        return this.f96314b;
    }

    /* renamed from: h */
    public final void mo118613h(boolean z) {
        this.f96315c = z;
    }

    public int hashCode() {
        int f = ((C38111e.m157653f(this.f96313a) * 31) + this.f96314b.hashCode()) * 31;
        boolean z = this.f96315c;
        if (z) {
            z = true;
        }
        return f + (z ? 1 : 0);
    }

    public final boolean isSelected() {
        return this.f96315c;
    }

    @C12579k
    public String toString() {
        String g = C38111e.m157654g(this.f96313a);
        String str = this.f96314b;
        boolean z = this.f96315c;
        return "Sort(field=" + g + ", label=" + str + ", isSelected=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeValue(C38111e.m157649a(this.f96313a));
        parcel.writeString(this.f96314b);
        parcel.writeInt(this.f96315c ? 1 : 0);
    }

    public Sort(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "field");
        Intrinsics.checkNotNullParameter(str2, "label");
        this.f96313a = str;
        this.f96314b = str2;
        this.f96315c = z;
    }
}
