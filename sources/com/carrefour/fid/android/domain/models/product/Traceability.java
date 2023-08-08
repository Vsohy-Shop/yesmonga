package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/Traceability;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/product/TraceabilityType;", "a", "", "b", "type", "value", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/product/TraceabilityType;", "e", "()Lcom/carrefour/fid/android/domain/models/product/TraceabilityType;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Lcom/carrefour/fid/android/domain/models/product/TraceabilityType;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Traceability implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Traceability> CREATOR = new C38101a();
    @C12579k

    /* renamed from: a */
    public final TraceabilityType f96318a;
    @C12580l

    /* renamed from: b */
    public final String f96319b;

    /* renamed from: com.carrefour.fid.android.domain.models.product.Traceability$a */
    public static final class C38101a implements Parcelable.Creator<Traceability> {
        @C12579k
        /* renamed from: a */
        public final Traceability createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Traceability(TraceabilityType.valueOf(parcel.readString()), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final Traceability[] newArray(int i) {
            return new Traceability[i];
        }
    }

    public Traceability(@C12579k TraceabilityType traceabilityType, @C12580l String str) {
        Intrinsics.checkNotNullParameter(traceabilityType, "type");
        this.f96318a = traceabilityType;
        this.f96319b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ Traceability m157507d(Traceability traceability, TraceabilityType traceabilityType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            traceabilityType = traceability.f96318a;
        }
        if ((i & 2) != 0) {
            str = traceability.f96319b;
        }
        return traceability.mo118639c(traceabilityType, str);
    }

    @C12579k
    /* renamed from: a */
    public final TraceabilityType mo118637a() {
        return this.f96318a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo118638b() {
        return this.f96319b;
    }

    @C12579k
    /* renamed from: c */
    public final Traceability mo118639c(@C12579k TraceabilityType traceabilityType, @C12580l String str) {
        Intrinsics.checkNotNullParameter(traceabilityType, "type");
        return new Traceability(traceabilityType, str);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final TraceabilityType mo118641e() {
        return this.f96318a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Traceability)) {
            return false;
        }
        Traceability traceability = (Traceability) obj;
        return this.f96318a == traceability.f96318a && Intrinsics.areEqual((Object) this.f96319b, (Object) traceability.f96319b);
    }

    @C12580l
    /* renamed from: f */
    public final String mo118643f() {
        return this.f96319b;
    }

    public int hashCode() {
        int hashCode = this.f96318a.hashCode() * 31;
        String str = this.f96319b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @C12579k
    public String toString() {
        TraceabilityType traceabilityType = this.f96318a;
        String str = this.f96319b;
        return "Traceability(type=" + traceabilityType + ", value=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f96318a.name());
        parcel.writeString(this.f96319b);
    }
}
