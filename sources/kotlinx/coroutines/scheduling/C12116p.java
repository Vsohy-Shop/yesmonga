package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.C11394v;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.C11753k;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,255:1\n93#2:256\n93#2:257\n93#2:258\n93#2:261\n93#2:262\n1#3:259\n25#4:260\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n95#1:256\n162#1:257\n185#1:258\n205#1:261\n249#1:262\n205#1:260\n*E\n"})
/* renamed from: kotlinx.coroutines.scheduling.p */
public final class C12116p {
    @C12579k

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f29832b;
    @C12579k

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f29833c;
    @C12579k

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f29834d;
    @C12579k

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f29835e;
    @C12579k

    /* renamed from: a */
    public final AtomicReferenceArray<C12110j> f29836a = new AtomicReferenceArray<>(128);
    @C11394v
    private volatile int blockingTasksInBuffer;
    @C11394v
    private volatile int consumerIndex;
    @C11394v
    @C12580l
    private volatile Object lastScheduledTask;
    @C11394v
    private volatile int producerIndex;

    static {
        Class<C12116p> cls = C12116p.class;
        f29832b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f29833c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f29834d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f29835e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ C12110j m48430b(C12116p pVar, C12110j jVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return pVar.mo24670a(jVar, z);
    }

    @C12580l
    /* renamed from: a */
    public final C12110j mo24670a(@C12579k C12110j jVar, boolean z) {
        if (z) {
            return mo24671c(jVar);
        }
        C12110j jVar2 = (C12110j) f29832b.getAndSet(this, jVar);
        if (jVar2 == null) {
            return null;
        }
        return mo24671c(jVar2);
    }

    /* renamed from: c */
    public final C12110j mo24671c(C12110j jVar) {
        if (mo24673e() == 127) {
            return jVar;
        }
        boolean z = true;
        if (jVar.f29818b.mo24658L() != 1) {
            z = false;
        }
        if (z) {
            f29835e.incrementAndGet(this);
        }
        int i = f29833c.get(this) & 127;
        while (this.f29836a.get(i) != null) {
            Thread.yield();
        }
        this.f29836a.lazySet(i, jVar);
        f29833c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    public final void mo24672d(C12110j jVar) {
        if (jVar != null) {
            boolean z = true;
            if (jVar.f29818b.mo24658L() != 1) {
                z = false;
            }
            if (z) {
                f29835e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: e */
    public final int mo24673e() {
        return f29833c.get(this) - f29834d.get(this);
    }

    /* renamed from: f */
    public final int mo24674f() {
        return f29832b.get(this) != null ? mo24673e() + 1 : mo24673e();
    }

    /* renamed from: g */
    public final void mo24675g(@C12579k C12105e eVar) {
        C12110j jVar = (C12110j) f29832b.getAndSet(this, (Object) null);
        if (jVar != null) {
            eVar.mo24415a(jVar);
        }
        do {
        } while (mo24680l(eVar));
    }

    @C12580l
    /* renamed from: h */
    public final C12110j mo24676h() {
        C12110j jVar = (C12110j) f29832b.getAndSet(this, (Object) null);
        return jVar == null ? mo24678j() : jVar;
    }

    @C12580l
    /* renamed from: i */
    public final C12110j mo24677i() {
        return mo24681m(true);
    }

    /* renamed from: j */
    public final C12110j mo24678j() {
        C12110j andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29834d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f29833c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.f29836a.getAndSet(i2, (Object) null)) != null) {
                mo24672d(andSet);
                return andSet;
            }
        }
    }

    @C12580l
    /* renamed from: k */
    public final C12110j mo24679k() {
        return mo24681m(false);
    }

    /* renamed from: l */
    public final boolean mo24680l(C12105e eVar) {
        C12110j j = mo24678j();
        if (j == null) {
            return false;
        }
        eVar.mo24415a(j);
        return true;
    }

    /* renamed from: m */
    public final C12110j mo24681m(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C12110j jVar;
        do {
            atomicReferenceFieldUpdater = f29832b;
            jVar = (C12110j) atomicReferenceFieldUpdater.get(this);
            if (jVar != null) {
                boolean z2 = true;
                if (jVar.f29818b.mo24658L() != 1) {
                    z2 = false;
                }
                if (z2 == z) {
                }
            }
            int i = f29834d.get(this);
            int i2 = f29833c.get(this);
            while (i != i2) {
                if (z && f29835e.get(this) == 0) {
                    return null;
                }
                i2--;
                C12110j o = mo24683o(i2, z);
                if (o != null) {
                    return o;
                }
            }
            return null;
        } while (!C16563a.m75000a(atomicReferenceFieldUpdater, this, jVar, (Object) null));
        return jVar;
    }

    /* renamed from: n */
    public final C12110j mo24682n(int i) {
        int i2 = f29834d.get(this);
        int i3 = f29833c.get(this);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        while (i2 != i3) {
            if (z && f29835e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            C12110j o = mo24683o(i2, z);
            if (o != null) {
                return o;
            }
            i2 = i4;
        }
        return null;
    }

    /* renamed from: o */
    public final C12110j mo24683o(int i, boolean z) {
        int i2 = i & 127;
        C12110j jVar = this.f29836a.get(i2);
        if (jVar != null) {
            boolean z2 = true;
            if (jVar.f29818b.mo24658L() != 1) {
                z2 = false;
            }
            if (z2 == z && C11753k.m46648a(this.f29836a, i2, jVar, (Object) null)) {
                if (z) {
                    f29835e.decrementAndGet(this);
                }
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: p */
    public final long mo24684p(int i, @C12579k Ref.ObjectRef<C12110j> objectRef) {
        T t;
        if (i == 3) {
            t = mo24678j();
        } else {
            t = mo24682n(i);
        }
        if (t == null) {
            return mo24685q(i, objectRef);
        }
        objectRef.element = t;
        return -1;
    }

    /* renamed from: q */
    public final long mo24685q(int i, Ref.ObjectRef<C12110j> objectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T t;
        boolean z;
        do {
            atomicReferenceFieldUpdater = f29832b;
            t = (C12110j) atomicReferenceFieldUpdater.get(this);
            if (t == null) {
                return -2;
            }
            int i2 = 1;
            if (t.f29818b.mo24658L() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i2 = 2;
            }
            if ((i2 & i) == 0) {
                return -2;
            }
            long a = C12114n.f29826f.mo24661a() - t.f29817a;
            long j = C12114n.f29822b;
            if (a < j) {
                return j - a;
            }
        } while (!C16563a.m75000a(atomicReferenceFieldUpdater, this, t, (Object) null));
        objectRef.element = t;
        return -1;
    }
}
