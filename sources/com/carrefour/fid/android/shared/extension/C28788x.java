package com.carrefour.fid.android.shared.extension;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.functions.C11289a;

/* renamed from: com.carrefour.fid.android.shared.extension.x */
public final /* synthetic */ class C28788x implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C11289a f70454a;

    public /* synthetic */ C28788x(C11289a aVar) {
        this.f70454a = aVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return EditTextKt.m118802l(this.f70454a, textView, i, keyEvent);
    }
}
