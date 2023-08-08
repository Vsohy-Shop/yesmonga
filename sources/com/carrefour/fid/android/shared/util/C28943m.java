package com.carrefour.fid.android.shared.util;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.exifinterface.media.C19135a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.carrefour.fid.android.shared.util.m */
public final class C28943m {
    /* renamed from: a */
    public static final /* synthetic */ <T extends Parcelable> T m119737a(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
            return (Parcelable) bundle.getParcelable(str, Parcelable.class);
        }
        T parcelable = bundle.getParcelable(str);
        Intrinsics.reifiedOperationMarker(1, "T?");
        return parcelable;
    }
}
