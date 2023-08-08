package androidx.compose.animation.core;

import androidx.compose.runtime.C8585m0;
import com.bumptech.glide.load.engine.executor.C22218a;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.core.q0 */
public final class C2004q0<T> implements C1956d0<T> {

    /* renamed from: e */
    public static final int f5588e = 0;

    /* renamed from: a */
    public final int f5589a;
    @C12579k

    /* renamed from: b */
    public final C2020y<T> f5590b;
    @C12579k

    /* renamed from: c */
    public final RepeatMode f5591c;

    /* renamed from: d */
    public final long f5592d;

    public /* synthetic */ C2004q0(int i, C2020y yVar, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, yVar, repeatMode, j);
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C2004q0)) {
            return false;
        }
        C2004q0 q0Var = (C2004q0) obj;
        if (q0Var.f5589a != this.f5589a || !Intrinsics.areEqual((Object) q0Var.f5590b, (Object) this.f5590b) || q0Var.f5591c != this.f5591c || !C2016w0.m8648f(q0Var.f5592d, this.f5592d)) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: h */
    public final C2020y<T> mo6952h() {
        return this.f5590b;
    }

    public int hashCode() {
        return (((((this.f5589a * 31) + this.f5590b.hashCode()) * 31) + this.f5591c.hashCode()) * 31) + C2016w0.m8651i(this.f5592d);
    }

    /* renamed from: i */
    public final long mo6954i() {
        return this.f5592d;
    }

    /* renamed from: j */
    public final int mo6955j() {
        return this.f5589a;
    }

    @C12579k
    /* renamed from: k */
    public final RepeatMode mo6956k() {
        return this.f5591c;
    }

    public C2004q0(int i, C2020y<T> yVar, RepeatMode repeatMode, long j) {
        this.f5589a = i;
        this.f5590b = yVar;
        this.f5591c = repeatMode;
        this.f5592d = j;
    }

    @C12579k
    /* renamed from: a */
    public <V extends C1997o> C1970g1<V> m8582a(@C12579k C1945a1<T, V> a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "converter");
        return new C1988l1(this.f5589a, (C1966f1) this.f5590b.mo6806a(a1Var), this.f5591c, this.f5592d, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2004q0(int i, C2020y yVar, RepeatMode repeatMode, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, yVar, (i2 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i2 & 8) != 0 ? C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null) : j, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2004q0(int i, C2020y yVar, RepeatMode repeatMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, yVar, (i2 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(level = DeprecationLevel.f28051c, message = "This constructor has been deprecated")
    public /* synthetic */ C2004q0(int i, C2020y yVar, RepeatMode repeatMode) {
        this(i, yVar, repeatMode, C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(yVar, C22218a.f57069g);
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
