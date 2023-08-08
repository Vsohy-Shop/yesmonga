package com.contentsquare.android.sdk;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.p004ui.graphics.C15332v1;
import androidx.compose.p004ui.graphics.C15402w1;

/* renamed from: com.contentsquare.android.sdk.y1 */
public class C14879y1 {
    /* renamed from: a */
    public static void m64113a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C15402w1.m67267a();
            drawable.setColorFilter(C15332v1.m66723a(i, BlendMode.SRC_IN));
            return;
        }
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
