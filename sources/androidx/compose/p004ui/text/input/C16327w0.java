package androidx.compose.p004ui.text.input;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* renamed from: androidx.compose.ui.text.input.w0 */
public final /* synthetic */ class C16327w0 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Choreographer f40550a;

    public /* synthetic */ C16327w0(Choreographer choreographer) {
        this.f40550a = choreographer;
    }

    public final void execute(Runnable runnable) {
        C16329x0.m73568e(this.f40550a, runnable);
    }
}
