package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.C0346i;
import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C11079d2;
import kotlin.collections.C10930d1;
import kotlin.collections.C10933e1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.t0 */
public abstract class C19805t0 {
    @C12579k

    /* renamed from: a */
    public final ReentrantLock f50659a = new ReentrantLock(true);
    @C12579k

    /* renamed from: b */
    public final C11940j<List<NavBackStackEntry>> f50660b;
    @C12579k

    /* renamed from: c */
    public final C11940j<Set<NavBackStackEntry>> f50661c;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: d */
    public boolean f50662d;
    @C12579k

    /* renamed from: e */
    public final C11952u<List<NavBackStackEntry>> f50663e;
    @C12579k

    /* renamed from: f */
    public final C11952u<Set<NavBackStackEntry>> f50664f;

    public C19805t0() {
        C11940j<List<NavBackStackEntry>> a = C11953v.m47628a(CollectionsKt__CollectionsKt.m40441E());
        this.f50660b = a;
        C11940j<Set<NavBackStackEntry>> a2 = C11953v.m47628a(C10930d1.m40892k());
        this.f50661c = a2;
        this.f50663e = C11909g.m47470m(a);
        this.f50664f = C11909g.m47470m(a2);
    }

    @C12579k
    /* renamed from: a */
    public abstract NavBackStackEntry mo58169a(@C12579k NavDestination navDestination, @C12580l Bundle bundle);

    @C12579k
    /* renamed from: b */
    public final C11952u<List<NavBackStackEntry>> mo58589b() {
        return this.f50663e;
    }

    @C12579k
    /* renamed from: c */
    public final C11952u<Set<NavBackStackEntry>> mo58590c() {
        return this.f50664f;
    }

    /* renamed from: d */
    public final boolean mo58591d() {
        return this.f50662d;
    }

    /* renamed from: e */
    public void mo58170e(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, C33541p.f81644a);
        C11940j<Set<NavBackStackEntry>> jVar = this.f50661c;
        jVar.setValue(C10933e1.m40917y(jVar.getValue(), navBackStackEntry));
    }

    @C0346i
    /* renamed from: f */
    public void mo58592f(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "backStackEntry");
        C11940j<List<NavBackStackEntry>> jVar = this.f50660b;
        jVar.setValue(CollectionsKt___CollectionsKt.m40723z4(CollectionsKt___CollectionsKt.m40658l4(jVar.getValue(), CollectionsKt___CollectionsKt.m40653k3(this.f50660b.getValue())), navBackStackEntry));
    }

    /* renamed from: g */
    public void mo58171g(@C12579k NavBackStackEntry navBackStackEntry, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
        ReentrantLock reentrantLock = this.f50659a;
        reentrantLock.lock();
        try {
            C11940j<List<NavBackStackEntry>> jVar = this.f50660b;
            ArrayList arrayList = new ArrayList();
            Iterator it = jVar.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(!Intrinsics.areEqual((Object) (NavBackStackEntry) next, (Object) navBackStackEntry))) {
                    break;
                }
                arrayList.add(next);
            }
            jVar.setValue(arrayList);
            C11079d2 d2Var = C11079d2.f28267a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public void mo58172h(@C12579k NavBackStackEntry navBackStackEntry, boolean z) {
        Object obj;
        boolean z2;
        Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
        C11940j<Set<NavBackStackEntry>> jVar = this.f50661c;
        jVar.setValue(C10933e1.m40912D(jVar.getValue(), navBackStackEntry));
        List value = this.f50663e.getValue();
        ListIterator listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (Intrinsics.areEqual((Object) navBackStackEntry2, (Object) navBackStackEntry) || this.f50663e.getValue().lastIndexOf(navBackStackEntry2) >= this.f50663e.getValue().lastIndexOf(navBackStackEntry)) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
        if (navBackStackEntry3 != null) {
            C11940j<Set<NavBackStackEntry>> jVar2 = this.f50661c;
            jVar2.setValue(C10933e1.m40912D(jVar2.getValue(), navBackStackEntry3));
        }
        mo58171g(navBackStackEntry, z);
    }

    /* renamed from: i */
    public void mo58173i(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f50659a;
        reentrantLock.lock();
        try {
            C11940j<List<NavBackStackEntry>> jVar = this.f50660b;
            jVar.setValue(CollectionsKt___CollectionsKt.m40723z4(jVar.getValue(), navBackStackEntry));
            C11079d2 d2Var = C11079d2.f28267a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j */
    public void mo58593j(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "backStackEntry");
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt___CollectionsKt.m40677q3(this.f50663e.getValue());
        if (navBackStackEntry2 != null) {
            C11940j<Set<NavBackStackEntry>> jVar = this.f50661c;
            jVar.setValue(C10933e1.m40912D(jVar.getValue(), navBackStackEntry2));
        }
        C11940j<Set<NavBackStackEntry>> jVar2 = this.f50661c;
        jVar2.setValue(C10933e1.m40912D(jVar2.getValue(), navBackStackEntry));
        mo58173i(navBackStackEntry);
    }

    /* renamed from: k */
    public final void mo58594k(boolean z) {
        this.f50662d = z;
    }
}
