package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8438a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11351g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n154#1:361\n121#1:362\n155#1,2:364\n125#1:366\n157#1,3:373\n162#1:379\n129#1,4:380\n133#1:385\n121#1:386\n134#1,7:388\n125#1:395\n141#1,6:401\n149#1,3:410\n129#1,4:413\n133#1:418\n121#1:419\n134#1,7:421\n125#1:428\n141#1,6:434\n149#1,3:443\n129#1,4:446\n133#1:451\n121#1:452\n134#1,7:454\n125#1:461\n141#1,6:467\n149#1,3:476\n129#1,4:482\n133#1:487\n121#1:488\n134#1,7:490\n125#1:497\n141#1,6:503\n149#1,3:512\n121#1:515\n121#1:528\n125#1:530\n121#1:541\n125#1:543\n2180#2:363\n2073#2,2:367\n1686#2:369\n2075#2,2:371\n2077#2,3:376\n2180#2:387\n2073#2,2:396\n1686#2:398\n2075#2,2:399\n2077#2,3:407\n2180#2:420\n2073#2,2:429\n1686#2:431\n2075#2,2:432\n2077#2,3:440\n2180#2:453\n2073#2,2:462\n1686#2:464\n2075#2,2:465\n2077#2,3:473\n2180#2:489\n2073#2,2:498\n1686#2:500\n2075#2,2:501\n2077#2,3:509\n2180#2:516\n2180#2:517\n2073#2,2:518\n1686#2:520\n2075#2,5:522\n2180#2:529\n2073#2,2:531\n1686#2:533\n2075#2,2:535\n2077#2,3:538\n2180#2:542\n2073#2,2:544\n1686#2:546\n2075#2,2:548\n2077#2,3:551\n70#3:370\n70#3:384\n70#3:417\n70#3:450\n70#3:486\n70#3:521\n70#3:527\n70#3:534\n70#3:537\n70#3:547\n70#3:550\n288#4,2:479\n1#5:481\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n69#1:361\n69#1:362\n69#1:364,2\n69#1:366\n69#1:373,3\n69#1:379\n70#1:380,4\n70#1:385\n70#1:386\n70#1:388,7\n70#1:395\n70#1:401,6\n70#1:410,3\n71#1:413,4\n71#1:418\n71#1:419\n71#1:421,7\n71#1:428\n71#1:434,6\n71#1:443,3\n72#1:446,4\n72#1:451\n72#1:452\n72#1:454,7\n72#1:461\n72#1:467,6\n72#1:476,3\n85#1:482,4\n85#1:487\n85#1:488\n85#1:490,7\n85#1:497\n85#1:503,6\n85#1:512,3\n117#1:515\n133#1:528\n140#1:530\n154#1:541\n156#1:543\n69#1:363\n69#1:367,2\n69#1:369\n69#1:371,2\n69#1:376,3\n70#1:387\n70#1:396,2\n70#1:398\n70#1:399,2\n70#1:407,3\n71#1:420\n71#1:429,2\n71#1:431\n71#1:432,2\n71#1:440,3\n72#1:453\n72#1:462,2\n72#1:464\n72#1:465,2\n72#1:473,3\n85#1:489\n85#1:498,2\n85#1:500\n85#1:501,2\n85#1:509,3\n117#1:516\n121#1:517\n125#1:518,2\n125#1:520\n125#1:522,5\n133#1:529\n140#1:531,2\n140#1:533\n140#1:535,2\n140#1:538,3\n154#1:542\n156#1:544,2\n156#1:546\n156#1:548,2\n156#1:551,3\n69#1:370\n70#1:384\n71#1:417\n72#1:450\n85#1:486\n125#1:521\n132#1:527\n140#1:534\n141#1:537\n156#1:547\n157#1:550\n77#1:479,2\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.t */
public final class C8667t<K, V> implements Map<K, V>, C8635a0, C11351g {

    /* renamed from: e */
    public static final int f23220e = 0;
    @C12579k

    /* renamed from: a */
    public C8638b0 f23221a = new C8668a(C8438a.m30459C());
    @C12579k

    /* renamed from: b */
    public final Set<Map.Entry<K, V>> f23222b = new C8661n(this);
    @C12579k

    /* renamed from: c */
    public final Set<K> f23223c = new C8662o(this);
    @C12579k

    /* renamed from: d */
    public final Collection<V> f23224d = new C8664q(this);

    @C11363r0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,360:1\n70#2:361\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n174#1:361\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.t$a */
    public static final class C8668a<K, V> extends C8638b0 {
        @C12579k

        /* renamed from: d */
        public C8452h<K, ? extends V> f23225d;

        /* renamed from: e */
        public int f23226e;

        public C8668a(@C12579k C8452h<K, ? extends V> hVar) {
            Intrinsics.checkNotNullParameter(hVar, "map");
            this.f23225d = hVar;
        }

        /* renamed from: a */
        public void mo15124a(@C12579k C8638b0 b0Var) {
            Intrinsics.checkNotNullParameter(b0Var, "value");
            C8668a aVar = (C8668a) b0Var;
            synchronized (C8669u.f23227a) {
                this.f23225d = aVar.f23225d;
                this.f23226e = aVar.f23226e;
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }

        @C12579k
        /* renamed from: b */
        public C8638b0 mo15125b() {
            return new C8668a(this.f23225d);
        }

        @C12579k
        /* renamed from: g */
        public final C8452h<K, V> mo16722g() {
            return this.f23225d;
        }

        /* renamed from: h */
        public final int mo16723h() {
            return this.f23226e;
        }

        /* renamed from: i */
        public final void mo16724i(@C12579k C8452h<K, ? extends V> hVar) {
            Intrinsics.checkNotNullParameter(hVar, "<set-?>");
            this.f23225d = hVar;
        }

        /* renamed from: j */
        public final void mo16725j(int i) {
            this.f23226e = i;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m31821d() {
    }

    /* renamed from: n */
    public static /* synthetic */ void m31822n() {
    }

    /* renamed from: a */
    public final boolean mo16694a(@C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Map.Entry invoke : (C8447e) mo16707m().mo16722g().entrySet()) {
            if (!lVar.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo16695b(@C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Map.Entry invoke : (C8447e) mo16707m().mo16722g().entrySet()) {
            if (lVar.invoke(invoke).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C11314h(name = "getDebuggerDisplayValue")
    @C12579k
    /* renamed from: c */
    public final Map<K, V> mo16696c() {
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((C8668a) SnapshotKt.m31444B((C8668a) i)).mo16722g();
    }

    public void clear() {
        C8646f b;
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C8668a aVar = (C8668a) SnapshotKt.m31444B((C8668a) i);
        aVar.mo16722g();
        C8452h C = C8438a.m30459C();
        if (C != aVar.mo16722g()) {
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C8668a aVar2 = (C8668a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8668a aVar3 = (C8668a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8669u.f23227a) {
                    aVar3.mo16724i(C);
                    aVar3.mo16725j(aVar3.mo16723h() + 1);
                }
            }
            SnapshotKt.m31457O(b, this);
        }
    }

    public boolean containsKey(Object obj) {
        return mo16707m().mo16722g().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo16707m().mo16722g().containsValue(obj);
    }

    /* renamed from: e */
    public void mo15116e(@C12579k C8638b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "value");
        this.f23221a = (C8668a) b0Var;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo16701f();
    }

    @C12579k
    /* renamed from: f */
    public Set<Map.Entry<K, V>> mo16701f() {
        return this.f23222b;
    }

    @C12580l
    public V get(Object obj) {
        return mo16707m().mo16722g().get(obj);
    }

    @C12579k
    /* renamed from: i */
    public C8638b0 mo15119i() {
        return this.f23221a;
    }

    public boolean isEmpty() {
        return mo16707m().mo16722g().isEmpty();
    }

    @C12579k
    /* renamed from: j */
    public Set<K> mo16704j() {
        return this.f23223c;
    }

    public final /* bridge */ Set<K> keySet() {
        return mo16704j();
    }

    /* renamed from: l */
    public final int mo16706l() {
        return mo16707m().mo16723h();
    }

    @C12579k
    /* renamed from: m */
    public final C8668a<K, V> mo16707m() {
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C8668a) SnapshotKt.m31464V((C8668a) i, this);
    }

    /* renamed from: o */
    public int mo16708o() {
        return mo16707m().mo16722g().size();
    }

    @C12579k
    /* renamed from: p */
    public Collection<V> mo16709p() {
        return this.f23224d;
    }

    @C12580l
    public V put(K k, V v) {
        C8452h g;
        int h;
        V put;
        C8646f b;
        boolean z;
        do {
            synchronized (C8669u.f23227a) {
                C8638b0 i = mo15119i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C8668a aVar = (C8668a) SnapshotKt.m31444B((C8668a) i);
                g = aVar.mo16722g();
                h = aVar.mo16723h();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8452h.C8453a builder = g.builder();
            put = builder.put(k, v);
            C8452h g2 = builder.mo15671g();
            if (Intrinsics.areEqual((Object) g2, (Object) g)) {
                break;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C8668a aVar2 = (C8668a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8668a aVar3 = (C8668a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8669u.f23227a) {
                    if (aVar3.mo16723h() == h) {
                        aVar3.mo16724i(g2);
                        z = true;
                        aVar3.mo16725j(aVar3.mo16723h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return put;
    }

    public void putAll(@C12579k Map<? extends K, ? extends V> map) {
        C8452h g;
        int h;
        C8646f b;
        boolean z;
        Intrinsics.checkNotNullParameter(map, "from");
        do {
            synchronized (C8669u.f23227a) {
                C8638b0 i = mo15119i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C8668a aVar = (C8668a) SnapshotKt.m31444B((C8668a) i);
                g = aVar.mo16722g();
                h = aVar.mo16723h();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8452h.C8453a builder = g.builder();
            builder.putAll(map);
            C8452h g2 = builder.mo15671g();
            if (!Intrinsics.areEqual((Object) g2, (Object) g)) {
                C8638b0 i2 = mo15119i();
                Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C8668a aVar2 = (C8668a) i2;
                SnapshotKt.m31449G();
                synchronized (SnapshotKt.m31447E()) {
                    b = C8646f.f23196e.mo16622b();
                    C8668a aVar3 = (C8668a) SnapshotKt.m31490k0(aVar2, this, b);
                    synchronized (C8669u.f23227a) {
                        if (aVar3.mo16723h() == h) {
                            aVar3.mo16724i(g2);
                            z = true;
                            aVar3.mo16725j(aVar3.mo16723h() + 1);
                        } else {
                            z = false;
                        }
                    }
                }
                SnapshotKt.m31457O(b, this);
            } else {
                return;
            }
        } while (!z);
    }

    /* renamed from: r */
    public final <R> R mo16712r(C11300l<? super Map<K, V>, ? extends R> lVar) {
        C8452h g;
        int h;
        R invoke;
        C8646f b;
        boolean z;
        do {
            synchronized (C8669u.f23227a) {
                try {
                    C8638b0 i = mo15119i();
                    Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    C8668a aVar = (C8668a) SnapshotKt.m31444B((C8668a) i);
                    g = aVar.mo16722g();
                    h = aVar.mo16723h();
                    C11079d2 d2Var = C11079d2.f28267a;
                    C11322b0.m43481d(1);
                } finally {
                    C11322b0.m43481d(1);
                    C11322b0.m43480c(1);
                }
            }
            C11322b0.m43480c(1);
            Intrinsics.checkNotNull(g);
            C8452h.C8453a builder = g.builder();
            invoke = lVar.invoke(builder);
            C8452h g2 = builder.mo15671g();
            if (Intrinsics.areEqual((Object) g2, (Object) g)) {
                break;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C8668a aVar2 = (C8668a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                try {
                    b = C8646f.f23196e.mo16622b();
                    C8668a aVar3 = (C8668a) SnapshotKt.m31490k0(aVar2, this, b);
                    synchronized (C8669u.f23227a) {
                        if (aVar3.mo16723h() == h) {
                            aVar3.mo16724i(g2);
                            aVar3.mo16725j(aVar3.mo16723h() + 1);
                            z = true;
                        } else {
                            z = false;
                        }
                        C11322b0.m43481d(1);
                    }
                    C11322b0.m43480c(1);
                    C11322b0.m43481d(1);
                } catch (Throwable th) {
                    throw th;
                }
            }
            C11322b0.m43480c(1);
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return invoke;
    }

    @C12580l
    public V remove(Object obj) {
        C8452h g;
        int h;
        V remove;
        C8646f b;
        boolean z;
        do {
            synchronized (C8669u.f23227a) {
                C8638b0 i = mo15119i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C8668a aVar = (C8668a) SnapshotKt.m31444B((C8668a) i);
                g = aVar.mo16722g();
                h = aVar.mo16723h();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8452h.C8453a builder = g.builder();
            remove = builder.remove(obj);
            C8452h g2 = builder.mo15671g();
            if (Intrinsics.areEqual((Object) g2, (Object) g)) {
                break;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C8668a aVar2 = (C8668a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8668a aVar3 = (C8668a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8669u.f23227a) {
                    if (aVar3.mo16723h() == h) {
                        aVar3.mo16724i(g2);
                        z = true;
                        aVar3.mo16725j(aVar3.mo16723h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return remove;
    }

    /* renamed from: s */
    public final boolean mo16714s(@C12579k C11300l<? super Map.Entry<K, V>, Boolean> lVar) {
        C8452h g;
        int h;
        C8646f b;
        boolean z;
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        boolean z2 = false;
        do {
            synchronized (C8669u.f23227a) {
                try {
                    C8638b0 i = mo15119i();
                    Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    C8668a aVar = (C8668a) SnapshotKt.m31444B((C8668a) i);
                    g = aVar.mo16722g();
                    h = aVar.mo16723h();
                    C11079d2 d2Var = C11079d2.f28267a;
                    C11322b0.m43481d(1);
                } finally {
                    C11322b0.m43481d(1);
                    C11322b0.m43480c(1);
                }
            }
            C11322b0.m43480c(1);
            Intrinsics.checkNotNull(g);
            C8452h.C8453a builder = g.builder();
            for (Map.Entry entry : entrySet()) {
                if (lVar.invoke(entry).booleanValue()) {
                    builder.remove(entry.getKey());
                    z2 = true;
                }
            }
            C11079d2 d2Var2 = C11079d2.f28267a;
            C8452h g2 = builder.mo15671g();
            if (Intrinsics.areEqual((Object) g2, (Object) g)) {
                break;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C8668a aVar2 = (C8668a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                try {
                    b = C8646f.f23196e.mo16622b();
                    C8668a aVar3 = (C8668a) SnapshotKt.m31490k0(aVar2, this, b);
                    synchronized (C8669u.f23227a) {
                        if (aVar3.mo16723h() == h) {
                            aVar3.mo16724i(g2);
                            aVar3.mo16725j(aVar3.mo16723h() + 1);
                            z = true;
                        } else {
                            z = false;
                        }
                        C11322b0.m43481d(1);
                    }
                    C11322b0.m43480c(1);
                    C11322b0.m43481d(1);
                } catch (Throwable th) {
                    throw th;
                }
            }
            C11322b0.m43480c(1);
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return z2;
    }

    public final /* bridge */ int size() {
        return mo16708o();
    }

    /* renamed from: t */
    public final boolean mo16716t(V v) {
        Object obj;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Map.Entry) obj).getValue(), (Object) v)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @C12579k
    /* renamed from: u */
    public final Map<K, V> mo16717u() {
        return mo16707m().mo16722g();
    }

    /* renamed from: v */
    public final void mo16718v(C11300l<? super C8452h<K, ? extends V>, ? extends C8452h<K, ? extends V>> lVar) {
        C8646f b;
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C8668a aVar = (C8668a) SnapshotKt.m31444B((C8668a) i);
        C8452h hVar = (C8452h) lVar.invoke(aVar.mo16722g());
        if (hVar != aVar.mo16722g()) {
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C8668a aVar2 = (C8668a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                try {
                    b = C8646f.f23196e.mo16622b();
                    C8668a aVar3 = (C8668a) SnapshotKt.m31490k0(aVar2, this, b);
                    synchronized (C8669u.f23227a) {
                        aVar3.mo16724i(hVar);
                        aVar3.mo16725j(aVar3.mo16723h() + 1);
                        C11322b0.m43481d(1);
                    }
                    C11322b0.m43480c(1);
                    C11322b0.m43481d(1);
                } catch (Throwable th) {
                    C11322b0.m43481d(1);
                    C11322b0.m43480c(1);
                    throw th;
                }
            }
            C11322b0.m43480c(1);
            SnapshotKt.m31457O(b, this);
        }
    }

    public final /* bridge */ Collection<V> values() {
        return mo16709p();
    }

    /* renamed from: w */
    public final <R> R mo16720w(C11300l<? super C8668a<K, V>, ? extends R> lVar) {
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return lVar.invoke(SnapshotKt.m31444B((C8668a) i));
    }

    /* renamed from: x */
    public final <R> R mo16721x(C11300l<? super C8668a<K, V>, ? extends R> lVar) {
        C8646f b;
        R invoke;
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C8668a aVar = (C8668a) i;
        SnapshotKt.m31449G();
        synchronized (SnapshotKt.m31447E()) {
            try {
                b = C8646f.f23196e.mo16622b();
                invoke = lVar.invoke(SnapshotKt.m31490k0(aVar, this, b));
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        SnapshotKt.m31457O(b, this);
        return invoke;
    }
}
