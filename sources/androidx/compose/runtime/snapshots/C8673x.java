package androidx.compose.runtime.snapshots;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#1,4:361\n1#2:365\n1#2:366\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n286#1:361,4\n286#1:365\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.x */
public abstract class C8673x<K, V> {
    @C12579k

    /* renamed from: a */
    public final C8667t<K, V> f23234a;
    @C12579k

    /* renamed from: b */
    public final Iterator<Map.Entry<K, V>> f23235b;

    /* renamed from: c */
    public int f23236c;
    @C12580l

    /* renamed from: d */
    public Map.Entry<? extends K, ? extends V> f23237d;
    @C12580l

    /* renamed from: e */
    public Map.Entry<? extends K, ? extends V> f23238e;

    public C8673x(@C12579k C8667t<K, V> tVar, @C12579k Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        Intrinsics.checkNotNullParameter(tVar, "map");
        Intrinsics.checkNotNullParameter(it, "iterator");
        this.f23234a = tVar;
        this.f23235b = it;
        this.f23236c = tVar.mo16706l();
        mo16743d();
    }

    /* renamed from: d */
    public final void mo16743d() {
        Map.Entry<? extends K, ? extends V> entry;
        this.f23237d = this.f23238e;
        if (this.f23235b.hasNext()) {
            entry = this.f23235b.next();
        } else {
            entry = null;
        }
        this.f23238e = entry;
    }

    @C12580l
    /* renamed from: e */
    public final Map.Entry<K, V> mo16744e() {
        return this.f23237d;
    }

    @C12579k
    /* renamed from: f */
    public final Iterator<Map.Entry<K, V>> mo16745f() {
        return this.f23235b;
    }

    @C12579k
    /* renamed from: h */
    public final C8667t<K, V> mo16746h() {
        return this.f23234a;
    }

    public final boolean hasNext() {
        return this.f23238e != null;
    }

    /* renamed from: j */
    public final int mo16748j() {
        return this.f23236c;
    }

    @C12580l
    /* renamed from: l */
    public final Map.Entry<K, V> mo16749l() {
        return this.f23238e;
    }

    /* renamed from: m */
    public final <T> T mo16750m(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (mo16746h().mo16706l() == this.f23236c) {
            T invoke = aVar.invoke();
            this.f23236c = mo16746h().mo16706l();
            return invoke;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: n */
    public final void mo16751n(@C12580l Map.Entry<? extends K, ? extends V> entry) {
        this.f23237d = entry;
    }

    /* renamed from: o */
    public final void mo16752o(int i) {
        this.f23236c = i;
    }

    /* renamed from: p */
    public final void mo16753p(@C12580l Map.Entry<? extends K, ? extends V> entry) {
        this.f23238e = entry;
    }

    public final void remove() {
        if (mo16746h().mo16706l() == this.f23236c) {
            Map.Entry<? extends K, ? extends V> entry = this.f23237d;
            if (entry != null) {
                this.f23234a.remove(entry.getKey());
                this.f23237d = null;
                C11079d2 d2Var = C11079d2.f28267a;
                this.f23236c = mo16746h().mo16706l();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
