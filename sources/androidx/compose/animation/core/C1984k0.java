package androidx.compose.animation.core;

import androidx.compose.runtime.internal.C8567o;
import com.bumptech.glide.load.engine.executor.C22218a;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.k0 */
public final class C1984k0<T> implements C1968g<T> {

    /* renamed from: d */
    public static final int f5527d = 8;
    @C12579k

    /* renamed from: a */
    public final C2020y<T> f5528a;
    @C12579k

    /* renamed from: b */
    public final RepeatMode f5529b;

    /* renamed from: c */
    public final long f5530c;

    public /* synthetic */ C1984k0(C2020y yVar, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, repeatMode, j);
    }

    @C12579k
    /* renamed from: a */
    public <V extends C1997o> C1953c1<V> mo6806a(@C12579k C1945a1<T, V> a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "converter");
        return new C1982j1((C1966f1) this.f5528a.mo6806a(a1Var), this.f5529b, this.f5530c, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C1984k0)) {
            return false;
        }
        C1984k0 k0Var = (C1984k0) obj;
        if (!Intrinsics.areEqual((Object) k0Var.f5528a, (Object) this.f5528a) || k0Var.f5529b != this.f5529b || !C2016w0.m8648f(k0Var.f5530c, this.f5530c)) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: h */
    public final C2020y<T> mo6878h() {
        return this.f5528a;
    }

    public int hashCode() {
        return (((this.f5528a.hashCode() * 31) + this.f5529b.hashCode()) * 31) + C2016w0.m8651i(this.f5530c);
    }

    /* renamed from: i */
    public final long mo6880i() {
        return this.f5530c;
    }

    @C12579k
    /* renamed from: j */
    public final RepeatMode mo6881j() {
        return this.f5529b;
    }

    public C1984k0(C2020y<T> yVar, RepeatMode repeatMode, long j) {
        this.f5528a = yVar;
        this.f5529b = repeatMode;
        this.f5530c = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1984k0(C2020y yVar, RepeatMode repeatMode, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, (i & 2) != 0 ? RepeatMode.Restart : repeatMode, (i & 4) != 0 ? C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null) : j, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1984k0(C2020y yVar, RepeatMode repeatMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, (i & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(level = DeprecationLevel.f28051c, message = "This constructor has been deprecated")
    public /* synthetic */ C1984k0(C2020y yVar, RepeatMode repeatMode) {
        this(yVar, repeatMode, C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(yVar, C22218a.f57069g);
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
