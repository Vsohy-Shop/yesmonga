package com.carrefour.fid.android.shared.extension;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.functions.C11289a;

/* renamed from: com.carrefour.fid.android.shared.extension.u */
public final /* synthetic */ class C28784u implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C11289a f70450a;

    public /* synthetic */ C28784u(C11289a aVar) {
        this.f70450a = aVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return EditTextKt.m118800j(this.f70450a, textView, i, keyEvent);
    }
}
