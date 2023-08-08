package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.material.color.u */
public final class C31268u {
    /* renamed from: a */
    public static void m125972a(@C0359n0 Context context, @C0327c1 int i) {
        Resources.Theme b;
        context.getTheme().applyStyle(i, true);
        if ((context instanceof Activity) && (b = m125973b((Activity) context)) != null) {
            b.applyStyle(i, true);
        }
    }

    @C0363p0
    /* renamed from: b */
    public static Resources.Theme m125973b(@C0359n0 Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
