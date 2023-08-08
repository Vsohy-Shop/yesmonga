package com.skydoves.landscapist;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1983k;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15110a2;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15127c4;
import androidx.compose.p004ui.graphics.C15178d4;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15268m4;
import androidx.compose.p004ui.graphics.C15271n0;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class Shimmer__ShimmerKt$Shimmer$2$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ Animatable<Float, C1983k> $animatedProgress;
    final /* synthetic */ long $baseColor;
    final /* synthetic */ float $dropOff;
    final /* synthetic */ long $highlightColor;
    final /* synthetic */ float $intensity;
    final /* synthetic */ float $tilt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Shimmer__ShimmerKt$Shimmer$2$1(float f, Animatable<Float, C1983k> animatable, long j, long j2, float f2, float f3) {
        super(1);
        this.$tilt = f;
        this.$animatedProgress = animatable;
        this.$baseColor = j;
        this.$highlightColor = j2;
        this.$intensity = f2;
        this.$dropOff = f3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        C15211f3 f3Var = (C15211f3) Shimmer__ShimmerKt.f86781a.mo52469b();
        if (f3Var == null) {
            f3Var = C15271n0.m66286a();
        }
        C15211f3 f3Var2 = f3Var;
        Intrinsics.checkNotNullExpressionValue(f3Var2, "paintPool.acquire() ?: Paint()");
        Matrix matrix = new Matrix();
        float t = (float) (((double) C15104m.m65023t(eVar.mo42718b())) + (Math.tan(Math.toRadians((double) this.$tilt)) * ((double) C15104m.m65016m(eVar.mo42718b()))));
        try {
            float c = Shimmer__ShimmerKt.m145593d(-t, t, this.$animatedProgress.mo6613u().floatValue());
            Shader c2 = C15178d4.m65581c(C15096g.m64898a(0.0f, 0.0f), C15096g.m64898a(C15104m.m65023t(eVar.mo42718b()), 0.0f), CollectionsKt__CollectionsKt.m40448L(C15240j2.m66071n(this.$baseColor), C15240j2.m66071n(this.$highlightColor), C15240j2.m66071n(this.$highlightColor), C15240j2.m66071n(this.$baseColor)), CollectionsKt__CollectionsKt.m40448L(Float.valueOf(Math.max(((1.0f - this.$intensity) - this.$dropOff) / 2.0f, 0.0f)), Float.valueOf(Math.max(((1.0f - this.$intensity) - 0.001f) / 2.0f, 0.0f)), Float.valueOf(Math.min(((this.$intensity + 1.0f) + 0.001f) / 2.0f, 1.0f)), Float.valueOf(Math.min(((this.$intensity + 1.0f) + this.$dropOff) / 2.0f, 1.0f))), C15268m4.f37596b.mo42908a());
            C15127c4 a = C15110a2.m65150a(c2);
            Paint q = f3Var2.mo42764q();
            q.setAntiAlias(true);
            q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            q.setShader(c2);
            matrix.reset();
            matrix.setRotate(this.$tilt, C15104m.m65023t(eVar.mo42718b()) / 2.0f, C15104m.m65016m(eVar.mo42718b()) / 2.0f);
            matrix.postTranslate(c, 0.0f);
            c2.setLocalMatrix(matrix);
            C15118b2 c3 = eVar.mo42683q5().mo42705c();
            c3.mo42447x(C15106n.m65045m(eVar.mo42718b()), f3Var2);
            C15187e.m65700T3(eVar, a, C15096g.m64898a(0.0f, 0.0f), eVar.mo42718b(), 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
            c3.mo42443q();
        } finally {
            f3Var2.mo42764q().reset();
            Shimmer__ShimmerKt.f86781a.mo52468a(f3Var2);
        }
    }
}
