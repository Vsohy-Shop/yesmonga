package androidx.compose.foundation;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawGenericBorder$3\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n120#2,4:460\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawGenericBorder$3\n*L\n317#1:460,4\n*E\n"})
public final class BorderKt$drawGenericBorder$3 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ Ref.ObjectRef<C15403w2> $cacheImageBitmap;
    final /* synthetic */ C15249k2 $colorFilter;
    final /* synthetic */ C15098i $pathBounds;
    final /* synthetic */ long $pathBoundsSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$drawGenericBorder$3(C15098i iVar, Ref.ObjectRef<C15403w2> objectRef, long j, C15249k2 k2Var) {
        super(1);
        this.$pathBounds = iVar;
        this.$cacheImageBitmap = objectRef;
        this.$pathBoundsSize = j;
        this.$colorFilter = k2Var;
    }

    /* renamed from: a */
    public final void mo7136a(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "$this$onDrawWithContent");
        cVar.mo42716g6();
        float t = this.$pathBounds.mo42279t();
        float B = this.$pathBounds.mo42249B();
        Ref.ObjectRef<C15403w2> objectRef = this.$cacheImageBitmap;
        long j = this.$pathBoundsSize;
        C15249k2 k2Var = this.$colorFilter;
        cVar.mo42683q5().mo42703a().mo42712e(t, B);
        C15187e.m65715m0(cVar, (C15403w2) objectRef.element, 0, j, 0, 0, 0.0f, (C15192h) null, k2Var, 0, 0, 890, (Object) null);
        cVar.mo42683q5().mo42703a().mo42712e(-t, -B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7136a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
