package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Section.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/component/SectionKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,46:1\n74#2,6:47\n80#2:79\n84#2:85\n75#3:53\n76#3,11:55\n89#3:84\n76#4:54\n460#5,13:66\n473#5,3:81\n154#6:80\n*S KotlinDebug\n*F\n+ 1 Section.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/component/SectionKt\n*L\n22#1:47,6\n22#1:79\n22#1:85\n22#1:53\n22#1:55,11\n22#1:84\n22#1:54\n22#1:66,13\n22#1:81,3\n25#1:80\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.component.SectionKt */
public final class SectionKt {
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m104223a(@C12580l C8767m mVar, @C12579k String str, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m.C8768a aVar;
        C8592o oVar2;
        int i4;
        int i5;
        int i6;
        String str2 = str;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        int i7 = i;
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(pVar2, "content");
        C8592o o = oVar.mo15009o(-290221294);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i7 | 6;
            mVar2 = mVar;
        } else if ((i7 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            mVar2 = mVar;
            i3 = i7;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i7 & 112) == 0) {
            if (o.mo15006n0(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i7 & 896) == 0) {
            if (o.mo14927P(pVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 731) != 146 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-290221294, i9, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.component.Section (Section.kt:16)");
            }
            C8767m d = BackgroundKt.m8825d(aVar, C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(d);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            int i10 = i9;
            C8592o oVar3 = o;
            TextKt.m14196c(str, PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 16), 7, (Object) null), 0, 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j(), oVar3, ((i10 >> 3) & 14) | 196656, 0, 65500);
            oVar2 = oVar3;
            pVar.invoke(oVar2, Integer.valueOf((i10 >> 6) & 14));
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            aVar = mVar2;
            oVar2 = o;
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar2;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new SectionKt$Section$2(aVar, str, pVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104224b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1349190404);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1349190404, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.component.SectionPreview (Section.kt:35)");
            }
            ThemeKt.m153788a(ComposableSingletons$SectionKt.f59135a.mo68406b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SectionKt$SectionPreview$1(i));
        }
    }
}
