package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.core.view.f6 */
public final /* synthetic */ class C18176f6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f46786a;

    public /* synthetic */ C18176f6(View view) {
        this.f46786a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f46786a.getContext().getSystemService("input_method")).showSoftInput(this.f46786a, 0);
    }
}
