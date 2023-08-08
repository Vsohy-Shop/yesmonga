package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12090r0;
import kotlinx.coroutines.C12177y1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12177y1
@C11363r0({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n73#1,3:369\n1#2:368\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n134#1:369,3\n*E\n"})
public class LockFreeLinkedListNode {
    @C12579k

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f29557a;
    @C12579k

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f29558b;
    @C12579k

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f29559c;
    @C11394v
    @C12580l
    private volatile Object _next = this;
    @C11394v
    @C12580l
    private volatile Object _prev = this;
    @C11394v
    @C12580l
    private volatile Object _removedRef;

    @C11532s0
    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$a */
    public static abstract class C11976a extends C11981b<LockFreeLinkedListNode> {
        @C12579k
        @C11287e

        /* renamed from: b */
        public final LockFreeLinkedListNode f29560b;
        @C12580l
        @C11287e

        /* renamed from: c */
        public LockFreeLinkedListNode f29561c;

        public C11976a(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f29560b = lockFreeLinkedListNode;
        }

        /* renamed from: f */
        public void mo24325c(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode, @C12580l Object obj) {
            boolean z;
            LockFreeLinkedListNode lockFreeLinkedListNode2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                lockFreeLinkedListNode2 = this.f29560b;
            } else {
                lockFreeLinkedListNode2 = this.f29561c;
            }
            if (lockFreeLinkedListNode2 != null && C16563a.m75000a(LockFreeLinkedListNode.f29557a, lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f29560b;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f29561c;
                Intrinsics.checkNotNull(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.mo24313l(lockFreeLinkedListNode4);
            }
        }
    }

    @C11363r0({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n*L\n1#1,367:1\n*E\n"})
    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$b */
    public static final class C11977b extends C11976a {

        /* renamed from: d */
        public final /* synthetic */ C11289a<Boolean> f29562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11977b(LockFreeLinkedListNode lockFreeLinkedListNode, C11289a<Boolean> aVar) {
            super(lockFreeLinkedListNode);
            this.f29562d = aVar;
        }

        @C12580l
        /* renamed from: g */
        public Object mo23685e(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f29562d.invoke().booleanValue()) {
                return null;
            }
            return C12023v.m47976a();
        }
    }

    static {
        Class<LockFreeLinkedListNode> cls = LockFreeLinkedListNode.class;
        Class<Object> cls2 = Object.class;
        f29557a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f29558b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f29559c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* renamed from: r */
    private final void m47739r(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* renamed from: e */
    public final void mo24307e(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode) {
        do {
        } while (!mo24316o().mo24309h(lockFreeLinkedListNode, this));
    }

    /* renamed from: f */
    public final boolean mo24308f(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode, @C12579k C11289a<Boolean> aVar) {
        int x;
        C11977b bVar = new C11977b(lockFreeLinkedListNode, aVar);
        do {
            x = mo24316o().mo24323x(lockFreeLinkedListNode, this, bVar);
            if (x == 1) {
                return true;
            }
        } while (x != 2);
        return false;
    }

    @C11532s0
    /* renamed from: h */
    public final boolean mo24309h(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode, @C12579k LockFreeLinkedListNode lockFreeLinkedListNode2) {
        f29558b.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29557a;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        if (!C16563a.m75000a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            return false;
        }
        lockFreeLinkedListNode.mo24313l(lockFreeLinkedListNode2);
        return true;
    }

    /* renamed from: i */
    public final boolean mo24310i(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode) {
        f29558b.lazySet(lockFreeLinkedListNode, this);
        f29557a.lazySet(lockFreeLinkedListNode, this);
        while (mo24314m() == this) {
            if (C16563a.m75000a(f29557a, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.mo24313l(this);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlinx.coroutines.internal.LockFreeLinkedListNode} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (androidx.concurrent.futures.C16563a.m75000a(r4, r3, r2, ((kotlinx.coroutines.internal.C11997i0) r5).f29597a) != false) goto L_0x0045;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode mo24311j(kotlinx.coroutines.internal.C11993g0 r9) {
        /*
            r8 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29558b
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L_0x000a:
            r3 = r1
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f29557a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L_0x0020
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0016:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f29558b
            boolean r0 = androidx.concurrent.futures.C16563a.m75000a(r1, r8, r0, r2)
            if (r0 != 0) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            return r2
        L_0x0020:
            boolean r6 = r8.mo24317p()
            if (r6 == 0) goto L_0x0027
            return r1
        L_0x0027:
            if (r5 != r9) goto L_0x002a
            return r2
        L_0x002a:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.C11993g0
            if (r6 == 0) goto L_0x0034
            kotlinx.coroutines.internal.g0 r5 = (kotlinx.coroutines.internal.C11993g0) r5
            r5.mo24335b(r2)
            goto L_0x0000
        L_0x0034:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.C11997i0
            if (r6 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0047
            kotlinx.coroutines.internal.i0 r5 = (kotlinx.coroutines.internal.C11997i0) r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = r5.f29597a
            boolean r2 = androidx.concurrent.futures.C16563a.m75000a(r4, r3, r2, r5)
            if (r2 != 0) goto L_0x0045
            goto L_0x0000
        L_0x0045:
            r2 = r3
            goto L_0x000a
        L_0x0047:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f29558b
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L_0x000b
        L_0x0050:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r3)
            r3 = r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.mo24311j(kotlinx.coroutines.internal.g0):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    /* renamed from: k */
    public final LockFreeLinkedListNode mo24312k(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo24317p()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) f29558b.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    /* renamed from: l */
    public final void mo24313l(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29558b;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (mo24314m() != lockFreeLinkedListNode) {
                return;
            }
        } while (!C16563a.m75000a(f29558b, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (mo24317p()) {
            lockFreeLinkedListNode.mo24311j((C11993g0) null);
        }
    }

    @C12579k
    /* renamed from: m */
    public final Object mo24314m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29557a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C11993g0)) {
                return obj;
            }
            ((C11993g0) obj).mo24335b(this);
        }
    }

    @C12579k
    /* renamed from: n */
    public final LockFreeLinkedListNode mo24315n() {
        return C12023v.m47981f(mo24314m());
    }

    @C12579k
    /* renamed from: o */
    public final LockFreeLinkedListNode mo24316o() {
        LockFreeLinkedListNode j = mo24311j((C11993g0) null);
        return j == null ? mo24312k((LockFreeLinkedListNode) f29558b.get(this)) : j;
    }

    /* renamed from: p */
    public boolean mo24317p() {
        return mo24314m() instanceof C11997i0;
    }

    @C12579k
    @C11532s0
    /* renamed from: s */
    public final C11976a mo24318s(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode, @C12579k C11289a<Boolean> aVar) {
        return new C11977b(lockFreeLinkedListNode, aVar);
    }

    @C12580l
    /* renamed from: t */
    public LockFreeLinkedListNode mo24319t() {
        Object m = mo24314m();
        C11997i0 i0Var = m instanceof C11997i0 ? (C11997i0) m : null;
        if (i0Var != null) {
            return i0Var.f29597a;
        }
        return null;
    }

    @C12579k
    public String toString() {
        return new LockFreeLinkedListNode$toString$1(this) + '@' + C12090r0.m48301b(this);
    }

    /* renamed from: u */
    public boolean mo24320u() {
        return mo24321v() == null;
    }

    @C12580l
    @C11532s0
    /* renamed from: v */
    public final LockFreeLinkedListNode mo24321v() {
        Object m;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            m = mo24314m();
            if (m instanceof C11997i0) {
                return ((C11997i0) m).f29597a;
            }
            if (m == this) {
                return (LockFreeLinkedListNode) m;
            }
            Intrinsics.checkNotNull(m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) m;
        } while (!C16563a.m75000a(f29557a, this, m, lockFreeLinkedListNode.mo24322w()));
        lockFreeLinkedListNode.mo24311j((C11993g0) null);
        return null;
    }

    /* renamed from: w */
    public final C11997i0 mo24322w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29559c;
        C11997i0 i0Var = (C11997i0) atomicReferenceFieldUpdater.get(this);
        if (i0Var != null) {
            return i0Var;
        }
        C11997i0 i0Var2 = new C11997i0(this);
        atomicReferenceFieldUpdater.lazySet(this, i0Var2);
        return i0Var2;
    }

    @C11532s0
    /* renamed from: x */
    public final int mo24323x(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode, @C12579k LockFreeLinkedListNode lockFreeLinkedListNode2, @C12579k C11976a aVar) {
        f29558b.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29557a;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        aVar.f29561c = lockFreeLinkedListNode2;
        if (!C16563a.m75000a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, aVar)) {
            return 0;
        }
        if (aVar.mo24335b(this) == null) {
            return 1;
        }
        return 2;
    }

    /* renamed from: y */
    public final void mo24324y(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode, @C12579k LockFreeLinkedListNode lockFreeLinkedListNode2) {
    }
}
