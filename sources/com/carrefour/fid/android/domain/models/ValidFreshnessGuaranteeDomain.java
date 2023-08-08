package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.FreshnessType;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/ValidFreshnessGuaranteeDomain;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/FreshnessGuaranteeDomain;", "", "a", "Lcom/carrefour/fid/android/core/type/FreshnessType;", "b", "value", "type", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/core/type/FreshnessType;", "e", "()Lcom/carrefour/fid/android/core/type/FreshnessType;", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/core/type/FreshnessType;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class ValidFreshnessGuaranteeDomain extends FreshnessGuaranteeDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ValidFreshnessGuaranteeDomain> CREATOR = new C37939a();

    /* renamed from: d */
    public static final int f95387d = 0;
    @C12579k

    /* renamed from: b */
    public final String f95388b;
    @C12579k

    /* renamed from: c */
    public final FreshnessType f95389c;

    /* renamed from: com.carrefour.fid.android.domain.models.ValidFreshnessGuaranteeDomain$a */
    public static final class C37939a implements Parcelable.Creator<ValidFreshnessGuaranteeDomain> {
        @C12579k
        /* renamed from: a */
        public final ValidFreshnessGuaranteeDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ValidFreshnessGuaranteeDomain(parcel.readString(), FreshnessType.valueOf(parcel.readString()));
        }

        @C12579k
        /* renamed from: b */
        public final ValidFreshnessGuaranteeDomain[] newArray(int i) {
            return new ValidFreshnessGuaranteeDomain[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidFreshnessGuaranteeDomain(@C12579k String str, @C12579k FreshnessType freshnessType) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "value");
        Intrinsics.checkNotNullParameter(freshnessType, "type");
        this.f95388b = str;
        this.f95389c = freshnessType;
    }

    /* renamed from: d */
    public static /* synthetic */ ValidFreshnessGuaranteeDomain m155823d(ValidFreshnessGuaranteeDomain validFreshnessGuaranteeDomain, String str, FreshnessType freshnessType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validFreshnessGuaranteeDomain.f95388b;
        }
        if ((i & 2) != 0) {
            freshnessType = validFreshnessGuaranteeDomain.f95389c;
        }
        return validFreshnessGuaranteeDomain.mo116618c(str, freshnessType);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116616a() {
        return this.f95388b;
    }

    @C12579k
    /* renamed from: b */
    public final FreshnessType mo116617b() {
        return this.f95389c;
    }

    @C12579k
    /* renamed from: c */
    public final ValidFreshnessGuaranteeDomain mo116618c(@C12579k String str, @C12579k FreshnessType freshnessType) {
        Intrinsics.checkNotNullParameter(str, "value");
        Intrinsics.checkNotNullParameter(freshnessType, "type");
        return new ValidFreshnessGuaranteeDomain(str, freshnessType);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final FreshnessType mo116620e() {
        return this.f95389c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidFreshnessGuaranteeDomain)) {
            return false;
        }
        ValidFreshnessGuaranteeDomain validFreshnessGuaranteeDomain = (ValidFreshnessGuaranteeDomain) obj;
        return Intrinsics.areEqual((Object) this.f95388b, (Object) validFreshnessGuaranteeDomain.f95388b) && this.f95389c == validFreshnessGuaranteeDomain.f95389c;
    }

    @C12579k
    /* renamed from: f */
    public final String mo116622f() {
        return this.f95388b;
    }

    public int hashCode() {
        return (this.f95388b.hashCode() * 31) + this.f95389c.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95388b;
        FreshnessType freshnessType = this.f95389c;
        return "ValidFreshnessGuaranteeDomain(value=" + str + ", type=" + freshnessType + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95388b);
        parcel.writeString(this.f95389c.name());
    }
}
