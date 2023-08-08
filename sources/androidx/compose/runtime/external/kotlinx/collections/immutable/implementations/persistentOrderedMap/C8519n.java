package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import java.util.Iterator;
import kotlin.collections.C10937g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.n */
public final class C8519n<K, V> extends C10937g<K> implements C8447e<K> {
    @C12579k

    /* renamed from: b */
    public final C8507c<K, V> f22946b;

    public C8519n(@C12579k C8507c<K, V> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "map");
        this.f22946b = cVar;
    }

    public boolean contains(Object obj) {
        return this.f22946b.containsKey(obj);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22946b.size();
    }

    @C12579k
    public Iterator<K> iterator() {
        return new C8520o(this.f22946b);
    }
}
