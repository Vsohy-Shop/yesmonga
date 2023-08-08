package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21082a;
import androidx.work.C21377l;
import androidx.work.WorkInfo;
import androidx.work.impl.C21176e;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21289t;
import androidx.work.impl.C21361v;
import androidx.work.impl.C21362w;
import androidx.work.impl.constraints.C21139c;
import androidx.work.impl.constraints.C21152d;
import androidx.work.impl.constraints.C21153e;
import androidx.work.impl.constraints.trackers.C21172o;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21273x;
import androidx.work.impl.utils.C21349u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.greedy.b */
public class C21107b implements C21289t, C21139c, C21176e {

    /* renamed from: x */
    public static final String f54482x = C21377l.m98584i("GreedyScheduler");

    /* renamed from: a */
    public final Context f54483a;

    /* renamed from: b */
    public final C21191g0 f54484b;

    /* renamed from: c */
    public final C21152d f54485c;

    /* renamed from: d */
    public final Set<C21249u> f54486d = new HashSet();

    /* renamed from: e */
    public C21105a f54487e;

    /* renamed from: f */
    public boolean f54488f;

    /* renamed from: g */
    public final Object f54489g;

    /* renamed from: v */
    public final C21362w f54490v = new C21362w();

    /* renamed from: w */
    public Boolean f54491w;

    public C21107b(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21172o oVar, @C0359n0 C21191g0 g0Var) {
        this.f54483a = context;
        this.f54484b = g0Var;
        this.f54485c = new C21153e(oVar, (C21139c) this);
        this.f54487e = new C21105a(this, aVar.mo63105k());
        this.f54489g = new Object();
    }

    /* renamed from: a */
    public void mo63219a(@C0359n0 List<C21249u> list) {
        for (C21249u a : list) {
            C21237m a2 = C21273x.m98280a(a);
            C21377l e = C21377l.m98582e();
            String str = f54482x;
            e.mo63774a(str, "Constraints not met: Cancelling work ID " + a2);
            C21361v b = this.f54490v.mo63720b(a2);
            if (b != null) {
                this.f54484b.mo63373a0(b);
            }
        }
    }

    /* renamed from: b */
    public void mo63220b(@C0359n0 String str) {
        if (this.f54491w == null) {
            mo63225g();
        }
        if (!this.f54491w.booleanValue()) {
            C21377l.m98582e().mo63778f(f54482x, "Ignoring schedule request in non-main process");
            return;
        }
        mo63226h();
        C21377l e = C21377l.m98582e();
        String str2 = f54482x;
        e.mo63774a(str2, "Cancelling work ID " + str);
        C21105a aVar = this.f54487e;
        if (aVar != null) {
            aVar.mo63217b(str);
        }
        for (C21361v a0 : this.f54490v.mo63722d(str)) {
            this.f54484b.mo63373a0(a0);
        }
    }

    /* renamed from: c */
    public void mo63221c(@C0359n0 C21249u... uVarArr) {
        if (this.f54491w == null) {
            mo63225g();
        }
        if (!this.f54491w.booleanValue()) {
            C21377l.m98582e().mo63778f(f54482x, "Ignoring schedule request in a secondary process");
            return;
        }
        mo63226h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C21249u uVar : uVarArr) {
            if (!this.f54490v.mo63719a(C21273x.m98280a(uVar))) {
                long c = uVar.mo63461c();
                long currentTimeMillis = System.currentTimeMillis();
                if (uVar.f54805b == WorkInfo.State.ENQUEUED) {
                    if (currentTimeMillis < c) {
                        C21105a aVar = this.f54487e;
                        if (aVar != null) {
                            aVar.mo63216a(uVar);
                        }
                    } else if (uVar.mo63454B()) {
                        if (uVar.f54813j.mo63133h()) {
                            C21377l.m98582e().mo63774a(f54482x, "Ignoring " + uVar + ". Requires device idle.");
                        } else if (uVar.f54813j.mo63129e()) {
                            C21377l.m98582e().mo63774a(f54482x, "Ignoring " + uVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f54804a);
                        }
                    } else if (!this.f54490v.mo63719a(C21273x.m98280a(uVar))) {
                        C21377l.m98582e().mo63774a(f54482x, "Starting work for " + uVar.f54804a);
                        this.f54484b.mo63370X(this.f54490v.mo63724f(uVar));
                    }
                }
            }
        }
        synchronized (this.f54489g) {
            if (!hashSet.isEmpty()) {
                String join = TextUtils.join(",", hashSet2);
                C21377l.m98582e().mo63774a(f54482x, "Starting tracking for " + join);
                this.f54486d.addAll(hashSet);
                this.f54485c.mo63305a(this.f54486d);
            }
        }
    }

    /* renamed from: d */
    public void mo63222d(@C0359n0 C21237m mVar, boolean z) {
        this.f54490v.mo63720b(mVar);
        mo63227i(mVar);
    }

    /* renamed from: e */
    public boolean mo63223e() {
        return false;
    }

    /* renamed from: f */
    public void mo63224f(@C0359n0 List<C21249u> list) {
        for (C21249u a : list) {
            C21237m a2 = C21273x.m98280a(a);
            if (!this.f54490v.mo63719a(a2)) {
                C21377l e = C21377l.m98582e();
                String str = f54482x;
                e.mo63774a(str, "Constraints met: Scheduling work ID " + a2);
                this.f54484b.mo63370X(this.f54490v.mo63723e(a2));
            }
        }
    }

    /* renamed from: g */
    public final void mo63225g() {
        this.f54491w = Boolean.valueOf(C21349u.m98478b(this.f54483a, this.f54484b.mo63065o()));
    }

    /* renamed from: h */
    public final void mo63226h() {
        if (!this.f54488f) {
            this.f54484b.mo63359L().mo63604g(this);
            this.f54488f = true;
        }
    }

    /* renamed from: i */
    public final void mo63227i(@C0359n0 C21237m mVar) {
        synchronized (this.f54489g) {
            Iterator<C21249u> it = this.f54486d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C21249u next = it.next();
                if (C21273x.m98280a(next).equals(mVar)) {
                    C21377l e = C21377l.m98582e();
                    String str = f54482x;
                    e.mo63774a(str, "Stopping tracking for " + mVar);
                    this.f54486d.remove(next);
                    this.f54485c.mo63305a(this.f54486d);
                    break;
                }
            }
        }
    }

    @C0344h1
    /* renamed from: j */
    public void mo63228j(@C0359n0 C21105a aVar) {
        this.f54487e = aVar;
    }

    @C0344h1
    public C21107b(@C0359n0 Context context, @C0359n0 C21191g0 g0Var, @C0359n0 C21152d dVar) {
        this.f54483a = context;
        this.f54484b = g0Var;
        this.f54485c = dVar;
        this.f54489g = new Object();
    }
}
