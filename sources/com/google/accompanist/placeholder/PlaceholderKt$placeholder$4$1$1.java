package com.google.accompanist.placeholder;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\ncom/google/accompanist/placeholder/PlaceholderKt$placeholder$4$1$1\n+ 2 Placeholder.kt\ncom/google/accompanist/placeholder/PlaceholderKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,263:1\n258#2:264\n259#2,4:266\n258#2:270\n259#2,4:272\n245#3:265\n245#3:271\n*S KotlinDebug\n*F\n+ 1 Placeholder.kt\ncom/google/accompanist/placeholder/PlaceholderKt$placeholder$4$1$1\n*L\n166#1:264\n166#1:266,4\n180#1:270\n180#1:272,4\n166#1:265\n180#1:271\n*E\n"})
public final class PlaceholderKt$placeholder$4$1$1 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ long $color;
    final /* synthetic */ C8578k2<Float> $contentAlpha$delegate;
    final /* synthetic */ C15037b $highlight;
    final /* synthetic */ C8700z0<Float> $highlightProgress$delegate;
    final /* synthetic */ C15695i1<LayoutDirection> $lastLayoutDirection;
    final /* synthetic */ C15695i1<C15174d3> $lastOutline;
    final /* synthetic */ C15695i1<C15104m> $lastSize;
    final /* synthetic */ C15211f3 $paint;
    final /* synthetic */ C8578k2<Float> $placeholderAlpha$delegate;
    final /* synthetic */ C15218g4 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaceholderKt$placeholder$4$1$1(C15211f3 f3Var, C15695i1<C15174d3> i1Var, C15218g4 g4Var, long j, C15037b bVar, C15695i1<LayoutDirection> i1Var2, C15695i1<C15104m> i1Var3, C8578k2<Float> k2Var, C8578k2<Float> k2Var2, C8700z0<Float> z0Var) {
        super(1);
        this.$paint = f3Var;
        this.$lastOutline = i1Var;
        this.$shape = g4Var;
        this.$color = j;
        this.$highlight = bVar;
        this.$lastLayoutDirection = i1Var2;
        this.$lastSize = i1Var3;
        this.$contentAlpha$delegate = k2Var;
        this.$placeholderAlpha$delegate = k2Var2;
        this.$highlightProgress$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo42038a(@C12579k C15184c cVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "$this$drawWithContent");
        float a = PlaceholderKt$placeholder$4.m64437e(this.$contentAlpha$delegate);
        boolean z2 = true;
        if (0.01f > a || a > 0.99f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.$paint.mo42753g(PlaceholderKt$placeholder$4.m64437e(this.$contentAlpha$delegate));
            C15211f3 f3Var = this.$paint;
            C15118b2 c = cVar.mo42683q5().mo42705c();
            c.mo42447x(C15106n.m65045m(cVar.mo42718b()), f3Var);
            cVar.mo42716g6();
            c.mo42443q();
        } else if (PlaceholderKt$placeholder$4.m64437e(this.$contentAlpha$delegate) >= 0.99f) {
            cVar.mo42716g6();
        }
        float c2 = PlaceholderKt$placeholder$4.m64440h(this.$placeholderAlpha$delegate);
        if (0.01f > c2 || c2 > 0.99f) {
            z2 = false;
        }
        if (z2) {
            this.$paint.mo42753g(PlaceholderKt$placeholder$4.m64440h(this.$placeholderAlpha$delegate));
            C15211f3 f3Var2 = this.$paint;
            C15695i1<C15174d3> i1Var = this.$lastOutline;
            C15218g4 g4Var = this.$shape;
            long j = this.$color;
            C15037b bVar = this.$highlight;
            C15695i1<LayoutDirection> i1Var2 = this.$lastLayoutDirection;
            C15695i1<C15104m> i1Var3 = this.$lastSize;
            C8700z0<Float> z0Var = this.$highlightProgress$delegate;
            C15118b2 c3 = cVar.mo42683q5().mo42705c();
            c3.mo42447x(C15106n.m65045m(cVar.mo42718b()), f3Var2);
            i1Var.mo45027b(PlaceholderKt.m64427b(cVar, g4Var, j, bVar, PlaceholderKt$placeholder$4.m64438f(z0Var), i1Var.mo45026a(), i1Var2.mo45026a(), i1Var3.mo45026a()));
            c3.mo42443q();
        } else if (PlaceholderKt$placeholder$4.m64440h(this.$placeholderAlpha$delegate) >= 0.99f) {
            this.$lastOutline.mo45027b(PlaceholderKt.m64427b(cVar, this.$shape, this.$color, this.$highlight, PlaceholderKt$placeholder$4.m64438f(this.$highlightProgress$delegate), this.$lastOutline.mo45026a(), this.$lastLayoutDirection.mo45026a(), this.$lastSize.mo45026a()));
        }
        this.$lastSize.mo45027b(C15104m.m65006c(cVar.mo42718b()));
        this.$lastLayoutDirection.mo45027b(cVar.getLayoutDirection());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo42038a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
