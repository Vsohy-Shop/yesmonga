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

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/BasketOfferMessage;", "Landroid/os/Parcelable;", "", "a", "b", "code", "message", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketOfferMessage implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketOfferMessage> CREATOR = new C37898a();

    /* renamed from: c */
    public static final int f95070c = 0;
    @C12580l

    /* renamed from: a */
    public final String f95071a;
    @C12580l

    /* renamed from: b */
    public final String f95072b;

    /* renamed from: com.carrefour.fid.android.domain.models.BasketOfferMessage$a */
    public static final class C37898a implements Parcelable.Creator<BasketOfferMessage> {
        @C12579k
        /* renamed from: a */
        public final BasketOfferMessage createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketOfferMessage(parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final BasketOfferMessage[] newArray(int i) {
            return new BasketOfferMessage[i];
        }
    }

    public BasketOfferMessage() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ BasketOfferMessage m155288d(BasketOfferMessage basketOfferMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketOfferMessage.f95071a;
        }
        if ((i & 2) != 0) {
            str2 = basketOfferMessage.f95072b;
        }
        return basketOfferMessage.mo115583c(str, str2);
    }

    @C12580l
    /* renamed from: a */
    public final String mo115581a() {
        return this.f95071a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo115582b() {
        return this.f95072b;
    }

    @C12579k
    /* renamed from: c */
    public final BasketOfferMessage mo115583c(@C12580l String str, @C12580l String str2) {
        return new BasketOfferMessage(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final String mo115585e() {
        return this.f95071a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketOfferMessage)) {
            return false;
        }
        BasketOfferMessage basketOfferMessage = (BasketOfferMessage) obj;
        return Intrinsics.areEqual((Object) this.f95071a, (Object) basketOfferMessage.f95071a) && Intrinsics.areEqual((Object) this.f95072b, (Object) basketOfferMessage.f95072b);
    }

    @C12580l
    /* renamed from: f */
    public final String mo115587f() {
        return this.f95072b;
    }

    public int hashCode() {
        String str = this.f95071a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95072b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.f95071a;
        String str2 = this.f95072b;
        return "BasketOfferMessage(code=" + str + ", message=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95071a);
        parcel.writeString(this.f95072b);
    }

    public BasketOfferMessage(@C12580l String str, @C12580l String str2) {
        this.f95071a = str;
        this.f95072b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketOfferMessage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
