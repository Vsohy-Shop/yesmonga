package androidx.constraintlayout.compose;

import androidx.compose.runtime.C8700z0;
import androidx.constraintlayout.core.parser.C16738f;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.C16748d;
import androidx.constraintlayout.core.state.C16749e;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.C12553d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
/* renamed from: androidx.constraintlayout.compose.u */
public abstract class C16629u implements C16592e0 {

    /* renamed from: a */
    public int f41319a = Integer.MIN_VALUE;

    /* renamed from: b */
    public int f41320b = Integer.MIN_VALUE;
    @C12579k

    /* renamed from: c */
    public MotionLayoutDebugFlags f41321c = MotionLayoutDebugFlags.UNKNOWN;
    @C12580l

    /* renamed from: d */
    public C8700z0<Long> f41322d;
    @C12579k

    /* renamed from: e */
    public LayoutInfoFlags f41323e = LayoutInfoFlags.NONE;
    @C12579k

    /* renamed from: f */
    public String f41324f = "";

    /* renamed from: g */
    public long f41325g = System.nanoTime();
    @C12580l

    /* renamed from: v */
    public String f41326v;
    @C12579k

    /* renamed from: w */
    public String f41327w;

    /* renamed from: androidx.constraintlayout.compose.u$a */
    public static final class C16630a implements C16749e {

        /* renamed from: a */
        public final /* synthetic */ C16629u f41328a;

        public C16630a(C16629u uVar) {
            this.f41328a = uVar;
        }

        /* renamed from: a */
        public void mo48601a(int i) {
            this.f41328a.mo48590B(i);
        }

        /* renamed from: b */
        public void mo48602b(int i) {
            this.f41328a.mo48591C(i);
        }

        /* renamed from: c */
        public void mo48603c(float f) {
            this.f41328a.mo48467F(f);
        }

        /* renamed from: d */
        public void mo48604d(int i, int i2) {
            this.f41328a.mo48592E(i, i2);
        }

        /* renamed from: e */
        public long mo48605e() {
            return this.f41328a.f41325g;
        }

        /* renamed from: f */
        public void mo48606f(@C12580l String str) {
            if (str != null) {
                this.f41328a.mo48461D(str);
            }
        }

        @C12579k
        /* renamed from: g */
        public String mo48607g() {
            return this.f41328a.f41327w;
        }

        @C12579k
        /* renamed from: h */
        public String mo48608h() {
            return this.f41328a.f41324f;
        }
    }

    public C16629u(@C12579k @C12553d("json5") String str) {
        Intrinsics.checkNotNullParameter(str, "content");
        this.f41327w = str;
    }

    /* renamed from: A */
    public final void mo48589A() {
        try {
            mo48461D(this.f41327w);
            if (this.f41326v != null) {
                C16748d.m76610c().mo49337f(this.f41326v, new C16630a(this));
            }
        } catch (CLParsingException unused) {
        }
    }

    /* renamed from: B */
    public final void mo48590B(int i) {
        if (i == -1) {
            this.f41321c = MotionLayoutDebugFlags.UNKNOWN;
        } else {
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.UNKNOWN;
            if (i == motionLayoutDebugFlags.ordinal()) {
                this.f41321c = motionLayoutDebugFlags;
            } else {
                MotionLayoutDebugFlags motionLayoutDebugFlags2 = MotionLayoutDebugFlags.NONE;
                if (i == motionLayoutDebugFlags2.ordinal()) {
                    this.f41321c = motionLayoutDebugFlags2;
                } else {
                    MotionLayoutDebugFlags motionLayoutDebugFlags3 = MotionLayoutDebugFlags.SHOW_ALL;
                    if (i == motionLayoutDebugFlags3.ordinal()) {
                        this.f41321c = motionLayoutDebugFlags3;
                    }
                }
            }
        }
        mo48594H();
    }

    /* renamed from: C */
    public final void mo48591C(int i) {
        LayoutInfoFlags layoutInfoFlags = LayoutInfoFlags.NONE;
        if (i == layoutInfoFlags.ordinal()) {
            this.f41323e = layoutInfoFlags;
        } else {
            LayoutInfoFlags layoutInfoFlags2 = LayoutInfoFlags.BOUNDS;
            if (i == layoutInfoFlags2.ordinal()) {
                this.f41323e = layoutInfoFlags2;
            }
        }
        mo48594H();
    }

    /* renamed from: D */
    public void mo48461D(@C12579k String str) {
        boolean z;
        C16738f y0;
        Intrinsics.checkNotNullParameter(str, "content");
        this.f41327w = str;
        try {
            C16738f d = CLParser.m76375d(str);
            if (d != null) {
                if (this.f41326v == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (y0 = d.mo49166y0("Header")) != null) {
                    this.f41326v = y0.mo49144G0("exportAs");
                }
                if (!z) {
                    mo48594H();
                }
            }
        } catch (CLParsingException | Exception unused) {
        }
    }

    /* renamed from: E */
    public final void mo48592E(int i, int i2) {
        this.f41319a = i;
        this.f41320b = i2;
        mo48594H();
    }

    /* renamed from: F */
    public void mo48467F(float f) {
    }

    /* renamed from: G */
    public final void mo48593G(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "content");
        mo48461D(str);
    }

    /* renamed from: H */
    public final void mo48594H() {
        C8700z0<Long> z0Var = this.f41322d;
        if (z0Var != null) {
            Intrinsics.checkNotNull(z0Var);
            C8700z0<Long> z0Var2 = this.f41322d;
            Intrinsics.checkNotNull(z0Var2);
            z0Var.setValue(Long.valueOf(z0Var2.getValue().longValue() + 1));
        }
    }

    @C12579k
    /* renamed from: d */
    public final MotionLayoutDebugFlags mo48595d() {
        return this.f41321c;
    }

    /* renamed from: g */
    public int mo48483g() {
        return this.f41320b;
    }

    /* renamed from: h */
    public void mo48484h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "information");
        this.f41325g = System.nanoTime();
        this.f41324f = str;
    }

    @C12579k
    /* renamed from: j */
    public LayoutInfoFlags mo48485j() {
        return this.f41323e;
    }

    /* renamed from: p */
    public int mo48486p() {
        return this.f41319a;
    }

    /* renamed from: s */
    public final void mo48596s(@C12580l String str) {
        this.f41326v = str;
    }

    /* renamed from: t */
    public final void mo48597t(@C12579k C8700z0<Long> z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "needsUpdate");
        this.f41322d = z0Var;
    }

    @C12579k
    /* renamed from: x */
    public final String mo48598x() {
        return this.f41327w;
    }

    @C12580l
    /* renamed from: y */
    public final String mo48599y() {
        return this.f41326v;
    }

    @C12579k
    /* renamed from: z */
    public final String mo48600z() {
        return this.f41324f;
    }
}
