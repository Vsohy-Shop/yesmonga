package com.contentsquare.android.sdk;

import android.view.View;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: com.contentsquare.android.sdk.p6 */
public class C14611p6 implements C14260cg {
    /* renamed from: b */
    public static boolean m62927b(View view) {
        return (view instanceof SwipeRefreshLayout) || "SwipeToRefreshLayout".equals(view.getClass().getSimpleName());
    }

    /* renamed from: a */
    public boolean mo34888a(View view, View view2) {
        return (view instanceof ImageView) && m62927b(view2);
    }
}
