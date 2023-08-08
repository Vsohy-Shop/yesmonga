package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1", mo22502f = "AppBar.kt", mo22503i = {}, mo22504l = {1071}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 extends SuspendLambda implements C11305q<C12074o0, Float, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8275r3 $scrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(C8275r3 r3Var, C11045c<? super AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1> cVar) {
        super(3, cVar);
        this.$scrollBehavior = r3Var;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo11150g(@C12579k C12074o0 o0Var, float f, @C12580l C11045c<? super C11079d2> cVar) {
        AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(this.$scrollBehavior, cVar);
        appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1.F$0 = f;
        return appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1.invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo11150g((C12074o0) obj, ((Number) obj2).floatValue(), (C11045c) obj3);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            float f = this.F$0;
            TopAppBarState state = this.$scrollBehavior.getState();
            C2013v<Float> c = this.$scrollBehavior.mo11537c();
            C1968g<Float> d = this.$scrollBehavior.mo11538d();
            this.label = 1;
            if (AppBarKt.m25404x(state, f, c, d, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
