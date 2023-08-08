package androidx.compose.p004ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.j */
public final /* synthetic */ class C15904j implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidComposeView f39602a;

    public /* synthetic */ C15904j(AndroidComposeView androidComposeView) {
        this.f39602a = androidComposeView;
    }

    public final void onScrollChanged() {
        AndroidComposeView.m70699B0(this.f39602a);
    }
}
