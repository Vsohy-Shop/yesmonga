package androidx.activity;

import android.window.OnBackInvokedCallback;
import androidx.activity.OnBackPressedDispatcher;
import kotlin.jvm.functions.C11289a;

/* renamed from: androidx.activity.y */
public final /* synthetic */ class C0314y implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ C11289a f829a;

    public /* synthetic */ C0314y(C11289a aVar) {
        this.f829a = aVar;
    }

    public final void onBackInvoked() {
        OnBackPressedDispatcher.C0203a.m1250c(this.f829a);
    }
}
