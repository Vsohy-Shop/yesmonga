package com.contentsquare.android.sdk;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import androidx.lifecycle.C19441m0;
import com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.t1 */
public class C14731t1 {

    /* renamed from: f */
    public static C14731t1 f36454f;

    /* renamed from: g */
    public static C14453jf f36455g = new C14453jf("SessionReplay");

    /* renamed from: a */
    public final SessionReplayProcessor f36456a;

    /* renamed from: b */
    public final C14916z2 f36457b;

    /* renamed from: c */
    public final C14448ja f36458c;

    /* renamed from: d */
    public final C14417i6 f36459d;

    /* renamed from: e */
    public final C14752td f36460e;

    /* renamed from: com.contentsquare.android.sdk.t1$a */
    public static class C14732a {
        /* renamed from: a */
        public SessionReplayProcessor mo36463a(Application application, C14930zc zcVar, C14417i6 i6Var, C14476k7 k7Var, C14709se seVar, C14621pd pdVar, List<C14502lc> list) {
            List<C14502lc> list2 = list;
            C14806ve veVar = new C14806ve(k7Var);
            list2.add(veVar);
            C14602p pVar = new C14602p(C14549na.m62703a(application).mo35986g());
            list2.add(pVar);
            return new SessionReplayProcessor(application, zcVar, i6Var, k7Var, seVar, new C14693s1(C14549na.m62703a(application).mo35986g(), C14549na.m62703a(application).mo35987h()), new C14487l(C14549na.m62703a(application.getApplicationContext()).mo35986g(), C14549na.m62703a(application.getApplicationContext()).mo35983c(), k7Var, C14549na.m62703a(application.getApplicationContext()).mo35985f(), veVar), list2, pVar, new C14802vb(application, pdVar), C19441m0.m90725l());
        }
    }

    public C14731t1(Application application, C14709se seVar, boolean z) {
        this(new C14732a(), application, new C14930zc(), new C14543n5(application, new C14772u7(), new C14531mc(new Handler(Looper.getMainLooper()), 50), C14549na.m62703a(application).mo35982b(), new C14850x6()), new C14389h2(), new C14417i6(C14549na.m62703a(application).mo35986g()), new C14752td(C14549na.m62703a(application).mo35986g(), C14549na.m62703a(application).mo35983c()), new C14476k7(application, new DisplayMetrics()), seVar, new C14621pd(application.getApplicationContext()), new C14774u9(), z);
    }

    /* renamed from: b */
    public static void m63477b(Application application, boolean z) {
        try {
            if (f36454f == null) {
                f36454f = new C14731t1(application, C14549na.m62703a(application).mo35984e(), z);
                f36455g.mo35679i("Session Recording is starting", new Object[0]);
            }
            f36455g.mo35676e("Session Replay already started.");
        } catch (Exception e) {
            f36455g.mo35676e("Something went wrong");
            f36455g.mo35674c("Session Replay couldn't be started. %s", e);
        }
    }

    /* renamed from: e */
    public static C14731t1 m63478e() {
        return f36454f;
    }

    /* renamed from: h */
    public static boolean m63479h() {
        return f36454f != null;
    }

    /* renamed from: i */
    public static void m63480i() {
        try {
            C14731t1 t1Var = f36454f;
            if (t1Var != null) {
                t1Var.mo36462j();
                f36454f = null;
                f36455g.mo35679i("Session Recording stopped", new Object[0]);
            }
        } catch (Exception e) {
            f36455g.mo35676e("Something went wrong");
            f36455g.mo35674c("Session Replay couldn't be stopped. %s", e);
        }
    }

    /* renamed from: a */
    public void mo36457a() {
        this.f36456a.mo34440p();
    }

    /* renamed from: c */
    public void mo36458c(C14443j6 j6Var) {
        this.f36457b.mo35460b(j6Var);
    }

    /* renamed from: d */
    public void mo36459d(C14304e9 e9Var) {
        this.f36458c.mo35646b(e9Var);
    }

    /* renamed from: f */
    public C14752td mo36460f() {
        return this.f36460e;
    }

    /* renamed from: g */
    public final C14417i6 mo36461g() {
        return this.f36459d;
    }

    /* renamed from: j */
    public void mo36462j() {
        this.f36456a.mo34442r();
    }

    public C14731t1(C14732a aVar, Application application, C14930zc zcVar, C14543n5 n5Var, C14389h2 h2Var, C14417i6 i6Var, C14752td tdVar, C14476k7 k7Var, C14709se seVar, C14621pd pdVar, C14774u9 u9Var, boolean z) {
        C14389h2 h2Var2 = h2Var;
        C14774u9 u9Var2 = u9Var;
        C14417i6 i6Var2 = i6Var;
        this.f36459d = i6Var2;
        this.f36460e = tdVar;
        this.f36457b = h2Var2;
        this.f36458c = u9Var2;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C14502lc[]{new C14345fd(), n5Var, h2Var2, u9Var2});
        SessionReplayProcessor a = aVar.mo36463a(application, zcVar, i6Var2, k7Var, seVar, pdVar, arrayList);
        this.f36456a = a;
        a.mo34438m(z);
    }
}
