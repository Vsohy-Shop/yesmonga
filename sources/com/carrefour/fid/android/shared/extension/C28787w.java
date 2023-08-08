package com.carrefour.fid.android.shared.extension;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.functions.C11300l;

/* renamed from: com.carrefour.fid.android.shared.extension.w */
public final /* synthetic */ class C28787w implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ int f70452a;

    /* renamed from: b */
    public final /* synthetic */ C11300l f70453b;

    public /* synthetic */ C28787w(int i, C11300l lVar) {
        this.f70452a = i;
        this.f70453b = lVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return EditTextKt.m118797g(this.f70452a, this.f70453b, textView, i, keyEvent);
    }
}
