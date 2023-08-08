package com.urbanairship.webkit;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9672p0;
import java.lang.ref.WeakReference;

/* renamed from: com.urbanairship.webkit.a */
public class C9704a extends WebChromeClient {

    /* renamed from: a */
    public final WeakReference<Activity> f26598a;

    /* renamed from: b */
    public View f26599b;

    /* renamed from: com.urbanairship.webkit.a$a */
    public class C9705a extends WebViewClient {
        public C9705a() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str == null) {
                return true;
            }
            Uri parse = Uri.parse(str);
            if (parse.getHost() == null || "uairship".equals(parse.getScheme())) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW", C9672p0.m36235b(str));
            intent.addFlags(268435456);
            try {
                webView.getContext().startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                C36059m.m148410f(e);
                return true;
            }
        }
    }

    public C9704a(@C0363p0 Activity activity) {
        this.f26598a = new WeakReference<>(activity);
    }

    @C0363p0
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(new int[]{0}, 1, 1, Bitmap.Config.ARGB_8888);
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (!z2 || message == null || !(message.obj instanceof WebView.WebViewTransport)) {
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new C9705a());
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public void onHideCustomView() {
        Activity activity = this.f26598a.get();
        if (activity != null && this.f26599b != null) {
            activity.getWindow().clearFlags(1024);
            ((ViewGroup) this.f26599b.getParent()).removeView(this.f26599b);
            this.f26599b = null;
        }
    }

    public void onShowCustomView(@C0359n0 View view, @C0359n0 WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.f26598a.get();
        if (activity != null) {
            View view2 = this.f26599b;
            if (view2 != null) {
                ((ViewGroup) view2.getParent()).removeView(this.f26599b);
            }
            this.f26599b = view;
            view.setBackgroundColor(-16777216);
            activity.getWindow().setFlags(1024, 1024);
            activity.getWindow().addContentView(this.f26599b, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }
}
