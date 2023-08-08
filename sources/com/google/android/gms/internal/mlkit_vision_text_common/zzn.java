package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "SymbolBoxParcelCreator")
@SafeParcelable.C40818g({1})
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C30200ra();

    public final void writeToParcel(Parcel parcel, int i) {
        C40820a.m166112b(parcel, C40820a.m166110a(parcel));
    }
}
