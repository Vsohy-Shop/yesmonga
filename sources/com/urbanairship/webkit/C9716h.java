package com.urbanairship.webkit;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.javascript.C9288b;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.webkit.h */
public class C9716h implements C9288b {

    /* renamed from: a */
    public final WeakReference<WebView> f26629a;

    public C9716h(@C0359n0 WebView webView) {
        this.f26629a = new WeakReference<>(webView);
    }

    /* renamed from: a */
    public void mo18682a(@C0359n0 String str) {
        WebView webView = this.f26629a.get();
        if (webView != null) {
            webView.evaluateJavascript(str, (ValueCallback) null);
        }
    }
}
