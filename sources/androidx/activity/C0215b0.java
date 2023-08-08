package androidx.activity;

import android.view.View;
import kotlinx.coroutines.channels.C11760r;

/* renamed from: androidx.activity.b0 */
public final /* synthetic */ class C0215b0 implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C11760r f698a;

    public /* synthetic */ C0215b0(C11760r rVar) {
        this.f698a = rVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1.m1260k(this.f698a, view, i, i2, i3, i4, i5, i6, i7, i8);
    }
}
