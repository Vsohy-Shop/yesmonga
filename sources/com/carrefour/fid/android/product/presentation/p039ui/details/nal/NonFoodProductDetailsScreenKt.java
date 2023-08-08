package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C3036d1;
import androidx.compose.material.C3043g;
import androidx.compose.material.C7933t0;
import androidx.compose.material.DrawerState;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import androidx.profileinstaller.C20022q;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.components.compose.CarouselComponentKt;
import com.carrefour.fid.android.design.components.compose.MessageComponentKt;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.detail.C38110e;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.domain.models.product.detail.PictureSize;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.analytics.C27633c;
import com.carrefour.fid.android.product.presentation.models.C27647a;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.C27934i;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.C27935j;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.HorizontalBlockComponentKt;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28120e;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28122f;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28123g;
import com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;

@C11363r0({"SMAP\nNonFoodProductDetailsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodProductDetailsScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsScreenKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1095:1\n474#2,4:1096\n478#2,2:1104\n482#2:1110\n474#2,4:1146\n478#2,2:1154\n482#2:1160\n474#2,4:1184\n478#2,2:1192\n482#2:1198\n474#2,4:1328\n478#2,2:1336\n482#2:1342\n25#3:1100\n25#3:1111\n25#3:1118\n25#3:1125\n25#3:1132\n25#3:1139\n25#3:1150\n25#3:1161\n25#3:1168\n36#3:1177\n25#3:1188\n25#3:1199\n460#3,13:1225\n460#3,13:1258\n36#3:1272\n36#3:1279\n36#3:1286\n36#3:1293\n36#3:1300\n473#3,3:1307\n473#3,3:1312\n36#3:1321\n25#3:1332\n460#3,13:1374\n36#3:1388\n473#3,3:1395\n460#3,13:1419\n460#3,13:1453\n460#3,13:1512\n460#3,13:1548\n473#3,3:1567\n473#3,3:1572\n473#3,3:1586\n473#3,3:1591\n1114#4,3:1101\n1117#4,3:1107\n1114#4,6:1112\n1114#4,6:1119\n1114#4,6:1126\n1114#4,6:1133\n1114#4,6:1140\n1114#4,3:1151\n1117#4,3:1157\n1114#4,6:1162\n1114#4,6:1169\n1114#4,6:1178\n1114#4,3:1189\n1117#4,3:1195\n1114#4,6:1200\n1114#4,6:1273\n1114#4,6:1280\n1114#4,6:1287\n1114#4,6:1294\n1114#4,6:1301\n1114#4,6:1322\n1114#4,3:1333\n1117#4,3:1339\n1114#4,6:1389\n474#5:1106\n474#5:1156\n474#5:1194\n474#5:1338\n76#6:1175\n76#6:1176\n76#6:1213\n76#6:1246\n76#6:1362\n76#6:1407\n76#6:1441\n76#6:1500\n76#6:1536\n74#7,6:1206\n80#7:1238\n74#7,6:1239\n80#7:1271\n84#7:1311\n84#7:1316\n74#7,6:1355\n80#7:1387\n84#7:1399\n74#7,6:1400\n80#7:1432\n74#7,6:1434\n80#7:1466\n75#7,5:1530\n80#7:1561\n84#7:1571\n84#7:1590\n84#7:1595\n75#8:1212\n76#8,11:1214\n75#8:1245\n76#8,11:1247\n89#8:1310\n89#8:1315\n75#8:1361\n76#8,11:1363\n89#8:1398\n75#8:1406\n76#8,11:1408\n75#8:1440\n76#8,11:1442\n75#8:1499\n76#8,11:1501\n75#8:1535\n76#8,11:1537\n89#8:1570\n89#8:1575\n89#8:1589\n89#8:1594\n288#9,2:1317\n288#9,2:1319\n1549#9:1344\n1620#9,3:1345\n1549#9:1348\n1620#9,3:1349\n154#10:1343\n154#10:1352\n154#10:1353\n154#10:1354\n154#10:1433\n154#10:1467\n154#10:1468\n154#10:1469\n154#10:1470\n154#10:1471\n154#10:1472\n154#10:1473\n154#10:1474\n154#10:1475\n154#10:1476\n154#10:1477\n154#10:1478\n154#10:1479\n154#10:1480\n154#10:1481\n154#10:1482\n154#10:1483\n154#10:1484\n154#10:1485\n154#10:1486\n154#10:1487\n154#10:1488\n154#10:1489\n154#10:1490\n154#10:1491\n154#10:1492\n154#10:1493\n154#10:1526\n154#10:1527\n154#10:1528\n154#10:1529\n154#10:1562\n154#10:1563\n154#10:1564\n154#10:1565\n154#10:1566\n154#10:1577\n154#10:1578\n154#10:1579\n154#10:1580\n154#10:1581\n154#10:1582\n154#10:1583\n154#10:1584\n154#10:1585\n76#11,5:1494\n81#11:1525\n85#11:1576\n76#12:1596\n102#12,2:1597\n*S KotlinDebug\n*F\n+ 1 NonFoodProductDetailsScreen.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsScreenKt\n*L\n126#1:1096,4\n126#1:1104,2\n126#1:1110\n137#1:1146,4\n137#1:1154,2\n137#1:1160\n470#1:1184,4\n470#1:1192,2\n470#1:1198\n770#1:1328,4\n770#1:1336,2\n770#1:1342\n126#1:1100\n128#1:1111\n129#1:1118\n130#1:1125\n133#1:1132\n136#1:1139\n137#1:1150\n139#1:1161\n140#1:1168\n251#1:1177\n470#1:1188\n472#1:1199\n474#1:1225,13\n486#1:1258,13\n533#1:1272\n564#1:1279\n568#1:1286\n580#1:1293\n600#1:1300\n486#1:1307,3\n474#1:1312,3\n752#1:1321\n770#1:1332\n918#1:1374,13\n931#1:1388\n918#1:1395,3\n940#1:1419,13\n951#1:1453,13\n1032#1:1512,13\n1045#1:1548,13\n1045#1:1567,3\n1032#1:1572,3\n951#1:1586,3\n940#1:1591,3\n126#1:1101,3\n126#1:1107,3\n128#1:1112,6\n129#1:1119,6\n130#1:1126,6\n133#1:1133,6\n136#1:1140,6\n137#1:1151,3\n137#1:1157,3\n139#1:1162,6\n140#1:1169,6\n251#1:1178,6\n470#1:1189,3\n470#1:1195,3\n472#1:1200,6\n533#1:1273,6\n564#1:1280,6\n568#1:1287,6\n580#1:1294,6\n600#1:1301,6\n752#1:1322,6\n770#1:1333,3\n770#1:1339,3\n931#1:1389,6\n126#1:1106\n137#1:1156\n470#1:1194\n770#1:1338\n141#1:1175\n216#1:1176\n474#1:1213\n486#1:1246\n918#1:1362\n940#1:1407\n951#1:1441\n1032#1:1500\n1045#1:1536\n474#1:1206,6\n474#1:1238\n486#1:1239,6\n486#1:1271\n486#1:1311\n474#1:1316\n918#1:1355,6\n918#1:1387\n918#1:1399\n940#1:1400,6\n940#1:1432\n951#1:1434,6\n951#1:1466\n1045#1:1530,5\n1045#1:1561\n1045#1:1571\n951#1:1590\n940#1:1595\n474#1:1212\n474#1:1214,11\n486#1:1245\n486#1:1247,11\n486#1:1310\n474#1:1315\n918#1:1361\n918#1:1363,11\n918#1:1398\n940#1:1406\n940#1:1408,11\n951#1:1440\n951#1:1442,11\n1032#1:1499\n1032#1:1501,11\n1045#1:1535\n1045#1:1537,11\n1045#1:1570\n1032#1:1575\n951#1:1589\n940#1:1594\n657#1:1317,2\n680#1:1319,2\n777#1:1344\n777#1:1345,3\n778#1:1348\n778#1:1349,3\n776#1:1343\n801#1:1352\n840#1:1353\n843#1:1354\n954#1:1433\n960#1:1467\n961#1:1468\n966#1:1469\n967#1:1470\n968#1:1471\n974#1:1472\n976#1:1473\n977#1:1474\n984#1:1475\n985#1:1476\n986#1:1477\n992#1:1478\n993#1:1479\n994#1:1480\n999#1:1481\n1000#1:1482\n1001#1:1483\n1007#1:1484\n1008#1:1485\n1009#1:1486\n1016#1:1487\n1018#1:1488\n1019#1:1489\n1025#1:1490\n1027#1:1491\n1028#1:1492\n1035#1:1493\n1040#1:1526\n1041#1:1527\n1042#1:1528\n1046#1:1529\n1051#1:1562\n1052#1:1563\n1057#1:1564\n1058#1:1565\n1059#1:1566\n1068#1:1577\n1069#1:1578\n1070#1:1579\n1076#1:1580\n1078#1:1581\n1079#1:1582\n1085#1:1583\n1086#1:1584\n1087#1:1585\n1032#1:1494,5\n1032#1:1525\n1032#1:1576\n472#1:1596\n472#1:1597,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt */
public final class NonFoodProductDetailsScreenKt {
    /* renamed from: J */
    public static final void m116847J(C27870j.C27871a aVar, C8700z0<C27864i> z0Var, ModalBottomSheetState modalBottomSheetState, SnackbarHostState snackbarHostState, C8700z0<C27906t> z0Var2, NonFoodProductDetailsViewModel nonFoodProductDetailsViewModel, C28123g gVar, C28122f fVar, C28120e eVar, Context context, C12074o0 o0Var) {
        C27934i iVar;
        C27935j jVar;
        int i;
        Object obj;
        C27870j.C27871a aVar2 = aVar;
        ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
        if (aVar2 instanceof C27870j.C27871a.C27873b) {
            C27870j.C27871a.C27873b bVar = (C27870j.C27871a.C27873b) aVar2;
            List<C27934i> j = bVar.mo80984j();
            if (j != null) {
                Iterator it = j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C27934i) obj).mo81356r()) {
                        break;
                    }
                }
                iVar = (C27934i) obj;
            } else {
                iVar = null;
            }
            if (iVar != null) {
                jVar = iVar.mo81353o();
            } else {
                jVar = null;
            }
            boolean z = jVar instanceof C27935j.C27938c;
            String name = bVar.mo80981h().getName();
            String f = bVar.mo80980g().mo118706x().mo118136f();
            String e = bVar.mo80980g().mo118706x().mo118134e();
            String a = fVar.mo81735a(bVar.mo80980g());
            String t = bVar.mo80980g().mo118701t();
            String category = bVar.mo80981h().getCategory();
            if (category == null) {
                category = "";
            }
            gVar.mo81736a(new C27633c(name, f, category, e, a, 1, 2, bVar.mo80980g().mo118703u(), t, eVar.mo81733a(bVar.mo80980g()).mo32724a(), (String) null, 1024, (DefaultConstructorMarker) null));
            int i2 = bVar.mo80983i();
            OfferDetail g = bVar.mo80980g();
            C38110e h = bVar.mo80981h();
            List<C27934i> j2 = bVar.mo80984j();
            boolean z2 = false;
            if (j2 != null) {
                i = j2.size();
            } else {
                i = 0;
            }
            if (i > 0) {
                z2 = true;
            }
            nonFoodProductDetailsViewModel.mo81704n0(i2, g, h, z, z2);
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new NonFoodProductDetailsScreenKt$handleBasketActions$1(modalBottomSheetState2, (C11045c<? super NonFoodProductDetailsScreenKt$handleBasketActions$1>) null), 3, (Object) null);
        } else if (aVar2 instanceof C27870j.C27871a.C27874c) {
            C11723c2 unused2 = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new NonFoodProductDetailsScreenKt$handleBasketActions$2(z0Var, aVar2, modalBottomSheetState2, (C11045c<? super NonFoodProductDetailsScreenKt$handleBasketActions$2>) null), 3, (Object) null);
        } else if (aVar2 instanceof C27870j.C27871a.C27872a) {
            C27870j.C27871a.C27872a aVar3 = (C27870j.C27871a.C27872a) aVar2;
            if (aVar3.mo80969i()) {
                z0Var2.setValue(C27905s.m117074b(aVar3.mo80972l(), context));
                C11723c2 unused3 = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new NonFoodProductDetailsScreenKt$handleBasketActions$3(snackbarHostState, (C11045c<? super NonFoodProductDetailsScreenKt$handleBasketActions$3>) null), 3, (Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116848K(com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h r9, androidx.compose.runtime.C8700z0<com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i> r10, androidx.compose.material.ModalBottomSheetState r11, androidx.compose.runtime.C8700z0<com.carrefour.fid.android.domain.models.product.detail.OfferDetail> r12, kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r13, kotlinx.coroutines.C12074o0 r14) {
        /*
            com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$e r0 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27886e.f67529a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r0)
            r2 = 0
            if (r1 == 0) goto L_0x001d
            r12 = 0
            r13 = 0
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$1 r0 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$1
            r0.<init>(r10, r11, r2)
            r1 = 3
            r2 = 0
            r9 = r14
            r10 = r12
            r11 = r13
            r12 = r0
            r13 = r1
            r14 = r2
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
            goto L_0x00c3
        L_0x001d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0037
            r12 = 0
            r13 = 0
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$2 r0 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$2
            r0.<init>(r10, r11, r2)
            r1 = 3
            r2 = 0
            r9 = r14
            r10 = r12
            r11 = r13
            r12 = r0
            r13 = r1
            r14 = r2
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
            goto L_0x00c3
        L_0x0037:
            com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$d r0 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27885d.f67527a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0053
            r12 = 0
            r13 = 0
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$3 r0 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$3
            r0.<init>(r10, r11, r2)
            r1 = 3
            r2 = 0
            r9 = r14
            r10 = r12
            r11 = r13
            r12 = r0
            r13 = r1
            r14 = r2
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
            goto L_0x00c3
        L_0x0053:
            boolean r10 = r9 instanceof com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27884c
            if (r10 == 0) goto L_0x0065
            com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$c r9 = (com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27884c) r9
            boolean r9 = r9.mo81024d()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r13.invoke(r9)
            goto L_0x00c3
        L_0x0065:
            com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$a r10 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27882a.f67519a
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x007b
            r4 = 0
            r5 = 0
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$4 r6 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$handleProductActions$4
            r6.<init>(r11, r2)
            r7 = 3
            r8 = 0
            r3 = r14
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r3, r4, r5, r6, r7, r8)
            goto L_0x00c3
        L_0x007b:
            boolean r10 = r9 instanceof com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27883b
            if (r10 == 0) goto L_0x00c3
            com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$b r9 = (com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27883b) r9
            java.util.List r10 = r9.mo81018g()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x008b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b1
            java.lang.Object r11 = r10.next()
            r13 = r11
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r13 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r13
            java.lang.String r14 = r9.mo81017f()
            java.lang.String r13 = r13.mo118705w()
            r0 = 0
            if (r14 != 0) goto L_0x00a7
            if (r13 != 0) goto L_0x00ae
            r0 = 1
            goto L_0x00ae
        L_0x00a7:
            if (r13 != 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            boolean r0 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r14, r13)
        L_0x00ae:
            if (r0 == 0) goto L_0x008b
            r2 = r11
        L_0x00b1:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r2 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r2
            if (r2 != 0) goto L_0x00c0
            java.util.List r9 = r9.mo81018g()
            java.lang.Object r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r9)
            r2 = r9
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r2 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r2
        L_0x00c0:
            r12.setValue(r2)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodProductDetailsScreenKt.m116848K(com.carrefour.fid.android.product.presentation.ui.details.nal.j$h, androidx.compose.runtime.z0, androidx.compose.material.ModalBottomSheetState, androidx.compose.runtime.z0, kotlin.jvm.functions.l, kotlinx.coroutines.o0):void");
    }

    /* renamed from: L */
    public static final void m116849L(C27864i iVar, OfferDetail offerDetail, C38110e eVar, C11300l<? super C27870j, C11079d2> lVar) {
        boolean z;
        if (iVar instanceof C27864i.C27866b) {
            lVar.invoke(new C27870j.C27871a.C27873b(((C27864i.C27866b) iVar).mo80957f(), (List<C27934i>) null, offerDetail, eVar));
            return;
        }
        boolean z2 = true;
        if (Intrinsics.areEqual((Object) iVar, (Object) C27864i.C27869e.f67491a)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) iVar, (Object) C27864i.C27865a.f67482a);
        }
        if (!z) {
            z2 = Intrinsics.areEqual((Object) iVar, (Object) C27864i.C27868d.f67489a);
        }
        if (z2) {
            lVar.invoke(C27870j.C27881h.C27882a.f67519a);
        } else {
            Intrinsics.areEqual((Object) iVar, (Object) C27864i.C27867c.f67487a);
        }
    }

    /* renamed from: M */
    public static final void m116850M(C27647a aVar, C11300l<? super C27870j, C11079d2> lVar, OfferDetail offerDetail, C38110e eVar, Integer num, List<C27934i> list) {
        int i;
        if (aVar instanceof C27647a.C27648a) {
            lVar.invoke(new C27870j.C27871a.C27873b(aVar.mo80334a(), list, offerDetail, eVar));
        } else if (!Intrinsics.areEqual((Object) aVar, (Object) C27647a.C27649b.f67173b) && (aVar instanceof C27647a.C27650c)) {
            int A = offerDetail.mo118675A();
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MAX_VALUE;
            }
            lVar.invoke(new C27870j.C27871a.C27874c(aVar.mo80334a(), Integer.min(A, i)));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m116851a(OfferAvailability offerAvailability, C8592o oVar, int i) {
        int i2;
        String str;
        int i3;
        C8592o o = oVar.mo15009o(1935064160);
        if ((i & 14) == 0) {
            if (o.mo15006n0(offerAvailability)) {
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
                ComposerKt.m29845w0(1935064160, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.AvailabilityLabel (NonFoodProductDetailsScreen.kt:788)");
            }
            if (offerAvailability == OfferAvailability.Available) {
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
                C8678t1 s = o.mo15020s();
                if (s != null) {
                    s.mo15202a(new NonFoodProductDetailsScreenKt$AvailabilityLabel$1(offerAvailability, i));
                    return;
                }
                return;
            }
            if (offerAvailability == OfferAvailability.SoonAvailable) {
                o.mo14918M(1215727983);
                str = C16018i.m71858d(C27609f.C27627r.pdp_soon_available, o, 0);
                o.mo15002m0();
            } else {
                o.mo14918M(1215728053);
                str = C16018i.m71858d(C27609f.C27627r.product_highlight_unavailable, o, 0);
                o.mo15002m0();
            }
            TagComponentKt.m116921a(str, o, 0);
            C2428y0.m10726a(SizeKt.m10115o(C8767m.f23478j, C16483g.m74435M((float) 8)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new NonFoodProductDetailsScreenKt$AvailabilityLabel$2(offerAvailability, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m116852b(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(-2104862406);
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
                ComposerKt.m29845w0(-2104862406, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.Brand (NonFoodProductDetailsScreen.kt:854)");
            }
            if (!C11622t.isBlank(str)) {
                oVar2 = o;
                TextKt.m14196c(str, PaddingKt.m10028o(SizeKt.m10100P(C8767m.f23478j, C8734c.f23406a.mo17072u(), false, 2, (Object) null), 0.0f, C37474a.f94133a.mo114175A(), 0.0f, 0.0f, 13, (Object) null), C16009b.m71825a(C27609f.C27615f.ds_grey_10, o, 0), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, C16449r.f40760b.mo47727c(), false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b)), oVar2, i2 & 14, 3120, 55288);
            } else {
                oVar2 = o;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodProductDetailsScreenKt$Brand$1(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m116853c(String str, C11289a<C11079d2> aVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(62050132);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
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
                aVar = NonFoodProductDetailsScreenKt$EnergyLabelComponent$1.f67448f;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(62050132, i3, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.EnergyLabelComponent (NonFoodProductDetailsScreen.kt:819)");
            }
            if (str == null) {
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
                C8678t1 s = o.mo15020s();
                if (s != null) {
                    s.mo15202a(new NonFoodProductDetailsScreenKt$EnergyLabelComponent$2(str, aVar, i, i2));
                    return;
                }
                return;
            }
            HorizontalBlockComponentKt.m117208a(C16018i.m71858d(C27609f.C27627r.pdp_energy_label_title, o, 0), PaddingKt.m10028o(C8767m.f23478j, 0.0f, C37474a.f94133a.mo114200w(), 0.0f, 0.0f, 13, (Object) null), aVar, C8553b.m31048b(o, 7517120, true, new NonFoodProductDetailsScreenKt$EnergyLabelComponent$3(str, i3)), o, ((i3 << 3) & 896) | 3072, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new NonFoodProductDetailsScreenKt$EnergyLabelComponent$4(str, aVar, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m116854d(C11300l<? super C27870j, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        int i3;
        C8592o o = oVar.mo15009o(268063171);
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
                ComposerKt.m29845w0(268063171, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ErrorScreen (NonFoodProductDetailsScreen.kt:916)");
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
            m116856f(false, false, lVar, o, ((i2 << 6) & 896) | 54);
            String d2 = C16018i.m71858d(C27609f.C27627r.general_an_error_occurred, o, 0);
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new NonFoodProductDetailsScreenKt$ErrorScreen$1$1$1(lVar);
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
            s.mo15202a(new NonFoodProductDetailsScreenKt$ErrorScreen$2(lVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m116855e(List<String> list, boolean z, C11289a<C11079d2> aVar, C8592o oVar, int i, int i2) {
        NonFoodProductDetailsScreenKt$Features$1 nonFoodProductDetailsScreenKt$Features$1;
        C8592o oVar2;
        C8592o o = oVar.mo15009o(-1517448713);
        if ((i2 & 4) != 0) {
            nonFoodProductDetailsScreenKt$Features$1 = NonFoodProductDetailsScreenKt$Features$1.f67449f;
        } else {
            nonFoodProductDetailsScreenKt$Features$1 = aVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1517448713, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.Features (NonFoodProductDetailsScreen.kt:887)");
        } else {
            int i3 = i;
        }
        if (!list.isEmpty()) {
            String h3 = CollectionsKt___CollectionsKt.m40639h3(list, "\n• ", "• ", (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 60, (Object) null);
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C8734c.C8735a aVar3 = C8734c.f23406a;
            C8767m P = SizeKt.m10100P(aVar2, aVar3.mo17072u(), false, 2, (Object) null);
            C37474a aVar4 = C37474a.f94133a;
            C8767m o2 = PaddingKt.m10028o(P, 0.0f, aVar4.mo114202y(), 0.0f, 0.0f, 13, (Object) null);
            long a = C16009b.m71825a(C27609f.C27615f.ds_grey_10, o, 0);
            C8592o oVar3 = o;
            C7933t0 t0Var = C7933t0.f19075a;
            int i4 = C7933t0.f19076b;
            C8592o oVar4 = oVar3;
            C7933t0 t0Var2 = t0Var;
            int i5 = i4;
            TextKt.m14196c(h3, o2, a, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(t0Var.mo11077c(oVar3, i4)), oVar3, 0, 0, 65528);
            if (z) {
                C8592o oVar5 = oVar4;
                C2428y0.m10726a(PaddingKt.m10024k(aVar2, aVar4.mo114176B()), oVar5, 0);
                oVar2 = oVar5;
                TextKt.m14196c(C16018i.m71858d(C27609f.C27627r.pdp_see_more_characteristics, oVar5, 0), ClickableKt.m8878e(SizeKt.m10100P(aVar2, aVar3.mo17072u(), false, 2, (Object) null), false, (String) null, (C16031g) null, nonFoodProductDetailsScreenKt$Features$1, 7, (Object) null), C16009b.m71825a(C27609f.C27615f.ds_primary, oVar5, 0), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153896h(t0Var2.mo11077c(oVar2, i5)), oVar2, 0, 0, 65528);
            } else {
                oVar2 = oVar4;
            }
        } else {
            oVar2 = o;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodProductDetailsScreenKt$Features$2(list, z, nonFoodProductDetailsScreenKt$Features$1, i, i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116856f(boolean r21, boolean r22, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j, kotlin.C11079d2> r23, androidx.compose.runtime.C8592o r24, int r25) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r4 = 1904795542(0x7188df96, float:1.3555283E30)
            r5 = r24
            androidx.compose.runtime.o r15 = r5.mo15009o(r4)
            r5 = r3 & 14
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.mo14961b(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0031
            boolean r6 = r15.mo14961b(r1)
            if (r6 == 0) goto L_0x002e
            r6 = 32
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r5 = r5 | r6
        L_0x0031:
            r6 = r3 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0041
            boolean r6 = r15.mo14927P(r2)
            if (r6 == 0) goto L_0x003e
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r5 = r5 | r6
        L_0x0041:
            r6 = r5 & 731(0x2db, float:1.024E-42)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0053
            boolean r6 = r15.mo15011p()
            if (r6 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r15.mo14958a0()
            r4 = r15
            goto L_0x00bf
        L_0x0053:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x005f
            r6 = -1
            java.lang.String r7 = "com.carrefour.fid.android.product.presentation.ui.details.nal.Header (NonFoodProductDetailsScreen.kt:743)"
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r5, r6, r7)
        L_0x005f:
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            r6 = 0
            r7 = 0
            r9 = 0
            int r13 = com.carrefour.fid.android.product.C27609f.C27627r.accessibility_return_to_previous_page
            r14 = 0
            java.lang.String r13 = androidx.compose.p004ui.res.C16018i.m71858d(r13, r15, r14)
            r14 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r14)
            boolean r14 = r15.mo15006n0(r2)
            java.lang.Object r11 = r15.mo14921N()
            if (r14 != 0) goto L_0x0088
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r11 != r12) goto L_0x0090
        L_0x0088:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$Header$1$1 r11 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$Header$1$1
            r11.<init>(r2)
            r15.mo14893C(r11)
        L_0x0090:
            r15.mo15002m0()
            r14 = r11
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$Header$2 r11 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$Header$2
            r11.<init>(r1, r0, r2, r5)
            r5 = 509132777(0x1e58bfe9, float:1.1474631E-20)
            r12 = 1
            androidx.compose.runtime.internal.a r18 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r5, r12, r11)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = 30
            r5 = r4
            r11 = 0
            r4 = r15
            r15 = r18
            r16 = r4
            r17 = r19
            r18 = r20
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151503h(r5, r6, r7, r9, r11, r13, r14, r15, r16, r17, r18)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x00bf
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00bf:
            androidx.compose.runtime.t1 r4 = r4.mo15020s()
            if (r4 != 0) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$Header$3 r5 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$Header$3
            r5.<init>(r0, r1, r2, r3)
            r4.mo15202a(r5)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodProductDetailsScreenKt.m116856f(boolean, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m116857g(String str, OfferAvailability offerAvailability, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        String str2 = str;
        OfferAvailability offerAvailability2 = offerAvailability;
        int i5 = i;
        C8592o o = oVar.mo15009o(-142953628);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo15006n0(offerAvailability2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-142953628, i6, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.LabelHighLight (NonFoodProductDetailsScreen.kt:834)");
            }
            if (!(!C11622t.isBlank(str)) || offerAvailability2 != OfferAvailability.Available) {
                oVar2 = o;
            } else {
                float f = (float) 4;
                float f2 = (float) 1;
                oVar2 = o;
                TextKt.m14196c(str, PaddingKt.m10027n(BackgroundKt.m8824c(C8767m.f23478j, C16009b.m71825a(C27609f.C27615f.ds_primary, o, 0), C2694o.m12166h(C16483g.m74435M((float) 20))), C16483g.m74435M(f), C16483g.m74435M(f2), C16483g.m74435M(f), C16483g.m74435M(f2)), C16009b.m71825a(C27609f.C27615f.ds_grey_white, o, 0), 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, C16449r.f40760b.mo47727c(), false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11098k(), oVar2, (i6 & 14) | C20022q.C20025c.f51280k, 3120, 55256);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodProductDetailsScreenKt$LabelHighLight$1(str, offerAvailability, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116858h(com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27899o r27, com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27854a r28, boolean r29, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j, kotlin.C11079d2> r30, androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r1 = r27
            r5 = r32
            r0 = -708874506(0xffffffffd5bf6ef6, float:-2.63104118E13)
            r2 = r31
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r33 & 8
            if (r3 == 0) goto L_0x0015
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$1 r3 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$1.f67450f
            r4 = r3
            goto L_0x0017
        L_0x0015:
            r4 = r30
        L_0x0017:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0023
            r3 = -1
            java.lang.String r6 = "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetails (NonFoodProductDetailsScreen.kt:463)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r3, r6)
        L_0x0023:
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.mo14918M(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r0)
            java.lang.Object r3 = r2.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r16.mo16277a()
            if (r3 != r6) goto L_0x004a
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r3 = androidx.compose.runtime.EffectsKt.m29901m(r3, r2)
            androidx.compose.runtime.w r6 = new androidx.compose.runtime.w
            r6.<init>(r3)
            r2.mo14893C(r6)
            r3 = r6
        L_0x004a:
            r2.mo15002m0()
            androidx.compose.runtime.w r3 = (androidx.compose.runtime.C8690w) r3
            kotlinx.coroutines.o0 r3 = r3.mo16831a()
            r2.mo15002m0()
            r15 = 0
            r14 = 1
            androidx.compose.foundation.ScrollState r13 = androidx.compose.foundation.ScrollKt.m9056c(r15, r2, r15, r14)
            r2.mo14918M(r0)
            java.lang.Object r0 = r2.mo14921N()
            java.lang.Object r6 = r16.mo16277a()
            r7 = 2
            r12 = 0
            r11 = 0
            if (r0 != r6) goto L_0x0077
            java.lang.Float r0 = java.lang.Float.valueOf(r12)
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r11, r7, r11)
            r2.mo14893C(r0)
        L_0x0077:
            r2.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            androidx.compose.ui.m$a r10 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.SizeKt.m10114n(r10, r12, r14, r11)
            com.carrefour.fid.android.design.theme.b r6 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r18 = r6.mo114231a0()
            r20 = 0
            r21 = 2
            r22 = 0
            androidx.compose.ui.m r6 = androidx.compose.foundation.BackgroundKt.m8825d(r17, r18, r20, r21, r22)
            androidx.compose.ui.c$a r17 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r8 = r17.mo17072u()
            r9 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r2.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement r18 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r9 = r18.mo7631r()
            r7 = 48
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.ColumnKt.m9863b(r9, r8, r2, r7)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r9)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r2.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r11 = r2.mo15032w(r11)
            androidx.compose.ui.platform.c4 r11 = (androidx.compose.p004ui.platform.C15863c4) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r21 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r21.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r14 = r2.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x00e3
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00e3:
            r2.mo14938T()
            boolean r14 = r2.mo14997l()
            if (r14 == 0) goto L_0x00f0
            r2.mo14947W(r12)
            goto L_0x00f3
        L_0x00f0:
            r2.mo14888A()
        L_0x00f3:
            r2.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r14 = r21.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r14)
            kotlin.jvm.functions.p r7 = r21.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r7)
            kotlin.jvm.functions.p r7 = r21.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r7)
            kotlin.jvm.functions.p r7 = r21.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r11, r7)
            r2.mo14972e()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r7 = androidx.compose.runtime.C8684u1.m31905a(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r6.invoke(r7, r2, r8)
            r14 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r14)
            androidx.compose.foundation.layout.ColumnScopeInstance r6 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r6 = r5 >> 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r6 = r6 | 54
            r7 = 1
            m116856f(r7, r15, r4, r2, r6)
            com.carrefour.fid.android.design.theme.a r24 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r6 = r24.mo114202y()
            r7 = 2
            r11 = 0
            r12 = 0
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10026m(r10, r6, r12, r7, r11)
            r8 = 0
            r9 = 0
            r20 = 0
            r22 = 14
            r23 = 0
            r7 = r13
            r14 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r25 = r10
            r10 = r20
            r11 = r22
            r12 = r23
            androidx.compose.ui.m r6 = androidx.compose.foundation.ScrollKt.m9059f(r6, r7, r8, r9, r10, r11, r12)
            r2.mo14918M(r14)
            androidx.compose.foundation.layout.Arrangement$l r7 = r18.mo7631r()
            androidx.compose.ui.c$b r8 = r17.mo17072u()
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.ColumnKt.m9863b(r7, r8, r2, r15)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r2.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            kotlin.jvm.functions.a r11 = r21.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r12 = r2.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x01a5
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01a5:
            r2.mo14938T()
            boolean r12 = r2.mo14997l()
            if (r12 == 0) goto L_0x01b2
            r2.mo14947W(r11)
            goto L_0x01b5
        L_0x01b2:
            r2.mo14888A()
        L_0x01b5:
            r2.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r12 = r21.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r12)
            kotlin.jvm.functions.p r7 = r21.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r7)
            kotlin.jvm.functions.p r7 = r21.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r7)
            kotlin.jvm.functions.p r7 = r21.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r7)
            r2.mo14972e()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r7 = androidx.compose.runtime.C8684u1.m31905a(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r6.invoke(r7, r2, r8)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r6)
            com.carrefour.fid.android.domain.models.product.detail.e r6 = r27.mo81091j()
            java.util.Map r6 = r6.mo118723e()
            r7 = 56
            r14 = r25
            m116864n(r6, r14, r2, r7)
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r6 = r27.mo81087g()
            m116851a(r6, r2, r15)
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r6 = r27.mo81088h()
            java.lang.String r6 = r6.mo118707y()
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r7 = r27.mo81087g()
            m116857g(r6, r7, r2, r15)
            com.carrefour.fid.android.domain.models.product.detail.e r6 = r27.mo81091j()
            java.lang.String r6 = r6.getBrand()
            m116852b(r6, r2, r15)
            com.carrefour.fid.android.domain.models.product.detail.e r6 = r27.mo81091j()
            java.lang.String r6 = r6.getName()
            m116865o(r6, r2, r15)
            com.carrefour.fid.android.domain.models.product.detail.e r6 = r27.mo81091j()
            java.util.List r6 = r6.mo118724f()
            com.carrefour.fid.android.domain.models.product.detail.e r7 = r27.mo81091j()
            java.lang.String r7 = r7.getDescription()
            boolean r7 = kotlin.text.C11622t.isBlank(r7)
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0257
            com.carrefour.fid.android.domain.models.product.detail.e r7 = r27.mo81091j()
            java.util.List r7 = r7.mo118778w()
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0255
            goto L_0x0257
        L_0x0255:
            r7 = r15
            goto L_0x0258
        L_0x0257:
            r7 = 1
        L_0x0258:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$1 r8 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$1
            r8.<init>(r3, r13, r0)
            r10 = 8
            r11 = 0
            r9 = r2
            m116855e(r6, r7, r8, r9, r10, r11)
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r3 = r27.mo81088h()
            com.carrefour.fid.android.domain.models.offer.Discount r6 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116361b(r3)
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r7 = r27.mo81087g()
            r18 = 0
            float r19 = r24.mo114200w()
            r20 = 0
            r21 = 0
            r22 = 13
            r23 = 0
            r17 = r14
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.PaddingKt.m10028o(r17, r18, r19, r20, r21, r22, r23)
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.PromoComponentKt.m116898b(r6, r7, r8, r9, r10, r11)
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r3 = r27.mo81088h()
            com.carrefour.fid.android.domain.models.offer.Prices r6 = r3.mo118708z()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r3 = r27.mo81088h()
            com.carrefour.fid.android.domain.models.offer.Discount r7 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116361b(r3)
            com.carrefour.fid.android.domain.models.product.detail.e r3 = r27.mo81091j()
            java.lang.String r8 = r3.mo118725g()
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r9 = r27.mo81087g()
            float r19 = r24.mo114175A()
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r17, r18, r19, r20, r21, r22, r23)
            r12 = 72
            r13 = 0
            r11 = r2
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.PriceComponentKt.m116894a(r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.List r7 = r27.mo81090i()
            r3 = 0
            r6 = 1
            r13 = 0
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r3, r6, r13)
            float r19 = r24.mo114175A()
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10028o(r17, r18, r19, r20, r21, r22, r23)
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$2 r8 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$2
            r8.<init>(r4, r1)
            r12 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r12)
            boolean r9 = r2.mo15006n0(r4)
            java.lang.Object r10 = r2.mo14921N()
            if (r9 != 0) goto L_0x02e0
            java.lang.Object r9 = r16.mo16277a()
            if (r10 != r9) goto L_0x02e8
        L_0x02e0:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$3$1 r10 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$3$1
            r10.<init>(r4)
            r2.mo14893C(r10)
        L_0x02e8:
            r2.mo15002m0()
            r9 = r10
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            r11 = 64
            r17 = 0
            r10 = r2
            r12 = r17
            com.carrefour.fid.android.product.presentation.p039ui.details.views.DeliveryChoiceComponentKt.m117173a(r6, r7, r8, r9, r10, r11, r12)
            r6 = 978073846(0x3a4c38f6, float:7.79047E-4)
            r2.mo14918M(r6)
            if (r29 != 0) goto L_0x0339
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r6 = r27.mo81088h()
            com.carrefour.fid.android.product.presentation.models.a r10 = com.carrefour.fid.android.product.presentation.viewmodel.details.C28113a.m117737a(r15, r6)
            r12 = 1
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r3, r12, r13)
            boolean r9 = r28.mo80928h()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r7 = r27.mo81088h()
            com.carrefour.fid.android.domain.models.offer.Prices r7 = r7.mo118708z()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r8 = r27.mo81088h()
            com.carrefour.fid.android.domain.models.offer.Discount r8 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116361b(r8)
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$4 r11 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$4
            r3 = r28
            r11.<init>(r4, r1, r3)
            r17 = 582(0x246, float:8.16E-43)
            r18 = 0
            r19 = r12
            r12 = r2
            r13 = r17
            r26 = r14
            r14 = r18
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodBasketComponentKt.m116824a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x033d
        L_0x0339:
            r3 = r28
            r26 = r14
        L_0x033d:
            r2.mo15002m0()
            com.carrefour.fid.android.domain.models.product.detail.e r6 = r27.mo81091j()
            java.lang.Double r6 = r6.mo118722d()
            r14 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r14)
            boolean r7 = r2.mo15006n0(r4)
            java.lang.Object r8 = r2.mo14921N()
            if (r7 != 0) goto L_0x035e
            java.lang.Object r7 = r16.mo16277a()
            if (r8 != r7) goto L_0x0366
        L_0x035e:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$5$1 r8 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$5$1
            r8.<init>(r4)
            r2.mo14893C(r8)
        L_0x0366:
            r2.mo15002m0()
            kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
            m116866p(r6, r8, r2, r15, r15)
            com.carrefour.fid.android.domain.models.product.detail.e r6 = r27.mo81091j()
            java.lang.String r6 = r6.mo118779x()
            r2.mo14918M(r14)
            boolean r7 = r2.mo15006n0(r4)
            java.lang.Object r8 = r2.mo14921N()
            if (r7 != 0) goto L_0x0389
            java.lang.Object r7 = r16.mo16277a()
            if (r8 != r7) goto L_0x0391
        L_0x0389:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$6$1 r8 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$6$1
            r8.<init>(r4)
            r2.mo14893C(r8)
        L_0x0391:
            r2.mo15002m0()
            kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
            m116853c(r6, r8, r2, r15, r15)
            int r6 = com.carrefour.fid.android.product.C27609f.C27627r.description
            java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r6, r2, r15)
            com.carrefour.fid.android.domain.models.product.detail.e r7 = r27.mo81091j()
            java.lang.String r7 = r7.getDescription()
            int r8 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_description_see_more
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r2, r15)
            int r13 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_description_see_less
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r13, r2, r15)
            r12 = r26
            r10 = 0
            r11 = 0
            r15 = 1
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.SizeKt.m10114n(r12, r10, r15, r11)
            r18 = 0
            float r19 = r24.mo114200w()
            r20 = 0
            r21 = 0
            r22 = 13
            r23 = 0
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r17, r18, r19, r20, r21, r22, r23)
            r2.mo14918M(r14)
            boolean r17 = r2.mo15006n0(r0)
            java.lang.Object r11 = r2.mo14921N()
            if (r17 != 0) goto L_0x03e1
            java.lang.Object r14 = r16.mo16277a()
            if (r11 != r14) goto L_0x03e9
        L_0x03e1:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$7$1 r11 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$7$1
            r11.<init>(r0)
            r2.mo14893C(r11)
        L_0x03e9:
            r2.mo15002m0()
            kotlin.jvm.functions.l r11 = (kotlin.jvm.functions.C11300l) r11
            r14 = 0
            r3 = r12
            r12 = r2
            r15 = r13
            r13 = r14
            com.carrefour.fid.android.product.presentation.p039ui.details.views.ProductDescriptionKt.m117219b(r6, r7, r8, r9, r10, r11, r12, r13)
            com.carrefour.fid.android.domain.models.product.detail.e r6 = r27.mo81091j()
            java.util.List r6 = r6.mo118778w()
            int r7 = com.carrefour.fid.android.product.C27609f.C27627r.product_non_food_characteristics
            r14 = 0
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r7, r2, r14)
            int r8 = com.carrefour.fid.android.product.C27609f.C27627r.see_more
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r2, r14)
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r15, r2, r14)
            r10 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r10, r12, r11)
            r18 = 0
            float r19 = r24.mo114200w()
            r20 = 0
            r21 = 0
            r22 = 13
            r23 = 0
            androidx.compose.ui.m r10 = androidx.compose.foundation.layout.PaddingKt.m10028o(r17, r18, r19, r20, r21, r22, r23)
            r11 = 0
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$8 r12 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$8
            r12.<init>(r1, r0)
            r0 = 8
            r15 = 32
            r13 = r2
            r17 = r14
            r14 = r0
            r0 = r17
            com.carrefour.fid.android.product.presentation.p039ui.details.views.CharacteristicKt.m117108a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            float r6 = r24.mo114202y()
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10024k(r3, r6)
            androidx.compose.foundation.layout.C2428y0.m10726a(r6, r2, r0)
            r6 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r6)
            boolean r6 = r2.mo15006n0(r4)
            java.lang.Object r7 = r2.mo14921N()
            if (r6 != 0) goto L_0x045c
            java.lang.Object r6 = r16.mo16277a()
            if (r7 != r6) goto L_0x0464
        L_0x045c:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$9$1 r7 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$9$1
            r7.<init>(r4)
            r2.mo14893C(r7)
        L_0x0464:
            r2.mo15002m0()
            kotlin.jvm.functions.l r7 = (kotlin.jvm.functions.C11300l) r7
            com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsurranceComponentKt.m116918c(r7, r2, r0)
            float r6 = r24.mo114203z()
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10024k(r3, r6)
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r2, r0)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0498
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0498:
            androidx.compose.runtime.t1 r7 = r2.mo15020s()
            if (r7 != 0) goto L_0x049f
            goto L_0x04b2
        L_0x049f:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$3 r8 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$3
            r0 = r8
            r1 = r27
            r2 = r28
            r3 = r29
            r5 = r32
            r6 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x04b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodProductDetailsScreenKt.m116858h(com.carrefour.fid.android.product.presentation.ui.details.nal.o, com.carrefour.fid.android.product.presentation.ui.details.nal.a, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: i */
    public static final void m116859i(C8700z0<Float> z0Var, float f) {
        z0Var.setValue(Float.valueOf(f));
    }

    /* renamed from: j */
    public static final float m116860j(C8700z0<Float> z0Var) {
        return z0Var.getValue().floatValue();
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m116861k(C3043g gVar, ModalBottomSheetState modalBottomSheetState, C27864i iVar, C27899o oVar, C27854a aVar, boolean z, SnackbarHostState snackbarHostState, C27906t tVar, C11300l<? super C27870j, C11079d2> lVar, C8592o oVar2, int i) {
        int i2 = i;
        C8592o o = oVar2.mo15009o(1644960973);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1644960973, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreen (NonFoodProductDetailsScreen.kt:318)");
        }
        C8552a b = C8553b.m31048b(o, 1572992261, true, new NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$1(tVar, snackbarHostState, i2));
        C8552a b2 = C8553b.m31048b(o, -602813882, true, new NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$2(iVar, i2, oVar, lVar));
        NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3 nonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3 = r0;
        NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3 nonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$32 = new NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3(z, gVar, i, oVar, aVar, lVar);
        ModalBottomSheetComponentKt.m116819a(modalBottomSheetState, b, b2, C8553b.m31048b(o, -1581736459, true, nonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$3), o, ModalBottomSheetState.f7719e | 3504 | ((i2 >> 3) & 14));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$4(gVar, modalBottomSheetState, iVar, oVar, aVar, z, snackbarHostState, tVar, lVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    public static final void m116862l(C11300l<? super C27870j, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        int i3;
        C11300l<? super C27870j, C11079d2> lVar2 = lVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(1918812548);
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
                ComposerKt.m29845w0(1918812548, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenShimmer (NonFoodProductDetailsScreen.kt:938)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            Object obj = null;
            C8767m d = BackgroundKt.m8825d(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C37475b.f94185a.mo114231a0(), (C15218g4) null, 2, (Object) null);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C8734c.C8736b u = aVar2.mo17072u();
            o.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            C15560f0 b = ColumnKt.m9863b(arrangement.mo7631r(), u, o, 48);
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
            m116856f(true, false, lVar2, o, ((i2 << 6) & 896) | 54);
            float f2 = (float) 16;
            C8767m f3 = ScrollKt.m9059f(PaddingKt.m10024k(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f2)), ScrollKt.m9056c(0, o, 0, 1), false, (C2195g) null, false, 14, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b3 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(f3);
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
            C8592o b4 = Updater.m30180b(o);
            Updater.m30188j(b4, b3, companion.mo44588d());
            Updater.m30188j(b4, dVar2, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b4, c4Var2, companion.mo44590f());
            o.mo14972e();
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            float f5 = (float) 8;
            C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10115o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M((float) 272)), C2694o.m12166h(C16483g.m74435M(f5))), true, (C15218g4) null, 2, (Object) null), o, 0);
            float f6 = f5;
            float f7 = (float) 11;
            C8767m a3 = C8744d.m32514a(SizeKt.m10089E(PaddingKt.m10028o(aVar, 0.0f, C16483g.m74435M((float) 20), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M((float) 60), C16483g.m74435M(f7)), C2694o.m12166h(C16483g.m74435M(f6)));
            C2428y0.m10726a(C37019o.m151909b(a3, true, (C15218g4) null, 2, (Object) null), o, 0);
            o.mo14918M(-1143743214);
            int i5 = 0;
            for (int i6 = 2; i5 < i6; i6 = 2) {
                C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 7), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M((float) 14)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
                i5++;
            }
            o.mo15002m0();
            o.mo14918M(-1143742873);
            for (int i7 = 0; i7 < 4; i7++) {
                float f8 = (float) 14;
                C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10089E(PaddingKt.m10028o(C8767m.f23478j, C16483g.m74435M(f2), C16483g.m74435M(f8), 0.0f, 0.0f, 12, (Object) null), C16483g.m74435M((float) 327), C16483g.m74435M(f8)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
            }
            o.mo15002m0();
            float f9 = (float) 14;
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10089E(PaddingKt.m10028o(aVar3, 0.0f, C16483g.m74435M(f9), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M((float) 171), C16483g.m74435M(f9)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
            float f10 = (float) 3;
            float f11 = (float) 93;
            C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10089E(PaddingKt.m10028o(aVar3, 0.0f, C16483g.m74435M((float) 30), 0.0f, C16483g.m74435M(f10), 5, (Object) null), C16483g.m74435M(f11), C16483g.m74435M((float) 24)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
            o.mo14918M(-1143742001);
            int i8 = 0;
            for (int i9 = 3; i8 < i9; i9 = 3) {
                C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10089E(PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M(f6), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M((float) HideBottomViewOnScrollBehavior.f74656f), C16483g.m74435M(f7)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
                i8++;
            }
            o.mo15002m0();
            o.mo14918M(-1143741677);
            int i10 = 0;
            for (int i11 = 2; i10 < i11; i11 = 2) {
                C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 22), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M((float) 64)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
                i10++;
            }
            o.mo15002m0();
            float f12 = (float) 22;
            int i12 = 1;
            float f13 = (float) 40;
            int i13 = 2;
            C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M(f12), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M(f13)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
            o.mo14918M(-1143741063);
            int i14 = 0;
            while (i14 < i13) {
                C8767m.C8768a aVar4 = C8767m.f23478j;
                C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(aVar4, 0.0f, i12, obj), 0.0f, C16483g.m74435M(f12), 0.0f, 0.0f, 13, (Object) null);
                Arrangement arrangement2 = Arrangement.f6010a;
                Arrangement.C2269d p = arrangement2.mo7630p();
                float f14 = f12;
                o.mo14918M(693286680);
                C8734c.C8735a aVar5 = C8734c.f23406a;
                C15560f0 d2 = RowKt.m10071d(p, aVar5.mo17073w(), o, 6);
                o.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
                C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion2 = ComposeUiNode.f38797m;
                float f15 = f9;
                C11289a<ComposeUiNode> a4 = companion2.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f16 = LayoutKt.m68908f(o2);
                float f17 = f11;
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
                Updater.m30188j(b5, d2, companion2.mo44588d());
                Updater.m30188j(b5, dVar3, companion2.mo44586b());
                Updater.m30188j(b5, layoutDirection3, companion2.mo44587c());
                Updater.m30188j(b5, c4Var3, companion2.mo44590f());
                o.mo14972e();
                f16.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                C8767m.C8768a aVar6 = aVar4;
                C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10089E(PaddingKt.m10028o(aVar6, 0.0f, 0.0f, C16483g.m74435M(f2), 0.0f, 11, (Object) null), C16483g.m74435M((float) 64), C16483g.m74435M(f13)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
                C8767m o3 = PaddingKt.m10028o(aVar6, 0.0f, C16483g.m74435M((float) 5), 0.0f, 0.0f, 13, (Object) null);
                Arrangement.C2271e f18 = arrangement2.mo7625f();
                o.mo14918M(-483455358);
                C15560f0 b6 = ColumnKt.m9863b(f18, aVar5.mo17072u(), o, 6);
                o.mo14918M(-1323940314);
                C16479d dVar4 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection4 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var4 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a5 = companion2.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f19 = LayoutKt.m68908f(o3);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a5);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b7 = Updater.m30180b(o);
                Updater.m30188j(b7, b6, companion2.mo44588d());
                Updater.m30188j(b7, dVar4, companion2.mo44586b());
                Updater.m30188j(b7, layoutDirection4, companion2.mo44587c());
                Updater.m30188j(b7, c4Var4, companion2.mo44590f());
                o.mo14972e();
                f19.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.f6049a;
                C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10089E(aVar4, C16483g.m74435M((float) 263), C16483g.m74435M(f7)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
                C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10089E(PaddingKt.m10028o(aVar4, 0.0f, C16483g.m74435M(f6), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M((float) 100), C16483g.m74435M(f7)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
                i14++;
                obj = null;
                i13 = 2;
                i12 = 1;
                C11300l<? super C27870j, C11079d2> lVar3 = lVar;
                int i15 = i;
                f12 = f14;
                columnScopeInstance = columnScopeInstance2;
                f9 = f15;
                f11 = f17;
            }
            ColumnScopeInstance columnScopeInstance4 = columnScopeInstance;
            float f20 = f9;
            float f21 = f11;
            o.mo15002m0();
            o.mo14918M(500660212);
            int i16 = 0;
            for (int i17 = 2; i16 < i17; i17 = 2) {
                C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10089E(PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 27), 0.0f, C16483g.m74435M(f10), 5, (Object) null), C16483g.m74435M(f21), C16483g.m74435M(f20)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
                o.mo14918M(-1143739298);
                for (int i18 = 0; i18 < 4; i18++) {
                    C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M(f6), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M(f7)), C2694o.m12166h(C16483g.m74435M(f6))), true, (C15218g4) null, 2, (Object) null), o, 0);
                }
                o.mo15002m0();
                C2428y0.m10726a(C37019o.m151909b(columnScopeInstance4.mo7714e(C8744d.m32514a(SizeKt.m10089E(PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M(f6), 0.0f, 0.0f, 13, (Object) null), C16483g.m74435M((float) 157), C16483g.m74435M(f7)), C2694o.m12166h(C16483g.m74435M(f6))), C8734c.f23406a.mo17068m()), true, (C15218g4) null, 2, (Object) null), o, 0);
                i16++;
            }
            o.mo15002m0();
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
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C27842x18f28396(lVar, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116863m(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r38, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.presentation.viewmodel.details.C28123g r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r40, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r41, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r42, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r45, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Integer, kotlin.C11079d2> r46, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceType, kotlin.C11079d2> r47, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r48, int r49) {
        /*
            r13 = r40
            java.lang.String r0 = "viewModel"
            r12 = r38
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "analyticsViewModel"
            r11 = r39
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onBackPressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onWebRedirection"
            r10 = r41
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onSignInRequired"
            r9 = r42
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onServiceSelectionRequired"
            r8 = r43
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onDeliveryChoiceInfoRedirection"
            r7 = r44
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onHeartClicked"
            r6 = r45
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "handleComponentExpandComplete"
            r5 = r46
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onReinsuranceClicked"
            r4 = r47
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 314435301(0x12bde6e5, float:1.1984497E-27)
            r1 = r48
            androidx.compose.runtime.o r3 = r1.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x005e
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsStateful (NonFoodProductDetailsScreen.kt:107)"
            r15 = r49
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r15, r1, r2)
            goto L_0x0060
        L_0x005e:
            r15 = r49
        L_0x0060:
            kotlinx.coroutines.flow.u r0 = r38.getState()
            r1 = 8
            r2 = 0
            r14 = 1
            androidx.compose.runtime.k2 r1 = androidx.compose.runtime.C8415c2.m30233b(r0, r2, r3, r1, r14)
            androidx.compose.material.ModalBottomSheetValue r0 = androidx.compose.material.ModalBottomSheetValue.Hidden
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 14
            r14 = r0
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r3
            androidx.compose.material.ModalBottomSheetState r0 = androidx.compose.material.ModalBottomSheetKt.m13595p(r14, r15, r16, r17, r18, r19, r20)
            r20 = 0
            androidx.compose.material.BottomSheetValue r14 = androidx.compose.material.BottomSheetValue.Collapsed
            r15 = 0
            r16 = 0
            r18 = 6
            r17 = r3
            androidx.compose.material.BottomSheetState r15 = androidx.compose.material.BottomSheetScaffoldKt.m13304n(r14, r15, r16, r17, r18, r19)
            r18 = 0
            r19 = 5
            r14 = r20
            androidx.compose.material.g r21 = androidx.compose.material.BottomSheetScaffoldKt.m13303m(r14, r15, r16, r17, r18, r19)
            r14 = 773894976(0x2e20b340, float:3.6538994E-11)
            r3.mo14918M(r14)
            r15 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r15)
            java.lang.Object r14 = r3.mo14921N()
            androidx.compose.runtime.o$a r22 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r22.mo16277a()
            if (r14 != r2) goto L_0x00c4
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r2 = androidx.compose.runtime.EffectsKt.m29901m(r2, r3)
            androidx.compose.runtime.w r14 = new androidx.compose.runtime.w
            r14.<init>(r2)
            r3.mo14893C(r14)
        L_0x00c4:
            r3.mo15002m0()
            androidx.compose.runtime.w r14 = (androidx.compose.runtime.C8690w) r14
            kotlinx.coroutines.o0 r17 = r14.mo16831a()
            r3.mo15002m0()
            r3.mo14918M(r15)
            java.lang.Object r2 = r3.mo14921N()
            java.lang.Object r14 = r22.mo16277a()
            r15 = 2
            if (r2 != r14) goto L_0x00e8
            com.carrefour.fid.android.product.presentation.ui.details.nal.i$e r2 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i.C27869e.f67491a
            r14 = 0
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r14, r15, r14)
            r3.mo14893C(r2)
        L_0x00e8:
            r3.mo15002m0()
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r14)
            java.lang.Object r15 = r3.mo14921N()
            java.lang.Object r14 = r22.mo16277a()
            if (r15 != r14) goto L_0x0105
            androidx.compose.material.SnackbarHostState r15 = new androidx.compose.material.SnackbarHostState
            r15.<init>()
            r3.mo14893C(r15)
        L_0x0105:
            r3.mo15002m0()
            r23 = r15
            androidx.compose.material.SnackbarHostState r23 = (androidx.compose.material.SnackbarHostState) r23
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r14)
            java.lang.Object r15 = r3.mo14921N()
            java.lang.Object r14 = r22.mo16277a()
            if (r15 != r14) goto L_0x0128
            r16 = r2
            r2 = 0
            r14 = 2
            androidx.compose.runtime.z0 r15 = androidx.compose.runtime.C8539f2.m30981g(r2, r2, r14, r2)
            r3.mo14893C(r15)
            goto L_0x012c
        L_0x0128:
            r16 = r2
            r2 = 0
            r14 = 2
        L_0x012c:
            r3.mo15002m0()
            r24 = r15
            androidx.compose.runtime.z0 r24 = (androidx.compose.runtime.C8700z0) r24
            r15 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r15)
            java.lang.Object r15 = r3.mo14921N()
            r19 = r0
            java.lang.Object r0 = r22.mo16277a()
            if (r15 != r0) goto L_0x014c
            androidx.compose.runtime.z0 r15 = androidx.compose.runtime.C8539f2.m30981g(r2, r2, r14, r2)
            r3.mo14893C(r15)
        L_0x014c:
            r3.mo15002m0()
            r0 = r15
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            r15 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r15)
            java.lang.Object r15 = r3.mo14921N()
            java.lang.Object r2 = r22.mo16277a()
            if (r15 != r2) goto L_0x0172
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r15 = 0
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r15, r14, r15)
            r3.mo14893C(r2)
            r37 = r15
            r15 = r2
            r2 = r37
            goto L_0x0173
        L_0x0172:
            r2 = 0
        L_0x0173:
            r3.mo15002m0()
            androidx.compose.runtime.z0 r15 = (androidx.compose.runtime.C8700z0) r15
            r14 = 773894976(0x2e20b340, float:3.6538994E-11)
            r3.mo14918M(r14)
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r14)
            java.lang.Object r14 = r3.mo14921N()
            java.lang.Object r2 = r22.mo16277a()
            if (r14 != r2) goto L_0x019c
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r2 = androidx.compose.runtime.EffectsKt.m29901m(r2, r3)
            androidx.compose.runtime.w r14 = new androidx.compose.runtime.w
            r14.<init>(r2)
            r3.mo14893C(r14)
        L_0x019c:
            r3.mo15002m0()
            androidx.compose.runtime.w r14 = (androidx.compose.runtime.C8690w) r14
            kotlinx.coroutines.o0 r25 = r14.mo16831a()
            r3.mo15002m0()
            java.lang.Object r2 = r1.getValue()
            r26 = r2
            com.carrefour.fid.android.product.presentation.models.e r26 = (com.carrefour.fid.android.product.presentation.models.C27656e) r26
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r2)
            java.lang.Object r14 = r3.mo14921N()
            java.lang.Object r2 = r22.mo16277a()
            if (r14 != r2) goto L_0x01c8
            com.carrefour.fid.android.product.presentation.viewmodel.details.f r14 = new com.carrefour.fid.android.product.presentation.viewmodel.details.f
            r14.<init>()
            r3.mo14893C(r14)
        L_0x01c8:
            r3.mo15002m0()
            r27 = r14
            com.carrefour.fid.android.product.presentation.viewmodel.details.f r27 = (com.carrefour.fid.android.product.presentation.viewmodel.details.C28122f) r27
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r2)
            java.lang.Object r2 = r3.mo14921N()
            java.lang.Object r14 = r22.mo16277a()
            if (r2 != r14) goto L_0x01e7
            com.carrefour.fid.android.product.presentation.viewmodel.details.e r2 = new com.carrefour.fid.android.product.presentation.viewmodel.details.e
            r2.<init>()
            r3.mo14893C(r2)
        L_0x01e7:
            r3.mo15002m0()
            r28 = r2
            com.carrefour.fid.android.product.presentation.viewmodel.details.e r28 = (com.carrefour.fid.android.product.presentation.viewmodel.details.C28120e) r28
            r14 = r28
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r2 = r3.mo15032w(r2)
            android.content.Context r2 = (android.content.Context) r2
            r29 = r15
            r15 = r2
            r48 = r14
            com.carrefour.fid.android.product.presentation.ui.details.nal.b r14 = new com.carrefour.fid.android.product.presentation.ui.details.nal.b
            r14.<init>(r2)
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$actioner$1 r2 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$actioner$1
            r31 = r0
            r30 = r19
            r0 = r2
            r32 = r1
            r1 = r40
            r34 = r2
            r33 = r16
            r2 = r38
            r35 = r3
            r3 = r46
            r4 = r41
            r5 = r33
            r6 = r30
            r7 = r31
            r8 = r44
            r9 = r17
            r10 = r23
            r11 = r24
            r12 = r39
            r13 = r27
            r16 = r45
            r17 = r43
            r18 = r42
            r19 = r47
            r20 = r25
            r36 = r14
            r14 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$1 r0 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$1
            r12 = r40
            r7 = r30
            r9 = r34
            r0.<init>(r7, r9, r12)
            r8 = 0
            r13 = r35
            r10 = 1
            com.carrefour.fid.android.design.components.compose.BackHandlerComponentKt.m151319a(r8, r0, r13, r8, r10)
            kotlinx.coroutines.flow.e r1 = r38.getSideEffect()
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r0 = r13.mo15032w(r0)
            androidx.lifecycle.w r0 = (androidx.lifecycle.C19499w) r0
            androidx.lifecycle.Lifecycle r2 = r0.getLifecycle()
            r3 = 0
            r5 = 72
            r6 = 4
            r4 = r13
            kotlinx.coroutines.flow.e r0 = com.carrefour.fid.android.shared.extension.FlowKt.m118809b(r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2 r1 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$2
            r15 = r29
            r2 = 0
            r1.<init>(r0, r15, r9, r2)
            r3 = 72
            androidx.compose.runtime.EffectsKt.m29896h(r0, r1, r13, r3)
            androidx.compose.material.ModalBottomSheetValue r0 = r7.mo10285e()
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$3 r1 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$3
            r11 = r33
            r1.<init>(r7, r11, r2)
            r2 = 64
            androidx.compose.runtime.EffectsKt.m29896h(r0, r1, r13, r2)
            java.lang.Object r0 = r32.getValue()
            com.carrefour.fid.android.product.presentation.models.e r0 = (com.carrefour.fid.android.product.presentation.models.C27656e) r0
            com.carrefour.fid.android.shared.type.e r0 = r0.mo80362i()
            r1 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r1)
            r1 = r32
            boolean r2 = r13.mo15006n0(r1)
            java.lang.Object r3 = r13.mo14921N()
            if (r2 != 0) goto L_0x02aa
            java.lang.Object r2 = r22.mo16277a()
            if (r3 != r2) goto L_0x02b2
        L_0x02aa:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$4$1 r3 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$4$1
            r3.<init>(r1)
            r13.mo14893C(r3)
        L_0x02b2:
            r13.mo15002m0()
            r14 = r3
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$5 r16 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$5
            r1 = r16
            r2 = r26
            r3 = r31
            r4 = r39
            r5 = r27
            r6 = r28
            r1.<init>(r2, r3, r4, r5, r6)
            int r5 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            r6 = 0
            r1 = r0
            r2 = r14
            r3 = r16
            r4 = r13
            com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt.m119625a(r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.shared.type.e r0 = r26.mo80362i()
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r1 == 0) goto L_0x0363
            r0 = 411259003(0x1883507b, float:3.394397E-24)
            r13.mo14918M(r0)
            com.carrefour.fid.android.shared.type.e r0 = r26.mo80362i()
            com.carrefour.fid.android.shared.type.e$c r0 = (com.carrefour.fid.android.shared.type.C28892e.C28895c) r0
            java.lang.Object r0 = r0.mo84088d()
            com.carrefour.fid.android.domain.models.product.detail.a r0 = (com.carrefour.fid.android.domain.models.product.detail.C38106a) r0
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r1 = r0.mo118714f()
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r1 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116360a(r1)
            java.lang.Object r2 = r31.getValue()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r2 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r2
            if (r2 != 0) goto L_0x0302
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r2 = r0.mo118714f()
        L_0x0302:
            r3 = r31
            r3.setValue(r2)
            com.carrefour.fid.android.product.presentation.ui.details.nal.o r4 = new com.carrefour.fid.android.product.presentation.ui.details.nal.o
            com.carrefour.fid.android.domain.models.product.detail.e r5 = r0.mo118716h()
            java.lang.Object r3 = r3.getValue()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r3 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r3
            com.carrefour.fid.android.domain.models.product.detail.e r6 = r0.mo118716h()
            java.util.List r6 = r6.mo118720b()
            r8 = r36
            java.util.List r3 = r8.mo80932b(r6, r3)
            r4.<init>(r5, r2, r3, r1)
            java.lang.Integer r1 = r26.mo80360h()
            int r2 = r26.mo80359g()
            java.lang.Object r3 = r15.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            com.carrefour.fid.android.product.presentation.ui.details.nal.a r5 = new com.carrefour.fid.android.product.presentation.ui.details.nal.a
            r5.<init>(r2, r1, r3)
            boolean r6 = r0.mo118715g()
            java.lang.Object r0 = r24.getValue()
            r8 = r0
            com.carrefour.fid.android.product.presentation.ui.details.nal.t r8 = (com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27906t) r8
            java.lang.Object r0 = r11.getValue()
            r3 = r0
            com.carrefour.fid.android.product.presentation.ui.details.nal.i r3 = (com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i) r3
            int r0 = androidx.compose.material.ModalBottomSheetState.f7719e
            int r0 = r0 << 3
            r1 = 1576960(0x181000, float:2.209792E-39)
            r11 = r0 | r1
            r1 = r21
            r2 = r7
            r7 = r23
            r10 = r13
            m116861k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.mo15002m0()
            goto L_0x039c
        L_0x0363:
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r1 == 0) goto L_0x0374
            r0 = 411260612(0x188356c4, float:3.3950317E-24)
            r13.mo14918M(r0)
            m116854d(r9, r13, r8)
            r13.mo15002m0()
            goto L_0x039c
        L_0x0374:
            com.carrefour.fid.android.shared.type.e$d r1 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x037e
            r14 = r10
            goto L_0x0384
        L_0x037e:
            com.carrefour.fid.android.shared.type.e$b r1 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
        L_0x0384:
            if (r14 == 0) goto L_0x0393
            r0 = 411260716(0x1883572c, float:3.3950727E-24)
            r13.mo14918M(r0)
            m116862l(r9, r13, r8)
            r13.mo15002m0()
            goto L_0x039c
        L_0x0393:
            r0 = 411260790(0x18835776, float:3.395102E-24)
            r13.mo14918M(r0)
            r13.mo15002m0()
        L_0x039c:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03a5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03a5:
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x03ac
            goto L_0x03cb
        L_0x03ac:
            com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$6 r14 = new com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$6
            r0 = r14
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r9 = r46
            r10 = r47
            r11 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.mo15202a(r14)
        L_0x03cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodProductDetailsScreenKt.m116863m(com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel, com.carrefour.fid.android.product.presentation.viewmodel.details.g, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: n */
    public static final void m116864n(Map<PictureSize, ? extends List<ProductPicture>> map, C8767m mVar, C8592o oVar, int i) {
        List list;
        List list2;
        C8592o o = oVar.mo15009o(769798213);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(769798213, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ProductImage (NonFoodProductDetailsScreen.kt:767)");
        }
        C3036d1 f = ScaffoldKt.m13752f((DrawerState) null, (SnackbarHostState) null, o, 0, 3);
        o.mo14918M(773894976);
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
            o.mo14893C(wVar);
            N = wVar;
        }
        o.mo15002m0();
        C12074o0 a = ((C8690w) N).mo16831a();
        o.mo15002m0();
        C8767m m = PaddingKt.m10026m(AspectRatioKt.m9820b(SizeKt.m10114n(PaddingKt.m10028o(mVar, 0.0f, 0.0f, 0.0f, C37474a.f94133a.mo114200w(), 7, (Object) null), 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), 0.0f, C16483g.m74435M((float) 8), 1, (Object) null);
        List list3 = (List) map.get(PictureSize.Medium);
        if (list3 != null) {
            Iterable<ProductPicture> iterable = list3;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (ProductPicture e : iterable) {
                arrayList.add(e.mo118573e());
            }
            list = arrayList;
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list4 = (List) map.get(PictureSize.Large);
        if (list4 != null) {
            Iterable<ProductPicture> iterable2 = list4;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (ProductPicture e2 : iterable2) {
                arrayList2.add(e2.mo118573e());
            }
            list2 = arrayList2;
        } else {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        CarouselComponentKt.m151349b(m, list, list2, new NonFoodProductDetailsScreenKt$ProductImage$3(a, f), o, 576, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodProductDetailsScreenKt$ProductImage$4(map, mVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: o */
    public static final void m116865o(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(-1769238408);
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
                ComposerKt.m29845w0(-1769238408, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.ProductTitle (NonFoodProductDetailsScreen.kt:870)");
            }
            if (!C11622t.isBlank(str)) {
                oVar2 = o;
                TextKt.m14196c(str, PaddingKt.m10028o(SizeKt.m10100P(C8767m.f23478j, C8734c.f23406a.mo17072u(), false, 2, (Object) null), 0.0f, C37474a.f94133a.mo114177C(), 0.0f, 0.0f, 13, (Object) null), C16009b.m71825a(C27609f.C27615f.ds_grey_5, o, 0), 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, C16449r.f40760b.mo47727c(), false, 2, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j(), oVar2, (i2 & 14) | C20022q.C20025c.f51280k, 3120, 55256);
            } else {
                oVar2 = o;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new NonFoodProductDetailsScreenKt$ProductTitle$1(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: p */
    public static final void m116866p(Double d, C11289a<C11079d2> aVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(-1965124861);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(d)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
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
                aVar = NonFoodProductDetailsScreenKt$RepairabilityComponent$1.f67451f;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1965124861, i3, -1, "com.carrefour.fid.android.product.presentation.ui.details.nal.RepairabilityComponent (NonFoodProductDetailsScreen.kt:804)");
            }
            if (d == null) {
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
                C8678t1 s = o.mo15020s();
                if (s != null) {
                    s.mo15202a(new NonFoodProductDetailsScreenKt$RepairabilityComponent$2(d, aVar, i, i2));
                    return;
                }
                return;
            }
            HorizontalBlockComponentKt.m117208a(C16018i.m71858d(C27609f.C27627r.pdp_repairability_title, o, 0), PaddingKt.m10028o(C8767m.f23478j, 0.0f, C37474a.f94133a.mo114200w(), 0.0f, 0.0f, 13, (Object) null), aVar, C8553b.m31048b(o, 1463225455, true, new NonFoodProductDetailsScreenKt$RepairabilityComponent$3(d, i3)), o, ((i3 << 3) & 896) | 3072, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new NonFoodProductDetailsScreenKt$RepairabilityComponent$4(d, aVar, i, i2));
        }
    }
}
