package androidx.compose.p004ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15110a2;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15127c4;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.graphics.C15325u1;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.text.C16349k;
import androidx.compose.p004ui.text.C16358o;
import androidx.compose.p004ui.text.style.C16434j;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidMultiParagraphDraw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n33#2,6:98\n33#2,6:104\n33#2,6:110\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n*L\n55#1:98,6\n62#1:104,6\n93#1:110,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.e */
public final class C16369e {
    /* renamed from: a */
    public static final void m73880a(@C12579k C16349k kVar, @C12579k C15118b2 b2Var, @C12579k C15421z1 z1Var, float f, @C12580l C15205e4 e4Var, @C12580l C16434j jVar, @C12580l C15192h hVar, int i) {
        C15118b2 b2Var2 = b2Var;
        C15421z1 z1Var2 = z1Var;
        Intrinsics.checkNotNullParameter(kVar, "$this$drawMultiParagraph");
        Intrinsics.checkNotNullParameter(b2Var2, "canvas");
        Intrinsics.checkNotNullParameter(z1Var2, "brush");
        b2Var.mo42422E();
        if (kVar.mo47387B().size() <= 1) {
            m73882c(kVar, b2Var, z1Var, f, e4Var, jVar, hVar, i);
        } else if (z1Var2 instanceof C15225h4) {
            m73882c(kVar, b2Var, z1Var, f, e4Var, jVar, hVar, i);
        } else if (z1Var2 instanceof C15127c4) {
            List<C16358o> B = kVar.mo47387B();
            int size = B.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                C16358o oVar = B.get(i2);
                f3 += oVar.mo47449n().getHeight();
                f2 = Math.max(f2, oVar.mo47449n().getWidth());
            }
            Shader c = ((C15127c4) z1Var2).mo42412c(C15106n.m65033a(f2, f3));
            Matrix matrix = new Matrix();
            c.getLocalMatrix(matrix);
            List<C16358o> B2 = kVar.mo47387B();
            int size2 = B2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C16358o oVar2 = B2.get(i3);
                oVar2.mo47449n().mo46217w(b2Var, C15110a2.m65150a(c), f, e4Var, jVar, hVar, i);
                b2Var2.mo42433e(0.0f, oVar2.mo47449n().getHeight());
                matrix.setTranslate(0.0f, -oVar2.mo47449n().getHeight());
                c.setLocalMatrix(matrix);
            }
        }
        b2Var.mo42443q();
    }

    /* renamed from: b */
    public static /* synthetic */ void m73881b(C16349k kVar, C15118b2 b2Var, C15421z1 z1Var, float f, C15205e4 e4Var, C16434j jVar, C15192h hVar, int i, int i2, Object obj) {
        float f2;
        C15205e4 e4Var2;
        C16434j jVar2;
        C15192h hVar2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            e4Var2 = null;
        } else {
            e4Var2 = e4Var;
        }
        if ((i2 & 16) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((i2 & 32) != 0) {
            hVar2 = null;
        } else {
            hVar2 = hVar;
        }
        if ((i2 & 64) != 0) {
            i3 = C15325u1.f37708b.mo43015B();
        } else {
            i3 = i;
        }
        m73880a(kVar, b2Var, z1Var, f2, e4Var2, jVar2, hVar2, i3);
    }

    /* renamed from: c */
    public static final void m73882c(C16349k kVar, C15118b2 b2Var, C15421z1 z1Var, float f, C15205e4 e4Var, C16434j jVar, C15192h hVar, int i) {
        List<C16358o> B = kVar.mo47387B();
        int size = B.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16358o oVar = B.get(i2);
            oVar.mo47449n().mo46217w(b2Var, z1Var, f, e4Var, jVar, hVar, i);
            b2Var.mo42433e(0.0f, oVar.mo47449n().getHeight());
        }
    }
}
