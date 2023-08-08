package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.C3046h;
import androidx.compose.material.C7870j;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
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
import androidx.compose.runtime.internal.C8553b;
import androidx.profileinstaller.C20022q;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001aG\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, mo22516d2 = {"Landroidx/compose/ui/m;", "modifier", "Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;", "drivePoint", "", "distanceInMeters", "", "isLoading", "Lkotlin/Function1;", "Lkotlin/d2;", "onPickupSelected", "DriveCard", "(Landroidx/compose/ui/m;Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;FZLkotlin/jvm/functions/l;Landroidx/compose/runtime/o;II)V", "", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "types", "", "formatDriveTypes", "(Ljava/util/Set;Landroidx/compose/runtime/o;I)Ljava/lang/String;", "DriveCardCardPreview", "(Landroidx/compose/runtime/o;I)V", "DriveCardPreview2", "DriveCardPreview3", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveCard.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/DriveCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n154#2:212\n154#2:213\n154#2:280\n154#2:281\n154#2:282\n154#2:288\n154#2:323\n154#2:329\n74#3,6:214\n80#3:246\n84#3:378\n75#4:220\n76#4,11:222\n75#4:253\n76#4,11:255\n89#4:286\n75#4:296\n76#4,11:298\n89#4:327\n75#4:335\n76#4,11:337\n89#4:372\n89#4:377\n76#5:221\n76#5:254\n76#5:297\n76#5:336\n460#6,13:233\n460#6,13:266\n473#6,3:283\n460#6,13:309\n473#6,3:324\n460#6,13:348\n36#6:362\n473#6,3:369\n473#6,3:374\n75#7,6:247\n81#7:279\n85#7:287\n74#7,7:289\n81#7:322\n85#7:328\n76#7,5:330\n81#7:361\n85#7:373\n1114#8,6:363\n1549#9:379\n1620#9,3:380\n*S KotlinDebug\n*F\n+ 1 DriveCard.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/DriveCardKt\n*L\n55#1:212\n57#1:213\n67#1:280\n68#1:281\n75#1:282\n90#1:288\n102#1:323\n115#1:329\n53#1:214,6\n53#1:246\n53#1:378\n53#1:220\n53#1:222,11\n59#1:253\n59#1:255,11\n59#1:286\n97#1:296\n97#1:298,11\n97#1:327\n111#1:335\n111#1:337,11\n111#1:372\n53#1:377\n53#1:221\n59#1:254\n97#1:297\n111#1:336\n53#1:233,13\n59#1:266,13\n59#1:283,3\n97#1:309,13\n97#1:324,3\n111#1:348,13\n122#1:362\n111#1:369,3\n53#1:374,3\n59#1:247,6\n59#1:279\n59#1:287\n97#1:289,7\n97#1:322\n97#1:328\n111#1:330,5\n111#1:361\n111#1:373\n122#1:363,6\n146#1:379\n146#1:380,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCardKt */
public final class DriveCardKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void DriveCard(@C12580l C8767m mVar, @C12579k DrivePoint drivePoint, float f, boolean z, @C12580l C11300l<? super DrivePoint, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        DriveCardKt$DriveCard$1 driveCardKt$DriveCard$1;
        DrivePoint drivePoint2 = drivePoint;
        float f2 = f;
        boolean z2 = z;
        Intrinsics.checkNotNullParameter(drivePoint2, "drivePoint");
        C8592o o = oVar.mo15009o(1903522066);
        if ((i2 & 1) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 16) != 0) {
            driveCardKt$DriveCard$1 = DriveCardKt$DriveCard$1.INSTANCE;
        } else {
            driveCardKt$DriveCard$1 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1903522066, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCard (DriveCard.kt:45)");
        } else {
            int i3 = i;
        }
        float f3 = (float) 8;
        C8767m k = PaddingKt.m10024k(BackgroundKt.m8825d(C8744d.m32514a(aVar, C2694o.m12166h(C16483g.m74435M(f3))), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 16));
        o.mo14918M(-483455358);
        Arrangement arrangement = Arrangement.f6010a;
        Arrangement.C2279l r = arrangement.mo7631r();
        C8734c.C8735a aVar2 = C8734c.f23406a;
        C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(k);
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
        f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        C8767m.C8768a aVar3 = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(aVar3, 0.0f, 1, (Object) null);
        C8734c.C8737c q = aVar2.mo17070q();
        C8767m mVar2 = aVar;
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(arrangement.mo7630p(), q, o, 48);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(n);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a2);
        } else {
            o.mo14888A();
        }
        o.mo14941U();
        C8592o b3 = Updater.m30180b(o);
        Updater.m30188j(b3, d, companion.mo44588d());
        Updater.m30188j(b3, dVar2, companion.mo44586b());
        Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
        Updater.m30188j(b3, c4Var2, companion.mo44590f());
        o.mo14972e();
        f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        C11300l<? super DrivePoint, C11079d2> lVar2 = driveCardKt$DriveCard$1;
        ImageKt.m8967b(C16015f.m71849d(C28855a.f70682a.mo83975a(drivePoint.getFormat()), o, 0), "carrefour pictogram", SizeKt.m10087C(PaddingKt.m10028o(aVar3, 0.0f, 0.0f, C16483g.m74435M(f3), 0.0f, 11, (Object) null), C16483g.m74435M((float) 24)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
        String name = drivePoint.getName();
        C8767m.C8768a aVar4 = aVar3;
        C8767m o2 = PaddingKt.m10028o(RowScopeInstance.f6147a.mo7842b(aVar4, 1.0f, true), 0.0f, 0.0f, C16483g.m74435M(f3), 0.0f, 11, (Object) null);
        int c = C16449r.f40760b.mo47727c();
        C37475b bVar = C37475b.f94185a;
        long B = bVar.mo114205B();
        C7933t0 t0Var = C7933t0.f19075a;
        int i4 = C7933t0.f19076b;
        int i5 = i4;
        C7933t0 t0Var2 = t0Var;
        C8767m.C8768a aVar5 = aVar4;
        C8767m mVar3 = mVar2;
        TextKt.m14196c(name, o2, B, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, c, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(o, i4).mo11098k(), o, 0, 3120, 55288);
        o.mo14918M(-2144437761);
        if (f2 > 0.0f) {
            String i6 = StringKt.m118929i(String.valueOf(Math.rint(((double) f2) / 100.0d) / ((double) 10)));
            TextKt.m14196c(i6 + "km", (C8767m) null, bVar.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153900l(t0Var2.mo11077c(o, i5)), o, 0, 3072, 57338);
        }
        o.mo15002m0();
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        C8767m.C8768a aVar6 = aVar5;
        C2428y0.m10726a(SizeKt.m10115o(aVar6, C16483g.m74435M((float) 11)), o, 6);
        String address1 = drivePoint.getAddress1();
        C37474a aVar7 = C37474a.f94133a;
        C8767m.C8768a aVar8 = aVar6;
        C8592o oVar2 = o;
        TextKt.m14196c(address1, (C8767m) null, bVar.mo114257y(), aVar7.mo114185h(), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, 0, 0, 131058);
        String postalCode = drivePoint.getPostalCode();
        String city = drivePoint.getCity();
        TextKt.m14196c(postalCode + " " + city, (C8767m) null, bVar.mo114257y(), aVar7.mo114185h(), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, 0, 0, 131058);
        C2428y0.m10726a(C2373k.m10461c(columnScopeInstance, aVar8, 1.0f, false, 2, (Object) null), o, 0);
        C8734c.C8737c q2 = aVar2.mo17070q();
        o.mo14918M(693286680);
        C15560f0 d2 = RowKt.m10071d(arrangement.mo7630p(), q2, o, 48);
        o.mo14918M(-1323940314);
        C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a3 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(aVar8);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a3);
        } else {
            o.mo14888A();
        }
        o.mo14941U();
        C8592o b4 = Updater.m30180b(o);
        Updater.m30188j(b4, d2, companion.mo44588d());
        Updater.m30188j(b4, dVar3, companion.mo44586b());
        Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
        Updater.m30188j(b4, c4Var3, companion.mo44590f());
        o.mo14972e();
        f6.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        String d3 = C16018i.m71858d(C28330R.string.drive_map_type_header, o, 0);
        long h = aVar7.mo114185h();
        long y = bVar.mo114257y();
        C16209i0 i0Var = r6;
        C16209i0 i0Var2 = new C16209i0(700);
        C8592o oVar3 = o;
        TextKt.m14196c(d3, (C8767m) null, y, h, (C16190e0) null, i0Var, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar3, C20022q.C20025c.f51280k, 0, 131026);
        C8767m.C8768a aVar9 = aVar8;
        C2428y0.m10726a(SizeKt.m10092H(aVar9, C16483g.m74435M((float) 4)), o, 6);
        String formatDriveTypes = formatDriveTypes(drivePoint.getServiceTypes(), o, 8);
        long h2 = aVar7.mo114185h();
        long y2 = bVar.mo114257y();
        C8767m.C8768a aVar10 = aVar9;
        TextKt.m14196c(formatDriveTypes, (C8767m) null, y2, h2, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar3, 0, 0, 131058);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        C2428y0.m10726a(C2373k.m10461c(columnScopeInstance, aVar10, 1.0f, false, 2, (Object) null), o, 0);
        Arrangement.C2271e l = arrangement.mo7628l();
        C8767m o3 = SizeKt.m10115o(SizeKt.m10114n(aVar10, 0.0f, 1, (Object) null), C16483g.m74435M((float) 36));
        o.mo14918M(693286680);
        C15560f0 d4 = RowKt.m10071d(l, aVar2.mo17073w(), o, 6);
        o.mo14918M(-1323940314);
        C16479d dVar4 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection4 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var4 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a4 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f7 = LayoutKt.m68908f(o3);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a4);
        } else {
            o.mo14888A();
        }
        o.mo14941U();
        C8592o b5 = Updater.m30180b(o);
        Updater.m30188j(b5, d4, companion.mo44588d());
        Updater.m30188j(b5, dVar4, companion.mo44586b());
        Updater.m30188j(b5, layoutDirection4, companion.mo44587c());
        Updater.m30188j(b5, c4Var4, companion.mo44590f());
        o.mo14972e();
        f7.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        String d5 = C16018i.m71858d(C28330R.string.accessibility_drive_select, o, 0);
        C11300l<? super DrivePoint, C11079d2> lVar3 = lVar2;
        DriveCardKt$DriveCard$2$3$1 driveCardKt$DriveCard$2$3$1 = new DriveCardKt$DriveCard$2$3$1(lVar3, drivePoint2);
        C8767m n2 = SizeKt.m10114n(aVar10, 0.0f, 1, (Object) null);
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(d5);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new DriveCardKt$DriveCard$2$3$2$1(d5);
            o.mo14893C(N);
        }
        o.mo15002m0();
        C8767m a5 = SemanticsModifierKt.m71866a(n2, (C11300l) N);
        DriveCardKt$DriveCard$2$3$1 driveCardKt$DriveCard$2$3$12 = driveCardKt$DriveCard$2$3$1;
        C8767m mVar4 = a5;
        C11300l<? super DrivePoint, C11079d2> lVar4 = lVar3;
        ButtonKt.m13343a(driveCardKt$DriveCard$2$3$12, mVar4, !z2, (C2243g) null, (C7870j) null, (C15218g4) null, (C2223i) null, (C3046h) null, (C2366i0) null, C8553b.m31048b(o, 1959234832, true, new DriveCardKt$DriveCard$2$3$3(z2)), o, 805306368, 504);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveCardKt$DriveCard$3(mVar3, drivePoint, f, z, lVar4, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void DriveCardCardPreview(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-982523826);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-982523826, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCardCardPreview (DriveCard.kt:152)");
            }
            ThemeKt.m153788a(ComposableSingletons$DriveCardKt.INSTANCE.m172905getLambda1$service_release(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveCardKt$DriveCardCardPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void DriveCardPreview2(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(969274872);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(969274872, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCardPreview2 (DriveCard.kt:172)");
            }
            ThemeKt.m153788a(ComposableSingletons$DriveCardKt.INSTANCE.m172906getLambda2$service_release(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveCardKt$DriveCardPreview2$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void DriveCardPreview3(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1484795321);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1484795321, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCardPreview3 (DriveCard.kt:192)");
            }
            ThemeKt.m153788a(ComposableSingletons$DriveCardKt.INSTANCE.m172907getLambda3$service_release(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveCardKt$DriveCardPreview3$1(i));
        }
    }

    @C8540g
    private static final String formatDriveTypes(Set<? extends DriveType> set, C8592o oVar, int i) {
        oVar.mo14918M(1610999881);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1610999881, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.formatDriveTypes (DriveCard.kt:144)");
        }
        Iterable<DriveType> iterable = set;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (DriveType driveLabelId : iterable) {
            arrayList.add(C16018i.m71858d(CommonKt.getDriveLabelId(driveLabelId), oVar, 0));
        }
        String h3 = CollectionsKt___CollectionsKt.m40639h3(arrayList, " - ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return h3;
    }
}
