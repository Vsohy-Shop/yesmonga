package com.urbanairship.iam.view;

import android.graphics.Outline;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

/* renamed from: com.urbanairship.iam.view.d */
public class C9252d {

    /* renamed from: com.urbanairship.iam.view.d$a */
    public class C9253a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ float f25219a;

        public C9253a(float f) {
            this.f25219a = f;
        }

        @C0376v0(api = 21)
        public void getOutline(@C0359n0 View view, @C0359n0 Outline outline) {
            outline.setRoundRect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop(), this.f25219a);
        }
    }

    @C0353k0
    @C0376v0(api = 19)
    /* renamed from: a */
    public void mo18608a(@C0359n0 View view, float f) {
        float applyDimension = TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
        if (applyDimension == 0.0f) {
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            return;
        }
        view.setClipToOutline(true);
        view.setOutlineProvider(new C9253a(applyDimension));
    }
}
