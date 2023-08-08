package com.usabilla.sdk.ubform.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.appcompat.widget.C0696c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.usabilla.sdk.ubform.utils.h */
public final class C10141h {
    /* renamed from: a */
    public static final /* synthetic */ Bitmap m38375a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        View rootView = activity.getWindow().getDecorView().getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "activity.window.decorView.rootView");
        return m38376b(rootView);
    }

    /* renamed from: b */
    public static final /* synthetic */ Bitmap m38376b(View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return Bitmap.createScaledBitmap(createBitmap, view.getWidth() / 2, view.getHeight() / 2, true);
    }
}
