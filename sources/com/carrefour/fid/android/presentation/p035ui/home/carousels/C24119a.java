package com.carrefour.fid.android.presentation.p035ui.home.carousels;

import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.a */
public final class C24119a implements ViewPager2.C20823m {

    /* renamed from: a */
    public static final int f60338a = 0;

    /* renamed from: a */
    public void mo62526a(@C12579k View view, float f) {
        float f2;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        int width = view.getWidth();
        int height = view.getHeight();
        if (f < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f <= 1.0f) {
            float f3 = (float) 1;
            float t = C11479u.m44444t(0.85f, f3 - Math.abs(f));
            float f4 = f3 - t;
            float f5 = (float) 2;
            float f6 = (((float) height) * f4) / f5;
            float f7 = (((float) width) * f4) / f5;
            if (f < 0.0f) {
                f2 = f7 - (f6 / f5);
            } else {
                f2 = f7 + (f6 / f5);
            }
            view.setTranslationX(f2);
            view.setScaleX(t);
            view.setScaleY(t);
            view.setAlpha((((t - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
