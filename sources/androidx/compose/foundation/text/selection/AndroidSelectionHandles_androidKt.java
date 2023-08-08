package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.draw.CacheDrawScope;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15173d2;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.C15325u1;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.C15410x2;
import androidx.compose.p004ui.graphics.C15417y2;
import androidx.compose.p004ui.graphics.colorspace.C15138c;
import androidx.compose.p004ui.graphics.drawscope.C15179a;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n558#2,17:332\n50#3:349\n49#3:350\n1114#4,6:351\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n194#1:332,17\n232#1:349\n232#1:350\n232#1:351,6\n*E\n"})
public final class AndroidSelectionHandles_androidKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m12664a(@C12579k C8767m mVar, boolean z, @C12579k ResolvedTextDirection resolvedTextDirection, boolean z2, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        Intrinsics.checkNotNullParameter(resolvedTextDirection, "direction");
        C8592o o = oVar.mo15009o(47957398);
        if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14961b(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (o.mo15006n0(resolvedTextDirection)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (o.mo14961b(z2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(47957398, i, -1, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)");
            }
            C2428y0.m10726a(m12669f(SizeKt.m10089E(mVar, C2834l.m13091c(), C2834l.m13090b()), z, resolvedTextDirection, z2), o, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(mVar, z, resolvedTextDirection, z2, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.compose.foundation.text.selection.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12665b(long r24, @org.jetbrains.annotations.C12579k androidx.compose.foundation.text.selection.HandleReferencePoint r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r28, int r29) {
        /*
            r3 = r26
            r11 = r27
            r12 = r29
            java.lang.String r0 = "handleReferencePoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -1409050158(0xffffffffac0399d2, float:-1.8701607E-12)
            r1 = r28
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r12 & 14
            r13 = r24
            if (r2 != 0) goto L_0x002a
            boolean r2 = r1.mo14980g(r13)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r12
            goto L_0x002b
        L_0x002a:
            r2 = r12
        L_0x002b:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x003b
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x0038
            r4 = 32
            goto L_0x003a
        L_0x0038:
            r4 = 16
        L_0x003a:
            r2 = r2 | r4
        L_0x003b:
            r4 = r12 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r1.mo14927P(r11)
            if (r4 == 0) goto L_0x0048
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x004a
        L_0x0048:
            r4 = 128(0x80, float:1.794E-43)
        L_0x004a:
            r2 = r2 | r4
        L_0x004b:
            r4 = r2 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x005d
            boolean r4 = r1.mo15011p()
            if (r4 != 0) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            r1.mo14958a0()
            goto L_0x00da
        L_0x005d:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x0069
            r4 = -1
            java.lang.String r5 = "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:224)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r4, r5)
        L_0x0069:
            float r0 = androidx.compose.p004ui.geometry.C15094f.m64880p(r24)
            int r0 = kotlin.math.C11409d.m43851L0(r0)
            float r4 = androidx.compose.p004ui.geometry.C15094f.m64882r(r24)
            int r4 = kotlin.math.C11409d.m43851L0(r4)
            long r4 = androidx.compose.p004ui.unit.C16496n.m74593a(r0, r4)
            androidx.compose.ui.unit.m r0 = androidx.compose.p004ui.unit.C16494m.m74570b(r4)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r6)
            boolean r6 = r1.mo15006n0(r3)
            boolean r0 = r1.mo15006n0(r0)
            r0 = r0 | r6
            java.lang.Object r6 = r1.mo14921N()
            if (r0 != 0) goto L_0x009e
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r6 != r0) goto L_0x00a7
        L_0x009e:
            androidx.compose.foundation.text.selection.d r6 = new androidx.compose.foundation.text.selection.d
            r0 = 0
            r6.<init>(r3, r4, r0)
            r1.mo14893C(r6)
        L_0x00a7:
            r1.mo15002m0()
            r4 = r6
            androidx.compose.foundation.text.selection.d r4 = (androidx.compose.foundation.text.selection.C2824d) r4
            r5 = 0
            androidx.compose.ui.window.h r6 = new androidx.compose.ui.window.h
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 0
            r22 = 15
            r23 = 0
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            int r0 = r2 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r9 = r0 | 384(0x180, float:5.38E-43)
            r10 = 2
            r7 = r27
            r8 = r1
            androidx.compose.p004ui.window.AndroidPopup_androidKt.m74868a(r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00da
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00da:
            androidx.compose.runtime.t1 r6 = r1.mo15020s()
            if (r6 != 0) goto L_0x00e1
            goto L_0x00f2
        L_0x00e1:
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1 r7 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
            r0 = r7
            r1 = r24
            r3 = r26
            r4 = r27
            r5 = r29
            r0.<init>(r1, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m12665b(long, androidx.compose.foundation.text.selection.HandleReferencePoint, kotlin.jvm.functions.p, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m12666c(long j, boolean z, @C12579k ResolvedTextDirection resolvedTextDirection, boolean z2, @C12579k C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        HandleReferencePoint handleReferencePoint;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
        C8767m mVar2 = mVar;
        int i9 = i;
        Intrinsics.checkNotNullParameter(resolvedTextDirection2, "direction");
        Intrinsics.checkNotNullParameter(mVar2, "modifier");
        C8592o o = oVar.mo15009o(-616295642);
        long j2 = j;
        if ((i9 & 14) == 0) {
            if (o.mo14980g(j2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        boolean z3 = z;
        if ((i9 & 112) == 0) {
            if (o.mo14961b(z3)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 896) == 0) {
            if (o.mo15006n0(resolvedTextDirection2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        boolean z4 = z2;
        if ((i9 & 7168) == 0) {
            if (o.mo14961b(z4)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i9) == 0) {
            if (o.mo15006n0(mVar2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        if ((458752 & i9) == 0) {
            if (o.mo14927P(pVar2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((374491 & i10) != 74898 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-616295642, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)");
            }
            if (m12671h(z, resolvedTextDirection, z2)) {
                handleReferencePoint = HandleReferencePoint.TopRight;
            } else {
                handleReferencePoint = HandleReferencePoint.TopLeft;
            }
            HandleReferencePoint handleReferencePoint2 = handleReferencePoint;
            AndroidSelectionHandles_androidKt$SelectionHandle$1 androidSelectionHandles_androidKt$SelectionHandle$1 = r0;
            AndroidSelectionHandles_androidKt$SelectionHandle$1 androidSelectionHandles_androidKt$SelectionHandle$12 = new AndroidSelectionHandles_androidKt$SelectionHandle$1(pVar, mVar, z, j, i10, resolvedTextDirection, z2);
            m12665b(j, handleReferencePoint2, C8553b.m31048b(o, 732099485, true, androidSelectionHandles_androidKt$SelectionHandle$1), o, (i10 & 14) | C22132b.f56831b);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AndroidSelectionHandles_androidKt$SelectionHandle$2(j, z, resolvedTextDirection, z2, mVar, pVar, i));
        }
    }

    @C12579k
    /* renamed from: e */
    public static final C15403w2 m12668e(@C12579k CacheDrawScope cacheDrawScope, float f) {
        CacheDrawScope cacheDrawScope2 = cacheDrawScope;
        float f2 = f;
        Intrinsics.checkNotNullParameter(cacheDrawScope2, "<this>");
        int ceil = ((int) ((float) Math.ceil((double) f2))) * 2;
        C2823c cVar = C2823c.f7439a;
        C15403w2 c = cVar.mo9850c();
        C15118b2 a = cVar.mo9848a();
        C15179a b = cVar.mo9849b();
        if (c == null || a == null || ceil > c.getWidth() || ceil > c.getHeight()) {
            c = C15417y2.m67304b(ceil, ceil, C15410x2.f38097b.mo43576a(), false, (C15138c) null, 24, (Object) null);
            cVar.mo9853f(c);
            a = C15173d2.m65563a(c);
            cVar.mo9851d(a);
        }
        C15403w2 w2Var = c;
        C15118b2 b2Var = a;
        if (b == null) {
            b = new C15179a();
            cVar.mo9852e(b);
        }
        C15179a aVar = b;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long a2 = C15106n.m65033a((float) w2Var.getWidth(), (float) w2Var.getHeight());
        C15179a.C15180a A = aVar.mo42656A();
        C16479d a3 = A.mo42687a();
        LayoutDirection b2 = A.mo42688b();
        C15118b2 c2 = A.mo42689c();
        long d = A.mo42690d();
        C15179a.C15180a A2 = aVar.mo42656A();
        A2.mo42699l(cacheDrawScope2);
        A2.mo42700m(layoutDirection);
        A2.mo42698k(b2Var);
        A2.mo42701n(a2);
        b2Var.mo42422E();
        C15179a aVar2 = aVar;
        C15187e.m65710e5(aVar2, C15240j2.f37547b.mo42841a(), 0, aVar.mo42718b(), 0.0f, (C15192h) null, (C15249k2) null, C15325u1.f37708b.mo43017a(), 58, (Object) null);
        C15187e.m65710e5(aVar2, C15258l2.m66179d(4278190080L), C15094f.f37256b.mo42248e(), C15106n.m65033a(f2, f2), 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
        C15403w2 w2Var2 = w2Var;
        C15187e.m65705a6(aVar, C15258l2.m66179d(4278190080L), f, C15096g.m64898a(f2, f2), 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
        b2Var.mo42443q();
        C15179a.C15180a A3 = aVar.mo42656A();
        A3.mo42699l(a3);
        A3.mo42700m(b2);
        A3.mo42698k(c2);
        A3.mo42701n(d);
        return w2Var2;
    }

    @C12579k
    /* renamed from: f */
    public static final C8767m m12669f(@C12579k C8767m mVar, boolean z, @C12579k ResolvedTextDirection resolvedTextDirection, boolean z2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(resolvedTextDirection, "direction");
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(z, resolvedTextDirection, z2), 1, (Object) null);
    }

    /* renamed from: g */
    public static final boolean m12670g(@C12579k ResolvedTextDirection resolvedTextDirection, boolean z) {
        Intrinsics.checkNotNullParameter(resolvedTextDirection, "direction");
        if ((resolvedTextDirection != ResolvedTextDirection.Ltr || z) && (resolvedTextDirection != ResolvedTextDirection.Rtl || !z)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m12671h(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        if (z) {
            return m12670g(resolvedTextDirection, z2);
        }
        if (!m12670g(resolvedTextDirection, z2)) {
            return true;
        }
        return false;
    }
}
