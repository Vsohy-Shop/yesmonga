package androidx.compose.material3;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NavigationDrawerKt$ModalNavigationDrawer$2$5 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ String $navigationMenu;
    final /* synthetic */ C12074o0 $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$5(String str, DrawerState drawerState, C12074o0 o0Var) {
        super(1);
        this.$navigationMenu = str;
        this.$drawerState = drawerState;
        this.$scope = o0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71973N0(qVar, this.$navigationMenu);
        if (this.$drawerState.mo11517n()) {
            final DrawerState drawerState = this.$drawerState;
            final C12074o0 o0Var = this.$scope;
            SemanticsPropertiesKt.m72024l(qVar, (String) null, new C11289a<Boolean>() {

                @C11067d(mo22501c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1", mo22502f = "NavigationDrawer.kt", mo22503i = {}, mo22504l = {312}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
                @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
                /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1 */
                public static final class C80691 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return new C80691(drawerState, cVar);
                    }

                    @C12580l
                    public final Object invokeSuspend(@C12579k Object obj) {
                        Object h = C11063b.m42612h();
                        int i = this.label;
                        if (i == 0) {
                            C11661u0.m45747n(obj);
                            DrawerState drawerState = drawerState;
                            this.label = 1;
                            if (drawerState.mo11510b(this) == h) {
                                return h;
                            }
                        } else if (i == 1) {
                            C11661u0.m45747n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return C11079d2.f28267a;
                    }

                    @C12580l
                    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
                        return ((C80691) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                    }
                }

                @C12579k
                public final Boolean invoke() {
                    if (drawerState.mo11513g().mo12057o().invoke(DrawerValue.Closed).booleanValue()) {
                        C12074o0 o0Var = o0Var;
                        final DrawerState drawerState = drawerState;
                        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C80691((C11045c<? super C80691>) null), 3, (Object) null);
                    }
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
        }
    }
}
