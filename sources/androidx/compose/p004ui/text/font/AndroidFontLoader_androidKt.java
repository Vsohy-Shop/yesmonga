package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.res.C17465i;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;

/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader_androidKt */
public final class AndroidFontLoader_androidKt {
    /* renamed from: c */
    public static final Typeface m72827c(C16245u0 u0Var, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C16247v0.f40354a.mo47019a(context, u0Var);
        }
        Typeface j = C17465i.m80178j(context, u0Var.mo47015h());
        Intrinsics.checkNotNull(j);
        Intrinsics.checkNotNullExpressionValue(j, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return j;
    }

    /* renamed from: d */
    public static final Object m72828d(C16245u0 u0Var, Context context, C11045c<? super Typeface> cVar) {
        return C11965h.m47673h(C11768d1.m46781c(), new AndroidFontLoader_androidKt$loadAsync$2(u0Var, context, (C11045c<? super AndroidFontLoader_androidKt$loadAsync$2>) null), cVar);
    }
}
