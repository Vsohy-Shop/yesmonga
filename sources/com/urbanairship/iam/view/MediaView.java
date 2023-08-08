package com.urbanairship.iam.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.shared.util.C28937k;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.iam.C9127a0;
import com.urbanairship.images.C9282f;
import com.urbanairship.util.C9640b0;
import java.lang.ref.WeakReference;
import java.util.Locale;

public class MediaView extends FrameLayout {

    /* renamed from: c */
    public static final String f25186c = "<body style=\"margin:0\"><video playsinline controls height=\"100%%\" width=\"100%%\" src=\"%s\"></video></body>";

    /* renamed from: a */
    public WebView f25187a;

    /* renamed from: b */
    public WebChromeClient f25188b;

    /* renamed from: com.urbanairship.iam.view.MediaView$a */
    public class C9244a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f25189a;

        /* renamed from: b */
        public final /* synthetic */ C9127a0 f25190b;

        public C9244a(WeakReference weakReference, C9127a0 a0Var) {
            this.f25189a = weakReference;
            this.f25190b = a0Var;
        }

        public void run() {
            WebView webView = (WebView) this.f25189a.get();
            if (webView != null) {
                if (C9127a0.f24710e.equals(this.f25190b.mo18214f())) {
                    webView.loadData(String.format(Locale.ROOT, MediaView.f25186c, new Object[]{this.f25190b.mo18215g()}), C28937k.f70947d, "UTF-8");
                    return;
                }
                webView.loadUrl(this.f25190b.mo18215g());
            }
        }
    }

    /* renamed from: com.urbanairship.iam.view.MediaView$b */
    public class C9245b extends C9246c {

        /* renamed from: e */
        public final /* synthetic */ ProgressBar f25192e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9245b(Runnable runnable, ProgressBar progressBar) {
            super(runnable, (C9244a) null);
            this.f25192e = progressBar;
        }

        /* renamed from: a */
        public void mo18596a(@C0359n0 WebView webView) {
            webView.setVisibility(0);
            this.f25192e.setVisibility(8);
        }
    }

    /* renamed from: com.urbanairship.iam.view.MediaView$c */
    public static abstract class C9246c extends WebViewClient {

        /* renamed from: d */
        public static final long f25194d = 1000;

        /* renamed from: a */
        public final Runnable f25195a;

        /* renamed from: b */
        public boolean f25196b;

        /* renamed from: c */
        public long f25197c;

        public /* synthetic */ C9246c(Runnable runnable, C9244a aVar) {
            this(runnable);
        }

        /* renamed from: a */
        public abstract void mo18596a(WebView webView);

        public void onPageFinished(@C0359n0 WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f25196b) {
                webView.postDelayed(this.f25195a, this.f25197c);
                this.f25197c *= 2;
            } else {
                mo18596a(webView);
            }
            this.f25196b = false;
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.f25196b = true;
        }

        public C9246c(Runnable runnable) {
            this.f25196b = false;
            this.f25197c = 1000;
            this.f25195a = runnable;
        }
    }

    public MediaView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public final void mo18590a(@C0359n0 C9127a0 a0Var) {
        this.f25187a = new WebView(getContext());
        FrameLayout frameLayout = new FrameLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f25187a, layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.setId(16908301);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(progressBar, layoutParams2);
        WebSettings settings = this.f25187a.getSettings();
        settings.setMediaPlaybackRequiresUserGesture(true);
        settings.setJavaScriptEnabled(true);
        if (C9640b0.m36127e()) {
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
        }
        C9244a aVar = new C9244a(new WeakReference(this.f25187a), a0Var);
        this.f25187a.setWebChromeClient(this.f25188b);
        this.f25187a.setContentDescription(a0Var.mo18212e());
        this.f25187a.setVisibility(4);
        this.f25187a.setWebViewClient(new C9245b(aVar, progressBar));
        addView(frameLayout);
        if (!UAirship.m146188Y().mo106206H().mo18743g(a0Var.mo18215g(), 2)) {
            C36059m.m148409e("URL not allowed. Unable to load: %s", a0Var.mo18215g());
            return;
        }
        aVar.run();
    }

    /* renamed from: b */
    public void mo18591b() {
        WebView webView = this.f25187a;
        if (webView != null) {
            webView.onPause();
        }
    }

    /* renamed from: c */
    public void mo18592c() {
        WebView webView = this.f25187a;
        if (webView != null) {
            webView.onResume();
        }
    }

    public void setChromeClient(@C0363p0 WebChromeClient webChromeClient) {
        this.f25188b = webChromeClient;
        WebView webView = this.f25187a;
        if (webView != null) {
            webView.setWebChromeClient(webChromeClient);
        }
    }

    public void setMediaInfo(@C0359n0 C9127a0 a0Var, @C0363p0 String str) {
        removeAllViewsInLayout();
        WebView webView = this.f25187a;
        if (webView != null) {
            webView.stopLoading();
            this.f25187a.setWebChromeClient((WebChromeClient) null);
            this.f25187a.setWebViewClient((WebViewClient) null);
            this.f25187a.destroy();
            this.f25187a = null;
        }
        String f = a0Var.mo18214f();
        f.hashCode();
        char c = 65535;
        switch (f.hashCode()) {
            case -991745245:
                if (f.equals(C9127a0.f24711f)) {
                    c = 0;
                    break;
                }
                break;
            case 100313435:
                if (f.equals(C9127a0.f24709d)) {
                    c = 1;
                    break;
                }
                break;
            case 112202875:
                if (f.equals(C9127a0.f24710e)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                mo18590a(a0Var);
                return;
            case 1:
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setAdjustViewBounds(true);
                imageView.setContentDescription(a0Var.mo18212e());
                addView(imageView);
                if (str == null) {
                    str = a0Var.mo18215g();
                }
                UAirship.m146188Y().mo106229t().mo18651a(getContext(), imageView, C9282f.m34839f(str).mo18673f());
                return;
            default:
                return;
        }
    }

    public MediaView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @C0376v0(21)
    public MediaView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
