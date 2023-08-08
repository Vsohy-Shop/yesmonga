package com.skydoves.landscapist;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.p004ui.graphics.C15247k0;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.painter.C15292a;
import androidx.compose.p004ui.graphics.painter.C15295d;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DrawablePainterKt {
    @C12579k

    /* renamed from: a */
    public static final C11677z f86776a = C10864b0.m38747b(LazyThreadSafetyMode.NONE, DrawablePainterKt$MAIN_HANDLER$2.f86777f);

    /* renamed from: b */
    public static final Handler m145575b() {
        return (Handler) f86776a.getValue();
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public static final Painter m145576c(@C12580l Drawable drawable, @C12580l C8592o oVar, int i) {
        Object obj;
        oVar.mo14918M(-516480828);
        oVar.mo14918M(-3686930);
        boolean n0 = oVar.mo15006n0(drawable);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            if (drawable == null) {
                N = C35319f.f86790g;
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "drawable.bitmap");
                N = new C15292a(C15247k0.m66139c(bitmap), 0, 0, 6, (DefaultConstructorMarker) null);
            } else {
                if (drawable instanceof ColorDrawable) {
                    obj = new C15295d(C15258l2.m66177b(((ColorDrawable) drawable).getColor()), (DefaultConstructorMarker) null);
                } else {
                    Drawable mutate = drawable.mutate();
                    Intrinsics.checkNotNullExpressionValue(mutate, "drawable.mutate()");
                    obj = new DrawablePainter(mutate);
                }
                N = obj;
            }
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        Painter painter = (Painter) N;
        oVar.mo15002m0();
        return painter;
    }
}
