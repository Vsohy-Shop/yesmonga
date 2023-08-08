package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.C2429z;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C2429z
@C8567o(parameters = 0)
/* renamed from: androidx.constraintlayout.compose.m */
public final class C16612m extends ConstraintLayoutBaseScope {

    /* renamed from: f */
    public static final int f41285f = 0;

    @C12579k
    /* renamed from: M */
    public final ConstrainScope mo48548M(@C12579k C16591e eVar, @C12579k C11300l<? super ConstrainScope, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "ref");
        Intrinsics.checkNotNullParameter(lVar, "constrainBlock");
        ConstrainScope constrainScope = new ConstrainScope(eVar.mo48480k());
        lVar.invoke(constrainScope);
        mo48255I().addAll(constrainScope.mo48168G());
        return constrainScope;
    }

    @C12579k
    /* renamed from: N */
    public final C16591e mo48549N(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "id");
        return new C16591e(obj);
    }
}
