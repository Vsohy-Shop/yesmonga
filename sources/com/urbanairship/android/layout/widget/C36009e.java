package com.urbanairship.android.layout.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0366r;

/* renamed from: com.urbanairship.android.layout.widget.e */
public class C36009e {

    /* renamed from: com.urbanairship.android.layout.widget.e$a */
    public class C36010a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ float f88993a;

        public C36010a(float f) {
            this.f88993a = f;
        }

        public void getOutline(@C0359n0 View view, @C0359n0 Outline outline) {
            outline.setRoundRect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop(), this.f88993a);
        }
    }

    @C0353k0
    /* renamed from: a */
    public void mo107705a(@C0359n0 View view, @C0366r float f) {
        if (f == 0.0f) {
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            return;
        }
        view.setClipToOutline(true);
        view.setOutlineProvider(new C36010a(f));
    }
}
