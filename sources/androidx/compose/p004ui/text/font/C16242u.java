package androidx.compose.p004ui.text.font;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8585m0;
import androidx.core.graphics.C17598i1;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.text.font.u */
public abstract class C16242u {
    @C12579k

    /* renamed from: b */
    public static final C16243a f40340b = new C16243a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40341c = 0;
    @C12579k

    /* renamed from: d */
    public static final C16249w0 f40342d = new C16220l();
    @C12579k

    /* renamed from: e */
    public static final C16216k0 f40343e = new C16216k0(C17598i1.f45966D, "FontFamily.SansSerif");
    @C12579k

    /* renamed from: f */
    public static final C16216k0 f40344f = new C16216k0("serif", "FontFamily.Serif");
    @C12579k

    /* renamed from: g */
    public static final C16216k0 f40345g = new C16216k0("monospace", "FontFamily.Monospace");
    @C12579k

    /* renamed from: v */
    public static final C16216k0 f40346v = new C16216k0("cursive", "FontFamily.Cursive");

    /* renamed from: a */
    public final boolean f40347a;

    /* renamed from: androidx.compose.ui.text.font.u$a */
    public static final class C16243a {
        public /* synthetic */ C16243a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16216k0 mo47007a() {
            return C16242u.f40346v;
        }

        @C12579k
        /* renamed from: b */
        public final C16249w0 mo47008b() {
            return C16242u.f40342d;
        }

        @C12579k
        /* renamed from: c */
        public final C16216k0 mo47009c() {
            return C16242u.f40345g;
        }

        @C12579k
        /* renamed from: d */
        public final C16216k0 mo47010d() {
            return C16242u.f40343e;
        }

        @C12579k
        /* renamed from: e */
        public final C16216k0 mo47011e() {
            return C16242u.f40344f;
        }

        public C16243a() {
        }
    }

    /* renamed from: androidx.compose.ui.text.font.u$b */
    public interface C16244b {
        /* renamed from: c */
        static /* synthetic */ C8578k2 m73173c(C16244b bVar, C16242u uVar, C16209i0 i0Var, int i, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    uVar = null;
                }
                if ((i3 & 2) != 0) {
                    i0Var = C16209i0.f40292b.mo46952m();
                }
                if ((i3 & 4) != 0) {
                    i = C16190e0.f40252b.mo46883b();
                }
                if ((i3 & 8) != 0) {
                    i2 = C16194f0.f40257b.mo46895a();
                }
                return bVar.mo46784b(uVar, i0Var, i, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }

        @C12580l
        /* renamed from: a */
        Object mo46783a(@C12579k C16242u uVar, @C12579k C11045c<? super C11079d2> cVar);

        @C12579k
        /* renamed from: b */
        C8578k2<Object> mo46784b(@C12580l C16242u uVar, @C12579k C16209i0 i0Var, int i, int i2);
    }

    public /* synthetic */ C16242u(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: y */
    public static /* synthetic */ void m73166y() {
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Unused property that has no meaning. Do not use.")
    /* renamed from: w */
    public final boolean mo47006w() {
        return this.f40347a;
    }

    public C16242u(boolean z) {
        this.f40347a = z;
    }
}
