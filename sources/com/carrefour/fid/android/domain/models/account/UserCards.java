package com.carrefour.fid.android.domain.models.account;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/account/UserCards;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "d", "", "e", "num", "date", "isSecured", "category", "key", "f", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "i", "Z", "l", "()Z", "h", "I", "j", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class UserCards implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<UserCards> CREATOR = new C37946a();
    @C12579k

    /* renamed from: a */
    public final String f95431a;
    @C12579k

    /* renamed from: b */
    public final String f95432b;

    /* renamed from: c */
    public final boolean f95433c;
    @C12579k

    /* renamed from: d */
    public final String f95434d;

    /* renamed from: e */
    public final int f95435e;

    /* renamed from: com.carrefour.fid.android.domain.models.account.UserCards$a */
    public static final class C37946a implements Parcelable.Creator<UserCards> {
        @C12579k
        /* renamed from: a */
        public final UserCards createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserCards(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final UserCards[] newArray(int i) {
            return new UserCards[i];
        }
    }

    public UserCards(@C12579k String str, @C12579k String str2, boolean z, @C12579k String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "num");
        Intrinsics.checkNotNullParameter(str2, "date");
        Intrinsics.checkNotNullParameter(str3, "category");
        this.f95431a = str;
        this.f95432b = str2;
        this.f95433c = z;
        this.f95434d = str3;
        this.f95435e = i;
    }

    /* renamed from: g */
    public static /* synthetic */ UserCards m155927g(UserCards userCards, String str, String str2, boolean z, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userCards.f95431a;
        }
        if ((i2 & 2) != 0) {
            str2 = userCards.f95432b;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            z = userCards.f95433c;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str3 = userCards.f95434d;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            i = userCards.f95435e;
        }
        return userCards.mo116758f(str, str4, z2, str5, i);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116751a() {
        return this.f95431a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo116752b() {
        return this.f95432b;
    }

    /* renamed from: c */
    public final boolean mo116753c() {
        return this.f95433c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo116754d() {
        return this.f95434d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo116756e() {
        return this.f95435e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCards)) {
            return false;
        }
        UserCards userCards = (UserCards) obj;
        return Intrinsics.areEqual((Object) this.f95431a, (Object) userCards.f95431a) && Intrinsics.areEqual((Object) this.f95432b, (Object) userCards.f95432b) && this.f95433c == userCards.f95433c && Intrinsics.areEqual((Object) this.f95434d, (Object) userCards.f95434d) && this.f95435e == userCards.f95435e;
    }

    @C12579k
    /* renamed from: f */
    public final UserCards mo116758f(@C12579k String str, @C12579k String str2, boolean z, @C12579k String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "num");
        Intrinsics.checkNotNullParameter(str2, "date");
        Intrinsics.checkNotNullParameter(str3, "category");
        return new UserCards(str, str2, z, str3, i);
    }

    @C12579k
    /* renamed from: h */
    public final String mo116759h() {
        return this.f95434d;
    }

    public int hashCode() {
        int hashCode = ((this.f95431a.hashCode() * 31) + this.f95432b.hashCode()) * 31;
        boolean z = this.f95433c;
        if (z) {
            z = true;
        }
        return ((((hashCode + (z ? 1 : 0)) * 31) + this.f95434d.hashCode()) * 31) + Integer.hashCode(this.f95435e);
    }

    @C12579k
    /* renamed from: i */
    public final String mo116761i() {
        return this.f95432b;
    }

    /* renamed from: j */
    public final int mo116762j() {
        return this.f95435e;
    }

    @C12579k
    /* renamed from: k */
    public final String mo116763k() {
        return this.f95431a;
    }

    /* renamed from: l */
    public final boolean mo116764l() {
        return this.f95433c;
    }

    @C12579k
    public String toString() {
        String str = this.f95431a;
        String str2 = this.f95432b;
        boolean z = this.f95433c;
        String str3 = this.f95434d;
        int i = this.f95435e;
        return "UserCards(num=" + str + ", date=" + str2 + ", isSecured=" + z + ", category=" + str3 + ", key=" + i + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95431a);
        parcel.writeString(this.f95432b);
        parcel.writeInt(this.f95433c ? 1 : 0);
        parcel.writeString(this.f95434d);
        parcel.writeInt(this.f95435e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserCards(String str, String str2, boolean z, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new String() : str, (i2 & 2) != 0 ? new String() : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new String() : str3, i);
    }
}
