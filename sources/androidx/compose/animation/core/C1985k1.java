package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.internal.C8567o;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.k1 */
public final class C1985k1<V extends C1997o> implements C1966f1<V> {

    /* renamed from: f */
    public static final int f5531f = 8;
    @C12579k

    /* renamed from: a */
    public final Map<Integer, Pair<V, C2022z>> f5532a;

    /* renamed from: b */
    public final int f5533b;

    /* renamed from: c */
    public final int f5534c;

    /* renamed from: d */
    public V f5535d;

    /* renamed from: e */
    public V f5536e;

    public C1985k1(@C12579k Map<Integer, ? extends Pair<? extends V, ? extends C2022z>> map, int i, int i2) {
        Intrinsics.checkNotNullParameter(map, "keyframes");
        this.f5532a = map;
        this.f5533b = i;
        this.f5534c = i2;
    }

    /* renamed from: e */
    public int mo6843e() {
        return this.f5534c;
    }

    /* renamed from: g */
    public int mo6844g() {
        return this.f5533b;
    }

    @C12579k
    /* renamed from: j */
    public V mo6804j(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        long a = C1957d1.m8315c(this, j / 1000000);
        if (a <= 0) {
            return v3;
        }
        C1997o f = C1957d1.m8318f(this, a - 1, v, v2, v3);
        C1997o f2 = C1957d1.m8318f(this, a, v, v2, v3);
        mo6882n(v);
        int b = f.mo6867b();
        int i = 0;
        while (true) {
            V v4 = null;
            if (i >= b) {
                break;
            }
            V v5 = this.f5536e;
            if (v5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            } else {
                v4 = v5;
            }
            v4.mo6870e(i, (f.mo6866a(i) - f2.mo6866a(i)) * 1000.0f);
            i++;
        }
        V v6 = this.f5536e;
        if (v6 != null) {
            return v6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @C12579k
    /* renamed from: m */
    public V mo6805m(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        int a = (int) C1957d1.m8315c(this, j / 1000000);
        if (this.f5532a.containsKey(Integer.valueOf(a))) {
            return (C1997o) ((Pair) C10977s0.m41443K(this.f5532a, Integer.valueOf(a))).mo21849e();
        }
        if (a >= mo6844g()) {
            return v2;
        }
        if (a <= 0) {
            return v;
        }
        int g = mo6844g();
        C2022z c = C1947b0.m8291c();
        int i = 0;
        V v4 = v;
        int i2 = 0;
        for (Map.Entry next : this.f5532a.entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            Pair pair = (Pair) next.getValue();
            if (a > intValue && intValue >= i2) {
                v4 = (C1997o) pair.mo21849e();
                c = (C2022z) pair.mo21851f();
                i2 = intValue;
            } else if (a < intValue && intValue <= g) {
                v2 = (C1997o) pair.mo21849e();
                g = intValue;
            }
        }
        float a2 = c.mo6791a(((float) (a - i2)) / ((float) (g - i2)));
        mo6882n(v);
        int b = v4.mo6867b();
        while (true) {
            V v5 = null;
            if (i >= b) {
                break;
            }
            V v6 = this.f5535d;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            } else {
                v5 = v6;
            }
            v5.mo6870e(i, VectorConvertersKt.m8226k(v4.mo6866a(i), v2.mo6866a(i), a2));
            i++;
        }
        V v7 = this.f5535d;
        if (v7 != null) {
            return v7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    /* renamed from: n */
    public final void mo6882n(V v) {
        if (this.f5535d == null) {
            this.f5535d = C2000p.m8571g(v);
            this.f5536e = C2000p.m8571g(v);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1985k1(Map map, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i, (i3 & 4) != 0 ? 0 : i2);
    }
}
