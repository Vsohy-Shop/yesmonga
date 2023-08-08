package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.base.C28499q;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nShoppingListScreenStateFul.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt$ShoppingListScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,492:1\n36#2:493\n36#2:500\n36#2:507\n1114#3,6:494\n1114#3,6:501\n1114#3,6:508\n*S KotlinDebug\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt$ShoppingListScreen$2\n*L\n313#1:493\n321#1:500\n326#1:507\n313#1:494,6\n321#1:501,6\n326#1:508,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$2 */
public final class ShoppingListScreenStateFulKt$ShoppingListScreen$2 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23066f, C11079d2> $actioner;
    final /* synthetic */ C28499q $fragment;
    final /* synthetic */ C28892e<List<C27670g>> $productResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListScreenStateFulKt$ShoppingListScreen$2(C28892e<? extends List<? extends C27670g>> eVar, C28499q qVar, C11300l<? super C23066f, C11079d2> lVar, int i) {
        super(3);
        this.$productResult = eVar;
        this.$fragment = qVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r12, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "padding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r14 & 14
            if (r0 != 0) goto L_0x0013
            boolean r0 = r13.mo15006n0(r12)
            if (r0 == 0) goto L_0x0011
            r0 = 4
            goto L_0x0012
        L_0x0011:
            r0 = 2
        L_0x0012:
            r14 = r14 | r0
        L_0x0013:
            r0 = r14 & 91
            r1 = 18
            if (r0 != r1) goto L_0x0025
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            r13.mo14958a0()
            goto L_0x017f
        L_0x0025:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0034
            r0 = -1
            java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreen.<anonymous> (ShoppingListScreenStateFul.kt:303)"
            r2 = -1379032876(0xffffffffadcda0d4, float:-2.3377224E-11)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r14, r0, r1)
        L_0x0034:
            com.carrefour.fid.android.shared.type.e<java.util.List<com.carrefour.fid.android.product.presentation.models.g>> r0 = r11.$productResult
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28896d
            r2 = 1
            if (r1 == 0) goto L_0x003d
            r1 = r2
            goto L_0x0043
        L_0x003d:
            com.carrefour.fid.android.shared.type.e$b r1 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
        L_0x0043:
            r3 = 0
            if (r1 == 0) goto L_0x0055
            r12 = -963832084(0xffffffffc68d16ec, float:-18059.46)
            r13.mo14918M(r12)
            r12 = 0
            com.carrefour.fid.android.presentation.p035ui.account.list.shopping.ShoppingListLoadingScreenKt.m103531a(r12, r13, r3, r2)
            r13.mo15002m0()
            goto L_0x0176
        L_0x0055:
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            r4 = 1157296644(0x44faf204, float:2007.563)
            if (r1 == 0) goto L_0x00e5
            r0 = -963831987(0xffffffffc68d174d, float:-18059.65)
            r13.mo14918M(r0)
            com.carrefour.fid.android.shared.type.e<java.util.List<com.carrefour.fid.android.product.presentation.models.g>> r0 = r11.$productResult
            com.carrefour.fid.android.shared.type.e$c r0 = (com.carrefour.fid.android.shared.type.C28892e.C28895c) r0
            java.lang.Object r0 = r0.mo84088d()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00a9
            r0 = -963831932(0xffffffffc68d1784, float:-18059.758)
            r13.mo14918M(r0)
            com.carrefour.fid.android.shared.type.e<java.util.List<com.carrefour.fid.android.product.presentation.models.g>> r0 = r11.$productResult
            com.carrefour.fid.android.shared.type.e$c r0 = (com.carrefour.fid.android.shared.type.C28892e.C28895c) r0
            java.lang.Object r0 = r0.mo84088d()
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            com.carrefour.fid.android.shared.base.q r3 = r11.$fragment
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.account.list.shopping.f, kotlin.d2> r4 = r11.$actioner
            int r14 = r14 << 3
            r14 = r14 & 112(0x70, float:1.57E-43)
            r14 = r14 | 8
            int r0 = com.carrefour.fid.android.shared.base.C28499q.$stable
            int r0 = r0 << 6
            r14 = r14 | r0
            int r0 = r11.$$dirty
            int r2 = r0 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r14 = r14 | r2
            int r0 = r0 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r6 = r14 | r0
            r2 = r12
            r5 = r13
            com.carrefour.fid.android.presentation.p035ui.account.list.shopping.ShoppingListScreenStateFulKt.m103538d(r1, r2, r3, r4, r5, r6)
            r13.mo15002m0()
            goto L_0x00e0
        L_0x00a9:
            r12 = -963831816(0xffffffffc68d17f8, float:-18059.984)
            r13.mo14918M(r12)
            r12 = 2131953702(0x7f130826, float:1.9543882E38)
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71858d(r12, r13, r3)
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.account.list.shopping.f, kotlin.d2> r14 = r11.$actioner
            r13.mo14918M(r4)
            boolean r0 = r13.mo15006n0(r14)
            java.lang.Object r1 = r13.mo14921N()
            if (r0 != 0) goto L_0x00cd
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x00d5
        L_0x00cd:
            com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$2$1$1 r1 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$2$1$1
            r1.<init>(r14)
            r13.mo14893C(r1)
        L_0x00d5:
            r13.mo15002m0()
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            com.carrefour.fid.android.presentation.p035ui.account.list.shopping.ShoppingListEmptyScreenKt.m103510a(r12, r1, r13, r3)
            r13.mo15002m0()
        L_0x00e0:
            r13.mo15002m0()
            goto L_0x0176
        L_0x00e5:
            boolean r12 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r12 == 0) goto L_0x016d
            r12 = -963831549(0xffffffffc68d1903, float:-18060.506)
            r13.mo14918M(r12)
            com.carrefour.fid.android.shared.type.e<java.util.List<com.carrefour.fid.android.product.presentation.models.g>> r12 = r11.$productResult
            com.carrefour.fid.android.shared.type.e$a r12 = (com.carrefour.fid.android.shared.type.C28892e.C28893a) r12
            java.lang.Throwable r12 = r12.mo84083d()
            boolean r12 = r12 instanceof com.carrefour.fid.android.shared.p046io.RequireSignInThrowable
            if (r12 == 0) goto L_0x0133
            r12 = -963831449(0xffffffffc68d1967, float:-18060.701)
            r13.mo14918M(r12)
            r12 = 2131952300(0x7f1302ac, float:1.9541039E38)
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71858d(r12, r13, r3)
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.account.list.shopping.f, kotlin.d2> r14 = r11.$actioner
            r13.mo14918M(r4)
            boolean r0 = r13.mo15006n0(r14)
            java.lang.Object r1 = r13.mo14921N()
            if (r0 != 0) goto L_0x011f
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0127
        L_0x011f:
            com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$2$2$1 r1 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$2$2$1
            r1.<init>(r14)
            r13.mo14893C(r1)
        L_0x0127:
            r13.mo15002m0()
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            com.carrefour.fid.android.presentation.p035ui.account.list.shopping.ShoppingListEmptyScreenKt.m103510a(r12, r1, r13, r3)
            r13.mo15002m0()
            goto L_0x0169
        L_0x0133:
            r12 = -963831204(0xffffffffc68d1a5c, float:-18061.18)
            r13.mo14918M(r12)
            r5 = 0
            r6 = 0
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.account.list.shopping.f, kotlin.d2> r12 = r11.$actioner
            r13.mo14918M(r4)
            boolean r14 = r13.mo15006n0(r12)
            java.lang.Object r0 = r13.mo14921N()
            if (r14 != 0) goto L_0x0152
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r14.mo16277a()
            if (r0 != r14) goto L_0x015a
        L_0x0152:
            com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$2$3$1 r0 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$2$3$1
            r0.<init>(r12)
            r13.mo14893C(r0)
        L_0x015a:
            r13.mo15002m0()
            r7 = r0
            kotlin.jvm.functions.a r7 = (kotlin.jvm.functions.C11289a) r7
            r9 = 0
            r10 = 3
            r8 = r13
            com.carrefour.fid.android.design.components.compose.MessageComponentKt.m151549f(r5, r6, r7, r8, r9, r10)
            r13.mo15002m0()
        L_0x0169:
            r13.mo15002m0()
            goto L_0x0176
        L_0x016d:
            r12 = -963830996(0xffffffffc68d1b2c, float:-18061.586)
            r13.mo14918M(r12)
            r13.mo15002m0()
        L_0x0176:
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x017f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$2.invoke(androidx.compose.foundation.layout.i0, androidx.compose.runtime.o, int):void");
    }
}
