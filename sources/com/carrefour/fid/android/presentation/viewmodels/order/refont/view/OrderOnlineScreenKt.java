package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.design.components.compose.MessageComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.OrderOnlineItemModel;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.OrdersOnlineItemComponentKt;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.TextStatusVariant;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27028a;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOrderOnlineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderOnlineScreen.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderOnlineScreenKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,624:1\n25#2:625\n25#2:632\n36#2:641\n36#2:648\n36#2:655\n36#2:662\n36#2:669\n460#2,13:695\n36#2:711\n36#2:718\n36#2:725\n473#2,3:732\n25#2:739\n25#2:746\n36#2:753\n1114#3,6:626\n1114#3,6:633\n1114#3,6:642\n1114#3,6:649\n1114#3,6:656\n1114#3,6:663\n1114#3,6:670\n1114#3,6:712\n1114#3,6:719\n1114#3,6:726\n1114#3,6:740\n1114#3,6:747\n1114#3,6:754\n76#4:639\n76#4:640\n76#4:683\n67#5,6:676\n73#5:708\n77#5:736\n75#6:682\n76#6,11:684\n89#6:735\n154#7:709\n154#7:710\n1855#8,2:737\n76#9:760\n102#9,2:761\n76#9:763\n76#9:764\n102#9,2:765\n*S KotlinDebug\n*F\n+ 1 OrderOnlineScreen.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderOnlineScreenKt\n*L\n73#1:625\n74#1:632\n195#1:641\n212#1:648\n218#1:655\n222#1:662\n228#1:669\n269#1:695,13\n341#1:711\n344#1:718\n365#1:725\n269#1:732,3\n519#1:739\n573#1:746\n574#1:753\n73#1:626,6\n74#1:633,6\n195#1:642,6\n212#1:649,6\n218#1:656,6\n222#1:663,6\n228#1:670,6\n341#1:712,6\n344#1:719,6\n365#1:726,6\n519#1:740,6\n573#1:747,6\n574#1:754,6\n75#1:639\n178#1:640\n269#1:683\n269#1:676,6\n269#1:708\n269#1:736\n269#1:682\n269#1:684,11\n269#1:735\n272#1:709\n273#1:710\n376#1:737,2\n74#1:760\n74#1:761,2\n519#1:763\n573#1:764\n573#1:765,2\n*E\n"})
public final class OrderOnlineScreenKt {
    @C8540g
    /* renamed from: a */
    public static final void m114512a(List<OrdersOnlineItemModel> list, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1179093894);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1179093894, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.ComputeItemDateTime (OrderOnlineScreen.kt:374)");
        }
        for (OrdersOnlineItemModel ordersOnlineItemModel : list) {
            if (!Intrinsics.areEqual((Object) ordersOnlineItemModel.mo78654z(), (Object) OrderStatus.Unknown.f89266e)) {
                OrderType A = ordersOnlineItemModel.mo78621A();
                if (Intrinsics.areEqual((Object) A, (Object) OrderType.DriveExpressPickup.f70284e)) {
                    o.mo14918M(502806322);
                    ordersOnlineItemModel.mo78652x().mo73701n().mo78715m(C16018i.m71859e(R.string.order_online_pickup_express_slot, new Object[]{StringKt.m118942v(ordersOnlineItemModel.mo78648u())}, o, 64));
                    o.mo15002m0();
                } else if (Intrinsics.areEqual((Object) A, (Object) OrderType.Lad.f70288e)) {
                    o.mo14918M(502806618);
                    OrderHeaderModel n = ordersOnlineItemModel.mo78652x().mo73701n();
                    C28932h.C28933a aVar = C28932h.f70914a;
                    n.mo78715m(C16018i.m71859e(R.string.order_online_delivery_nal, new Object[]{aVar.mo84228S(ordersOnlineItemModel.mo78648u()), aVar.mo84228S(ordersOnlineItemModel.mo78649v())}, o, 64));
                    o.mo15002m0();
                } else {
                    o.mo14918M(502806988);
                    o.mo15002m0();
                    ordersOnlineItemModel.mo78652x().mo73701n().mo78715m(StringKt.m118941u(ordersOnlineItemModel.mo78648u(), ordersOnlineItemModel.mo78649v()));
                }
            } else {
                ordersOnlineItemModel.mo78652x().mo73701n().mo78715m("");
                ordersOnlineItemModel.mo78652x().mo73701n().mo78716n(false);
            }
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineScreenKt$ComputeItemDateTime$2(list, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.p004ui.tooling.preview.C16464c
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m114513b(androidx.compose.runtime.C8592o r48, int r49) {
        /*
            r0 = r49
            r1 = 746663374(0x2c812dce, float:3.671486E-12)
            r2 = r48
            androidx.compose.runtime.o r9 = r2.mo15009o(r1)
            if (r0 != 0) goto L_0x0019
            boolean r2 = r9.mo15011p()
            if (r2 != 0) goto L_0x0014
            goto L_0x0019
        L_0x0014:
            r9.mo14958a0()
            goto L_0x016d
        L_0x0019:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0025
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineDialogScreenPreview (OrderOnlineScreen.kt:537)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r0, r2, r3)
        L_0x0025:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a r1 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a
            com.carrefour.fid.android.shared.type.e$c r11 = new com.carrefour.fid.android.shared.type.e$c
            r2 = 2
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel[] r3 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel[r2]
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel r4 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel
            r12 = r4
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            com.carrefour.fid.android.presentation.ui.orders.online.view.OrderOnlineItemModel r28 = new com.carrefour.fid.android.presentation.ui.orders.online.view.OrderOnlineItemModel
            r27 = r28
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel r5 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel
            r30 = 2131231548(0x7f08033c, float:1.807918E38)
            r31 = 2131953386(0x7f1306ea, float:1.9543242E38)
            java.lang.String r32 = "N° 69006004"
            java.lang.String r33 = "lun. 11 juil. 15h00 - 15h30"
            r34 = 0
            r35 = 16
            r36 = 0
            r29 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType[] r6 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType[r2]
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType r7 = com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType.RETURN_PRODUCT
            r8 = 0
            r6[r8] = r7
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType r10 = com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType.DOWNLOAD_BILL
            r2 = 1
            r6[r2] = r10
            java.util.List r35 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r6)
            java.lang.String r36 = "125,00€"
            r37 = 62
            r38 = 0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r28 = 8191(0x1fff, float:1.1478E-41)
            r29 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3[r8] = r4
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel r4 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel
            r30 = r4
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            com.carrefour.fid.android.presentation.ui.orders.online.view.OrderOnlineItemModel r12 = new com.carrefour.fid.android.presentation.ui.orders.online.view.OrderOnlineItemModel
            r45 = r12
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel r5 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel
            r14 = 2131231548(0x7f08033c, float:1.807918E38)
            r15 = 2131953386(0x7f1306ea, float:1.9543242E38)
            java.lang.String r16 = "N° 69006009"
            java.lang.String r17 = "lun. 12 juil. 16h00 - 17h30"
            r18 = 0
            r19 = 16
            r20 = 0
            r13 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r6 = 2
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType[] r13 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType[r6]
            r13[r8] = r7
            r13[r2] = r10
            java.util.List r19 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r13)
            java.lang.String r20 = "145,00€"
            r21 = 62
            r13 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r46 = 8191(0x1fff, float:1.1478E-41)
            r47 = 0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r3[r2] = r4
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r3)
            r11.<init>(r3)
            r12 = 0
            r13 = 0
            r15 = 14
            r16 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.mo14918M(r3)
            java.lang.Object r3 = r9.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            if (r3 != r5) goto L_0x0113
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r5 = 0
            r6 = 2
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r5, r6, r5)
            r9.mo14893C(r3)
        L_0x0113:
            r9.mo15002m0()
            androidx.compose.runtime.z0 r3 = (androidx.compose.runtime.C8700z0) r3
            boolean r5 = m114514c(r3)
            r6 = 1157296644(0x44faf204, float:2007.563)
            r9.mo14918M(r6)
            boolean r6 = r9.mo15006n0(r3)
            java.lang.Object r7 = r9.mo14921N()
            if (r6 != 0) goto L_0x0132
            java.lang.Object r4 = r4.mo16277a()
            if (r7 != r4) goto L_0x013a
        L_0x0132:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineDialogScreenPreview$pullRefreshState$1$1 r7 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineDialogScreenPreview$pullRefreshState$1$1
            r7.<init>(r3)
            r9.mo14893C(r7)
        L_0x013a:
            r9.mo15002m0()
            r3 = r7
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r4 = 0
            r6 = 0
            r7 = 0
            r10 = 12
            r11 = r2
            r2 = r5
            r5 = r6
            r6 = r9
            r12 = r8
            r8 = r10
            androidx.compose.material.pullrefresh.PullRefreshState r2 = androidx.compose.material.pullrefresh.PullRefreshStateKt.m25162a(r2, r3, r4, r5, r6, r7, r8)
            r3 = 3
            androidx.compose.foundation.lazy.LazyListState r3 = androidx.compose.foundation.lazy.LazyListStateKt.m10895a(r12, r12, r9, r12, r3)
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineDialogScreenPreview$1 r4 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineDialogScreenPreview$1
            r4.<init>(r1, r3, r2)
            r1 = -490877333(0xffffffffe2bdce6b, float:-1.7506543E21)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r9, r1, r11, r4)
            r2 = 6
            com.carrefour.fid.android.design.theme.ThemeKt.m153788a(r1, r9, r2)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x016d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x016d:
            androidx.compose.runtime.t1 r1 = r9.mo15020s()
            if (r1 != 0) goto L_0x0174
            goto L_0x017c
        L_0x0174:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineDialogScreenPreview$2 r2 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineDialogScreenPreview$2
            r2.<init>(r0)
            r1.mo15202a(r2)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt.m114513b(androidx.compose.runtime.o, int):void");
    }

    /* renamed from: c */
    public static final boolean m114514c(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: d */
    public static final void m114515d(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m114516e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1528890129);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1528890129, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenPreview (OrderOnlineScreen.kt:594)");
            }
            ThemeKt.m153788a(ComposableSingletons$OrderOnlineScreenKt.f65839a.mo78685c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineScreenKt$OrderOnlineEmptyScreenPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m114517f(@C12580l C8767m mVar, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(-1177134677);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(aVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                mVar = C8767m.f23478j;
            }
            if (i7 != 0) {
                aVar = OrderOnlineScreenKt$OrderOnlineErrorScreen$1.f65865f;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1177134677, i3, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineErrorScreen (OrderOnlineScreen.kt:469)");
            }
            MessageComponentKt.m151547d(mVar, R.drawable.ic_order_error, C16018i.m71858d(R.string.order_txt_error_title, o, 0), aVar, o, (i3 & 14) | ((i3 << 6) & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineScreenKt$OrderOnlineErrorScreen$2(mVar, aVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m114518g(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-337246444);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-337246444, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineErrorScreenPreview (OrderOnlineScreen.kt:604)");
            }
            ThemeKt.m153788a(ComposableSingletons$OrderOnlineScreenKt.f65839a.mo78687e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineScreenKt$OrderOnlineErrorScreenPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m114519h(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1432612768);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1432612768, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineLoadingScreenPreview (OrderOnlineScreen.kt:614)");
            }
            ThemeKt.m153788a(ComposableSingletons$OrderOnlineScreenKt.f65839a.mo78689g(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineScreenKt$OrderOnlineLoadingScreenPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f4  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m114520i(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r23, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a r24, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.order.refont.view.C27093b r25, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.order.refont.view.C27092a r26, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.LazyListState r27, @org.jetbrains.annotations.C12579k androidx.compose.material.pullrefresh.PullRefreshState r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.viewmodels.order.refont.C27028a, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r2 = r24
            r3 = r25
            r4 = r26
            r1 = r27
            r0 = r28
            r15 = r29
            r14 = r31
            java.lang.String r5 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "lazyState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "pullRefreshState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r5 = "actioner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r5)
            r5 = 70930190(0x43a4f0e, float:2.1900495E-36)
            r6 = r30
            androidx.compose.runtime.o r13 = r6.mo15009o(r5)
            r6 = r32 & 1
            r7 = 2
            if (r6 == 0) goto L_0x0036
            r8 = r14 | 6
            r9 = r8
            r8 = r23
            goto L_0x004a
        L_0x0036:
            r8 = r14 & 14
            if (r8 != 0) goto L_0x0047
            r8 = r23
            boolean r9 = r13.mo15006n0(r8)
            if (r9 == 0) goto L_0x0044
            r9 = 4
            goto L_0x0045
        L_0x0044:
            r9 = r7
        L_0x0045:
            r9 = r9 | r14
            goto L_0x004a
        L_0x0047:
            r8 = r23
            r9 = r14
        L_0x004a:
            r10 = r32 & 2
            if (r10 == 0) goto L_0x0051
            r9 = r9 | 48
            goto L_0x0061
        L_0x0051:
            r10 = r14 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x0061
            boolean r10 = r13.mo15006n0(r2)
            if (r10 == 0) goto L_0x005e
            r10 = 32
            goto L_0x0060
        L_0x005e:
            r10 = 16
        L_0x0060:
            r9 = r9 | r10
        L_0x0061:
            r10 = r32 & 4
            if (r10 == 0) goto L_0x0068
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0078
        L_0x0068:
            r10 = r14 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0078
            boolean r10 = r13.mo15006n0(r3)
            if (r10 == 0) goto L_0x0075
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0077
        L_0x0075:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0077:
            r9 = r9 | r10
        L_0x0078:
            r10 = r32 & 8
            if (r10 == 0) goto L_0x007f
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x008f
        L_0x007f:
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x008f
            boolean r10 = r13.mo15006n0(r4)
            if (r10 == 0) goto L_0x008c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x008e
        L_0x008c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x008e:
            r9 = r9 | r10
        L_0x008f:
            r10 = r32 & 16
            if (r10 == 0) goto L_0x0096
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a8
        L_0x0096:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x00a8
            boolean r10 = r13.mo15006n0(r1)
            if (r10 == 0) goto L_0x00a5
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r9 = r9 | r10
        L_0x00a8:
            r10 = r32 & 32
            if (r10 == 0) goto L_0x00b0
            r10 = 196608(0x30000, float:2.75506E-40)
        L_0x00ae:
            r9 = r9 | r10
            goto L_0x00c1
        L_0x00b0:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x00c1
            boolean r10 = r13.mo15006n0(r0)
            if (r10 == 0) goto L_0x00be
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00be:
            r10 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ae
        L_0x00c1:
            r10 = r32 & 64
            if (r10 == 0) goto L_0x00c9
            r10 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c7:
            r9 = r9 | r10
            goto L_0x00da
        L_0x00c9:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x00da
            boolean r10 = r13.mo14927P(r15)
            if (r10 == 0) goto L_0x00d7
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00d7:
            r10 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c7
        L_0x00da:
            r12 = r9
            r9 = 2995931(0x2db6db, float:4.198194E-39)
            r9 = r9 & r12
            r10 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r10) goto L_0x00f4
            boolean r9 = r13.mo15011p()
            if (r9 != 0) goto L_0x00eb
            goto L_0x00f4
        L_0x00eb:
            r13.mo14958a0()
            r21 = r8
            r5 = r13
            r1 = r15
            goto L_0x0314
        L_0x00f4:
            if (r6 == 0) goto L_0x00fa
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r10 = r6
            goto L_0x00fb
        L_0x00fa:
            r10 = r8
        L_0x00fb:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x0107
            r6 = -1
            java.lang.String r8 = "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreen (OrderOnlineScreen.kt:256)"
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r12, r6, r8)
        L_0x0107:
            com.carrefour.fid.android.shared.type.e r5 = r24.mo78666h()
            java.lang.Object r5 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0117
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0117:
            r6 = 8
            m114512a(r5, r13, r6)
            r6 = 0
            r9 = 0
            androidx.compose.ui.m r6 = androidx.compose.material.pullrefresh.PullRefreshKt.m25123d(r10, r0, r9, r7, r6)
            r7 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r13.mo14918M(r7)
            androidx.compose.ui.c$a r17 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r7 = r17.mo17061C()
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.BoxKt.m9849k(r7, r9, r13, r9)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r13.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r13.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r9 = r13.mo15032w(r9)
            androidx.compose.ui.platform.c4 r9 = (androidx.compose.p004ui.platform.C15863c4) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r0 = r16.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r1 = r13.mo15017r()
            boolean r1 = r1 instanceof androidx.compose.runtime.C8428d
            if (r1 != 0) goto L_0x016b
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x016b:
            r13.mo14938T()
            boolean r1 = r13.mo14997l()
            if (r1 == 0) goto L_0x0178
            r13.mo14947W(r0)
            goto L_0x017b
        L_0x0178:
            r13.mo14888A()
        L_0x017b:
            r13.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r13)
            kotlin.jvm.functions.p r1 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r7, r1)
            kotlin.jvm.functions.p r1 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r8, r1)
            kotlin.jvm.functions.p r1 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r11, r1)
            kotlin.jvm.functions.p r1 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r9, r1)
            r13.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r13)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r1 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6.invoke(r0, r13, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f6010a
            r7 = 16
            float r7 = (float) r7
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            androidx.compose.foundation.layout.Arrangement$e r9 = r6.mo7638z(r8)
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            androidx.compose.foundation.layout.i0 r7 = androidx.compose.foundation.layout.PaddingKt.m10014a(r6)
            androidx.compose.ui.c$b r11 = r17.mo17068m()
            r6 = 0
            r8 = 0
            r16 = 0
            r18 = 0
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$1 r1 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$1
            r1.<init>(r5, r2, r15, r12)
            int r5 = r12 >> 9
            r5 = r5 & 112(0x70, float:1.57E-43)
            r19 = 221568(0x36180, float:3.10483E-40)
            r19 = r5 | r19
            r20 = 201(0xc9, float:2.82E-43)
            r5 = r6
            r6 = r27
            r21 = r10
            r10 = r11
            r11 = r16
            r22 = r12
            r12 = r18
            r23 = r13
            r13 = r1
            r14 = r23
            r1 = r15
            r15 = r19
            r16 = r20
            androidx.compose.foundation.lazy.LazyDslKt.m10737b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r5 = r24.mo78669j()
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.c r7 = r17.mo17074y()
            androidx.compose.ui.m r7 = r0.mo7701c(r6, r7)
            r8 = 0
            r10 = 0
            r12 = 0
            int r0 = androidx.compose.material.pullrefresh.PullRefreshState.f18930j
            int r0 = r0 << 3
            int r6 = r22 >> 12
            r6 = r6 & 112(0x70, float:1.57E-43)
            r14 = r0 | r6
            r15 = 56
            r6 = r28
            r13 = r23
            androidx.compose.material.pullrefresh.PullRefreshIndicatorKt.m25105d(r5, r6, r7, r8, r10, r12, r13, r14, r15)
            r0 = 368754526(0x15fabf5e, float:1.0127612E-25)
            r5 = r23
            r5.mo14918M(r0)
            r0 = 2131952781(0x7f13048d, float:1.9542014E38)
            r6 = 2131953986(0x7f130942, float:1.9544458E38)
            r7 = 1157296644(0x44faf204, float:2007.563)
            if (r3 == 0) goto L_0x02a6
            int r8 = r25.mo78781k()
            r9 = 0
            java.lang.String r11 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r5, r9)
            int r8 = r25.mo78780j()
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r5, r9)
            java.lang.String r13 = androidx.compose.p004ui.res.C16018i.m71858d(r6, r5, r9)
            java.lang.String r14 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r5, r9)
            r5.mo14918M(r7)
            boolean r8 = r5.mo15006n0(r1)
            java.lang.Object r10 = r5.mo14921N()
            if (r8 != 0) goto L_0x0268
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r10 != r8) goto L_0x0270
        L_0x0268:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$2$1 r10 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$2$1
            r10.<init>(r1)
            r5.mo14893C(r10)
        L_0x0270:
            r5.mo15002m0()
            r15 = r10
            kotlin.jvm.functions.a r15 = (kotlin.jvm.functions.C11289a) r15
            r5.mo14918M(r7)
            boolean r8 = r5.mo15006n0(r1)
            java.lang.Object r10 = r5.mo14921N()
            if (r8 != 0) goto L_0x028b
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r10 != r8) goto L_0x0293
        L_0x028b:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$3$1 r10 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$3$1
            r10.<init>(r1)
            r5.mo14893C(r10)
        L_0x0293:
            r5.mo15002m0()
            r16 = r10
            kotlin.jvm.functions.a r16 = (kotlin.jvm.functions.C11289a) r16
            com.carrefour.fid.android.design.components.compose.f$b r8 = new com.carrefour.fid.android.design.components.compose.f$b
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            int r10 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r8, r5, r10)
            goto L_0x02a7
        L_0x02a6:
            r9 = 0
        L_0x02a7:
            r5.mo15002m0()
            r8 = 1635784647(0x618017c7, float:2.9536207E20)
            r5.mo14918M(r8)
            if (r4 == 0) goto L_0x02fc
            r8 = 2131952800(0x7f1304a0, float:1.9542053E38)
            java.lang.String r11 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r5, r9)
            r8 = 2131952022(0x7f130196, float:1.9540475E38)
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r5, r9)
            java.lang.String r13 = androidx.compose.p004ui.res.C16018i.m71858d(r6, r5, r9)
            java.lang.String r14 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r5, r9)
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$4 r15 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$4
            r15.<init>(r1, r4)
            r5.mo14918M(r7)
            boolean r0 = r5.mo15006n0(r1)
            java.lang.Object r6 = r5.mo14921N()
            if (r0 != 0) goto L_0x02e2
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r6 != r0) goto L_0x02ea
        L_0x02e2:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$5$1 r6 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$5$1
            r6.<init>(r1)
            r5.mo14893C(r6)
        L_0x02ea:
            r5.mo15002m0()
            r16 = r6
            kotlin.jvm.functions.a r16 = (kotlin.jvm.functions.C11289a) r16
            com.carrefour.fid.android.design.components.compose.f$b r0 = new com.carrefour.fid.android.design.components.compose.f$b
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            int r6 = com.carrefour.fid.android.design.components.compose.C36984f.C36986b.f92385g
            com.carrefour.fid.android.design.components.compose.DialogComponentKt.m151480c(r0, r5, r6)
        L_0x02fc:
            r5.mo15002m0()
            r5.mo15002m0()
            r5.mo14896D()
            r5.mo15002m0()
            r5.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0314
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0314:
            androidx.compose.runtime.t1 r10 = r5.mo15020s()
            if (r10 != 0) goto L_0x031b
            goto L_0x0336
        L_0x031b:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$2 r11 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$2
            r0 = r11
            r1 = r21
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x0336:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt.m114520i(androidx.compose.ui.m, com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a, com.carrefour.fid.android.presentation.viewmodels.order.refont.view.b, com.carrefour.fid.android.presentation.viewmodels.order.refont.view.a, androidx.compose.foundation.lazy.LazyListState, androidx.compose.material.pullrefresh.PullRefreshState, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m114521j(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(751518710);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(751518710, i2, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenPreview (OrderOnlineScreen.kt:483)");
            }
            OrderOnlineItemModel orderOnlineItemModel = r28;
            OrderHeaderModel orderHeaderModel = new OrderHeaderModel(R.drawable.ic_order_error, R.string.order_type_drive, "N° 69006004", "lun. 11 juil. 15h00 - 15h30", false, 16, (DefaultConstructorMarker) null);
            SelfCareType selfCareType = SelfCareType.RETURN_PRODUCT;
            SelfCareType selfCareType2 = SelfCareType.DOWNLOAD_BILL;
            OrderOnlineItemModel orderOnlineItemModel2 = new OrderOnlineItemModel(orderHeaderModel, false, 0, 0, 0, (TextStatusVariant) null, CollectionsKt__CollectionsKt.m40448L(selfCareType, selfCareType2), "125,00€", 62, (DefaultConstructorMarker) null);
            OrderOnlineItemModel orderOnlineItemModel3 = r12;
            OrderOnlineItemModel orderOnlineItemModel4 = new OrderOnlineItemModel(new OrderHeaderModel(R.drawable.ic_order_error, R.string.order_type_drive, "N° 69006009", "lun. 12 juil. 16h00 - 17h30", false, 16, (DefaultConstructorMarker) null), false, 0, 0, 0, (TextStatusVariant) null, CollectionsKt__CollectionsKt.m40448L(selfCareType, selfCareType2), "145,00€", 62, (DefaultConstructorMarker) null);
            C27077a aVar = new C27077a(new C28892e.C28895c(CollectionsKt__CollectionsKt.m40448L(new OrdersOnlineItemModel(false, (Long) null, (OrderType) null, (OrderStatus) null, (String) null, (String) null, 0.0d, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, orderOnlineItemModel, C16476b.f40864p, (DefaultConstructorMarker) null), new OrdersOnlineItemModel(false, (Long) null, (OrderType) null, (OrderStatus) null, (String) null, (String) null, 0.0d, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, orderOnlineItemModel3, C16476b.f40864p, (DefaultConstructorMarker) null))), false, false, false, 14, (DefaultConstructorMarker) null);
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            ThemeKt.m153788a(C8553b.m31048b(o, 1925176915, true, new OrderOnlineScreenKt$OrderOnlineScreenPreview$1(aVar, LazyListStateKt.m10895a(0, 0, o, 0, 3), PullRefreshStateKt.m25162a(m114522k((C8700z0) N), OrderOnlineScreenKt$OrderOnlineScreenPreview$pullRefreshState$1.f65869f, 0.0f, 0.0f, o, 48, 12))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineScreenKt$OrderOnlineScreenPreview$2(i2));
        }
    }

    /* renamed from: k */
    public static final boolean m114522k(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m114523l(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel r27, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.order.refont.C27052b r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.String, ? super com.carrefour.fid.android.shared.domain.models.order.OrderType, ? super java.lang.Boolean, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.String, ? super com.carrefour.fid.android.shared.domain.models.order.OrderType, ? super java.lang.String, kotlin.C11079d2> r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r36, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r37, int r38) {
        /*
            r12 = r27
            r13 = r28
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onDisplayOrder"
            r14 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onNavigateToAccountListFragment"
            r15 = r30
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onNavigateToServiceSlot"
            r11 = r31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onNavigateToOrdersSuccessHandleFragment"
            r10 = r32
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onNavigateToAdditionalOrder"
            r9 = r33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onNavigateToWithdrawalOrderDriveFragment"
            r8 = r34
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onNavigateToDepartment"
            r7 = r35
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onDisplaySnackBar"
            r6 = r36
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 601078662(0x23d3bb86, float:2.2956085E-17)
            r1 = r37
            androidx.compose.runtime.o r5 = r1.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x005e
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineStateful (OrderOnlineScreen.kt:51)"
            r4 = r38
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r1, r2)
            goto L_0x0060
        L_0x005e:
            r4 = r38
        L_0x0060:
            kotlinx.coroutines.flow.j r0 = r27.mo78787h0()
            r1 = 8
            r3 = 0
            r2 = 1
            androidx.compose.runtime.k2 r1 = androidx.compose.runtime.C8415c2.m30233b(r0, r3, r5, r1, r2)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r0)
            java.lang.Object r2 = r5.mo14921N()
            androidx.compose.runtime.o$a r23 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r23.mo16277a()
            r4 = 2
            if (r2 != r0) goto L_0x0086
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r3, r3, r4, r3)
            r5.mo14893C(r2)
        L_0x0086:
            r5.mo15002m0()
            r24 = r2
            androidx.compose.runtime.z0 r24 = (androidx.compose.runtime.C8700z0) r24
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r0)
            java.lang.Object r0 = r5.mo14921N()
            java.lang.Object r2 = r23.mo16277a()
            if (r0 != r2) goto L_0x00a4
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r3, r3, r4, r3)
            r5.mo14893C(r0)
        L_0x00a4:
            r5.mo15002m0()
            r25 = r0
            androidx.compose.runtime.z0 r25 = (androidx.compose.runtime.C8700z0) r25
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71024v()
            java.lang.Object r0 = r5.mo15032w(r0)
            r26 = r0
            androidx.compose.ui.platform.z3 r26 = (androidx.compose.p004ui.platform.C16007z3) r26
            java.lang.Object r0 = r1.getValue()
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a r0 = (com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a) r0
            boolean r16 = r0.mo78669j()
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$pullRefreshState$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$pullRefreshState$1
            r0.<init>(r12)
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 12
            r17 = r0
            r20 = r5
            androidx.compose.material.pullrefresh.PullRefreshState r16 = androidx.compose.material.pullrefresh.PullRefreshStateKt.m25162a(r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            r2 = 3
            androidx.compose.foundation.lazy.LazyListState r17 = androidx.compose.foundation.lazy.LazyListStateKt.m10895a(r4, r4, r5, r4, r2)
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$actioner$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$actioner$1
            r18 = r0
            r19 = r1
            r1 = r27
            r20 = r2
            r12 = 1
            r2 = r28
            r14 = r3
            r3 = r24
            r15 = r4
            r4 = r29
            r12 = r5
            r5 = r35
            r6 = r33
            r7 = r31
            r8 = r30
            r9 = r34
            r10 = r25
            r11 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.e r1 = r27.getSideEffect()
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r0 = r12.mo15032w(r0)
            androidx.lifecycle.w r0 = (androidx.lifecycle.C19499w) r0
            androidx.lifecycle.Lifecycle r2 = r0.getLifecycle()
            r3 = 0
            r5 = 72
            r6 = 4
            r4 = r12
            kotlinx.coroutines.flow.e r6 = com.carrefour.fid.android.shared.extension.FlowKt.m118809b(r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$1 r7 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$1
            r5 = 0
            r0 = r7
            r1 = r6
            r2 = r28
            r3 = r32
            r4 = r36
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 72
            androidx.compose.runtime.EffectsKt.m29896h(r6, r7, r12, r0)
            java.lang.Object r0 = r19.getValue()
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a r0 = (com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a) r0
            com.carrefour.fid.android.shared.type.e r1 = r0.mo78666h()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r0)
            r7 = r19
            boolean r2 = r12.mo15006n0(r7)
            java.lang.Object r3 = r12.mo14921N()
            if (r2 != 0) goto L_0x0151
            java.lang.Object r2 = r23.mo16277a()
            if (r3 != r2) goto L_0x0159
        L_0x0151:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$2$1 r3 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$2$1
            r3.<init>(r7)
            r12.mo14893C(r3)
        L_0x0159:
            r12.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$3 r3 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$3
            r3.<init>(r13)
            int r8 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            r6 = 0
            r4 = r12
            r5 = r8
            com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt.m119625a(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = r7.getValue()
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a r1 = (com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a) r1
            com.carrefour.fid.android.shared.type.e r1 = r1.mo78666h()
            boolean r2 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28894b
            if (r2 != 0) goto L_0x02d4
            boolean r2 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28896d
            if (r2 == 0) goto L_0x0180
            goto L_0x02d4
        L_0x0180:
            boolean r2 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r2 == 0) goto L_0x0241
            r2 = 2100288672(0x7d2fdca0, float:1.4610028E37)
            r12.mo14918M(r2)
            com.carrefour.fid.android.shared.type.e$a r1 = (com.carrefour.fid.android.shared.type.C28892e.C28893a) r1
            java.lang.Throwable r1 = r1.mo84083d()
            boolean r2 = r1 instanceof com.carrefour.fid.android.core.p057io.OrderHistoryIsUnavailableFromConfigThrowable
            if (r2 == 0) goto L_0x01d0
            r1 = 2100288783(0x7d2fdd0f, float:1.4610169E37)
            r12.mo14918M(r1)
            r28.mo78575n()
            r1 = 0
            r2 = 2131953382(0x7f1306e6, float:1.9543233E38)
            r3 = 2131953381(0x7f1306e5, float:1.9543231E38)
            r12.mo14918M(r0)
            r9 = r18
            boolean r0 = r12.mo15006n0(r9)
            java.lang.Object r4 = r12.mo14921N()
            if (r0 != 0) goto L_0x01b9
            java.lang.Object r0 = r23.mo16277a()
            if (r4 != r0) goto L_0x01c1
        L_0x01b9:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$4$1 r4 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$4$1
            r4.<init>(r9)
            r12.mo14893C(r4)
        L_0x01c1:
            r12.mo15002m0()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r6 = 0
            r7 = 1
            r5 = r12
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt.m114503a(r1, r2, r3, r4, r5, r6, r7)
            r12.mo15002m0()
            goto L_0x023c
        L_0x01d0:
            r9 = r18
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r1 == 0) goto L_0x020c
            r1 = 2100289250(0x7d2fdee2, float:1.4610761E37)
            r12.mo14918M(r1)
            r28.mo78575n()
            r1 = 0
            r2 = 0
            r3 = 0
            r12.mo14918M(r0)
            boolean r0 = r12.mo15006n0(r9)
            java.lang.Object r4 = r12.mo14921N()
            if (r0 != 0) goto L_0x01f5
            java.lang.Object r0 = r23.mo16277a()
            if (r4 != r0) goto L_0x01fd
        L_0x01f5:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$5$1 r4 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$5$1
            r4.<init>(r9)
            r12.mo14893C(r4)
        L_0x01fd:
            r12.mo15002m0()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r6 = 0
            r7 = 7
            r5 = r12
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt.m114503a(r1, r2, r3, r4, r5, r6, r7)
            r12.mo15002m0()
            goto L_0x023c
        L_0x020c:
            r1 = 2100289469(0x7d2fdfbd, float:1.4611038E37)
            r12.mo14918M(r1)
            r28.mo78572k()
            r12.mo14918M(r0)
            boolean r0 = r12.mo15006n0(r9)
            java.lang.Object r1 = r12.mo14921N()
            if (r0 != 0) goto L_0x0228
            java.lang.Object r0 = r23.mo16277a()
            if (r1 != r0) goto L_0x0230
        L_0x0228:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$6$1 r1 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$6$1
            r1.<init>(r9)
            r12.mo14893C(r1)
        L_0x0230:
            r12.mo15002m0()
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            r0 = 1
            m114517f(r14, r1, r12, r15, r0)
            r12.mo15002m0()
        L_0x023c:
            r12.mo15002m0()
            goto L_0x02e1
        L_0x0241:
            r9 = r18
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r1 == 0) goto L_0x0294
            java.lang.Object r2 = r7.getValue()
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a r2 = (com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a) r2
            com.carrefour.fid.android.shared.type.e r2 = r2.mo78666h()
            java.lang.Object r2 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x025e
            boolean r2 = r2.isEmpty()
            goto L_0x025f
        L_0x025e:
            r2 = 1
        L_0x025f:
            if (r2 == 0) goto L_0x0294
            r1 = 2100289785(0x7d2fe0f9, float:1.4611439E37)
            r12.mo14918M(r1)
            r1 = 0
            r2 = 0
            r3 = 0
            r12.mo14918M(r0)
            boolean r0 = r12.mo15006n0(r9)
            java.lang.Object r4 = r12.mo14921N()
            if (r0 != 0) goto L_0x027d
            java.lang.Object r0 = r23.mo16277a()
            if (r4 != r0) goto L_0x0285
        L_0x027d:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$7$1 r4 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$7$1
            r4.<init>(r9)
            r12.mo14893C(r4)
        L_0x0285:
            r12.mo15002m0()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r6 = 0
            r7 = 7
            r5 = r12
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineEmptyScreenKt.m114503a(r1, r2, r3, r4, r5, r6, r7)
            r12.mo15002m0()
            goto L_0x02e1
        L_0x0294:
            if (r1 == 0) goto L_0x02ca
            r0 = 2100289982(0x7d2fe1be, float:1.4611689E37)
            r12.mo14918M(r0)
            r1 = 0
            java.lang.Object r0 = r7.getValue()
            r2 = r0
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a r2 = (com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a) r2
            java.lang.Object r0 = r24.getValue()
            r3 = r0
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.b r3 = (com.carrefour.fid.android.presentation.viewmodels.order.refont.view.C27093b) r3
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.a r4 = m114524m(r25)
            int r0 = r8 << 3
            int r5 = com.carrefour.fid.android.shared.domain.models.order.OrderType.f70277d
            int r5 = r5 << 9
            r0 = r0 | r5
            int r5 = androidx.compose.material.pullrefresh.PullRefreshState.f18930j
            int r5 = r5 << 15
            r0 = r0 | r5
            r10 = 1
            r5 = r17
            r6 = r16
            r7 = r9
            r8 = r12
            r9 = r0
            m114520i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.mo15002m0()
            goto L_0x02e1
        L_0x02ca:
            r0 = 2100290326(0x7d2fe316, float:1.4612125E37)
            r12.mo14918M(r0)
            r12.mo15002m0()
            goto L_0x02e1
        L_0x02d4:
            r0 = 2100288578(0x7d2fdc42, float:1.4609909E37)
            r12.mo14918M(r0)
            r0 = 1
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineLoadingScreenKt.m114506a(r14, r12, r15, r0)
            r12.mo15002m0()
        L_0x02e1:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02ea
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02ea:
            androidx.compose.runtime.t1 r12 = r12.mo15020s()
            if (r12 != 0) goto L_0x02f1
            goto L_0x0310
        L_0x02f1:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$8 r14 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineStateful$8
            r0 = r14
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r14)
        L_0x0310:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt.m114523l(com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel, com.carrefour.fid.android.presentation.viewmodels.order.refont.b, kotlin.jvm.functions.q, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: m */
    public static final C27092a m114524m(C8700z0<C27092a> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: n */
    public static final void m114525n(C8700z0<C27092a> z0Var, C27092a aVar) {
        z0Var.setValue(aVar);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: o */
    public static final void m114526o(OrdersOnlineItemModel ordersOnlineItemModel, C11300l<? super C27028a, C11079d2> lVar, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(13995929);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(13995929, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrdersOnlineItem (OrderOnlineScreen.kt:404)");
        }
        OrdersOnlineItemComponentKt.m109371h((C8767m) null, ordersOnlineItemModel.mo78652x(), new OrderOnlineScreenKt$OrdersOnlineItem$1(ordersOnlineItemModel, lVar), new OrderOnlineScreenKt$OrdersOnlineItem$2(lVar, ordersOnlineItemModel), o, 64, 1);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new OrderOnlineScreenKt$OrdersOnlineItem$3(ordersOnlineItemModel, lVar, i));
        }
    }
}
