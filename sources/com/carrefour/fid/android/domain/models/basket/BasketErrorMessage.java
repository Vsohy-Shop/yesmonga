package com.carrefour.fid.android.domain.models.basket;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/BasketErrorMessage;", "Landroid/os/Parcelable;", "", "a", "b", "c", "code", "message", "type", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "h", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class BasketErrorMessage implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketErrorMessage> CREATOR = new C37958a();
    @C12579k

    /* renamed from: a */
    public final String f95498a;
    @C12579k

    /* renamed from: b */
    public final String f95499b;
    @C12579k

    /* renamed from: c */
    public final String f95500c;

    /* renamed from: com.carrefour.fid.android.domain.models.basket.BasketErrorMessage$a */
    public static final class C37958a implements Parcelable.Creator<BasketErrorMessage> {
        @C12579k
        /* renamed from: a */
        public final BasketErrorMessage createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketErrorMessage(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final BasketErrorMessage[] newArray(int i) {
            return new BasketErrorMessage[i];
        }
    }

    public BasketErrorMessage() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ BasketErrorMessage m156066e(BasketErrorMessage basketErrorMessage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketErrorMessage.f95498a;
        }
        if ((i & 2) != 0) {
            str2 = basketErrorMessage.f95499b;
        }
        if ((i & 4) != 0) {
            str3 = basketErrorMessage.f95500c;
        }
        return basketErrorMessage.mo116906d(str, str2, str3);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116903a() {
        return this.f95498a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo116904b() {
        return this.f95499b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo116905c() {
        return this.f95500c;
    }

    @C12579k
    /* renamed from: d */
    public final BasketErrorMessage mo116906d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(str3, "type");
        return new BasketErrorMessage(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketErrorMessage)) {
            return false;
        }
        BasketErrorMessage basketErrorMessage = (BasketErrorMessage) obj;
        return Intrinsics.areEqual((Object) this.f95498a, (Object) basketErrorMessage.f95498a) && Intrinsics.areEqual((Object) this.f95499b, (Object) basketErrorMessage.f95499b) && Intrinsics.areEqual((Object) this.f95500c, (Object) basketErrorMessage.f95500c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo116909f() {
        return this.f95498a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo116910g() {
        return this.f95499b;
    }

    @C12579k
    /* renamed from: h */
    public final String mo116911h() {
        return this.f95500c;
    }

    public int hashCode() {
        return (((this.f95498a.hashCode() * 31) + this.f95499b.hashCode()) * 31) + this.f95500c.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95498a;
        String str2 = this.f95499b;
        String str3 = this.f95500c;
        return "BasketErrorMessage(code=" + str + ", message=" + str2 + ", type=" + str3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95498a);
        parcel.writeString(this.f95499b);
        parcel.writeString(this.f95500c);
    }

    public BasketErrorMessage(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(str3, "type");
        this.f95498a = str;
        this.f95499b = str2;
        this.f95500c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketErrorMessage(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3);
    }
}
