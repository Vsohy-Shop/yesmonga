package com.carrefour.fid.android.shared.extension;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.preference.C19965r;
import com.carrefour.fid.android.shared.constant.C28539g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.extension.g */
public final class C28755g {
    /* renamed from: a */
    public static final void m119047a(@C12579k Activity activity, int i, int i2, int i3, @C12579k Intent intent) {
        Integer num;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intentData");
        Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            num = Integer.valueOf(intent2.getIntExtra(C28539g.f69243a, 0));
        } else {
            num = null;
        }
        intent.putExtra(C28539g.f69243a, num);
        activity.setResult(i, intent);
        activity.finish();
        if (i3 != 0 && i2 != 0 && Build.VERSION.SDK_INT > 26) {
            activity.overridePendingTransition(i2, i3);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m119048b(Activity activity, int i, int i2, int i3, Intent intent, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            intent = activity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, C19965r.f51092g);
        }
        m119047a(activity, i, i2, i3, intent);
    }
}
