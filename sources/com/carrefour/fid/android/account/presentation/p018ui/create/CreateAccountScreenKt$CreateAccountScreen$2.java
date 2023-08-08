package com.carrefour.fid.android.account.presentation.p018ui.create;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCreateAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateAccountScreen.kt\ncom/carrefour/fid/android/account/presentation/ui/create/CreateAccountScreenKt$CreateAccountScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,104:1\n83#2,3:105\n36#2:114\n1114#3,6:108\n1114#3,6:115\n*S KotlinDebug\n*F\n+ 1 CreateAccountScreen.kt\ncom/carrefour/fid/android/account/presentation/ui/create/CreateAccountScreenKt$CreateAccountScreen$2\n*L\n65#1:105,3\n99#1:114\n65#1:108,6\n99#1:115,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountScreen$2 */
public final class CreateAccountScreenKt$CreateAccountScreen$2 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C13488a, C11079d2> $actioner;
    final /* synthetic */ String $createAccountUrl;
    final /* synthetic */ String $signInUrl;
    final /* synthetic */ String $userAgent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAccountScreenKt$CreateAccountScreen$2(String str, C11300l<? super C13488a, C11079d2> lVar, String str2, String str3, int i) {
        super(3);
        this.$signInUrl = str;
        this.$actioner = lVar;
        this.$userAgent = str2;
        this.$createAccountUrl = str3;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r8, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r8 = r10 & 81
            r0 = 16
            if (r8 != r0) goto L_0x0017
            boolean r8 = r9.mo15011p()
            if (r8 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r9.mo14958a0()
            goto L_0x00a3
        L_0x0017:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0026
            r8 = -1
            java.lang.String r0 = "com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreen.<anonymous> (CreateAccountScreen.kt:63)"
            r1 = -1580984715(0xffffffffa1c41675, float:-1.3287421E-18)
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r10, r8, r0)
        L_0x0026:
            r8 = 4
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r0 = r7.$signInUrl
            r1 = 0
            r10[r1] = r0
            kotlin.jvm.functions.l<com.carrefour.fid.android.account.presentation.ui.create.a, kotlin.d2> r2 = r7.$actioner
            r3 = 1
            r10[r3] = r2
            java.lang.String r3 = r7.$userAgent
            r4 = 2
            r10[r4] = r3
            java.lang.String r4 = r7.$createAccountUrl
            r5 = 3
            r10[r5] = r4
            r5 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r9.mo14918M(r5)
            r5 = r1
        L_0x0044:
            if (r1 >= r8) goto L_0x0050
            r6 = r10[r1]
            boolean r6 = r9.mo15006n0(r6)
            r5 = r5 | r6
            int r1 = r1 + 1
            goto L_0x0044
        L_0x0050:
            java.lang.Object r8 = r9.mo14921N()
            if (r5 != 0) goto L_0x005e
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r8 != r10) goto L_0x0066
        L_0x005e:
            com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountScreen$2$1$1 r8 = new com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountScreen$2$1$1
            r8.<init>(r3, r4, r0, r2)
            r9.mo14893C(r8)
        L_0x0066:
            r9.mo15002m0()
            r0 = r8
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            r1 = 0
            java.lang.String r8 = r7.$createAccountUrl
            r10 = 1157296644(0x44faf204, float:2007.563)
            r9.mo14918M(r10)
            boolean r10 = r9.mo15006n0(r8)
            java.lang.Object r2 = r9.mo14921N()
            if (r10 != 0) goto L_0x0087
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r2 != r10) goto L_0x008f
        L_0x0087:
            com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountScreen$2$2$1 r2 = new com.carrefour.fid.android.account.presentation.ui.create.CreateAccountScreenKt$CreateAccountScreen$2$2$1
            r2.<init>(r8)
            r9.mo14893C(r2)
        L_0x008f:
            r9.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            r4 = 0
            r5 = 2
            r3 = r9
            androidx.compose.p004ui.viewinterop.AndroidView_androidKt.m74829a(r0, r1, r2, r3, r4, r5)
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x00a3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.p018ui.create.CreateAccountScreenKt$CreateAccountScreen$2.invoke(androidx.compose.foundation.layout.i0, androidx.compose.runtime.o, int):void");
    }
}
