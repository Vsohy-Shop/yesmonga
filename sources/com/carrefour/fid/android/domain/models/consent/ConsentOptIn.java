package com.carrefour.fid.android.domain.models.consent;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/consent/ConsentName;", "a", "Lcom/carrefour/fid/android/domain/models/consent/ChoiceOptIn;", "b", "", "c", "name", "choice", "hasBeenUpdated", "d", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/consent/ConsentName;", "h", "()Lcom/carrefour/fid/android/domain/models/consent/ConsentName;", "Lcom/carrefour/fid/android/domain/models/consent/ChoiceOptIn;", "f", "()Lcom/carrefour/fid/android/domain/models/consent/ChoiceOptIn;", "Z", "g", "()Z", "<init>", "(Lcom/carrefour/fid/android/domain/models/consent/ConsentName;Lcom/carrefour/fid/android/domain/models/consent/ChoiceOptIn;Z)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class ConsentOptIn implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<ConsentOptIn> CREATOR = new C37996a();
    @C12579k

    /* renamed from: a */
    public final ConsentName f95642a;
    @C12579k

    /* renamed from: b */
    public final ChoiceOptIn f95643b;

    /* renamed from: c */
    public final boolean f95644c;

    /* renamed from: com.carrefour.fid.android.domain.models.consent.ConsentOptIn$a */
    public static final class C37996a implements Parcelable.Creator<ConsentOptIn> {
        @C12579k
        /* renamed from: a */
        public final ConsentOptIn createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentOptIn(ConsentName.valueOf(parcel.readString()), ChoiceOptIn.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final ConsentOptIn[] newArray(int i) {
            return new ConsentOptIn[i];
        }
    }

    public ConsentOptIn(@C12579k ConsentName consentName, @C12579k ChoiceOptIn choiceOptIn, boolean z) {
        Intrinsics.checkNotNullParameter(consentName, "name");
        Intrinsics.checkNotNullParameter(choiceOptIn, "choice");
        this.f95642a = consentName;
        this.f95643b = choiceOptIn;
        this.f95644c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ ConsentOptIn m156405e(ConsentOptIn consentOptIn, ConsentName consentName, ChoiceOptIn choiceOptIn, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            consentName = consentOptIn.f95642a;
        }
        if ((i & 2) != 0) {
            choiceOptIn = consentOptIn.f95643b;
        }
        if ((i & 4) != 0) {
            z = consentOptIn.f95644c;
        }
        return consentOptIn.mo117321d(consentName, choiceOptIn, z);
    }

    @C12579k
    /* renamed from: a */
    public final ConsentName mo117318a() {
        return this.f95642a;
    }

    @C12579k
    /* renamed from: b */
    public final ChoiceOptIn mo117319b() {
        return this.f95643b;
    }

    /* renamed from: c */
    public final boolean mo117320c() {
        return this.f95644c;
    }

    @C12579k
    /* renamed from: d */
    public final ConsentOptIn mo117321d(@C12579k ConsentName consentName, @C12579k ChoiceOptIn choiceOptIn, boolean z) {
        Intrinsics.checkNotNullParameter(consentName, "name");
        Intrinsics.checkNotNullParameter(choiceOptIn, "choice");
        return new ConsentOptIn(consentName, choiceOptIn, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentOptIn)) {
            return false;
        }
        ConsentOptIn consentOptIn = (ConsentOptIn) obj;
        return this.f95642a == consentOptIn.f95642a && this.f95643b == consentOptIn.f95643b && this.f95644c == consentOptIn.f95644c;
    }

    @C12579k
    /* renamed from: f */
    public final ChoiceOptIn mo117324f() {
        return this.f95643b;
    }

    /* renamed from: g */
    public final boolean mo117325g() {
        return this.f95644c;
    }

    @C12579k
    /* renamed from: h */
    public final ConsentName mo117326h() {
        return this.f95642a;
    }

    public int hashCode() {
        int hashCode = ((this.f95642a.hashCode() * 31) + this.f95643b.hashCode()) * 31;
        boolean z = this.f95644c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        ConsentName consentName = this.f95642a;
        ChoiceOptIn choiceOptIn = this.f95643b;
        boolean z = this.f95644c;
        return "ConsentOptIn(name=" + consentName + ", choice=" + choiceOptIn + ", hasBeenUpdated=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95642a.name());
        parcel.writeString(this.f95643b.name());
        parcel.writeInt(this.f95644c ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConsentOptIn(ConsentName consentName, ChoiceOptIn choiceOptIn, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(consentName, (i & 2) != 0 ? ChoiceOptIn.REFUSED : choiceOptIn, (i & 4) != 0 ? false : z);
    }
}
