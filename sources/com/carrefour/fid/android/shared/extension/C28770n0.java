package com.carrefour.fid.android.shared.extension;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.C12074o0;

/* renamed from: com.carrefour.fid.android.shared.extension.n0 */
public final /* synthetic */ class C28770n0 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C12074o0 f70431a;

    /* renamed from: b */
    public final /* synthetic */ C11300l f70432b;

    /* renamed from: c */
    public final /* synthetic */ C11300l f70433c;

    public /* synthetic */ C28770n0(C12074o0 o0Var, C11300l lVar, C11300l lVar2) {
        this.f70431a = o0Var;
        this.f70432b = lVar;
        this.f70433c = lVar2;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return TextViewKt.m118958i(this.f70431a, this.f70432b, this.f70433c, textView, i, keyEvent);
    }
}
