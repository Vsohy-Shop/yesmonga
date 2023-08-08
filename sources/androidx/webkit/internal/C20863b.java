package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: androidx.webkit.internal.b */
public class C20863b {
    @C0359n0
    @C0373u
    /* renamed from: a */
    public static Uri m96798a(@C0359n0 WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }

    @C0373u
    /* renamed from: b */
    public static boolean m96799b(@C0359n0 WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }
}
