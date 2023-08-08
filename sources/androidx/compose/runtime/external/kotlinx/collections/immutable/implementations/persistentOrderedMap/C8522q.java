package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8443b;
import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.q */
public final class C8522q<K, V> extends AbstractCollection<V> implements C8443b<V> {
    @C12579k

    /* renamed from: a */
    public final C8507c<K, V> f22951a;

    public C8522q(@C12579k C8507c<K, V> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "map");
        this.f22951a = cVar;
    }

    public boolean contains(Object obj) {
        return this.f22951a.containsValue(obj);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22951a.size();
    }

    @C12579k
    public Iterator<V> iterator() {
        return new C8523r(this.f22951a);
    }
}
