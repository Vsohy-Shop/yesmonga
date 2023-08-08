package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.d2 */
public final class C30326d2 implements Parcelable.Creator<ActivityTransitionResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        ArrayList<ActivityTransitionEvent> arrayList = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                arrayList = SafeParcelReader.m166028L(parcel, X, ActivityTransitionEvent.CREATOR);
            } else if (O != 2) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                bundle = SafeParcelReader.m166055g(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new ActivityTransitionResult(arrayList, bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
