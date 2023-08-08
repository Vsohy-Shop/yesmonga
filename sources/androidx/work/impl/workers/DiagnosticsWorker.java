package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.C21372k;
import androidx.work.C21377l;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C21191g0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C21230j;
import androidx.work.impl.model.C21239o;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21253v;
import androidx.work.impl.model.C21275z;
import com.google.firebase.crashlytics.internal.analytics.C32659d;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo22516d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroidx/work/k$a;", "w", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@C12579k Context context, @C12579k WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(workerParameters, C32659d.f79228c);
    }

    @C12579k
    /* renamed from: w */
    public C21372k.C21373a mo63077w() {
        C21191g0 J = C21191g0.m97937J(mo63747b());
        Intrinsics.checkNotNullExpressionValue(J, "getInstance(applicationContext)");
        WorkDatabase P = J.mo63363P();
        Intrinsics.checkNotNullExpressionValue(P, "workManager.workDatabase");
        C21253v X = P.mo63207X();
        C21239o V = P.mo63205V();
        C21275z Y = P.mo63208Y();
        C21230j U = P.mo63204U();
        List<C21249u> f = X.mo63533f(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<C21249u> A = X.mo63518A();
        List<C21249u> r = X.mo63545r(200);
        if (!f.isEmpty()) {
            C21377l.m98582e().mo63778f(C21366d.f55097a, "Recently completed work:\n\n");
            C21377l.m98582e().mo63778f(C21366d.f55097a, C21366d.m98529d(V, Y, U, f));
        }
        if (!A.isEmpty()) {
            C21377l.m98582e().mo63778f(C21366d.f55097a, "Running work:\n\n");
            C21377l.m98582e().mo63778f(C21366d.f55097a, C21366d.m98529d(V, Y, U, A));
        }
        if (!r.isEmpty()) {
            C21377l.m98582e().mo63778f(C21366d.f55097a, "Enqueued work:\n\n");
            C21377l.m98582e().mo63778f(C21366d.f55097a, C21366d.m98529d(V, Y, U, r));
        }
        C21372k.C21373a e = C21372k.C21373a.m98576e();
        Intrinsics.checkNotNullExpressionValue(e, "success()");
        return e;
    }
}
