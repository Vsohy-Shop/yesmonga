package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.b */
public final class C8457b<T> extends C8456a<T> {
    @C12579k

    /* renamed from: c */
    public final T[] f22821c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8457b(@C12579k T[] tArr, int i, int i2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(tArr, "buffer");
        this.f22821c = tArr;
    }

    public T next() {
        if (hasNext()) {
            T[] tArr = this.f22821c;
            int d = mo15731d();
            mo15733f(d + 1);
            return tArr[d];
        }
        throw new NoSuchElementException();
    }

    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.f22821c;
            mo15733f(mo15731d() - 1);
            return tArr[mo15731d()];
        }
        throw new NoSuchElementException();
    }
}
