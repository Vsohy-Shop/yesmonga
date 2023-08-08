package com.carrefour.fid.android.cms.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\b¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u001d\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0003J\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\bHÆ\u0003Jd\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\"R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010\"R6\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R6\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/PrimeCmsResponse;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Integer;", "component2", "Ljava/util/ArrayList;", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeTypeCmsResponse;", "Lkotlin/collections/ArrayList;", "component3", "Lcom/carrefour/fid/android/cms/data/entities/LinkPrimeCmsResponse;", "component4", "count", "maxAllowedPrimes", "data", "links", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lcom/carrefour/fid/android/cms/data/entities/PrimeCmsResponse;", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/Integer;", "getCount", "setCount", "(Ljava/lang/Integer;)V", "getMaxAllowedPrimes", "setMaxAllowedPrimes", "Ljava/util/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getLinks", "setLinks", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class PrimeCmsResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<PrimeCmsResponse> CREATOR = new C40017a();
    @C33608c("count")
    @C12580l
    private Integer count;
    @C33608c("data")
    @C12580l
    private ArrayList<DataPrimeTypeCmsResponse> data;
    @C33608c("links")
    @C12580l
    private ArrayList<LinkPrimeCmsResponse> links;
    @C33608c("max_allowed_primes")
    @C12580l
    private Integer maxAllowedPrimes;

    /* renamed from: com.carrefour.fid.android.cms.data.entities.PrimeCmsResponse$a */
    public static final class C40017a implements Parcelable.Creator<PrimeCmsResponse> {
        @C12579k
        /* renamed from: a */
        public final PrimeCmsResponse createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList2 = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(DataPrimeTypeCmsResponse.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList3.add(LinkPrimeCmsResponse.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new PrimeCmsResponse(valueOf, valueOf2, arrayList, arrayList2);
        }

        @C12579k
        /* renamed from: b */
        public final PrimeCmsResponse[] newArray(int i) {
            return new PrimeCmsResponse[i];
        }
    }

    public PrimeCmsResponse() {
        this((Integer) null, (Integer) null, (ArrayList) null, (ArrayList) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PrimeCmsResponse copy$default(PrimeCmsResponse primeCmsResponse, Integer num, Integer num2, ArrayList<DataPrimeTypeCmsResponse> arrayList, ArrayList<LinkPrimeCmsResponse> arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = primeCmsResponse.count;
        }
        if ((i & 2) != 0) {
            num2 = primeCmsResponse.maxAllowedPrimes;
        }
        if ((i & 4) != 0) {
            arrayList = primeCmsResponse.data;
        }
        if ((i & 8) != 0) {
            arrayList2 = primeCmsResponse.links;
        }
        return primeCmsResponse.copy(num, num2, arrayList, arrayList2);
    }

    @C12580l
    public final Integer component1() {
        return this.count;
    }

    @C12580l
    public final Integer component2() {
        return this.maxAllowedPrimes;
    }

    @C12580l
    public final ArrayList<DataPrimeTypeCmsResponse> component3() {
        return this.data;
    }

    @C12580l
    public final ArrayList<LinkPrimeCmsResponse> component4() {
        return this.links;
    }

    @C12579k
    public final PrimeCmsResponse copy(@C12580l Integer num, @C12580l Integer num2, @C12580l ArrayList<DataPrimeTypeCmsResponse> arrayList, @C12580l ArrayList<LinkPrimeCmsResponse> arrayList2) {
        return new PrimeCmsResponse(num, num2, arrayList, arrayList2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrimeCmsResponse)) {
            return false;
        }
        PrimeCmsResponse primeCmsResponse = (PrimeCmsResponse) obj;
        return Intrinsics.areEqual((Object) this.count, (Object) primeCmsResponse.count) && Intrinsics.areEqual((Object) this.maxAllowedPrimes, (Object) primeCmsResponse.maxAllowedPrimes) && Intrinsics.areEqual((Object) this.data, (Object) primeCmsResponse.data) && Intrinsics.areEqual((Object) this.links, (Object) primeCmsResponse.links);
    }

    @C12580l
    public final Integer getCount() {
        return this.count;
    }

    @C12580l
    public final ArrayList<DataPrimeTypeCmsResponse> getData() {
        return this.data;
    }

    @C12580l
    public final ArrayList<LinkPrimeCmsResponse> getLinks() {
        return this.links;
    }

    @C12580l
    public final Integer getMaxAllowedPrimes() {
        return this.maxAllowedPrimes;
    }

    public int hashCode() {
        Integer num = this.count;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxAllowedPrimes;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        ArrayList<DataPrimeTypeCmsResponse> arrayList = this.data;
        int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<LinkPrimeCmsResponse> arrayList2 = this.links;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setCount(@C12580l Integer num) {
        this.count = num;
    }

    public final void setData(@C12580l ArrayList<DataPrimeTypeCmsResponse> arrayList) {
        this.data = arrayList;
    }

    public final void setLinks(@C12580l ArrayList<LinkPrimeCmsResponse> arrayList) {
        this.links = arrayList;
    }

    public final void setMaxAllowedPrimes(@C12580l Integer num) {
        this.maxAllowedPrimes = num;
    }

    @C12579k
    public String toString() {
        Integer num = this.count;
        Integer num2 = this.maxAllowedPrimes;
        ArrayList<DataPrimeTypeCmsResponse> arrayList = this.data;
        ArrayList<LinkPrimeCmsResponse> arrayList2 = this.links;
        return "PrimeCmsResponse(count=" + num + ", maxAllowedPrimes=" + num2 + ", data=" + arrayList + ", links=" + arrayList2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.maxAllowedPrimes;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        ArrayList<DataPrimeTypeCmsResponse> arrayList = this.data;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<DataPrimeTypeCmsResponse> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<LinkPrimeCmsResponse> arrayList2 = this.links;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList2.size());
        Iterator<LinkPrimeCmsResponse> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public PrimeCmsResponse(@C12580l Integer num, @C12580l Integer num2, @C12580l ArrayList<DataPrimeTypeCmsResponse> arrayList, @C12580l ArrayList<LinkPrimeCmsResponse> arrayList2) {
        this.count = num;
        this.maxAllowedPrimes = num2;
        this.data = arrayList;
        this.links = arrayList2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrimeCmsResponse(Integer num, Integer num2, ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : arrayList, (i & 8) != 0 ? null : arrayList2);
    }
}
