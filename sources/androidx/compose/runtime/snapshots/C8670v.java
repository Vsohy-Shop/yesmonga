package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11350f;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1#2:458\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.v */
public final class C8670v<T> implements ListIterator<T>, C11350f {
    @C12579k

    /* renamed from: a */
    public final SnapshotStateList<T> f23228a;

    /* renamed from: b */
    public int f23229b;

    /* renamed from: c */
    public int f23230c;

    public C8670v(@C12579k SnapshotStateList<T> snapshotStateList, int i) {
        Intrinsics.checkNotNullParameter(snapshotStateList, "list");
        this.f23228a = snapshotStateList;
        this.f23229b = i - 1;
        this.f23230c = snapshotStateList.mo16454H();
    }

    public void add(T t) {
        mo16728c();
        this.f23228a.add(this.f23229b + 1, t);
        this.f23229b++;
        this.f23230c = this.f23228a.mo16454H();
    }

    @C12579k
    /* renamed from: b */
    public final SnapshotStateList<T> mo16727b() {
        return this.f23228a;
    }

    /* renamed from: c */
    public final void mo16728c() {
        if (this.f23228a.mo16454H() != this.f23230c) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return this.f23229b < this.f23228a.size() - 1;
    }

    public boolean hasPrevious() {
        return this.f23229b >= 0;
    }

    public T next() {
        mo16728c();
        int i = this.f23229b + 1;
        C8666s.m31820e(i, this.f23228a.size());
        T t = this.f23228a.get(i);
        this.f23229b = i;
        return t;
    }

    public int nextIndex() {
        return this.f23229b + 1;
    }

    public T previous() {
        mo16728c();
        C8666s.m31820e(this.f23229b, this.f23228a.size());
        this.f23229b--;
        return this.f23228a.get(this.f23229b);
    }

    public int previousIndex() {
        return this.f23229b;
    }

    public void remove() {
        mo16728c();
        this.f23228a.remove(this.f23229b);
        this.f23229b--;
        this.f23230c = this.f23228a.mo16454H();
    }

    public void set(T t) {
        mo16728c();
        this.f23228a.set(this.f23229b, t);
        this.f23230c = this.f23228a.mo16454H();
    }
}
