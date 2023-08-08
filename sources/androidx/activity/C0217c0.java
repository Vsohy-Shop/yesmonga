package androidx.activity;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlinx.coroutines.channels.C11760r;

/* renamed from: androidx.activity.c0 */
public final /* synthetic */ class C0217c0 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public final /* synthetic */ C11760r f699a;

    /* renamed from: b */
    public final /* synthetic */ View f700b;

    public /* synthetic */ C0217c0(C11760r rVar, View view) {
        this.f699a = rVar;
        this.f700b = view;
    }

    public final void onScrollChanged() {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1.m1261l(this.f699a, this.f700b);
    }
}
