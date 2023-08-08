package androidx.webkit.internal;

import androidx.annotation.C0359n0;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* renamed from: androidx.webkit.internal.s0 */
public class C20922s0 {

    /* renamed from: a */
    public final WebViewCookieManagerBoundaryInterface f54009a;

    public C20922s0(@C0359n0 WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f54009a = webViewCookieManagerBoundaryInterface;
    }

    @C0359n0
    /* renamed from: a */
    public List<String> mo62692a(@C0359n0 String str) {
        return this.f54009a.getCookieInfo(str);
    }
}
