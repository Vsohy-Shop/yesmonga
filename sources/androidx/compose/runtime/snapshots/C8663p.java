package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11353h;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.snapshots.p */
public abstract class C8663p<K, V, E> implements Set<E>, C11353h {
    @C12579k

    /* renamed from: a */
    public final C8667t<K, V> f23218a;

    public C8663p(@C12579k C8667t<K, V> tVar) {
        Intrinsics.checkNotNullParameter(tVar, "map");
        this.f23218a = tVar;
    }

    public void clear() {
        this.f23218a.clear();
    }

    @C12579k
    /* renamed from: e */
    public final C8667t<K, V> mo16677e() {
        return this.f23218a;
    }

    /* renamed from: h */
    public int mo16678h() {
        return this.f23218a.size();
    }

    public boolean isEmpty() {
        return this.f23218a.isEmpty();
    }

    public final /* bridge */ int size() {
        return mo16678h();
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
