package androidx.compose.p004ui.platform;

import androidx.lifecycle.Lifecycle;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt */
public final class ViewCompositionStrategy_androidKt {
    /* renamed from: b */
    public static final C11289a<C11079d2> m71101b(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        boolean z;
        if (lifecycle.mo57465b().compareTo(Lifecycle.State.DESTROYED) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ViewCompositionStrategy_androidKt$installForLifecycle$observer$1 viewCompositionStrategy_androidKt$installForLifecycle$observer$1 = new ViewCompositionStrategy_androidKt$installForLifecycle$observer$1(abstractComposeView);
            lifecycle.mo57464a(viewCompositionStrategy_androidKt$installForLifecycle$observer$1);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, viewCompositionStrategy_androidKt$installForLifecycle$observer$1);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
