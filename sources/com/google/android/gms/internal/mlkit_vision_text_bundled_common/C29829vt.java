package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.vt */
public final class C29829vt implements Parcelable.Creator<zbsa> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        ArrayList<zbru> arrayList = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                str = SafeParcelReader.m166023G(parcel, X);
            } else if (O != 2) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                arrayList = SafeParcelReader.m166028L(parcel, X, zbru.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zbsa(str, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zbsa[i];
    }
}
