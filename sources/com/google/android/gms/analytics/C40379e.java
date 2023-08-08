package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.C0363p0;
import androidx.annotation.C0380x0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.gtm.C41130a4;
import com.google.android.gms.internal.gtm.C41178c4;
import com.google.android.gms.internal.gtm.C41563s4;
import com.google.android.gms.internal.gtm.C41587t4;
import com.google.android.gms.internal.gtm.C41607u0;
import com.google.android.gms.internal.gtm.C41610u3;
import com.google.android.gms.internal.gtm.C41634v3;
import com.google.android.gms.internal.gtm.C41635v4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@C40974d0
/* renamed from: com.google.android.gms.analytics.e */
public final class C40379e extends C40398j {
    @C0363p0

    /* renamed from: l */
    public static List<Runnable> f102920l = new ArrayList();

    /* renamed from: f */
    public boolean f102921f;

    /* renamed from: g */
    public Set<C40380e0> f102922g = new HashSet();

    /* renamed from: h */
    public boolean f102923h;

    /* renamed from: i */
    public boolean f102924i;

    /* renamed from: j */
    public volatile boolean f102925j;

    /* renamed from: k */
    public boolean f102926k;

    @C40974d0
    public C40379e(C41607u0 u0Var) {
        super(u0Var);
    }

    @RecentlyNonNull
    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: k */
    public static C40379e m164228k(@RecentlyNonNull Context context) {
        return C41607u0.m168444g(context).mo135893c();
    }

    /* renamed from: v */
    public static void m164229v() {
        synchronized (C40379e.class) {
            List<Runnable> list = f102920l;
            if (list != null) {
                for (Runnable run : list) {
                    run.run();
                }
                f102920l = null;
            }
        }
    }

    /* renamed from: A */
    public final void mo133275A(C40380e0 e0Var) {
        this.f102922g.add(e0Var);
        Context a = mo133418e().mo135891a();
        if (a instanceof Application) {
            mo133278i((Application) a);
        }
    }

    /* renamed from: B */
    public final void mo133276B(C40380e0 e0Var) {
        this.f102922g.remove(e0Var);
    }

    /* renamed from: h */
    public void mo133277h() {
        mo133418e().mo135896f().mo135691a0();
    }

    @TargetApi(14)
    /* renamed from: i */
    public void mo133278i(@RecentlyNonNull Application application) {
        if (!this.f102923h) {
            application.registerActivityLifecycleCallbacks(new C40402n(this));
            this.f102923h = true;
        }
    }

    /* renamed from: j */
    public boolean mo133279j() {
        return this.f102925j;
    }

    @RecentlyNonNull
    @Deprecated
    /* renamed from: l */
    public C40394g mo133280l() {
        return C41178c4.m167247a();
    }

    /* renamed from: m */
    public boolean mo133281m() {
        return this.f102924i;
    }

    @RecentlyNonNull
    /* renamed from: n */
    public C40397i mo133282n(int i) {
        C40397i iVar;
        C41587t4 t4Var;
        synchronized (this) {
            iVar = new C40397i(mo133418e(), (String) null, (C41130a4) null);
            if (i > 0 && (t4Var = (C41587t4) new C41563s4(mo133418e()).mo135797T(i)) != null) {
                iVar.mo133393F1(t4Var);
            }
            iVar.mo135795U();
        }
        return iVar;
    }

    @RecentlyNonNull
    /* renamed from: o */
    public C40397i mo133283o(@RecentlyNonNull String str) {
        C40397i iVar;
        synchronized (this) {
            iVar = new C40397i(mo133418e(), str, (C41130a4) null);
            iVar.mo135795U();
        }
        return iVar;
    }

    /* renamed from: p */
    public void mo133284p(@RecentlyNonNull Activity activity) {
        if (!this.f102923h) {
            mo133291x(activity);
        }
    }

    /* renamed from: q */
    public void mo133285q(@RecentlyNonNull Activity activity) {
        if (!this.f102923h) {
            mo133292y(activity);
        }
    }

    /* renamed from: r */
    public void mo133286r(boolean z) {
        this.f102925j = z;
        if (this.f102925j) {
            mo133418e().mo135896f().mo135694d0();
        }
    }

    /* renamed from: s */
    public void mo133287s(boolean z) {
        this.f102924i = z;
    }

    /* renamed from: t */
    public void mo133288t(int i) {
        mo133418e().mo135896f().mo135699p0(i);
    }

    @Deprecated
    /* renamed from: u */
    public void mo133289u(@RecentlyNonNull C40394g gVar) {
        C41178c4.m167249c(gVar);
        if (!this.f102926k) {
            C41610u3<String> u3Var = C41634v3.f105118d;
            String b = u3Var.mo135909b();
            String b2 = u3Var.mo135909b();
            StringBuilder sb = new StringBuilder(b2.length() + 112);
            sb.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
            sb.append(b2);
            sb.append(" DEBUG");
            this.f102926k = true;
        }
    }

    /* renamed from: w */
    public final void mo133290w() {
        C41635v4 q = mo133418e().mo135906q();
        q.mo135964c0();
        if (q.mo135963b0()) {
            mo133287s(q.mo135962a0());
        }
        q.mo135964c0();
        this.f102921f = true;
    }

    @C40974d0
    /* renamed from: x */
    public final void mo133291x(Activity activity) {
        for (C40380e0 X : this.f102922g) {
            X.mo133295X(activity);
        }
    }

    @C40974d0
    /* renamed from: y */
    public final void mo133292y(Activity activity) {
        for (C40380e0 Z : this.f102922g) {
            Z.mo133296Z(activity);
        }
    }

    /* renamed from: z */
    public final boolean mo133293z() {
        return this.f102921f;
    }
}
