package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "UrlBookmarkParcelCreator")
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new C38923g0();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getTitle", mo134489id = 1)

    /* renamed from: a */
    public final String f99051a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getUrl", mo134489id = 2)

    /* renamed from: b */
    public final String f99052b;

    @SafeParcelable.C40813b
    public zzay(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str2) {
        this.f99051a = str;
        this.f99052b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f99051a, false);
        C40820a.m166108Y(parcel, 2, this.f99052b, false);
        C40820a.m166112b(parcel, a);
    }
}
