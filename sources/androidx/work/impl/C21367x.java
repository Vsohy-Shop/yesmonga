package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.C21377l;
import androidx.work.C21379m;
import androidx.work.C21397o;
import androidx.work.C21411u;
import androidx.work.C21414w;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.C21303e;
import androidx.work.impl.utils.C21355z;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.x */
public class C21367x extends C21411u {

    /* renamed from: j */
    public static final String f55098j = C21377l.m98584i("WorkContinuationImpl");

    /* renamed from: a */
    public final C21191g0 f55099a;

    /* renamed from: b */
    public final String f55100b;

    /* renamed from: c */
    public final ExistingWorkPolicy f55101c;

    /* renamed from: d */
    public final List<? extends C21414w> f55102d;

    /* renamed from: e */
    public final List<String> f55103e;

    /* renamed from: f */
    public final List<String> f55104f;

    /* renamed from: g */
    public final List<C21367x> f55105g;

    /* renamed from: h */
    public boolean f55106h;

    /* renamed from: i */
    public C21397o f55107i;

    public C21367x(@C0359n0 C21191g0 g0Var, @C0359n0 List<? extends C21414w> list) {
        this(g0Var, (String) null, ExistingWorkPolicy.KEEP, list, (List<C21367x>) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p */
    public static boolean m98530p(@C0359n0 C21367x xVar, @C0359n0 Set<String> set) {
        set.addAll(xVar.mo63737j());
        Set<String> s = m98531s(xVar);
        for (String contains : set) {
            if (s.contains(contains)) {
                return true;
            }
        }
        List<C21367x> l = xVar.mo63739l();
        if (l != null && !l.isEmpty()) {
            for (C21367x p : l) {
                if (m98530p(p, set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.mo63737j());
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: s */
    public static Set<String> m98531s(@C0359n0 C21367x xVar) {
        HashSet hashSet = new HashSet();
        List<C21367x> l = xVar.mo63739l();
        if (l != null && !l.isEmpty()) {
            for (C21367x j : l) {
                hashSet.addAll(j.mo63737j());
            }
        }
        return hashSet;
    }

    @C0359n0
    /* renamed from: b */
    public C21411u mo63730b(@C0359n0 List<C21411u> list) {
        C21379m mVar = (C21379m) new C21379m.C21380a(CombineContinuationsWorker.class).mo63786C(ArrayCreatingInputMerger.class).mo63862b();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C21411u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((C21367x) it.next());
        }
        return new C21367x(this.f55099a, (String) null, ExistingWorkPolicy.KEEP, Collections.singletonList(mVar), arrayList);
    }

    @C0359n0
    /* renamed from: c */
    public C21397o mo63731c() {
        if (!this.f55106h) {
            C21303e eVar = new C21303e(this);
            this.f55099a.mo63365R().mo63700c(eVar);
            this.f55107i = eVar.mo63638d();
        } else {
            C21377l e = C21377l.m98582e();
            String str = f55098j;
            e.mo63782l(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f55103e) + ")");
        }
        return this.f55107i;
    }

    @C0359n0
    /* renamed from: d */
    public C32487a<List<WorkInfo>> mo63732d() {
        C21355z<List<WorkInfo>> a = C21355z.m98485a(this.f55099a, this.f55104f);
        this.f55099a.mo63365R().mo63700c(a);
        return a.mo63710f();
    }

    @C0359n0
    /* renamed from: e */
    public LiveData<List<WorkInfo>> mo63733e() {
        return this.f55099a.mo63364Q(this.f55104f);
    }

    @C0359n0
    /* renamed from: g */
    public C21411u mo63734g(@C0359n0 List<C21379m> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new C21367x(this.f55099a, this.f55100b, ExistingWorkPolicy.KEEP, list, Collections.singletonList(this));
    }

    @C0359n0
    /* renamed from: h */
    public List<String> mo63735h() {
        return this.f55104f;
    }

    @C0359n0
    /* renamed from: i */
    public ExistingWorkPolicy mo63736i() {
        return this.f55101c;
    }

    @C0359n0
    /* renamed from: j */
    public List<String> mo63737j() {
        return this.f55103e;
    }

    @C0363p0
    /* renamed from: k */
    public String mo63738k() {
        return this.f55100b;
    }

    @C0363p0
    /* renamed from: l */
    public List<C21367x> mo63739l() {
        return this.f55105g;
    }

    @C0359n0
    /* renamed from: m */
    public List<? extends C21414w> mo63740m() {
        return this.f55102d;
    }

    @C0359n0
    /* renamed from: n */
    public C21191g0 mo63741n() {
        return this.f55099a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: o */
    public boolean mo63742o() {
        return m98530p(this, new HashSet());
    }

    /* renamed from: q */
    public boolean mo63743q() {
        return this.f55106h;
    }

    /* renamed from: r */
    public void mo63744r() {
        this.f55106h = true;
    }

    public C21367x(@C0359n0 C21191g0 g0Var, @C0363p0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 List<? extends C21414w> list) {
        this(g0Var, str, existingWorkPolicy, list, (List<C21367x>) null);
    }

    public C21367x(@C0359n0 C21191g0 g0Var, @C0363p0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 List<? extends C21414w> list, @C0363p0 List<C21367x> list2) {
        this.f55099a = g0Var;
        this.f55100b = str;
        this.f55101c = existingWorkPolicy;
        this.f55102d = list;
        this.f55105g = list2;
        this.f55103e = new ArrayList(list.size());
        this.f55104f = new ArrayList();
        if (list2 != null) {
            for (C21367x xVar : list2) {
                this.f55104f.addAll(xVar.f55104f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String b = ((C21414w) list.get(i)).mo63858b();
            this.f55103e.add(b);
            this.f55104f.add(b);
        }
    }
}
