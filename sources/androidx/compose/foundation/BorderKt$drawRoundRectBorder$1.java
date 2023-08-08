package androidx.compose.foundation;

import androidx.compose.p004ui.geometry.C15088a;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15229i2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawRoundRectBorder$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n221#2:460\n261#2,11:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawRoundRectBorder$1\n*L\n353#1:460\n353#1:461,11\n*E\n"})
public final class BorderKt$drawRoundRectBorder$1 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ long $borderSize;
    final /* synthetic */ C15198m $borderStroke;
    final /* synthetic */ C15421z1 $brush;
    final /* synthetic */ long $cornerRadius;
    final /* synthetic */ boolean $fillArea;
    final /* synthetic */ float $halfStroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $topLeft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRoundRectBorder$1(boolean z, C15421z1 z1Var, long j, float f, float f2, long j2, long j3, C15198m mVar) {
        super(1);
        this.$fillArea = z;
        this.$brush = z1Var;
        this.$cornerRadius = j;
        this.$halfStroke = f;
        this.$strokeWidth = f2;
        this.$topLeft = j2;
        this.$borderSize = j3;
        this.$borderStroke = mVar;
    }

    /* renamed from: a */
    public final void mo7138a(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "$this$onDrawWithContent");
        cVar.mo42716g6();
        if (this.$fillArea) {
            C15187e.m65709d6(cVar, this.$brush, 0, 0, this.$cornerRadius, 0.0f, (C15192h) null, (C15249k2) null, 0, 246, (Object) null);
            return;
        }
        float m = C15088a.m64833m(this.$cornerRadius);
        float f = this.$halfStroke;
        if (m < f) {
            float f2 = this.$strokeWidth;
            float t = C15104m.m65023t(cVar.mo42718b()) - this.$strokeWidth;
            float m2 = C15104m.m65016m(cVar.mo42718b()) - this.$strokeWidth;
            int a = C15229i2.f37536b.mo42797a();
            C15421z1 z1Var = this.$brush;
            long j = this.$cornerRadius;
            C15186d q5 = cVar.mo42683q5();
            long b = q5.mo42704b();
            q5.mo42705c().mo42422E();
            q5.mo42703a().mo42710c(f2, f2, t, m2, a);
            C15187e.m65709d6(cVar, z1Var, 0, 0, j, 0.0f, (C15192h) null, (C15249k2) null, 0, 246, (Object) null);
            q5.mo42705c().mo42443q();
            q5.mo42706d(b);
            return;
        }
        C15187e.m65709d6(cVar, this.$brush, this.$topLeft, this.$borderSize, BorderKt.m8862r(this.$cornerRadius, f), 0.0f, this.$borderStroke, (C15249k2) null, 0, C14092c.f34572Y, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7138a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
