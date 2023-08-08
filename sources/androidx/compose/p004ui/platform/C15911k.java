package androidx.compose.p004ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.k */
public final /* synthetic */ class C15911k implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidComposeView f39608a;

    public /* synthetic */ C15911k(AndroidComposeView androidComposeView) {
        this.f39608a = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z) {
        AndroidComposeView.m70702G0(this.f39608a, z);
    }
}
