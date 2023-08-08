package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.y1 */
public final class C30402y1 implements Parcelable.Creator<ActivityRecognitionResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        ArrayList<DetectedActivity> arrayList = null;
        Bundle bundle = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                arrayList = SafeParcelReader.m166028L(parcel, X, DetectedActivity.CREATOR);
            } else if (O == 2) {
                j = SafeParcelReader.m166048c0(parcel, X);
            } else if (O == 3) {
                j2 = SafeParcelReader.m166048c0(parcel, X);
            } else if (O == 4) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                bundle = SafeParcelReader.m166055g(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
