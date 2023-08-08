package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.m1 */
public final class C1993m1<V extends C1997o> implements C1966f1<V> {

    /* renamed from: b */
    public static final int f5561b = 0;

    /* renamed from: a */
    public final int f5562a;

    public C1993m1() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public int mo6843e() {
        return this.f5562a;
    }

    /* renamed from: g */
    public int mo6844g() {
        return 0;
    }

    @C12579k
    /* renamed from: j */
    public V mo6804j(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return v3;
    }

    @C12579k
    /* renamed from: m */
    public V mo6805m(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        if (j < ((long) mo6843e()) * 1000000) {
            return v;
        }
        return v2;
    }

    public C1993m1(int i) {
        this.f5562a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1993m1(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
