package com.urbanairship.webkit;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.webkit.C20966r;
import androidx.webkit.C20977t;
import androidx.webkit.C20980u;
import com.google.firebase.installations.C33124s;
import com.urbanairship.C36059m;
import com.urbanairship.C36080x;
import com.urbanairship.util.C9640b0;
import java.util.Map;

public class AirshipWebView extends WebView {

    /* renamed from: d */
    public static final String f26594d = "urbanairship";

    /* renamed from: a */
    public WebViewClient f26595a;

    /* renamed from: b */
    public String f26596b;

    /* renamed from: c */
    public boolean f26597c;

    public AirshipWebView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m36337m(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m36338n(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m36339o(String str) {
        super.loadUrl(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m36340p(String str, Map map) {
        super.loadUrl(str, map);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m36341q(Runnable runnable, Boolean bool) {
        if (!bool.booleanValue()) {
            C36059m.m148406b("Unable to start Safe Browsing. Feature is not supported or disabled in the manifest.", new Object[0]);
        }
        this.f26597c = true;
        runnable.run();
    }

    @C0363p0
    public WebViewClient getWebViewClientCompat() {
        return this.f26595a;
    }

    @C0359n0
    /* renamed from: j */
    public String mo19700j(@C0359n0 String str, @C0359n0 String str2) {
        String str3 = str + C33124s.f80355c + str2;
        return "Basic " + Base64.encodeToString(str3.getBytes(), 2);
    }

    @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
    /* renamed from: k */
    public final void mo19701k(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        WebSettings settings = getSettings();
        settings.setDomStorageEnabled(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C36080x.C36096p.AirshipWebView, i, i2);
            try {
                settings.setMixedContentMode(obtainStyledAttributes.getInteger(C36080x.C36096p.AirshipWebView_mixed_content_mode, 2));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        if (C9640b0.m36127e()) {
            C36059m.m148419o("Application contains metadata to enable local storage", new Object[0]);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
        }
        mo19702l();
        mo19708s();
    }

    /* renamed from: l */
    public void mo19702l() {
    }

    public void loadData(@C0359n0 String str, @C0363p0 String str2, @C0363p0 String str3) {
        mo19707r(new C9708d(this, str, str2, str3));
    }

    public void loadDataWithBaseURL(@C0363p0 String str, @C0359n0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5) {
        mo19707r(new C9707c(this, str, str2, str3, str4, str5));
    }

    public void loadUrl(@C0359n0 String str) {
        mo19707r(new C9706b(this, str));
    }

    @SuppressLint({"NewApi"})
    /* renamed from: r */
    public void mo19707r(@C0359n0 Runnable runnable) {
        if (getWebViewClientCompat() == null) {
            C36059m.m148406b("No web view client set, setting a default AirshipWebViewClient for landing page view.", new Object[0]);
            setWebViewClient(new C9711g());
        }
        if (!(this.f26596b == null || getWebViewClientCompat() == null || !(getWebViewClientCompat() instanceof C9711g))) {
            ((C9711g) getWebViewClientCompat()).mo19728j(this.f26596b);
            this.f26596b = null;
        }
        if (this.f26597c || !mo19711u()) {
            C36059m.m148406b("Unable to start Safe Browsing. Feature is not supported or disabled in the manifest.", new Object[0]);
            this.f26597c = true;
            runnable.run();
            return;
        }
        C20977t.m97118z(getContext().getApplicationContext(), new C9710f(this, runnable));
    }

    /* renamed from: s */
    public void mo19708s() {
    }

    public void setWebViewClient(@C0363p0 WebViewClient webViewClient) {
        if (webViewClient != null && !(webViewClient instanceof C9711g)) {
            C36059m.m148421q("The web view client should extend AirshipWebViewClient to support Airship url overrides and triggering actions from.", new Object[0]);
        }
        this.f26595a = webViewClient;
        super.setWebViewClient(webViewClient);
    }

    /* renamed from: t */
    public void mo19710t(@C0363p0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        this.f26596b = str;
        if (getWebViewClientCompat() != null && (getWebViewClientCompat() instanceof C9711g)) {
            C9711g gVar = (C9711g) getWebViewClientCompat();
            String host = Uri.parse(str).getHost();
            if (host != null) {
                gVar.mo19722a(host, str2, str3);
            }
        }
    }

    /* renamed from: u */
    public final boolean mo19711u() {
        if (!C20980u.m97120a("START_SAFE_BROWSING") || !C20980u.m97120a("SAFE_BROWSING_ENABLE") || !C20966r.m97069h(getSettings()) || !C9640b0.m36126d()) {
            return false;
        }
        return true;
    }

    public AirshipWebView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842885);
    }

    public void loadUrl(@C0359n0 String str, @C0359n0 Map<String, String> map) {
        mo19707r(new C9709e(this, str, map));
    }

    public AirshipWebView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26597c = false;
        if (!isInEditMode()) {
            mo19701k(context, attributeSet, i, 0);
        }
    }

    @TargetApi(21)
    public AirshipWebView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f26597c = false;
        if (!isInEditMode()) {
            mo19701k(context, attributeSet, i, i2);
        }
    }
}
