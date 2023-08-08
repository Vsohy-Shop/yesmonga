package androidx.compose.p004ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.i */
public final /* synthetic */ class C15897i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidComposeView f39601a;

    public /* synthetic */ C15897i(AndroidComposeView androidComposeView) {
        this.f39601a = androidComposeView;
    }

    public final void onGlobalLayout() {
        AndroidComposeView.m70718i0(this.f39601a);
    }
}
