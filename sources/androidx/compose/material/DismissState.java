package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
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
public final class DismissState extends SwipeableState<DismissValue> {
    @C12579k

    /* renamed from: s */
    public static final Companion f7632s = new Companion((DefaultConstructorMarker) null);

    /* renamed from: t */
    public static final int f7633t = 0;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<DismissState, DismissValue> mo10135a(@C12579k C11300l<? super DismissValue, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
            return SaverKt.m31375a(DismissState$Companion$Saver$1.f7635f, new DismissState$Companion$Saver$2(lVar));
        }

        public Companion() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DismissState(DismissValue dismissValue, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dismissValue, (i & 2) != 0 ? C29131.f7634f : lVar);
    }

    @C12580l
    /* renamed from: S */
    public final Object mo10130S(@C12579k DismissDirection dismissDirection, @C12579k C11045c<? super C11079d2> cVar) {
        DismissValue dismissValue;
        if (dismissDirection == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        Object k = SwipeableState.m13939k(this, dismissValue, (C1968g) null, cVar, 2, (Object) null);
        if (k == C11063b.m42612h()) {
            return k;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: T */
    public final DismissDirection mo10131T() {
        if (mo10518v().getValue().floatValue() == 0.0f) {
            return null;
        }
        return mo10518v().getValue().floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    /* renamed from: U */
    public final boolean mo10132U(@C12579k DismissDirection dismissDirection) {
        DismissValue dismissValue;
        Intrinsics.checkNotNullParameter(dismissDirection, "direction");
        Object p = mo10513p();
        if (dismissDirection == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        if (p == dismissValue) {
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: V */
    public final Object mo10133V(@C12579k C11045c<? super C11079d2> cVar) {
        Object k = SwipeableState.m13939k(this, DismissValue.Default, (C1968g) null, cVar, 2, (Object) null);
        return k == C11063b.m42612h() ? k : C11079d2.f28267a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DismissState(@C12579k DismissValue dismissValue, @C12579k C11300l<? super DismissValue, Boolean> lVar) {
        super(dismissValue, (C1968g) null, lVar, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(dismissValue, "initialValue");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
    }
}
