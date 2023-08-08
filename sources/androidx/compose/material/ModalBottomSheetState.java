package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import androidx.compose.runtime.internal.C8567o;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C3044g0
@C8567o(parameters = 0)
public final class ModalBottomSheetState {
    @C12579k

    /* renamed from: d */
    public static final Companion f7718d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f7719e = 8;
    @C12579k

    /* renamed from: a */
    public final C1968g<Float> f7720a;

    /* renamed from: b */
    public final boolean f7721b;
    @C12579k

    /* renamed from: c */
    public final SwipeableV2State<ModalBottomSheetValue> f7722c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<ModalBottomSheetState, ?> mo10298a(@C12579k C1968g<Float> gVar, @C12579k C11300l<? super ModalBottomSheetValue, Boolean> lVar, boolean z) {
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
            return SaverKt.m31375a(ModalBottomSheetState$Companion$Saver$1.f7723f, new ModalBottomSheetState$Companion$Saver$2(gVar, lVar, z));
        }

        @C11395k(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @C11587t0(expression = "Saver(animationSpec, confirmStateChange, skipHalfExpanded)", imports = {}))
        @C12579k
        /* renamed from: b */
        public final C8628e<ModalBottomSheetState, ?> mo10299b(@C12579k C1968g<Float> gVar, boolean z, @C12579k C11300l<? super ModalBottomSheetValue, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
            return mo10298a(gVar, lVar, z);
        }

        public Companion() {
        }
    }

    @C11395k(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @C11587t0(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, isSkipHalfExpanded)", imports = {}))
    public ModalBottomSheetState(@C12579k ModalBottomSheetValue modalBottomSheetValue, @C12579k C1968g<Float> gVar, boolean z, @C12579k C11300l<? super ModalBottomSheetValue, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(modalBottomSheetValue, "initialValue");
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        this.f7720a = gVar;
        this.f7721b = z;
        this.f7722c = new SwipeableV2State(modalBottomSheetValue, gVar, lVar, ModalBottomSheetKt.f7707a, ModalBottomSheetKt.f7708b, (DefaultConstructorMarker) null);
        if (z) {
            if (!(modalBottomSheetValue != ModalBottomSheetValue.HalfExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Object m13617b(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            f = modalBottomSheetState.f7722c.mo10565q();
        }
        return modalBottomSheetState.mo10282a(modalBottomSheetValue, f, cVar);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo10282a(@C12579k ModalBottomSheetValue modalBottomSheetValue, float f, @C12579k C11045c<? super C11079d2> cVar) {
        Object f2 = this.f7722c.mo10555f(modalBottomSheetValue, f, cVar);
        return f2 == C11063b.m42612h() ? f2 : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo10283c(@C12579k C11045c<? super C11079d2> cVar) {
        SwipeableV2State<ModalBottomSheetValue> swipeableV2State = this.f7722c;
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!swipeableV2State.mo10573y(modalBottomSheetValue)) {
            return C11079d2.f28267a;
        }
        Object b = m13617b(this, modalBottomSheetValue, 0.0f, cVar, 2, (Object) null);
        if (b == C11063b.m42612h()) {
            return b;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: d */
    public final C1968g<Float> mo10284d() {
        return this.f7720a;
    }

    @C12579k
    /* renamed from: e */
    public final ModalBottomSheetValue mo10285e() {
        return this.f7722c.mo10562n();
    }

    /* renamed from: f */
    public final boolean mo10286f() {
        return this.f7722c.mo10573y(ModalBottomSheetValue.HalfExpanded);
    }

    /* renamed from: g */
    public final float mo10287g() {
        return this.f7722c.mo10565q();
    }

    @C12579k
    /* renamed from: h */
    public final SwipeableV2State<ModalBottomSheetValue> mo10288h() {
        return this.f7722c;
    }

    @C12579k
    /* renamed from: i */
    public final ModalBottomSheetValue mo10289i() {
        return this.f7722c.mo10571w();
    }

    @C12580l
    /* renamed from: j */
    public final Object mo10290j(@C12579k C11045c<? super C11079d2> cVar) {
        if (!mo10286f()) {
            return C11079d2.f28267a;
        }
        Object b = m13617b(this, ModalBottomSheetValue.HalfExpanded, 0.0f, cVar, 2, (Object) null);
        if (b == C11063b.m42612h()) {
            return b;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: k */
    public final Object mo10291k(@C12579k C11045c<? super C11079d2> cVar) {
        Object b = m13617b(this, ModalBottomSheetValue.Hidden, 0.0f, cVar, 2, (Object) null);
        return b == C11063b.m42612h() ? b : C11079d2.f28267a;
    }

    /* renamed from: l */
    public final boolean mo10292l() {
        return this.f7722c.mo10574z();
    }

    /* renamed from: m */
    public final boolean mo10293m() {
        return this.f7721b;
    }

    /* renamed from: n */
    public final boolean mo10294n() {
        return this.f7722c.mo10562n() != ModalBottomSheetValue.Hidden;
    }

    /* renamed from: o */
    public final float mo10295o() {
        return this.f7722c.mo10545B();
    }

    @C12580l
    /* renamed from: p */
    public final Object mo10296p(@C12579k C11045c<? super C11079d2> cVar) {
        ModalBottomSheetValue modalBottomSheetValue;
        if (mo10286f()) {
            modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
        } else {
            modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        }
        Object b = m13617b(this, modalBottomSheetValue, 0.0f, cVar, 2, (Object) null);
        if (b == C11063b.m42612h()) {
            return b;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: q */
    public final Object mo10297q(@C12579k ModalBottomSheetValue modalBottomSheetValue, @C12579k C11045c<? super C11079d2> cVar) {
        Object J = this.f7722c.mo10553J(modalBottomSheetValue, cVar);
        return J == C11063b.m42612h() ? J : C11079d2.f28267a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, C1968g gVar, boolean z, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i & 2) != 0 ? C7885n1.f18885a.mo10889a() : gVar, (i & 4) != 0 ? false : z, lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @C11587t0(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    public ModalBottomSheetState(@C12579k ModalBottomSheetValue modalBottomSheetValue, @C12579k C1968g<Float> gVar, @C12579k C11300l<? super ModalBottomSheetValue, Boolean> lVar) {
        this(modalBottomSheetValue, gVar, false, lVar);
        Intrinsics.checkNotNullParameter(modalBottomSheetValue, "initialValue");
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
    }
}
