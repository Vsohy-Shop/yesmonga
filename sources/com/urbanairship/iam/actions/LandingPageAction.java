package com.urbanairship.iam.actions;

import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.actions.C35487a;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35495f;
import com.urbanairship.automation.C8893h0;
import com.urbanairship.automation.C8928r;
import com.urbanairship.automation.C8996y;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.iam.html.C9198c;
import com.urbanairship.json.C9323b;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.C9638b;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9669o0;
import com.urbanairship.util.C9672p0;
import java.util.UUID;
import java.util.concurrent.Callable;

public class LandingPageAction extends C35487a {
    @C0359n0

    /* renamed from: j */
    public static final String f24721j = "landing_page_action";
    @C0359n0

    /* renamed from: k */
    public static final String f24722k = "^p";
    @C0359n0

    /* renamed from: l */
    public static final String f24723l = "url";
    @C0359n0

    /* renamed from: m */
    public static final String f24724m = "aspectLock";

    /* renamed from: n */
    public static final float f24725n = 2.0f;

    /* renamed from: h */
    public final Callable<C8928r> f24726h;

    /* renamed from: i */
    public float f24727i;

    public LandingPageAction() {
        this(C9638b.m36121a(C8928r.class));
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        int b = bVar.mo106348b();
        if ((b == 0 || b == 6 || b == 2 || b == 3 || b == 4) && mo18226k(bVar) != null) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        try {
            C8928r call = this.f24726h.call();
            Uri k = mo18226k(bVar);
            C9654i.m36166b(k, "URI should not be null");
            call.mo17613i(mo18222g(k, bVar));
            return C35495f.m146456d();
        } catch (Exception e) {
            return C35495f.m146458f(e);
        }
    }

    @C0359n0
    /* renamed from: g */
    public C8996y<InAppMessage> mo18222g(@C0359n0 Uri uri, @C0359n0 C35489b bVar) {
        boolean z;
        String str;
        boolean z2;
        C9323b A = bVar.mo106349c().mo17264q().mo18749A();
        int f = A.mo18801A("width").mo18762f(0);
        int f2 = A.mo18801A("height").mo18762f(0);
        if (A.mo18805e(C9198c.f25029z)) {
            z = A.mo18801A(C9198c.f25029z).mo18757c(false);
        } else {
            z = A.mo18801A(f24724m).mo18757c(false);
        }
        PushMessage pushMessage = (PushMessage) bVar.mo106347a().getParcelable(C35489b.f87516e);
        if (pushMessage == null || pushMessage.mo19191x() == null) {
            str = UUID.randomUUID().toString();
            z2 = false;
        } else {
            str = pushMessage.mo19191x();
            z2 = true;
        }
        return mo18224i(C8996y.m33418N(mo18223h(InAppMessage.m34089v().mo18202r(C9198c.m34514r().mo18478q(uri.toString()).mo18472k(false).mo18474m(this.f24727i).mo18477p(f, f2, z).mo18476o(false).mo18471j()).mo18209y(z2).mo18198n(InAppMessage.f24683U0)).mo18196l()).mo17755B(str).mo17763r(C8893h0.m33012a().mo17518b(1.0d).mo17517a()).mo17757D(1).mo17759F(Integer.MIN_VALUE)).mo17765t();
    }

    @C0359n0
    /* renamed from: h */
    public InAppMessage.C9122b mo18223h(@C0359n0 InAppMessage.C9122b bVar) {
        return bVar;
    }

    @C0359n0
    /* renamed from: i */
    public C8996y.C8998b<InAppMessage> mo18224i(@C0359n0 C8996y.C8998b<InAppMessage> bVar) {
        return bVar;
    }

    /* renamed from: j */
    public float mo18225j() {
        return this.f24727i;
    }

    @C0363p0
    /* renamed from: k */
    public Uri mo18226k(@C0359n0 C35489b bVar) {
        String str;
        Uri b;
        if (bVar.mo106349c().mo106307f() != null) {
            str = bVar.mo106349c().mo106307f().mo18801A("url").mo18769l();
        } else {
            str = bVar.mo106349c().mo106308g();
        }
        if (str == null || (b = C9672p0.m36235b(str)) == null || C9669o0.m36224e(b.toString())) {
            return null;
        }
        if (C9669o0.m36224e(b.getScheme())) {
            b = Uri.parse("https://" + b);
        }
        if (UAirship.m146188Y().mo106206H().mo18743g(b.toString(), 2)) {
            return b;
        }
        C36059m.m148409e("Landing page URL is not allowed: %s", b);
        return null;
    }

    /* renamed from: l */
    public void mo18227l(@C0379x(from = 0.0d) float f) {
        this.f24727i = f;
    }

    @C0344h1
    public LandingPageAction(@C0359n0 Callable<C8928r> callable) {
        this.f24727i = 2.0f;
        this.f24726h = callable;
    }
}
