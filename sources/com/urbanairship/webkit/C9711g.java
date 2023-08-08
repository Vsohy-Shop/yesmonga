package com.urbanairship.webkit;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.C0344h1;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36050h;
import com.urbanairship.C36059m;
import com.urbanairship.C36080x;
import com.urbanairship.UAirship;
import com.urbanairship.actions.C35490c;
import com.urbanairship.actions.C35497g;
import com.urbanairship.actions.C35502h;
import com.urbanairship.actions.C35504j;
import com.urbanairship.javascript.C9285a;
import com.urbanairship.javascript.C9289c;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.urbanairship.webkit.g */
public class C9711g extends WebViewClient {

    /* renamed from: a */
    public final Map<String, C9714c> f26618a;

    /* renamed from: b */
    public final Map<WebView, C36050h> f26619b;

    /* renamed from: c */
    public final C9289c f26620c;

    /* renamed from: d */
    public boolean f26621d;

    /* renamed from: e */
    public List<C9715d> f26622e;

    /* renamed from: com.urbanairship.webkit.g$a */
    public class C9712a implements C35502h {

        /* renamed from: a */
        public final /* synthetic */ WebView f26623a;

        public C9712a(WebView webView) {
            this.f26623a = webView;
        }

        @C0359n0
        /* renamed from: a */
        public C35497g mo19739a(@C0359n0 C35497g gVar) {
            return C9711g.this.mo19078c(gVar, this.f26623a);
        }
    }

    /* renamed from: com.urbanairship.webkit.g$b */
    public class C9713b implements C9289c.C9294e {

        /* renamed from: a */
        public final /* synthetic */ WebView f26625a;

        public C9713b(WebView webView) {
            this.f26625a = webView;
        }

        /* renamed from: a */
        public void mo18693a() {
            C9711g.this.mo19727i(this.f26625a);
        }

        /* renamed from: b */
        public void mo18694b(@C0359n0 String str, @C0359n0 Uri uri) {
            C9711g.this.mo18479h(this.f26625a, str, uri);
        }
    }

    /* renamed from: com.urbanairship.webkit.g$c */
    public static class C9714c {

        /* renamed from: a */
        public final String f26627a;

        /* renamed from: b */
        public final String f26628b;

        public C9714c(String str, String str2) {
            this.f26627a = str;
            this.f26628b = str2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.urbanairship.webkit.g$d */
    public interface C9715d {
        /* renamed from: a */
        boolean mo19740a(@C0359n0 WebView webView);

        /* renamed from: b */
        void mo19741b(@C0359n0 WebView webView, @C0363p0 String str);

        /* renamed from: c */
        void mo19742c(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest, @C0359n0 WebResourceError webResourceError);
    }

    public C9711g() {
        this(new C35504j());
    }

    /* renamed from: a */
    public void mo19722a(@C0359n0 String str, @C0363p0 String str2, @C0363p0 String str3) {
        this.f26618a.put(str, new C9714c(str2, str3));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public void mo19723b(@C0359n0 C9715d dVar) {
        this.f26622e.add(dVar);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public C35497g mo19078c(@C0359n0 C35497g gVar, @C0359n0 WebView webView) {
        return gVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    @C0346i
    /* renamed from: d */
    public C9285a.C9287b mo18613d(@C0359n0 C9285a.C9287b bVar, @C0359n0 WebView webView) {
        return bVar.mo18680d("getDeviceModel", Build.MODEL).mo18680d("getChannelId", UAirship.m146188Y().mo106223n().mo17793Z()).mo18680d("getAppKey", UAirship.m146188Y().mo106220f().f87128a).mo18680d("getNamedUser", UAirship.m146188Y().mo106227r().mo18037d0());
    }

    /* renamed from: e */
    public final WebResourceResponse mo19724e(@C0359n0 WebView webView) {
        try {
            return new WebResourceResponse("image/png", (String) null, new BufferedInputStream(webView.getContext().getResources().openRawResource(C36080x.C36093m.ua_blank_favicon)));
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to read blank favicon with IOException.", new Object[0]);
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public final boolean mo19725f(@C0359n0 WebView webView, @C0363p0 String str) {
        if (!mo19726g(webView.getUrl())) {
            return false;
        }
        return this.f26620c.mo18685e(str, new C9716h(webView), new C9712a(webView), new C9713b(webView));
    }

    /* renamed from: g */
    public boolean mo19726g(@C0363p0 String str) {
        return UAirship.m146188Y().mo106206H().mo18743g(str, 1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public void mo18479h(@C0359n0 WebView webView, @C0359n0 String str, @C0359n0 Uri uri) {
    }

    /* renamed from: i */
    public void mo19727i(@C0359n0 WebView webView) {
        boolean z;
        Iterator<C9715d> it = this.f26622e.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C9715d next = it.next();
                if (z || next.mo19740a(webView)) {
                    z = true;
                }
            }
        }
        if (!z) {
            webView.getRootView().dispatchKeyEvent(new KeyEvent(0, 4));
            webView.getRootView().dispatchKeyEvent(new KeyEvent(1, 4));
        }
    }

    /* renamed from: j */
    public void mo19728j(@C0359n0 String str) {
        this.f26618a.remove(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public void mo19729k(@C0359n0 C9715d dVar) {
        this.f26622e.remove(dVar);
    }

    /* renamed from: l */
    public void mo19730l(@C0363p0 C35490c cVar) {
        this.f26620c.mo18688h(cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: m */
    public void mo19731m(boolean z) {
        this.f26621d = z;
    }

    @C0346i
    public void onLoadResource(@C0359n0 WebView webView, @C0363p0 String str) {
        mo19725f(webView, str);
    }

    @C0346i
    public void onPageFinished(@C0363p0 WebView webView, @C0363p0 String str) {
        if (webView != null) {
            for (C9715d b : this.f26622e) {
                b.mo19741b(webView, str);
            }
            if (!mo19726g(str)) {
                C36059m.m148406b("%s is not an allowed URL. Airship Javascript interface will not be accessible.", str);
                return;
            }
            this.f26619b.put(webView, this.f26620c.mo18684d(webView.getContext(), mo18613d(C9285a.m34854b(), webView).mo18681e(), new C9716h(webView)));
        }
    }

    @C0346i
    public void onPageStarted(@C0359n0 WebView webView, @C0363p0 String str, @C0363p0 Bitmap bitmap) {
        C36050h hVar = this.f26619b.get(webView);
        if (hVar != null) {
            hVar.cancel();
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webView != null && webResourceRequest != null && webResourceError != null) {
            for (C9715d c : this.f26622e) {
                c.mo19742c(webView, webResourceRequest, webResourceError);
            }
        }
    }

    @C0346i
    public void onReceivedHttpAuthRequest(@C0359n0 WebView webView, @C0359n0 HttpAuthHandler httpAuthHandler, @C0363p0 String str, @C0363p0 String str2) {
        C9714c cVar = this.f26618a.get(str);
        if (cVar != null) {
            httpAuthHandler.proceed(cVar.f26627a, cVar.f26628b);
        }
    }

    @C0363p0
    @C0346i
    public WebResourceResponse shouldInterceptRequest(@C0359n0 WebView webView, @C0359n0 String str) {
        if (!this.f26621d && str.toLowerCase().endsWith("/favicon.ico")) {
            return mo19724e(webView);
        }
        return null;
    }

    @C0346i
    public boolean shouldOverrideUrlLoading(@C0359n0 WebView webView, @C0363p0 String str) {
        if (mo19725f(webView, str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public C9711g(@C0359n0 C35504j jVar) {
        this(new C9289c(jVar));
    }

    @C0344h1
    public C9711g(@C0359n0 C9289c cVar) {
        this.f26618a = new HashMap();
        this.f26619b = new WeakHashMap();
        this.f26621d = false;
        this.f26622e = new CopyOnWriteArrayList();
        this.f26620c = cVar;
    }

    @C0363p0
    @SuppressLint({"NewApi"})
    @C0346i
    public WebResourceResponse shouldInterceptRequest(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest) {
        String path;
        if (this.f26621d) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        if (webResourceRequest.isForMainFrame() || (path = webResourceRequest.getUrl().getPath()) == null || !path.endsWith("/favicon.ico")) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return mo19724e(webView);
    }
}
