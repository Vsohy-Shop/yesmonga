package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.C40974d0;

@C40473a
@C40858y
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @C40473a
    @C0359n0
    /* renamed from: V */
    public byte[] mo134711V() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public final int describeContents() {
        return 0;
    }

    @C0363p0
    @C40974d0
    /* renamed from: e */
    public Object mo134660e(@C0359n0 String str) {
        return null;
    }

    @C40473a
    public boolean equals(@C0363p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : mo134658c().values()) {
            if (mo134661f(next)) {
                if (!fastJsonResponse.mo134661f(next) || !C40808s.m166010b(mo134659d(next), fastJsonResponse.mo134659d(next))) {
                    return false;
                }
            } else if (fastJsonResponse.mo134661f(next)) {
                return false;
            }
        }
        return true;
    }

    @C40974d0
    /* renamed from: g */
    public boolean mo134662g(@C0359n0 String str) {
        return false;
    }

    @C40473a
    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field next : mo134658c().values()) {
            if (mo134661f(next)) {
                i = (i * 31) + C40843u.m166202l(mo134659d(next)).hashCode();
            }
        }
        return i;
    }
}
