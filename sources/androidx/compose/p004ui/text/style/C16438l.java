package androidx.compose.p004ui.text.style;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.text.SpanStyleKt;
import androidx.compose.p004ui.util.C16515d;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "TextDrawStyleKt")
/* renamed from: androidx.compose.ui.text.style.l */
public final class C16438l {
    @C12579k
    /* renamed from: b */
    public static final TextForegroundStyle m74217b(@C12579k TextForegroundStyle textForegroundStyle, @C12579k TextForegroundStyle textForegroundStyle2, float f) {
        Intrinsics.checkNotNullParameter(textForegroundStyle, "start");
        Intrinsics.checkNotNullParameter(textForegroundStyle2, "stop");
        boolean z = textForegroundStyle instanceof C16413c;
        if (!z && !(textForegroundStyle2 instanceof C16413c)) {
            return TextForegroundStyle.f40663a.mo47583b(C15258l2.m66189n(textForegroundStyle.mo47577a(), textForegroundStyle2.mo47577a(), f));
        }
        if (!z || !(textForegroundStyle2 instanceof C16413c)) {
            return (TextForegroundStyle) SpanStyleKt.m72352c(textForegroundStyle, textForegroundStyle2, f);
        }
        return TextForegroundStyle.f40663a.mo47582a((C15421z1) SpanStyleKt.m72352c(((C16413c) textForegroundStyle).mo47580d(), ((C16413c) textForegroundStyle2).mo47580d(), f), C16515d.m74781a(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f));
    }

    /* renamed from: c */
    public static final long m74218c(long j, float f) {
        if (Float.isNaN(f) || f >= 1.0f) {
            return j;
        }
        return C15240j2.m66080w(j, C15240j2.m66047A(j) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* renamed from: d */
    public static final float m74219d(float f, C11289a<Float> aVar) {
        return Float.isNaN(f) ? aVar.invoke().floatValue() : f;
    }
}
