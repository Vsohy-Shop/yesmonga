package com.carrefour.fid.android.service.presentation.p044ui.drive.summary.component;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
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
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.service.C28330R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, mo22516d2 = {"Landroidx/compose/ui/m;", "modifier", "Lkotlin/d2;", "Pictos", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;II)V", "", "resId", "Lkotlin/Function0;", "Landroidx/compose/runtime/g;", "annotation", "PictoWithAnnotation", "(ILkotlin/jvm/functions/p;Landroidx/compose/runtime/o;I)V", "PictosPreview", "(Landroidx/compose/runtime/o;I)V", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPictos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pictos.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/component/PictosKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,79:1\n76#2,5:80\n81#2:111\n85#2:116\n75#3:85\n76#3,11:87\n89#3:115\n75#3:124\n76#3,11:126\n89#3:155\n76#4:86\n76#4:125\n460#5,13:98\n473#5,3:112\n460#5,13:137\n473#5,3:152\n154#6:117\n154#6:151\n74#7,6:118\n80#7:150\n84#7:156\n*S KotlinDebug\n*F\n+ 1 Pictos.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/component/PictosKt\n*L\n30#1:80,5\n30#1:111\n30#1:116\n30#1:85\n30#1:87,11\n30#1:115\n65#1:124\n65#1:126,11\n65#1:155\n30#1:86\n65#1:125\n30#1:98,13\n30#1:112,3\n65#1:137,13\n65#1:152,3\n65#1:117\n67#1:151\n65#1:118,6\n65#1:150\n65#1:156\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.component.PictosKt */
public final class PictosKt {
    /* access modifiers changed from: private */
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void PictoWithAnnotation(int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(209429873);
        if ((i2 & 14) == 0) {
            if (o.mo14976f(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i6 = i3;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(209429873, i6, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.component.PictoWithAnnotation (Pictos.kt:63)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m H = SizeKt.m10092H(aVar, C16483g.m74435M((float) 103));
            C8734c.C8736b m = C8734c.f23406a.mo17068m();
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), m, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(H);
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
            ImageKt.m8967b(C16015f.m71849d(i, o, i6 & 14), (String) null, (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 56, 124);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M((float) 8)), o, 6);
            pVar.invoke(o, Integer.valueOf((i6 >> 3) & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PictosKt$PictoWithAnnotation$2(i, pVar, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void Pictos(@C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(-1078952491);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i5 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1078952491, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.component.Pictos (Pictos.kt:28)");
            }
            C8767m n = SizeKt.m10114n(mVar, 0.0f, 1, (Object) null);
            Arrangement.C2271e j = Arrangement.f6010a.mo7627j();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(j, C8734c.f23406a.mo17073w(), o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            int i6 = C28330R.C28332drawable.cart_picto;
            ComposableSingletons$PictosKt composableSingletons$PictosKt = ComposableSingletons$PictosKt.INSTANCE;
            PictoWithAnnotation(i6, composableSingletons$PictosKt.m172915getLambda1$service_release(), o, 48);
            PictoWithAnnotation(C28330R.C28332drawable.drive_picto, composableSingletons$PictosKt.m172916getLambda2$service_release(), o, 48);
            PictoWithAnnotation(C28330R.C28332drawable.euro_picto, composableSingletons$PictosKt.m172917getLambda3$service_release(), o, 48);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PictosKt$Pictos$2(mVar, i, i2));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C16464c(heightDp = 300, showBackground = true, widthDp = 350)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void PictosPreview(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1168221714);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1168221714, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.component.PictosPreview (Pictos.kt:73)");
            }
            ThemeKt.m153788a(ComposableSingletons$PictosKt.INSTANCE.m172918getLambda4$service_release(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PictosKt$PictosPreview$1(i));
        }
    }
}
