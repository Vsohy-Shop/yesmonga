package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.appcompat.widget.C0696c;
import androidx.window.layout.C21045g;
import androidx.window.layout.C21052l;
import androidx.window.layout.C21069q;
import androidx.window.layout.C21073t;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.C12091r1;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class FoldingFeatureObserver {
    @C12579k

    /* renamed from: a */
    public final C21069q f52695a;
    @C12579k

    /* renamed from: b */
    public final Executor f52696b;
    @C12580l

    /* renamed from: c */
    public C11723c2 f52697c;
    @C12580l

    /* renamed from: d */
    public C20441a f52698d;

    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$a */
    public interface C20441a {
        /* renamed from: a */
        void mo61304a(@C12579k C21052l lVar);
    }

    public FoldingFeatureObserver(@C12579k C21069q qVar, @C12579k Executor executor) {
        Intrinsics.checkNotNullParameter(qVar, "windowInfoTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f52695a = qVar;
        this.f52696b = executor;
    }

    /* renamed from: d */
    public final C21052l mo61300d(C21073t tVar) {
        Object obj;
        Iterator it = tVar.mo63016a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C21045g) obj) instanceof C21052l) {
                break;
            }
        }
        if (obj instanceof C21052l) {
            return (C21052l) obj;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo61301e(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        C11723c2 c2Var = this.f52697c;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f52697c = C12038j.m48061f(C12079p0.m48260a(C12091r1.m48305c(this.f52696b)), (CoroutineContext) null, (CoroutineStart) null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this, activity, (C11045c<? super FoldingFeatureObserver$registerLayoutStateChangeCallback$1>) null), 3, (Object) null);
    }

    /* renamed from: f */
    public final void mo61302f(@C12579k C20441a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "onFoldingFeatureChangeListener");
        this.f52698d = aVar;
    }

    /* renamed from: g */
    public final void mo61303g() {
        C11723c2 c2Var = this.f52697c;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
    }
}
