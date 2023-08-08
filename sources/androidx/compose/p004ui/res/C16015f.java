package androidx.compose.p004ui.res;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.vector.C15340c;
import androidx.compose.p004ui.graphics.vector.compat.C15346c;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.res.C16012e;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.vectordrawable.graphics.drawable.C20729i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,116:1\n76#2:117\n76#2:135\n25#3:118\n67#3,3:125\n66#3:128\n1114#4,6:119\n1114#4,6:129\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:117\n88#1:135\n60#1:118\n69#1:125,3\n69#1:128\n60#1:119,6\n69#1:129,6\n*E\n"})
/* renamed from: androidx.compose.ui.res.f */
public final class C16015f {
    @C12579k

    /* renamed from: a */
    public static final String f39708a = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG";

    /* renamed from: b */
    public static final C15403w2 m71847b(Resources resources, int i) {
        try {
            return C16011d.m71829b(C15403w2.f38094a, resources, i);
        } catch (Throwable unused) {
            throw new IllegalArgumentException(f39708a);
        }
    }

    @C8540g
    /* renamed from: c */
    public static final C15340c m71848c(Resources.Theme theme, Resources resources, int i, int i2, C8592o oVar, int i3) {
        oVar.mo14918M(21855625);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)");
        }
        C16012e eVar = (C16012e) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70953h());
        C16012e.C16014b bVar = new C16012e.C16014b(theme, i);
        C16012e.C16013a b = eVar.mo45988b(bVar);
        if (b == null) {
            XmlResourceParser xml = resources.getXml(i);
            Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(id)");
            if (Intrinsics.areEqual((Object) C15346c.m66968m(xml).getName(), (Object) C20729i.f53485E0)) {
                b = C16019j.m71860a(theme, resources, xml, i2);
                eVar.mo45990d(bVar, b);
            } else {
                throw new IllegalArgumentException(f39708a);
            }
        }
        C15340c f = b.mo45996f();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.graphics.w2} */
    /* JADX WARNING: type inference failed for: r10v4, types: [androidx.compose.ui.graphics.vector.VectorPainter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.graphics.painter.Painter m71849d(@androidx.annotation.C0375v int r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12) {
        /*
            r0 = 473971343(0x1c403a8f, float:6.3603156E-22)
            r11.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r1, r2)
        L_0x0012:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r0 = r11.mo15032w(r0)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            android.content.res.Resources r3 = androidx.compose.p004ui.res.C16017h.m71854a(r11, r1)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r2)
            java.lang.Object r2 = r11.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            if (r2 != r5) goto L_0x003b
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r11.mo14893C(r2)
        L_0x003b:
            r11.mo15002m0()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            r5 = 1
            r3.getValue(r10, r2, r5)
            java.lang.CharSequence r6 = r2.string
            if (r6 == 0) goto L_0x0053
            r7 = 2
            r8 = 0
            java.lang.String r9 = ".xml"
            boolean r7 = kotlin.text.StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r9, (boolean) r1, (int) r7, (java.lang.Object) r8)
            if (r7 != r5) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r5 = r1
        L_0x0054:
            if (r5 == 0) goto L_0x007c
            r4 = -738265327(0xffffffffd3fef711, float:-2.19013356E12)
            r11.mo14918M(r4)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            java.lang.String r4 = "context.theme"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            int r5 = r2.changingConfigurations
            int r12 = r12 << 6
            r12 = r12 & 896(0x380, float:1.256E-42)
            r7 = r12 | 72
            r2 = r0
            r4 = r10
            r6 = r11
            androidx.compose.ui.graphics.vector.c r10 = m71848c(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.graphics.vector.VectorPainter r10 = androidx.compose.p004ui.graphics.vector.VectorPainterKt.m66824c(r10, r11, r1)
            r11.mo15002m0()
            goto L_0x00c6
        L_0x007c:
            r12 = -738265172(0xffffffffd3fef7ac, float:-2.19015388E12)
            r11.mo14918M(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r11.mo14918M(r1)
            boolean r1 = r11.mo15006n0(r6)
            boolean r12 = r11.mo15006n0(r12)
            r12 = r12 | r1
            boolean r0 = r11.mo15006n0(r0)
            r12 = r12 | r0
            java.lang.Object r0 = r11.mo14921N()
            if (r12 != 0) goto L_0x00aa
            java.lang.Object r12 = r4.mo16277a()
            if (r0 != r12) goto L_0x00b1
        L_0x00aa:
            androidx.compose.ui.graphics.w2 r0 = m71847b(r3, r10)
            r11.mo14893C(r0)
        L_0x00b1:
            r11.mo15002m0()
            r2 = r0
            androidx.compose.ui.graphics.w2 r2 = (androidx.compose.p004ui.graphics.C15403w2) r2
            androidx.compose.ui.graphics.painter.a r10 = new androidx.compose.ui.graphics.painter.a
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r10
            r1.<init>(r2, r3, r5, r7, r8)
            r11.mo15002m0()
        L_0x00c6:
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x00cf
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00cf:
            r11.mo15002m0()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.res.C16015f.m71849d(int, androidx.compose.runtime.o, int):androidx.compose.ui.graphics.painter.Painter");
    }
}
