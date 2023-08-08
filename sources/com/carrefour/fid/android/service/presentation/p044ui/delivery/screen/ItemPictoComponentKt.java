package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.foundation.text.C2762c;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.model.PictoModel;
import com.carrefour.fid.android.shared.extension.C28764k0;
import java.util.Arrays;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo22516d2 = {"Landroidx/compose/ui/m;", "modifier", "Lcom/carrefour/fid/android/service/presentation/model/PictoModel;", "picto", "Lkotlin/d2;", "ItemPictoComponent", "(Landroidx/compose/ui/m;Lcom/carrefour/fid/android/service/presentation/model/PictoModel;Landroidx/compose/runtime/o;I)V", "ItemPictoComponentPreview", "(Landroidx/compose/runtime/o;I)V", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nItemPictoComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemPictoComponent.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/ItemPictoComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,84:1\n154#2:85\n154#2:119\n154#2:120\n154#2:121\n154#2:122\n74#3,6:86\n80#3:118\n84#3:127\n75#4:92\n76#4,11:94\n89#4:126\n76#5:93\n76#5:128\n460#6,13:105\n473#6,3:123\n*S KotlinDebug\n*F\n+ 1 ItemPictoComponent.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/ItemPictoComponentKt\n*L\n39#1:85\n44#1:119\n46#1:120\n47#1:121\n56#1:122\n36#1:86,6\n36#1:118\n36#1:127\n36#1:92\n36#1:94,11\n36#1:126\n36#1:93\n70#1:128\n36#1:105,13\n36#1:123,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemPictoComponentKt */
public final class ItemPictoComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void ItemPictoComponent(@C12579k C8767m mVar, @C12579k PictoModel pictoModel, @C12580l C8592o oVar, int i) {
        C8767m mVar2 = mVar;
        PictoModel pictoModel2 = pictoModel;
        int i2 = i;
        Intrinsics.checkNotNullParameter(mVar2, "modifier");
        Intrinsics.checkNotNullParameter(pictoModel2, "picto");
        C8592o o = oVar.mo15009o(-1634921526);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1634921526, i2, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemPictoComponent (ItemPictoComponent.kt:31)");
        }
        C8767m m = PaddingKt.m10026m(SizeKt.m10114n(mVar2, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M((float) 16), 1, (Object) null);
        C8734c.C8736b m2 = C8734c.f23406a.mo17068m();
        o.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), m2, o, 48);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(m);
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
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m a2 = C8744d.m32514a(SizeKt.m10087C(aVar, C16483g.m74435M((float) 28)), C2694o.m12169k());
        float M = C16483g.m74435M((float) 1);
        C37475b bVar = C37475b.f94185a;
        float f2 = (float) 8;
        C8767m m3 = PaddingKt.m10026m(BorderKt.m8852h(a2, M, bVar.mo114218O(), C2694o.m12169k()), 0.0f, C16483g.m74435M(f2), 1, (Object) null);
        ImageKt.m8967b(C16015f.m71849d(pictoModel.getIcon(), o, 0), (String) null, m3, (C8734c) null, (C15541c) null, 0.0f, C15249k2.C15250a.m66144d(C15249k2.f37569b, bVar.mo114218O(), 0, 2, (Object) null), o, 56, 56);
        C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M(f2), 0.0f, 0.0f, 13, (Object) null);
        C16156d a3 = C28764k0.m119072a(pictoModel.getText());
        long y = bVar.mo114257y();
        C16361p0 d = C37477d.m153892d(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b));
        int a4 = C16432i.f40718b.mo47667a();
        C8592o oVar2 = o;
        TextKt.m14197d(a3, o2, y, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(a4), 0, C16449r.f40760b.mo47727c(), false, 3, 0, (Map<String, C2762c>) null, (C11300l<? super C16260h0, C11079d2>) null, d, oVar2, 48, 3120, 120312);
        oVar2.mo15002m0();
        oVar2.mo14896D();
        oVar2.mo15002m0();
        oVar2.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ItemPictoComponentKt$ItemPictoComponent$2(mVar, pictoModel2, i2));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void ItemPictoComponentPreview(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1476436505);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1476436505, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemPictoComponentPreview (ItemPictoComponent.kt:68)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            int i2 = C28330R.C28332drawable.ds_ic_cart;
            C11368t0 t0Var = C11368t0.f28504a;
            String string = ((Context) o.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getString(C28330R.string.delivery_service_summary_picto_your_shopping);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…mary_picto_your_shopping)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            ItemPictoComponent(aVar, new PictoModel(i2, new SpannableString(Html.fromHtml(format, 63))), o, 70);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ItemPictoComponentKt$ItemPictoComponentPreview$1(i));
        }
    }
}
