package com.urbanairship.android.layout.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.exifinterface.media.C19135a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.urbanairship.android.layout.util.a */
public final class C35906a {
    /* renamed from: a */
    public static final /* synthetic */ <T> T m148051a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intent intent = activity.getIntent();
            Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
            return intent.getParcelableExtra(str, Object.class);
        }
        T parcelableExtra = activity.getIntent().getParcelableExtra(str);
        Intrinsics.reifiedOperationMarker(2, C19135a.f48928d5);
        return parcelableExtra;
    }
}
