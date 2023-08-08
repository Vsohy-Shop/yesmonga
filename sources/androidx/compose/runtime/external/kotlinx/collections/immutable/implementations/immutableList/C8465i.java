package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.i */
public final class C8465i<E> extends C8456a<E> {

    /* renamed from: c */
    public int f22837c;
    @C12579k

    /* renamed from: d */
    public Object[] f22838d;

    /* renamed from: e */
    public boolean f22839e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8465i(@C12579k Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        boolean z;
        Intrinsics.checkNotNullParameter(objArr, C10108c.f27819v);
        this.f22837c = i3;
        Object[] objArr2 = new Object[i3];
        this.f22838d = objArr2;
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        this.f22839e = z;
        objArr2[0] = objArr;
        mo15770l(i - (z ? 1 : 0), 1);
    }

    /* renamed from: j */
    public final E mo15769j() {
        Object obj = this.f22838d[this.f22837c - 1];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[mo15731d() & 31];
    }

    /* renamed from: l */
    public final void mo15770l(int i, int i2) {
        int i3 = (this.f22837c - i2) * 5;
        while (i2 < this.f22837c) {
            Object[] objArr = this.f22838d;
            Object[] objArr2 = objArr[i2 - 1];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[C8466j.m30636a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo15771m(int i) {
        int i2 = 0;
        while (C8466j.m30636a(mo15731d(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            mo15770l(mo15731d(), ((this.f22837c - 1) - (i2 / 5)) + 1);
        }
    }

    /* renamed from: n */
    public final void mo15772n(@C12579k Object[] objArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(objArr, C10108c.f27819v);
        mo15733f(i);
        mo15734h(i2);
        this.f22837c = i3;
        if (this.f22838d.length < i3) {
            this.f22838d = new Object[i3];
        }
        boolean z = false;
        this.f22838d[0] = objArr;
        if (i == i2) {
            z = true;
        }
        this.f22839e = z;
        mo15770l(i - (z ? 1 : 0), 1);
    }

    public E next() {
        if (hasNext()) {
            E j = mo15769j();
            mo15733f(mo15731d() + 1);
            if (mo15731d() == mo15732e()) {
                this.f22839e = true;
                return j;
            }
            mo15771m(0);
            return j;
        }
        throw new NoSuchElementException();
    }

    public E previous() {
        if (hasPrevious()) {
            mo15733f(mo15731d() - 1);
            if (this.f22839e) {
                this.f22839e = false;
                return mo15769j();
            }
            mo15771m(31);
            return mo15769j();
        }
        throw new NoSuchElementException();
    }
}
