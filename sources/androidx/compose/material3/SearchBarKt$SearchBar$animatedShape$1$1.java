package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15090b;
import androidx.compose.p004ui.geometry.C15103l;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$animatedShape$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,746:1\n88#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$animatedShape$1$1\n*L\n197#1:747\n*E\n"})
public final class SearchBarKt$SearchBar$animatedShape$1$1 extends Lambda implements C11305q<C15231i3, C15104m, LayoutDirection, C11079d2> {
    final /* synthetic */ C8578k2<Float> $animationProgress;
    final /* synthetic */ C16479d $density;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$animatedShape$1$1(C16479d dVar, C8578k2<Float> k2Var) {
        super(3);
        this.$density = dVar;
        this.$animationProgress = k2Var;
    }

    /* renamed from: a */
    public final void mo11830a(@C12579k C15231i3 i3Var, long j, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(i3Var, "$this$$receiver");
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
        i3Var.mo42817r(C15103l.m64990f(C15106n.m65045m(j), C15090b.m64846b(this.$density.mo7425g5(C16483g.m74435M(SearchBarKt.f19612a * (((float) 1) - this.$animationProgress.getValue().floatValue()))), 0.0f, 2, (Object) null)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo11830a((C15231i3) obj, ((C15104m) obj2).mo42315y(), (LayoutDirection) obj3);
        return C11079d2.f28267a;
    }
}
