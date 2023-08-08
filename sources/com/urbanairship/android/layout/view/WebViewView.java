package com.urbanairship.android.layout.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.C0696c;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.accengage.C35451b;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.WebViewModel;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.widget.C36026n;
import com.urbanairship.android.layout.widget.TouchAwareAirshipWebView;
import com.urbanairship.app.C36032d;
import com.urbanairship.app.C36038h;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.util.C9640b0;
import com.urbanairship.webkit.C9711g;
import java.lang.ref.WeakReference;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0010B\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/WebViewView;", "Landroid/widget/FrameLayout;", "Lcom/urbanairship/android/layout/view/a;", "Lcom/urbanairship/android/layout/widget/n;", "Landroid/webkit/WebChromeClient;", "chromeClient", "Lkotlin/d2;", "setChromeClient", "Lkotlinx/coroutines/flow/e;", "e", "Lcom/urbanairship/android/layout/model/WebViewModel;", "model", "c", "a", "Lcom/urbanairship/android/layout/model/WebViewModel;", "Lcom/urbanairship/android/layout/environment/p;", "b", "Lcom/urbanairship/android/layout/environment/p;", "viewEnvironment", "com/urbanairship/android/layout/view/WebViewView$c", "Lcom/urbanairship/android/layout/view/WebViewView$c;", "activityListener", "Lcom/urbanairship/app/d;", "d", "Lcom/urbanairship/app/d;", "filteredActivityListener", "Lcom/urbanairship/android/layout/widget/TouchAwareAirshipWebView;", "Lcom/urbanairship/android/layout/widget/TouchAwareAirshipWebView;", "webView", "f", "Landroid/webkit/WebChromeClient;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/WebViewModel;Lcom/urbanairship/android/layout/environment/p;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class WebViewView extends FrameLayout implements C35977a, C36026n {
    @C12579k

    /* renamed from: a */
    public final WebViewModel f88911a;
    @C12579k

    /* renamed from: b */
    public final C35614p f88912b;
    @C12579k

    /* renamed from: c */
    public final C35971c f88913c;
    @C12579k

    /* renamed from: d */
    public final C36032d f88914d;
    @C12580l

    /* renamed from: e */
    public TouchAwareAirshipWebView f88915e;
    @C12580l

    /* renamed from: f */
    public WebChromeClient f88916f;

    /* renamed from: com.urbanairship.android.layout.view.WebViewView$a */
    public static final class C35968a implements BaseModel.C35725a {

        /* renamed from: a */
        public final /* synthetic */ WebViewView f88917a;

        public C35968a(WebViewView webViewView) {
            this.f88917a = webViewView;
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            WebViewView webViewView = this.f88917a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            webViewView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88917a.setEnabled(z);
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.WebViewView$b */
    public static abstract class C35969b implements C9711g.C9715d {
        @C12579k

        /* renamed from: c */
        public static final C35970a f88918c = new C35970a((DefaultConstructorMarker) null);

        /* renamed from: d */
        public static final long f88919d = 1000;

        /* renamed from: a */
        public boolean f88920a;

        /* renamed from: b */
        public long f88921b = 1000;

        /* renamed from: com.urbanairship.android.layout.view.WebViewView$b$a */
        public static final class C35970a {
            public /* synthetic */ C35970a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C35970a() {
            }
        }

        /* renamed from: f */
        public static final void m148220f(WeakReference weakReference, C35969b bVar) {
            Intrinsics.checkNotNullParameter(weakReference, "$webViewWeakReference");
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            WebView webView = (WebView) weakReference.get();
            if (webView != null) {
                bVar.mo107635g(webView);
            }
        }

        /* renamed from: b */
        public void mo19741b(@C12579k WebView webView, @C12580l String str) {
            Intrinsics.checkNotNullParameter(webView, C40383c.f102945c);
            if (this.f88920a) {
                webView.postDelayed(new C35989l(new WeakReference(webView), this), this.f88921b);
                this.f88921b *= (long) 2;
            } else {
                mo107634e(webView);
            }
            this.f88920a = false;
        }

        /* renamed from: c */
        public void mo19742c(@C12579k WebView webView, @C12579k WebResourceRequest webResourceRequest, @C12579k WebResourceError webResourceError) {
            Intrinsics.checkNotNullParameter(webView, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(webResourceRequest, "request");
            Intrinsics.checkNotNullParameter(webResourceError, "error");
            C36059m.m148409e("Error loading web view! %d - %s", Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription());
            this.f88920a = true;
        }

        /* renamed from: e */
        public abstract void mo107634e(@C12579k WebView webView);

        /* renamed from: g */
        public abstract void mo107635g(@C12579k WebView webView);
    }

    /* renamed from: com.urbanairship.android.layout.view.WebViewView$c */
    public static final class C35971c extends C36038h {

        /* renamed from: a */
        public final /* synthetic */ WebViewView f88922a;

        public C35971c(WebViewView webViewView) {
            this.f88922a = webViewView;
        }

        public void onActivityPaused(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            TouchAwareAirshipWebView b = this.f88922a.f88915e;
            if (b != null) {
                b.onPause();
            }
        }

        public void onActivityResumed(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            TouchAwareAirshipWebView b = this.f88922a.f88915e;
            if (b != null) {
                b.onResume();
            }
        }

        public void onActivityStopped(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            TouchAwareAirshipWebView b = this.f88922a.f88915e;
            if (b != null) {
                WebViewView webViewView = this.f88922a;
                Bundle bundle = new Bundle();
                b.saveState(bundle);
                webViewView.f88911a.mo107188P(bundle);
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.WebViewView$d */
    public static final class C35972d extends C35969b {

        /* renamed from: e */
        public final /* synthetic */ ProgressBar f88923e;

        /* renamed from: f */
        public final /* synthetic */ WebViewModel f88924f;

        public C35972d(ProgressBar progressBar, WebViewModel webViewModel) {
            this.f88923e = progressBar;
            this.f88924f = webViewModel;
        }

        /* renamed from: a */
        public boolean mo19740a(@C12579k WebView webView) {
            Intrinsics.checkNotNullParameter(webView, C35451b.f87342d);
            this.f88924f.mo107185M();
            return true;
        }

        /* renamed from: e */
        public void mo107634e(@C12579k WebView webView) {
            Intrinsics.checkNotNullParameter(webView, C35451b.f87342d);
            webView.setVisibility(0);
            this.f88923e.setVisibility(8);
        }

        /* renamed from: g */
        public void mo107635g(@C12579k WebView webView) {
            Intrinsics.checkNotNullParameter(webView, C35451b.f87342d);
            webView.loadUrl(this.f88924f.mo107184L());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewView(@C12579k Context context, @C12579k WebViewModel webViewModel, @C12579k C35614p pVar) {
        super(context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(webViewModel, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        this.f88911a = webViewModel;
        this.f88912b = pVar;
        C35971c cVar = new C35971c(this);
        this.f88913c = cVar;
        C36032d dVar = new C36032d(cVar, pVar.mo106642d());
        this.f88914d = dVar;
        pVar.mo106641c().mo18484e(dVar);
        WebChromeClient a = pVar.mo106639a().mo18511a();
        Intrinsics.checkNotNullExpressionValue(a, "viewEnvironment.webChromeClientFactory().create()");
        setChromeClient(a);
        C35916j.m148085c(this, webViewModel);
        mo107633c(webViewModel);
        webViewModel.mo106988H(new C35968a(this));
    }

    private final void setChromeClient(WebChromeClient webChromeClient) {
        this.f88916f = webChromeClient;
        TouchAwareAirshipWebView touchAwareAirshipWebView = this.f88915e;
        if (touchAwareAirshipWebView != null) {
            touchAwareAirshipWebView.setWebChromeClient(webChromeClient);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: c */
    public final void mo107633c(WebViewModel webViewModel) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        TouchAwareAirshipWebView touchAwareAirshipWebView = new TouchAwareAirshipWebView(context);
        this.f88915e = touchAwareAirshipWebView;
        Bundle K = webViewModel.mo107183K();
        if (K != null) {
            touchAwareAirshipWebView.restoreState(K);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f88915e, layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setId(16908301);
        progressBar.setIndeterminate(true);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(progressBar, layoutParams2);
        WebSettings settings = touchAwareAirshipWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        if (C9640b0.m36127e()) {
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
        }
        C9711g a = this.f88912b.mo106643e().mo18511a();
        a.mo19723b(new C35972d(progressBar, webViewModel));
        touchAwareAirshipWebView.setWebChromeClient(this.f88916f);
        touchAwareAirshipWebView.setVisibility(4);
        touchAwareAirshipWebView.setWebViewClient(a);
        addView(frameLayout);
        if (!UAirship.m146188Y().mo106206H().mo18743g(webViewModel.mo107184L(), 2)) {
            C36059m.m148409e("URL not allowed. Unable to load: %s", webViewModel.mo107184L());
        } else if (K == null) {
            touchAwareAirshipWebView.loadUrl(webViewModel.mo107184L());
        }
    }

    @C12579k
    /* renamed from: e */
    public C11907e<C11079d2> mo107595e() {
        C11907e<MotionEvent> v;
        TouchAwareAirshipWebView touchAwareAirshipWebView = this.f88915e;
        if (touchAwareAirshipWebView == null || (v = touchAwareAirshipWebView.mo107669v()) == null) {
            return C11909g.m47474n0();
        }
        return new WebViewView$taps$$inlined$map$1(new WebViewView$taps$$inlined$filter$1(v));
    }
}
