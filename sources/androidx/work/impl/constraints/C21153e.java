package androidx.work.impl.constraints;

import androidx.annotation.C0344h1;
import androidx.work.C21377l;
import androidx.work.impl.constraints.controllers.C21140a;
import androidx.work.impl.constraints.controllers.C21141b;
import androidx.work.impl.constraints.controllers.C21142c;
import androidx.work.impl.constraints.controllers.C21144d;
import androidx.work.impl.constraints.controllers.C21145e;
import androidx.work.impl.constraints.controllers.C21147f;
import androidx.work.impl.constraints.controllers.C21149g;
import androidx.work.impl.constraints.controllers.C21150h;
import androidx.work.impl.constraints.trackers.C21172o;
import androidx.work.impl.model.C21249u;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.work.impl.constraints.e */
public final class C21153e implements C21152d, C21142c.C21143a {
    @C12580l

    /* renamed from: a */
    public final C21139c f54599a;
    @C12579k

    /* renamed from: b */
    public final C21142c<?>[] f54600b;
    @C12579k

    /* renamed from: c */
    public final Object f54601c;

    @C0344h1
    public C21153e(@C12580l C21139c cVar, @C12579k C21142c<?>[] cVarArr) {
        Intrinsics.checkNotNullParameter(cVarArr, "constraintControllers");
        this.f54599a = cVar;
        this.f54600b = cVarArr;
        this.f54601c = new Object();
    }

    /* renamed from: a */
    public void mo63305a(@C12579k Iterable<C21249u> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "workSpecs");
        synchronized (this.f54601c) {
            for (C21142c<?> h : this.f54600b) {
                h.mo63296h((C21142c.C21143a) null);
            }
            for (C21142c<?> f : this.f54600b) {
                f.mo63294f(iterable);
            }
            for (C21142c<?> h2 : this.f54600b) {
                h2.mo63296h(this);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: b */
    public void mo63298b(@C12579k List<C21249u> list) {
        Intrinsics.checkNotNullParameter(list, "workSpecs");
        synchronized (this.f54601c) {
            ArrayList<C21249u> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (mo63307d(((C21249u) next).f54804a)) {
                    arrayList.add(next);
                }
            }
            for (C21249u uVar : arrayList) {
                C21377l e = C21377l.m98582e();
                String a = C21154f.f54602a;
                e.mo63774a(a, "Constraints met for " + uVar);
            }
            C21139c cVar = this.f54599a;
            if (cVar != null) {
                cVar.mo63224f(arrayList);
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    /* renamed from: c */
    public void mo63299c(@C12579k List<C21249u> list) {
        Intrinsics.checkNotNullParameter(list, "workSpecs");
        synchronized (this.f54601c) {
            C21139c cVar = this.f54599a;
            if (cVar != null) {
                cVar.mo63219a(list);
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo63307d(@C12579k String str) {
        boolean z;
        C21142c<?> cVar;
        Intrinsics.checkNotNullParameter(str, "workSpecId");
        synchronized (this.f54601c) {
            C21142c<?>[] cVarArr = this.f54600b;
            int length = cVarArr.length;
            z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArr[i];
                if (cVar.mo63293e(str)) {
                    break;
                }
                i++;
            }
            if (cVar != null) {
                C21377l.m98582e().mo63774a(C21154f.f54602a, "Work " + str + " constrained by " + cVar.getClass().getSimpleName());
            }
            if (cVar == null) {
                z = true;
            }
        }
        return z;
    }

    public void reset() {
        synchronized (this.f54601c) {
            for (C21142c<?> g : this.f54600b) {
                g.mo63295g();
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21153e(@C12579k C21172o oVar, @C12580l C21139c cVar) {
        this(cVar, (C21142c<?>[]) new C21142c[]{new C21140a(oVar.mo63328a()), new C21141b(oVar.mo63329b()), new C21150h(oVar.mo63331d()), new C21144d(oVar.mo63330c()), new C21149g(oVar.mo63330c()), new C21147f(oVar.mo63330c()), new C21145e(oVar.mo63330c())});
        Intrinsics.checkNotNullParameter(oVar, "trackers");
    }
}
