package androidx.compose.p004ui.node;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.node.ModifierNodeOwnerScope */
public final class ModifierNodeOwnerScope implements C15680d1 {
    @C12579k

    /* renamed from: b */
    public static final C15656a f38922b = new C15656a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final C11300l<ModifierNodeOwnerScope, C11079d2> f38923c = ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1.f38925f;
    @C12579k

    /* renamed from: a */
    public final C15749y0 f38924a;

    /* renamed from: androidx.compose.ui.node.ModifierNodeOwnerScope$a */
    public static final class C15656a {
        public /* synthetic */ C15656a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11300l<ModifierNodeOwnerScope, C11079d2> mo44816a() {
            return ModifierNodeOwnerScope.f38923c;
        }

        public C15656a() {
        }
    }

    public ModifierNodeOwnerScope(@C12579k C15749y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "observerNode");
        this.f38924a = y0Var;
    }

    @C12579k
    /* renamed from: b */
    public final C15749y0 mo44815b() {
        return this.f38924a;
    }

    /* renamed from: e0 */
    public boolean mo44553e0() {
        return this.f38924a.mo17252q().mo17236Q();
    }
}
