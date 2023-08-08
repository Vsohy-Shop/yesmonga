package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrdersPagingDomain;", "Landroid/os/Parcelable;", "", "component1", "component2", "scrollHash", "scrollPaging", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getScrollHash", "()Ljava/lang/String;", "getScrollPaging", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrdersPagingDomain implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrdersPagingDomain> CREATOR = new C37931a();
    @C12580l
    private final String scrollHash;
    @C12580l
    private final String scrollPaging;

    /* renamed from: com.carrefour.fid.android.domain.models.OrdersPagingDomain$a */
    public static final class C37931a implements Parcelable.Creator<OrdersPagingDomain> {
        @C12579k
        /* renamed from: a */
        public final OrdersPagingDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrdersPagingDomain(parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrdersPagingDomain[] newArray(int i) {
            return new OrdersPagingDomain[i];
        }
    }

    public OrdersPagingDomain(@C12580l String str, @C12580l String str2) {
        this.scrollHash = str;
        this.scrollPaging = str2;
    }

    public static /* synthetic */ OrdersPagingDomain copy$default(OrdersPagingDomain ordersPagingDomain, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ordersPagingDomain.scrollHash;
        }
        if ((i & 2) != 0) {
            str2 = ordersPagingDomain.scrollPaging;
        }
        return ordersPagingDomain.copy(str, str2);
    }

    @C12580l
    public final String component1() {
        return this.scrollHash;
    }

    @C12580l
    public final String component2() {
        return this.scrollPaging;
    }

    @C12579k
    public final OrdersPagingDomain copy(@C12580l String str, @C12580l String str2) {
        return new OrdersPagingDomain(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersPagingDomain)) {
            return false;
        }
        OrdersPagingDomain ordersPagingDomain = (OrdersPagingDomain) obj;
        return Intrinsics.areEqual((Object) this.scrollHash, (Object) ordersPagingDomain.scrollHash) && Intrinsics.areEqual((Object) this.scrollPaging, (Object) ordersPagingDomain.scrollPaging);
    }

    @C12580l
    public final String getScrollHash() {
        return this.scrollHash;
    }

    @C12580l
    public final String getScrollPaging() {
        return this.scrollPaging;
    }

    public int hashCode() {
        String str = this.scrollHash;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scrollPaging;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.scrollHash;
        String str2 = this.scrollPaging;
        return "OrdersPagingDomain(scrollHash=" + str + ", scrollPaging=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.scrollHash);
        parcel.writeString(this.scrollPaging);
    }
}
