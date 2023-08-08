package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C11990f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n107#1,7:270\n1#2:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n115#1:270,7\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.f */
public abstract class C11990f<N extends C11990f<N>> {
    @C12579k

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f29592a;
    @C12579k

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f29593b;
    @C11394v
    @C12580l
    private volatile Object _next;
    @C11394v
    @C12580l
    private volatile Object _prev;

    static {
        Class<C11990f> cls = C11990f.class;
        Class<Object> cls2 = Object.class;
        f29592a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f29593b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public C11990f(@C12580l N n) {
        this._prev = n;
    }

    /* renamed from: n */
    private final void m47823n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, ? extends Object> lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!C16563a.m75000a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    /* renamed from: b */
    public final void mo24349b() {
        f29593b.lazySet(this, (Object) null);
    }

    /* renamed from: c */
    public final N mo24350c() {
        N g = mo24354g();
        while (g != null && g.mo24355h()) {
            g = (C11990f) f29593b.get(g);
        }
        return g;
    }

    /* renamed from: d */
    public final N mo24351d() {
        N e;
        N e2 = mo24352e();
        Intrinsics.checkNotNull(e2);
        while (e2.mo24355h() && (e = e2.mo24352e()) != null) {
            e2 = e;
        }
        return e2;
    }

    @C12580l
    /* renamed from: e */
    public final N mo24352e() {
        N a = mo24353f();
        if (a == C11988e.f29587b) {
            return null;
        }
        return (C11990f) a;
    }

    /* renamed from: f */
    public final Object mo24353f() {
        return f29592a.get(this);
    }

    @C12580l
    /* renamed from: g */
    public final N mo24354g() {
        return (C11990f) f29593b.get(this);
    }

    /* renamed from: h */
    public abstract boolean mo24355h();

    /* renamed from: i */
    public final boolean mo24356i() {
        return mo24352e() == null;
    }

    /* renamed from: j */
    public final boolean mo24357j() {
        return C16563a.m75000a(f29592a, this, (Object) null, C11988e.f29587b);
    }

    @C12580l
    /* renamed from: k */
    public final N mo24358k(@C12579k C11289a aVar) {
        N a = mo24353f();
        if (a != C11988e.f29587b) {
            return (C11990f) a;
        }
        aVar.invoke();
        throw new KotlinNothingValueException();
    }

    /* renamed from: l */
    public final void mo24359l() {
        Object obj;
        C11990f fVar;
        if (!mo24356i()) {
            while (true) {
                C11990f c = mo24350c();
                C11990f d = mo24351d();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29593b;
                do {
                    obj = atomicReferenceFieldUpdater.get(d);
                    if (((C11990f) obj) == null) {
                        fVar = null;
                    } else {
                        fVar = c;
                    }
                } while (!C16563a.m75000a(atomicReferenceFieldUpdater, d, obj, fVar));
                if (c != null) {
                    f29592a.set(c, d);
                }
                if ((!d.mo24355h() || d.mo24356i()) && (c == null || !c.mo24355h())) {
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    public final boolean mo24360m(@C12579k N n) {
        return C16563a.m75000a(f29592a, this, (Object) null, n);
    }
}
