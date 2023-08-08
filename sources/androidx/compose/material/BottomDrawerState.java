package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.runtime.internal.C8567o;
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

@C3044g0
@C8567o(parameters = 0)
public final class BottomDrawerState extends SwipeableState<BottomDrawerValue> {
    @C12579k

    /* renamed from: t */
    public static final Companion f7530t = new Companion((DefaultConstructorMarker) null);

    /* renamed from: u */
    public static final int f7531u = 0;
    @C12579k

    /* renamed from: s */
    public final C15446a f7532s;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<BottomDrawerState, BottomDrawerValue> mo10019a(@C12579k C11300l<? super BottomDrawerValue, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
            return SaverKt.m31375a(BottomDrawerState$Companion$Saver$1.f7534f, new BottomDrawerState$Companion$Saver$2(lVar));
        }

        public Companion() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomDrawerValue, (i & 2) != 0 ? C28821.f7533f : lVar);
    }

    @C12580l
    /* renamed from: S */
    public final Object mo10010S(@C12579k C11045c<? super C11079d2> cVar) {
        Object k = SwipeableState.m13939k(this, BottomDrawerValue.Closed, (C1968g) null, cVar, 2, (Object) null);
        return k == C11063b.m42612h() ? k : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: T */
    public final Object mo10011T(@C12579k C11045c<? super C11079d2> cVar) {
        Object k = SwipeableState.m13939k(this, BottomDrawerValue.Expanded, (C1968g) null, cVar, 2, (Object) null);
        return k == C11063b.m42612h() ? k : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: U */
    public final C15446a mo10012U() {
        return this.f7532s;
    }

    /* renamed from: V */
    public final boolean mo10013V() {
        return mo10513p() == BottomDrawerValue.Closed;
    }

    /* renamed from: W */
    public final boolean mo10014W() {
        return mo10513p() == BottomDrawerValue.Expanded;
    }

    /* renamed from: X */
    public final boolean mo10015X() {
        return mo10513p() != BottomDrawerValue.Closed;
    }

    /* renamed from: Y */
    public final boolean mo10016Y() {
        return mo10510m().values().contains(BottomDrawerValue.Open);
    }

    @C12580l
    /* renamed from: Z */
    public final Object mo10017Z(@C12579k C11045c<? super C11079d2> cVar) {
        BottomDrawerValue bottomDrawerValue;
        if (mo10016Y()) {
            bottomDrawerValue = BottomDrawerValue.Open;
        } else {
            bottomDrawerValue = BottomDrawerValue.Expanded;
        }
        Object k = SwipeableState.m13939k(this, bottomDrawerValue, (C1968g) null, cVar, 2, (Object) null);
        if (k == C11063b.m42612h()) {
            return k;
        }
        return C11079d2.f28267a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomDrawerState(@C12579k BottomDrawerValue bottomDrawerValue, @C12579k C11300l<? super BottomDrawerValue, Boolean> lVar) {
        super(bottomDrawerValue, DrawerKt.m13442j(), lVar);
        Intrinsics.checkNotNullParameter(bottomDrawerValue, "initialValue");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        this.f7532s = SwipeableKt.m13908g(this);
    }
}
