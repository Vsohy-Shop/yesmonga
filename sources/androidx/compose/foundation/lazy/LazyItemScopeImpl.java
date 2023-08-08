package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,155:1\n135#2:156\n135#2:157\n135#2:158\n135#2:159\n*S KotlinDebug\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n*L\n53#1:156\n64#1:157\n75#1:158\n84#1:159\n*E\n"})
public final class LazyItemScopeImpl implements C2455e {
    @C12579k

    /* renamed from: a */
    public C8700z0<Integer> f6383a = C8539f2.m30981g(Integer.MAX_VALUE, (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: b */
    public C8700z0<Integer> f6384b = C8539f2.m30981g(Integer.MAX_VALUE, (C8410b2) null, 2, (Object) null);

    @C2855v
    @C12579k
    /* renamed from: a */
    public C8767m mo8265a(@C12579k C8767m mVar, @C12579k C1956d0<C16494m> d0Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2431xd19f6fc0(d0Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2451a(d0Var, lVar));
    }

    @C12579k
    /* renamed from: f */
    public C8767m mo8266f(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        C8700z0<Integer> z0Var = this.f6384b;
        if (InspectableValueKt.m71063e()) {
            lVar = new C2432x44a8b19f(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new ParentSizeModifier(f, lVar, (C8578k2) null, z0Var, 4, (DefaultConstructorMarker) null));
    }

    @C12579k
    /* renamed from: g */
    public C8767m mo8267g(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        C8700z0<Integer> z0Var = this.f6383a;
        if (InspectableValueKt.m71063e()) {
            lVar = new C2434xa7eb0b3e(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new ParentSizeModifier(f, lVar, z0Var, (C8578k2) null, 8, (DefaultConstructorMarker) null));
    }

    @C12579k
    /* renamed from: h */
    public C8767m mo8268h(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        C8700z0<Integer> z0Var = this.f6383a;
        C8700z0<Integer> z0Var2 = this.f6384b;
        if (InspectableValueKt.m71063e()) {
            lVar = new C2433x2be35ef9(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new ParentSizeModifier(f, lVar, z0Var, z0Var2));
    }

    /* renamed from: i */
    public final void mo8269i(int i, int i2) {
        this.f6383a.setValue(Integer.valueOf(i));
        this.f6384b.setValue(Integer.valueOf(i2));
    }
}
