package androidx.navigation.compose;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.C8623b;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.C19710b;
import java.util.List;
import java.util.ListIterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class NavHostKt$NavHost$4 extends Lambda implements C11305q<String, C8592o, Integer, C11079d2> {
    final /* synthetic */ C19710b $composeNavigator;
    final /* synthetic */ C8700z0<Boolean> $initialCrossfade$delegate;
    final /* synthetic */ C8623b $saveableStateHolder;
    final /* synthetic */ C8578k2<List<NavBackStackEntry>> $visibleEntries$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$4(C8700z0<Boolean> z0Var, C8578k2<? extends List<NavBackStackEntry>> k2Var, C19710b bVar, C8623b bVar2) {
        super(3);
        this.$initialCrossfade$delegate = z0Var;
        this.$visibleEntries$delegate = k2Var;
        this.$composeNavigator = bVar;
        this.$saveableStateHolder = bVar2;
    }

    @C8540g
    /* renamed from: a */
    public final void mo58366a(@C12579k String str, @C12580l C8592o oVar, int i) {
        Object obj;
        int i2;
        Intrinsics.checkNotNullParameter(str, "it");
        if ((i & 14) == 0) {
            if (oVar.mo15006n0(str)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            List f = NavHostKt.m91715c(this.$visibleEntries$delegate);
            ListIterator listIterator = f.listIterator(f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (Intrinsics.areEqual((Object) str, (Object) ((NavBackStackEntry) obj).mo58066g())) {
                    break;
                }
            }
            final NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            C11079d2 d2Var = C11079d2.f28267a;
            C8700z0<Boolean> z0Var = this.$initialCrossfade$delegate;
            C8578k2<List<NavBackStackEntry>> k2Var = this.$visibleEntries$delegate;
            C19710b bVar = this.$composeNavigator;
            oVar.mo14918M(-3686095);
            boolean n0 = oVar.mo15006n0(z0Var) | oVar.mo15006n0(k2Var) | oVar.mo15006n0(bVar);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new NavHostKt$NavHost$4$1$1(z0Var, k2Var, bVar);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            EffectsKt.m29891c(d2Var, (C11300l) N, oVar, 0);
            if (navBackStackEntry != null) {
                NavBackStackEntryProviderKt.m91702a(navBackStackEntry, this.$saveableStateHolder, C8553b.m31048b(oVar, -631736544, true, new C11304p<C8592o, Integer, C11079d2>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C8592o) obj, ((Number) obj2).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    public final void invoke(@C12580l C8592o oVar, int i) {
                        if ((i & 11) != 2 || !oVar.mo15011p()) {
                            ((C19710b.C19712b) navBackStackEntry.mo58065f()).mo58379F0().invoke(navBackStackEntry, oVar, 8);
                        } else {
                            oVar.mo14958a0();
                        }
                    }
                }), oVar, 456);
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo58366a((String) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
