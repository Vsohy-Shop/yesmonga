package androidx.webkit;

import android.webkit.CookieManager;
import androidx.annotation.C0359n0;
import androidx.webkit.internal.C20908o1;
import androidx.webkit.internal.C20912p1;
import androidx.webkit.internal.C20922s0;
import java.util.List;

/* renamed from: androidx.webkit.a */
public class C20838a {
    /* renamed from: a */
    public static C20922s0 m96751a(CookieManager cookieManager) {
        return C20912p1.m96945c().mo62706a(cookieManager);
    }

    @C0359n0
    /* renamed from: b */
    public static List<String> m96752b(@C0359n0 CookieManager cookieManager, @C0359n0 String str) {
        if (C20908o1.f53973Z.mo62608d()) {
            return m96751a(cookieManager).mo62692a(str);
        }
        throw C20908o1.m96934a();
    }
}
