package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

/* renamed from: androidx.appcompat.widget.l1 */
public final /* synthetic */ class C0743l1 implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f2435a;

    public /* synthetic */ C0743l1(Runnable runnable) {
        this.f2435a = runnable;
    }

    public final void onBackInvoked() {
        this.f2435a.run();
    }
}
