package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import androidx.work.C21372k;
import androidx.work.C21377l;
import androidx.work.WorkerParameters;
import androidx.work.impl.C21191g0;
import androidx.work.impl.constraints.C21139c;
import androidx.work.impl.constraints.C21153e;
import androidx.work.impl.constraints.trackers.C21172o;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21253v;
import androidx.work.impl.utils.futures.C21317a;
import com.google.common.util.concurrent.C32487a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R8\u0010\u001d\u001a&\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004 \u001a*\u0012\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00190\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010#\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018G@BX\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006("}, mo22516d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/k;", "Landroidx/work/impl/constraints/c;", "Lcom/google/common/util/concurrent/a;", "Landroidx/work/k$a;", "u", "Lkotlin/d2;", "q", "", "Landroidx/work/impl/model/u;", "workSpecs", "f", "a", "z", "Landroidx/work/WorkerParameters;", "e", "Landroidx/work/WorkerParameters;", "workerParameters", "", "Ljava/lang/Object;", "lock", "", "g", "Z", "areConstraintsUnmet", "Landroidx/work/impl/utils/futures/a;", "kotlin.jvm.PlatformType", "v", "Landroidx/work/impl/utils/futures/a;", "future", "<set-?>", "w", "Landroidx/work/k;", "y", "()Landroidx/work/k;", "delegate", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ConstraintTrackingWorker extends C21372k implements C21139c {
    @C12579k

    /* renamed from: e */
    public final WorkerParameters f55087e;
    @C12579k

    /* renamed from: f */
    public final Object f55088f = new Object();

    /* renamed from: g */
    public volatile boolean f55089g;

    /* renamed from: v */
    public final C21317a<C21372k.C21373a> f55090v = C21317a.m98425v();
    @C12580l

    /* renamed from: w */
    public C21372k f55091w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@C12579k Context context, @C12579k WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f55087e = workerParameters;
    }

    /* renamed from: A */
    public static final void m98510A(ConstraintTrackingWorker constraintTrackingWorker, C32487a aVar) {
        Intrinsics.checkNotNullParameter(constraintTrackingWorker, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f55088f) {
            if (constraintTrackingWorker.f55089g) {
                C21317a<C21372k.C21373a> aVar2 = constraintTrackingWorker.f55090v;
                Intrinsics.checkNotNullExpressionValue(aVar2, "future");
                boolean unused = C21365c.m98525e(aVar2);
            } else {
                constraintTrackingWorker.f55090v.mo63661s(aVar);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: B */
    public static final void m98511B(ConstraintTrackingWorker constraintTrackingWorker) {
        Intrinsics.checkNotNullParameter(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.mo63727z();
    }

    /* renamed from: a */
    public void mo63219a(@C12579k List<C21249u> list) {
        Intrinsics.checkNotNullParameter(list, "workSpecs");
        C21377l e = C21377l.m98582e();
        String a = C21365c.f55095a;
        e.mo63774a(a, "Constraints changed for " + list);
        synchronized (this.f55088f) {
            this.f55089g = true;
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: f */
    public void mo63224f(@C12579k List<C21249u> list) {
        Intrinsics.checkNotNullParameter(list, "workSpecs");
    }

    /* renamed from: q */
    public void mo63725q() {
        super.mo63725q();
        C21372k kVar = this.f55091w;
        if (kVar != null && !kVar.mo63758o()) {
            kVar.mo63763v();
        }
    }

    @C12579k
    /* renamed from: u */
    public C32487a<C21372k.C21373a> mo18696u() {
        mo63748c().execute(new C21363a(this));
        C21317a<C21372k.C21373a> aVar = this.f55090v;
        Intrinsics.checkNotNullExpressionValue(aVar, "future");
        return aVar;
    }

    @C0344h1
    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public final C21372k mo63726y() {
        return this.f55091w;
    }

    /* renamed from: z */
    public final void mo63727z() {
        boolean z;
        if (!this.f55090v.isCancelled()) {
            String A = mo63750g().mo63151A(C21365c.f55096b);
            C21377l e = C21377l.m98582e();
            Intrinsics.checkNotNullExpressionValue(e, "get()");
            if (A == null || A.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                e.mo63776c(C21365c.f55095a, "No worker to delegate to.");
                C21317a<C21372k.C21373a> aVar = this.f55090v;
                Intrinsics.checkNotNullExpressionValue(aVar, "future");
                boolean unused = C21365c.m98524d(aVar);
                return;
            }
            C21372k b = mo63757n().mo63885b(mo63747b(), A, this.f55087e);
            this.f55091w = b;
            if (b == null) {
                e.mo63774a(C21365c.f55095a, "No worker to delegate to.");
                C21317a<C21372k.C21373a> aVar2 = this.f55090v;
                Intrinsics.checkNotNullExpressionValue(aVar2, "future");
                boolean unused2 = C21365c.m98524d(aVar2);
                return;
            }
            C21191g0 J = C21191g0.m97937J(mo63747b());
            Intrinsics.checkNotNullExpressionValue(J, "getInstance(applicationContext)");
            C21253v X = J.mo63363P().mo63207X();
            String uuid = mo63749e().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            C21249u l = X.mo63539l(uuid);
            if (l == null) {
                C21317a<C21372k.C21373a> aVar3 = this.f55090v;
                Intrinsics.checkNotNullExpressionValue(aVar3, "future");
                boolean unused3 = C21365c.m98524d(aVar3);
                return;
            }
            C21172o O = J.mo63362O();
            Intrinsics.checkNotNullExpressionValue(O, "workManagerImpl.trackers");
            C21153e eVar = new C21153e(O, (C21139c) this);
            eVar.mo63305a(C10976s.m41419k(l));
            String uuid2 = mo63749e().toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
            if (eVar.mo63307d(uuid2)) {
                String a = C21365c.f55095a;
                e.mo63774a(a, "Constraints met for delegate " + A);
                try {
                    C21372k kVar = this.f55091w;
                    Intrinsics.checkNotNull(kVar);
                    C32487a<C21372k.C21373a> u = kVar.mo18696u();
                    Intrinsics.checkNotNullExpressionValue(u, "delegate!!.startWork()");
                    u.mo5489q(new C21364b(this, u), mo63748c());
                } catch (Throwable th) {
                    String a2 = C21365c.f55095a;
                    e.mo63775b(a2, "Delegated worker " + A + " threw exception in startWork.", th);
                    synchronized (this.f55088f) {
                        if (this.f55089g) {
                            e.mo63774a(C21365c.f55095a, "Constraints were unmet, Retrying.");
                            C21317a<C21372k.C21373a> aVar4 = this.f55090v;
                            Intrinsics.checkNotNullExpressionValue(aVar4, "future");
                            boolean unused4 = C21365c.m98525e(aVar4);
                        } else {
                            C21317a<C21372k.C21373a> aVar5 = this.f55090v;
                            Intrinsics.checkNotNullExpressionValue(aVar5, "future");
                            boolean unused5 = C21365c.m98524d(aVar5);
                        }
                    }
                }
            } else {
                String a3 = C21365c.f55095a;
                e.mo63774a(a3, "Constraints not met for delegate " + A + ". Requesting retry.");
                C21317a<C21372k.C21373a> aVar6 = this.f55090v;
                Intrinsics.checkNotNullExpressionValue(aVar6, "future");
                boolean unused6 = C21365c.m98525e(aVar6);
            }
        }
    }
}
