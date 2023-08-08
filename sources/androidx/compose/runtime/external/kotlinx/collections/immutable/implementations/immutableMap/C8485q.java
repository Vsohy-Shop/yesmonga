package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import java.util.Iterator;
import kotlin.collections.C10937g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.q */
public final class C8485q<K, V> extends C10937g<K> implements C8447e<K> {
    @C12579k

    /* renamed from: b */
    public final C8471d<K, V> f22871b;

    public C8485q(@C12579k C8471d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "map");
        this.f22871b = dVar;
    }

    public boolean contains(Object obj) {
        return this.f22871b.containsKey(obj);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22871b.size();
    }

    @C12579k
    public Iterator<K> iterator() {
        return new C8486r(this.f22871b.mo15797p());
    }
}
