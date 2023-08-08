package androidx.core.view;

import android.view.WindowInsetsController;
import androidx.core.view.C18184g6;

/* renamed from: androidx.core.view.r6 */
public final /* synthetic */ class C18360r6 implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a */
    public final /* synthetic */ C18184g6.C18188d f47052a;

    /* renamed from: b */
    public final /* synthetic */ C18184g6.C18191f f47053b;

    public /* synthetic */ C18360r6(C18184g6.C18188d dVar, C18184g6.C18191f fVar) {
        this.f47052a = dVar;
        this.f47053b = fVar;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        this.f47052a.m82436m(this.f47053b, windowInsetsController, i);
    }
}
