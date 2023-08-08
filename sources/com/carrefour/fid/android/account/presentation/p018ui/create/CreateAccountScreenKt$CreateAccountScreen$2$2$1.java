package com.carrefour.fid.android.account.presentation.p018ui.create;

import android.webkit.WebView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountScreen$2$2$1 */
public final class CreateAccountScreenKt$CreateAccountScreen$2$2$1 extends Lambda implements C11300l<WebView, C11079d2> {
    final /* synthetic */ String $createAccountUrl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAccountScreenKt$CreateAccountScreen$2$2$1(String str) {
        super(1);
        this.$createAccountUrl = str;
    }

    /* renamed from: a */
    public final void mo32045a(@C12579k WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "it");
        webView.loadUrl(this.$createAccountUrl);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo32045a((WebView) obj);
        return C11079d2.f28267a;
    }
}
