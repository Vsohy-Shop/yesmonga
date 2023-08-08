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

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/BasketErrorMessage;", "Landroid/os/Parcelable;", "", "a", "b", "c", "errorCode", "message", "type", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "h", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketErrorMessage implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketErrorMessage> CREATOR = new C37895a();

    /* renamed from: d */
    public static final int f95042d = 0;
    @C12580l

    /* renamed from: a */
    public final String f95043a;
    @C12580l

    /* renamed from: b */
    public final String f95044b;
    @C12580l

    /* renamed from: c */
    public final String f95045c;

    /* renamed from: com.carrefour.fid.android.domain.models.BasketErrorMessage$a */
    public static final class C37895a implements Parcelable.Creator<BasketErrorMessage> {
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
    public static /* synthetic */ BasketErrorMessage m155232e(BasketErrorMessage basketErrorMessage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketErrorMessage.f95043a;
        }
        if ((i & 2) != 0) {
            str2 = basketErrorMessage.f95044b;
        }
        if ((i & 4) != 0) {
            str3 = basketErrorMessage.f95045c;
        }
        return basketErrorMessage.mo115512d(str, str2, str3);
    }

    @C12580l
    /* renamed from: a */
    public final String mo115509a() {
        return this.f95043a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo115510b() {
        return this.f95044b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo115511c() {
        return this.f95045c;
    }

    @C12579k
    /* renamed from: d */
    public final BasketErrorMessage mo115512d(@C12580l String str, @C12580l String str2, @C12580l String str3) {
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
        return Intrinsics.areEqual((Object) this.f95043a, (Object) basketErrorMessage.f95043a) && Intrinsics.areEqual((Object) this.f95044b, (Object) basketErrorMessage.f95044b) && Intrinsics.areEqual((Object) this.f95045c, (Object) basketErrorMessage.f95045c);
    }

    @C12580l
    /* renamed from: f */
    public final String mo115515f() {
        return this.f95043a;
    }

    @C12580l
    /* renamed from: g */
    public final String mo115516g() {
        return this.f95044b;
    }

    @C12580l
    /* renamed from: h */
    public final String mo115517h() {
        return this.f95045c;
    }

    public int hashCode() {
        String str = this.f95043a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95044b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95045c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.f95043a;
        String str2 = this.f95044b;
        String str3 = this.f95045c;
        return "BasketErrorMessage(errorCode=" + str + ", message=" + str2 + ", type=" + str3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95043a);
        parcel.writeString(this.f95044b);
        parcel.writeString(this.f95045c);
    }

    public BasketErrorMessage(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        this.f95043a = str;
        this.f95044b = str2;
        this.f95045c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketErrorMessage(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
