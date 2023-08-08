package com.carrefour.fid.android.account.presentation.p018ui.create;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.carrefour.fid.android.account.presentation.p018ui.create.C13488a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountScreen$2$1$1 */
public final class CreateAccountScreenKt$CreateAccountScreen$2$1$1 extends Lambda implements C11300l<Context, WebView> {
    final /* synthetic */ C11300l<C13488a, C11079d2> $actioner;
    final /* synthetic */ String $createAccountUrl;
    final /* synthetic */ String $signInUrl;
    final /* synthetic */ String $userAgent;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountScreen$2$1$1$a */
    public static final class C13487a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ String f32959a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<C13488a, C11079d2> f32960b;

        public C13487a(String str, C11300l<? super C13488a, C11079d2> lVar) {
            this.f32959a = str;
            this.f32960b = lVar;
        }

        public boolean shouldOverrideUrlLoading(@C12580l WebView webView, @C12580l WebResourceRequest webResourceRequest) {
            Uri url;
            String uri;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (uri = url.toString()) == null) {
                return false;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) uri, (CharSequence) this.f32959a, false, 2, (Object) null)) {
                this.f32960b.invoke(C13488a.C13491c.f32968a);
            } else {
                this.f32960b.invoke(new C13488a.C13490b(uri));
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAccountScreenKt$CreateAccountScreen$2$1$1(String str, String str2, String str3, C11300l<? super C13488a, C11079d2> lVar) {
        super(1);
        this.$userAgent = str;
        this.$createAccountUrl = str2;
        this.$signInUrl = str3;
        this.$actioner = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final WebView invoke(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "it");
        WebView webView = new WebView(context);
        String str = this.$userAgent;
        String str2 = this.$createAccountUrl;
        String str3 = this.$signInUrl;
        C11300l<C13488a, C11079d2> lVar = this.$actioner;
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(new C13487a(str3, lVar));
        webView.getSettings().setUserAgentString(str);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl(str2);
        return webView;
    }
}
