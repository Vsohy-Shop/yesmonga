package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.internal.C8567o;
import com.bumptech.glide.load.engine.executor.C22218a;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.l1 */
public final class C1988l1<V extends C1997o> implements C1970g1<V> {

    /* renamed from: f */
    public static final int f5541f = 8;

    /* renamed from: a */
    public final int f5542a;
    @C12579k

    /* renamed from: b */
    public final C1966f1<V> f5543b;
    @C12579k

    /* renamed from: c */
    public final RepeatMode f5544c;

    /* renamed from: d */
    public final long f5545d;

    /* renamed from: e */
    public final long f5546e;

    public /* synthetic */ C1988l1(int i, C1966f1 f1Var, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f1Var, repeatMode, j);
    }

    /* renamed from: b */
    public long mo6802b(@C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return (((long) this.f5542a) * this.f5545d) - this.f5546e;
    }

    @C12579k
    /* renamed from: j */
    public V mo6804j(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5543b.mo6804j(mo6892o(j), v, v2, mo6893p(j, v, v3, v2));
    }

    @C12579k
    /* renamed from: m */
    public V mo6805m(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5543b.mo6805m(mo6892o(j), v, v2, mo6893p(j, v, v3, v2));
    }

    /* renamed from: n */
    public final long mo6891n() {
        return this.f5545d;
    }

    /* renamed from: o */
    public final long mo6892o(long j) {
        long j2 = this.f5546e;
        if (j + j2 <= 0) {
            return 0;
        }
        long j3 = j + j2;
        long min = Math.min(j3 / this.f5545d, ((long) this.f5542a) - 1);
        if (this.f5544c == RepeatMode.Restart || min % ((long) 2) == 0) {
            return j3 - (min * this.f5545d);
        }
        return ((min + 1) * this.f5545d) - j3;
    }

    /* renamed from: p */
    public final V mo6893p(long j, V v, V v2, V v3) {
        long j2 = this.f5546e;
        long j3 = this.f5545d;
        if (j + j2 <= j3) {
            return v2;
        }
        return mo6804j(j3 - j2, v, v2, v3);
    }

    public C1988l1(int i, C1966f1<V> f1Var, RepeatMode repeatMode, long j) {
        this.f5542a = i;
        this.f5543b = f1Var;
        this.f5544c = repeatMode;
        if (i >= 1) {
            this.f5545d = ((long) (f1Var.mo6843e() + f1Var.mo6844g())) * 1000000;
            this.f5546e = j * 1000000;
            return;
        }
        throw new IllegalArgumentException("Iterations count can't be less than 1");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1988l1(int i, C1966f1 f1Var, RepeatMode repeatMode, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f1Var, (i2 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i2 & 8) != 0 ? C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null) : j, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1988l1(int i, C1966f1 f1Var, RepeatMode repeatMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f1Var, (i2 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(level = DeprecationLevel.f28051c, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ C1988l1(int i, C1966f1 f1Var, RepeatMode repeatMode) {
        this(i, f1Var, repeatMode, C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(f1Var, C22218a.f57069g);
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
