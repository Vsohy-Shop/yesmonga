package androidx.constraintlayout.compose;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import androidx.constraintlayout.core.state.State;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.constraintlayout.compose.c */
public final class C16586c {
    @C12579k

    /* renamed from: c */
    public static final C16587a f41212c;
    @C12579k

    /* renamed from: d */
    public static final C16586c f41213d = new C16586c(State.Chain.SPREAD, (Float) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final C16586c f41214e = new C16586c(State.Chain.SPREAD_INSIDE, (Float) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final C16586c f41215f;
    @C12579k

    /* renamed from: a */
    public final State.Chain f41216a;
    @C12580l

    /* renamed from: b */
    public final Float f41217b;

    /* renamed from: androidx.constraintlayout.compose.c$a */
    public static final class C16587a {
        public /* synthetic */ C16587a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: c */
        public static /* synthetic */ void m75419c() {
        }

        @C8547h2
        /* renamed from: e */
        public static /* synthetic */ void m75420e() {
        }

        @C8547h2
        /* renamed from: g */
        public static /* synthetic */ void m75421g() {
        }

        @C8547h2
        @C12579k
        /* renamed from: a */
        public final C16586c mo48457a(float f) {
            return new C16586c(State.Chain.PACKED, Float.valueOf(f));
        }

        @C12579k
        /* renamed from: b */
        public final C16586c mo48458b() {
            return C16586c.f41215f;
        }

        @C12579k
        /* renamed from: d */
        public final C16586c mo48459d() {
            return C16586c.f41213d;
        }

        @C12579k
        /* renamed from: f */
        public final C16586c mo48460f() {
            return C16586c.f41214e;
        }

        public C16587a() {
        }
    }

    static {
        C16587a aVar = new C16587a((DefaultConstructorMarker) null);
        f41212c = aVar;
        f41215f = aVar.mo48457a(0.5f);
    }

    public C16586c(@C12579k State.Chain chain, @C12580l Float f) {
        Intrinsics.checkNotNullParameter(chain, "style");
        this.f41216a = chain;
        this.f41217b = f;
    }

    @C12580l
    /* renamed from: d */
    public final Float mo48455d() {
        return this.f41217b;
    }

    @C12579k
    /* renamed from: e */
    public final State.Chain mo48456e() {
        return this.f41216a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16586c(State.Chain chain, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chain, (i & 2) != 0 ? null : f);
    }
}
