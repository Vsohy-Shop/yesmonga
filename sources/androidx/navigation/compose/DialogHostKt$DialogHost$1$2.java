package androidx.navigation.compose;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.C8623b;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.C19714d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class DialogHostKt$DialogHost$1$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ C19714d.C19716b $destination;
    final /* synthetic */ C19714d $dialogNavigator;
    final /* synthetic */ C8623b $saveableStateHolder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$2(NavBackStackEntry navBackStackEntry, C8623b bVar, C19714d dVar, C19714d.C19716b bVar2) {
        super(2);
        this.$backStackEntry = navBackStackEntry;
        this.$saveableStateHolder = bVar;
        this.$dialogNavigator = dVar;
        this.$destination = bVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            final NavBackStackEntry navBackStackEntry = this.$backStackEntry;
            final C19714d dVar = this.$dialogNavigator;
            EffectsKt.m29891c(navBackStackEntry, new C11300l<C8434e0, C8430d0>() {

                /* renamed from: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$a */
                public static final class C19701a implements C8430d0 {

                    /* renamed from: a */
                    public final /* synthetic */ C19714d f50500a;

                    /* renamed from: b */
                    public final /* synthetic */ NavBackStackEntry f50501b;

                    public C19701a(C19714d dVar, NavBackStackEntry navBackStackEntry) {
                        this.f50500a = dVar;
                        this.f50501b = navBackStackEntry;
                    }

                    /* renamed from: g */
                    public void mo791g() {
                        this.f50500a.mo58383o(this.f50501b);
                    }
                }

                @C12579k
                /* renamed from: a */
                public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
                    Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
                    return new C19701a(dVar, navBackStackEntry);
                }
            }, oVar, 8);
            final NavBackStackEntry navBackStackEntry2 = this.$backStackEntry;
            C8623b bVar = this.$saveableStateHolder;
            final C19714d.C19716b bVar2 = this.$destination;
            NavBackStackEntryProviderKt.m91702a(navBackStackEntry2, bVar, C8553b.m31048b(oVar, -497631156, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        bVar2.mo58384F0().invoke(navBackStackEntry2, oVar, 8);
                    } else {
                        oVar.mo14958a0();
                    }
                }
            }), oVar, 456);
            return;
        }
        oVar.mo14958a0();
    }
}
