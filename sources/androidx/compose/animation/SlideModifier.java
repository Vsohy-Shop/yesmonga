package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.runtime.C8578k2;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class SlideModifier extends C2037m {
    @C12579k

    /* renamed from: a */
    public final Transition<EnterExitState>.a<C16494m, C1986l> f5262a;
    @C12579k

    /* renamed from: b */
    public final C8578k2<C2043s> f5263b;
    @C12579k

    /* renamed from: c */
    public final C8578k2<C2043s> f5264c;
    @C12579k

    /* renamed from: d */
    public final C11300l<Transition.C1927b<EnterExitState>, C1956d0<C16494m>> f5265d = new SlideModifier$transitionSpec$1(this);

    /* renamed from: androidx.compose.animation.SlideModifier$a */
    public /* synthetic */ class C1911a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.animation.EnterExitState[] r0 = androidx.compose.animation.EnterExitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SlideModifier.C1911a.<clinit>():void");
        }
    }

    public SlideModifier(@C12579k Transition<EnterExitState>.a<C16494m, C1986l> aVar, @C12579k C8578k2<C2043s> k2Var, @C12579k C8578k2<C2043s> k2Var2) {
        Intrinsics.checkNotNullParameter(aVar, "lazyAnimation");
        Intrinsics.checkNotNullParameter(k2Var, "slideIn");
        Intrinsics.checkNotNullParameter(k2Var2, "slideOut");
        this.f5262a = aVar;
        this.f5263b = k2Var;
        this.f5264c = k2Var2;
    }

    @C12579k
    /* renamed from: a */
    public final Transition<EnterExitState>.a<C16494m, C1986l> mo6575a() {
        return this.f5262a;
    }

    @C12579k
    /* renamed from: b */
    public final C8578k2<C2043s> mo6576b() {
        return this.f5263b;
    }

    @C12579k
    /* renamed from: e */
    public final C8578k2<C2043s> mo6577e() {
        return this.f5264c;
    }

    @C12579k
    /* renamed from: g */
    public final C11300l<Transition.C1927b<EnterExitState>, C1956d0<C16494m>> mo6578g() {
        return this.f5265d;
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new SlideModifier$measure$1(this, t0, C16502r.m74668a(t0.mo44471K0(), t0.mo44468G0())), 4, (Object) null);
    }

    /* renamed from: l */
    public final long mo6579l(@C12579k EnterExitState enterExitState, long j) {
        long j2;
        long j3;
        C11300l<C16500q, C16494m> f;
        C11300l<C16500q, C16494m> f2;
        Intrinsics.checkNotNullParameter(enterExitState, "targetState");
        C2043s value = this.f5263b.getValue();
        if (value == null || (f2 = value.mo7082f()) == null) {
            j2 = C16494m.f40890b.mo47857a();
        } else {
            j2 = f2.invoke(C16500q.m74651b(j)).mo47856w();
        }
        C2043s value2 = this.f5264c.getValue();
        if (value2 == null || (f = value2.mo7082f()) == null) {
            j3 = C16494m.f40890b.mo47857a();
        } else {
            j3 = f.invoke(C16500q.m74651b(j)).mo47856w();
        }
        int i = C1911a.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i == 1) {
            return C16494m.f40890b.mo47857a();
        }
        if (i == 2) {
            return j2;
        }
        if (i == 3) {
            return j3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
