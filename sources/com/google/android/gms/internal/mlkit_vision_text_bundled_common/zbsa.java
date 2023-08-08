package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "TextParcelCreator")
public final class zbsa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbsa> CREATOR = new C29829vt();
    @SafeParcelable.C40814c(getter = "getText", mo134489id = 1)

    /* renamed from: a */
    public final String f71624a;
    @SafeParcelable.C40814c(getter = "getTextBlockList", mo134489id = 2)

    /* renamed from: b */
    public final List<zbru> f71625b;

    @SafeParcelable.C40813b
    public zbsa(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 2) List<zbru> list) {
        this.f71624a = str;
        this.f71625b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f71624a, false);
        C40820a.m166117d0(parcel, 2, this.f71625b, false);
        C40820a.m166112b(parcel, a);
    }
}
