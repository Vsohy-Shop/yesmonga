package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,107:1\n41#1:108\n41#1:109\n35#1,7:110\n41#1:127\n1549#2:117\n1620#2,2:118\n1622#2:122\n1549#2:123\n1620#2,3:124\n101#3,2:120\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n35#1:108\n54#1:109\n76#1:110,7\n92#1:127\n77#1:117\n77#1:118,2\n77#1:122\n91#1:123\n91#1:124,3\n79#1:120,2\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.e0 */
public final class C11989e0<T> {
    @C12579k

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f29588d = AtomicIntegerFieldUpdater.newUpdater(C11989e0.class, "controlState");

    /* renamed from: a */
    public final int f29589a;
    @C12579k

    /* renamed from: b */
    public final C11300l<Integer, T> f29590b;
    @C12579k

    /* renamed from: c */
    public final AtomicReferenceArray f29591c;
    @C11394v
    private volatile int controlState;

    public C11989e0(int i, @C12579k C11300l<? super Integer, ? extends T> lVar) {
        this.f29589a = i;
        this.f29590b = lVar;
        this.f29591c = new AtomicReferenceArray(i);
    }

    /* renamed from: a */
    public final boolean mo24342a() {
        int i;
        boolean z;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29588d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            if (i >= this.f29589a) {
                return true;
            }
        } while (!f29588d.compareAndSet(this, i, i + 1));
        this.f29591c.set(i, this.f29590b.invoke(Integer.valueOf(i)));
        return true;
    }

    @C12579k
    /* renamed from: b */
    public final List<T> mo24343b() {
        int i;
        boolean z;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29588d;
        while (true) {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (f29588d.compareAndSet(this, i, Integer.MIN_VALUE | i)) {
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        C11466l W1 = C11479u.m44378W1(0, i);
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            int c = ((C10953k0) it).mo6374c();
            do {
                andSet = this.f29591c.getAndSet(c, (Object) null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo24344c(int i) {
        return (i & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: d */
    public final void mo24345d(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, C11300l<? super Integer, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    @C12579k
    /* renamed from: e */
    public final String mo24346e() {
        String str;
        int i = f29588d.get(this);
        boolean z = false;
        C11466l W1 = C11479u.m44378W1(0, Integer.MAX_VALUE & i);
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f29591c.get(((C10953k0) it).mo6374c()));
        }
        String obj = arrayList.toString();
        if ((i & Integer.MIN_VALUE) != 0) {
            z = true;
        }
        if (z) {
            str = "[closed]";
        } else {
            str = "";
        }
        return obj + str;
    }

    /* renamed from: f */
    public final int mo24347f() {
        int i;
        boolean z;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29588d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return 0;
            }
        } while (!f29588d.compareAndSet(this, i, Integer.MIN_VALUE | i));
        return i;
    }

    @C12579k
    public String toString() {
        return "OnDemandAllocatingPool(" + mo24346e() + ')';
    }
}
