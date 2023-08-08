package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.internal.C8567o;
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

@C8251n0
@C8567o(parameters = 0)
public final class DismissState {
    @C12579k

    /* renamed from: b */
    public static final Companion f19367b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f19368c = 0;
    @C12579k

    /* renamed from: a */
    public final SwipeableV2State<DismissValue> f19369a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<DismissState, DismissValue> mo11505a(@C12579k C11300l<? super DismissValue, Boolean> lVar, @C12579k C11304p<? super C16479d, ? super Float, Float> pVar) {
            Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
            Intrinsics.checkNotNullParameter(pVar, "positionalThreshold");
            return SaverKt.m31375a(DismissState$Companion$Saver$1.f19371f, new DismissState$Companion$Saver$2(lVar, pVar));
        }

        public Companion() {
        }
    }

    public DismissState(@C12579k DismissValue dismissValue, @C12579k C11300l<? super DismissValue, Boolean> lVar, @C12579k C11304p<? super C16479d, ? super Float, Float> pVar) {
        Intrinsics.checkNotNullParameter(dismissValue, "initialValue");
        Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
        Intrinsics.checkNotNullParameter(pVar, "positionalThreshold");
        this.f19369a = new SwipeableV2State(dismissValue, (C1968g) null, lVar, pVar, SwipeToDismissKt.f19752a, 2, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo11493a(@C12579k DismissDirection dismissDirection, @C12579k C11045c<? super C11079d2> cVar) {
        DismissValue dismissValue;
        if (dismissDirection == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        Object j = SwipeableV2State.m26491j(this.f19369a, dismissValue, 0.0f, cVar, 2, (Object) null);
        if (j == C11063b.m42612h()) {
            return j;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: b */
    public final DismissValue mo11494b() {
        return this.f19369a.mo12113q();
    }

    @C12580l
    /* renamed from: c */
    public final DismissDirection mo11495c() {
        if (Intrinsics.areEqual(mo11496d(), 0.0f) || mo11496d() == null) {
            return null;
        }
        Float d = mo11496d();
        Intrinsics.checkNotNull(d);
        return d.floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    @C12580l
    /* renamed from: d */
    public final Float mo11496d() {
        return this.f19369a.mo12118v();
    }

    /* renamed from: e */
    public final float mo11497e() {
        return this.f19369a.mo12120x();
    }

    @C12579k
    /* renamed from: f */
    public final SwipeableV2State<DismissValue> mo11498f() {
        return this.f19369a;
    }

    @C12579k
    /* renamed from: g */
    public final DismissValue mo11499g() {
        return this.f19369a.mo12122z();
    }

    /* renamed from: h */
    public final boolean mo11500h(@C12579k DismissDirection dismissDirection) {
        DismissValue dismissValue;
        Intrinsics.checkNotNullParameter(dismissDirection, "direction");
        DismissValue b = mo11494b();
        if (dismissDirection == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        if (b == dismissValue) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final float mo11501i() {
        return this.f19369a.mo12093E();
    }

    @C12580l
    /* renamed from: j */
    public final Object mo11502j(@C12579k C11045c<? super C11079d2> cVar) {
        Object j = SwipeableV2State.m26491j(this.f19369a, DismissValue.Default, 0.0f, cVar, 2, (Object) null);
        return j == C11063b.m42612h() ? j : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: k */
    public final Object mo11503k(@C12579k DismissValue dismissValue, @C12579k C11045c<? super C11079d2> cVar) {
        Object N = this.f19369a.mo12102N(dismissValue, cVar);
        return N == C11063b.m42612h() ? N : C11079d2.f28267a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DismissState(DismissValue dismissValue, C11300l lVar, C11304p<C16479d, Float, Float> pVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dismissValue, (i & 2) != 0 ? C80131.f19370f : lVar, (i & 4) != 0 ? SwipeToDismissDefaults.f19748a.mo12014a() : pVar);
    }
}
