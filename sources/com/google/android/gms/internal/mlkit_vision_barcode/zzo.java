package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "UrlBookmarkCreator")
@SafeParcelable.C40818g({1})
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C38559c();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public String f98777a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98778b;

    public zzo() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f98777a, false);
        C40820a.m166108Y(parcel, 3, this.f98778b, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzo(@SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) String str2) {
        this.f98777a = str;
        this.f98778b = str2;
    }
}
