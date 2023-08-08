package com.google.firebase.perf;

import android.content.Context;
import androidx.annotation.C0363p0;
import com.google.firebase.C33033f;
import com.google.firebase.C33277p;
import com.google.firebase.perf.application.C33279a;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.perf.b */
public class C33285b {
    public C33285b(C33033f fVar, @C0363p0 C33277p pVar, Executor executor) {
        Context n = fVar.mo95721n();
        C33307a.m134328h().mo96356Q(n);
        C33279a c = C33279a.m134177c();
        c.mo96273n(n);
        c.mo96274o(new C33317g());
        if (pVar != null) {
            AppStartTrace m = AppStartTrace.m134480m();
            m.mo96449E(n);
            executor.execute(new AppStartTrace.C33368c(m));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
