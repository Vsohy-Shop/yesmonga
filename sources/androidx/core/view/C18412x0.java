package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.C0359n0;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.x0 */
public class C18412x0 {

    /* renamed from: a */
    public final Runnable f47088a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C18318n1> f47089b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Map<C18318n1, C18413a> f47090c = new HashMap();

    /* renamed from: androidx.core.view.x0$a */
    public static class C18413a {

        /* renamed from: a */
        public final Lifecycle f47091a;

        /* renamed from: b */
        public C19470t f47092b;

        public C18413a(@C0359n0 Lifecycle lifecycle, @C0359n0 C19470t tVar) {
            this.f47091a = lifecycle;
            this.f47092b = tVar;
            lifecycle.mo57464a(tVar);
        }

        /* renamed from: a */
        public void mo53093a() {
            this.f47091a.mo57467d(this.f47092b);
            this.f47092b = null;
        }
    }

    public C18412x0(@C0359n0 Runnable runnable) {
        this.f47088a = runnable;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m83277f(C18318n1 n1Var, C19499w wVar, Lifecycle.C19372Event event) {
        if (event == Lifecycle.C19372Event.ON_DESTROY) {
            mo53092l(n1Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m83278g(Lifecycle.State state, C18318n1 n1Var, C19499w wVar, Lifecycle.C19372Event event) {
        if (event == Lifecycle.C19372Event.m90526z(state)) {
            mo53085c(n1Var);
        } else if (event == Lifecycle.C19372Event.ON_DESTROY) {
            mo53092l(n1Var);
        } else if (event == Lifecycle.C19372Event.m90523q(state)) {
            this.f47089b.remove(n1Var);
            this.f47088a.run();
        }
    }

    /* renamed from: c */
    public void mo53085c(@C0359n0 C18318n1 n1Var) {
        this.f47089b.add(n1Var);
        this.f47088a.run();
    }

    /* renamed from: d */
    public void mo53086d(@C0359n0 C18318n1 n1Var, @C0359n0 C19499w wVar) {
        mo53085c(n1Var);
        Lifecycle lifecycle = wVar.getLifecycle();
        C18413a remove = this.f47090c.remove(n1Var);
        if (remove != null) {
            remove.mo53093a();
        }
        this.f47090c.put(n1Var, new C18413a(lifecycle, new C18392v0(this, n1Var)));
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public void mo53087e(@C0359n0 C18318n1 n1Var, @C0359n0 C19499w wVar, @C0359n0 Lifecycle.State state) {
        Lifecycle lifecycle = wVar.getLifecycle();
        C18413a remove = this.f47090c.remove(n1Var);
        if (remove != null) {
            remove.mo53093a();
        }
        this.f47090c.put(n1Var, new C18413a(lifecycle, new C18399w0(this, state, n1Var)));
    }

    /* renamed from: h */
    public void mo53088h(@C0359n0 Menu menu, @C0359n0 MenuInflater menuInflater) {
        Iterator<C18318n1> it = this.f47089b.iterator();
        while (it.hasNext()) {
            it.next().mo52988d(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void mo53089i(@C0359n0 Menu menu) {
        Iterator<C18318n1> it = this.f47089b.iterator();
        while (it.hasNext()) {
            it.next().mo52985a(menu);
        }
    }

    /* renamed from: j */
    public boolean mo53090j(@C0359n0 MenuItem menuItem) {
        Iterator<C18318n1> it = this.f47089b.iterator();
        while (it.hasNext()) {
            if (it.next().mo52987c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo53091k(@C0359n0 Menu menu) {
        Iterator<C18318n1> it = this.f47089b.iterator();
        while (it.hasNext()) {
            it.next().mo52986b(menu);
        }
    }

    /* renamed from: l */
    public void mo53092l(@C0359n0 C18318n1 n1Var) {
        this.f47089b.remove(n1Var);
        C18413a remove = this.f47090c.remove(n1Var);
        if (remove != null) {
            remove.mo53093a();
        }
        this.f47088a.run();
    }
}
