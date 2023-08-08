package androidx.compose.runtime.internal;

import androidx.compose.runtime.C8579l;
import androidx.compose.runtime.C8586m1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
/* renamed from: androidx.compose.runtime.internal.b */
public final class C8553b {

    /* renamed from: a */
    public static final int f22994a = 10;

    /* renamed from: b */
    public static final int f22995b = 3;

    /* renamed from: a */
    public static final int m31047a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    @C8579l
    @C12579k
    /* renamed from: b */
    public static final C8552a m31048b(@C12579k C8592o oVar, int i, boolean z, @C12579k Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        Intrinsics.checkNotNullParameter(oVar, "composer");
        Intrinsics.checkNotNullParameter(obj, C28534f.f69159i0);
        oVar.mo14918M(i);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            composableLambdaImpl = new ComposableLambdaImpl(i, z);
            oVar.mo14893C(composableLambdaImpl);
        } else {
            Intrinsics.checkNotNull(N, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) N;
        }
        composableLambdaImpl.mo16176w(obj);
        oVar.mo15002m0();
        return composableLambdaImpl;
    }

    @C8579l
    @C12579k
    /* renamed from: c */
    public static final C8552a m31049c(int i, boolean z, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, C28534f.f69159i0);
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i, z);
        composableLambdaImpl.mo16176w(obj);
        return composableLambdaImpl;
    }

    /* renamed from: d */
    public static final int m31050d(int i) {
        return m31047a(2, i);
    }

    /* renamed from: e */
    public static final boolean m31051e(@C12580l C8586m1 m1Var, @C12579k C8586m1 m1Var2) {
        Intrinsics.checkNotNullParameter(m1Var2, "other");
        if (m1Var != null) {
            if ((m1Var instanceof RecomposeScopeImpl) && (m1Var2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) m1Var;
                if (!recomposeScopeImpl.mo15216s() || Intrinsics.areEqual((Object) m1Var, (Object) m1Var2) || Intrinsics.areEqual((Object) recomposeScopeImpl.mo15207j(), (Object) ((RecomposeScopeImpl) m1Var2).mo15207j())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final int m31052f(int i) {
        return m31047a(1, i);
    }
}
