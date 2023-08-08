package kotlinx.coroutines.debug.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C10931e;
import kotlin.collections.C10934f;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import kotlin.jvm.internal.markers.C11351g;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.channels.C11753k;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
public final class ConcurrentWeakMap<K, V> extends C10931e<K, V> {
    @C12579k

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f29193b;
    @C12579k

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f29194c;
    @C11394v
    private volatile int _size;
    @C12580l

    /* renamed from: a */
    public final ReferenceQueue<K> f29195a;
    @C11394v
    @C12580l
    private volatile Object core;

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a */
    public final class C11774a {
        @C12579k

        /* renamed from: g */
        public static final AtomicIntegerFieldUpdater f29196g = AtomicIntegerFieldUpdater.newUpdater(C11774a.class, "load");

        /* renamed from: a */
        public final int f29197a;

        /* renamed from: b */
        public final int f29198b;

        /* renamed from: c */
        public final int f29199c;
        @C12579k

        /* renamed from: d */
        public final AtomicReferenceArray f29200d;
        @C12579k

        /* renamed from: e */
        public final AtomicReferenceArray f29201e;
        @C11394v
        private volatile int load;

        @C11363r0({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
        /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a */
        public final class C11775a<E> implements Iterator<E>, C11348d {
            @C12579k

            /* renamed from: a */
            public final C11304p<K, V, E> f29203a;

            /* renamed from: b */
            public int f29204b = -1;

            /* renamed from: c */
            public K f29205c;

            /* renamed from: d */
            public V f29206d;

            public C11775a(@C12579k C11304p<? super K, ? super V, ? extends E> pVar) {
                this.f29203a = pVar;
                mo23974b();
            }

            /* renamed from: b */
            public final void mo23974b() {
                K k;
                while (true) {
                    int i = this.f29204b + 1;
                    this.f29204b = i;
                    if (i < C11774a.this.f29197a) {
                        C11791g gVar = (C11791g) C11774a.this.f29200d.get(this.f29204b);
                        if (!(gVar == null || (k = gVar.get()) == null)) {
                            this.f29205c = k;
                            V v = C11774a.this.f29201e.get(this.f29204b);
                            if (v instanceof C11792h) {
                                v = ((C11792h) v).f29255a;
                            }
                            if (v != null) {
                                this.f29206d = v;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            @C12579k
            /* renamed from: c */
            public Void remove() {
                Void unused = C11786b.m46907e();
                throw new KotlinNothingValueException();
            }

            public boolean hasNext() {
                return this.f29204b < C11774a.this.f29197a;
            }

            public E next() {
                if (this.f29204b < C11774a.this.f29197a) {
                    C11304p<K, V, E> pVar = this.f29203a;
                    K k = this.f29205c;
                    if (k == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("key");
                        k = C11079d2.f28267a;
                    }
                    V v = this.f29206d;
                    if (v == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("value");
                        v = C11079d2.f28267a;
                    }
                    E invoke = pVar.invoke(k, v);
                    mo23974b();
                    return invoke;
                }
                throw new NoSuchElementException();
            }
        }

        public C11774a(int i) {
            this.f29197a = i;
            this.f29198b = Integer.numberOfLeadingZeros(i) + 1;
            this.f29199c = (i * 2) / 3;
            this.f29200d = new AtomicReferenceArray(i);
            this.f29201e = new AtomicReferenceArray(i);
        }

        /* renamed from: i */
        public static /* synthetic */ Object m46813i(C11774a aVar, Object obj, Object obj2, C11791g gVar, int i, Object obj3) {
            if ((i & 4) != 0) {
                gVar = null;
            }
            return aVar.mo23970h(obj, obj2, gVar);
        }

        /* renamed from: d */
        public final void mo23966d(@C12579k C11791g<?> gVar) {
            int f = mo23968f(gVar.f29254a);
            while (true) {
                C11791g<?> gVar2 = (C11791g) this.f29200d.get(f);
                if (gVar2 != null) {
                    if (gVar2 == gVar) {
                        mo23972k(f);
                        return;
                    }
                    if (f == 0) {
                        f = this.f29197a;
                    }
                    f--;
                } else {
                    return;
                }
            }
        }

        @C12580l
        /* renamed from: e */
        public final V mo23967e(@C12579k K k) {
            int f = mo23968f(k.hashCode());
            while (true) {
                C11791g gVar = (C11791g) this.f29200d.get(f);
                if (gVar == null) {
                    return null;
                }
                Object obj = gVar.get();
                if (Intrinsics.areEqual((Object) k, obj)) {
                    V v = this.f29201e.get(f);
                    if (v instanceof C11792h) {
                        return ((C11792h) v).f29255a;
                    }
                    return v;
                }
                if (obj == null) {
                    mo23972k(f);
                }
                if (f == 0) {
                    f = this.f29197a;
                }
                f--;
            }
        }

        /* renamed from: f */
        public final int mo23968f(int i) {
            return (i * -1640531527) >>> this.f29198b;
        }

        @C12579k
        /* renamed from: g */
        public final <E> Iterator<E> mo23969g(@C12579k C11304p<? super K, ? super V, ? extends E> pVar) {
            return new C11775a(pVar);
        }

        @C12580l
        /* renamed from: h */
        public final Object mo23970h(@C12579k K k, @C12580l V v, @C12580l C11791g<K> gVar) {
            Object obj;
            int i;
            int f = mo23968f(k.hashCode());
            boolean z = false;
            while (true) {
                C11791g gVar2 = (C11791g) this.f29200d.get(f);
                if (gVar2 == null) {
                    if (v != null) {
                        if (!z) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29196g;
                            do {
                                i = atomicIntegerFieldUpdater.get(this);
                                if (i >= this.f29199c) {
                                    return C11786b.f29240c;
                                }
                            } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                            z = true;
                        }
                        if (gVar == null) {
                            gVar = new C11791g<>(k, ConcurrentWeakMap.this.f29195a);
                        }
                        if (C11753k.m46648a(this.f29200d, f, (Object) null, gVar)) {
                            break;
                        }
                    } else {
                        return null;
                    }
                } else {
                    Object obj2 = gVar2.get();
                    if (!Intrinsics.areEqual((Object) k, obj2)) {
                        if (obj2 == null) {
                            mo23972k(f);
                        }
                        if (f == 0) {
                            f = this.f29197a;
                        }
                        f--;
                    } else if (z) {
                        f29196g.decrementAndGet(this);
                    }
                }
            }
            do {
                obj = this.f29201e.get(f);
                if (obj instanceof C11792h) {
                    return C11786b.f29240c;
                }
            } while (!C11753k.m46648a(this.f29201e, f, obj, v));
            return obj;
        }

        @C12579k
        /* renamed from: j */
        public final ConcurrentWeakMap<K, V>.a mo23971j() {
            Object obj;
            Object obj2;
            while (true) {
                ConcurrentWeakMap<K, V>.a aVar = new C11774a(Integer.highestOneBit(C11479u.m44447u(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i = this.f29197a;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        return aVar;
                    }
                    C11791g gVar = (C11791g) this.f29200d.get(i2);
                    if (gVar != null) {
                        obj = gVar.get();
                    } else {
                        obj = null;
                    }
                    if (gVar != null && obj == null) {
                        mo23972k(i2);
                    }
                    while (true) {
                        obj2 = this.f29201e.get(i2);
                        if (!(obj2 instanceof C11792h)) {
                            if (C11753k.m46648a(this.f29201e, i2, obj2, C11786b.m46906d(obj2))) {
                                break;
                            }
                        } else {
                            obj2 = ((C11792h) obj2).f29255a;
                            break;
                        }
                    }
                    if (obj == null || obj2 == null || aVar.mo23970h(obj, obj2, gVar) != C11786b.f29240c) {
                        i2++;
                    }
                }
            }
        }

        /* renamed from: k */
        public final void mo23972k(int i) {
            Object obj;
            do {
                obj = this.f29201e.get(i);
                if (obj == null || (obj instanceof C11792h)) {
                    return;
                }
            } while (!C11753k.m46648a(this.f29201e, i, obj, (Object) null));
            ConcurrentWeakMap.this.mo23962j();
        }

        /* renamed from: l */
        public final void mo23973l(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, C11300l<? super Integer, Integer> lVar, Object obj) {
            int i;
            do {
                i = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, lVar.invoke(Integer.valueOf(i)).intValue()));
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$b */
    public static final class C11776b<K, V> implements Map.Entry<K, V>, C11351g.C11352a {

        /* renamed from: a */
        public final K f29208a;

        /* renamed from: b */
        public final V f29209b;

        public C11776b(K k, V v) {
            this.f29208a = k;
            this.f29209b = v;
        }

        public K getKey() {
            return this.f29208a;
        }

        public V getValue() {
            return this.f29209b;
        }

        public V setValue(V v) {
            Void unused = C11786b.m46907e();
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$c */
    public final class C11777c<E> extends C10934f<E> {
        @C12579k

        /* renamed from: a */
        public final C11304p<K, V, E> f29210a;

        public C11777c(@C12579k C11304p<? super K, ? super V, ? extends E> pVar) {
            this.f29210a = pVar;
        }

        public boolean add(E e) {
            Void unused = C11786b.m46907e();
            throw new KotlinNothingValueException();
        }

        /* renamed from: e */
        public int mo15840e() {
            return ConcurrentWeakMap.this.size();
        }

        @C12579k
        public Iterator<E> iterator() {
            return ((C11774a) ConcurrentWeakMap.f29194c.get(ConcurrentWeakMap.this)).mo23969g(this.f29210a);
        }
    }

    static {
        Class<ConcurrentWeakMap> cls = ConcurrentWeakMap.class;
        f29193b = AtomicIntegerFieldUpdater.newUpdater(cls, "_size");
        f29194c = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "core");
    }

    public ConcurrentWeakMap() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public Set<Map.Entry<K, V>> mo15814a() {
        return new C11777c(ConcurrentWeakMap$entries$1.f29212f);
    }

    @C12579k
    /* renamed from: b */
    public Set<K> mo15815b() {
        return new C11777c(ConcurrentWeakMap$keys$1.f29213f);
    }

    /* renamed from: c */
    public int mo15816c() {
        return f29193b.get(this);
    }

    public void clear() {
        for (Object remove : keySet()) {
            remove(remove);
        }
    }

    @C12580l
    public V get(@C12580l Object obj) {
        if (obj == null) {
            return null;
        }
        return ((C11774a) f29194c.get(this)).mo23967e(obj);
    }

    /* renamed from: i */
    public final void mo23961i(C11791g<?> gVar) {
        ((C11774a) f29194c.get(this)).mo23966d(gVar);
    }

    /* renamed from: j */
    public final void mo23962j() {
        f29193b.decrementAndGet(this);
    }

    /* renamed from: l */
    public final synchronized V mo23963l(K k, V v) {
        V i;
        ConcurrentWeakMap<K, V>.a aVar = (C11774a) f29194c.get(this);
        while (true) {
            i = C11774a.m46813i(aVar, k, v, (C11791g) null, 4, (Object) null);
            if (i == C11786b.f29240c) {
                aVar = aVar.mo23971j();
                f29194c.set(this, aVar);
            }
        }
        return i;
    }

    /* renamed from: m */
    public final void mo23964m() {
        boolean z;
        if (this.f29195a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            while (true) {
                try {
                    Reference<? extends K> remove = this.f29195a.remove();
                    Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                    mo23961i((C11791g) remove);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
    }

    @C12580l
    public V put(@C12579k K k, @C12579k V v) {
        V i = C11774a.m46813i((C11774a) f29194c.get(this), k, v, (C11791g) null, 4, (Object) null);
        if (i == C11786b.f29240c) {
            i = mo23963l(k, v);
        }
        if (i == null) {
            f29193b.incrementAndGet(this);
        }
        return i;
    }

    @C12580l
    public V remove(@C12580l Object obj) {
        if (obj == null) {
            return null;
        }
        V i = C11774a.m46813i((C11774a) f29194c.get(this), obj, (Object) null, (C11791g) null, 4, (Object) null);
        if (i == C11786b.f29240c) {
            i = mo23963l(obj, (Object) null);
        }
        if (i != null) {
            f29193b.decrementAndGet(this);
        }
        return i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConcurrentWeakMap(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public ConcurrentWeakMap(boolean z) {
        this.core = new C11774a(16);
        this.f29195a = z ? new ReferenceQueue<>() : null;
    }
}
