package com.carrefour.fid.android.domain.models.account;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/account/CivilityTitle;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "(Ljava/lang/String;I)V", "a", "b", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public enum CivilityTitle implements Parcelable {
    MR,
    MRS;
    
    @C12579k
    public static final Parcelable.Creator<CivilityTitle> CREATOR = null;

    /* renamed from: com.carrefour.fid.android.domain.models.account.CivilityTitle$a */
    public static final class C37944a implements Parcelable.Creator<CivilityTitle> {
        @C12579k
        /* renamed from: a */
        public final CivilityTitle createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CivilityTitle.valueOf(parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CivilityTitle[] newArray(int i) {
            return new CivilityTitle[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C37944a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(name());
    }
}
