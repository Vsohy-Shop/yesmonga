package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import android.widget.DatePicker;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.semantics.C16031g;
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
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.snapshots.C8667t;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCreateLoyaltyCardStepTwoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateLoyaltyCardStepTwoScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyCardStepTwoScreenKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,838:1\n25#2:839\n25#2:846\n25#2:853\n25#2:860\n25#2:867\n25#2:874\n25#2:881\n25#2:888\n25#2:895\n25#2:902\n25#2:909\n460#2,13:940\n36#2:954\n36#2:961\n36#2:968\n36#2:975\n36#2:982\n36#2:989\n83#2,3:996\n473#2,3:1005\n25#2:1010\n36#2:1017\n50#2:1027\n49#2:1028\n25#2:1035\n460#2,13:1059\n36#2:1073\n473#2,3:1080\n36#2:1085\n50#2:1093\n49#2:1094\n36#2:1105\n36#2:1113\n460#2,13:1141\n36#2:1155\n473#2,3:1162\n460#2,13:1187\n36#2:1201\n473#2,3:1208\n36#2:1216\n36#2:1225\n460#2,13:1249\n460#2,13:1283\n473#2,3:1297\n473#2,3:1304\n25#2:1309\n1114#3,6:840\n1114#3,6:847\n1114#3,6:854\n1114#3,6:861\n1114#3,6:868\n1114#3,6:875\n1114#3,6:882\n1114#3,6:889\n1114#3,6:896\n1114#3,6:903\n1114#3,6:910\n1114#3,6:955\n1114#3,6:962\n1114#3,6:969\n1114#3,6:976\n1114#3,6:983\n1114#3,6:990\n1114#3,6:999\n1114#3,6:1011\n1114#3,6:1018\n1114#3,6:1029\n1114#3,6:1036\n1114#3,6:1074\n1114#3,6:1086\n1114#3,6:1095\n1114#3,6:1106\n1114#3,6:1114\n1114#3,6:1156\n1114#3,6:1202\n1114#3,6:1217\n1114#3,6:1226\n1114#3,6:1310\n167#4,3:916\n76#5:919\n76#5:928\n76#5:1047\n76#5:1129\n76#5:1175\n76#5:1237\n76#5:1271\n154#6:920\n154#6:1024\n154#6:1025\n154#6:1026\n154#6:1042\n154#6:1043\n154#6:1092\n154#6:1101\n154#6:1102\n154#6:1103\n154#6:1104\n154#6:1112\n154#6:1120\n154#6:1121\n154#6:1167\n154#6:1213\n154#6:1214\n154#6:1215\n154#6:1223\n154#6:1224\n154#6:1232\n154#6:1233\n154#6:1263\n154#6:1302\n154#6:1303\n74#7,6:921\n80#7:953\n84#7:1009\n74#7,6:1264\n80#7:1296\n84#7:1301\n75#8:927\n76#8,11:929\n89#8:1008\n75#8:1046\n76#8,11:1048\n89#8:1083\n75#8:1128\n76#8,11:1130\n89#8:1165\n75#8:1174\n76#8,11:1176\n89#8:1211\n75#8:1236\n76#8,11:1238\n75#8:1270\n76#8,11:1272\n89#8:1300\n89#8:1307\n79#9,2:1044\n81#9:1072\n85#9:1084\n75#9,6:1122\n81#9:1154\n85#9:1166\n75#9,6:1168\n81#9:1200\n85#9:1212\n79#9,2:1234\n81#9:1262\n85#9:1308\n76#10:1316\n102#10,2:1317\n76#10:1319\n102#10,2:1320\n76#10:1322\n102#10,2:1323\n76#10:1325\n102#10,2:1326\n76#10:1328\n102#10,2:1329\n76#10:1331\n102#10,2:1332\n76#10:1334\n102#10,2:1335\n76#10:1337\n102#10,2:1338\n76#10:1340\n102#10,2:1341\n76#10:1343\n102#10,2:1344\n76#10:1346\n102#10,2:1347\n*S KotlinDebug\n*F\n+ 1 CreateLoyaltyCardStepTwoScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyCardStepTwoScreenKt\n*L\n119#1:839\n128#1:846\n129#1:853\n134#1:860\n135#1:867\n136#1:874\n137#1:881\n138#1:888\n142#1:895\n143#1:902\n144#1:909\n150#1:940,13\n165#1:954\n166#1:961\n169#1:968\n179#1:975\n229#1:982\n230#1:989\n231#1:996,3\n150#1:1005,3\n264#1:1010\n276#1:1017\n337#1:1027\n337#1:1028\n370#1:1035\n382#1:1059,13\n397#1:1073\n382#1:1080,3\n405#1:1085\n472#1:1093\n472#1:1094\n538#1:1105\n585#1:1113\n623#1:1141,13\n631#1:1155\n623#1:1162,3\n640#1:1187,13\n648#1:1201\n640#1:1208,3\n684#1:1216\n716#1:1225\n749#1:1249,13\n763#1:1283,13\n763#1:1297,3\n749#1:1304,3\n789#1:1309\n119#1:840,6\n128#1:847,6\n129#1:854,6\n134#1:861,6\n135#1:868,6\n136#1:875,6\n137#1:882,6\n138#1:889,6\n142#1:896,6\n143#1:903,6\n144#1:910,6\n165#1:955,6\n166#1:962,6\n169#1:969,6\n179#1:976,6\n229#1:983,6\n230#1:990,6\n231#1:999,6\n264#1:1011,6\n276#1:1018,6\n337#1:1029,6\n370#1:1036,6\n397#1:1074,6\n405#1:1086,6\n472#1:1095,6\n538#1:1106,6\n585#1:1114,6\n631#1:1156,6\n648#1:1202,6\n684#1:1217,6\n716#1:1226,6\n789#1:1310,6\n146#1:916,3\n148#1:919\n150#1:928\n382#1:1047\n623#1:1129\n640#1:1175\n749#1:1237\n763#1:1271\n154#1:920\n283#1:1024\n300#1:1025\n324#1:1026\n378#1:1042\n385#1:1043\n448#1:1092\n495#1:1101\n496#1:1102\n513#1:1103\n514#1:1104\n561#1:1112\n620#1:1120\n627#1:1121\n644#1:1167\n680#1:1213\n687#1:1214\n689#1:1215\n700#1:1223\n718#1:1224\n739#1:1232\n753#1:1233\n763#1:1263\n780#1:1302\n781#1:1303\n150#1:921,6\n150#1:953\n150#1:1009\n763#1:1264,6\n763#1:1296\n763#1:1301\n150#1:927\n150#1:929,11\n150#1:1008\n382#1:1046\n382#1:1048,11\n382#1:1083\n623#1:1128\n623#1:1130,11\n623#1:1165\n640#1:1174\n640#1:1176,11\n640#1:1211\n749#1:1236\n749#1:1238,11\n763#1:1270\n763#1:1272,11\n763#1:1300\n749#1:1307\n382#1:1044,2\n382#1:1072\n382#1:1084\n623#1:1122,6\n623#1:1154\n623#1:1166\n640#1:1168,6\n640#1:1200\n640#1:1212\n749#1:1234,2\n749#1:1262\n749#1:1308\n128#1:1316\n128#1:1317,2\n129#1:1319\n129#1:1320,2\n134#1:1322\n134#1:1323,2\n135#1:1325\n135#1:1326,2\n136#1:1328\n136#1:1329,2\n137#1:1331\n137#1:1332,2\n138#1:1334\n138#1:1335,2\n142#1:1337\n142#1:1338,2\n143#1:1340\n143#1:1341,2\n144#1:1343\n144#1:1344,2\n370#1:1346\n370#1:1347,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt */
public final class CreateLoyaltyCardStepTwoScreenKt {
    @C12579k

    /* renamed from: a */
    public static final String f60829a = "BIRTHDAY_FIELD";
    @C12579k

    /* renamed from: b */
    public static final String f60830b = "PHONE_NUMBER_FIELD";
    @C12579k

    /* renamed from: c */
    public static final String f60831c = "ADDRESS_FIELD";
    @C12579k

    /* renamed from: d */
    public static final String f60832d = "POST_CODE_FIELD";
    @C12579k

    /* renamed from: e */
    public static final String f60833e = "CITY_FIELD";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m107006A(boolean r43, androidx.compose.runtime.C8578k2<com.carrefour.fid.android.domain.models.account.Address> r44, java.util.Map<java.lang.String, ? extends com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b> r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r50, androidx.compose.runtime.C8578k2<? extends java.util.List<com.carrefour.fid.android.account.presentation.models.DQEAddressModel>> r51, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24396c, kotlin.C11079d2> r52, androidx.compose.runtime.C8592o r53, int r54) {
        /*
            r3 = r45
            r8 = r50
            r15 = r52
            r7 = r54
            r0 = 1830971770(0x6d22697a, float:3.1415053E27)
            r1 = r53
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x001d
            r2 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.UserAddressField (CreateLoyaltyCardStepTwoScreen.kt:356)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r2, r4)
        L_0x001d:
            r0 = 2130903049(0x7f030009, float:1.7412905E38)
            r2 = 0
            java.lang.String[] r0 = androidx.compose.p004ui.res.C16018i.m71857c(r0, r1, r2)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r4)
            java.lang.Object r4 = r1.mo14921N()
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r5.mo16277a()
            r14 = 0
            if (r4 != r6) goto L_0x0042
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r6 = 2
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r14, r6, r14)
            r1.mo14893C(r4)
        L_0x0042:
            r1.mo15002m0()
            r12 = r4
            androidx.compose.runtime.z0 r12 = (androidx.compose.runtime.C8700z0) r12
            r4 = 2131953027(0x7f130583, float:1.9542513E38)
            java.lang.String r16 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r1, r2)
            r4 = 2131099826(0x7f0600b2, float:1.7812016E38)
            long r18 = androidx.compose.p004ui.res.C16009b.m71825a(r4, r1, r2)
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            int r6 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r9 = r4.mo11077c(r1, r6)
            androidx.compose.ui.text.p0 r36 = com.carrefour.fid.android.design.theme.C37477d.m153885L(r9)
            androidx.compose.ui.m$a r13 = androidx.compose.p004ui.C8767m.f23478j
            r11 = 0
            r10 = 1
            androidx.compose.ui.m r20 = androidx.compose.foundation.layout.SizeKt.m10114n(r13, r11, r10, r14)
            r21 = 0
            r9 = 40
            float r9 = (float) r9
            float r22 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            r23 = 0
            r24 = 0
            r25 = 13
            r26 = 0
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.PaddingKt.m10028o(r20, r21, r22, r23, r24, r25, r26)
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r38 = 48
            r39 = 0
            r40 = 65528(0xfff8, float:9.1824E-41)
            r37 = r1
            androidx.compose.material.TextKt.m14196c(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r2 = -2082792548(0xffffffff83db1b9c, float:-1.2878002E-36)
            r1.mo14918M(r2)
            java.lang.Object r2 = r44.getValue()
            if (r2 == 0) goto L_0x0218
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r13, r11, r10, r14)
            r17 = 0
            r2 = 24
            float r2 = (float) r2
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.c$a r16 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r10 = r16.mo17070q()
            androidx.compose.foundation.layout.Arrangement r16 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r11 = r16.mo7628l()
            r14 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r14)
            r14 = 54
            androidx.compose.ui.layout.f0 r10 = androidx.compose.foundation.layout.RowKt.m10071d(r11, r10, r1, r14)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r11)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r41 = r9
            kotlin.jvm.functions.a r9 = r16.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            r42 = r13
            androidx.compose.runtime.d r13 = r1.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x011f
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x011f:
            r1.mo14938T()
            boolean r13 = r1.mo14997l()
            if (r13 == 0) goto L_0x012c
            r1.mo14947W(r9)
            goto L_0x012f
        L_0x012c:
            r1.mo14888A()
        L_0x012f:
            r1.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r13 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r10, r13)
            kotlin.jvm.functions.p r10 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r11, r10)
            kotlin.jvm.functions.p r10 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r14, r10)
            kotlin.jvm.functions.p r10 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r10)
            r1.mo14972e()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r8 = androidx.compose.runtime.C8684u1.m31905a(r8)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r2.invoke(r8, r1, r10)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r2)
            androidx.compose.foundation.layout.RowScopeInstance r2 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r2 = 2131953058(0x7f1305a2, float:1.9542576E38)
            java.lang.String r16 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r1, r9)
            r17 = 0
            r2 = 2131099823(0x7f0600af, float:1.781201E38)
            long r18 = androidx.compose.p004ui.res.C16009b.m71825a(r2, r1, r9)
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            androidx.compose.material.w1 r2 = r4.mo11077c(r1, r6)
            androidx.compose.ui.text.p0 r36 = com.carrefour.fid.android.design.theme.C37477d.m153904p(r2)
            r38 = 0
            r39 = 0
            r40 = 65530(0xfffa, float:9.1827E-41)
            r37 = r1
            androidx.compose.material.TextKt.m14196c(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r2)
            boolean r2 = r1.mo15006n0(r15)
            java.lang.Object r4 = r1.mo14921N()
            if (r2 != 0) goto L_0x01c1
            java.lang.Object r2 = r5.mo16277a()
            if (r4 != r2) goto L_0x01c9
        L_0x01c1:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$1$1$1 r4 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$1$1$1
            r4.<init>(r15)
            r1.mo14893C(r4)
        L_0x01c9:
            r1.mo15002m0()
            r2 = r4
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            r4 = 0
            r6 = 0
            r8 = 0
            androidx.compose.material.q1 r16 = androidx.compose.material.C7903q1.f18967a
            com.carrefour.fid.android.design.theme.b r9 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r17 = r9.mo114218O()
            r19 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r36 = 0
            int r37 = androidx.compose.material.C7903q1.f18968b
            r38 = 1022(0x3fe, float:1.432E-42)
            r35 = r1
            androidx.compose.material.p1 r21 = r16.mo10989a(r17, r19, r21, r22, r24, r26, r27, r29, r31, r33, r35, r36, r37, r38)
            r23 = r7 & 14
            r24 = 28
            r16 = r43
            r17 = r2
            r18 = r4
            r19 = r6
            r20 = r8
            r22 = r1
            androidx.compose.material.SwitchKt.m14058a(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            goto L_0x021c
        L_0x0218:
            r41 = r9
            r42 = r13
        L_0x021c:
            r1.mo15002m0()
            boolean r16 = m107007B(r12)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r2)
            boolean r4 = r1.mo15006n0(r12)
            java.lang.Object r6 = r1.mo14921N()
            if (r4 != 0) goto L_0x0239
            java.lang.Object r4 = r5.mo16277a()
            if (r6 != r4) goto L_0x0241
        L_0x0239:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$2$1 r6 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$2$1
            r6.<init>(r12)
            r1.mo14893C(r6)
        L_0x0241:
            r1.mo15002m0()
            r17 = r6
            kotlin.jvm.functions.l r17 = (kotlin.jvm.functions.C11300l) r17
            r18 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3 r4 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3
            r6 = r41
            r9 = r4
            r8 = 1
            r10 = r49
            r14 = 0
            r11 = r54
            r2 = r42
            r13 = r0
            r14 = r52
            r9.<init>(r10, r11, r12, r13, r14)
            r9 = -947869168(0xffffffffc780aa10, float:-65876.125)
            androidx.compose.runtime.internal.a r19 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r9, r8, r4)
            r21 = 3072(0xc00, float:4.305E-42)
            r22 = 4
            r20 = r1
            androidx.compose.material.ExposedDropdownMenuKt.m13511a(r16, r17, r18, r19, r20, r21, r22)
            r4 = 2131952924(0x7f13051c, float:1.9542304E38)
            r9 = 0
            java.lang.String r17 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r1, r9)
            r4 = 0
            r9 = 0
            androidx.compose.ui.m r18 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r4, r8, r9)
            r19 = 0
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r21 = 0
            r22 = 0
            r23 = 13
            r24 = 0
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r18, r19, r20, r21, r22, r23, r24)
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$4 r11 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$4
            r12 = r46
            r11.<init>(r12, r15, r3)
            androidx.compose.ui.m r18 = androidx.compose.p004ui.focus.C15056b.m64690a(r10, r11)
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r10)
            r10 = r50
            r11 = 1157296644(0x44faf204, float:2007.563)
            boolean r13 = r1.mo15006n0(r10)
            boolean r14 = r1.mo15006n0(r15)
            r13 = r13 | r14
            java.lang.Object r14 = r1.mo14921N()
            if (r13 != 0) goto L_0x02b8
            java.lang.Object r13 = r5.mo16277a()
            if (r14 != r13) goto L_0x02c0
        L_0x02b8:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$5$1 r14 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$5$1
            r14.<init>(r10, r15)
            r1.mo14893C(r14)
        L_0x02c0:
            r1.mo15002m0()
            r19 = r14
            kotlin.jvm.functions.l r19 = (kotlin.jvm.functions.C11300l) r19
            androidx.compose.foundation.text.m r13 = new androidx.compose.foundation.text.m
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.ui.text.input.p$a r14 = androidx.compose.p004ui.text.input.C16310p.f40516b
            int r24 = r14.mo47282g()
            r25 = 7
            r26 = 0
            r20 = r13
            r20.<init>(r21, r22, r23, r24, r25, r26)
            java.lang.String r4 = "ADDRESS_FIELD"
            java.lang.Object r9 = r3.get(r4)
            boolean r9 = r9 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            int r16 = r7 >> 9
            r11 = r16 & 14
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            r24 = 0
            r16 = r46
            r21 = r9
            r22 = r1
            r23 = r11
            m107063z(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r9 = -2082788382(0xffffffff83db2be2, float:-1.2881738E-36)
            r1.mo14918M(r9)
            java.lang.Object r4 = r3.get(r4)
            boolean r4 = r4 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            if (r4 == 0) goto L_0x0313
            r4 = 2131952928(0x7f130520, float:1.9542313E38)
            r9 = 0
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r1, r9)
            m107036c(r4, r1, r9)
            goto L_0x0314
        L_0x0313:
            r9 = 0
        L_0x0314:
            r1.mo15002m0()
            r4 = -2082788215(0xffffffff83db2c89, float:-1.2881888E-36)
            r1.mo14918M(r4)
            r0 = r0[r9]
            r9 = r49
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0385
            java.lang.Object r0 = r51.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0334
            int r0 = r0.size()
            goto L_0x0335
        L_0x0334:
            r0 = 0
        L_0x0335:
            if (r0 < r8) goto L_0x0385
            java.lang.Object r0 = r51.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0340
            goto L_0x0385
        L_0x0340:
            r4 = 60
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r11 = 220(0xdc, float:3.08E-43)
            float r11 = (float) r11
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10116p(r2, r4, r11)
            r17 = 0
            r4 = 8
            float r4 = (float) r4
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1 r4 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$6$1
            r4.<init>(r0, r15, r7)
            r26 = 6
            r27 = 254(0xfe, float:3.56E-43)
            r24 = r4
            r25 = r1
            androidx.compose.foundation.lazy.LazyDslKt.m10737b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
        L_0x0385:
            r1.mo15002m0()
            r0 = 2131952929(0x7f130521, float:1.9542315E38)
            r4 = 0
            java.lang.String r17 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r4)
            r0 = 142(0x8e, float:1.99E-43)
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r18 = androidx.compose.foundation.layout.SizeKt.m10092H(r2, r0)
            r19 = 0
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r21 = 0
            r22 = 0
            r23 = 13
            r24 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r18, r19, r20, r21, r22, r23, r24)
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$7 r4 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$7
            r11 = r47
            r4.<init>(r11, r15, r3)
            androidx.compose.ui.m r18 = androidx.compose.p004ui.focus.C15056b.m64690a(r0, r4)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r15)
            java.lang.Object r4 = r1.mo14921N()
            if (r0 != 0) goto L_0x03ce
            java.lang.Object r0 = r5.mo16277a()
            if (r4 != r0) goto L_0x03d6
        L_0x03ce:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$8$1 r4 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$8$1
            r4.<init>(r15)
            r1.mo14893C(r4)
        L_0x03d6:
            r1.mo15002m0()
            r19 = r4
            kotlin.jvm.functions.l r19 = (kotlin.jvm.functions.C11300l) r19
            androidx.compose.foundation.text.m r0 = new androidx.compose.foundation.text.m
            r21 = 0
            r22 = 0
            r23 = 0
            int r24 = r14.mo47282g()
            r25 = 7
            r26 = 0
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
            java.lang.String r4 = "POST_CODE_FIELD"
            java.lang.Object r13 = r3.get(r4)
            boolean r13 = r13 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            int r16 = r7 >> 12
            r8 = r16 & 14
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r24 = 0
            r16 = r47
            r21 = r13
            r22 = r1
            r23 = r8
            m107063z(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = -2082785680(0xffffffff83db3670, float:-1.2884161E-36)
            r1.mo14918M(r0)
            java.lang.Object r0 = r3.get(r4)
            boolean r0 = r0 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            if (r0 == 0) goto L_0x0427
            r0 = 2131952930(0x7f130522, float:1.9542317E38)
            r4 = 0
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r4)
            m107036c(r0, r1, r4)
            goto L_0x0428
        L_0x0427:
            r4 = 0
        L_0x0428:
            r1.mo15002m0()
            r0 = 2131952925(0x7f13051d, float:1.9542307E38)
            java.lang.String r17 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r4)
            r0 = 0
            r4 = 1
            r8 = 0
            androidx.compose.ui.m r18 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r0, r4, r8)
            r19 = 0
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r21 = 0
            r0 = 32
            float r0 = (float) r0
            float r22 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r23 = 5
            r24 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r18, r19, r20, r21, r22, r23, r24)
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$9 r2 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$9
            r6 = r48
            r2.<init>(r6, r15, r3)
            androidx.compose.ui.m r18 = androidx.compose.p004ui.focus.C15056b.m64690a(r0, r2)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r15)
            java.lang.Object r2 = r1.mo14921N()
            if (r0 != 0) goto L_0x0471
            java.lang.Object r0 = r5.mo16277a()
            if (r2 != r0) goto L_0x0479
        L_0x0471:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$10$1 r2 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$10$1
            r2.<init>(r15)
            r1.mo14893C(r2)
        L_0x0479:
            r1.mo15002m0()
            r19 = r2
            kotlin.jvm.functions.l r19 = (kotlin.jvm.functions.C11300l) r19
            androidx.compose.foundation.text.m r0 = new androidx.compose.foundation.text.m
            r21 = 0
            r22 = 0
            r23 = 0
            int r24 = r14.mo47282g()
            r25 = 7
            r26 = 0
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
            java.lang.String r2 = "CITY_FIELD"
            java.lang.Object r4 = r3.get(r2)
            boolean r4 = r4 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            int r5 = r7 >> 15
            r5 = r5 & 14
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r24 = 0
            r16 = r48
            r21 = r4
            r22 = r1
            r23 = r5
            m107063z(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r0 = r3.get(r2)
            boolean r0 = r0 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            if (r0 == 0) goto L_0x04c3
            r0 = 2131952926(0x7f13051e, float:1.9542309E38)
            r2 = 0
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r2)
            m107036c(r0, r1, r2)
        L_0x04c3:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x04cc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04cc:
            androidx.compose.runtime.t1 r13 = r1.mo15020s()
            if (r13 != 0) goto L_0x04d3
            goto L_0x04f2
        L_0x04d3:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$11 r14 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$11
            r0 = r14
            r1 = r43
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            r7 = r49
            r8 = r50
            r9 = r51
            r10 = r52
            r11 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.mo15202a(r14)
        L_0x04f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt.m107006A(boolean, androidx.compose.runtime.k2, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.l, androidx.compose.runtime.k2, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: B */
    public static final boolean m107007B(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: C */
    public static final void m107008C(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m107009D(boolean r47, boolean r48, kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r49, kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r50, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r51, boolean r52, androidx.compose.runtime.C8578k2<? extends com.carrefour.fid.android.shared.type.C28892e<kotlin.C11079d2>> r53, androidx.compose.runtime.C8592o r54, int r55) {
        /*
            r3 = r49
            r4 = r50
            r5 = r51
            r8 = r55
            r0 = -622982903(0xffffffffdade0909, float:-3.12486895E16)
            r1 = r54
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r8 & 14
            if (r2 != 0) goto L_0x0022
            r2 = r47
            boolean r7 = r1.mo14961b(r2)
            if (r7 == 0) goto L_0x001f
            r7 = 4
            goto L_0x0020
        L_0x001f:
            r7 = 2
        L_0x0020:
            r7 = r7 | r8
            goto L_0x0025
        L_0x0022:
            r2 = r47
            r7 = r8
        L_0x0025:
            r9 = r8 & 112(0x70, float:1.57E-43)
            r13 = r48
            if (r9 != 0) goto L_0x0037
            boolean r9 = r1.mo14961b(r13)
            if (r9 == 0) goto L_0x0034
            r9 = 32
            goto L_0x0036
        L_0x0034:
            r9 = 16
        L_0x0036:
            r7 = r7 | r9
        L_0x0037:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0047
            boolean r9 = r1.mo14927P(r3)
            if (r9 == 0) goto L_0x0044
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0046
        L_0x0044:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0046:
            r7 = r7 | r9
        L_0x0047:
            r9 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0057
            boolean r9 = r1.mo14927P(r4)
            if (r9 == 0) goto L_0x0054
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0056
        L_0x0054:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0056:
            r7 = r7 | r9
        L_0x0057:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r8
            if (r9 != 0) goto L_0x0069
            boolean r9 = r1.mo14927P(r5)
            if (r9 == 0) goto L_0x0066
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0068
        L_0x0066:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0068:
            r7 = r7 | r9
        L_0x0069:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r8
            r14 = r52
            if (r9 != 0) goto L_0x007c
            boolean r9 = r1.mo14961b(r14)
            if (r9 == 0) goto L_0x0079
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007b
        L_0x0079:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x007b:
            r7 = r7 | r9
        L_0x007c:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r8
            r11 = r53
            if (r9 != 0) goto L_0x008f
            boolean r9 = r1.mo15006n0(r11)
            if (r9 == 0) goto L_0x008c
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x008e
        L_0x008c:
            r9 = 524288(0x80000, float:7.34684E-40)
        L_0x008e:
            r7 = r7 | r9
        L_0x008f:
            r9 = 2995931(0x2db6db, float:4.198194E-39)
            r9 = r9 & r7
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r12) goto L_0x00a4
            boolean r9 = r1.mo15011p()
            if (r9 != 0) goto L_0x009f
            goto L_0x00a4
        L_0x009f:
            r1.mo14958a0()
            goto L_0x0575
        L_0x00a4:
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x00b0
            r9 = -1
            java.lang.String r12 = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.UserConsent (CreateLoyaltyCardStepTwoScreen.kt:604)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r9, r12)
        L_0x00b0:
            r0 = 2131952977(0x7f130551, float:1.9542412E38)
            r12 = 0
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r12)
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r6 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r16 = r0.mo11077c(r1, r6)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153890b(r16)
            com.carrefour.fid.android.design.theme.b r35 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r16 = r35.mo114257y()
            r36 = r12
            r11 = r16
            androidx.compose.ui.m$a r15 = androidx.compose.p004ui.C8767m.f23478j
            r13 = 0
            r14 = 1
            r10 = 0
            androidx.compose.ui.m r18 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r13, r14, r10)
            r19 = 0
            r10 = 32
            float r10 = (float) r10
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            r21 = 0
            r22 = 0
            r23 = 13
            r24 = 0
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.PaddingKt.m10028o(r18, r19, r20, r21, r22, r23, r24)
            r37 = r10
            r10 = r17
            r17 = 0
            r13 = r17
            r17 = 0
            r41 = r15
            r15 = r17
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 48
            r32 = 0
            r33 = 65528(0xfff8, float:9.1824E-41)
            r30 = r1
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            androidx.compose.ui.c$a r34 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r9 = r34.mo17070q()
            r15 = r41
            r12 = 0
            r13 = 0
            r14 = 1
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r12, r14, r13)
            r17 = 0
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r37)
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r11 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r11)
            androidx.compose.foundation.layout.Arrangement r38 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r11 = r38.mo7630p()
            r15 = 48
            androidx.compose.ui.layout.f0 r9 = androidx.compose.foundation.layout.RowKt.m10071d(r11, r9, r1, r15)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r11)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r1.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r39 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r14 = r39.mo44585a()
            kotlin.jvm.functions.q r10 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r10)
            androidx.compose.runtime.d r15 = r1.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x0186
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0186:
            r1.mo14938T()
            boolean r15 = r1.mo14997l()
            if (r15 == 0) goto L_0x0193
            r1.mo14947W(r14)
            goto L_0x0196
        L_0x0193:
            r1.mo14888A()
        L_0x0196:
            r1.mo14941U()
            androidx.compose.runtime.o r14 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r39.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r14, r9, r15)
            kotlin.jvm.functions.p r9 = r39.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r14, r11, r9)
            kotlin.jvm.functions.p r9 = r39.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r14, r12, r9)
            kotlin.jvm.functions.p r9 = r39.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r14, r13, r9)
            r1.mo14972e()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r9 = androidx.compose.runtime.C8684u1.m31905a(r9)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r36)
            r10.invoke(r9, r1, r11)
            r15 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r15)
            androidx.compose.foundation.layout.RowScopeInstance r9 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r14 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r14)
            boolean r9 = r1.mo15006n0(r4)
            java.lang.Object r10 = r1.mo14921N()
            if (r9 != 0) goto L_0x01eb
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r10 != r9) goto L_0x01f3
        L_0x01eb:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$1$1$1 r10 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$1$1$1
            r10.<init>(r4)
            r1.mo14893C(r10)
        L_0x01f3:
            r1.mo15002m0()
            r32 = r10
            kotlin.jvm.functions.l r32 = (kotlin.jvm.functions.C11300l) r32
            r33 = 0
            r42 = 0
            r43 = 0
            androidx.compose.material.q1 r44 = androidx.compose.material.C7903q1.f18967a
            r9 = r44
            long r10 = r35.mo114218O()
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13 = 693286680(0x2952b718, float:4.6788176E-14)
            r16 = 0
            r12 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r45 = r41
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 0
            int r40 = androidx.compose.material.C7903q1.f18968b
            r30 = r40
            r31 = 1022(0x3fe, float:1.432E-42)
            r28 = r1
            androidx.compose.material.p1 r14 = r9.mo10989a(r10, r12, r14, r15, r17, r19, r20, r22, r24, r26, r28, r29, r30, r31)
            int r9 = r7 >> 3
            r16 = r9 & 14
            r17 = 28
            r9 = r48
            r10 = r32
            r11 = r33
            r12 = r42
            r13 = r43
            r15 = r1
            androidx.compose.material.SwitchKt.m14058a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = 2131952974(0x7f13054e, float:1.9542406E38)
            r15 = r36
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r9, r1, r15)
            androidx.compose.material.w1 r10 = r0.mo11077c(r1, r6)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153904p(r10)
            long r11 = r35.mo114257y()
            r10 = 0
            r13 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 0
            r32 = 0
            r33 = 65530(0xfffa, float:9.1827E-41)
            r30 = r1
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            androidx.compose.ui.c$c r9 = r34.mo17070q()
            r15 = r45
            r12 = 0
            r13 = 0
            r14 = 1
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r12, r14, r13)
            r17 = 0
            r10 = 16
            float r10 = (float) r10
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            androidx.compose.ui.m r11 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r12 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r12)
            androidx.compose.foundation.layout.Arrangement$d r12 = r38.mo7630p()
            r13 = 48
            androidx.compose.ui.layout.f0 r9 = androidx.compose.foundation.layout.RowKt.m10071d(r12, r9, r1, r13)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r12)
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r1.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p004ui.unit.LayoutDirection) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            kotlin.jvm.functions.a r2 = r39.mo44585a()
            kotlin.jvm.functions.q r11 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r11)
            androidx.compose.runtime.d r4 = r1.mo15017r()
            boolean r4 = r4 instanceof androidx.compose.runtime.C8428d
            if (r4 != 0) goto L_0x02f9
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02f9:
            r1.mo14938T()
            boolean r4 = r1.mo14997l()
            if (r4 == 0) goto L_0x0306
            r1.mo14947W(r2)
            goto L_0x0309
        L_0x0306:
            r1.mo14888A()
        L_0x0309:
            r1.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r4 = r39.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r9, r4)
            kotlin.jvm.functions.p r4 = r39.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r12, r4)
            kotlin.jvm.functions.p r4 = r39.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r13, r4)
            kotlin.jvm.functions.p r4 = r39.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r14, r4)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r36)
            r11.invoke(r2, r1, r4)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r2)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r2)
            boolean r4 = r1.mo15006n0(r3)
            java.lang.Object r9 = r1.mo14921N()
            if (r4 != 0) goto L_0x035c
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r9 != r4) goto L_0x0364
        L_0x035c:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$2$1$1 r9 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$2$1$1
            r9.<init>(r3)
            r1.mo14893C(r9)
        L_0x0364:
            r1.mo15002m0()
            r4 = r9
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            r32 = 0
            r33 = 0
            r34 = 0
            long r11 = r35.mo114218O()
            r39 = r10
            r10 = r11
            r12 = 0
            r9 = 0
            r14 = 0
            r16 = 0
            r2 = r14
            r14 = r16
            r16 = 0
            r46 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 0
            r31 = 1022(0x3fe, float:1.432E-42)
            r9 = r44
            r28 = r1
            r30 = r40
            androidx.compose.material.p1 r14 = r9.mo10989a(r10, r12, r14, r15, r17, r19, r20, r22, r24, r26, r28, r29, r30, r31)
            r16 = r7 & 14
            r17 = 28
            r9 = r47
            r10 = r4
            r11 = r32
            r12 = r33
            r13 = r34
            r15 = r1
            androidx.compose.material.SwitchKt.m14058a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4 = 2131952975(0x7f13054f, float:1.9542408E38)
            r15 = r36
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r1, r15)
            androidx.compose.material.w1 r4 = r0.mo11077c(r1, r6)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153904p(r4)
            long r11 = r35.mo114257y()
            r10 = 0
            r13 = 0
            r4 = 0
            r2 = r15
            r15 = r4
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 0
            r32 = 0
            r33 = 65530(0xfffa, float:9.1827E-41)
            r30 = r1
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r4 = 2131952976(0x7f130550, float:1.954241E38)
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r1, r2)
            long r10 = r35.mo114257y()
            androidx.compose.ui.text.font.u r17 = com.carrefour.fid.android.design.theme.C37477d.m153883J()
            androidx.compose.ui.text.font.i0$a r30 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r14 = r30.mo46952m()
            r31 = 12
            long r12 = androidx.compose.p004ui.unit.C16506u.m74712m(r31)
            androidx.compose.ui.text.c0 r15 = new androidx.compose.ui.text.c0
            r9 = r15
            r2 = r15
            r15 = r16
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 16344(0x3fd8, float:2.2903E-41)
            r29 = 0
            r9.<init>((long) r10, (long) r12, (androidx.compose.p004ui.text.font.C16209i0) r14, (androidx.compose.p004ui.text.font.C16190e0) r15, (androidx.compose.p004ui.text.font.C16194f0) r16, (androidx.compose.p004ui.text.font.C16242u) r17, (java.lang.String) r18, (long) r19, (androidx.compose.p004ui.text.style.C16410a) r21, (androidx.compose.p004ui.text.style.C16439m) r22, (androidx.compose.p004ui.text.intl.C16342f) r23, (long) r24, (androidx.compose.p004ui.text.style.C16434j) r26, (androidx.compose.p004ui.graphics.C15205e4) r27, (int) r28, (kotlin.jvm.internal.DefaultConstructorMarker) r29)
            r9 = 4
            r10 = 0
            androidx.compose.ui.text.d r2 = androidx.compose.p004ui.text.AnnotatedStringKt.m72244c(r4, r2, r10, r9, r10)
            r4 = 2131952973(0x7f13054d, float:1.9542404E38)
            r9 = 0
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r1, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = " "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            long r10 = r35.mo114218O()
            androidx.compose.ui.text.font.u r17 = com.carrefour.fid.android.design.theme.C37477d.m153883J()
            androidx.compose.ui.text.font.i0 r14 = r30.mo46947c()
            long r12 = androidx.compose.p004ui.unit.C16506u.m74712m(r31)
            androidx.compose.ui.text.c0 r15 = new androidx.compose.ui.text.c0
            r9 = r15
            r3 = r15
            r15 = r16
            r9.<init>((long) r10, (long) r12, (androidx.compose.p004ui.text.font.C16209i0) r14, (androidx.compose.p004ui.text.font.C16190e0) r15, (androidx.compose.p004ui.text.font.C16194f0) r16, (androidx.compose.p004ui.text.font.C16242u) r17, (java.lang.String) r18, (long) r19, (androidx.compose.p004ui.text.style.C16410a) r21, (androidx.compose.p004ui.text.style.C16439m) r22, (androidx.compose.p004ui.text.intl.C16342f) r23, (long) r24, (androidx.compose.p004ui.text.style.C16434j) r26, (androidx.compose.p004ui.graphics.C15205e4) r27, (int) r28, (kotlin.jvm.internal.DefaultConstructorMarker) r29)
            r9 = 4
            r10 = 0
            androidx.compose.ui.text.d r3 = androidx.compose.p004ui.text.AnnotatedStringKt.m72244c(r4, r3, r10, r9, r10)
            androidx.compose.ui.text.d r9 = r2.mo46688n(r3)
            r2 = r46
            r3 = 1
            r4 = 0
            androidx.compose.ui.m r11 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r4, r3, r10)
            r12 = 0
            r3 = 24
            float r3 = (float) r3
            float r13 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            r14 = 0
            r15 = 0
            r16 = 13
            r17 = 0
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r11, r12, r13, r14, r15, r16, r17)
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r32 = 48
            r33 = 0
            r34 = 262140(0x3fffc, float:3.67336E-40)
            r31 = r1
            androidx.compose.material.TextKt.m14197d(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3 = 2131952980(0x7f130554, float:1.9542418E38)
            r9 = 0
            java.lang.String r14 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r1, r9)
            r19 = 0
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r37)
            r21 = 0
            r22 = 0
            r23 = 13
            r24 = 0
            r18 = r2
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r18, r19, r20, r21, r22, r23, r24)
            r9 = 1
            r10 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r4, r9, r10)
            r9 = 40
            float r9 = (float) r9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r9)
            java.lang.Object r3 = r53.getValue()
            boolean r15 = r3 instanceof com.carrefour.fid.android.shared.type.C28892e.C28894b
            r3 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r3)
            boolean r3 = r1.mo15006n0(r5)
            java.lang.Object r10 = r1.mo14921N()
            if (r3 != 0) goto L_0x04fa
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r10 != r3) goto L_0x0502
        L_0x04fa:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$3$1 r10 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$3$1
            r10.<init>(r5)
            r1.mo14893C(r10)
        L_0x0502:
            r1.mo15002m0()
            kotlin.jvm.functions.a r10 = (kotlin.jvm.functions.C11289a) r10
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            int r3 = r7 << 9
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r7
            r19 = r3 | 6
            r20 = 156(0x9c, float:2.19E-43)
            r17 = r52
            r18 = r1
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151339f(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 2131952979(0x7f130553, float:1.9542416E38)
            r7 = 0
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r1, r7)
            androidx.compose.material.w1 r0 = r0.mo11077c(r1, r6)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r0)
            long r11 = r35.mo114257y()
            r0 = 1
            r3 = 0
            androidx.compose.ui.m r13 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r4, r0, r3)
            r14 = 0
            float r15 = androidx.compose.p004ui.unit.C16483g.m74435M(r39)
            r16 = 0
            r17 = 0
            r18 = 13
            r19 = 0
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r13, r14, r15, r16, r17, r18, r19)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 48
            r32 = 0
            r33 = 65528(0xfff8, float:9.1824E-41)
            r30 = r1
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0575
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0575:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x057c
            goto L_0x0595
        L_0x057c:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$4 r10 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserConsent$4
            r0 = r10
            r1 = r47
            r2 = r48
            r3 = r49
            r4 = r50
            r5 = r51
            r6 = r52
            r7 = r53
            r8 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x0595:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt.m107009D(boolean, boolean, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a, boolean, androidx.compose.runtime.k2, androidx.compose.runtime.o, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m107010E(java.lang.String r63, java.lang.String r64, kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r65, kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r66, android.app.DatePickerDialog r67, java.util.Map<java.lang.String, ? extends com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b> r68, kotlin.jvm.functions.C11304p<? super java.lang.String, ? super com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b, kotlin.C11079d2> r69, androidx.compose.runtime.C8592o r70, int r71) {
        /*
            r3 = r65
            r4 = r66
            r5 = r67
            r6 = r68
            r7 = r69
            r8 = r71
            r0 = 1621498948(0x60a61c44, float:9.575613E19)
            r1 = r70
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0021
            r2 = -1
            java.lang.String r9 = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.UserInformationField (CreateLoyaltyCardStepTwoScreen.kt:254)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r2, r9)
        L_0x0021:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r0)
            java.lang.Object r0 = r1.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r2.mo16277a()
            if (r0 != r9) goto L_0x003a
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r1.mo14893C(r0)
        L_0x003a:
            r1.mo15002m0()
            androidx.compose.foundation.interaction.g r0 = (androidx.compose.foundation.interaction.C2243g) r0
            r9 = 6
            androidx.compose.runtime.k2 r34 = androidx.compose.foundation.interaction.PressInteractionKt.m9677a(r0, r1, r9)
            r9 = 2131953068(0x7f1305ac, float:1.9542597E38)
            r15 = 0
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r9, r1, r15)
            r10 = 2131099826(0x7f0600b2, float:1.7812016E38)
            long r11 = androidx.compose.p004ui.res.C16009b.m71825a(r10, r1, r15)
            androidx.compose.material.t0 r10 = androidx.compose.material.C7933t0.f19075a
            int r13 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r10 = r10.mo11077c(r1, r13)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153885L(r10)
            androidx.compose.ui.m$a r13 = androidx.compose.p004ui.C8767m.f23478j
            r14 = 0
            r10 = 1
            r15 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r13, r14, r10, r15)
            r10 = r16
            r16 = 0
            r58 = r13
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 48
            r32 = 0
            r33 = 65528(0xfff8, float:9.1824E-41)
            r30 = r1
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r9 = -1292793388(0xffffffffb2f189d4, float:-2.811877E-8)
            r1.mo14918M(r9)
            java.lang.Object r9 = r34.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00d6
            if (r5 == 0) goto L_0x00d6
            r67.show()
            r9 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r9)
            boolean r9 = r1.mo15006n0(r3)
            java.lang.Object r10 = r1.mo14921N()
            if (r9 != 0) goto L_0x00c1
            java.lang.Object r9 = r2.mo16277a()
            if (r10 != r9) goto L_0x00c9
        L_0x00c1:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$1$1 r10 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$1$1
            r10.<init>(r3)
            r1.mo14893C(r10)
        L_0x00c9:
            r1.mo15002m0()
            kotlin.jvm.functions.r r10 = (kotlin.jvm.functions.C11306r) r10
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.a r9 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.a
            r9.<init>(r10)
            r5.setOnDateSetListener(r9)
        L_0x00d6:
            r1.mo15002m0()
            r14 = r58
            r12 = 0
            r13 = 1
            r15 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r12, r13, r15)
            r17 = 0
            r9 = 40
            float r10 = (float) r9
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$2 r11 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$2
            r14 = r63
            r11.<init>(r14, r7, r6)
            androidx.compose.ui.m r57 = androidx.compose.p004ui.focus.C15056b.m64690a(r9, r11)
            r9 = 8
            float r9 = (float) r9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            androidx.compose.foundation.shape.n r59 = androidx.compose.foundation.shape.C2694o.m12166h(r9)
            androidx.compose.material.TextFieldDefaults r9 = androidx.compose.material.TextFieldDefaults.f7961a
            com.carrefour.fid.android.design.theme.b r11 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r20 = r11.mo114218O()
            long r22 = r11.mo114204A()
            long r40 = r11.mo114218O()
            long r42 = r11.mo114205B()
            long r16 = r11.mo114218O()
            long r26 = r11.mo114227X()
            long r46 = r11.mo114227X()
            r18 = 0
            r60 = r10
            r10 = r18
            r12 = r18
            r61 = r58
            r14 = r18
            r24 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r44 = 0
            r48 = 0
            r50 = 0
            r53 = 0
            r54 = 0
            r55 = 48
            r56 = 1736343(0x1a7e97, float:2.433135E-39)
            r52 = r1
            androidx.compose.material.s1 r28 = r9.mo10637l(r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54, r55, r56)
            java.lang.String r11 = "BIRTHDAY_FIELD"
            java.lang.Object r9 = r6.get(r11)
            boolean r9 = r9 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24393c
            if (r9 != 0) goto L_0x0172
            java.lang.Object r9 = r6.get(r11)
            boolean r9 = r9 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            if (r9 == 0) goto L_0x016f
            goto L_0x0172
        L_0x016f:
            r19 = 0
            goto L_0x0174
        L_0x0172:
            r19 = 1
        L_0x0174:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$3 r10 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$3.f60844f
            r12 = 0
            r13 = 1
            r14 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.ComposableSingletons$CreateLoyaltyCardStepTwoScreenKt r9 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.ComposableSingletons$CreateLoyaltyCardStepTwoScreenKt.f60824a
            kotlin.jvm.functions.p r15 = r9.mo71268a()
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r9 = r8 & 14
            r26 = 1597488(0x186030, float:2.238557E-39)
            r30 = r9 | r26
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            r32 = 129960(0x1fba8, float:1.82113E-40)
            r9 = r63
            r62 = r11
            r11 = r57
            r26 = r0
            r27 = r59
            r29 = r1
            androidx.compose.material.OutlinedTextFieldKt.m13660c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0 = r62
            java.lang.Object r9 = r6.get(r0)
            boolean r9 = r9 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24393c
            if (r9 == 0) goto L_0x01cb
            r0 = -1292791289(0xffffffffb2f19207, float:-2.8122498E-8)
            r1.mo14918M(r0)
            r0 = 2131952944(0x7f130530, float:1.9542345E38)
            r15 = 0
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r15)
            m107036c(r0, r1, r15)
            r1.mo15002m0()
            goto L_0x01ee
        L_0x01cb:
            r15 = 0
            java.lang.Object r0 = r6.get(r0)
            boolean r0 = r0 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            if (r0 == 0) goto L_0x01e5
            r0 = -1292791103(0xffffffffb2f192c1, float:-2.8122829E-8)
            r1.mo14918M(r0)
            r0 = 2131952945(0x7f130531, float:1.9542347E38)
            java.lang.String r0 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r15)
            m107036c(r0, r1, r15)
            goto L_0x01eb
        L_0x01e5:
            r0 = -1292791022(0xffffffffb2f19312, float:-2.8122972E-8)
            r1.mo14918M(r0)
        L_0x01eb:
            r1.mo15002m0()
        L_0x01ee:
            r0 = 2131953043(0x7f130593, float:1.9542546E38)
            java.lang.String r10 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r15)
            r0 = r61
            r9 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r11, r12, r9)
            r17 = 0
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r60)
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$4 r9 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$4
            r14 = r64
            r9.<init>(r14, r7, r6)
            androidx.compose.ui.m r11 = androidx.compose.p004ui.focus.C15056b.m64690a(r0, r9)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r4)
            boolean r9 = r1.mo15006n0(r7)
            r0 = r0 | r9
            java.lang.Object r9 = r1.mo14921N()
            if (r0 != 0) goto L_0x0236
            java.lang.Object r0 = r2.mo16277a()
            if (r9 != r0) goto L_0x023e
        L_0x0236:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$5$1 r9 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$5$1
            r9.<init>(r4, r7)
            r1.mo14893C(r9)
        L_0x023e:
            r1.mo15002m0()
            r0 = r9
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            androidx.compose.foundation.text.m r13 = new androidx.compose.foundation.text.m
            r17 = 0
            r18 = 0
            androidx.compose.ui.text.input.a0$a r2 = androidx.compose.p004ui.text.input.C16273a0.f40446b
            int r19 = r2.mo47158m()
            androidx.compose.ui.text.input.p$a r2 = androidx.compose.p004ui.text.input.C16310p.f40516b
            int r20 = r2.mo47282g()
            r21 = 3
            r22 = 0
            r16 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = "PHONE_NUMBER_FIELD"
            java.lang.Object r9 = r6.get(r2)
            boolean r9 = r9 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24393c
            if (r9 != 0) goto L_0x0275
            java.lang.Object r9 = r6.get(r2)
            boolean r9 = r9 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            if (r9 == 0) goto L_0x0272
            goto L_0x0275
        L_0x0272:
            r16 = r15
            goto L_0x0277
        L_0x0275:
            r16 = r12
        L_0x0277:
            int r9 = r8 >> 3
            r9 = r9 & 14
            r12 = r9 | 24576(0x6000, float:3.4438E-41)
            r17 = 0
            r9 = r64
            r18 = r12
            r12 = r0
            r14 = r16
            r0 = r15
            r15 = r1
            r16 = r18
            m107063z(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r9 = r6.get(r2)
            boolean r9 = r9 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24393c
            if (r9 == 0) goto L_0x02a9
            r2 = -1292789380(0xffffffffb2f1997c, float:-2.812589E-8)
            r1.mo14918M(r2)
            r2 = 2131953044(0x7f130594, float:1.9542548E38)
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r1, r0)
            m107036c(r2, r1, r0)
            r1.mo15002m0()
            goto L_0x02cb
        L_0x02a9:
            java.lang.Object r2 = r6.get(r2)
            boolean r2 = r2 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24392b
            if (r2 == 0) goto L_0x02c2
            r2 = -1292789193(0xffffffffb2f19a37, float:-2.8126221E-8)
            r1.mo14918M(r2)
            r2 = 2131953045(0x7f130595, float:1.954255E38)
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r1, r0)
            m107036c(r2, r1, r0)
            goto L_0x02c8
        L_0x02c2:
            r0 = -1292789113(0xffffffffb2f19a87, float:-2.8126363E-8)
            r1.mo14918M(r0)
        L_0x02c8:
            r1.mo15002m0()
        L_0x02cb:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02d4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02d4:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x02db
            goto L_0x02f4
        L_0x02db:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$6 r10 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$6
            r0 = r10
            r1 = r63
            r2 = r64
            r3 = r65
            r4 = r66
            r5 = r67
            r6 = r68
            r7 = r69
            r8 = r71
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x02f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt.m107010E(java.lang.String, java.lang.String, kotlin.jvm.functions.l, kotlin.jvm.functions.l, android.app.DatePickerDialog, java.util.Map, kotlin.jvm.functions.p, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: F */
    public static final void m107011F(C11306r rVar, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(rVar, "$tmp0");
        rVar.invoke(datePicker, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m107034b(@C12579k DQEAddressModel dQEAddressModel, @C12579k C11300l<? super DQEAddressModel, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        DQEAddressModel dQEAddressModel2 = dQEAddressModel;
        C11300l<? super DQEAddressModel, C11079d2> lVar2 = lVar;
        int i5 = i;
        Intrinsics.checkNotNullParameter(dQEAddressModel2, "addressSuggested");
        Intrinsics.checkNotNullParameter(lVar2, "onClick");
        C8592o o = oVar.mo15009o(1445413796);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(dQEAddressModel2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1445413796, i5, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.AddressListItem (CreateLoyaltyCardStepTwoScreen.kt:744)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 16;
            C8767m e = ClickableKt.m8878e(PaddingKt.m10025l(BackgroundKt.m8825d(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), C16483g.m74435M(f), C16483g.m74435M((float) 8)), false, (String) null, (C16031g) null, new CreateLoyaltyCardStepTwoScreenKt$AddressListItem$1(lVar2, dQEAddressModel2), 7, (Object) null);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8734c.C8737c q = aVar2.mo17070q();
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2269d p = arrangement.mo7630p();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(p, q, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(e);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            Painter d2 = C16015f.m71849d(R.drawable.ds_ic_map_annotation, o, 0);
            C15249k2.C15250a aVar3 = C15249k2.f37569b;
            C37475b bVar = C37475b.f94185a;
            ImageKt.m8967b(d2, (String) null, (C8767m) null, (C8734c) null, (C15541c) null, 0.0f, C15249k2.C15250a.m66144d(aVar3, bVar.mo114258z(), 0, 2, (Object) null), o, 56, 60);
            C8767m o2 = PaddingKt.m10028o(aVar, C16483g.m74435M(f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b2 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(o2);
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
            Updater.m30188j(b3, b2, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            o.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            String j = dQEAddressModel.mo31628j();
            C7933t0 t0Var = C7933t0.f19075a;
            int i6 = C7933t0.f19076b;
            float f4 = f;
            C8592o oVar3 = o;
            C8592o oVar4 = oVar3;
            TextKt.m14196c(j, (C8767m) null, bVar.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(t0Var.mo11077c(o, i6)), oVar4, 0, 0, 65530);
            TextKt.m14196c(dQEAddressModel.mo31634p() + " " + dQEAddressModel.mo31629k(), (C8767m) null, bVar.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(t0Var.mo11077c(oVar3, i6)), oVar4, 0, 0, 65530);
            oVar3.mo15002m0();
            oVar3.mo14896D();
            oVar3.mo15002m0();
            oVar3.mo15002m0();
            oVar2 = oVar3;
            C2428y0.m10726a(C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), oVar2, 0);
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ds_ic_chevron_right, oVar2, 0), (String) null, SizeKt.m10115o(SizeKt.m10092H(aVar, C16483g.m74435M(f4)), C16483g.m74435M(f4)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar2, 440, 120);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CreateLoyaltyCardStepTwoScreenKt$AddressListItem$3(dQEAddressModel, lVar2, i5));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m107036c(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(70397403);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(str2)) {
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
                ComposerKt.m29845w0(70397403, i2, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.ErrorText (CreateLoyaltyCardStepTwoScreen.kt:735)");
            }
            oVar2 = o;
            TextKt.m14196c(str, PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 8), 0.0f, 0.0f, 13, (Object) null), C37475b.f94185a.mo114227X(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, (i2 & 14) | 48, 0, 131064);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CreateLoyaltyCardStepTwoScreenKt$ErrorText$1(str, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m107038d(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r45, @org.jetbrains.annotations.C12580l android.app.DatePickerDialog r46, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r47, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel, kotlin.C11079d2> r48, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r49, int r50, int r51) {
        /*
            r3 = r47
            r14 = r48
            java.lang.String r0 = "viewModel"
            r1 = r45
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "fetchSuggestedAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "onValidateUserInformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1577578889(0xffffffffa1f80e77, float:-1.6808962E-18)
            r2 = r49
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r4 = r51 & 2
            r5 = 0
            if (r4 == 0) goto L_0x0026
            r27 = r5
            goto L_0x0028
        L_0x0026:
            r27 = r46
        L_0x0028:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x0037
            r4 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.LoyaltyPersonalInfoStateful (CreateLoyaltyCardStepTwoScreen.kt:111)"
            r13 = r50
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r13, r4, r6)
            goto L_0x0039
        L_0x0037:
            r13 = r50
        L_0x0039:
            r0 = 0
            r15 = 1
            androidx.compose.foundation.ScrollState r7 = androidx.compose.foundation.ScrollKt.m9056c(r0, r2, r0, r15)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r4)
            java.lang.Object r6 = r2.mo14921N()
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r8.mo16277a()
            r28 = 4
            r29 = 3
            r12 = 5
            r11 = 2
            if (r6 != r9) goto L_0x008a
            kotlin.Pair[] r6 = new kotlin.Pair[r12]
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.b$d r9 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24394d.f60855a
            java.lang.String r10 = "BIRTHDAY_FIELD"
            kotlin.Pair r10 = kotlin.C11078d1.m42659a(r10, r9)
            r6[r0] = r10
            java.lang.String r10 = "PHONE_NUMBER_FIELD"
            kotlin.Pair r10 = kotlin.C11078d1.m42659a(r10, r9)
            r6[r15] = r10
            java.lang.String r10 = "ADDRESS_FIELD"
            kotlin.Pair r10 = kotlin.C11078d1.m42659a(r10, r9)
            r6[r11] = r10
            java.lang.String r10 = "POST_CODE_FIELD"
            kotlin.Pair r10 = kotlin.C11078d1.m42659a(r10, r9)
            r6[r29] = r10
            java.lang.String r10 = "CITY_FIELD"
            kotlin.Pair r9 = kotlin.C11078d1.m42659a(r10, r9)
            r6[r28] = r9
            androidx.compose.runtime.snapshots.t r6 = androidx.compose.runtime.C8415c2.m30240i(r6)
            r2.mo14893C(r6)
        L_0x008a:
            r2.mo15002m0()
            r10 = r6
            androidx.compose.runtime.snapshots.t r10 = (androidx.compose.runtime.snapshots.C8667t) r10
            r2.mo14918M(r4)
            java.lang.Object r6 = r2.mo14921N()
            java.lang.Object r9 = r8.mo16277a()
            java.lang.String r16 = ""
            if (r6 != r9) goto L_0x00b6
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r6 = r45.getInitialAddress()
            if (r6 == 0) goto L_0x00aa
            java.lang.String r6 = r6.mo117844k()
            goto L_0x00ab
        L_0x00aa:
            r6 = r5
        L_0x00ab:
            if (r6 != 0) goto L_0x00af
            r6 = r16
        L_0x00af:
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r6, r5, r11, r5)
            r2.mo14893C(r6)
        L_0x00b6:
            r2.mo15002m0()
            r9 = r6
            androidx.compose.runtime.z0 r9 = (androidx.compose.runtime.C8700z0) r9
            r2.mo14918M(r4)
            java.lang.Object r6 = r2.mo14921N()
            java.lang.Object r12 = r8.mo16277a()
            if (r6 != r12) goto L_0x00f2
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = r45.getAccountInfo()
            if (r6 == 0) goto L_0x00db
            com.carrefour.fid.android.domain.models.account.Phone r6 = com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57649h(r6)
            if (r6 == 0) goto L_0x00db
            java.lang.String r6 = r6.mo116741e()
            if (r6 != 0) goto L_0x00eb
        L_0x00db:
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r6 = r45.getInitialAddress()
            if (r6 == 0) goto L_0x00e6
            java.lang.String r6 = r6.mo117848o()
            goto L_0x00e7
        L_0x00e6:
            r6 = r5
        L_0x00e7:
            if (r6 != 0) goto L_0x00eb
            r6 = r16
        L_0x00eb:
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r6, r5, r11, r5)
            r2.mo14893C(r6)
        L_0x00f2:
            r2.mo15002m0()
            r12 = r6
            androidx.compose.runtime.z0 r12 = (androidx.compose.runtime.C8700z0) r12
            r2.mo14918M(r4)
            java.lang.Object r6 = r2.mo14921N()
            java.lang.Object r0 = r8.mo16277a()
            if (r6 != r0) goto L_0x010e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r0, r5, r11, r5)
            r2.mo14893C(r6)
        L_0x010e:
            r2.mo15002m0()
            r21 = r6
            androidx.compose.runtime.z0 r21 = (androidx.compose.runtime.C8700z0) r21
            r2.mo14918M(r4)
            java.lang.Object r0 = r2.mo14921N()
            java.lang.Object r6 = r8.mo16277a()
            if (r0 != r6) goto L_0x013f
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r0 = r45.getInitialAddress()
            if (r0 == 0) goto L_0x0133
            com.carrefour.fid.android.domain.models.account.Address r0 = r0.mo117843j()
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = r0.mo116677B()
            goto L_0x0134
        L_0x0133:
            r0 = r5
        L_0x0134:
            if (r0 != 0) goto L_0x0138
            r0 = r16
        L_0x0138:
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r5, r11, r5)
            r2.mo14893C(r0)
        L_0x013f:
            r2.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            r2.mo14918M(r4)
            java.lang.Object r6 = r2.mo14921N()
            java.lang.Object r15 = r8.mo16277a()
            if (r6 != r15) goto L_0x016e
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r6 = r45.getInitialAddress()
            if (r6 == 0) goto L_0x0162
            com.carrefour.fid.android.domain.models.account.Address r6 = r6.mo117843j()
            if (r6 == 0) goto L_0x0162
            java.lang.String r6 = r6.mo116694S()
            goto L_0x0163
        L_0x0162:
            r6 = r5
        L_0x0163:
            if (r6 != 0) goto L_0x0167
            r6 = r16
        L_0x0167:
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r6, r5, r11, r5)
            r2.mo14893C(r6)
        L_0x016e:
            r2.mo15002m0()
            r30 = r6
            androidx.compose.runtime.z0 r30 = (androidx.compose.runtime.C8700z0) r30
            r2.mo14918M(r4)
            java.lang.Object r6 = r2.mo14921N()
            java.lang.Object r15 = r8.mo16277a()
            if (r6 != r15) goto L_0x019f
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r6 = r45.getInitialAddress()
            if (r6 == 0) goto L_0x0193
            com.carrefour.fid.android.domain.models.account.Address r6 = r6.mo117843j()
            if (r6 == 0) goto L_0x0193
            java.lang.String r6 = r6.mo116684I()
            goto L_0x0194
        L_0x0193:
            r6 = r5
        L_0x0194:
            if (r6 != 0) goto L_0x0198
            r6 = r16
        L_0x0198:
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r6, r5, r11, r5)
            r2.mo14893C(r6)
        L_0x019f:
            r2.mo15002m0()
            r31 = r6
            androidx.compose.runtime.z0 r31 = (androidx.compose.runtime.C8700z0) r31
            r2.mo14918M(r4)
            java.lang.Object r6 = r2.mo14921N()
            java.lang.Object r15 = r8.mo16277a()
            if (r6 != r15) goto L_0x01ce
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r6 = r45.getInitialAddress()
            if (r6 == 0) goto L_0x01c5
            com.carrefour.fid.android.domain.models.account.Address r6 = r6.mo117843j()
            if (r6 == 0) goto L_0x01c5
            java.lang.String r6 = r6.mo116685J()
            if (r6 != 0) goto L_0x01c7
        L_0x01c5:
            java.lang.String r6 = "FRANCE"
        L_0x01c7:
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r6, r5, r11, r5)
            r2.mo14893C(r6)
        L_0x01ce:
            r2.mo15002m0()
            r32 = r6
            androidx.compose.runtime.z0 r32 = (androidx.compose.runtime.C8700z0) r32
            kotlinx.coroutines.flow.j r6 = r45.getBillingAddressStateFlow()
            r15 = 8
            r11 = 1
            androidx.compose.runtime.k2 r33 = androidx.compose.runtime.C8415c2.m30233b(r6, r5, r2, r15, r11)
            kotlinx.coroutines.flow.j r6 = r45.getSuggestedAddressList()
            androidx.compose.runtime.k2 r34 = androidx.compose.runtime.C8415c2.m30233b(r6, r5, r2, r15, r11)
            kotlinx.coroutines.flow.j r6 = r45.getLoyaltyCardCreatedResult()
            androidx.compose.runtime.k2 r35 = androidx.compose.runtime.C8415c2.m30233b(r6, r5, r2, r15, r11)
            r2.mo14918M(r4)
            java.lang.Object r6 = r2.mo14921N()
            java.lang.Object r11 = r8.mo16277a()
            if (r6 != r11) goto L_0x0208
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r11 = 2
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r6, r5, r11, r5)
            r2.mo14893C(r6)
            goto L_0x0209
        L_0x0208:
            r11 = 2
        L_0x0209:
            r2.mo15002m0()
            androidx.compose.runtime.z0 r6 = (androidx.compose.runtime.C8700z0) r6
            r2.mo14918M(r4)
            java.lang.Object r15 = r2.mo14921N()
            java.lang.Object r4 = r8.mo16277a()
            if (r15 != r4) goto L_0x0224
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r15 = androidx.compose.runtime.C8539f2.m30981g(r4, r5, r11, r5)
            r2.mo14893C(r15)
        L_0x0224:
            r2.mo15002m0()
            androidx.compose.runtime.z0 r15 = (androidx.compose.runtime.C8700z0) r15
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r4)
            java.lang.Object r4 = r2.mo14921N()
            java.lang.Object r8 = r8.mo16277a()
            if (r4 != r8) goto L_0x024f
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r4 = r45.getInitialAddress()
            if (r4 == 0) goto L_0x0241
            r4 = 1
            goto L_0x0242
        L_0x0241:
            r4 = 0
        L_0x0242:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r11 = 2
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r5, r11, r5)
            r2.mo14893C(r4)
            goto L_0x0250
        L_0x024f:
            r11 = 2
        L_0x0250:
            r2.mo15002m0()
            androidx.compose.runtime.z0 r4 = (androidx.compose.runtime.C8700z0) r4
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x025d
        L_0x025b:
            r8 = 1
            goto L_0x027d
        L_0x025d:
            java.util.Set r8 = r10.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0265:
            boolean r16 = r8.hasNext()
            if (r16 == 0) goto L_0x025b
            java.lang.Object r16 = r8.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r11 = r16.getValue()
            boolean r11 = r11 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b.C24395e
            if (r11 != 0) goto L_0x027b
            r8 = 0
            goto L_0x027d
        L_0x027b:
            r11 = 2
            goto L_0x0265
        L_0x027d:
            m107057t(r4, r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71012j()
            java.lang.Object r8 = r2.mo15032w(r8)
            r11 = r8
            androidx.compose.ui.focus.j r11 = (androidx.compose.p004ui.focus.C15068j) r11
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 0
            r16 = r12
            r12 = 1
            androidx.compose.ui.m r37 = androidx.compose.foundation.layout.SizeKt.m10112l(r8, r1, r12, r5)
            androidx.compose.ui.graphics.j2$a r1 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r38 = r1.mo42852w()
            r40 = 0
            r41 = 2
            r42 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.BackgroundKt.m8825d(r37, r38, r40, r41, r42)
            r8 = 16
            float r8 = (float) r8
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            r12 = 24
            float r12 = (float) r12
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r12)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10025l(r1, r8, r12)
            r8 = 0
            r12 = 0
            r18 = 0
            r19 = 14
            r20 = 0
            r37 = r6
            r6 = r1
            r1 = r9
            r9 = r12
            r12 = r10
            r10 = r18
            r43 = r11
            r38 = 2
            r11 = r19
            r44 = r12
            r46 = r16
            r26 = 1
            r39 = 5
            r12 = r20
            androidx.compose.ui.m r6 = androidx.compose.foundation.ScrollKt.m9059f(r6, r7, r8, r9, r10, r11, r12)
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$2 r8 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$2
            r12 = r43
            r8.<init>(r12, r5)
            androidx.compose.ui.m r5 = androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt.m68437c(r6, r7, r8)
            r6 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r2.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r6 = r6.mo7631r()
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r7 = r7.mo17072u()
            r8 = 0
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.ColumnKt.m9863b(r6, r7, r2, r8)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r2.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r9 = r2.mo15032w(r9)
            androidx.compose.ui.platform.c4 r9 = (androidx.compose.p004ui.platform.C15863c4) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r10.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            r16 = r4
            androidx.compose.runtime.d r4 = r2.mo15017r()
            boolean r4 = r4 instanceof androidx.compose.runtime.C8428d
            if (r4 != 0) goto L_0x033a
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x033a:
            r2.mo14938T()
            boolean r4 = r2.mo14997l()
            if (r4 == 0) goto L_0x0347
            r2.mo14947W(r11)
            goto L_0x034a
        L_0x0347:
            r2.mo14888A()
        L_0x034a:
            r2.mo14941U()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r11 = r10.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r4, r6, r11)
            kotlin.jvm.functions.p r6 = r10.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r4, r7, r6)
            kotlin.jvm.functions.p r6 = r10.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r4, r8, r6)
            kotlin.jvm.functions.p r6 = r10.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r4, r9, r6)
            r2.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.invoke(r4, r2, r7)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r4)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            java.lang.String r4 = m107048k(r1)
            java.lang.String r5 = m107058u(r46)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r11)
            boolean r6 = r2.mo15006n0(r1)
            java.lang.Object r7 = r2.mo14921N()
            if (r6 != 0) goto L_0x03a8
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r7 != r6) goto L_0x03b0
        L_0x03a8:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$1$1 r7 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$1$1
            r7.<init>(r1)
            r2.mo14893C(r7)
        L_0x03b0:
            r2.mo15002m0()
            r6 = r7
            kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
            r2.mo14918M(r11)
            r10 = r46
            boolean r7 = r2.mo15006n0(r10)
            java.lang.Object r8 = r2.mo14921N()
            if (r7 != 0) goto L_0x03cd
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r8 != r7) goto L_0x03d5
        L_0x03cd:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$2$1 r8 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$2$1
            r8.<init>(r10)
            r2.mo14893C(r8)
        L_0x03d5:
            r2.mo15002m0()
            r7 = r8
            kotlin.jvm.functions.l r7 = (kotlin.jvm.functions.C11300l) r7
            r2.mo14918M(r11)
            r9 = r44
            boolean r8 = r2.mo15006n0(r9)
            java.lang.Object r11 = r2.mo14921N()
            if (r8 != 0) goto L_0x03f2
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r11 != r8) goto L_0x03fa
        L_0x03f2:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$3$1 r11 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$3$1
            r11.<init>(r9)
            r2.mo14893C(r11)
        L_0x03fa:
            r2.mo15002m0()
            kotlin.jvm.functions.p r11 = (kotlin.jvm.functions.C11304p) r11
            r17 = 229376(0x38000, float:3.21424E-40)
            r40 = r16
            r8 = r27
            r41 = r9
            r42 = r10
            r10 = r11
            r13 = 1157296644(0x44faf204, float:2007.563)
            r11 = r2
            r19 = r12
            r12 = r17
            m107010E(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r4 = m107060w(r21)
            java.lang.String r5 = m107040e(r0)
            java.lang.String r6 = m107044g(r30)
            java.lang.String r7 = m107046i(r31)
            java.lang.String r8 = m107049l(r32)
            r2.mo14918M(r13)
            boolean r9 = r2.mo15006n0(r3)
            java.lang.Object r10 = r2.mo14921N()
            if (r9 != 0) goto L_0x043f
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r10 != r9) goto L_0x0447
        L_0x043f:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$4$1 r10 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$4$1
            r10.<init>(r3)
            r2.mo14893C(r10)
        L_0x0447:
            r2.mo15002m0()
            r9 = r10
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$5 r10 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$5
            r16 = r10
            r17 = r33
            r18 = r41
            r20 = r34
            r22 = r0
            r23 = r30
            r24 = r31
            r25 = r32
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11 = 384(0x180, float:5.38E-43)
            r12 = r15
            r43 = r26
            r36 = 8
            r15 = r4
            r16 = r33
            r17 = r41
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r34
            r24 = r10
            r25 = r2
            r26 = r11
            m107006A(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r15 = m107051n(r37)
            boolean r16 = m107053p(r12)
            r2.mo14918M(r13)
            r7 = r37
            boolean r4 = r2.mo15006n0(r7)
            java.lang.Object r5 = r2.mo14921N()
            if (r4 != 0) goto L_0x04a2
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r5 != r4) goto L_0x04aa
        L_0x04a2:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$6$1 r5 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$6$1
            r5.<init>(r7)
            r2.mo14893C(r5)
        L_0x04aa:
            r2.mo15002m0()
            r17 = r5
            kotlin.jvm.functions.l r17 = (kotlin.jvm.functions.C11300l) r17
            r2.mo14918M(r13)
            boolean r4 = r2.mo15006n0(r12)
            java.lang.Object r5 = r2.mo14921N()
            if (r4 != 0) goto L_0x04c6
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r5 != r4) goto L_0x04ce
        L_0x04c6:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$7$1 r5 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$7$1
            r5.<init>(r12)
            r2.mo14893C(r5)
        L_0x04ce:
            r2.mo15002m0()
            r18 = r5
            kotlin.jvm.functions.l r18 = (kotlin.jvm.functions.C11300l) r18
            r4 = 9
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r12
            r5[r43] = r7
            r5[r38] = r42
            r5[r29] = r1
            r5[r28] = r0
            r5[r39] = r31
            r8 = 6
            r5[r8] = r32
            r8 = 7
            r5[r8] = r30
            r5[r36] = r14
            r8 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r2.mo14918M(r8)
            r8 = r6
        L_0x04f5:
            if (r6 >= r4) goto L_0x0501
            r9 = r5[r6]
            boolean r9 = r2.mo15006n0(r9)
            r8 = r8 | r9
            int r6 = r6 + 1
            goto L_0x04f5
        L_0x0501:
            java.lang.Object r4 = r2.mo14921N()
            if (r8 != 0) goto L_0x050f
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r4 != r5) goto L_0x0527
        L_0x050f:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$8$1 r13 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$3$8$1
            r4 = r13
            r5 = r48
            r6 = r12
            r8 = r42
            r9 = r1
            r10 = r0
            r11 = r31
            r12 = r32
            r0 = r13
            r13 = r30
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.mo14893C(r0)
            r4 = r0
        L_0x0527:
            r2.mo15002m0()
            r8 = r4
            kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
            boolean r9 = m107055r(r40)
            r12 = 0
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r10 = r35
            r11 = r2
            m107009D(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0554
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0554:
            androidx.compose.runtime.t1 r7 = r2.mo15020s()
            if (r7 != 0) goto L_0x055b
            goto L_0x0570
        L_0x055b:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$4 r8 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$LoyaltyPersonalInfoStateful$4
            r0 = r8
            r1 = r45
            r2 = r27
            r3 = r47
            r4 = r48
            r5 = r50
            r6 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0570:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt.m107038d(com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel, android.app.DatePickerDialog, kotlin.jvm.functions.l, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: e */
    public static final String m107040e(C8700z0<String> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: f */
    public static final void m107042f(C8700z0<String> z0Var, String str) {
        z0Var.setValue(str);
    }

    /* renamed from: g */
    public static final String m107044g(C8700z0<String> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: h */
    public static final void m107045h(C8700z0<String> z0Var, String str) {
        z0Var.setValue(str);
    }

    /* renamed from: i */
    public static final String m107046i(C8700z0<String> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: j */
    public static final void m107047j(C8700z0<String> z0Var, String str) {
        z0Var.setValue(str);
    }

    /* renamed from: k */
    public static final String m107048k(C8700z0<String> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: l */
    public static final String m107049l(C8700z0<String> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: m */
    public static final void m107050m(C8700z0<String> z0Var, String str) {
        z0Var.setValue(str);
    }

    /* renamed from: n */
    public static final boolean m107051n(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: o */
    public static final void m107052o(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: p */
    public static final boolean m107053p(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: q */
    public static final void m107054q(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: r */
    public static final boolean m107055r(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: s */
    public static final void m107056s(C8700z0<String> z0Var, String str) {
        z0Var.setValue(str);
    }

    /* renamed from: t */
    public static final void m107057t(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: u */
    public static final String m107058u(C8700z0<String> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: v */
    public static final void m107059v(C8700z0<String> z0Var, String str) {
        z0Var.setValue(str);
    }

    /* renamed from: w */
    public static final boolean m107060w(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: x */
    public static final void m107061x(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: y */
    public static final void m107062y(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1112376689);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1112376689, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.PersonalInfoPreview (CreateLoyaltyCardStepTwoScreen.kt:787)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                C24390b.C24391a aVar = C24390b.C24391a.f60849a;
                N = C8415c2.m30240i(C11078d1.m42659a(f60829a, aVar), C11078d1.m42659a(f60830b, aVar), C11078d1.m42659a(f60831c, aVar), C11078d1.m42659a(f60832d, aVar), C11078d1.m42659a(f60833e, aVar));
                o.mo14893C(N);
            }
            o.mo15002m0();
            ThemeKt.m153788a(C8553b.m31048b(o, -2024848012, true, new CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$1((C8667t) N)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CreateLoyaltyCardStepTwoScreenKt$PersonalInfoPreview$2(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m107063z(java.lang.String r58, java.lang.String r59, androidx.compose.p004ui.C8767m r60, kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r61, androidx.compose.foundation.text.C2779m r62, boolean r63, androidx.compose.runtime.C8592o r64, int r65, int r66) {
        /*
            r2 = r59
            r4 = r61
            r7 = r65
            r0 = 339623003(0x143e3c5b, float:9.604452E-27)
            r1 = r64
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r66 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r7 | 6
            r5 = r3
            r3 = r58
            goto L_0x002d
        L_0x0019:
            r3 = r7 & 14
            if (r3 != 0) goto L_0x002a
            r3 = r58
            boolean r5 = r1.mo15006n0(r3)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r7
            goto L_0x002d
        L_0x002a:
            r3 = r58
            r5 = r7
        L_0x002d:
            r6 = r66 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
            goto L_0x0044
        L_0x0034:
            r6 = r7 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0044
            boolean r6 = r1.mo15006n0(r2)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r5 = r5 | r6
        L_0x0044:
            r6 = r66 & 4
            if (r6 == 0) goto L_0x004b
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004b:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005e
            r6 = r60
            boolean r8 = r1.mo15006n0(r6)
            if (r8 == 0) goto L_0x005a
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r5 = r5 | r8
            goto L_0x0060
        L_0x005e:
            r6 = r60
        L_0x0060:
            r8 = r66 & 8
            if (r8 == 0) goto L_0x0067
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0077
        L_0x0067:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0077
            boolean r8 = r1.mo14927P(r4)
            if (r8 == 0) goto L_0x0074
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r5 = r5 | r8
        L_0x0077:
            r8 = r66 & 16
            if (r8 == 0) goto L_0x0080
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r13 = r62
            goto L_0x0094
        L_0x0080:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            r13 = r62
            if (r8 != 0) goto L_0x0094
            boolean r8 = r1.mo15006n0(r13)
            if (r8 == 0) goto L_0x0091
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r5 = r5 | r8
        L_0x0094:
            r8 = r66 & 32
            r56 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x009d
            r5 = r5 | r56
            goto L_0x00b1
        L_0x009d:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r7
            if (r9 != 0) goto L_0x00b1
            r9 = r63
            boolean r10 = r1.mo14961b(r9)
            if (r10 == 0) goto L_0x00ad
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r5 = r5 | r10
            goto L_0x00b3
        L_0x00b1:
            r9 = r63
        L_0x00b3:
            r10 = 374491(0x5b6db, float:5.24774E-40)
            r10 = r10 & r5
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r11) goto L_0x00c8
            boolean r10 = r1.mo15011p()
            if (r10 != 0) goto L_0x00c3
            goto L_0x00c8
        L_0x00c3:
            r1.mo14958a0()
            goto L_0x01ac
        L_0x00c8:
            if (r8 == 0) goto L_0x00ce
            r8 = 0
            r57 = r8
            goto L_0x00d0
        L_0x00ce:
            r57 = r9
        L_0x00d0:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x00dc
            r8 = -1
            java.lang.String r9 = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.TextFieldOutlined (CreateLoyaltyCardStepTwoScreen.kt:704)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r8, r9)
        L_0x00dc:
            r0 = 8
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.foundation.shape.n r0 = androidx.compose.foundation.shape.C2694o.m12166h(r0)
            androidx.compose.material.TextFieldDefaults r8 = androidx.compose.material.TextFieldDefaults.f7961a
            com.carrefour.fid.android.design.theme.b r9 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r19 = r9.mo114218O()
            long r21 = r9.mo114204A()
            long r39 = r9.mo114218O()
            long r41 = r9.mo114205B()
            long r15 = r9.mo114218O()
            long r25 = r9.mo114227X()
            long r45 = r9.mo114227X()
            long r17 = r9.mo114227X()
            r9 = 0
            r11 = 0
            r23 = 0
            r13 = r23
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r43 = 0
            r47 = 0
            r49 = 0
            r52 = 0
            r53 = 0
            r54 = 48
            r55 = 1736327(0x1a7e87, float:2.433112E-39)
            r51 = r1
            androidx.compose.material.s1 r27 = r8.mo10637l(r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r52, r53, r54, r55)
            r8 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r8)
            boolean r8 = r1.mo15006n0(r4)
            java.lang.Object r9 = r1.mo14921N()
            if (r8 != 0) goto L_0x014c
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r9 != r8) goto L_0x0154
        L_0x014c:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$TextFieldOutlined$1$1 r9 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$TextFieldOutlined$1$1
            r9.<init>(r4)
            r1.mo14893C(r9)
        L_0x0154:
            r1.mo15002m0()
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            r11 = 0
            r12 = 0
            r13 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$TextFieldOutlined$2 r8 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$TextFieldOutlined$2
            r8.<init>(r2, r5)
            r10 = -30782859(0xfffffffffe2a4a75, float:-5.658884E37)
            r14 = 1
            androidx.compose.runtime.internal.a r14 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r10, r14, r8)
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r25 = 0
            r8 = r5 & 14
            r10 = 1572864(0x180000, float:2.204052E-39)
            r8 = r8 | r10
            r10 = r5 & 896(0x380, float:1.256E-42)
            r29 = r8 | r10
            int r8 = r5 >> 15
            r8 = r8 & 14
            r8 = r8 | r56
            int r5 = r5 >> 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r30 = r8 | r5
            r31 = 224184(0x36bb8, float:3.14149E-40)
            r8 = r58
            r10 = r60
            r18 = r57
            r20 = r62
            r26 = r0
            r28 = r1
            androidx.compose.material.OutlinedTextFieldKt.m13660c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01aa
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01aa:
            r9 = r57
        L_0x01ac:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x01b3
            goto L_0x01cb
        L_0x01b3:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$TextFieldOutlined$3 r11 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$TextFieldOutlined$3
            r0 = r11
            r1 = r58
            r2 = r59
            r3 = r60
            r4 = r61
            r5 = r62
            r6 = r9
            r7 = r65
            r8 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.mo15202a(r11)
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt.m107063z(java.lang.String, java.lang.String, androidx.compose.ui.m, kotlin.jvm.functions.l, androidx.compose.foundation.text.m, boolean, androidx.compose.runtime.o, int, int):void");
    }
}
