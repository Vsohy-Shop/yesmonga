package androidx.webkit.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.List;

@C0376v0(27)
/* renamed from: androidx.webkit.internal.q */
public class C20915q {
    @C0373u
    /* renamed from: a */
    public static void m96949a(@C0359n0 SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.backToSafety(z);
    }

    @C0359n0
    @C0373u
    /* renamed from: b */
    public static Uri m96950b() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    @C0373u
    /* renamed from: c */
    public static void m96951c(@C0359n0 SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.proceed(z);
    }

    @C0373u
    /* renamed from: d */
    public static void m96952d(@C0359n0 List<String> list, @C0363p0 ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    @C0373u
    /* renamed from: e */
    public static void m96953e(@C0359n0 SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.showInterstitial(z);
    }

    @C0373u
    /* renamed from: f */
    public static void m96954f(@C0359n0 Context context, @C0363p0 ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
