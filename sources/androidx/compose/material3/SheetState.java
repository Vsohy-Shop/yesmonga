package androidx.compose.material3;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
public final class SheetState {
    @C12579k

    /* renamed from: d */
    public static final Companion f19646d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f19647e = 0;

    /* renamed from: a */
    public final boolean f19648a;

    /* renamed from: b */
    public final boolean f19649b;
    @C12579k

    /* renamed from: c */
    public SwipeableV2State<SheetValue> f19650c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<SheetState, SheetValue> mo11873a(boolean z, @C12579k C11300l<? super SheetValue, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
            return SaverKt.m31375a(SheetState$Companion$Saver$1.f19652f, new SheetState$Companion$Saver$2(z, lVar));
        }

        public Companion() {
        }
    }

    public SheetState(boolean z, @C12579k SheetValue sheetValue, @C12579k C11300l<? super SheetValue, Boolean> lVar, boolean z2) {
        Intrinsics.checkNotNullParameter(sheetValue, "initialValue");
        Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
        this.f19648a = z;
        this.f19649b = z2;
        boolean z3 = true;
        if (z) {
            if (!(sheetValue != SheetValue.PartiallyExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
            }
        }
        if (z2) {
            if (!(sheetValue == SheetValue.Hidden ? false : z3)) {
                throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
            }
        }
        this.f19650c = new SwipeableV2State(sheetValue, C8374y2.f22489a.mo14799b(), lVar, (C11304p) null, 0.0f, 24, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m26143b(SheetState sheetState, SheetValue sheetValue, float f, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            f = sheetState.f19650c.mo12115s();
        }
        return sheetState.mo11854a(sheetValue, f, cVar);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo11854a(@C12579k SheetValue sheetValue, float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object i = this.f19650c.mo12106i(sheetValue, f, cVar);
        return i == C11063b.m42612h() ? i : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo11855c(@C12579k C11045c<? super C11079d2> cVar) {
        Object j = SwipeableV2State.m26491j(this.f19650c, SheetValue.Expanded, 0.0f, cVar, 2, (Object) null);
        return j == C11063b.m42612h() ? j : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: d */
    public final SheetValue mo11856d() {
        return this.f19650c.mo12113q();
    }

    /* renamed from: e */
    public final boolean mo11857e() {
        return this.f19650c.mo12090B(SheetValue.Expanded);
    }

    /* renamed from: f */
    public final boolean mo11858f() {
        return this.f19650c.mo12090B(SheetValue.PartiallyExpanded);
    }

    @C12580l
    /* renamed from: g */
    public final Float mo11859g() {
        return this.f19650c.mo12118v();
    }

    /* renamed from: h */
    public final boolean mo11860h() {
        return this.f19649b;
    }

    /* renamed from: i */
    public final boolean mo11861i() {
        return this.f19648a;
    }

    @C12579k
    /* renamed from: j */
    public final SwipeableV2State<SheetValue> mo11862j() {
        return this.f19650c;
    }

    @C12579k
    /* renamed from: k */
    public final SheetValue mo11863k() {
        return this.f19650c.mo12122z();
    }

    @C12580l
    /* renamed from: l */
    public final Object mo11864l(@C12579k C11045c<? super C11079d2> cVar) {
        if (!this.f19649b) {
            Object b = m26143b(this, SheetValue.Hidden, 0.0f, cVar, 2, (Object) null);
            if (b == C11063b.m42612h()) {
                return b;
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
    }

    /* renamed from: m */
    public final boolean mo11865m() {
        return this.f19650c.mo12113q() != SheetValue.Hidden;
    }

    @C12580l
    /* renamed from: n */
    public final Object mo11866n(@C12579k C11045c<? super C11079d2> cVar) {
        if (!this.f19648a) {
            Object b = m26143b(this, SheetValue.PartiallyExpanded, 0.0f, cVar, 2, (Object) null);
            if (b == C11063b.m42612h()) {
                return b;
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
    }

    /* renamed from: o */
    public final float mo11867o() {
        return this.f19650c.mo12093E();
    }

    /* renamed from: p */
    public final void mo11868p(@C12579k SwipeableV2State<SheetValue> swipeableV2State) {
        Intrinsics.checkNotNullParameter(swipeableV2State, "<set-?>");
        this.f19650c = swipeableV2State;
    }

    @C12580l
    /* renamed from: q */
    public final Object mo11869q(float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object L = this.f19650c.mo12100L(f, cVar);
        return L == C11063b.m42612h() ? L : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: r */
    public final Object mo11870r(@C12579k C11045c<? super C11079d2> cVar) {
        SheetValue sheetValue;
        if (mo11858f()) {
            sheetValue = SheetValue.PartiallyExpanded;
        } else {
            sheetValue = SheetValue.Expanded;
        }
        Object b = m26143b(this, sheetValue, 0.0f, cVar, 2, (Object) null);
        if (b == C11063b.m42612h()) {
            return b;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: s */
    public final Object mo11871s(@C12579k SheetValue sheetValue, @C12579k C11045c<? super C11079d2> cVar) {
        Object N = this.f19650c.mo12102N(sheetValue, cVar);
        return N == C11063b.m42612h() ? N : C11079d2.f28267a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SheetState(boolean z, SheetValue sheetValue, C11300l lVar, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? SheetValue.Hidden : sheetValue, (i & 4) != 0 ? C80901.f19651f : lVar, (i & 8) != 0 ? false : z2);
    }
}
