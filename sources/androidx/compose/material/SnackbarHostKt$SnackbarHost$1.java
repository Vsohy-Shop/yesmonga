package androidx.compose.material;

import androidx.compose.p004ui.platform.C15851b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", mo22502f = "SnackbarHost.kt", mo22503i = {}, mo22504l = {164}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarHostKt$SnackbarHost$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C15851b $accessibilityManager;
    final /* synthetic */ C3052i1 $currentSnackbarData;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1(C3052i1 i1Var, C15851b bVar, C11045c<? super SnackbarHostKt$SnackbarHost$1> cVar) {
        super(2, cVar);
        this.$currentSnackbarData = i1Var;
        this.$accessibilityManager = bVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.$currentSnackbarData, this.$accessibilityManager, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        boolean z;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C3052i1 i1Var = this.$currentSnackbarData;
            if (i1Var != null) {
                SnackbarDuration duration = i1Var.getDuration();
                if (this.$currentSnackbarData.mo10437a() != null) {
                    z = true;
                } else {
                    z = false;
                }
                long h2 = SnackbarHostKt.m13851h(duration, z, this.$accessibilityManager);
                this.label = 1;
                if (DelayKt.m45925b(h2, this) == h) {
                    return h;
                }
            }
            return C11079d2.f28267a;
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$currentSnackbarData.dismiss();
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SnackbarHostKt$SnackbarHost$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
