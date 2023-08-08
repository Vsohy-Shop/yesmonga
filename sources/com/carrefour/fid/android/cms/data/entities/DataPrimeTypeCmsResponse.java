package com.carrefour.fid.android.cms.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/DataPrimeTypeCmsResponse;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "component1", "prime", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "getPrime", "()Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "<init>", "(Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class DataPrimeTypeCmsResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<DataPrimeTypeCmsResponse> CREATOR = new C40014a();
    @C33608c("loyalty_prime_type")
    @C12579k
    private final DataPrimeCmsResponse prime;

    /* renamed from: com.carrefour.fid.android.cms.data.entities.DataPrimeTypeCmsResponse$a */
    public static final class C40014a implements Parcelable.Creator<DataPrimeTypeCmsResponse> {
        @C12579k
        /* renamed from: a */
        public final DataPrimeTypeCmsResponse createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataPrimeTypeCmsResponse(DataPrimeCmsResponse.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final DataPrimeTypeCmsResponse[] newArray(int i) {
            return new DataPrimeTypeCmsResponse[i];
        }
    }

    public DataPrimeTypeCmsResponse(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
        this.prime = dataPrimeCmsResponse;
    }

    public static /* synthetic */ DataPrimeTypeCmsResponse copy$default(DataPrimeTypeCmsResponse dataPrimeTypeCmsResponse, DataPrimeCmsResponse dataPrimeCmsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            dataPrimeCmsResponse = dataPrimeTypeCmsResponse.prime;
        }
        return dataPrimeTypeCmsResponse.copy(dataPrimeCmsResponse);
    }

    @C12579k
    public final DataPrimeCmsResponse component1() {
        return this.prime;
    }

    @C12579k
    public final DataPrimeTypeCmsResponse copy(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
        return new DataPrimeTypeCmsResponse(dataPrimeCmsResponse);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataPrimeTypeCmsResponse) && Intrinsics.areEqual((Object) this.prime, (Object) ((DataPrimeTypeCmsResponse) obj).prime);
    }

    @C12579k
    public final DataPrimeCmsResponse getPrime() {
        return this.prime;
    }

    public int hashCode() {
        return this.prime.hashCode();
    }

    @C12579k
    public String toString() {
        DataPrimeCmsResponse dataPrimeCmsResponse = this.prime;
        return "DataPrimeTypeCmsResponse(prime=" + dataPrimeCmsResponse + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.prime.writeToParcel(parcel, i);
    }
}
