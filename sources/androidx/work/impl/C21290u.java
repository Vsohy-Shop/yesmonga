package androidx.work.impl;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.work.C21082a;
import androidx.work.C21377l;
import androidx.work.impl.background.systemjob.C21132g;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21253v;
import androidx.work.impl.utils.C21341s;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.u */
public class C21290u {

    /* renamed from: a */
    public static final String f54934a = "androidx.work.impl.background.gcm.GcmScheduler";

    /* renamed from: b */
    public static final String f54935b = C21377l.m98584i("Schedulers");

    @C0359n0
    /* renamed from: a */
    public static C21289t m98343a(@C0359n0 Context context, @C0359n0 C21191g0 g0Var) {
        C21132g gVar = new C21132g(context, g0Var);
        C21341s.m98460c(context, SystemJobService.class, true);
        C21377l.m98582e().mo63774a(f54935b, "Created SystemJobScheduler and enabled SystemJobService");
        return gVar;
    }

    /* renamed from: b */
    public static void m98344b(@C0359n0 C21082a aVar, @C0359n0 WorkDatabase workDatabase, @C0363p0 List<C21289t> list) {
        if (list != null && list.size() != 0) {
            C21253v X = workDatabase.mo63207X();
            workDatabase.mo60905e();
            try {
                List<C21249u> v = X.mo63549v(aVar.mo63102h());
                List<C21249u> r = X.mo63545r(200);
                if (v != null && v.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C21249u uVar : v) {
                        X.mo63547t(uVar.f54804a, currentTimeMillis);
                    }
                }
                workDatabase.mo60901O();
                if (v != null && v.size() > 0) {
                    C21249u[] uVarArr = (C21249u[]) v.toArray(new C21249u[v.size()]);
                    for (C21289t next : list) {
                        if (next.mo63223e()) {
                            next.mo63221c(uVarArr);
                        }
                    }
                }
                if (r != null && r.size() > 0) {
                    C21249u[] uVarArr2 = (C21249u[]) r.toArray(new C21249u[r.size()]);
                    for (C21289t next2 : list) {
                        if (!next2.mo63223e()) {
                            next2.mo63221c(uVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.mo60908k();
            }
        }
    }

    @C0363p0
    /* renamed from: c */
    public static C21289t m98345c(@C0359n0 Context context) {
        try {
            C21289t tVar = (C21289t) Class.forName(f54934a).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            C21377l.m98582e().mo63774a(f54935b, "Created androidx.work.impl.background.gcm.GcmScheduler");
            return tVar;
        } catch (Throwable th) {
            C21377l.m98582e().mo63775b(f54935b, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
