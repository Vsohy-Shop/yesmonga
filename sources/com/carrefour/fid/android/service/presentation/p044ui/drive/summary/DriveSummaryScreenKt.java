package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C3036d1;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
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
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.components.compose.MessageComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a=\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001aa\u0010\u0013\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001aA\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0010H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u001a\u001f\u0010!\u001a\u00020\u00052\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0005H\u0003¢\u0006\u0004\b#\u0010\u001c\u001a\u000f\u0010$\u001a\u00020\u0005H\u0003¢\u0006\u0004\b$\u0010\u001c\u001a\u000f\u0010%\u001a\u00020\u0005H\u0003¢\u0006\u0004\b%\u0010\u001c¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryViewModel;", "viewModel", "", "distanceMeters", "Lkotlin/Function0;", "Lkotlin/d2;", "onNavigationBack", "onNavigateToHome", "DriveSummaryScreen", "(Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryViewModel;FLkotlin/jvm/functions/a;Lkotlin/jvm/functions/a;Landroidx/compose/runtime/o;II)V", "Lcom/carrefour/fid/android/service/presentation/ui/drive/summary/DrivePoint;", "drivePoint", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "selection", "", "validateEnabled", "Lkotlin/Function1;", "onDriveTypeSelection", "onValidate", "DriveSummary", "(Lkotlin/jvm/functions/a;Lcom/carrefour/fid/android/service/presentation/ui/drive/summary/DrivePoint;FLcom/carrefour/fid/android/domain/models/service/models/DriveType;ZLkotlin/jvm/functions/l;Lkotlin/jvm/functions/a;Landroidx/compose/runtime/o;II)V", "", "storeName", "", "driveTypeList", "DriveTypeSelection", "(Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/service/models/DriveType;Lkotlin/jvm/functions/l;Landroidx/compose/runtime/o;I)V", "LoadingScreen", "(Landroidx/compose/runtime/o;I)V", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "formatAddress", "onRetry", "ErrorScreen", "(Lkotlin/jvm/functions/a;Landroidx/compose/runtime/o;II)V", "DriveSummaryPreview", "LoadingScreenPreview", "ErrorScreenPreview", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveSummaryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveSummaryScreen.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryScreenKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,300:1\n43#2,6:301\n45#3,3:307\n25#4:310\n36#4:317\n460#4,13:343\n50#4:358\n49#4:359\n67#4,3:366\n66#4:369\n460#4,13:395\n50#4:409\n49#4:410\n473#4,3:417\n473#4,3:422\n460#4,13:446\n460#4,13:482\n473#4,3:496\n460#4,13:519\n460#4,13:553\n473#4,3:570\n473#4,3:575\n460#4,13:602\n473#4,3:616\n473#4,3:621\n25#4:626\n1114#5,6:311\n1114#5,6:318\n1114#5,6:360\n1114#5,6:370\n1114#5,6:411\n1114#5,6:627\n74#6,6:324\n80#6:356\n84#6:426\n74#6,6:427\n80#6:459\n73#6,7:533\n80#6:566\n84#6:574\n84#6:625\n75#7:330\n76#7,11:332\n75#7:382\n76#7,11:384\n89#7:420\n89#7:425\n75#7:433\n76#7,11:435\n75#7:469\n76#7,11:471\n89#7:499\n75#7:506\n76#7,11:508\n75#7:540\n76#7,11:542\n89#7:573\n89#7:578\n75#7:589\n76#7,11:591\n89#7:619\n89#7:624\n76#8:331\n76#8:383\n76#8:434\n76#8:470\n76#8:507\n76#8:541\n76#8:590\n154#9:357\n154#9:460\n154#9:461\n154#9:462\n154#9:567\n154#9:568\n154#9:569\n154#9:580\n154#9:581\n154#9:582\n75#10,6:376\n81#10:408\n85#10:421\n75#10,6:463\n81#10:495\n85#10:500\n76#10,5:501\n81#10:532\n85#10:579\n75#10,6:583\n81#10:615\n85#10:620\n76#11:633\n76#11:634\n76#11:635\n102#11,2:636\n76#11:638\n102#11,2:639\n*S KotlinDebug\n*F\n+ 1 DriveSummaryScreen.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryScreenKt\n*L\n59#1:301,6\n59#1:307,3\n87#1:310\n95#1:317\n169#1:343,13\n180#1:358\n180#1:359\n181#1:366,3\n181#1:369\n177#1:395,13\n189#1:409\n189#1:410\n177#1:417,3\n169#1:422,3\n204#1:446,13\n205#1:482,13\n205#1:496,3\n213#1:519,13\n215#1:553,13\n215#1:570,3\n213#1:575,3\n232#1:602,13\n232#1:616,3\n204#1:621,3\n267#1:626\n87#1:311,6\n95#1:318,6\n180#1:360,6\n181#1:370,6\n189#1:411,6\n267#1:627,6\n169#1:324,6\n169#1:356\n169#1:426\n204#1:427,6\n204#1:459\n215#1:533,7\n215#1:566\n215#1:574\n204#1:625\n169#1:330\n169#1:332,11\n177#1:382\n177#1:384,11\n177#1:420\n169#1:425\n204#1:433\n204#1:435,11\n205#1:469\n205#1:471,11\n205#1:499\n213#1:506\n213#1:508,11\n215#1:540\n215#1:542,11\n215#1:573\n213#1:578\n232#1:589\n232#1:591,11\n232#1:619\n204#1:624\n169#1:331\n177#1:383\n204#1:434\n205#1:470\n213#1:507\n215#1:541\n232#1:590\n171#1:357\n208#1:460\n209#1:461\n210#1:462\n218#1:567\n223#1:568\n224#1:569\n235#1:580\n236#1:581\n237#1:582\n177#1:376,6\n177#1:408\n177#1:421\n205#1:463,6\n205#1:495\n205#1:500\n213#1:501,5\n213#1:532\n213#1:579\n232#1:583,6\n232#1:615\n232#1:620\n64#1:633\n65#1:634\n87#1:635\n87#1:636,2\n267#1:638\n267#1:639,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt */
public final class DriveSummaryScreenKt {
    /* access modifiers changed from: private */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void DriveSummary(C11289a<C11079d2> aVar, DrivePoint drivePoint, float f, DriveType driveType, boolean z, C11300l<? super DriveType, C11079d2> lVar, C11289a<C11079d2> aVar2, C8592o oVar, int i, int i2) {
        DriveSummaryScreenKt$DriveSummary$1 driveSummaryScreenKt$DriveSummary$1;
        int i3 = i;
        C8592o o = oVar.mo15009o(-1445953476);
        if ((i2 & 1) != 0) {
            driveSummaryScreenKt$DriveSummary$1 = DriveSummaryScreenKt$DriveSummary$1.INSTANCE;
        } else {
            driveSummaryScreenKt$DriveSummary$1 = aVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1445953476, i3, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummary (DriveSummaryScreen.kt:102)");
        }
        C8552a b = C8553b.m31048b(o, -138331519, true, new DriveSummaryScreenKt$DriveSummary$2(driveSummaryScreenKt$DriveSummary$1, i3));
        DriveSummaryScreenKt$DriveSummary$3 driveSummaryScreenKt$DriveSummary$3 = r0;
        C11289a<C11079d2> aVar3 = driveSummaryScreenKt$DriveSummary$1;
        C8592o oVar2 = o;
        DriveSummaryScreenKt$DriveSummary$3 driveSummaryScreenKt$DriveSummary$32 = new DriveSummaryScreenKt$DriveSummary$3(drivePoint, driveType, lVar, i, f, aVar2, z);
        C8592o oVar3 = oVar2;
        ScaffoldKt.m13747a((C8767m) null, (C3036d1) null, b, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar2, 2043531770, true, driveSummaryScreenKt$DriveSummary$3), oVar2, C22132b.f56831b, 12582912, 131067);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar3.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveSummaryScreenKt$DriveSummary$4(aVar3, drivePoint, f, driveType, z, lVar, aVar2, i, i2));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C16464c(heightDp = 700, showBackground = true, widthDp = 350)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void DriveSummaryPreview(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1183705455);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1183705455, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryPreview (DriveSummaryScreen.kt:264)");
            }
            List L = CollectionsKt__CollectionsKt.m40448L(DriveType.DRIVE_IN_STORE, DriveType.DRIVE_PEDESTRIAN);
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C8539f2.m30981g(CollectionsKt___CollectionsKt.m40706w2(L), (C8410b2) null, 2, (Object) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            ThemeKt.m153788a(C8553b.m31048b(o, -423535122, true, new DriveSummaryScreenKt$DriveSummaryPreview$1(L, (C8700z0) N)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveSummaryScreenKt$DriveSummaryPreview$2(i));
        }
    }

    /* access modifiers changed from: private */
    public static final DriveType DriveSummaryPreview$lambda$18(C8700z0<DriveType> z0Var) {
        return z0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void DriveSummaryPreview$lambda$19(C8700z0<DriveType> z0Var, DriveType driveType) {
        z0Var.setValue(driveType);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x023a  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DriveSummaryScreen(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r26, float r27, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r10 = r28
            r11 = r29
            r12 = r31
            java.lang.String r0 = "onNavigationBack"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onNavigateToHome"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -1684192603(0xffffffff9b9d42a5, float:-2.601654E-22)
            r1 = r30
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0020
            r2 = r12 | 2
            goto L_0x0021
        L_0x0020:
            r2 = r12
        L_0x0021:
            r3 = r32 & 2
            if (r3 == 0) goto L_0x002a
            r2 = r2 | 48
            r8 = r27
            goto L_0x003c
        L_0x002a:
            r3 = r12 & 112(0x70, float:1.57E-43)
            r8 = r27
            if (r3 != 0) goto L_0x003c
            boolean r3 = r9.mo14968d(r8)
            if (r3 == 0) goto L_0x0039
            r3 = 32
            goto L_0x003b
        L_0x0039:
            r3 = 16
        L_0x003b:
            r2 = r2 | r3
        L_0x003c:
            r3 = r32 & 4
            if (r3 == 0) goto L_0x0043
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0053
        L_0x0043:
            r3 = r12 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0053
            boolean r3 = r9.mo14927P(r10)
            if (r3 == 0) goto L_0x0050
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0052
        L_0x0050:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0052:
            r2 = r2 | r3
        L_0x0053:
            r3 = r32 & 8
            if (r3 == 0) goto L_0x005a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x006a
        L_0x005a:
            r3 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x006a
            boolean r3 = r9.mo14927P(r11)
            if (r3 == 0) goto L_0x0067
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0069
        L_0x0067:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0069:
            r2 = r2 | r3
        L_0x006a:
            r13 = r2
            r15 = 1
            if (r1 != r15) goto L_0x0083
            r2 = r13 & 5851(0x16db, float:8.199E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r2 != r3) goto L_0x0083
            boolean r2 = r9.mo15011p()
            if (r2 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            r9.mo14958a0()
            r1 = r26
            r14 = r9
            goto L_0x023e
        L_0x0083:
            r9.mo14930Q()
            r2 = r12 & 1
            r14 = 8
            if (r2 == 0) goto L_0x009b
            boolean r2 = r9.mo14977f0()
            if (r2 == 0) goto L_0x0093
            goto L_0x009b
        L_0x0093:
            r9.mo14958a0()
            if (r1 == 0) goto L_0x00d9
            r13 = r13 & -15
            goto L_0x00d9
        L_0x009b:
            if (r1 == 0) goto L_0x00d9
            r1 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r9.mo14918M(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r2 = r1.mo57681a(r9, r14)
            if (r2 == 0) goto L_0x00cd
            androidx.lifecycle.x0$b r4 = androidx.hilt.navigation.compose.C19298a.m90444a(r2, r9, r14)
            r1 = 564614654(0x21a755fe, float:1.1339122E-18)
            r9.mo14918M(r1)
            r3 = 0
            java.lang.Class<com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel> r1 = com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel.class
            r6 = 4168(0x1048, float:5.84E-42)
            r7 = 0
            r5 = r9
            androidx.lifecycle.v0 r1 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r1, r2, r3, r4, r5, r6, r7)
            r9.mo15002m0()
            r9.mo15002m0()
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel r1 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel) r1
            r13 = r13 & -15
            r7 = r13
            r13 = r1
            goto L_0x00dc
        L_0x00cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d9:
            r7 = r13
            r13 = r26
        L_0x00dc:
            r9.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00eb
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreen (DriveSummaryScreen.kt:57)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r1, r2)
        L_0x00eb:
            kotlinx.coroutines.flow.u r0 = r13.getDataState()
            r6 = 0
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30233b(r0, r6, r9, r14, r15)
            kotlinx.coroutines.flow.u r1 = r13.getValidateEnabled()
            androidx.compose.runtime.k2 r24 = androidx.compose.runtime.C8415c2.m30233b(r1, r6, r9, r14, r15)
            kotlinx.coroutines.flow.e r1 = r13.getNavigateToHomeEvent()
            r2 = 0
            r3 = 0
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$1 r4 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$1
            r4.<init>(r11)
            r14 = 8
            r16 = 6
            r5 = r9
            r6 = r14
            r25 = r7
            r7 = r16
            com.carrefour.fid.android.shared.extension.FlowKt.m118808a(r1, r2, r3, r4, r5, r6, r7)
            r1 = 0
            r14 = 0
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$2 r3 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$2
            r3.<init>(r13)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 247(0xf7, float:3.46E-43)
            r7 = r13
            r13 = r1
            r1 = r15
            r15 = r2
            r16 = r3
            r21 = r9
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt.m119612a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.carrefour.fid.android.shared.type.e r0 = DriveSummaryScreen$lambda$0(r0)
            com.carrefour.fid.android.shared.type.e$b r2 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0140
            r15 = r1
            goto L_0x0146
        L_0x0140:
            com.carrefour.fid.android.shared.type.e$d r1 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
        L_0x0146:
            r1 = 0
            if (r15 == 0) goto L_0x0159
            r0 = -1985991681(0xffffffff89a02bff, float:-3.8559973E-33)
            r9.mo14918M(r0)
            LoadingScreen(r9, r1)
            r9.mo15002m0()
        L_0x0155:
            r13 = r7
            r14 = r9
            goto L_0x0234
        L_0x0159:
            boolean r2 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r2 == 0) goto L_0x016f
            r0 = -1985991633(0xffffffff89a02c2f, float:-3.856015E-33)
            r9.mo14918M(r0)
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$3 r0 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$3
            r0.<init>(r7)
            ErrorScreen(r0, r9, r1, r1)
            r9.mo15002m0()
            goto L_0x0155
        L_0x016f:
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r1 == 0) goto L_0x0229
            r1 = -1985991557(0xffffffff89a02c7b, float:-3.8560428E-33)
            r9.mo14918M(r1)
            com.carrefour.fid.android.shared.type.e$c r0 = (com.carrefour.fid.android.shared.type.C28892e.C28895c) r0
            java.lang.Object r1 = r0.mo84088d()
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState r1 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState) r1
            com.carrefour.fid.android.domain.models.service.models.l r1 = r1.getStore()
            java.lang.String r1 = r1.mo119361E()
            java.lang.Object r2 = r0.mo84088d()
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState r2 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState) r2
            com.carrefour.fid.android.domain.models.service.models.l r2 = r2.getStore()
            java.lang.String r2 = r2.mo119394x()
            java.lang.Object r3 = r0.mo84088d()
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState r3 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState) r3
            java.util.List r3 = r3.getDriveTypes()
            java.lang.Object r0 = r0.mo84088d()
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState r0 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryState) r0
            com.carrefour.fid.android.domain.models.service.models.l r0 = r0.getStore()
            java.lang.String r0 = formatAddress(r0)
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DrivePoint r4 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DrivePoint
            r4.<init>(r1, r2, r3, r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.mo14918M(r0)
            java.lang.Object r0 = r9.mo14921N()
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r1.mo16277a()
            if (r0 != r2) goto L_0x01d3
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r3)
            r2 = 2
            r3 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r3, r2, r3)
            r9.mo14893C(r0)
        L_0x01d3:
            r9.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            com.carrefour.fid.android.domain.models.service.models.DriveType r3 = DriveSummaryScreen$lambda$3(r0)
            boolean r5 = DriveSummaryScreen$lambda$1(r24)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r9.mo14918M(r2)
            boolean r2 = r9.mo15006n0(r0)
            java.lang.Object r6 = r9.mo14921N()
            if (r2 != 0) goto L_0x01f6
            java.lang.Object r1 = r1.mo16277a()
            if (r6 != r1) goto L_0x01fe
        L_0x01f6:
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$4$1 r6 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$4$1
            r6.<init>(r0)
            r9.mo14893C(r6)
        L_0x01fe:
            r9.mo15002m0()
            kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$5 r13 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$5
            r13.<init>(r7, r0)
            int r0 = r25 >> 6
            r0 = r0 & 14
            r0 = r0 | 64
            int r1 = r25 << 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r14 = r0 | r1
            r15 = 0
            r0 = r28
            r1 = r4
            r2 = r27
            r4 = r5
            r5 = r6
            r6 = r13
            r13 = r7
            r7 = r9
            r8 = r14
            r14 = r9
            r9 = r15
            DriveSummary(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r14.mo15002m0()
            goto L_0x0234
        L_0x0229:
            r13 = r7
            r14 = r9
            r0 = -1985990873(0xffffffff89a02f27, float:-3.856294E-33)
            r14.mo14918M(r0)
            r14.mo15002m0()
        L_0x0234:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x023d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x023d:
            r1 = r13
        L_0x023e:
            androidx.compose.runtime.t1 r7 = r14.mo15020s()
            if (r7 != 0) goto L_0x0245
            goto L_0x0258
        L_0x0245:
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$6 r8 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$6
            r0 = r8
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r31
            r6 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.summary.DriveSummaryScreenKt.DriveSummaryScreen(com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel, float, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    private static final C28892e<DriveSummaryState> DriveSummaryScreen$lambda$0(C8578k2<? extends C28892e<DriveSummaryState>> k2Var) {
        return (C28892e) k2Var.getValue();
    }

    private static final boolean DriveSummaryScreen$lambda$1(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final DriveType DriveSummaryScreen$lambda$3(C8700z0<DriveType> z0Var) {
        return z0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void DriveSummaryScreen$lambda$4(C8700z0<DriveType> z0Var, DriveType driveType) {
        z0Var.setValue(driveType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: kotlin.jvm.functions.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DriveTypeSelection(java.lang.String r35, java.util.List<? extends com.carrefour.fid.android.domain.models.service.models.DriveType> r36, com.carrefour.fid.android.domain.models.service.models.DriveType r37, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.domain.models.service.models.DriveType, kotlin.C11079d2> r38, androidx.compose.runtime.C8592o r39, int r40) {
        /*
            r3 = r37
            r4 = r38
            r0 = -1580863437(0xffffffffa1c5f033, float:-1.3412819E-18)
            r1 = r39
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x001c
            r2 = -1
            java.lang.String r5 = "com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveTypeSelection (DriveSummaryScreen.kt:162)"
            r14 = r40
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r2, r5)
            goto L_0x001e
        L_0x001c:
            r14 = r40
        L_0x001e:
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r0 = 0
            r2 = 1
            r15 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10114n(r6, r0, r2, r15)
            r7 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r7)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r7 = r7.mo7631r()
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r8 = r8.mo17072u()
            r13 = 0
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.ColumnKt.m9863b(r7, r8, r1, r13)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r12)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r15 = r1.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x0077
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0077:
            r1.mo14938T()
            boolean r15 = r1.mo14997l()
            if (r15 == 0) goto L_0x0084
            r1.mo14947W(r12)
            goto L_0x0087
        L_0x0084:
            r1.mo14888A()
        L_0x0087:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r15)
            kotlin.jvm.functions.p r7 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r7)
            kotlin.jvm.functions.p r7 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r7)
            kotlin.jvm.functions.p r7 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r7)
            r1.mo14972e()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r7 = androidx.compose.runtime.C8684u1.m31905a(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r5.invoke(r7, r1, r8)
            r15 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r15)
            androidx.compose.foundation.layout.ColumnScopeInstance r5 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r5 = 16
            float r5 = (float) r5
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r10 = 0
            r11 = 8
            r12 = 0
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10028o(r6, r7, r8, r9, r10, r11, r12)
            int r7 = com.carrefour.fid.android.service.C28330R.string.drive_multi_selection
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r7, r1, r13)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r13] = r35
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
            java.lang.String r7 = java.lang.String.format(r7, r8)
            r12 = r5
            r5 = r7
            java.lang.String r8 = "format(this, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r30 = 14
            long r9 = androidx.compose.p004ui.unit.C16506u.m74712m(r30)
            r7 = 0
            r11 = 0
            r17 = 0
            r12 = r17
            r0 = r13
            r13 = r17
            r17 = 0
            r14 = r17
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 3120(0xc30, float:4.372E-42)
            r28 = 0
            r29 = 131060(0x1fff4, float:1.83654E-40)
            r26 = r1
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5 = 601533769(0x23daad49, float:2.3708996E-17)
            r1.mo14918M(r5)
            java.util.Iterator r34 = r36.iterator()
        L_0x0133:
            boolean r5 = r34.hasNext()
            if (r5 == 0) goto L_0x030b
            java.lang.Object r5 = r34.next()
            r15 = r5
            com.carrefour.fid.android.domain.models.service.models.DriveType r15 = (com.carrefour.fid.android.domain.models.service.models.DriveType) r15
            int r5 = com.carrefour.fid.android.service.presentation.p044ui.drive.map.component.CommonKt.getDriveLabelId(r15)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r1, r0)
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r13 = 0
            r14 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r6, r13, r2, r14)
            r17 = 0
            r18 = 0
            r19 = 0
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r6)
            boolean r7 = r1.mo15006n0(r4)
            boolean r8 = r1.mo15006n0(r15)
            r7 = r7 | r8
            java.lang.Object r8 = r1.mo14921N()
            if (r7 != 0) goto L_0x0173
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r8 != r7) goto L_0x017b
        L_0x0173:
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$1$1$1 r8 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$1$1$1
            r8.<init>(r4, r15)
            r1.mo14893C(r8)
        L_0x017b:
            r1.mo15002m0()
            r20 = r8
            kotlin.jvm.functions.a r20 = (kotlin.jvm.functions.C11289a) r20
            r21 = 7
            r22 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            r8 = 1618982084(0x607fb4c4, float:7.370227E19)
            r1.mo14918M(r8)
            boolean r8 = r1.mo15006n0(r15)
            boolean r9 = r1.mo15006n0(r3)
            r8 = r8 | r9
            boolean r9 = r1.mo15006n0(r5)
            r8 = r8 | r9
            java.lang.Object r9 = r1.mo14921N()
            if (r8 != 0) goto L_0x01ac
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r9 != r8) goto L_0x01b4
        L_0x01ac:
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$1$2$1 r9 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$1$2$1
            r9.<init>(r15, r3, r5)
            r1.mo14893C(r9)
        L_0x01b4:
            r1.mo15002m0()
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            androidx.compose.ui.m r5 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71866a(r7, r9)
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r7 = r7.mo17070q()
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r8 = r8.mo7630p()
            r9 = 48
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.RowKt.m10071d(r8, r7, r1, r9)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r12)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r2 = r11.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r12 = r1.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x020e
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x020e:
            r1.mo14938T()
            boolean r12 = r1.mo14997l()
            if (r12 == 0) goto L_0x021b
            r1.mo14947W(r2)
            goto L_0x021e
        L_0x021b:
            r1.mo14888A()
        L_0x021e:
            r1.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r12 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r7, r12)
            kotlin.jvm.functions.p r7 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r8, r7)
            kotlin.jvm.functions.p r7 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r9, r7)
            kotlin.jvm.functions.p r7 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r10, r7)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5.invoke(r2, r1, r7)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r2)
            androidx.compose.foundation.layout.RowScopeInstance r5 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            if (r15 != r3) goto L_0x0260
            r16 = 1
            goto L_0x0262
        L_0x0260:
            r16 = r0
        L_0x0262:
            r1.mo14918M(r6)
            boolean r5 = r1.mo15006n0(r4)
            boolean r6 = r1.mo15006n0(r15)
            r5 = r5 | r6
            java.lang.Object r6 = r1.mo14921N()
            if (r5 != 0) goto L_0x027c
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x0284
        L_0x027c:
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$1$3$1$1 r6 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$1$3$1$1
            r6.<init>(r4, r15)
            r1.mo14893C(r6)
        L_0x0284:
            r1.mo15002m0()
            r17 = r6
            kotlin.jvm.functions.a r17 = (kotlin.jvm.functions.C11289a) r17
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.material.b1 r5 = androidx.compose.material.C3030b1.f8083a
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            int r7 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.q r6 = r6.mo11075a(r1, r7)
            long r6 = r6.mo10971j()
            r8 = 0
            r10 = 0
            int r12 = androidx.compose.material.C3030b1.f8084b
            int r21 = r12 << 9
            r22 = 6
            r31 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12 = r1
            r32 = r13
            r13 = r21
            r33 = r14
            r14 = r22
            androidx.compose.material.a1 r10 = r5.mo10719a(r6, r8, r10, r12, r13, r14)
            r12 = 0
            r13 = 28
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r11 = r1
            androidx.compose.material.RadioButtonKt.m13736a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            int r5 = com.carrefour.fid.android.service.presentation.p044ui.drive.map.component.CommonKt.getDriveLabelId(r15)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r1, r0)
            r6 = 0
            r7 = 0
            long r9 = androidx.compose.p004ui.unit.C16506u.m74712m(r30)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 3072(0xc00, float:4.305E-42)
            r28 = 0
            r29 = 131062(0x1fff6, float:1.83657E-40)
            r26 = r1
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r2 = 1
            goto L_0x0133
        L_0x030b:
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0323
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0323:
            androidx.compose.runtime.t1 r6 = r1.mo15020s()
            if (r6 != 0) goto L_0x032a
            goto L_0x033d
        L_0x032a:
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$2 r7 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$2
            r0 = r7
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r40
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x033d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.summary.DriveSummaryScreenKt.DriveTypeSelection(java.lang.String, java.util.List, com.carrefour.fid.android.domain.models.service.models.DriveType, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* access modifiers changed from: private */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void ErrorScreen(C11289a<C11079d2> aVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(1686699613);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo14927P(aVar)) {
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
                aVar = DriveSummaryScreenKt$ErrorScreen$1.INSTANCE;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1686699613, i3, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.ErrorScreen (DriveSummaryScreen.kt:254)");
            }
            MessageComponentKt.m151547d((C8767m) null, C28330R.C28332drawable.ds_il_search_location_error, C16018i.m71858d(C28330R.string.general_error_parameters_server_not_responding_01, o, 0), aVar, o, (i3 << 9) & 7168, 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveSummaryScreenKt$ErrorScreen$2(aVar, i, i2));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C16464c(heightDp = 500, showBackground = true, widthDp = 350)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void ErrorScreenPreview(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(912792909);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(912792909, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.ErrorScreenPreview (DriveSummaryScreen.kt:294)");
            }
            ThemeKt.m153788a(ComposableSingletons$DriveSummaryScreenKt.INSTANCE.m172914getLambda4$service_release(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveSummaryScreenKt$ErrorScreenPreview$1(i));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void LoadingScreen(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(-1760918731);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1760918731, i2, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.LoadingScreen (DriveSummaryScreen.kt:202)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m l = SizeKt.m10112l(aVar, 0.0f, 1, (Object) null);
            o.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2279l r = arrangement.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            int i3 = 0;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(l);
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
            int i4 = 2058660585;
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            float f2 = (float) 16;
            float f3 = (float) 8;
            C8767m a2 = C37019o.m151908a(PaddingKt.m10024k(SizeKt.m10115o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M((float) 120)), C16483g.m74435M(f2)), true, C2694o.m12166h(C16483g.m74435M(f3)));
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(arrangement.mo7630p(), aVar2.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(a2);
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
            C8592o b3 = Updater.m30180b(o);
            Updater.m30188j(b3, d, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            o.mo14972e();
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            Arrangement.C2271e j = arrangement.mo7627j();
            o.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(j, aVar2.mo17073w(), o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a4 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(n);
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
            C8592o b4 = Updater.m30180b(o);
            Updater.m30188j(b4, d2, companion.mo44588d());
            Updater.m30188j(b4, dVar3, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b4, c4Var3, companion.mo44590f());
            o.mo14972e();
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            o.mo14918M(119197419);
            int i5 = 0;
            while (i5 < 3) {
                C8734c.C8736b m = C8734c.f23406a.mo17068m();
                o.mo14918M(-483455358);
                C8767m.C8768a aVar3 = C8767m.f23478j;
                C15560f0 b5 = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), m, o, 48);
                o.mo14918M(-1323940314);
                C16479d dVar4 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection4 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var4 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion2 = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a5 = companion2.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(aVar3);
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
                C8592o b6 = Updater.m30180b(o);
                Updater.m30188j(b6, b5, companion2.mo44588d());
                Updater.m30188j(b6, dVar4, companion2.mo44586b());
                Updater.m30188j(b6, layoutDirection4, companion2.mo44587c());
                Updater.m30188j(b6, c4Var4, companion2.mo44590f());
                o.mo14972e();
                f6.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf(i3));
                o.mo14918M(i4);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f6049a;
                C8767m a6 = C37019o.m151908a(SizeKt.m10087C(aVar3, C16483g.m74435M((float) 30)), true, C2694o.m12169k());
                ComposableSingletons$DriveSummaryScreenKt composableSingletons$DriveSummaryScreenKt = ComposableSingletons$DriveSummaryScreenKt.INSTANCE;
                float f7 = f3;
                int i6 = i4;
                C8592o oVar2 = o;
                SurfaceKt.m13879b(a6, (C15218g4) null, 0, 0, (C2223i) null, 0.0f, composableSingletons$DriveSummaryScreenKt.m172911getLambda1$service_release(), oVar2, 1572864, 62);
                SurfaceKt.m13879b(C37019o.m151909b(SizeKt.m10089E(PaddingKt.m10026m(aVar3, 0.0f, C16483g.m74435M(f7), 1, (Object) null), C16483g.m74435M((float) 60), C16483g.m74435M((float) 15)), true, (C15218g4) null, 2, (Object) null), (C15218g4) null, 0, 0, (C2223i) null, 0.0f, composableSingletons$DriveSummaryScreenKt.m172912getLambda2$service_release(), oVar2, 1572864, 62);
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
                i5++;
                int i7 = i;
                f2 = f2;
                f3 = f7;
                i3 = 0;
                i4 = 2058660585;
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            C8767m.C8768a aVar4 = C8767m.f23478j;
            C2428y0.m10726a(C2373k.m10461c(columnScopeInstance, aVar4, 1.0f, false, 2, (Object) null), o, 0);
            C8767m a7 = C37019o.m151908a(SizeKt.m10115o(PaddingKt.m10024k(SizeKt.m10114n(aVar4, 0.0f, 1, (Object) null), C16483g.m74435M(f2)), C16483g.m74435M((float) 56)), true, C2694o.m12166h(C16483g.m74435M((float) 4)));
            o.mo14918M(693286680);
            C15560f0 d3 = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar5 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection5 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var5 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion3 = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a8 = companion3.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f8 = LayoutKt.m68908f(a7);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a8);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b7 = Updater.m30180b(o);
            Updater.m30188j(b7, d3, companion3.mo44588d());
            Updater.m30188j(b7, dVar5, companion3.mo44586b());
            Updater.m30188j(b7, layoutDirection5, companion3.mo44587c());
            Updater.m30188j(b7, c4Var5, companion3.mo44590f());
            o.mo14972e();
            f8.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6147a;
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
            s.mo15202a(new DriveSummaryScreenKt$LoadingScreen$2(i));
        }
    }

    /* access modifiers changed from: private */
    @C8540g
    @C16464c(heightDp = 500, showBackground = true, widthDp = 350)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public static final void LoadingScreenPreview(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(342342401);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(342342401, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.LoadingScreenPreview (DriveSummaryScreen.kt:286)");
            }
            ThemeKt.m153788a(ComposableSingletons$DriveSummaryScreenKt.INSTANCE.m172913getLambda3$service_release(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DriveSummaryScreenKt$LoadingScreenPreview$1(i));
        }
    }

    private static final String formatAddress(C38163l lVar) {
        StoreAddress v = lVar.mo119392v();
        if (v == null) {
            return "";
        }
        String h = v.mo119126h();
        String l = v.mo119131l();
        String j = v.mo119129j();
        return h + "\n" + l + " " + j;
    }
}
