package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "TextParcelCreator")
public final class zzmc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmc> CREATOR = new C30188qa();
    @SafeParcelable.C40814c(getter = "getText", mo134489id = 1)

    /* renamed from: a */
    public final String f72651a;
    @SafeParcelable.C40814c(getter = "getTextBlockList", mo134489id = 2)

    /* renamed from: b */
    public final List<zzlw> f72652b;

    @SafeParcelable.C40813b
    public zzmc(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 2) List<zzlw> list) {
        this.f72651a = str;
        this.f72652b = list;
    }

    /* renamed from: M */
    public final String mo85507M() {
        return this.f72651a;
    }

    /* renamed from: Q */
    public final List<zzlw> mo85508Q() {
        return this.f72652b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f72651a, false);
        C40820a.m166117d0(parcel, 2, this.f72652b, false);
        C40820a.m166112b(parcel, a);
    }
}
