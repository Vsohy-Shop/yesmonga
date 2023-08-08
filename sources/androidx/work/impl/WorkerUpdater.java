package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.C21082a;
import androidx.work.C21087c;
import androidx.work.C21091d;
import androidx.work.C21397o;
import androidx.work.C21414w;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21253v;
import androidx.work.impl.model.C21275z;
import androidx.work.impl.utils.C21305f;
import androidx.work.impl.utils.futures.C21317a;
import com.google.common.util.concurrent.C32487a;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "WorkerUpdater")
public final class WorkerUpdater {
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public static final C21397o m97681d(@C12579k C21191g0 g0Var, @C12579k String str, @C12579k C21414w wVar) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(wVar, "workRequest");
        C21282o oVar = new C21282o();
        g0Var.mo63365R().mo63699b().execute(new C21204l0(g0Var, str, oVar, new WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1(wVar, g0Var, str, oVar), wVar));
        return oVar;
    }

    /* renamed from: e */
    public static final void m97682e(C21191g0 g0Var, String str, C21282o oVar, C11289a aVar, C21414w wVar) {
        String str2 = str;
        C21282o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(g0Var, "$this_enqueueUniquelyNamedPeriodic");
        Intrinsics.checkNotNullParameter(str2, "$name");
        Intrinsics.checkNotNullParameter(oVar2, "$operation");
        Intrinsics.checkNotNullParameter(aVar, "$enqueueNew");
        Intrinsics.checkNotNullParameter(wVar, "$workRequest");
        C21253v X = g0Var.mo63363P().mo63207X();
        List<C21249u.C21251b> u = X.mo63548u(str2);
        if (u.size() > 1) {
            m97683f(oVar2, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        C21249u.C21251b bVar = (C21249u.C21251b) CollectionsKt___CollectionsKt.m40479B2(u);
        if (bVar == null) {
            aVar.invoke();
            return;
        }
        C21249u l = X.mo63539l(bVar.f54824a);
        if (l == null) {
            oVar2.mo63600b(new C21397o.C21399b.C21400a(new IllegalStateException("WorkSpec with " + bVar.f54824a + ", that matches a name \"" + str2 + "\", wasn't found")));
        } else if (!l.mo63456D()) {
            m97683f(oVar2, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        } else if (bVar.f54825b == WorkInfo.State.CANCELLED) {
            X.mo63529b(bVar.f54824a);
            aVar.invoke();
        } else {
            C21249u y = C21249u.m98121y(wVar.mo63860d(), bVar.f54824a, (WorkInfo.State) null, (String) null, (String) null, (C21091d) null, (C21091d) null, 0, 0, 0, (C21087c) null, 0, (BackoffPolicy) null, 0, 0, 0, 0, false, (OutOfQuotaPolicy) null, 0, 0, 1048574, (Object) null);
            try {
                C21286r L = g0Var.mo63359L();
                Intrinsics.checkNotNullExpressionValue(L, "processor");
                WorkDatabase P = g0Var.mo63363P();
                Intrinsics.checkNotNullExpressionValue(P, "workDatabase");
                C21082a o = g0Var.mo63065o();
                Intrinsics.checkNotNullExpressionValue(o, BannerConfigurableFragment.f27258E0);
                List<C21289t> N = g0Var.mo63361N();
                Intrinsics.checkNotNullExpressionValue(N, "schedulers");
                m97684g(L, P, o, N, y, wVar.mo63859c());
                oVar2.mo63600b(C21397o.f55145a);
            } catch (Throwable th) {
                oVar2.mo63600b(new C21397o.C21399b.C21400a(th));
            }
        }
    }

    /* renamed from: f */
    public static final void m97683f(C21282o oVar, String str) {
        oVar.mo63600b(new C21397o.C21399b.C21400a(new UnsupportedOperationException(str)));
    }

    /* renamed from: g */
    public static final WorkManager.UpdateResult m97684g(C21286r rVar, WorkDatabase workDatabase, C21082a aVar, List<? extends C21289t> list, C21249u uVar, Set<String> set) {
        String str = uVar.f54804a;
        C21249u l = workDatabase.mo63207X().mo63539l(str);
        if (l == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        } else if (l.f54805b.mo63047q()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        } else {
            if (!(l.mo63456D() ^ uVar.mo63456D())) {
                boolean l2 = rVar.mo63608l(str);
                if (!l2) {
                    for (C21289t b : list) {
                        b.mo63220b(str);
                    }
                }
                workDatabase.mo60899M(new C21200j0(workDatabase, uVar, l, list, str, set, l2));
                if (!l2) {
                    C21290u.m98344b(aVar, workDatabase, list);
                }
                if (l2) {
                    return WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN;
                }
                return WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
            }
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = WorkerUpdater$updateWorkImpl$type$1.f54460f;
            throw new UnsupportedOperationException("Can't update " + ((String) workerUpdater$updateWorkImpl$type$1.invoke(l)) + " Worker to " + ((String) workerUpdater$updateWorkImpl$type$1.invoke(uVar)) + " Worker. Update operation must preserve worker's type.");
        }
    }

    @C12579k
    /* renamed from: h */
    public static final C32487a<WorkManager.UpdateResult> m97685h(@C12579k C21191g0 g0Var, @C12579k C21414w wVar) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(wVar, "workRequest");
        C21317a v = C21317a.m98425v();
        g0Var.mo63365R().mo63699b().execute(new C21202k0(v, g0Var, wVar));
        Intrinsics.checkNotNullExpressionValue(v, "future");
        return v;
    }

    /* renamed from: i */
    public static final void m97686i(WorkDatabase workDatabase, C21249u uVar, C21249u uVar2, List list, String str, Set set, boolean z) {
        C21249u uVar3 = uVar2;
        List list2 = list;
        String str2 = str;
        Set set2 = set;
        Intrinsics.checkNotNullParameter(workDatabase, "$workDatabase");
        Intrinsics.checkNotNullParameter(uVar, "$newWorkSpec");
        Intrinsics.checkNotNullParameter(uVar3, "$oldWorkSpec");
        Intrinsics.checkNotNullParameter(list2, "$schedulers");
        Intrinsics.checkNotNullParameter(str2, "$workSpecId");
        Intrinsics.checkNotNullParameter(set2, "$tags");
        C21253v X = workDatabase.mo63207X();
        C21275z Y = workDatabase.mo63208Y();
        C21249u c = C21305f.m98382c(list2, C21249u.m98121y(uVar, (String) null, uVar3.f54805b, (String) null, (String) null, (C21091d) null, (C21091d) null, 0, 0, 0, (C21087c) null, uVar3.f54814k, (BackoffPolicy) null, 0, uVar3.f54817n, 0, 0, false, (OutOfQuotaPolicy) null, 0, uVar2.mo63486z() + 1, 515069, (Object) null));
        C21253v vVar = X;
        vVar.mo63528a(c);
        C21275z zVar = Y;
        zVar.mo63384b(str2);
        zVar.mo63387e(str2, set2);
        if (!z) {
            vVar.mo63547t(str2, -1);
            workDatabase.mo63206W().mo63449b(str2);
        }
    }

    /* renamed from: j */
    public static final void m97687j(C21317a aVar, C21191g0 g0Var, C21414w wVar) {
        Intrinsics.checkNotNullParameter(g0Var, "$this_updateWorkImpl");
        Intrinsics.checkNotNullParameter(wVar, "$workRequest");
        if (!aVar.isCancelled()) {
            try {
                C21286r L = g0Var.mo63359L();
                Intrinsics.checkNotNullExpressionValue(L, "processor");
                WorkDatabase P = g0Var.mo63363P();
                Intrinsics.checkNotNullExpressionValue(P, "workDatabase");
                C21082a o = g0Var.mo63065o();
                Intrinsics.checkNotNullExpressionValue(o, BannerConfigurableFragment.f27258E0);
                List<C21289t> N = g0Var.mo63361N();
                Intrinsics.checkNotNullExpressionValue(N, "schedulers");
                aVar.mo63659p(m97684g(L, P, o, N, wVar.mo63860d(), wVar.mo63859c()));
            } catch (Throwable th) {
                aVar.mo63660r(th);
            }
        }
    }
}
