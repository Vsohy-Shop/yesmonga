package com.carrefour.fid.android.shared.extension;

import android.view.View;
import android.webkit.WebView;
import com.carrefour.fid.android.shared.util.C28937k;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.extension.u0 */
public final class C28785u0 {
    /* renamed from: b */
    public static final void m119114b(@C12579k WebView webView, @C12579k String str) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(str, "data");
        webView.loadDataWithBaseURL((String) null, str, C28937k.f70947d, "UTF-8", (String) null);
    }

    /* renamed from: c */
    public static final void m119115c(@C12579k WebView webView, @C12579k String str) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(str, "url");
        webView.loadUrl(str, C10977s0.m41456W(C11078d1.m42659a("Content-Type", C28937k.f70947d), C11078d1.m42659a("charset", "UTF-8")));
    }

    /* renamed from: d */
    public static final void m119116d(@C12579k WebView webView, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "onScrollToEnd");
        webView.setOnScrollChangeListener(new C28783t0(webView, aVar));
    }

    /* renamed from: e */
    public static final void m119117e(WebView webView, C11289a aVar, View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(webView, "$this_onScrollToEnd");
        Intrinsics.checkNotNullParameter(aVar, "$onScrollToEnd");
        if (i2 > i4 && i2 + webView.getMeasuredHeight() >= ((int) Math.floor((double) (((float) webView.getContentHeight()) * webView.getScaleY())))) {
            aVar.invoke();
        }
    }
}
