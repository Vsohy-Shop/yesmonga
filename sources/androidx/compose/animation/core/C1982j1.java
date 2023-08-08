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
/* renamed from: androidx.compose.animation.core.j1 */
public final class C1982j1<V extends C1997o> implements C1953c1<V> {

    /* renamed from: e */
    public static final int f5519e = 8;
    @C12579k

    /* renamed from: a */
    public final C1966f1<V> f5520a;
    @C12579k

    /* renamed from: b */
    public final RepeatMode f5521b;

    /* renamed from: c */
    public final long f5522c;

    /* renamed from: d */
    public final long f5523d;

    public /* synthetic */ C1982j1(C1966f1 f1Var, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(f1Var, repeatMode, j);
    }

    /* renamed from: a */
    public boolean mo6801a() {
        return true;
    }

    /* renamed from: b */
    public long mo6802b(@C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return Long.MAX_VALUE;
    }

    @C12579k
    /* renamed from: j */
    public V mo6804j(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5520a.mo6804j(mo6864o(j), v, v2, mo6865p(j, v, v3, v2));
    }

    @C12579k
    /* renamed from: m */
    public V mo6805m(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return this.f5520a.mo6805m(mo6864o(j), v, v2, mo6865p(j, v, v3, v2));
    }

    /* renamed from: n */
    public final long mo6863n() {
        return this.f5522c;
    }

    /* renamed from: o */
    public final long mo6864o(long j) {
        long j2 = this.f5523d;
        if (j + j2 <= 0) {
            return 0;
        }
        long j3 = j + j2;
        long j4 = this.f5522c;
        long j5 = j3 / j4;
        if (this.f5521b == RepeatMode.Restart || j5 % ((long) 2) == 0) {
            return j3 - (j5 * j4);
        }
        return ((j5 + 1) * j4) - j3;
    }

    /* renamed from: p */
    public final V mo6865p(long j, V v, V v2, V v3) {
        long j2 = this.f5523d;
        long j3 = this.f5522c;
        if (j + j2 <= j3) {
            return v2;
        }
        return mo6804j(j3 - j2, v, v2, v3);
    }

    public C1982j1(C1966f1<V> f1Var, RepeatMode repeatMode, long j) {
        this.f5520a = f1Var;
        this.f5521b = repeatMode;
        this.f5522c = ((long) (f1Var.mo6843e() + f1Var.mo6844g())) * 1000000;
        this.f5523d = j * 1000000;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1982j1(C1966f1 f1Var, RepeatMode repeatMode, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f1Var, (i & 2) != 0 ? RepeatMode.Restart : repeatMode, (i & 4) != 0 ? C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null) : j, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1982j1(C1966f1 f1Var, RepeatMode repeatMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f1Var, (i & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(level = DeprecationLevel.f28051c, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ C1982j1(C1966f1 f1Var, RepeatMode repeatMode) {
        this(f1Var, repeatMode, C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(f1Var, C22218a.f57069g);
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
