package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.graphics.C15333v2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8547h2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n154#2:124\n154#2:125\n154#2:128\n135#3:126\n146#3:127\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n64#1:124\n101#1:125\n98#1:128\n103#1:126\n102#1:127\n*E\n"})
/* renamed from: androidx.compose.ui.draw.ShadowKt */
public final class ShadowKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v7, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8547h2
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m32494a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r14, float r15, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.C15218g4 r16, boolean r17, long r18, long r20) {
        /*
            r0 = r14
            java.lang.String r1 = "$this$shadow"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "shape"
            r10 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            r1 = 0
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r11 = r15
            int r1 = androidx.compose.p004ui.unit.C16483g.m74452z(r15, r1)
            if (r1 > 0) goto L_0x001c
            if (r17 == 0) goto L_0x004f
        L_0x001c:
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x0032
            androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r2.<init>(r3, r4, r5, r6, r8)
            goto L_0x0036
        L_0x0032:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0036:
            androidx.compose.ui.m$a r12 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.draw.ShadowKt$shadow$2$1 r13 = new androidx.compose.ui.draw.ShadowKt$shadow$2$1
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r2.<init>(r3, r4, r5, r6, r8)
            androidx.compose.ui.m r2 = androidx.compose.p004ui.graphics.C15320t2.m66557a(r12, r13)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71062d(r14, r1, r2)
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.draw.ShadowKt.m32494a(androidx.compose.ui.m, float, androidx.compose.ui.graphics.g4, boolean, long, long):androidx.compose.ui.m");
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m32495b(C8767m mVar, float f, C15218g4 g4Var, boolean z, long j, long j2, int i, Object obj) {
        C15218g4 g4Var2;
        boolean z2;
        long j3;
        long j4;
        if ((i & 2) != 0) {
            g4Var2 = C15321t3.m66567a();
        } else {
            g4Var2 = g4Var;
        }
        if ((i & 4) != 0) {
            z2 = false;
            float f2 = f;
            if (C16483g.m74452z(f, C16483g.m74435M((float) 0)) > 0) {
                z2 = true;
            }
        } else {
            float f3 = f;
            z2 = z;
        }
        if ((i & 8) != 0) {
            j3 = C15333v2.m66725b();
        } else {
            j3 = j;
        }
        if ((i & 16) != 0) {
            j4 = C15333v2.m66725b();
        } else {
            j4 = j2;
        }
        return m32494a(mVar, f, g4Var2, z2, j3, j4);
    }

    @C11395k(level = DeprecationLevel.f28051c, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @C11587t0(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    @C8547h2
    /* renamed from: c */
    public static final /* synthetic */ C8767m m32496c(C8767m mVar, float f, C15218g4 g4Var, boolean z) {
        Intrinsics.checkNotNullParameter(mVar, "$this$shadow");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        return m32494a(mVar, f, g4Var, z, C15333v2.m66725b(), C15333v2.m66725b());
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m32497d(C8767m mVar, float f, C15218g4 g4Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            g4Var = C15321t3.m66567a();
        }
        if ((i & 4) != 0) {
            z = false;
            if (C16483g.m74452z(f, C16483g.m74435M((float) 0)) > 0) {
                z = true;
            }
        }
        return m32496c(mVar, f, g4Var, z);
    }
}
