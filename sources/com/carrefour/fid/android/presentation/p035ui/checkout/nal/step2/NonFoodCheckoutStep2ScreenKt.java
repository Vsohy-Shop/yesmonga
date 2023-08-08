package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.C3036d1;
import androidx.compose.material.C7933t0;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
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
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import androidx.profileinstaller.C20022q;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.components.compose.MessageComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.delivery.C38016a;
import com.carrefour.fid.android.domain.models.delivery.C38017b;
import com.carrefour.fid.android.domain.models.delivery.C38019d;
import com.carrefour.fid.android.domain.models.delivery.C38021f;
import com.carrefour.fid.android.domain.models.delivery.C38022g;
import com.carrefour.fid.android.domain.models.delivery.C38023h;
import com.carrefour.fid.android.domain.models.delivery.C38024i;
import com.carrefour.fid.android.domain.models.delivery.DeliveryCode;
import com.carrefour.fid.android.domain.models.delivery.DeliveryTemporalUnit;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23617b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.DeliveryChoiceRadioButtonKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.TotalLoyaltyComponentKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.C26141a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import com.carrefour.fid.android.shared.extension.C28746b0;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nNonFoodCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,932:1\n43#2,6:933\n45#3,3:939\n76#4:942\n76#4:986\n76#4:1024\n76#4:1072\n76#4:1074\n76#4:1076\n76#4:1078\n76#4:1090\n76#4:1131\n76#4:1172\n474#5,4:943\n478#5,2:951\n482#5:957\n25#6:947\n25#6:958\n25#6:965\n36#6:972\n460#6,13:998\n473#6,3:1012\n460#6,13:1036\n36#6:1050\n473#6,3:1057\n36#6:1062\n460#6,13:1102\n473#6,3:1116\n460#6,13:1143\n473#6,3:1157\n460#6,13:1184\n473#6,3:1198\n25#6:1206\n36#6:1213\n50#6:1221\n49#6:1222\n50#6:1230\n49#6:1231\n36#6:1239\n36#6:1247\n1114#7,3:948\n1117#7,3:954\n1114#7,6:959\n1114#7,6:966\n1114#7,6:973\n1114#7,6:1051\n1114#7,6:1063\n1114#7,6:1207\n1114#7,6:1214\n1114#7,6:1223\n1114#7,6:1232\n1114#7,6:1240\n1114#7,6:1248\n474#8:953\n74#9,6:979\n80#9:1011\n84#9:1016\n74#9,6:1017\n80#9:1049\n84#9:1061\n75#10:985\n76#10,11:987\n89#10:1015\n75#10:1023\n76#10,11:1025\n89#10:1060\n75#10:1089\n76#10,11:1091\n89#10:1119\n75#10:1130\n76#10,11:1132\n89#10:1160\n75#10:1171\n76#10,11:1173\n89#10:1201\n154#11:1069\n154#11:1071\n154#11:1073\n154#11:1075\n154#11:1077\n154#11:1080\n154#11:1081\n154#11:1082\n154#11:1121\n154#11:1122\n154#11:1123\n154#11:1162\n154#11:1163\n154#11:1164\n154#11:1203\n154#11:1220\n154#11:1229\n154#11:1238\n154#11:1246\n1855#12:1070\n1856#12:1079\n288#12,2:1204\n75#13,6:1083\n81#13:1115\n85#13:1120\n75#13,6:1124\n81#13:1156\n85#13:1161\n75#13,6:1165\n81#13:1197\n85#13:1202\n76#14:1254\n102#14,2:1255\n76#14:1257\n76#14:1258\n102#14,2:1259\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt\n*L\n105#1:933,6\n105#1:939,3\n125#1:942\n514#1:986\n528#1:1024\n580#1:1072\n602#1:1074\n622#1:1076\n641#1:1078\n726#1:1090\n734#1:1131\n747#1:1172\n129#1:943,4\n129#1:951,2\n129#1:957\n129#1:947\n131#1:958\n133#1:965\n291#1:972\n514#1:998,13\n514#1:1012,3\n528#1:1036,13\n539#1:1050\n528#1:1057,3\n553#1:1062\n726#1:1102,13\n726#1:1116,3\n734#1:1143,13\n734#1:1157,3\n747#1:1184,13\n747#1:1198,3\n771#1:1206\n775#1:1213\n791#1:1221\n791#1:1222\n798#1:1230\n798#1:1231\n817#1:1239\n825#1:1247\n129#1:948,3\n129#1:954,3\n131#1:959,6\n133#1:966,6\n291#1:973,6\n539#1:1051,6\n553#1:1063,6\n771#1:1207,6\n775#1:1214,6\n791#1:1223,6\n798#1:1232,6\n817#1:1240,6\n825#1:1248,6\n129#1:953\n514#1:979,6\n514#1:1011\n514#1:1016\n528#1:1017,6\n528#1:1049\n528#1:1061\n514#1:985\n514#1:987,11\n514#1:1015\n528#1:1023\n528#1:1025,11\n528#1:1060\n726#1:1089\n726#1:1091,11\n726#1:1119\n734#1:1130\n734#1:1132,11\n734#1:1160\n747#1:1171\n747#1:1173,11\n747#1:1201\n564#1:1069\n576#1:1071\n598#1:1073\n618#1:1075\n638#1:1077\n722#1:1080\n728#1:1081\n730#1:1082\n733#1:1121\n736#1:1122\n738#1:1123\n741#1:1162\n749#1:1163\n751#1:1164\n754#1:1203\n790#1:1220\n796#1:1229\n814#1:1238\n822#1:1246\n569#1:1070\n569#1:1079\n766#1:1204,2\n726#1:1083,6\n726#1:1115\n726#1:1120\n734#1:1124,6\n734#1:1156\n734#1:1161\n747#1:1165,6\n747#1:1197\n747#1:1202\n131#1:1254\n131#1:1255,2\n135#1:1257\n771#1:1258\n771#1:1259,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt */
public final class NonFoodCheckoutStep2ScreenKt {
    /* renamed from: K */
    public static final void m104869K(C23617b.C23618a aVar, NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C8700z0<Boolean> z0Var) {
        if (aVar instanceof C23617b.C23618a.C23619a) {
            nonFoodCheckoutStep2ViewModel.mo75990U0(((C23617b.C23618a.C23619a) aVar).mo69154d());
        } else if (aVar instanceof C23617b.C23618a.C23622d) {
            nonFoodCheckoutStep2ViewModel.mo75994Y0(((C23617b.C23618a.C23622d) aVar).mo69160d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C23617b.C23618a.C23621c.f59574a)) {
            z0Var.setValue(Boolean.TRUE);
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C23617b.C23618a.C23620b.f59572a)) {
            z0Var.setValue(Boolean.FALSE);
        }
    }

    /* renamed from: L */
    public static final void m104870L(C23617b.C23623b bVar, C23614a aVar, NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C11289a<C11079d2> aVar2) {
        if (bVar instanceof C23617b.C23623b.C23624a) {
            aVar.mo69148j(nonFoodCheckoutStep2ViewModel.mo75975F0());
            nonFoodCheckoutStep2ViewModel.mo76000e1(((C23617b.C23623b.C23624a) bVar).mo69166d());
        } else if (bVar instanceof C23617b.C23623b.C23625b) {
            C23617b.C23623b.C23625b bVar2 = (C23617b.C23623b.C23625b) bVar;
            if (bVar2.mo69182l()) {
                aVar.mo69141c();
            } else {
                aVar.mo69142d();
            }
            nonFoodCheckoutStep2ViewModel.mo75992W0(bVar2.mo69177h(), bVar2.mo69180j(), bVar2.mo69179i(), bVar2.mo69181k(), aVar2);
        } else if (bVar instanceof C23617b.C23623b.C23626c) {
            nonFoodCheckoutStep2ViewModel.mo76011o1(((C23617b.C23623b.C23626c) bVar).mo69186d());
        }
    }

    /* renamed from: M */
    public static final void m104871M(C23617b.C23632h hVar, C23614a aVar, NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C11300l<? super Integer, C11079d2> lVar) {
        if (Intrinsics.areEqual((Object) hVar, (Object) C23617b.C23632h.C23633a.f59598a)) {
            aVar.mo69144f();
        } else if (hVar instanceof C23617b.C23632h.C23634b) {
            lVar.invoke(Integer.valueOf(((C23617b.C23632h.C23634b) hVar).mo69198d()));
        } else if (Intrinsics.areEqual((Object) hVar, (Object) C23617b.C23632h.C23635c.f59602a)) {
            nonFoodCheckoutStep2ViewModel.mo75997b1();
        } else if (hVar instanceof C23617b.C23632h.C23636d) {
            nonFoodCheckoutStep2ViewModel.mo76013q1(((C23617b.C23632h.C23636d) hVar).mo69204d());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104872a(com.carrefour.fid.android.domain.models.account.Address r7, java.lang.String r8, java.lang.String r9, kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r10, androidx.compose.runtime.C8592o r11, int r12) {
        /*
            r0 = -864066933(0xffffffffcc7f628b, float:-6.6947628E7)
            androidx.compose.runtime.o r11 = r11.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0013
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.AddressBloc (NonFoodCheckoutStep2Screen.kt:805)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r1, r2)
        L_0x0013:
            java.lang.String r0 = r7.mo116722w()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r1 = 1157296644(0x44faf204, float:2007.563)
            r2 = 12
            r3 = 16
            if (r0 == 0) goto L_0x007b
            r0 = -321178234(0xffffffffecdb3586, float:-2.1200601E27)
            r11.mo14918M(r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            float r3 = (float) r3
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10027n(r0, r5, r4, r3, r2)
            r11.mo14918M(r1)
            boolean r1 = r11.mo15006n0(r10)
            java.lang.Object r2 = r11.mo14921N()
            if (r1 != 0) goto L_0x005c
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x0064
        L_0x005c:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$AddressBloc$1$1 r2 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$AddressBloc$1$1
            r2.<init>(r10)
            r11.mo14893C(r2)
        L_0x0064:
            r11.mo15002m0()
            r4 = r2
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r1 = r12 & 112(0x70, float:1.57E-43)
            r2 = r12 & 896(0x380, float:1.256E-42)
            r6 = r1 | r2
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.AddressComponentKt.m104985c(r1, r2, r3, r4, r5, r6)
            r11.mo15002m0()
            goto L_0x00ca
        L_0x007b:
            r0 = -321177968(0xffffffffecdb3690, float:-2.1200993E27)
            r11.mo14918M(r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            float r3 = (float) r3
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10027n(r0, r5, r4, r3, r2)
            r11.mo14918M(r1)
            boolean r1 = r11.mo15006n0(r10)
            java.lang.Object r2 = r11.mo14921N()
            if (r1 != 0) goto L_0x00ae
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x00b6
        L_0x00ae:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$AddressBloc$2$1 r2 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$AddressBloc$2$1
            r2.<init>(r10)
            r11.mo14893C(r2)
        L_0x00b6:
            r11.mo15002m0()
            r4 = r2
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r1 = r12 & 112(0x70, float:1.57E-43)
            r6 = r1 | 512(0x200, float:7.175E-43)
            r1 = r0
            r2 = r8
            r3 = r7
            r5 = r11
            com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.AddressComponentKt.m104986d(r1, r2, r3, r4, r5, r6)
            r11.mo15002m0()
        L_0x00ca:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00d3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d3:
            androidx.compose.runtime.t1 r11 = r11.mo15020s()
            if (r11 != 0) goto L_0x00da
            goto L_0x00e8
        L_0x00da:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$AddressBloc$3 r6 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$AddressBloc$3
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r11.mo15202a(r6)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt.m104872a(com.carrefour.fid.android.domain.models.account.Address, java.lang.String, java.lang.String, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104873b(List<C26191b.C26193b> list, C11300l<? super C23617b, C11079d2> lVar, C8592o oVar, int i) {
        C8592o oVar2;
        boolean z;
        List<C26191b.C26193b> list2 = list;
        C11300l<? super C23617b, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-1195196017);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1195196017, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.DeliveryChoiceComponent (NonFoodCheckoutStep2Screen.kt:557)");
        }
        float f = (float) 16;
        float f2 = (float) 12;
        C8767m n = PaddingKt.m10027n(C8767m.f23478j, C16483g.m74435M(f), C16483g.m74435M(f), C16483g.m74435M(f), C16483g.m74435M(f2));
        String d = C16018i.m71858d(R.string.checkout_non_food_delivery_title, o, 0);
        C16361p0 j = C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j();
        float f3 = f;
        float f4 = f2;
        C8592o oVar3 = o;
        TextKt.m14196c(d, n, 0, 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, j, oVar3, C20022q.C20025c.f51280k, 0, 65500);
        for (C26191b.C26193b bVar : list2) {
            String b = C28782t.m119105b(Double.valueOf(C28746b0.m119030a(Integer.valueOf(bVar.mo76154e().mo117636d()), 2)));
            C38017b e = bVar.mo76154e();
            if (e instanceof C38019d) {
                oVar2 = oVar3;
                oVar2.mo14918M(2106377073);
                DeliveryChoiceRadioButtonKt.m105019b(PaddingKt.m10028o(C8767m.f23478j, C16483g.m74435M(f3), 0.0f, C16483g.m74435M(f3), C16483g.m74435M(f4), 2, (Object) null), b, bVar.mo76156f(), C23669g.m105129a((Context) oVar2.mo15032w(AndroidCompositionLocals_androidKt.m70952g()), R.string.checkout_non_food_economic_delivery_description, bVar.mo76154e().mo117635c(), bVar.mo76154e().mo117634b()), new NonFoodCheckoutStep2ScreenKt$DeliveryChoiceComponent$1$1$1(lVar2, bVar), oVar2, 6, 0);
                oVar2.mo15002m0();
            } else {
                oVar2 = oVar3;
                if (e instanceof C38024i) {
                    oVar2.mo14918M(2106378138);
                    DeliveryChoiceRadioButtonKt.m105024g(PaddingKt.m10028o(C8767m.f23478j, C16483g.m74435M(f3), 0.0f, C16483g.m74435M(f3), C16483g.m74435M(f3), 2, (Object) null), b, bVar.mo76156f(), C23669g.m105129a((Context) oVar2.mo15032w(AndroidCompositionLocals_androidKt.m70952g()), R.string.checkout_non_food_standard_delivery_description, bVar.mo76154e().mo117635c(), bVar.mo76154e().mo117634b()), new NonFoodCheckoutStep2ScreenKt$DeliveryChoiceComponent$1$1$2(lVar2, bVar), oVar2, 6, 0);
                    oVar2.mo15002m0();
                } else if (e instanceof C38021f) {
                    oVar2.mo14918M(2106379129);
                    DeliveryChoiceRadioButtonKt.m105021d(PaddingKt.m10028o(C8767m.f23478j, C16483g.m74435M(f3), 0.0f, C16483g.m74435M(f3), C16483g.m74435M(f3), 2, (Object) null), b, bVar.mo76156f(), C23669g.m105129a((Context) oVar2.mo15032w(AndroidCompositionLocals_androidKt.m70952g()), R.string.checkout_non_food_standard_delivery_description, bVar.mo76154e().mo117635c(), bVar.mo76154e().mo117634b()), new NonFoodCheckoutStep2ScreenKt$DeliveryChoiceComponent$1$1$3(lVar2, bVar), oVar2, 6, 0);
                    oVar2.mo15002m0();
                } else {
                    if (e instanceof C38022g) {
                        z = true;
                    } else {
                        z = e instanceof C38023h;
                    }
                    if (z) {
                        oVar2.mo14918M(2106380140);
                        DeliveryChoiceRadioButtonKt.m105022e(PaddingKt.m10028o(C8767m.f23478j, C16483g.m74435M(f3), 0.0f, C16483g.m74435M(f3), C16483g.m74435M(f3), 2, (Object) null), bVar.mo76156f(), C23669g.m105129a((Context) oVar2.mo15032w(AndroidCompositionLocals_androidKt.m70952g()), R.string.checkout_non_food_pickup_delivery_description, bVar.mo76154e().mo117635c(), bVar.mo76154e().mo117634b()), new NonFoodCheckoutStep2ScreenKt$DeliveryChoiceComponent$1$1$4(lVar2, bVar), oVar2, 6, 0);
                        oVar2.mo15002m0();
                    } else {
                        oVar2.mo14918M(2106381065);
                        oVar2.mo15002m0();
                    }
                }
            }
            oVar3 = oVar2;
        }
        C8592o oVar4 = oVar3;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar4.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodCheckoutStep2ScreenKt$DeliveryChoiceComponent$2(list2, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m104874c(C8592o oVar, int i) {
        C8592o oVar2;
        int i2 = i;
        C8592o o = oVar.mo15009o(1276872382);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1276872382, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.DeliveryChoiceShimmer (NonFoodCheckoutStep2Screen.kt:718)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 16;
            float f2 = (float) 12;
            float f3 = f2;
            float f4 = f;
            C8592o oVar3 = o;
            TextKt.m14196c(C16018i.m71858d(R.string.checkout_non_food_delivery_title, o, 0), C37019o.m151909b(PaddingKt.m10027n(aVar, C16483g.m74435M(f), C16483g.m74435M(f), C16483g.m74435M(f), C16483g.m74435M(f2)), true, (C15218g4) null, 2, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar3, 0, 0, 131068);
            float f5 = (float) 85;
            C8767m b = C37019o.m151909b(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10026m(aVar, C16483g.m74435M(f4), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M(f5)), true, (C15218g4) null, 2, (Object) null);
            oVar2 = oVar3;
            oVar2.mo14918M(693286680);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2269d p = arrangement.mo7630p();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 d = RowKt.m10071d(p, aVar2.mo17073w(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(b);
            if (!(oVar2.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar2.mo14938T();
            if (oVar2.mo14997l()) {
                oVar2.mo14947W(a);
            } else {
                oVar2.mo14888A();
            }
            oVar2.mo14941U();
            C8592o b2 = Updater.m30180b(oVar2);
            Updater.m30188j(b2, d, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar2.mo14972e();
            f6.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar2)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f3)), oVar2, 6);
            C8767m b3 = C37019o.m151909b(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10026m(aVar, C16483g.m74435M(f4), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M(f5)), true, (C15218g4) null, 2, (Object) null);
            oVar2.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(arrangement.mo7630p(), aVar2.mo17073w(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f7 = LayoutKt.m68908f(b3);
            if (!(oVar2.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar2.mo14938T();
            if (oVar2.mo14997l()) {
                oVar2.mo14947W(a2);
            } else {
                oVar2.mo14888A();
            }
            oVar2.mo14941U();
            C8592o b4 = Updater.m30180b(oVar2);
            Updater.m30188j(b4, d2, companion.mo44588d());
            Updater.m30188j(b4, dVar2, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b4, c4Var2, companion.mo44590f());
            oVar2.mo14972e();
            f7.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar2)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f4)), oVar2, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodCheckoutStep2ScreenKt$DeliveryChoiceShimmer$3(i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m104875d(C11300l<? super C23617b, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        int i3;
        C8592o o = oVar.mo15009o(-167276303);
        if ((i & 14) == 0) {
            if (o.mo14927P(lVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-167276303, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.ErrorScreen (NonFoodCheckoutStep2Screen.kt:526)");
            }
            C8767m d = BackgroundKt.m8825d(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C37475b.f94185a.mo114231a0(), (C15218g4) null, 2, (Object) null);
            C8734c.C8736b u = C8734c.f23406a.mo17072u();
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), u, o, 48);
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
            m104876e(lVar, o, i2 & 14);
            String d2 = C16018i.m71858d(R.string.general_an_error_occurred, o, 0);
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new NonFoodCheckoutStep2ScreenKt$ErrorScreen$1$1$1(lVar);
                o.mo14893C(N);
            }
            o.mo15002m0();
            MessageComponentKt.m151549f((C8767m) null, d2, (C11289a) N, o, 0, 1);
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
            s.mo15202a(new NonFoodCheckoutStep2ScreenKt$ErrorScreen$2(lVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m104876e(C11300l<? super C23617b, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C11300l<? super C23617b, C11079d2> lVar2 = lVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(2054683964);
        if ((i4 & 14) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2054683964, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.Header (NonFoodCheckoutStep2Screen.kt:546)");
            }
            String d = C16018i.m71858d(R.string.checkout_non_food_step2_title, o, 0);
            String d2 = C16018i.m71858d(R.string.accessibility_return_to_previous_page, o, 0);
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new NonFoodCheckoutStep2ScreenKt$Header$1$1(lVar2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            String str = d;
            oVar2 = o;
            HeaderComponentKt.m151505j(str, (C16361p0) null, 0, 0, 0, (Painter) null, d2, (C11289a) N, o, 0, 62);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodCheckoutStep2ScreenKt$Header$2(lVar2, i4));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m104877f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(715247162);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(715247162, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.LoadingPreview (NonFoodCheckoutStep2Screen.kt:926)");
            }
            ThemeKt.m153788a(ComposableSingletons$NonFoodCheckoutStep2ScreenKt.f59546a.mo69065d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodCheckoutStep2ScreenKt$LoadingPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m104878g(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1862440442);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1862440442, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.LoadingScreen (NonFoodCheckoutStep2Screen.kt:512)");
            }
            C8767m d = BackgroundKt.m8825d(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C37475b.f94185a.mo114231a0(), (C15218g4) null, 2, (Object) null);
            C8734c.C8736b u = C8734c.f23406a.mo17072u();
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), u, o, 48);
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
            m104876e(NonFoodCheckoutStep2ScreenKt$LoadingScreen$1$1.f59560f, o, 6);
            m104874c(o, 0);
            m104889r(o, 0);
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
            s.mo15202a(new NonFoodCheckoutStep2ScreenKt$LoadingScreen$2(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m104879h(List<C26191b.C26193b> list, C38080a aVar, Address address, Address address2, String str, BasketAmounts basketAmounts, BasketPromotionCode basketPromotionCode, int i, boolean z, C28892e<C11079d2> eVar, boolean z2, C26191b.C26192a aVar2, C3036d1 d1Var, LazyListState lazyListState, boolean z3, C11300l<? super C23617b, C11079d2> lVar, C8592o oVar, int i2, int i3, int i4) {
        int i5 = i3;
        C8592o o = oVar.mo15009o(1876555360);
        List<C26191b.C26193b> E = (i4 & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1876555360, i2, i5, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Screen (NonFoodCheckoutStep2Screen.kt:307)");
        } else {
            int i6 = i2;
        }
        C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
        C8552a b = C8553b.m31048b(o, 1697418597, true, new NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$1(lVar, i5));
        C8552a b2 = C8553b.m31048b(o, -506019162, true, new NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2(basketAmounts, z, z2, aVar2, lVar, i3, i2));
        NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3 nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3 = r0;
        NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3 nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$32 = new NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3(lazyListState, i3, z3, lVar, E, aVar, basketAmounts, address, address2, str, i2, basketPromotionCode, eVar, aVar2, i);
        C8592o oVar2 = o;
        ScaffoldKt.m13747a(l, d1Var, b, b2, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar2, -1804587874, true, nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3), oVar2, ((i3 >> 3) & 112) | 805309830, 12582912, 130544);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$4 nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$4 = r0;
            NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$4 nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$42 = new NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$4(E, aVar, address, address2, str, basketAmounts, basketPromotionCode, i, z, eVar, z2, aVar2, d1Var, lazyListState, z3, lVar, i2, i3, i4);
            s.mo15202a(nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$4);
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m104880i(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(-1950260487);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1950260487, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenPreview (NonFoodCheckoutStep2Screen.kt:839)");
            }
            DeliveryCode deliveryCode = DeliveryCode.AXL;
            DeliveryTemporalUnit deliveryTemporalUnit = DeliveryTemporalUnit.HOURS;
            ThemeKt.m153788a(C8553b.m31048b(o, 1850842236, true, new NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2ScreenPreview$1(CollectionsKt__CollectionsKt.m40448L(new C26191b.C26193b(new C38019d(1490, deliveryCode, new C38016a(deliveryTemporalUnit, 12), new C38016a(deliveryTemporalUnit, 17)), true), new C26191b.C26193b(new C38024i(1890, DeliveryCode.PRC, new C38016a(deliveryTemporalUnit, 12), new C38016a(deliveryTemporalUnit, 17)), false)), new Address("FRANCE", (String) null, (String) null, "Paris", "1 Rue Rivoli", "75001", "1234", "123", true, EnergyLabelKt.f67708f, "14", "none", (String) null, AddressCategory.DELIVERY, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 1036294, (DefaultConstructorMarker) null), new Address((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, AddressCategory.BILLING, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 1040383, (DefaultConstructorMarker) null), "0765845323", new BasketAmounts(0, 3.5d, 11.0d, 0.49d, 10.1d, 12.0d, 3.0d, 8.0d, 10.1d, 14.0d, 164.41d, 11.8d, 10.0d, 2.34d, 1, (DefaultConstructorMarker) null), new BasketPromotionCode(5.0d, "NOEL10"), new C26191b.C26192a("102333430020339200", true, 12.34d, 0.0d, false, false))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2ScreenPreview$2(i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v155, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x05a5  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x05b0  */
    /* JADX WARNING: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x015d  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104881j(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r51, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a r52, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a r53, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super android.os.Bundle, ? super java.lang.String, kotlin.C11079d2> r54, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super android.os.Bundle, ? super java.lang.String, kotlin.C11079d2> r55, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Double, kotlin.C11079d2> r56, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r57, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r58, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super com.carrefour.fid.android.domain.models.account.Address, ? super com.carrefour.fid.android.domain.models.account.Address, ? super com.carrefour.fid.android.domain.models.AddressCategory, ? super java.lang.String, kotlin.C11079d2> r59, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r60, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r61, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r62, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r63, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r64, int r65, int r66, int r67) {
        /*
            r15 = r52
            r14 = r53
            r13 = r54
            r12 = r55
            r11 = r56
            r10 = r57
            r9 = r58
            r8 = r59
            r7 = r60
            r6 = r61
            r5 = r62
            r4 = r63
            r3 = r65
            r2 = r66
            r1 = r67
            java.lang.String r0 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "otpAnalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onBasketValidated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onRedirectToConfirmationOrder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onAddPickupClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onCgvClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onBackPressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onEditAddressPressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onAddressValidated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onRemovePromoCodeError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onResetSecretCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onFidCardBlocked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -1066015751(0xffffffffc075e3f9, float:-3.8420393)
            r4 = r64
            androidx.compose.runtime.o r4 = r4.mo15009o(r0)
            r0 = r1 & 1
            if (r0 == 0) goto L_0x006a
            r16 = r3 | 2
            goto L_0x006c
        L_0x006a:
            r16 = r3
        L_0x006c:
            r17 = r1 & 2
            r18 = 32
            r19 = 16
            if (r17 == 0) goto L_0x0077
            r16 = r16 | 48
            goto L_0x0088
        L_0x0077:
            r17 = r3 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x0088
            boolean r17 = r4.mo15006n0(r15)
            if (r17 == 0) goto L_0x0084
            r17 = r18
            goto L_0x0086
        L_0x0084:
            r17 = r19
        L_0x0086:
            r16 = r16 | r17
        L_0x0088:
            r15 = r16
            r16 = r1 & 4
            r17 = 256(0x100, float:3.59E-43)
            r20 = 128(0x80, float:1.794E-43)
            if (r16 == 0) goto L_0x0097
            r15 = r15 | 384(0x180, float:5.38E-43)
            r64 = r0
            goto L_0x00a9
        L_0x0097:
            r64 = r0
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r4.mo15006n0(r14)
            if (r0 == 0) goto L_0x00a6
            r0 = r17
            goto L_0x00a8
        L_0x00a6:
            r0 = r20
        L_0x00a8:
            r15 = r15 | r0
        L_0x00a9:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x00b0
            r15 = r15 | 3072(0xc00, float:4.305E-42)
            goto L_0x00c0
        L_0x00b0:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r4.mo14927P(r13)
            if (r0 == 0) goto L_0x00bd
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x00bf
        L_0x00bd:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x00bf:
            r15 = r15 | r0
        L_0x00c0:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x00c7
            r15 = r15 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00d9
        L_0x00c7:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r4.mo14927P(r12)
            if (r0 == 0) goto L_0x00d6
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00d8
        L_0x00d6:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x00d8:
            r15 = r15 | r0
        L_0x00d9:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x00e1
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x00df:
            r15 = r15 | r0
            goto L_0x00f2
        L_0x00e1:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r4.mo14927P(r11)
            if (r0 == 0) goto L_0x00ef
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00df
        L_0x00ef:
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00df
        L_0x00f2:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x00fa
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x00f8:
            r15 = r15 | r0
            goto L_0x010b
        L_0x00fa:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.mo14927P(r10)
            if (r0 == 0) goto L_0x0108
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f8
        L_0x0108:
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00f8
        L_0x010b:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0113
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0111:
            r15 = r15 | r0
            goto L_0x0124
        L_0x0113:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0124
            boolean r0 = r4.mo14927P(r9)
            if (r0 == 0) goto L_0x0121
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x0121:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0111
        L_0x0124:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x012c
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x012a:
            r15 = r15 | r0
            goto L_0x013d
        L_0x012c:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x013d
            boolean r0 = r4.mo14927P(r8)
            if (r0 == 0) goto L_0x013a
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x013a:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x012a
        L_0x013d:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0145
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0143:
            r15 = r15 | r0
            goto L_0x0156
        L_0x0145:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0156
            boolean r0 = r4.mo14927P(r7)
            if (r0 == 0) goto L_0x0153
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0143
        L_0x0153:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0143
        L_0x0156:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x015d
            r0 = r2 | 6
            goto L_0x016d
        L_0x015d:
            r0 = r2 & 14
            if (r0 != 0) goto L_0x016c
            boolean r0 = r4.mo14927P(r6)
            if (r0 == 0) goto L_0x0169
            r0 = 4
            goto L_0x016a
        L_0x0169:
            r0 = 2
        L_0x016a:
            r0 = r0 | r2
            goto L_0x016d
        L_0x016c:
            r0 = r2
        L_0x016d:
            r7 = r1 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0174
            r0 = r0 | 48
            goto L_0x0183
        L_0x0174:
            r7 = r2 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0183
            boolean r7 = r4.mo14927P(r5)
            if (r7 == 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r18 = r19
        L_0x0181:
            r0 = r0 | r18
        L_0x0183:
            r7 = r1 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x018a
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x019c
        L_0x018a:
            r7 = r2 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x019c
            r7 = r63
            boolean r16 = r4.mo14927P(r7)
            if (r16 == 0) goto L_0x0197
            goto L_0x0199
        L_0x0197:
            r17 = r20
        L_0x0199:
            r0 = r0 | r17
            goto L_0x019e
        L_0x019c:
            r7 = r63
        L_0x019e:
            r10 = 1
            r1 = r64
            if (r1 != r10) goto L_0x01c4
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r15 & r16
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r2) goto L_0x01c4
            r2 = r0 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r2 != r10) goto L_0x01c4
            boolean r2 = r4.mo15011p()
            if (r2 != 0) goto L_0x01ba
            goto L_0x01c4
        L_0x01ba:
            r4.mo14958a0()
            r1 = r51
            r8 = r52
            r7 = r4
            goto L_0x05a9
        L_0x01c4:
            r4.mo14930Q()
            r2 = r3 & 1
            r10 = 8
            if (r2 == 0) goto L_0x01dc
            boolean r2 = r4.mo14977f0()
            if (r2 == 0) goto L_0x01d4
            goto L_0x01dc
        L_0x01d4:
            r4.mo14958a0()
            if (r1 == 0) goto L_0x0222
            r15 = r15 & -15
            goto L_0x0222
        L_0x01dc:
            if (r1 == 0) goto L_0x0222
            r1 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r4.mo14918M(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r1 = r1.mo57681a(r4, r10)
            if (r1 == 0) goto L_0x0216
            androidx.lifecycle.x0$b r19 = androidx.hilt.navigation.compose.C19298a.m90444a(r1, r4, r10)
            r2 = 564614654(0x21a755fe, float:1.1339122E-18)
            r4.mo14918M(r2)
            r18 = 0
            java.lang.Class<com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel> r16 = com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel.class
            r21 = 4168(0x1048, float:5.84E-42)
            r22 = 0
            r17 = r1
            r20 = r4
            androidx.lifecycle.v0 r1 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r16, r17, r18, r19, r20, r21, r22)
            r4.mo15002m0()
            r4.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel) r1
            r15 = r15 & -15
            r50 = r15
            r15 = r1
            r1 = r50
            goto L_0x0225
        L_0x0216:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0222:
            r1 = r15
            r15 = r51
        L_0x0225:
            r4.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0236
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Stateful (NonFoodCheckoutStep2Screen.kt:103)"
            r10 = -1066015751(0xffffffffc075e3f9, float:-3.8420393)
            androidx.compose.runtime.ComposerKt.m29845w0(r10, r1, r0, r2)
        L_0x0236:
            kotlinx.coroutines.flow.e r16 = r15.getSideEffect()
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r1 = r4.mo15032w(r1)
            androidx.lifecycle.w r1 = (androidx.lifecycle.C19499w) r1
            androidx.lifecycle.Lifecycle r17 = r1.getLifecycle()
            r18 = 0
            r20 = 72
            r21 = 4
            r19 = r4
            kotlinx.coroutines.flow.e r10 = com.carrefour.fid.android.shared.extension.FlowKt.m118809b(r16, r17, r18, r19, r20, r21)
            r2 = 0
            r1 = 0
            r16 = r0
            r0 = 3
            androidx.compose.material.d1 r36 = androidx.compose.material.ScaffoldKt.m13752f(r2, r2, r4, r1, r0)
            androidx.compose.foundation.lazy.LazyListState r29 = androidx.compose.foundation.lazy.LazyListStateKt.m10895a(r1, r1, r4, r1, r0)
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r4.mo14918M(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r0)
            java.lang.Object r2 = r4.mo14921N()
            androidx.compose.runtime.o$a r37 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r37.mo16277a()
            if (r2 != r0) goto L_0x0287
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r0 = androidx.compose.runtime.EffectsKt.m29901m(r0, r4)
            androidx.compose.runtime.w r2 = new androidx.compose.runtime.w
            r2.<init>(r0)
            r4.mo14893C(r2)
        L_0x0287:
            r4.mo15002m0()
            androidx.compose.runtime.w r2 = (androidx.compose.runtime.C8690w) r2
            kotlinx.coroutines.o0 r38 = r2.mo16831a()
            r4.mo15002m0()
            r0 = 2131952134(0x7f130206, float:1.9540702E38)
            java.lang.String r39 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r4, r1)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r0)
            java.lang.Object r2 = r4.mo14921N()
            java.lang.Object r1 = r37.mo16277a()
            if (r2 != r1) goto L_0x02b4
            r0 = 0
            r1 = 2
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r0, r0, r1, r0)
            r4.mo14893C(r2)
            goto L_0x02b6
        L_0x02b4:
            r0 = 0
            r1 = 2
        L_0x02b6:
            r4.mo15002m0()
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.mo14918M(r0)
            java.lang.Object r0 = r4.mo14921N()
            java.lang.Object r1 = r37.mo16277a()
            if (r0 != r1) goto L_0x02d9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r51 = r2
            r1 = 2
            r2 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r2, r1, r2)
            r4.mo14893C(r0)
            goto L_0x02dc
        L_0x02d9:
            r51 = r2
            r2 = 0
        L_0x02dc:
            r4.mo15002m0()
            r18 = r0
            androidx.compose.runtime.z0 r18 = (androidx.compose.runtime.C8700z0) r18
            kotlinx.coroutines.flow.j r0 = r15.mo75982M0()
            r1 = 8
            r3 = 1
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30233b(r0, r2, r4, r1, r3)
            r19 = r0
            kotlinx.coroutines.flow.u r0 = r15.mo75981L0()
            androidx.compose.runtime.k2 r40 = androidx.compose.runtime.C8415c2.m30233b(r0, r2, r4, r1, r3)
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$actioner$1 r3 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$actioner$1
            r41 = r16
            r16 = r2
            r2 = r19
            r0 = r3
            r11 = 0
            r1 = r15
            r43 = r2
            r42 = r16
            r2 = r56
            r31 = r3
            r3 = r57
            r7 = r4
            r4 = r58
            r5 = r52
            r6 = r60
            r11 = r7
            r7 = r18
            r8 = r38
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r0
            com.carrefour.fid.android.shared.type.e r0 = r0.mo76126l()
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r1 == 0) goto L_0x0441
            r0 = -778883252(0xffffffffd1932f4c, float:-7.9019213E10)
            r11.mo14918M(r0)
            java.lang.Object r0 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r0
            com.carrefour.fid.android.shared.type.e r0 = r0.mo76128n()
            java.lang.Object r0 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r0)
            r16 = r0
            java.util.List r16 = (java.util.List) r16
            java.lang.Object r0 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r0
            com.carrefour.fid.android.shared.type.e r0 = r0.mo76130p()
            java.lang.Object r0 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r0)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$d r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26195d) r0
            if (r0 == 0) goto L_0x035b
            com.carrefour.fid.android.domain.models.account.Address r0 = r0.mo76175g()
            goto L_0x035d
        L_0x035b:
            r0 = r42
        L_0x035d:
            java.lang.Object r1 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r1
            com.carrefour.fid.android.shared.type.e r1 = r1.mo76130p()
            java.lang.Object r1 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r1)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$d r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26195d) r1
            if (r1 == 0) goto L_0x0376
            com.carrefour.fid.android.domain.models.account.Address r1 = r1.mo76174f()
            r19 = r1
            goto L_0x0378
        L_0x0376:
            r19 = r42
        L_0x0378:
            java.lang.Object r1 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r1
            com.carrefour.fid.android.shared.type.e r1 = r1.mo76130p()
            java.lang.Object r1 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r1)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$d r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26195d) r1
            if (r1 == 0) goto L_0x0391
            java.lang.String r1 = r1.mo76176h()
            r20 = r1
            goto L_0x0393
        L_0x0391:
            r20 = r42
        L_0x0393:
            java.lang.Object r1 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r1
            com.carrefour.fid.android.shared.type.e r1 = r1.mo76129o()
            java.lang.Object r1 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r1)
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$c r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26194c) r1
            java.lang.Object r2 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r2
            boolean r24 = r2.mo76133s()
            java.lang.Object r2 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r2
            boolean r26 = r2.mo76132r()
            java.lang.Object r2 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r2
            com.carrefour.fid.android.shared.type.e r2 = r2.mo76125k()
            java.lang.Object r2 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r2)
            r27 = r2
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$a r27 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26192a) r27
            r2 = r16
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x03d8
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03d6
            goto L_0x03d8
        L_0x03d6:
            r2 = 0
            goto L_0x03d9
        L_0x03d8:
            r2 = 1
        L_0x03d9:
            if (r2 != 0) goto L_0x042e
            if (r0 == 0) goto L_0x042e
            if (r19 == 0) goto L_0x042e
            if (r20 == 0) goto L_0x042e
            if (r1 != 0) goto L_0x03e4
            goto L_0x042e
        L_0x03e4:
            r2 = -778882400(0xffffffffd19332a0, float:-7.9026192E10)
            r11.mo14918M(r2)
            java.lang.Object r2 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r2
            com.carrefour.fid.android.domain.models.pickup.a r17 = r2.mo76127m()
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r21 = r1.mo76164f()
            com.carrefour.fid.android.domain.models.basket.BasketPromotionCode r22 = r1.mo76166h()
            int r23 = r1.mo76165g()
            java.lang.Object r1 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r1
            com.carrefour.fid.android.shared.type.e r25 = r1.mo76131q()
            java.lang.Object r1 = r18.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r30 = r1.booleanValue()
            int r1 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            int r1 = r1 << 27
            r2 = 2363976(0x241248, float:3.312636E-39)
            r33 = r1 | r2
            r34 = 0
            r35 = 0
            r18 = r0
            r28 = r36
            r32 = r11
            m104879h(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r11.mo15002m0()
            goto L_0x043d
        L_0x042e:
            r0 = -778882470(0xffffffffd193325a, float:-7.9025619E10)
            r11.mo14918M(r0)
            r1 = r31
            r0 = 0
            m104875d(r1, r11, r0)
            r11.mo15002m0()
        L_0x043d:
            r11.mo15002m0()
            goto L_0x047e
        L_0x0441:
            r1 = r31
            com.carrefour.fid.android.shared.type.e$b r2 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x044d
            r3 = 1
            goto L_0x0453
        L_0x044d:
            com.carrefour.fid.android.shared.type.e$d r2 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
        L_0x0453:
            if (r3 == 0) goto L_0x0463
            r0 = -778881340(0xffffffffd19336c4, float:-7.9034876E10)
            r11.mo14918M(r0)
            r2 = 0
            m104878g(r11, r2)
            r11.mo15002m0()
            goto L_0x047e
        L_0x0463:
            r2 = 0
            boolean r0 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r0 == 0) goto L_0x0475
            r0 = -778881267(0xffffffffd193370d, float:-7.9035474E10)
            r11.mo14918M(r0)
            m104875d(r1, r11, r2)
            r11.mo15002m0()
            goto L_0x047e
        L_0x0475:
            r0 = -778881205(0xffffffffd193374b, float:-7.9035982E10)
            r11.mo14918M(r0)
            r11.mo15002m0()
        L_0x047e:
            java.lang.Object r0 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r0
            com.carrefour.fid.android.shared.type.e r0 = r0.mo76131q()
            com.carrefour.fid.android.shared.type.e$d r1 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0492
            r3 = 1
            goto L_0x0498
        L_0x0492:
            com.carrefour.fid.android.shared.type.e$b r1 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
        L_0x0498:
            if (r3 != 0) goto L_0x04d9
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r1 == 0) goto L_0x04cf
            java.lang.Object r0 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r0
            com.carrefour.fid.android.shared.type.e r0 = r0.mo76131q()
            java.lang.String r1 = "null cannot be cast to non-null type com.carrefour.fid.android.shared.type.ResultState.Error"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            com.carrefour.fid.android.shared.type.e$a r0 = (com.carrefour.fid.android.shared.type.C28892e.C28893a) r0
            java.lang.Throwable r0 = r0.mo84083d()
            boolean r1 = r0 instanceof com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable
            if (r1 == 0) goto L_0x04bb
            r2 = r0
            com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable r2 = (com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable) r2
            goto L_0x04bd
        L_0x04bb:
            r2 = r42
        L_0x04bd:
            if (r2 == 0) goto L_0x04d9
            java.lang.String r0 = r2.mo114262a()
            java.lang.String r1 = r2.mo114263b()
            r9 = r52
            r9.mo69149k(r0, r1)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x04db
        L_0x04cf:
            r9 = r52
            boolean r0 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r0 == 0) goto L_0x04db
            r52.mo69140b()
            goto L_0x04db
        L_0x04d9:
            r9 = r52
        L_0x04db:
            java.lang.String r2 = m104882k(r51)
            r0 = -778880689(0xffffffffd193394f, float:-7.9040209E10)
            r11.mo14918M(r0)
            if (r2 == 0) goto L_0x0521
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$2 r6 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$2
            r8 = r51
            r6.<init>(r15, r8)
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.ComposableSingletons$NonFoodCheckoutStep2ScreenKt r0 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.ComposableSingletons$NonFoodCheckoutStep2ScreenKt.f59546a
            kotlin.jvm.functions.p r17 = r0.mo69062a()
            r18 = 0
            r19 = 0
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$3 r7 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$3
            r0 = r7
            r1 = r62
            r3 = r41
            r4 = r40
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1659662473(0x62ec7089, float:2.1807703E21)
            r1 = 1
            androidx.compose.runtime.internal.a r20 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r0, r1, r7)
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 24624(0x6030, float:3.4506E-41)
            r29 = 492(0x1ec, float:6.9E-43)
            r16 = r6
            r27 = r11
            androidx.compose.material.AndroidAlertDialog_androidKt.m13201b(r16, r17, r18, r19, r20, r21, r22, r24, r26, r27, r28, r29)
            goto L_0x0523
        L_0x0521:
            r8 = r51
        L_0x0523:
            r11.mo15002m0()
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4 r7 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4
            r16 = 0
            r0 = r7
            r1 = r10
            r2 = r52
            r3 = r55
            r4 = r15
            r5 = r54
            r6 = r59
            r44 = r7
            r7 = r38
            r17 = r8
            r8 = r61
            r9 = r53
            r45 = r10
            r10 = r63
            r46 = r11
            r11 = r43
            r12 = r36
            r13 = r39
            r14 = r17
            r47 = r15
            r15 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = 72
            r2 = r44
            r1 = r45
            r7 = r46
            androidx.compose.runtime.EffectsKt.m29896h(r1, r2, r7, r0)
            java.lang.Object r0 = r43.getValue()
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r0
            com.carrefour.fid.android.shared.type.e r1 = r0.mo76128n()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r7.mo14918M(r0)
            r0 = r43
            boolean r2 = r7.mo15006n0(r0)
            java.lang.Object r3 = r7.mo14921N()
            if (r2 != 0) goto L_0x0581
            java.lang.Object r2 = r37.mo16277a()
            if (r3 != r2) goto L_0x0589
        L_0x0581:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$5$1 r3 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$5$1
            r3.<init>(r0)
            r7.mo14893C(r3)
        L_0x0589:
            r7.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$6 r3 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$6
            r8 = r52
            r9 = r47
            r3.<init>(r0, r8, r9)
            int r5 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            r6 = 0
            r4 = r7
            com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt.m119625a(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x05a8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x05a8:
            r1 = r9
        L_0x05a9:
            androidx.compose.runtime.t1 r15 = r7.mo15020s()
            if (r15 != 0) goto L_0x05b0
            goto L_0x05df
        L_0x05b0:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$7 r14 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$7
            r0 = r14
            r2 = r52
            r3 = r53
            r4 = r54
            r5 = r55
            r6 = r56
            r7 = r57
            r8 = r58
            r9 = r59
            r10 = r60
            r11 = r61
            r12 = r62
            r13 = r63
            r48 = r14
            r14 = r65
            r49 = r15
            r15 = r66
            r16 = r67
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r48
            r0 = r49
            r0.mo15202a(r1)
        L_0x05df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt.m104881j(com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel, com.carrefour.fid.android.presentation.ui.checkout.nal.step2.analytics.a, com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.analytics.a, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.r, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: k */
    public static final String m104882k(C8700z0<String> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: l */
    public static final void m104883l(C8700z0<String> z0Var, String str) {
        z0Var.setValue(str);
    }

    /* renamed from: m */
    public static final C26141a m104884m(C8578k2<C26141a> k2Var) {
        return k2Var.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104885n(com.carrefour.fid.android.domain.models.pickup.C38080a r25, java.util.List<com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26193b> r26, double r27, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23617b, kotlin.C11079d2> r29, androidx.compose.runtime.C8592o r30, int r31) {
        /*
            r7 = r25
            r8 = r27
            r10 = r29
            r0 = -1707624460(0xffffffff9a37b7f4, float:-3.799211E-23)
            r1 = r30
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x001e
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.PickupBloc (NonFoodCheckoutStep2Screen.kt:758)"
            r15 = r31
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r15, r1, r2)
            goto L_0x0020
        L_0x001e:
            r15 = r31
        L_0x0020:
            r0 = r26
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b r3 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26193b) r3
            boolean r3 = r3.mo76156f()
            if (r3 == 0) goto L_0x0028
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26193b) r1
            r0 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0052
            com.carrefour.fid.android.domain.models.delivery.b r1 = r1.mo76154e()
            if (r1 == 0) goto L_0x0052
            boolean r1 = com.carrefour.fid.android.domain.models.delivery.C38018c.m156719a(r1)
            if (r1 != r0) goto L_0x0052
            r1 = r0
            goto L_0x0053
        L_0x0052:
            r1 = r5
        L_0x0053:
            if (r1 != 0) goto L_0x0079
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x005e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x005e:
            androidx.compose.runtime.t1 r11 = r6.mo15020s()
            if (r11 != 0) goto L_0x0065
            goto L_0x0078
        L_0x0065:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$1 r12 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$1
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r27
            r5 = r29
            r6 = r31
            r0.<init>(r1, r2, r3, r5, r6)
            r11.mo15202a(r12)
        L_0x0078:
            return
        L_0x0079:
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r1)
            java.lang.Object r1 = r6.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r3.mo16277a()
            if (r1 != r4) goto L_0x0093
            r1 = 2
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r2, r2, r1, r2)
            r6.mo14893C(r1)
        L_0x0093:
            r6.mo15002m0()
            androidx.compose.runtime.z0 r1 = (androidx.compose.runtime.C8700z0) r1
            com.carrefour.fid.android.domain.models.pickup.a r2 = m104886o(r1)
            r4 = -439069043(0xffffffffe5d4568d, float:-1.2534228E23)
            r6.mo14918M(r4)
            if (r2 != 0) goto L_0x00a5
            goto L_0x00ee
        L_0x00a5:
            r4 = 1157296644(0x44faf204, float:2007.563)
            r6.mo14918M(r4)
            boolean r4 = r6.mo15006n0(r1)
            java.lang.Object r11 = r6.mo14921N()
            if (r4 != 0) goto L_0x00bb
            java.lang.Object r4 = r3.mo16277a()
            if (r11 != r4) goto L_0x00c3
        L_0x00bb:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$2$1$1 r11 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$2$1$1
            r11.<init>(r1)
            r6.mo14893C(r11)
        L_0x00c3:
            r6.mo15002m0()
            kotlin.jvm.functions.a r11 = (kotlin.jvm.functions.C11289a) r11
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.ComposableSingletons$NonFoodCheckoutStep2ScreenKt r4 = com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.ComposableSingletons$NonFoodCheckoutStep2ScreenKt.f59546a
            kotlin.jvm.functions.p r12 = r4.mo69064c()
            r13 = 0
            r14 = 0
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$2$2 r4 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$2$2
            r4.<init>(r2, r1)
            r2 = 1060108214(0x3f2ff7b6, float:0.6873735)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r6, r2, r0, r4)
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 24624(0x6030, float:3.4506E-41)
            r24 = 492(0x1ec, float:6.9E-43)
            r15 = r0
            r22 = r6
            androidx.compose.material.AndroidAlertDialog_androidKt.m13201b(r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24)
        L_0x00ee:
            r6.mo15002m0()
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2 = 12
            r4 = 16
            if (r7 != 0) goto L_0x014a
            r1 = -439068598(0xffffffffe5d4584a, float:-1.2534629E23)
            r6.mo14918M(r1)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            float r4 = (float) r4
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10027n(r1, r12, r11, r4, r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r27)
            r6.mo14918M(r0)
            boolean r0 = r6.mo15006n0(r10)
            boolean r2 = r6.mo15006n0(r2)
            r0 = r0 | r2
            java.lang.Object r2 = r6.mo14921N()
            if (r0 != 0) goto L_0x0134
            java.lang.Object r0 = r3.mo16277a()
            if (r2 != r0) goto L_0x013c
        L_0x0134:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$3$1 r2 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$3$1
            r2.<init>(r10, r8)
            r6.mo14893C(r2)
        L_0x013c:
            r6.mo15002m0()
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.PickupComponentKt.m105043a(r1, r2, r6, r5)
            r6.mo15002m0()
            r13 = r5
            r11 = r6
            goto L_0x01aa
        L_0x014a:
            r11 = -439068348(0xffffffffe5d45944, float:-1.2534854E23)
            r6.mo14918M(r11)
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            float r4 = (float) r4
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r13 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10027n(r11, r13, r12, r4, r2)
            java.lang.Double r4 = java.lang.Double.valueOf(r27)
            r6.mo14918M(r0)
            boolean r0 = r6.mo15006n0(r10)
            boolean r4 = r6.mo15006n0(r4)
            r0 = r0 | r4
            java.lang.Object r4 = r6.mo14921N()
            if (r0 != 0) goto L_0x0184
            java.lang.Object r0 = r3.mo16277a()
            if (r4 != r0) goto L_0x018c
        L_0x0184:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$4$1 r4 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$4$1
            r4.<init>(r10, r8)
            r6.mo14893C(r4)
        L_0x018c:
            r6.mo15002m0()
            r3 = r4
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$5 r4 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$5
            r4.<init>(r7, r1)
            r11 = 64
            r12 = 0
            r0 = r2
            r1 = r25
            r2 = r3
            r3 = r4
            r4 = r6
            r13 = r5
            r5 = r11
            r11 = r6
            r6 = r12
            com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component.PickupComponentKt.m105044b(r0, r1, r2, r3, r4, r5, r6)
            r11.mo15002m0()
        L_0x01aa:
            com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt.m104587a(r11, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01b6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01b6:
            androidx.compose.runtime.t1 r11 = r11.mo15020s()
            if (r11 != 0) goto L_0x01bd
            goto L_0x01d0
        L_0x01bd:
            com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$6 r12 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$PickupBloc$6
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r27
            r5 = r29
            r6 = r31
            r0.<init>(r1, r2, r3, r5, r6)
            r11.mo15202a(r12)
        L_0x01d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt.m104885n(com.carrefour.fid.android.domain.models.pickup.a, java.util.List, double, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: o */
    public static final C38080a m104886o(C8700z0<C38080a> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: p */
    public static final void m104887p(C8700z0<C38080a> z0Var, C38080a aVar) {
        z0Var.setValue(aVar);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: q */
    public static final void m104888q(BasketAmounts basketAmounts, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1623221643);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1623221643, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.TotalLoyaltyComponentWrapper (NonFoodCheckoutStep2Screen.kt:830)");
        }
        if (basketAmounts.mo116893v() > 0.0d) {
            TotalLoyaltyComponentKt.m105070b(basketAmounts.mo116893v(), o, 0);
            BlockDividerKt.m104587a(o, 0);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodCheckoutStep2ScreenKt$TotalLoyaltyComponentWrapper$1(basketAmounts, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: r */
    public static final void m104889r(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-121776038);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-121776038, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.UserInfoShimmer (NonFoodCheckoutStep2Screen.kt:744)");
            }
            for (int i2 = 0; i2 < 2; i2++) {
                C8767m.C8768a aVar = C8767m.f23478j;
                float f = (float) 16;
                C8767m b = C37019o.m151909b(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10026m(aVar, C16483g.m74435M(f), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M((float) 150)), true, (C15218g4) null, 2, (Object) null);
                o.mo14918M(693286680);
                C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(b);
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
                Updater.m30188j(b2, d, companion.mo44588d());
                Updater.m30188j(b2, dVar, companion.mo44586b());
                Updater.m30188j(b2, layoutDirection, companion.mo44587c());
                Updater.m30188j(b2, c4Var, companion.mo44590f());
                o.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
                C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f)), o, 6);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodCheckoutStep2ScreenKt$UserInfoShimmer$2(i));
        }
    }
}
