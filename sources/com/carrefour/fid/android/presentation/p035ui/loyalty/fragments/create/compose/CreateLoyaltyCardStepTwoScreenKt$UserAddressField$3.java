package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCreateLoyaltyCardStepTwoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateLoyaltyCardStepTwoScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,838:1\n154#2:839\n154#2:840\n36#3:841\n1114#4,6:842\n*S KotlinDebug\n*F\n+ 1 CreateLoyaltyCardStepTwoScreen.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/compose/CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3\n*L\n412#1:839\n420#1:840\n431#1:841\n431#1:842,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3 extends Lambda implements C11305q<ExposedDropdownMenuBoxScope, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C24396c, C11079d2> $actioner;
    final /* synthetic */ String $country;
    final /* synthetic */ String[] $countryList;
    final /* synthetic */ C8700z0<Boolean> $expanded$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3(String str, int i, C8700z0<Boolean> z0Var, String[] strArr, C11300l<? super C24396c, C11079d2> lVar) {
        super(3);
        this.$country = str;
        this.$$dirty = i;
        this.$expanded$delegate = z0Var;
        this.$countryList = strArr;
        this.$actioner = lVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71304a(@org.jetbrains.annotations.C12579k androidx.compose.material.ExposedDropdownMenuBoxScope r74, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r75, int r76) {
        /*
            r73 = this;
            r0 = r73
            r10 = r75
            java.lang.String r1 = "$this$ExposedDropdownMenuBox"
            r11 = r74
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x001c
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.UserAddressField.<anonymous> (CreateLoyaltyCardStepTwoScreen.kt:407)"
            r3 = -947869168(0xffffffffc780aa10, float:-65876.125)
            r4 = r76
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r4, r1, r2)
        L_0x001c:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r2 = 0
            r3 = 0
            r6 = 1
            androidx.compose.ui.m r12 = androidx.compose.foundation.layout.SizeKt.m10114n(r1, r2, r6, r3)
            r13 = 0
            r1 = 40
            float r1 = (float) r1
            float r14 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r15 = 0
            r16 = 0
            r17 = 13
            r18 = 0
            androidx.compose.ui.m r51 = androidx.compose.foundation.layout.PaddingKt.m10028o(r12, r13, r14, r15, r16, r17, r18)
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.foundation.shape.n r67 = androidx.compose.foundation.shape.C2694o.m12166h(r1)
            androidx.compose.material.TextFieldDefaults r1 = androidx.compose.material.TextFieldDefaults.f7961a
            com.carrefour.fid.android.design.theme.b r2 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r12 = r2.mo114218O()
            long r14 = r2.mo114204A()
            long r32 = r2.mo114218O()
            long r34 = r2.mo114205B()
            long r8 = r2.mo114218O()
            long r18 = r2.mo114227X()
            long r38 = r2.mo114227X()
            r2 = 0
            r4 = 0
            r16 = 0
            r6 = r16
            r10 = r16
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r36 = 0
            r40 = 0
            r42 = 0
            r45 = 0
            r46 = 0
            r47 = 48
            r48 = 1736343(0x1a7e97, float:2.433135E-39)
            r44 = r75
            androidx.compose.material.s1 r68 = r1.mo10637l(r2, r4, r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r45, r46, r47, r48)
            java.lang.String r1 = r0.$country
            r49 = r1
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$1 r50 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3.C243861.f60843f
            r52 = 0
            r53 = 1
            r54 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.ComposableSingletons$CreateLoyaltyCardStepTwoScreenKt r1 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.ComposableSingletons$CreateLoyaltyCardStepTwoScreenKt.f60824a
            kotlin.jvm.functions.p r55 = r1.mo71269b()
            r56 = 0
            r57 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$2 r1 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$2
            androidx.compose.runtime.z0<java.lang.Boolean> r2 = r0.$expanded$delegate
            r1.<init>(r2)
            r2 = -1487980857(0xffffffffa74f36c7, float:-2.8756716E-15)
            r6 = r75
            r3 = 1
            androidx.compose.runtime.internal.a r58 = androidx.compose.runtime.internal.C8553b.m31048b(r6, r2, r3, r1)
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            int r1 = r0.$$dirty
            int r1 = r1 >> 18
            r1 = r1 & 14
            r2 = 806904240(0x301861b0, float:5.54361E-10)
            r70 = r1 | r2
            r71 = 0
            r72 = 261544(0x3fda8, float:3.66501E-40)
            r69 = r75
            androidx.compose.material.OutlinedTextFieldKt.m13660c(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            androidx.compose.runtime.z0<java.lang.Boolean> r1 = r0.$expanded$delegate
            boolean r2 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt.m107007B(r1)
            androidx.compose.runtime.z0<java.lang.Boolean> r1 = r0.$expanded$delegate
            r4 = 1157296644(0x44faf204, float:2007.563)
            r6.mo14918M(r4)
            boolean r4 = r6.mo15006n0(r1)
            java.lang.Object r5 = r75.mo14921N()
            if (r4 != 0) goto L_0x00fa
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r5 != r4) goto L_0x0102
        L_0x00fa:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$3$1 r5 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$3$1
            r5.<init>(r1)
            r6.mo14893C(r5)
        L_0x0102:
            r75.mo15002m0()
            r4 = r5
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r5 = 0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$4 r1 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3$4
            java.lang.String[] r7 = r0.$countryList
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.c, kotlin.d2> r8 = r0.$actioner
            androidx.compose.runtime.z0<java.lang.Boolean> r9 = r0.$expanded$delegate
            int r10 = r0.$$dirty
            r1.<init>(r7, r8, r9, r10)
            r7 = 224858114(0xd671002, float:7.120164E-31)
            androidx.compose.runtime.internal.a r7 = androidx.compose.runtime.internal.C8553b.m31048b(r6, r7, r3, r1)
            r8 = 35840(0x8c00, float:5.0223E-41)
            r9 = 4
            r1 = r74
            r3 = r4
            r4 = r5
            r5 = r7
            r6 = r75
            r7 = r8
            r8 = r9
            r1.mo10200b(r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0136
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserAddressField$3.mo71304a(androidx.compose.material.ExposedDropdownMenuBoxScope, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo71304a((ExposedDropdownMenuBoxScope) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
