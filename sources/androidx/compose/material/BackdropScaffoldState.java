package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C3044g0
public final class BackdropScaffoldState extends SwipeableState<BackdropValue> {
    @C12579k

    /* renamed from: u */
    public static final Companion f7514u = new Companion((DefaultConstructorMarker) null);

    /* renamed from: v */
    public static final int f7515v = 0;
    @C12579k

    /* renamed from: s */
    public final SnackbarHostState f7516s;
    @C12579k

    /* renamed from: t */
    public final C15446a f7517t;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<BackdropScaffoldState, ?> mo10002a(@C12579k C1968g<Float> gVar, @C12579k C11300l<? super BackdropValue, Boolean> lVar, @C12579k SnackbarHostState snackbarHostState) {
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
            Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
            return SaverKt.m31375a(BackdropScaffoldState$Companion$Saver$1.f7519f, new BackdropScaffoldState$Companion$Saver$2(gVar, lVar, snackbarHostState));
        }

        public Companion() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BackdropScaffoldState(BackdropValue backdropValue, C1968g gVar, C11300l lVar, SnackbarHostState snackbarHostState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(backdropValue, (i & 2) != 0 ? C7885n1.f18885a.mo10889a() : gVar, (i & 4) != 0 ? C28801.f7518f : lVar, (i & 8) != 0 ? new SnackbarHostState() : snackbarHostState);
    }

    @C12580l
    /* renamed from: S */
    public final Object mo9995S(@C12579k C11045c<? super C11079d2> cVar) {
        Object k = SwipeableState.m13939k(this, BackdropValue.Concealed, (C1968g) null, cVar, 2, (Object) null);
        return k == C11063b.m42612h() ? k : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: T */
    public final C15446a mo9996T() {
        return this.f7517t;
    }

    @C12579k
    /* renamed from: U */
    public final SnackbarHostState mo9997U() {
        return this.f7516s;
    }

    /* renamed from: V */
    public final boolean mo9998V() {
        return mo10513p() == BackdropValue.Concealed;
    }

    /* renamed from: W */
    public final boolean mo9999W() {
        return mo10513p() == BackdropValue.Revealed;
    }

    @C12580l
    /* renamed from: X */
    public final Object mo10000X(@C12579k C11045c<? super C11079d2> cVar) {
        Object k = SwipeableState.m13939k(this, BackdropValue.Revealed, (C1968g) null, cVar, 2, (Object) null);
        return k == C11063b.m42612h() ? k : C11079d2.f28267a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState(@C12579k BackdropValue backdropValue, @C12579k C1968g<Float> gVar, @C12579k C11300l<? super BackdropValue, Boolean> lVar, @C12579k SnackbarHostState snackbarHostState) {
        super(backdropValue, gVar, lVar);
        Intrinsics.checkNotNullParameter(backdropValue, "initialValue");
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.f7516s = snackbarHostState;
        this.f7517t = SwipeableKt.m13908g(this);
    }
}
