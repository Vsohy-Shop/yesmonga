package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.installations.C33124s;

@C40473a
@SafeParcelable.C40812a(creator = "ClientIdentityCreator")
@SafeParcelable.C40818g({1000})
public class ClientIdentity extends AbstractSafeParcelable {
    @C40473a
    @C0359n0
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C40753e0();
    @C40473a
    @SafeParcelable.C40814c(defaultValueUnchecked = "0", mo134489id = 1)

    /* renamed from: a */
    public final int f103739a;
    @C0363p0
    @C40473a
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", mo134489id = 2)

    /* renamed from: b */
    public final String f103740b;

    @SafeParcelable.C40813b
    public ClientIdentity(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str) {
        this.f103739a = i;
        this.f103740b = str;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.f103739a != this.f103739a || !C40808s.m166010b(clientIdentity.f103740b, this.f103740b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f103739a;
    }

    @C0359n0
    public final String toString() {
        int i = this.f103739a;
        String str = this.f103740b;
        return i + C33124s.f80355c + str;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103739a);
        C40820a.m166108Y(parcel, 2, this.f103740b, false);
        C40820a.m166112b(parcel, a);
    }
}
