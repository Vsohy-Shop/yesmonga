package com.carrefour.fid.android.shared.util;

import android.os.Build;
import android.os.Bundle;
import androidx.exifinterface.media.C19135a;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.carrefour.fid.android.shared.util.o */
public final class C28945o {
    /* renamed from: a */
    public static final /* synthetic */ <T extends Serializable> T m119741a(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
            return bundle.getSerializable(str, Serializable.class);
        }
        T serializable = bundle.getSerializable(str);
        Intrinsics.reifiedOperationMarker(1, "T?");
        return serializable;
    }
}
