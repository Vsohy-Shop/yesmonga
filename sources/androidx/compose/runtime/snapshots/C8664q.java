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

@C11363r0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n84#2,2:361\n129#2,4:363\n133#2:368\n121#2:369\n134#2,5:371\n86#2,7:376\n139#2,2:383\n125#2:385\n141#2,6:391\n149#2,3:400\n93#2:403\n84#2,2:404\n129#2,4:406\n133#2:411\n121#2:412\n134#2,5:414\n86#2,7:419\n139#2,2:426\n125#2:428\n141#2,6:434\n149#2,3:443\n93#2:446\n70#3:367\n70#3:410\n2180#4:370\n2073#4,2:386\n1686#4:388\n2075#4,2:389\n2077#4,3:397\n2180#4:413\n2073#4,2:429\n1686#4:431\n2075#4,2:432\n2077#4,3:440\n1726#5,3:447\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n250#1:361,2\n250#1:363,4\n250#1:368\n250#1:369\n250#1:371,5\n250#1:376,7\n250#1:383,2\n250#1:385\n250#1:391,6\n250#1:400,3\n250#1:403\n254#1:404,2\n254#1:406,4\n254#1:411\n254#1:412\n254#1:414,5\n254#1:419,7\n254#1:426,2\n254#1:428\n254#1:434,6\n254#1:443,3\n254#1:446\n250#1:367\n254#1:410\n250#1:370\n250#1:386,2\n250#1:388\n250#1:389,2\n250#1:397,3\n254#1:413\n254#1:429,2\n254#1:431\n254#1:432,2\n254#1:440,3\n258#1:447,3\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.q */
public final class C8664q<K, V> extends C8663p<K, V, V> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8664q(@C12579k C8667t<K, V> tVar) {
        super(tVar);
        Intrinsics.checkNotNullParameter(tVar, "map");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) mo16687i(obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) mo16689q(collection)).booleanValue();
    }

    public boolean contains(Object obj) {
        return mo16677e().containsValue(obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object containsValue : iterable) {
            if (!mo16677e().containsValue(containsValue)) {
                return false;
            }
        }
        return true;
    }

    @C12579k
    /* renamed from: i */
    public Void mo16687i(V v) {
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: q */
    public Void mo16689q(@C12579k Collection<? extends V> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: r */
    public C8675z<K, V> iterator() {
        return new C8675z<>(mo16677e(), ((C8447e) mo16677e().mo16707m().mo16722g().entrySet()).iterator());
    }

    public boolean remove(Object obj) {
        return mo16677e().mo16716t(obj);
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
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
                if (V5.contains(entry.getValue())) {
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
                if (!V5.contains(entry.getValue())) {
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
