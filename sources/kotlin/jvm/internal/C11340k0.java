package kotlin.jvm.internal;

import androidx.lifecycle.C19456p0;
import kotlin.collections.C10953k0;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.k0 */
public abstract class C11340k0<T> {

    /* renamed from: a */
    public final int f28461a;

    /* renamed from: b */
    public int f28462b;
    @C12579k

    /* renamed from: c */
    public final T[] f28463c;

    public C11340k0(int i) {
        this.f28461a = i;
        this.f28463c = new Object[i];
    }

    /* renamed from: d */
    public static /* synthetic */ void m43531d() {
    }

    /* renamed from: a */
    public final void mo22790a(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "spreadArgument");
        T[] tArr = this.f28463c;
        int i = this.f28462b;
        this.f28462b = i + 1;
        tArr[i] = t;
    }

    /* renamed from: b */
    public final int mo22791b() {
        return this.f28462b;
    }

    /* renamed from: c */
    public abstract int mo22769c(@C12579k T t);

    /* renamed from: e */
    public final void mo22792e(int i) {
        this.f28462b = i;
    }

    /* renamed from: f */
    public final int mo22793f() {
        int i;
        int i2 = 0;
        C10953k0 H = new C11466l(0, this.f28461a - 1).iterator();
        while (H.hasNext()) {
            T t = this.f28463c[H.mo6374c()];
            if (t != null) {
                i = mo22769c(t);
            } else {
                i = 1;
            }
            i2 += i;
        }
        return i2;
    }

    @C12579k
    /* renamed from: g */
    public final T mo22794g(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, C19456p0.f49833g);
        Intrinsics.checkNotNullParameter(t2, "result");
        C10953k0 H = new C11466l(0, this.f28461a - 1).iterator();
        int i = 0;
        int i2 = 0;
        while (H.hasNext()) {
            int c = H.mo6374c();
            T t3 = this.f28463c[c];
            if (t3 != null) {
                if (i < c) {
                    int i3 = c - i;
                    System.arraycopy(t, i, t2, i2, i3);
                    i2 += i3;
                }
                int c2 = mo22769c(t3);
                System.arraycopy(t3, 0, t2, i2, c2);
                i2 += c2;
                i = c + 1;
            }
        }
        int i4 = this.f28461a;
        if (i < i4) {
            System.arraycopy(t, i, t2, i2, i4 - i);
        }
        return t2;
    }
}
