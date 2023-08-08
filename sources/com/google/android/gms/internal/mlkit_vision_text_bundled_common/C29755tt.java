package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.tt */
public final class C29755tt implements Parcelable.Creator<zbry> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        String str = null;
        Rect rect = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList<zbrw> arrayList2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                str = SafeParcelReader.m166023G(parcel, X);
            } else if (O == 2) {
                rect = (Rect) SafeParcelReader.m166019C(parcel, X, Rect.CREATOR);
            } else if (O == 3) {
                arrayList = SafeParcelReader.m166028L(parcel, X, Point.CREATOR);
            } else if (O == 4) {
                str2 = SafeParcelReader.m166023G(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                arrayList2 = SafeParcelReader.m166028L(parcel, X, zbrw.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zbry(str, rect, arrayList, str2, arrayList2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zbry[i];
    }
}
