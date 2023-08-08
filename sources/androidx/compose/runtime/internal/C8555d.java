package androidx.compose.runtime.internal;

import androidx.compose.runtime.C8579l;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
/* renamed from: androidx.compose.runtime.internal.d */
public final class C8555d {
    @C8579l
    @C12579k
    /* renamed from: a */
    public static final C8554c m31053a(@C12579k C8592o oVar, int i, boolean z, int i2, @C12579k Object obj) {
        ComposableLambdaNImpl composableLambdaNImpl;
        Intrinsics.checkNotNullParameter(oVar, "composer");
        Intrinsics.checkNotNullParameter(obj, C28534f.f69159i0);
        oVar.mo14918M(i);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            composableLambdaNImpl = new ComposableLambdaNImpl(i, z, i2);
            oVar.mo14893C(composableLambdaNImpl);
        } else {
            Intrinsics.checkNotNull(N, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            composableLambdaNImpl = (ComposableLambdaNImpl) N;
        }
        composableLambdaNImpl.mo16202e(obj);
        oVar.mo15002m0();
        return composableLambdaNImpl;
    }

    @C8579l
    @C12579k
    /* renamed from: b */
    public static final C8554c m31054b(int i, boolean z, int i2, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, C28534f.f69159i0);
        ComposableLambdaNImpl composableLambdaNImpl = new ComposableLambdaNImpl(i, z, i2);
        composableLambdaNImpl.mo16202e(obj);
        return composableLambdaNImpl;
    }
}
