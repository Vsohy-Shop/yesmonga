package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C3044g0
public final class BottomSheetState {
    @C12579k

    /* renamed from: b */
    public static final Companion f7558b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f7559c = 0;
    @C12579k

    /* renamed from: a */
    public final SwipeableV2State<BottomSheetValue> f7560a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<BottomSheetState, ?> mo10074a(@C12579k C1968g<Float> gVar, @C12579k C11300l<? super BottomSheetValue, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
            return SaverKt.m31375a(BottomSheetState$Companion$Saver$1.f7562f, new BottomSheetState$Companion$Saver$2(gVar, lVar));
        }

        public Companion() {
        }
    }

    public BottomSheetState(@C12579k BottomSheetValue bottomSheetValue, @C12579k C1968g<Float> gVar, @C12579k C11300l<? super BottomSheetValue, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bottomSheetValue, "initialValue");
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
        this.f7560a = new SwipeableV2State(bottomSheetValue, gVar, lVar, (C11304p) null, 0.0f, 24, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m13324b(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, float f, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            f = bottomSheetState.f7560a.mo10565q();
        }
        return bottomSheetState.mo10061a(bottomSheetValue, f, cVar);
    }

    @C11395k(message = "Use requireOffset() to access the offset.", replaceWith = @C11587t0(expression = "requireOffset()", imports = {}))
    /* renamed from: g */
    public static /* synthetic */ void m13325g() {
    }

    @C12580l
    /* renamed from: a */
    public final Object mo10061a(@C12579k BottomSheetValue bottomSheetValue, float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object f2 = this.f7560a.mo10555f(bottomSheetValue, f, cVar);
        return f2 == C11063b.m42612h() ? f2 : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo10062c(@C12579k C11045c<? super C11079d2> cVar) {
        Object g = SwipeableV2State.m14015g(this.f7560a, BottomSheetValue.Collapsed, 0.0f, cVar, 2, (Object) null);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: d */
    public final Object mo10063d(@C12579k C11045c<? super C11079d2> cVar) {
        SwipeableV2State<BottomSheetValue> swipeableV2State = this.f7560a;
        BottomSheetValue bottomSheetValue = BottomSheetValue.Expanded;
        if (!swipeableV2State.mo10573y(bottomSheetValue)) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object g = SwipeableV2State.m14015g(this.f7560a, bottomSheetValue, 0.0f, cVar, 2, (Object) null);
        if (g == C11063b.m42612h()) {
            return g;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: e */
    public final BottomSheetValue mo10064e() {
        return this.f7560a.mo10562n();
    }

    /* renamed from: f */
    public final float mo10065f() {
        throw new IllegalStateException("Use requireOffset() to access the offset.".toString());
    }

    /* renamed from: h */
    public final float mo10066h() {
        return this.f7560a.mo10570v();
    }

    @C12579k
    /* renamed from: i */
    public final SwipeableV2State<BottomSheetValue> mo10067i() {
        return this.f7560a;
    }

    /* renamed from: j */
    public final boolean mo10068j() {
        return this.f7560a.mo10574z();
    }

    /* renamed from: k */
    public final boolean mo10069k() {
        return this.f7560a.mo10562n() == BottomSheetValue.Collapsed;
    }

    /* renamed from: l */
    public final boolean mo10070l() {
        return this.f7560a.mo10562n() == BottomSheetValue.Expanded;
    }

    /* renamed from: m */
    public final float mo10071m() {
        return this.f7560a.mo10545B();
    }

    @C12580l
    /* renamed from: n */
    public final Object mo10072n(@C12579k BottomSheetValue bottomSheetValue, @C12579k C11045c<? super C11079d2> cVar) {
        Object J = this.f7560a.mo10553J(bottomSheetValue, cVar);
        return J == C11063b.m42612h() ? J : C11079d2.f28267a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomSheetState(BottomSheetValue bottomSheetValue, C1968g gVar, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomSheetValue, (i & 2) != 0 ? C7885n1.f18885a.mo10889a() : gVar, (i & 4) != 0 ? C29031.f7561f : lVar);
    }
}
