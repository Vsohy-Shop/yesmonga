package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e */
public final class C8460e<T> extends C8456a<T> {
    @C12579k

    /* renamed from: c */
    public final T[] f22827c;
    @C12579k

    /* renamed from: d */
    public final C8465i<T> f22828d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8460e(@C12579k Object[] objArr, @C12579k T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(objArr, C10108c.f27819v);
        Intrinsics.checkNotNullParameter(tArr, "tail");
        this.f22827c = tArr;
        int d = C8466j.m30639d(i2);
        this.f22828d = new C8465i<>(objArr, C11479u.m44313B(i, d), d, i3);
    }

    public T next() {
        mo15729b();
        if (this.f22828d.hasNext()) {
            mo15733f(mo15731d() + 1);
            return this.f22828d.next();
        }
        T[] tArr = this.f22827c;
        int d = mo15731d();
        mo15733f(d + 1);
        return tArr[d - this.f22828d.mo15732e()];
    }

    public T previous() {
        mo15730c();
        if (mo15731d() > this.f22828d.mo15732e()) {
            T[] tArr = this.f22827c;
            mo15733f(mo15731d() - 1);
            return tArr[mo15731d() - this.f22828d.mo15732e()];
        }
        mo15733f(mo15731d() - 1);
        return this.f22828d.previous();
    }
}
