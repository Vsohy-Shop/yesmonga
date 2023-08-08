package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;

/* renamed from: com.contentsquare.android.sdk.m5 */
public final class C14520m5 {

    /* renamed from: a */
    public static final List<String> f35921a = CollectionsKt__CollectionsKt.m40448L("contentsquare.net", "csqtrk.net");

    /* renamed from: a */
    public static final void m62603a(Bitmap bitmap, Bitmap bitmap2, float f, float f2) {
        Intrinsics.checkNotNullParameter(bitmap, "$this$drawOnTop");
        Intrinsics.checkNotNullParameter(bitmap2, "bmp");
        new Canvas(bitmap).drawBitmap(bitmap2, f, f2, (Paint) null);
    }

    /* renamed from: b */
    public static final boolean m62604b(URI uri) {
        boolean z;
        Intrinsics.checkNotNullParameter(uri, "$this$isContentsquareUrl");
        List<String> list = f35921a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            String host = uri.getHost();
            if (host == null || !C11622t.endsWith$default(host, str, false, 2, (Object) null)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
