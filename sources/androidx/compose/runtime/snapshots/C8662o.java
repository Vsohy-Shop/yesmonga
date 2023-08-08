package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.snapshots.C8667t;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1855#2,2:361\n1726#2,3:406\n84#3,2:363\n129#3,4:365\n133#3:370\n121#3:371\n134#3,5:373\n86#3,7:378\n139#3,2:385\n125#3:387\n141#3,6:393\n149#3,3:402\n93#3:405\n70#4:369\n2180#5:372\n2073#5,2:388\n1686#5:390\n2075#5,2:391\n2077#5,3:399\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n227#1:361,2\n237#1:406,3\n234#1:363,2\n234#1:365,4\n234#1:370\n234#1:371\n234#1:373,5\n234#1:378,7\n234#1:385,2\n234#1:387\n234#1:393,6\n234#1:402,3\n234#1:405\n234#1:369\n234#1:372\n234#1:388,2\n234#1:390\n234#1:391,2\n234#1:399,3\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.o */
public final class C8662o<K, V> extends C8663p<K, V, K> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8662o(@C12579k C8667t<K, V> tVar) {
        super(tVar);
        Intrinsics.checkNotNullParameter(tVar, "map");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) mo16669i(obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) mo16671q(collection)).booleanValue();
    }

    public boolean contains(Object obj) {
        return mo16677e().containsKey(obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object containsKey : iterable) {
            if (!mo16677e().containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    @C12579k
    /* renamed from: i */
    public Void mo16669i(K k) {
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: q */
    public Void mo16671q(@C12579k Collection<? extends K> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: r */
    public C8674y<K, V> iterator() {
        return new C8674y<>(mo16677e(), ((C8447e) mo16677e().mo16707m().mo16722g().entrySet()).iterator());
    }

    public boolean remove(Object obj) {
        return mo16677e().remove(obj) != null;
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (mo16677e().remove(it.next()) != null || z) {
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
        Intrinsics.checkNotNullParameter(collection, "elements");
        Set V5 = CollectionsKt___CollectionsKt.m40582V5(collection);
        C8667t e = mo16677e();
        boolean z2 = false;
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
                Map.Entry entry = (Map.Entry) it.next();
                if (!V5.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z2 = true;
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
        return z2;
    }
}
