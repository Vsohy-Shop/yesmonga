package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import kotlin.jvm.internal.markers.C11351g;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.snapshots.w */
public final class C8671w<K, V> extends C8673x<K, V> implements Iterator<Map.Entry<K, V>>, C11348d {

    @C11363r0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#2,4:361\n1#3:365\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n322#1:361,4\n322#1:365\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.w$a */
    public static final class C8672a implements Map.Entry<K, V>, C11351g.C11352a {

        /* renamed from: a */
        public final K f23231a;

        /* renamed from: b */
        public V f23232b;

        /* renamed from: c */
        public final /* synthetic */ C8671w<K, V> f23233c;

        public C8672a(C8671w<K, V> wVar) {
            this.f23233c = wVar;
            Map.Entry<K, V> e = wVar.mo16744e();
            Intrinsics.checkNotNull(e);
            this.f23231a = e.getKey();
            Map.Entry<K, V> e2 = wVar.mo16744e();
            Intrinsics.checkNotNull(e2);
            this.f23232b = e2.getValue();
        }

        /* renamed from: a */
        public void mo16739a(V v) {
            this.f23232b = v;
        }

        public K getKey() {
            return this.f23231a;
        }

        public V getValue() {
            return this.f23232b;
        }

        public V setValue(V v) {
            C8671w<K, V> wVar = this.f23233c;
            if (wVar.mo16746h().mo16706l() == wVar.f23236c) {
                V value = getValue();
                wVar.mo16746h().put(getKey(), v);
                mo16739a(v);
                return value;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8671w(@C12579k C8667t<K, V> tVar, @C12579k Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(tVar, it);
        Intrinsics.checkNotNullParameter(tVar, "map");
        Intrinsics.checkNotNullParameter(it, "iterator");
    }

    @C12579k
    /* renamed from: q */
    public Map.Entry<K, V> next() {
        mo16743d();
        if (mo16744e() != null) {
            return new C8672a(this);
        }
        throw new IllegalStateException();
    }
}
