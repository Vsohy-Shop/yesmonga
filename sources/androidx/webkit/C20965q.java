package androidx.webkit;

import android.webkit.WebResourceRequest;
import androidx.annotation.C0359n0;
import androidx.webkit.internal.C20851a;
import androidx.webkit.internal.C20873d;
import androidx.webkit.internal.C20902m1;
import androidx.webkit.internal.C20908o1;
import androidx.webkit.internal.C20912p1;

/* renamed from: androidx.webkit.q */
public class C20965q {
    /* renamed from: a */
    public static C20902m1 m97060a(WebResourceRequest webResourceRequest) {
        return C20912p1.m96945c().mo62716k(webResourceRequest);
    }

    /* renamed from: b */
    public static boolean m97061b(@C0359n0 WebResourceRequest webResourceRequest) {
        C20851a.C20854c cVar = C20908o1.f53995u;
        if (cVar.mo62607c()) {
            return C20873d.m96844j(webResourceRequest);
        }
        if (cVar.mo62608d()) {
            return m97060a(webResourceRequest).mo62650a();
        }
        throw C20908o1.m96934a();
    }
}
