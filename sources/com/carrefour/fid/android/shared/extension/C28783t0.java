package com.carrefour.fid.android.shared.extension;

import android.view.View;
import android.webkit.WebView;
import kotlin.jvm.functions.C11289a;

/* renamed from: com.carrefour.fid.android.shared.extension.t0 */
public final /* synthetic */ class C28783t0 implements View.OnScrollChangeListener {

    /* renamed from: a */
    public final /* synthetic */ WebView f70448a;

    /* renamed from: b */
    public final /* synthetic */ C11289a f70449b;

    public /* synthetic */ C28783t0(WebView webView, C11289a aVar) {
        this.f70448a = webView;
        this.f70449b = aVar;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        C28785u0.m119117e(this.f70448a, this.f70449b, view, i, i2, i3, i4);
    }
}
