package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.snapshots.C8667t;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1179#2,2:361\n1253#2,4:363\n1726#2,3:410\n84#3,2:367\n129#3,4:369\n133#3:374\n121#3:375\n134#3,5:377\n86#3,7:382\n139#3,2:389\n125#3:391\n141#3,6:397\n149#3,3:406\n93#3:409\n70#4:373\n2180#5:376\n2073#5,2:392\n1686#5:394\n2075#5,2:395\n2077#5,3:403\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n209#1:361,2\n209#1:363,4\n216#1:410,3\n210#1:367,2\n210#1:369,4\n210#1:374\n210#1:375\n210#1:377,5\n210#1:382,7\n210#1:389,2\n210#1:391\n210#1:397,6\n210#1:406,3\n210#1:409\n210#1:373\n210#1:376\n210#1:392,2\n210#1:394\n210#1:395,2\n210#1:403,3\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.n */
public final class C8661n<K, V> extends C8663p<K, V, Map.Entry<K, V>> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8661n(@C12579k C8667t<K, V> tVar) {
        super(tVar);
        Intrinsics.checkNotNullParameter(tVar, "map");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) mo16657i((Map.Entry) obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) mo16659q(collection)).booleanValue();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!C11370u0.m43679I(obj)) {
            return false;
        }
        return mo16660r((Map.Entry) obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable<Map.Entry> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Map.Entry contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    @C12579k
    /* renamed from: i */
    public Void mo16657i(@C12579k Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C8671w(mo16677e(), ((C8447e) mo16677e().mo16707m().mo16722g().entrySet()).iterator());
    }

    @C12579k
    /* renamed from: q */
    public Void mo16659q(@C12579k Collection<? extends Map.Entry<K, V>> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: r */
    public boolean mo16660r(@C12579k Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        return Intrinsics.areEqual(mo16677e().get(entry.getKey()), (Object) entry.getValue());
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!C11370u0.m43679I(obj)) {
            return false;
        }
        return mo16664w((Map.Entry) obj);
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (mo16677e().remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(@C12579k Collection<? extends Object> collection) {
        C8452h g;
        int h;
        boolean z;
        C8646f b;
        boolean z2;
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable<Map.Entry> iterable = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(iterable, 10)), 16));
        for (Map.Entry entry : iterable) {
            Pair a = C11078d1.m42659a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a.mo21849e(), a.mo21851f());
        }
        C8667t e = mo16677e();
        boolean z3 = false;
        do {
            synchronized (C8669u.f23227a) {
                C8638b0 i = e.mo15119i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C8667t.C8668a aVar = (C8667t.C8668a) SnapshotKt.m31444B((C8667t.C8668a) i);
                g = aVar.mo16722g();
                h = aVar.mo16723h();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8452h.C8453a builder = g.builder();
            Iterator it = e.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.areEqual(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    builder.remove(entry2.getKey());
                    z3 = true;
                }
            }
            C11079d2 d2Var2 = C11079d2.f28267a;
            C8452h g2 = builder.mo15671g();
            if (Intrinsics.areEqual((Object) g2, (Object) g)) {
                break;
            }
            C8638b0 i2 = e.mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C8667t.C8668a aVar2 = (C8667t.C8668a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8667t.C8668a aVar3 = (C8667t.C8668a) SnapshotKt.m31490k0(aVar2, e, b);
                synchronized (C8669u.f23227a) {
                    if (aVar3.mo16723h() == h) {
                        aVar3.mo16724i(g2);
                        aVar3.mo16725j(aVar3.mo16723h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.m31457O(b, e);
        } while (!z);
        return z3;
    }

    /* renamed from: w */
    public boolean mo16664w(@C12579k Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        if (mo16677e().remove(entry.getKey()) != null) {
            return true;
        }
        return false;
    }
}
