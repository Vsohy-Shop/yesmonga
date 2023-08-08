package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8578k2;
import com.urbanairship.iam.C9168d0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1180:1\n1#2:1181\n79#3:1182\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n*L\n1152#1:1182\n*E\n"})
public final class ExpandShrinkModifier extends C2037m {
    @C12579k

    /* renamed from: a */
    public final Transition<EnterExitState>.a<C16500q, C1986l> f5247a;
    @C12579k

    /* renamed from: b */
    public final Transition<EnterExitState>.a<C16494m, C1986l> f5248b;
    @C12579k

    /* renamed from: c */
    public final C8578k2<ChangeSize> f5249c;
    @C12579k

    /* renamed from: d */
    public final C8578k2<ChangeSize> f5250d;
    @C12579k

    /* renamed from: e */
    public final C8578k2<C8734c> f5251e;
    @C12580l

    /* renamed from: f */
    public C8734c f5252f;
    @C12579k

    /* renamed from: g */
    public final C11300l<Transition.C1927b<EnterExitState>, C1956d0<C16500q>> f5253g = new ExpandShrinkModifier$sizeTransitionSpec$1(this);

    /* renamed from: androidx.compose.animation.ExpandShrinkModifier$a */
    public /* synthetic */ class C1909a {
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.ExpandShrinkModifier.C1909a.<clinit>():void");
        }
    }

    public ExpandShrinkModifier(@C12579k Transition<EnterExitState>.a<C16500q, C1986l> aVar, @C12579k Transition<EnterExitState>.a<C16494m, C1986l> aVar2, @C12579k C8578k2<ChangeSize> k2Var, @C12579k C8578k2<ChangeSize> k2Var2, @C12579k C8578k2<? extends C8734c> k2Var3) {
        Intrinsics.checkNotNullParameter(aVar, "sizeAnimation");
        Intrinsics.checkNotNullParameter(aVar2, "offsetAnimation");
        Intrinsics.checkNotNullParameter(k2Var, "expand");
        Intrinsics.checkNotNullParameter(k2Var2, "shrink");
        Intrinsics.checkNotNullParameter(k2Var3, C9168d0.f24891y);
        this.f5247a = aVar;
        this.f5248b = aVar2;
        this.f5249c = k2Var;
        this.f5250d = k2Var2;
        this.f5251e = k2Var3;
    }

    @C12579k
    /* renamed from: a */
    public final C8578k2<C8734c> mo6542a() {
        return this.f5251e;
    }

    @C12580l
    /* renamed from: b */
    public final C8734c mo6543b() {
        return this.f5252f;
    }

    @C12579k
    /* renamed from: e */
    public final C8578k2<ChangeSize> mo6544e() {
        return this.f5249c;
    }

    @C12579k
    /* renamed from: g */
    public final Transition<EnterExitState>.a<C16494m, C1986l> mo6545g() {
        return this.f5248b;
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        long j2;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        long a = C16502r.m74668a(t0.mo44471K0(), t0.mo44468G0());
        long q = this.f5247a.mo6717a(this.f5253g, new ExpandShrinkModifier$measure$currentSize$1(this, a)).getValue().mo47895q();
        long w = this.f5248b.mo6717a(ExpandShrinkModifier$measure$offsetDelta$1.f5254f, new ExpandShrinkModifier$measure$offsetDelta$2(this, a)).getValue().mo47856w();
        C8734c cVar = this.f5252f;
        if (cVar != null) {
            j2 = cVar.mo17059a(a, q, LayoutDirection.Ltr);
        } else {
            j2 = C16494m.f40890b.mo47857a();
        }
        return C15568h0.m69206r2(h0Var, C16500q.m74662m(q), C16500q.m74659j(q), (Map) null, new ExpandShrinkModifier$measure$1(t0, j2, w), 4, (Object) null);
    }

    @C12579k
    /* renamed from: l */
    public final C8578k2<ChangeSize> mo6546l() {
        return this.f5250d;
    }

    @C12579k
    /* renamed from: m */
    public final Transition<EnterExitState>.a<C16500q, C1986l> mo6547m() {
        return this.f5247a;
    }

    @C12579k
    /* renamed from: n */
    public final C11300l<Transition.C1927b<EnterExitState>, C1956d0<C16500q>> mo6548n() {
        return this.f5253g;
    }

    /* renamed from: o */
    public final void mo6549o(@C12580l C8734c cVar) {
        this.f5252f = cVar;
    }

    /* renamed from: q */
    public final long mo6550q(@C12579k EnterExitState enterExitState, long j) {
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(enterExitState, "targetState");
        ChangeSize value = this.f5249c.getValue();
        if (value != null) {
            j2 = value.mo6502j().invoke(C16500q.m74651b(j)).mo47895q();
        } else {
            j2 = j;
        }
        ChangeSize value2 = this.f5250d.getValue();
        if (value2 != null) {
            j3 = value2.mo6502j().invoke(C16500q.m74651b(j)).mo47895q();
        } else {
            j3 = j;
        }
        int i = C1909a.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j2;
        }
        if (i == 3) {
            return j3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: r */
    public final long mo6551r(@C12579k EnterExitState enterExitState, long j) {
        Intrinsics.checkNotNullParameter(enterExitState, "targetState");
        if (this.f5252f == null) {
            return C16494m.f40890b.mo47857a();
        }
        if (this.f5251e.getValue() == null) {
            return C16494m.f40890b.mo47857a();
        }
        if (Intrinsics.areEqual((Object) this.f5252f, (Object) this.f5251e.getValue())) {
            return C16494m.f40890b.mo47857a();
        }
        int i = C1909a.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i == 1) {
            return C16494m.f40890b.mo47857a();
        }
        if (i == 2) {
            return C16494m.f40890b.mo47857a();
        }
        if (i == 3) {
            ChangeSize value = this.f5250d.getValue();
            if (value == null) {
                return C16494m.f40890b.mo47857a();
            }
            long q = value.mo6502j().invoke(C16500q.m74651b(j)).mo47895q();
            C8734c value2 = this.f5251e.getValue();
            Intrinsics.checkNotNull(value2);
            long j2 = j;
            long j3 = q;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            long a = value2.mo17059a(j2, j3, layoutDirection);
            C8734c cVar = this.f5252f;
            Intrinsics.checkNotNull(cVar);
            long a2 = cVar.mo17059a(j2, j3, layoutDirection);
            return C16496n.m74593a(C16494m.m74581m(a) - C16494m.m74581m(a2), C16494m.m74583o(a) - C16494m.m74583o(a2));
        }
        throw new NoWhenBranchMatchedException();
    }
}
