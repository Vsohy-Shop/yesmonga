package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.annotation.C0358n;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
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
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.BannerComponentKt;
import com.carrefour.fid.android.design.components.compose.C36989i;
import com.carrefour.fid.android.design.components.widgets.productcard.C37357d;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.C38015d;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import java.util.List;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nLoyaltyBlocStatefull.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyBlocStatefull.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/LoyaltyBlocStatefullKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,541:1\n154#2:542\n154#2:543\n154#2:577\n154#2:578\n154#2:579\n154#2:580\n154#2:593\n154#2:627\n154#2:628\n154#2:629\n154#2:630\n154#2:643\n154#2:677\n154#2:711\n154#2:717\n154#2:761\n154#2:769\n154#2:803\n154#2:837\n154#2:843\n154#2:887\n154#2:1026\n154#2:1034\n154#2:1045\n154#2:1046\n74#3,6:544\n80#3:576\n84#3:592\n74#3,6:594\n80#3:626\n84#3:642\n74#3,6:678\n80#3:710\n84#3:716\n74#3,6:718\n80#3:750\n84#3:755\n74#3,6:804\n80#3:836\n84#3:842\n74#3,6:844\n80#3:876\n84#3:881\n74#3,6:955\n80#3:987\n84#3:992\n74#3,6:993\n80#3:1025\n84#3:1039\n75#4:550\n76#4,11:552\n89#4:591\n75#4:600\n76#4,11:602\n89#4:641\n75#4:650\n76#4,11:652\n75#4:684\n76#4,11:686\n89#4:715\n75#4:724\n76#4,11:726\n89#4:754\n89#4:759\n75#4:776\n76#4,11:778\n75#4:810\n76#4,11:812\n89#4:841\n75#4:850\n76#4,11:852\n89#4:880\n89#4:885\n75#4:928\n76#4,11:930\n75#4:961\n76#4,11:963\n89#4:991\n75#4:999\n76#4,11:1001\n89#4:1038\n89#4:1043\n75#4:1054\n76#4,11:1056\n89#4:1084\n76#5:551\n76#5:601\n76#5:651\n76#5:685\n76#5:725\n76#5:777\n76#5:811\n76#5:851\n76#5:929\n76#5:962\n76#5:1000\n76#5:1055\n460#6,13:563\n36#6:581\n473#6,3:588\n460#6,13:613\n36#6:631\n473#6,3:638\n460#6,13:663\n460#6,13:697\n473#6,3:712\n460#6,13:737\n473#6,3:751\n473#6,3:756\n36#6:762\n460#6,13:789\n460#6,13:823\n473#6,3:838\n460#6,13:863\n473#6,3:877\n473#6,3:882\n36#6:888\n36#6:895\n36#6:902\n36#6:909\n36#6:916\n460#6,13:941\n460#6,13:974\n473#6,3:988\n460#6,13:1012\n36#6:1027\n473#6,3:1035\n473#6,3:1040\n460#6,13:1067\n473#6,3:1081\n1114#7,6:582\n1114#7,6:632\n1114#7,6:763\n1114#7,6:889\n1114#7,6:896\n1114#7,6:903\n1114#7,6:910\n1114#7,6:917\n1114#7,6:1028\n75#8,6:644\n81#8:676\n85#8:760\n75#8,6:770\n81#8:802\n85#8:886\n76#8,5:923\n81#8:954\n85#8:1044\n74#8,7:1047\n81#8:1080\n85#8:1085\n*S KotlinDebug\n*F\n+ 1 LoyaltyBlocStatefull.kt\ncom/carrefour/fid/android/presentation/ui/home/loyalty/LoyaltyBlocStatefullKt\n*L\n128#1:542\n152#1:543\n158#1:577\n159#1:578\n160#1:579\n161#1:580\n187#1:593\n191#1:627\n219#1:628\n223#1:629\n225#1:630\n257#1:643\n262#1:677\n265#1:711\n279#1:717\n290#1:761\n312#1:769\n317#1:803\n320#1:837\n334#1:843\n356#1:887\n480#1:1026\n484#1:1034\n497#1:1045\n498#1:1046\n148#1:544,6\n148#1:576\n148#1:592\n183#1:594,6\n183#1:626\n183#1:642\n259#1:678,6\n259#1:710\n259#1:716\n276#1:718,6\n276#1:750\n276#1:755\n314#1:804,6\n314#1:836\n314#1:842\n331#1:844,6\n331#1:876\n331#1:881\n465#1:955,6\n465#1:987\n465#1:992\n470#1:993,6\n470#1:1025\n470#1:1039\n148#1:550\n148#1:552,11\n148#1:591\n183#1:600\n183#1:602,11\n183#1:641\n254#1:650\n254#1:652,11\n259#1:684\n259#1:686,11\n259#1:715\n276#1:724\n276#1:726,11\n276#1:754\n254#1:759\n309#1:776\n309#1:778,11\n314#1:810\n314#1:812,11\n314#1:841\n331#1:850\n331#1:852,11\n331#1:880\n309#1:885\n461#1:928\n461#1:930,11\n465#1:961\n465#1:963,11\n465#1:991\n470#1:999\n470#1:1001,11\n470#1:1038\n461#1:1043\n510#1:1054\n510#1:1056,11\n510#1:1084\n148#1:551\n183#1:601\n254#1:651\n259#1:685\n276#1:725\n309#1:777\n314#1:811\n331#1:851\n461#1:929\n465#1:962\n470#1:1000\n510#1:1055\n148#1:563,13\n166#1:581\n148#1:588,3\n183#1:613,13\n230#1:631\n183#1:638,3\n254#1:663,13\n259#1:697,13\n259#1:712,3\n276#1:737,13\n276#1:751,3\n254#1:756,3\n293#1:762\n309#1:789,13\n314#1:823,13\n314#1:838,3\n331#1:863,13\n331#1:877,3\n309#1:882,3\n391#1:888\n415#1:895\n440#1:902\n453#1:909\n455#1:916\n461#1:941,13\n465#1:974,13\n465#1:988,3\n470#1:1012,13\n481#1:1027\n470#1:1035,3\n461#1:1040,3\n510#1:1067,13\n510#1:1081,3\n166#1:582,6\n230#1:632,6\n293#1:763,6\n391#1:889,6\n415#1:896,6\n440#1:903,6\n453#1:910,6\n455#1:917,6\n481#1:1028,6\n254#1:644,6\n254#1:676\n254#1:760\n309#1:770,6\n309#1:802\n309#1:886\n461#1:923,5\n461#1:954\n461#1:1044\n510#1:1047,7\n510#1:1080\n510#1:1085\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt */
public final class LoyaltyBlocStatefullKt {

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$a */
    public /* synthetic */ class C24165a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.core.type.LoyaltyCardType[] r0 = com.carrefour.fid.android.core.type.LoyaltyCardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.core.type.LoyaltyCardType r1 = com.carrefour.fid.android.core.type.LoyaltyCardType.PASS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.core.type.LoyaltyCardType r1 = com.carrefour.fid.android.core.type.LoyaltyCardType.FID     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.core.type.LoyaltyCardType r1 = com.carrefour.fid.android.core.type.LoyaltyCardType.NOT_EXIST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.loyalty.LoyaltyBlocStatefullKt.C24165a.<clinit>():void");
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m106432a(C11300l<? super C24166a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C11300l<? super C24166a, C11079d2> lVar2 = lVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(-194089822);
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
                ComposerKt.m29845w0(-194089822, i2, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.ChallengeFid (LoyaltyBlocStatefull.kt:422)");
            }
            C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
            String d = C16018i.m71858d(R.string.loyalty_challenge_fid_title, o, 0);
            long a = C16009b.m71825a(R.color.ds_grey_80, o, 0);
            C11304p<C8592o, Integer, C11079d2> c = ComposableSingletons$LoyaltyBlocStatefullKt.f60434a.mo70689c();
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new LoyaltyBlocStatefullKt$ChallengeFid$1$1(lVar2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            String str = d;
            oVar2 = o;
            BannerComponentKt.m151328d(n, str, c, R.drawable.ds_ic_challenge_fid, (String) null, (String) null, a, 0.0f, 0.0f, (C11289a) N, o, 390, 432);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBlocStatefullKt$ChallengeFid$2(lVar2, i4));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m106433b(String str, C26487c cVar, C11300l<? super C24166a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        boolean z;
        String str2;
        int i3;
        int i4;
        int i5;
        String str3 = str;
        C26487c cVar2 = cVar;
        C11300l<? super C24166a, C11079d2> lVar2 = lVar;
        int i6 = i;
        C8592o o = oVar.mo15009o(-981995062);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(str3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo15006n0(cVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-981995062, i2, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.Coupons (LoyaltyBlocStatefull.kt:369)");
            }
            if (Intrinsics.areEqual((Object) cVar2, (Object) C26487c.C26490c.f64756a)) {
                z = true;
            } else {
                z = Intrinsics.areEqual((Object) cVar2, (Object) C26487c.C26488a.f64752a);
            }
            if (z) {
                str2 = "-";
            } else if (cVar2 instanceof C26487c.C26489b) {
                List<C38015d> g = ((C26487c.C26489b) cVar2).mo77037d().mo117040g();
                if (g == null) {
                    g = CollectionsKt__CollectionsKt.m40441E();
                }
                str2 = String.valueOf(g.size());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
            long a = C16009b.m71825a(R.color.ds_grey_80, o, 0);
            C8552a b = C8553b.m31048b(o, -1437178692, true, new LoyaltyBlocStatefullKt$Coupons$1(str2));
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new LoyaltyBlocStatefullKt$Coupons$2$1(lVar2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            oVar2 = o;
            BannerComponentKt.m151328d(n, str, b, R.drawable.ds_ic_promo, (String) null, (String) null, a, 0.0f, 0.0f, (C11289a) N, o, ((i2 << 3) & 112) | 390, 432);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBlocStatefullKt$Coupons$3(str3, cVar2, lVar, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106434c(com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f r36, com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c r37, com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h r38, boolean r39, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24166a, kotlin.C11079d2> r40, androidx.compose.runtime.C8592o r41, int r42) {
        /*
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r11 = r40
            r12 = r42
            r0 = 735491285(0x2bd6b4d5, float:1.5255806E-12)
            r5 = r41
            androidx.compose.runtime.o r15 = r5.mo15009o(r0)
            r5 = r12 & 14
            if (r5 != 0) goto L_0x0024
            boolean r5 = r15.mo15006n0(r1)
            if (r5 == 0) goto L_0x0021
            r5 = 4
            goto L_0x0022
        L_0x0021:
            r5 = 2
        L_0x0022:
            r5 = r5 | r12
            goto L_0x0025
        L_0x0024:
            r5 = r12
        L_0x0025:
            r6 = r12 & 112(0x70, float:1.57E-43)
            r7 = 16
            if (r6 != 0) goto L_0x0036
            boolean r6 = r15.mo15006n0(r2)
            if (r6 == 0) goto L_0x0034
            r6 = 32
            goto L_0x0035
        L_0x0034:
            r6 = r7
        L_0x0035:
            r5 = r5 | r6
        L_0x0036:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0046
            boolean r6 = r15.mo15006n0(r3)
            if (r6 == 0) goto L_0x0043
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r5 = r5 | r6
        L_0x0046:
            r6 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0056
            boolean r6 = r15.mo14961b(r4)
            if (r6 == 0) goto L_0x0053
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r5 = r5 | r6
        L_0x0056:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x0068
            boolean r6 = r15.mo14927P(r11)
            if (r6 == 0) goto L_0x0065
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r5 = r5 | r6
        L_0x0068:
            r13 = r5
            r5 = 46811(0xb6db, float:6.5596E-41)
            r5 = r5 & r13
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r6) goto L_0x007e
            boolean r5 = r15.mo15011p()
            if (r5 != 0) goto L_0x0078
            goto L_0x007e
        L_0x0078:
            r15.mo14958a0()
            r1 = r15
            goto L_0x03c2
        L_0x007e:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x008a
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.home.loyalty.HomePageLoyaltyView (LoyaltyBlocStatefull.kt:244)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r13, r5, r6)
        L_0x008a:
            r0 = r13 & 14
            int r5 = r13 >> 9
            r5 = r5 & 112(0x70, float:1.57E-43)
            r0 = r0 | r5
            int r5 = r13 >> 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r5
            m106435d(r1, r11, r4, r15, r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r14 = 0
            r10 = 1
            r9 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r14, r10, r9)
            float r8 = (float) r7
            float r17 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            float r19 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            r20 = 0
            r21 = 8
            r22 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement r22 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r6 = r22.mo7630p()
            androidx.compose.ui.c$a r23 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r7 = r23.mo17073w()
            r9 = 0
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.RowKt.m10071d(r6, r7, r15, r9)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r7)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r15.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r15.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r26 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r26.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r1 = r15.mo15017r()
            boolean r1 = r1 instanceof androidx.compose.runtime.C8428d
            if (r1 != 0) goto L_0x0109
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0109:
            r15.mo14938T()
            boolean r1 = r15.mo14997l()
            if (r1 == 0) goto L_0x0116
            r15.mo14947W(r9)
            goto L_0x0119
        L_0x0116:
            r15.mo14888A()
        L_0x0119:
            r15.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r9 = r26.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r6, r9)
            kotlin.jvm.functions.p r6 = r26.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r10, r6)
            kotlin.jvm.functions.p r6 = r26.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r14, r6)
            kotlin.jvm.functions.p r6 = r26.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r7, r6)
            r15.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.invoke(r1, r15, r7)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r1)
            androidx.compose.foundation.layout.RowScopeInstance r14 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r14
            r17 = r0
            androidx.compose.ui.m r28 = androidx.compose.foundation.layout.C2411u0.m10660e(r16, r17, r18, r19, r20, r21)
            r29 = 0
            r30 = 0
            r5 = 8
            float r10 = (float) r5
            float r31 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            r32 = 0
            r33 = 11
            r34 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r28, r29, r30, r31, r32, r33, r34)
            r9 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement$l r6 = r22.mo7631r()
            androidx.compose.ui.c$b r7 = r23.mo17072u()
            r9 = 0
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.ColumnKt.m9863b(r6, r7, r15, r9)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r7)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r15.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r1 = r15.mo15032w(r1)
            androidx.compose.ui.platform.c4 r1 = (androidx.compose.p004ui.platform.C15863c4) r1
            kotlin.jvm.functions.a r4 = r26.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            r17 = r10
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x01c8
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01c8:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x01d5
            r15.mo14947W(r4)
            goto L_0x01d8
        L_0x01d5:
            r15.mo14888A()
        L_0x01d8:
            r15.mo14941U()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r26.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r4, r6, r10)
            kotlin.jvm.functions.p r6 = r26.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r4, r9, r6)
            kotlin.jvm.functions.p r6 = r26.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r4, r7, r6)
            kotlin.jvm.functions.p r6 = r26.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r4, r1, r6)
            r15.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5.invoke(r1, r15, r6)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r1 = 2131952999(0x7f130567, float:1.9542457E38)
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r15, r4)
            r5 = r13 & 112(0x70, float:1.57E-43)
            int r6 = r13 >> 6
            r9 = r6 & 896(0x380, float:1.256E-42)
            r5 = r5 | r9
            m106433b(r1, r2, r11, r15, r5)
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r1)
            r5 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r1, r15, r5)
            r1 = -1495011528(0xffffffffa6e3ef38, float:-1.581613E-15)
            r15.mo14918M(r1)
            boolean r1 = r3 instanceof com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h.C26506a
            if (r1 == 0) goto L_0x0277
            r1 = 0
            r5 = 0
            r10 = 1
            androidx.compose.ui.m r29 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r5, r10, r1)
            r30 = 0
            com.carrefour.fid.android.design.theme.a r5 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r31 = r5.mo114175A()
            r32 = 0
            float r33 = r5.mo114175A()
            r34 = 5
            r35 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r29, r30, r31, r32, r33, r34, r35)
            r6 = r3
            com.carrefour.fid.android.presentation.viewmodels.home.state.h$a r6 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h.C26506a) r6
            java.lang.String r6 = r6.mo77072f()
            r18 = 0
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7 = r40
            r24 = r8
            r8 = r15
            r1 = r4
            r4 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r27 = r17
            r10 = r18
            m106437f(r5, r6, r7, r8, r9, r10)
            goto L_0x027f
        L_0x0277:
            r1 = r4
            r24 = r8
            r27 = r17
            r4 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
        L_0x027f:
            r15.mo15002m0()
            r15.mo15002m0()
            r15.mo14896D()
            r15.mo15002m0()
            r15.mo15002m0()
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r14
            r17 = r0
            androidx.compose.ui.m r29 = androidx.compose.foundation.layout.C2411u0.m10660e(r16, r17, r18, r19, r20, r21)
            float r30 = androidx.compose.p004ui.unit.C16483g.m74435M(r27)
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 14
            r35 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r29, r30, r31, r32, r33, r34, r35)
            r15.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement$l r4 = r22.mo7631r()
            androidx.compose.ui.c$b r6 = r23.mo17072u()
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r6, r15, r1)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r26.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x02f6
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02f6:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x0303
            r15.mo14947W(r9)
            goto L_0x0306
        L_0x0303:
            r15.mo14888A()
        L_0x0306:
            r15.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r26.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r4, r10)
            kotlin.jvm.functions.p r4 = r26.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r4)
            kotlin.jvm.functions.p r4 = r26.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r4)
            kotlin.jvm.functions.p r4 = r26.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r4)
            r15.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5.invoke(r4, r15, r6)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r4)
            int r4 = r13 >> 12
            r4 = r4 & 14
            m106432a(r11, r15, r4)
            r15.mo15002m0()
            r15.mo14896D()
            r15.mo15002m0()
            r15.mo15002m0()
            r15.mo15002m0()
            r15.mo14896D()
            r15.mo15002m0()
            r15.mo15002m0()
            r4 = 0
            r5 = 1
            r6 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r6, r5, r4)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r24)
            androidx.compose.ui.m r13 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r4)
            r0 = 2131952839(0x7f1304c7, float:1.9542132E38)
            java.lang.String r19 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r15, r1)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r0)
            boolean r0 = r15.mo15006n0(r11)
            java.lang.Object r1 = r15.mo14921N()
            if (r0 != 0) goto L_0x038e
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0396
        L_0x038e:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$HomePageLoyaltyView$2$1 r1 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$HomePageLoyaltyView$2$1
            r1.<init>(r11)
            r15.mo14893C(r1)
        L_0x0396:
            r15.mo15002m0()
            r14 = r1
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            r0 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r1 = 2131231183(0x7f0801cf, float:1.807844E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r1)
            r21 = 0
            r22 = 0
            r24 = 6
            r25 = 828(0x33c, float:1.16E-42)
            r1 = r15
            r15 = r0
            r23 = r1
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151340g(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03c2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03c2:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x03c9
            goto L_0x03de
        L_0x03c9:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$HomePageLoyaltyView$3 r8 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$HomePageLoyaltyView$3
            r0 = r8
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x03de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.loyalty.LoyaltyBlocStatefullKt.m106434c(com.carrefour.fid.android.presentation.viewmodels.home.state.f, com.carrefour.fid.android.presentation.viewmodels.home.state.c, com.carrefour.fid.android.presentation.viewmodels.home.state.h, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m106435d(C26497f fVar, C11300l<? super C24166a, C11079d2> lVar, boolean z, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        boolean z2;
        C11304p pVar;
        int i3;
        int i4;
        int i5;
        int i6;
        C26497f fVar2 = fVar;
        C11300l<? super C24166a, C11079d2> lVar2 = lVar;
        boolean z3 = z;
        int i7 = i;
        C8592o o = oVar.mo15009o(-1581898849);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(fVar2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 112) == 0) {
            if (o.mo14927P(lVar2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & 896) == 0) {
            if (o.mo14961b(z3)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1581898849, i7, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBalance (LoyaltyBlocStatefull.kt:341)");
            }
            if (Intrinsics.areEqual((Object) fVar2, (Object) C26497f.C26500c.f64771a)) {
                z2 = true;
            } else {
                z2 = Intrinsics.areEqual((Object) fVar2, (Object) C26497f.C26498a.f64767a);
            }
            if (z2) {
                pVar = ComposableSingletons$LoyaltyBlocStatefullKt.f60434a.mo70687a();
            } else if (fVar2 instanceof C26497f.C26499b) {
                pVar = C8553b.m31048b(o, -1837553445, true, new LoyaltyBlocStatefullKt$LoyaltyBalance$placeHolder$1(fVar2));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            float f = (float) 16;
            C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M(f), C16483g.m74435M((float) 6), C16483g.m74435M(f), 0.0f, 8, (Object) null);
            String d = C16018i.m71858d(R.string.loyalty_balance_home_title, o, 0);
            if (z3) {
                i3 = R.drawable.ds_ic_card_pass;
            } else {
                i3 = R.drawable.ds_ic_card_fid;
            }
            C11304p pVar2 = pVar;
            oVar2 = o;
            BannerComponentKt.m151328d(o2, d, pVar2, i3, (String) null, (String) null, C16009b.m71825a(R.color.ds_grey_blue, o, 0), 0.0f, 0.0f, new LoyaltyBlocStatefullKt$LoyaltyBalance$1(fVar2, lVar2), oVar2, 0, 432);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBlocStatefullKt$LoyaltyBalance$2(fVar2, lVar2, z3, i7));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x016e  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106436e(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g r31, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f r32, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c r33, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h r34, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24176b r35, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.home.state.C26484b r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r37, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Integer, kotlin.C11079d2> r39, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r40, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r41, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r42, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super java.lang.String, ? super java.lang.String, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r46, int r47, int r48, int r49) {
        /*
            r1 = r31
            r11 = r32
            r12 = r33
            r10 = r34
            r9 = r35
            r8 = r36
            r7 = r37
            r6 = r38
            r5 = r39
            r4 = r40
            r3 = r42
            r2 = r43
            r0 = r44
            r15 = r45
            r14 = r47
            r13 = r48
            r13 = r49
            java.lang.String r14 = "loyaltyCardState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r14)
            java.lang.String r14 = "loyaltyBalanceState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r14)
            java.lang.String r14 = "couponsInfoState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r14)
            java.lang.String r14 = "stickersInfoState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r14)
            java.lang.String r14 = "loyaltyView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r14)
            java.lang.String r14 = "joBanner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r14)
            java.lang.String r14 = "onViewAllClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r14)
            java.lang.String r14 = "onSeeLoyaltyCardClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r14)
            java.lang.String r14 = "onLoyaltyBalanceClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r14)
            java.lang.String r14 = "onCouponsClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r14)
            java.lang.String r14 = "onCreateLoyaltyCardClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r14)
            java.lang.String r14 = "onChallengeFidClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r14)
            java.lang.String r14 = "onMyStickersClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r14)
            java.lang.String r14 = "onJOTeamBannerClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r14)
            r14 = 678064977(0x286a7351, float:1.3014615E-14)
            r15 = r46
            androidx.compose.runtime.o r15 = r15.mo15009o(r14)
            r16 = r13 & 1
            r17 = 4
            if (r16 == 0) goto L_0x007c
            r14 = r47
            r16 = r14 | 6
            goto L_0x0092
        L_0x007c:
            r14 = r47
            r16 = r14 & 14
            if (r16 != 0) goto L_0x0090
            boolean r16 = r15.mo15006n0(r1)
            if (r16 == 0) goto L_0x008b
            r16 = r17
            goto L_0x008d
        L_0x008b:
            r16 = 2
        L_0x008d:
            r16 = r14 | r16
            goto L_0x0092
        L_0x0090:
            r16 = r14
        L_0x0092:
            r19 = r13 & 2
            r20 = 32
            if (r19 == 0) goto L_0x009b
            r16 = r16 | 48
            goto L_0x00ac
        L_0x009b:
            r19 = r14 & 112(0x70, float:1.57E-43)
            if (r19 != 0) goto L_0x00ac
            boolean r19 = r15.mo15006n0(r11)
            if (r19 == 0) goto L_0x00a8
            r19 = r20
            goto L_0x00aa
        L_0x00a8:
            r19 = 16
        L_0x00aa:
            r16 = r16 | r19
        L_0x00ac:
            r1 = r16
            r16 = r13 & 4
            r19 = 256(0x100, float:3.59E-43)
            r21 = 128(0x80, float:1.794E-43)
            if (r16 == 0) goto L_0x00b9
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x00c9
        L_0x00b9:
            r11 = r14 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x00c9
            boolean r11 = r15.mo15006n0(r12)
            if (r11 == 0) goto L_0x00c6
            r11 = r19
            goto L_0x00c8
        L_0x00c6:
            r11 = r21
        L_0x00c8:
            r1 = r1 | r11
        L_0x00c9:
            r11 = r13 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r22 = 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x00d4
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00e4
        L_0x00d4:
            r11 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x00e4
            boolean r11 = r15.mo15006n0(r10)
            if (r11 == 0) goto L_0x00e1
            r11 = r16
            goto L_0x00e3
        L_0x00e1:
            r11 = r22
        L_0x00e3:
            r1 = r1 | r11
        L_0x00e4:
            r11 = r13 & 16
            r23 = 57344(0xe000, float:8.0356E-41)
            r24 = 16384(0x4000, float:2.2959E-41)
            r25 = 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x00f2
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0102
        L_0x00f2:
            r11 = r14 & r23
            if (r11 != 0) goto L_0x0102
            boolean r11 = r15.mo15006n0(r9)
            if (r11 == 0) goto L_0x00ff
            r11 = r24
            goto L_0x0101
        L_0x00ff:
            r11 = r25
        L_0x0101:
            r1 = r1 | r11
        L_0x0102:
            r11 = r13 & 32
            if (r11 == 0) goto L_0x010a
            r11 = 196608(0x30000, float:2.75506E-40)
        L_0x0108:
            r1 = r1 | r11
            goto L_0x011b
        L_0x010a:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r14
            if (r11 != 0) goto L_0x011b
            boolean r11 = r15.mo15006n0(r8)
            if (r11 == 0) goto L_0x0118
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0108
        L_0x0118:
            r11 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0108
        L_0x011b:
            r11 = r13 & 64
            if (r11 == 0) goto L_0x0123
            r11 = 1572864(0x180000, float:2.204052E-39)
        L_0x0121:
            r1 = r1 | r11
            goto L_0x0134
        L_0x0123:
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r14
            if (r11 != 0) goto L_0x0134
            boolean r11 = r15.mo14927P(r7)
            if (r11 == 0) goto L_0x0131
            r11 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0121
        L_0x0131:
            r11 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0121
        L_0x0134:
            r11 = r13 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x013c
            r11 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x013a:
            r1 = r1 | r11
            goto L_0x014d
        L_0x013c:
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r14
            if (r11 != 0) goto L_0x014d
            boolean r11 = r15.mo14927P(r6)
            if (r11 == 0) goto L_0x014a
            r11 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x013a
        L_0x014a:
            r11 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x013a
        L_0x014d:
            r11 = r13 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0155
            r11 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0153:
            r1 = r1 | r11
            goto L_0x0166
        L_0x0155:
            r11 = 234881024(0xe000000, float:1.5777218E-30)
            r11 = r11 & r14
            if (r11 != 0) goto L_0x0166
            boolean r11 = r15.mo14927P(r5)
            if (r11 == 0) goto L_0x0163
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0153
        L_0x0163:
            r11 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0153
        L_0x0166:
            r11 = r13 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x016e
            r11 = 805306368(0x30000000, float:4.656613E-10)
        L_0x016c:
            r1 = r1 | r11
            goto L_0x017f
        L_0x016e:
            r11 = 1879048192(0x70000000, float:1.58456325E29)
            r11 = r11 & r14
            if (r11 != 0) goto L_0x017f
            boolean r11 = r15.mo14927P(r4)
            if (r11 == 0) goto L_0x017c
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x016c
        L_0x017c:
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x016c
        L_0x017f:
            r11 = r13 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x018b
            r12 = r13
            r13 = r48
            r17 = r13 | 6
            r4 = r41
            goto L_0x01a2
        L_0x018b:
            r12 = r13
            r13 = r48
            r26 = r13 & 14
            r4 = r41
            if (r26 != 0) goto L_0x01a0
            boolean r26 = r15.mo14927P(r4)
            if (r26 == 0) goto L_0x019b
            goto L_0x019d
        L_0x019b:
            r17 = 2
        L_0x019d:
            r17 = r13 | r17
            goto L_0x01a2
        L_0x01a0:
            r17 = r13
        L_0x01a2:
            r4 = r12 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x01a9
            r17 = r17 | 48
            goto L_0x01b8
        L_0x01a9:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x01b8
            boolean r4 = r15.mo14927P(r3)
            if (r4 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r20 = 16
        L_0x01b6:
            r17 = r17 | r20
        L_0x01b8:
            r4 = r17
            r3 = r12 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x01c1
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x01d0
        L_0x01c1:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x01d0
            boolean r3 = r15.mo14927P(r2)
            if (r3 == 0) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            r19 = r21
        L_0x01ce:
            r4 = r4 | r19
        L_0x01d0:
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01d7
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x01e6
        L_0x01d7:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x01e6
            boolean r3 = r15.mo14927P(r0)
            if (r3 == 0) goto L_0x01e2
            goto L_0x01e4
        L_0x01e2:
            r16 = r22
        L_0x01e4:
            r4 = r4 | r16
        L_0x01e6:
            r3 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x01ed
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01ff
        L_0x01ed:
            r3 = r13 & r23
            if (r3 != 0) goto L_0x01ff
            r3 = r45
            boolean r16 = r15.mo14927P(r3)
            if (r16 == 0) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r24 = r25
        L_0x01fc:
            r4 = r4 | r24
            goto L_0x0201
        L_0x01ff:
            r3 = r45
        L_0x0201:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r16
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0224
            r0 = 46811(0xb6db, float:6.5596E-41)
            r0 = r0 & r4
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r2) goto L_0x0224
            boolean r0 = r15.mo15011p()
            if (r0 != 0) goto L_0x021a
            goto L_0x0224
        L_0x021a:
            r15.mo14958a0()
            r13 = r31
            r11 = r41
            r12 = r15
            goto L_0x035a
        L_0x0224:
            if (r11 == 0) goto L_0x022a
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$1 r0 = com.carrefour.fid.android.presentation.p035ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$1.f60447f
            r11 = r0
            goto L_0x022c
        L_0x022a:
            r11 = r41
        L_0x022c:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x023a
            java.lang.String r0 = "com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefull (LoyaltyBlocStatefull.kt:70)"
            r2 = 678064977(0x286a7351, float:1.3014615E-14)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r4, r0)
        L_0x023a:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$actioner$1 r0 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$actioner$1
            r13 = r0
            r2 = 2
            r14 = r39
            r4 = r15
            r15 = r37
            r16 = r38
            r17 = r40
            r18 = r11
            r19 = r42
            r20 = r43
            r21 = r44
            r22 = r34
            r23 = r45
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$c r3 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g.C26504c.f64777a
            r14 = 16
            r13 = r31
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x02af
            r0 = -876185719(0xffffffffcbc67789, float:-2.6013458E7)
            r4.mo14918M(r0)
            r4.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0274
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0274:
            androidx.compose.runtime.t1 r15 = r4.mo15020s()
            if (r15 != 0) goto L_0x027b
            goto L_0x02ae
        L_0x027b:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$2 r14 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$2
            r0 = r14
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r12 = r42
            r13 = r43
            r27 = r14
            r14 = r44
            r28 = r15
            r15 = r45
            r16 = r47
            r17 = r48
            r18 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r27
            r0 = r28
            r0.mo15202a(r1)
        L_0x02ae:
            return
        L_0x02af:
            boolean r3 = r13 instanceof com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g.C26502a
            r5 = 0
            if (r3 == 0) goto L_0x0332
            r3 = -876185641(0xffffffffcbc677d7, float:-2.6013614E7)
            r4.mo14918M(r3)
            r3 = r13
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$a r3 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g.C26502a) r3
            com.carrefour.fid.android.presentation.models.UserCardModel r3 = r3.mo77063d()
            com.carrefour.fid.android.core.type.LoyaltyCardType r3 = r3.mo121979e()
            int[] r6 = com.carrefour.fid.android.presentation.p035ui.home.loyalty.LoyaltyBlocStatefullKt.C24165a.$EnumSwitchMapping$0
            int r12 = r3.ordinal()
            r6 = r6[r12]
            r12 = 1
            if (r6 == r12) goto L_0x02ed
            if (r6 == r2) goto L_0x02ed
            r1 = 3
            if (r6 == r1) goto L_0x02df
            r0 = -1238552049(0xffffffffb62d320f, float:-2.5808147E-6)
            r4.mo14918M(r0)
            r4.mo15002m0()
            goto L_0x02eb
        L_0x02df:
            r1 = -1238552143(0xffffffffb62d31b1, float:-2.5807933E-6)
            r4.mo14918M(r1)
            m106445n(r0, r4, r5)
            r4.mo15002m0()
        L_0x02eb:
            r12 = r4
            goto L_0x032e
        L_0x02ed:
            r2 = -1238552783(0xffffffffb62d2f31, float:-2.5806478E-6)
            r4.mo14918M(r2)
            com.carrefour.fid.android.core.type.LoyaltyCardType r2 = com.carrefour.fid.android.core.type.LoyaltyCardType.PASS
            if (r3 != r2) goto L_0x02f9
            r6 = r12
            goto L_0x02fa
        L_0x02f9:
            r6 = r5
        L_0x02fa:
            int r2 = r1 >> 12
            r2 = r2 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r3
            r1 = r1 | r2
            r2 = r35
            r3 = r32
            r12 = r4
            r4 = r33
            r5 = r34
            r7 = r36
            r8 = r0
            r9 = r12
            r10 = r1
            m106444m(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            float r1 = (float) r14
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r1)
            r1 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r12, r1)
            r12.mo15002m0()
        L_0x032e:
            r12.mo15002m0()
            goto L_0x0351
        L_0x0332:
            r12 = r4
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$b r1 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g.C26503b.f64775a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0348
            r1 = -876184650(0xffffffffcbc67bb6, float:-2.6015596E7)
            r12.mo14918M(r1)
            m106445n(r0, r12, r5)
            r12.mo15002m0()
            goto L_0x0351
        L_0x0348:
            r0 = -876184592(0xffffffffcbc67bf0, float:-2.6015712E7)
            r12.mo14918M(r0)
            r12.mo15002m0()
        L_0x0351:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x035a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x035a:
            androidx.compose.runtime.t1 r15 = r12.mo15020s()
            if (r15 != 0) goto L_0x0361
            goto L_0x0394
        L_0x0361:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$4 r14 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$LoyaltyBlocStatefull$4
            r0 = r14
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r12 = r42
            r13 = r43
            r29 = r14
            r14 = r44
            r30 = r15
            r15 = r45
            r16 = r47
            r17 = r48
            r18 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r29
            r0 = r30
            r0.mo15202a(r1)
        L_0x0394:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.loyalty.LoyaltyBlocStatefullKt.m106436e(com.carrefour.fid.android.presentation.viewmodels.home.state.g, com.carrefour.fid.android.presentation.viewmodels.home.state.f, com.carrefour.fid.android.presentation.viewmodels.home.state.c, com.carrefour.fid.android.presentation.viewmodels.home.state.h, com.carrefour.fid.android.presentation.ui.home.loyalty.b, com.carrefour.fid.android.presentation.viewmodels.home.state.b, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106437f(androidx.compose.p004ui.C8767m r25, java.lang.String r26, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24166a, kotlin.C11079d2> r27, androidx.compose.runtime.C8592o r28, int r29, int r30) {
        /*
            r2 = r26
            r3 = r27
            r4 = r29
            r0 = -1402448764(0xffffffffac685484, float:-3.3016099E-12)
            r1 = r28
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r5 = r30 & 1
            if (r5 == 0) goto L_0x0019
            r6 = r4 | 6
            r7 = r6
            r6 = r25
            goto L_0x002d
        L_0x0019:
            r6 = r4 & 14
            if (r6 != 0) goto L_0x002a
            r6 = r25
            boolean r7 = r1.mo15006n0(r6)
            if (r7 == 0) goto L_0x0027
            r7 = 4
            goto L_0x0028
        L_0x0027:
            r7 = 2
        L_0x0028:
            r7 = r7 | r4
            goto L_0x002d
        L_0x002a:
            r6 = r25
            r7 = r4
        L_0x002d:
            r8 = r30 & 2
            if (r8 == 0) goto L_0x0034
            r7 = r7 | 48
            goto L_0x0044
        L_0x0034:
            r8 = r4 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0044
            boolean r8 = r1.mo15006n0(r2)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r7 = r7 | r8
        L_0x0044:
            r8 = r30 & 4
            if (r8 == 0) goto L_0x004b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x005b
        L_0x004b:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005b
            boolean r8 = r1.mo14927P(r3)
            if (r8 == 0) goto L_0x0058
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r7 = r7 | r8
        L_0x005b:
            r8 = r7 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x006d
            boolean r8 = r1.mo15011p()
            if (r8 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r1.mo14958a0()
            goto L_0x00fc
        L_0x006d:
            if (r5 == 0) goto L_0x0074
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r24 = r5
            goto L_0x0076
        L_0x0074:
            r24 = r6
        L_0x0076:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0082
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.home.loyalty.MyStickers (LoyaltyBlocStatefull.kt:446)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r5, r6)
        L_0x0082:
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r5 = r1.mo15006n0(r2)
            java.lang.Object r6 = r1.mo14921N()
            if (r5 != 0) goto L_0x009d
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r5 = r6
            goto L_0x00a5
        L_0x009d:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$MyStickers$1$1 r5 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$MyStickers$1$1
            r5.<init>(r2)
            r1.mo14893C(r5)
        L_0x00a5:
            r1.mo15002m0()
            r9 = 0
            r10 = 0
            r11 = 0
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r3)
            java.lang.Object r6 = r1.mo14921N()
            if (r0 != 0) goto L_0x00c0
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r6 != r0) goto L_0x00c8
        L_0x00c0:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$MyStickers$2$1 r6 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$MyStickers$2$1
            r6.<init>(r3)
            r1.mo14893C(r6)
        L_0x00c8:
            r1.mo15002m0()
            r12 = r6
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            r13 = 7
            r14 = 0
            r8 = r24
            androidx.compose.ui.m r6 = androidx.compose.foundation.ClickableKt.m8878e(r8, r9, r10, r11, r12, r13, r14)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 32764(0x7ffc, float:4.5912E-41)
            r20 = r1
            com.skydoves.landscapist.glide.C35325c.m145647d(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00fa
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00fa:
            r6 = r24
        L_0x00fc:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x0103
            goto L_0x0115
        L_0x0103:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$MyStickers$3 r8 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$MyStickers$3
            r0 = r8
            r1 = r6
            r2 = r26
            r3 = r27
            r4 = r29
            r5 = r30
            r0.<init>(r1, r2, r3, r4, r5)
            r7.mo15202a(r8)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.loyalty.LoyaltyBlocStatefullKt.m106437f(androidx.compose.ui.m, java.lang.String, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m106438g(String str, @C0358n int i, C8592o oVar, int i2) {
        int i3;
        C8592o oVar2;
        int i4;
        int i5;
        int i6;
        String str2 = str;
        int i7 = i;
        int i8 = i2;
        C8592o o = oVar.mo15009o(413952702);
        if ((i8 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i8;
        } else {
            i3 = i8;
        }
        if ((i8 & 112) == 0) {
            if (o.mo14976f(i7)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i3;
        if ((i9 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(413952702, i9, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.Price (LoyaltyBlocStatefull.kt:505)");
            }
            o.mo14918M(693286680);
            C8767m.C8768a aVar = C8767m.f23478j;
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
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
            C8767m c = rowScopeInstance.mo7843c(aVar);
            int i10 = (i9 >> 3) & 14;
            long a2 = C16009b.m71825a(i7, o, i10);
            C8592o oVar3 = o;
            C7933t0 t0Var = C7933t0.f19075a;
            int i11 = C7933t0.f19076b;
            String str3 = str;
            TextKt.m14196c(str3, c, a2, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(oVar3, i11).mo11096i(), oVar3, i9 & 14, 0, 65528);
            C8767m c2 = rowScopeInstance.mo7843c(aVar);
            i4 = i;
            oVar2 = oVar3;
            TextKt.m14196c(C37357d.f93887a, c2, C16009b.m71825a(i4, oVar2, i10), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(oVar2, i11).mo11097j(), oVar2, 6, 0, 65528);
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
            i4 = i7;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBlocStatefullKt$Price$2(str, i4, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m106439h(C11300l<? super C24166a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C11300l<? super C24166a, C11079d2> lVar2 = lVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(89965804);
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
                ComposerKt.m29845w0(89965804, i2, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.PromotionCode (LoyaltyBlocStatefull.kt:397)");
            }
            C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
            String d = C16018i.m71858d(R.string.loyalty_promo_code_home_title, o, 0);
            long a = C16009b.m71825a(R.color.ds_grey_80, o, 0);
            C11304p<C8592o, Integer, C11079d2> b = ComposableSingletons$LoyaltyBlocStatefullKt.f60434a.mo70688b();
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new LoyaltyBlocStatefullKt$PromotionCode$1$1(lVar2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            String str = d;
            oVar2 = o;
            BannerComponentKt.m151328d(n, str, b, R.drawable.ds_ic_promotion_code, (String) null, (String) null, a, 0.0f, 0.0f, (C11289a) N, o, 390, 432);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBlocStatefullKt$PromotionCode$2(lVar2, i4));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m106440i(C26497f fVar, C26487c cVar, C26505h hVar, boolean z, C11300l<? super C24166a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C26497f fVar2 = fVar;
        C26487c cVar2 = cVar;
        C26505h hVar2 = hVar;
        boolean z2 = z;
        C11300l<? super C24166a, C11079d2> lVar2 = lVar;
        int i10 = i;
        C8592o o = oVar.mo15009o(961443856);
        if ((i10 & 14) == 0) {
            if (o.mo15006n0(fVar2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i10;
        } else {
            i2 = i10;
        }
        if ((i10 & 112) == 0) {
            if (o.mo15006n0(cVar2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i10 & 896) == 0) {
            if (o.mo15006n0(hVar2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i10 & 7168) == 0) {
            if (o.mo14961b(z2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((57344 & i10) == 0) {
            if (o.mo14927P(lVar2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        int i11 = i2;
        if ((46811 & i11) != 9362 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(961443856, i11, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.StoreHomePageLoyaltyView (LoyaltyBlocStatefull.kt:299)");
            }
            m106435d(fVar2, lVar2, z2, o, (i11 & 14) | ((i11 >> 9) & 112) | ((i11 >> 3) & 896));
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 16;
            C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f), C16483g.m74435M(f), C16483g.m74435M(f), 0.0f, 8, (Object) null);
            o.mo14918M(693286680);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2269d p = arrangement.mo7630p();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 d = RowKt.m10071d(p, aVar2.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(o2);
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
            float f3 = (float) 8;
            C8767m o3 = PaddingKt.m10028o(C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), 0.0f, 0.0f, C16483g.m74435M(f3), 0.0f, 11, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b2 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(o3);
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
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            int i12 = (i11 >> 6) & 896;
            m106433b(C16018i.m71858d(R.string.loyalty_coupons_store_magasin_title, o, 0), cVar2, lVar2, o, (i11 & 112) | i12);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f)), o, 6);
            o.mo14918M(-288839353);
            if (hVar2 instanceof C26505h.C26506a) {
                C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
                C37474a aVar3 = C37474a.f94133a;
                i4 = 0;
                i3 = -483455358;
                m106437f(PaddingKt.m10028o(n, 0.0f, aVar3.mo114175A(), 0.0f, aVar3.mo114175A(), 5, (Object) null), ((C26505h.C26506a) hVar2).mo77072f(), lVar, o, i12, 0);
            } else {
                i4 = 0;
                i3 = -483455358;
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            C8767m o4 = PaddingKt.m10028o(C2411u0.m10660e(rowScopeInstance, aVar, 1.0f, false, 2, (Object) null), C16483g.m74435M(f3), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            o.mo14918M(i3);
            C15560f0 b4 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), o, i4);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(o4);
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
            C8592o b5 = Updater.m30180b(o);
            Updater.m30188j(b5, b4, companion.mo44588d());
            Updater.m30188j(b5, dVar3, companion.mo44586b());
            Updater.m30188j(b5, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b5, c4Var3, companion.mo44590f());
            o.mo14972e();
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf(i4));
            o.mo14918M(2058660585);
            m106432a(lVar2, o, (i11 >> 12) & 14);
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
            s.mo15202a(new LoyaltyBlocStatefullKt$StoreHomePageLoyaltyView$2(fVar, cVar, hVar, z, lVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m106441j(C8592o oVar, int i) {
        C8592o oVar2;
        int i2 = i;
        C8592o o = oVar.mo15009o(-481034591);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-481034591, i2, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.Title (LoyaltyBlocStatefull.kt:492)");
            }
            oVar2 = o;
            TextKt.m14196c(C16018i.m71858d(R.string.home_fid_advantage, o, 0), PaddingKt.m10026m(PaddingKt.m10028o(C8767m.f23478j, C16483g.m74435M((float) 16), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0.0f, C16483g.m74435M((float) 8), 1, (Object) null), C16009b.m71825a(R.color.ds_grey_5, o, 0), C16506u.m74712m(20), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j(), oVar2, 3120, 0, 65520);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBlocStatefullKt$Title$1(i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106442k(kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24166a, kotlin.C11079d2> r29, com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24176b r30, androidx.compose.runtime.C8592o r31, int r32) {
        /*
            r0 = r29
            r1 = r30
            r2 = r32
            r3 = -277960076(0xffffffffef6eaa74, float:-7.3863498E28)
            r4 = r31
            androidx.compose.runtime.o r4 = r4.mo15009o(r3)
            r5 = r2 & 14
            if (r5 != 0) goto L_0x001e
            boolean r5 = r4.mo14927P(r0)
            if (r5 == 0) goto L_0x001b
            r5 = 4
            goto L_0x001c
        L_0x001b:
            r5 = 2
        L_0x001c:
            r5 = r5 | r2
            goto L_0x001f
        L_0x001e:
            r5 = r2
        L_0x001f:
            r7 = r2 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x002f
            boolean r7 = r4.mo15006n0(r1)
            if (r7 == 0) goto L_0x002c
            r7 = 32
            goto L_0x002e
        L_0x002c:
            r7 = 16
        L_0x002e:
            r5 = r5 | r7
        L_0x002f:
            r7 = r5 & 91
            r8 = 18
            if (r7 != r8) goto L_0x0042
            boolean r7 = r4.mo15011p()
            if (r7 != 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            r4.mo14958a0()
            r3 = r4
            goto L_0x0309
        L_0x0042:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x004e
            r7 = -1
            java.lang.String r8 = "com.carrefour.fid.android.presentation.ui.home.loyalty.TitleAndSeeAll (LoyaltyBlocStatefull.kt:459)"
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r5, r7, r8)
        L_0x004e:
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r5 = 1
            r7 = 0
            r8 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r7, r5, r8)
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r10 = r9.mo7628l()
            r11 = 693286680(0x2952b718, float:4.6788176E-14)
            r4.mo14918M(r11)
            androidx.compose.ui.c$a r11 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r12 = r11.mo17073w()
            r13 = 6
            androidx.compose.ui.layout.f0 r10 = androidx.compose.foundation.layout.RowKt.m10071d(r10, r12, r4, r13)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.mo14918M(r12)
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r13 = r4.mo15032w(r13)
            androidx.compose.ui.unit.d r13 = (androidx.compose.p004ui.unit.C16479d) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r4.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r4.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r16.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r7 = r4.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x00a7
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00a7:
            r4.mo14938T()
            boolean r7 = r4.mo14997l()
            if (r7 == 0) goto L_0x00b4
            r4.mo14947W(r6)
            goto L_0x00b7
        L_0x00b4:
            r4.mo14888A()
        L_0x00b7:
            r4.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r4)
            kotlin.jvm.functions.p r7 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r10, r7)
            kotlin.jvm.functions.p r7 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r13, r7)
            kotlin.jvm.functions.p r7 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r14, r7)
            kotlin.jvm.functions.p r7 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r15, r7)
            r4.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r4)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r7 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r5.invoke(r6, r4, r10)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.mo14918M(r5)
            androidx.compose.foundation.layout.RowScopeInstance r6 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.c$c r10 = r11.mo17070q()
            androidx.compose.ui.m r10 = r6.mo7845f(r3, r10)
            r13 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r4.mo14918M(r13)
            androidx.compose.foundation.layout.Arrangement$l r14 = r9.mo7631r()
            androidx.compose.ui.c$b r15 = r11.mo17072u()
            androidx.compose.ui.layout.f0 r14 = androidx.compose.foundation.layout.ColumnKt.m9863b(r14, r15, r4, r7)
            r4.mo14918M(r12)
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r15 = r4.mo15032w(r15)
            androidx.compose.ui.unit.d r15 = (androidx.compose.p004ui.unit.C16479d) r15
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r4.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r4.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            kotlin.jvm.functions.a r13 = r16.mo44585a()
            kotlin.jvm.functions.q r10 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r10)
            androidx.compose.runtime.d r5 = r4.mo15017r()
            boolean r5 = r5 instanceof androidx.compose.runtime.C8428d
            if (r5 != 0) goto L_0x0143
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0143:
            r4.mo14938T()
            boolean r5 = r4.mo14997l()
            if (r5 == 0) goto L_0x0150
            r4.mo14947W(r13)
            goto L_0x0153
        L_0x0150:
            r4.mo14888A()
        L_0x0153:
            r4.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r4)
            kotlin.jvm.functions.p r13 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r14, r13)
            kotlin.jvm.functions.p r13 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r15, r13)
            kotlin.jvm.functions.p r13 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r8, r13)
            kotlin.jvm.functions.p r8 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r12, r8)
            r4.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r4)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.invoke(r5, r4, r8)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.mo14918M(r5)
            androidx.compose.foundation.layout.ColumnScopeInstance r5 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            m106441j(r4, r7)
            r4.mo15002m0()
            r4.mo14896D()
            r4.mo15002m0()
            r4.mo15002m0()
            androidx.compose.ui.c$c r5 = r11.mo17070q()
            androidx.compose.ui.m r5 = r6.mo7845f(r3, r5)
            r6 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r4.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement$l r6 = r9.mo7631r()
            androidx.compose.ui.c$b r8 = r11.mo17072u()
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.ColumnKt.m9863b(r6, r8, r4, r7)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r4.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r4.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r4.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            kotlin.jvm.functions.a r11 = r16.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r12 = r4.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x01f0
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01f0:
            r4.mo14938T()
            boolean r12 = r4.mo14997l()
            if (r12 == 0) goto L_0x01fd
            r4.mo14947W(r11)
            goto L_0x0200
        L_0x01fd:
            r4.mo14888A()
        L_0x0200:
            r4.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r4)
            kotlin.jvm.functions.p r12 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r12)
            kotlin.jvm.functions.p r6 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r6)
            kotlin.jvm.functions.p r6 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r6)
            kotlin.jvm.functions.p r6 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r6)
            r4.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r4)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5.invoke(r6, r4, r8)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.mo14918M(r5)
            boolean r5 = r1 instanceof com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24176b.C24178b
            if (r5 == 0) goto L_0x0252
            r5 = 996074794(0x3b5ee52a, float:0.0034011104)
            r4.mo14918M(r5)
            r5 = 2131952644(0x7f130404, float:1.9541737E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r4, r7)
            r4.mo15002m0()
        L_0x024f:
            r25 = r5
            goto L_0x0267
        L_0x0252:
            boolean r5 = r1 instanceof com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24176b.C24177a
            if (r5 == 0) goto L_0x0319
            r5 = 996074897(0x3b5ee591, float:0.0034011344)
            r4.mo14918M(r5)
            r5 = 2131952645(0x7f130405, float:1.9541739E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r4, r7)
            r4.mo15002m0()
            goto L_0x024f
        L_0x0267:
            r5 = 8
            float r5 = (float) r5
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r8 = 0
            r9 = 0
            r10 = 2
            androidx.compose.ui.m r11 = androidx.compose.foundation.layout.PaddingKt.m10026m(r3, r6, r9, r10, r8)
            r12 = 0
            r13 = 0
            r14 = 0
            r3 = 1157296644(0x44faf204, float:2007.563)
            r4.mo14918M(r3)
            boolean r3 = r4.mo15006n0(r0)
            java.lang.Object r6 = r4.mo14921N()
            if (r3 != 0) goto L_0x0290
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r6 != r3) goto L_0x0298
        L_0x0290:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$TitleAndSeeAll$1$2$1$1 r6 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$TitleAndSeeAll$1$2$1$1
            r6.<init>(r0)
            r4.mo14893C(r6)
        L_0x0298:
            r4.mo15002m0()
            r15 = r6
            kotlin.jvm.functions.a r15 = (kotlin.jvm.functions.C11289a) r15
            r16 = 7
            r17 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.ClickableKt.m8878e(r11, r12, r13, r14, r15, r16, r17)
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10024k(r3, r5)
            r3 = 2131099840(0x7f0600c0, float:1.7812045E38)
            long r6 = androidx.compose.p004ui.res.C16009b.m71825a(r3, r4, r7)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            int r8 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r3 = r3.mo11077c(r4, r8)
            androidx.compose.ui.text.p0 r24 = com.carrefour.fid.android.design.theme.C37477d.m153896h(r3)
            r26 = 0
            r27 = 0
            r28 = 65528(0xfff8, float:9.1824E-41)
            r3 = r4
            r4 = r25
            r25 = r3
            r8 = 0
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            r3.mo15002m0()
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            r3.mo15002m0()
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x0309
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0309:
            androidx.compose.runtime.t1 r3 = r3.mo15020s()
            if (r3 != 0) goto L_0x0310
            goto L_0x0318
        L_0x0310:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$TitleAndSeeAll$2 r4 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$TitleAndSeeAll$2
            r4.<init>(r0, r1, r2)
            r3.mo15202a(r4)
        L_0x0318:
            return
        L_0x0319:
            r3 = r4
            r0 = 996058077(0x3b5ea3dd, float:0.0033972182)
            r3.mo14918M(r0)
            r3.mo15002m0()
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.loyalty.LoyaltyBlocStatefullKt.m106442k(kotlin.jvm.functions.l, com.carrefour.fid.android.presentation.ui.home.loyalty.b, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C16464c(backgroundColor = 4294967295L, showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    public static final void m106443l(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(473565828);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(473565828, i, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.TitleAndSeeAllPreview (LoyaltyBlocStatefull.kt:535)");
            }
            ThemeKt.m153788a(ComposableSingletons$LoyaltyBlocStatefullKt.f60434a.mo70691e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBlocStatefullKt$TitleAndSeeAllPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: kotlin.jvm.functions.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106444m(com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24176b r29, com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f r30, com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c r31, com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h r32, boolean r33, com.carrefour.fid.android.presentation.viewmodels.home.state.C26484b r34, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24166a, kotlin.C11079d2> r35, androidx.compose.runtime.C8592o r36, int r37) {
        /*
            r1 = r29
            r6 = r34
            r14 = r35
            r15 = r37
            r0 = -1769954137(0xffffffff9680a4a7, float:-2.0783426E-25)
            r2 = r36
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0020
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x001d
            r3 = 4
            goto L_0x001e
        L_0x001d:
            r3 = 2
        L_0x001e:
            r3 = r3 | r15
            goto L_0x0021
        L_0x0020:
            r3 = r15
        L_0x0021:
            r5 = r15 & 112(0x70, float:1.57E-43)
            r7 = 16
            if (r5 != 0) goto L_0x0035
            r5 = r30
            boolean r8 = r2.mo15006n0(r5)
            if (r8 == 0) goto L_0x0032
            r8 = 32
            goto L_0x0033
        L_0x0032:
            r8 = r7
        L_0x0033:
            r3 = r3 | r8
            goto L_0x0037
        L_0x0035:
            r5 = r30
        L_0x0037:
            r8 = r15 & 896(0x380, float:1.256E-42)
            r13 = r31
            if (r8 != 0) goto L_0x0049
            boolean r8 = r2.mo15006n0(r13)
            if (r8 == 0) goto L_0x0046
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0048
        L_0x0046:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r3 = r3 | r8
        L_0x0049:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            r12 = r32
            if (r8 != 0) goto L_0x005b
            boolean r8 = r2.mo15006n0(r12)
            if (r8 == 0) goto L_0x0058
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x005a
        L_0x0058:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x005a:
            r3 = r3 | r8
        L_0x005b:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r15 & r8
            r11 = r33
            if (r9 != 0) goto L_0x0070
            boolean r9 = r2.mo14961b(r11)
            if (r9 == 0) goto L_0x006d
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006f
        L_0x006d:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x006f:
            r3 = r3 | r9
        L_0x0070:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r15
            if (r9 != 0) goto L_0x0081
            boolean r9 = r2.mo15006n0(r6)
            if (r9 == 0) goto L_0x007e
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0080
        L_0x007e:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x0080:
            r3 = r3 | r9
        L_0x0081:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r15
            if (r9 != 0) goto L_0x0092
            boolean r9 = r2.mo14927P(r14)
            if (r9 == 0) goto L_0x008f
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0091
        L_0x008f:
            r9 = 524288(0x80000, float:7.34684E-40)
        L_0x0091:
            r3 = r3 | r9
        L_0x0092:
            r9 = 2995931(0x2db6db, float:4.198194E-39)
            r9 = r9 & r3
            r10 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r10) goto L_0x00a7
            boolean r9 = r2.mo15011p()
            if (r9 != 0) goto L_0x00a2
            goto L_0x00a7
        L_0x00a2:
            r2.mo14958a0()
            goto L_0x02a2
        L_0x00a7:
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x00b3
            r9 = -1
            java.lang.String r10 = "com.carrefour.fid.android.presentation.ui.home.loyalty.WithLoyaltyCard (LoyaltyBlocStatefull.kt:173)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r9, r10)
        L_0x00b3:
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r10 = 0
            r9 = 1
            r4 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r10, r9, r4)
            androidx.compose.ui.graphics.j2$a r17 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r17 = r17.mo42852w()
            r19 = 0
            r20 = 2
            r21 = 0
            androidx.compose.ui.m r22 = androidx.compose.foundation.BackgroundKt.m8825d(r16, r17, r19, r20, r21)
            r23 = 0
            r9 = 8
            float r9 = (float) r9
            float r24 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            r25 = 0
            float r7 = (float) r7
            float r26 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r27 = 5
            r28 = 0
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.PaddingKt.m10028o(r22, r23, r24, r25, r26, r27, r28)
            r10 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r2.mo14918M(r10)
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r10 = r10.mo7631r()
            androidx.compose.ui.c$a r19 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r4 = r19.mo17072u()
            r8 = 0
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r10, r4, r2, r8)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r10)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r2.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r22 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r23 = r7
            kotlin.jvm.functions.a r7 = r22.mo44585a()
            kotlin.jvm.functions.q r11 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r17)
            androidx.compose.runtime.d r12 = r2.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x0136
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0136:
            r2.mo14938T()
            boolean r12 = r2.mo14997l()
            if (r12 == 0) goto L_0x0143
            r2.mo14947W(r7)
            goto L_0x0146
        L_0x0143:
            r2.mo14888A()
        L_0x0146:
            r2.mo14941U()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r12 = r22.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r7, r4, r12)
            kotlin.jvm.functions.p r4 = r22.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r7, r10, r4)
            kotlin.jvm.functions.p r4 = r22.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r7, r8, r4)
            kotlin.jvm.functions.p r4 = r22.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r7, r5, r4)
            r2.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r5 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r11.invoke(r4, r2, r7)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r4)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r4)
            r4 = 2131099829(0x7f0600b5, float:1.7812022E38)
            long r8 = androidx.compose.p004ui.res.C16009b.m71825a(r4, r2, r5)
            r10 = 0
            r11 = 2
            r12 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.BackgroundKt.m8825d(r7, r8, r10, r11, r12)
            androidx.compose.foundation.layout.C2428y0.m10726a(r4, r2, r5)
            int r4 = r3 >> 18
            r4 = r4 & 14
            int r5 = r3 << 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            m106442k(r14, r1, r2, r4)
            boolean r4 = r1 instanceof com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24176b.C24177a
            r5 = 6
            if (r4 == 0) goto L_0x01de
            r4 = -706194441(0xffffffffd5e853f7, float:-3.19309155E13)
            r2.mo14918M(r4)
            int r4 = r3 >> 3
            r7 = r4 & 14
            r8 = r4 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r8 = r4 & 896(0x380, float:1.256E-42)
            r7 = r7 | r8
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r7
            int r3 = r3 >> r5
            r7 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r7
            r3 = r3 | r4
            r4 = r23
            r7 = r30
            r8 = r31
            r12 = 1
            r9 = r32
            r11 = 0
            r10 = r33
            r11 = r35
            r12 = r2
            r13 = r3
            m106434c(r7, r8, r9, r10, r11, r12, r13)
            r2.mo15002m0()
            goto L_0x0219
        L_0x01de:
            r4 = r23
            boolean r7 = r1 instanceof com.carrefour.fid.android.presentation.p035ui.home.loyalty.C24176b.C24178b
            if (r7 == 0) goto L_0x0210
            r7 = -706194057(0xffffffffd5e85577, float:-3.19317208E13)
            r2.mo14918M(r7)
            int r7 = r3 >> 3
            r8 = r7 & 14
            r9 = r7 & 112(0x70, float:1.57E-43)
            r8 = r8 | r9
            r9 = r7 & 896(0x380, float:1.256E-42)
            r8 = r8 | r9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r8
            int r3 = r3 >> r5
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r13 = r7 | r3
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r35
            r12 = r2
            m106440i(r7, r8, r9, r10, r11, r12, r13)
            r2.mo15002m0()
            goto L_0x0219
        L_0x0210:
            r3 = -706193715(0xffffffffd5e856cd, float:-3.1932438E13)
            r2.mo14918M(r3)
            r2.mo15002m0()
        L_0x0219:
            r3 = 1854113590(0x6e838736, float:2.0352998E28)
            r2.mo14918M(r3)
            boolean r3 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.home.state.C26484b.C26485a
            if (r3 == 0) goto L_0x028a
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r3)
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r2, r5)
            r3 = 0
            r5 = 1
            r7 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r7, r5, r3)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r8 = 2
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10026m(r0, r4, r7, r8, r3)
            float r3 = (float) r5
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r4 = r4.mo114206C()
            com.carrefour.fid.android.design.theme.a r7 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r7 = r7.mo114189l()
            androidx.compose.foundation.shape.n r7 = androidx.compose.foundation.shape.C2694o.m12166h(r7)
            androidx.compose.ui.m r7 = androidx.compose.foundation.BorderKt.m8852h(r0, r3, r4, r7)
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.home.state.b$a r0 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26484b.C26485a) r0
            com.carrefour.fid.android.domain.models.ArsenalJOBanner r8 = r0.mo77031d()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r0)
            boolean r0 = r2.mo15006n0(r14)
            java.lang.Object r3 = r2.mo14921N()
            if (r0 != 0) goto L_0x0276
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r3 != r0) goto L_0x027e
        L_0x0276:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$WithLoyaltyCard$1$1$1 r3 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$WithLoyaltyCard$1$1$1
            r3.<init>(r14)
            r2.mo14893C(r3)
        L_0x027e:
            r2.mo15002m0()
            r9 = r3
            kotlin.jvm.functions.q r9 = (kotlin.jvm.functions.C11305q) r9
            r11 = 0
            r12 = 0
            r10 = r2
            com.carrefour.fid.android.presentation.components.arsenal.JoBannerViewKt.m158848a(r7, r8, r9, r10, r11, r12)
        L_0x028a:
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02a2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02a2:
            androidx.compose.runtime.t1 r9 = r2.mo15020s()
            if (r9 != 0) goto L_0x02a9
            goto L_0x02c2
        L_0x02a9:
            com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$WithLoyaltyCard$2 r10 = new com.carrefour.fid.android.presentation.ui.home.loyalty.LoyaltyBlocStatefullKt$WithLoyaltyCard$2
            r0 = r10
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x02c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.loyalty.LoyaltyBlocStatefullKt.m106444m(com.carrefour.fid.android.presentation.ui.home.loyalty.b, com.carrefour.fid.android.presentation.viewmodels.home.state.f, com.carrefour.fid.android.presentation.viewmodels.home.state.c, com.carrefour.fid.android.presentation.viewmodels.home.state.h, boolean, com.carrefour.fid.android.presentation.viewmodels.home.state.b, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: n */
    public static final void m106445n(C11300l<? super C24166a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        C11300l<? super C24166a, C11079d2> lVar2 = lVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(932513586);
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
                ComposerKt.m29845w0(932513586, i2, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.WithoutLoyaltyCard (LoyaltyBlocStatefull.kt:144)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 8;
            C8767m m = PaddingKt.m10026m(BackgroundKt.m8825d(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), 0.0f, C16483g.m74435M(f), 1, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(m);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            float f3 = (float) 16;
            C8767m n = PaddingKt.m10027n(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f3), C16483g.m74435M((float) 6), C16483g.m74435M(f3), C16483g.m74435M(f));
            String d = C16018i.m71858d(R.string.home_fid_create_card, o, 0);
            long a2 = C16009b.m71825a(R.color.ds_grey_80, o, 0);
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(lVar2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new LoyaltyBlocStatefullKt$WithoutLoyaltyCard$1$1$1(lVar2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            oVar2 = o;
            BannerComponentKt.m151326b(n, d, (String) null, (String) null, R.drawable.ds_ic_card_fid, (C36989i) null, a2, 0.0f, (C11289a) N, o, 0, 172);
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
            s.mo15202a(new LoyaltyBlocStatefullKt$WithoutLoyaltyCard$2(lVar2, i4));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: o */
    public static final void m106446o(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(592200995);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(592200995, i, -1, "com.carrefour.fid.android.presentation.ui.home.loyalty.WithoutLoyaltyCardPreview (LoyaltyBlocStatefull.kt:527)");
            }
            ThemeKt.m153788a(ComposableSingletons$LoyaltyBlocStatefullKt.f60434a.mo70690d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBlocStatefullKt$WithoutLoyaltyCardPreview$1(i));
        }
    }
}
