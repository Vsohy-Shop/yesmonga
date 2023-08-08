package com.usabilla.sdk.ubform;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.C19965r;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/PlayStoreInfo;", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "a", "", "b", "intent", "isAvailable", "c", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Landroid/content/Intent;", "e", "()Landroid/content/Intent;", "Z", "f", "()Z", "<init>", "(Landroid/content/Intent;Z)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class PlayStoreInfo implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<PlayStoreInfo> CREATOR = new C9718a();
    @C12579k

    /* renamed from: a */
    public final Intent f26651a;

    /* renamed from: b */
    public final boolean f26652b;

    /* renamed from: com.usabilla.sdk.ubform.PlayStoreInfo$a */
    public static final class C9718a implements Parcelable.Creator<PlayStoreInfo> {
        @C12579k
        /* renamed from: a */
        public final PlayStoreInfo createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlayStoreInfo((Intent) parcel.readParcelable(PlayStoreInfo.class.getClassLoader()), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final PlayStoreInfo[] newArray(int i) {
            return new PlayStoreInfo[i];
        }
    }

    public PlayStoreInfo(@C12579k Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        this.f26651a = intent;
        this.f26652b = z;
    }

    /* renamed from: d */
    public static /* synthetic */ PlayStoreInfo m36409d(PlayStoreInfo playStoreInfo, Intent intent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            intent = playStoreInfo.f26651a;
        }
        if ((i & 2) != 0) {
            z = playStoreInfo.f26652b;
        }
        return playStoreInfo.mo19793c(intent, z);
    }

    @C12579k
    /* renamed from: a */
    public final Intent mo19791a() {
        return this.f26651a;
    }

    /* renamed from: b */
    public final boolean mo19792b() {
        return this.f26652b;
    }

    @C12579k
    /* renamed from: c */
    public final PlayStoreInfo mo19793c(@C12579k Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        return new PlayStoreInfo(intent, z);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final Intent mo19795e() {
        return this.f26651a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayStoreInfo)) {
            return false;
        }
        PlayStoreInfo playStoreInfo = (PlayStoreInfo) obj;
        return Intrinsics.areEqual((Object) this.f26651a, (Object) playStoreInfo.f26651a) && this.f26652b == playStoreInfo.f26652b;
    }

    /* renamed from: f */
    public final boolean mo19797f() {
        return this.f26652b;
    }

    public int hashCode() {
        int hashCode = this.f26651a.hashCode() * 31;
        boolean z = this.f26652b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        return "PlayStoreInfo(intent=" + this.f26651a + ", isAvailable=" + this.f26652b + ')';
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.f26651a, i);
        parcel.writeInt(this.f26652b ? 1 : 0);
    }
}
