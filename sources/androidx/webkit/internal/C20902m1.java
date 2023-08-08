package androidx.webkit.internal;

import androidx.annotation.C0359n0;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* renamed from: androidx.webkit.internal.m1 */
public class C20902m1 {

    /* renamed from: a */
    public final WebResourceRequestBoundaryInterface f53946a;

    public C20902m1(@C0359n0 WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f53946a = webResourceRequestBoundaryInterface;
    }

    /* renamed from: a */
    public boolean mo62650a() {
        return this.f53946a.isRedirect();
    }
}
