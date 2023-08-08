package com.urbanairship.messagecenter.webkit;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35497g;
import com.urbanairship.javascript.C9285a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import com.urbanairship.messagecenter.C9371g;
import com.urbanairship.messagecenter.C9372h;
import com.urbanairship.webkit.C9711g;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.urbanairship.messagecenter.webkit.a */
public class C9399a extends C9711g {

    /* renamed from: f */
    public static SimpleDateFormat f25711f;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
        f25711f = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public C35497g mo19078c(@C0359n0 C35497g gVar, @C0359n0 WebView webView) {
        Bundle bundle = new Bundle();
        C9371g n = mo19079n(webView);
        if (n != null) {
            bundle.putString(C35489b.f87515d, n.mo18977W());
        }
        gVar.mo106380m(bundle);
        return gVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    @C0346i
    /* renamed from: d */
    public C9285a.C9287b mo18613d(@C0359n0 C9285a.C9287b bVar, @C0359n0 WebView webView) {
        long j;
        String str;
        String str2;
        C9371g n = mo19079n(webView);
        C9323b bVar2 = C9323b.f25440b;
        if (n != null) {
            bVar2 = JsonValue.m34975U(n.mo18998z()).mo18749A();
        }
        C9285a.C9287b d = super.mo18613d(bVar, webView);
        if (n != null) {
            j = n.mo18987i0();
        } else {
            j = -1;
        }
        C9285a.C9287b b = d.mo18678b("getMessageSentDateMS", j);
        String str3 = null;
        if (n != null) {
            str = n.mo18977W();
        } else {
            str = null;
        }
        C9285a.C9287b d2 = b.mo18680d("getMessageId", str);
        if (n != null) {
            str2 = n.mo18988j0();
        } else {
            str2 = null;
        }
        C9285a.C9287b d3 = d2.mo18680d("getMessageTitle", str2);
        if (n != null) {
            str3 = f25711f.format(n.mo18985h0());
        }
        return d3.mo18680d("getMessageSentDate", str3).mo18680d("getUserId", C9372h.m35254H().mo19001D().mo19088d()).mo18679c("getMessageExtras", bVar2);
    }

    @C0363p0
    @C0353k0
    /* renamed from: n */
    public final C9371g mo19079n(@C0359n0 WebView webView) {
        return C9372h.m35254H().mo18999B().mo18930m(webView.getUrl());
    }
}
