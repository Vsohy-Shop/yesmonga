package androidx.compose.p004ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.C0375v;
import androidx.compose.p004ui.graphics.C15247k0;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nImageResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n76#2:61\n25#3:62\n36#3:69\n1114#4,6:63\n1114#4,6:70\n*S KotlinDebug\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n*L\n54#1:61\n55#1:62\n58#1:69\n55#1:63,6\n58#1:70,6\n*E\n"})
/* renamed from: androidx.compose.ui.res.d */
public final class C16011d {
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final C15403w2 m71828a(@C12579k C15403w2.C15404a aVar, @C0375v int i, @C12580l C8592o oVar, int i2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        oVar.mo14918M(-304919470);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-304919470, i2, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar2 = C8592o.f23032a;
        if (N == aVar2.mo16277a()) {
            N = new TypedValue();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        TypedValue typedValue = (TypedValue) N;
        context.getResources().getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        Intrinsics.checkNotNull(charSequence);
        String obj = charSequence.toString();
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(obj);
        Object N2 = oVar.mo14921N();
        if (n0 || N2 == aVar2.mo16277a()) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            N2 = m71829b(aVar, resources, i);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C15403w2 w2Var = (C15403w2) N2;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return w2Var;
    }

    @C12579k
    /* renamed from: b */
    public static final C15403w2 m71829b(@C12579k C15403w2.C15404a aVar, @C12579k Resources resources, @C0375v int i) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resources, "res");
        Drawable drawable = resources.getDrawable(i, (Resources.Theme) null);
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Intrinsics.checkNotNullExpressionValue(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return C15247k0.m66139c(bitmap);
    }
}
