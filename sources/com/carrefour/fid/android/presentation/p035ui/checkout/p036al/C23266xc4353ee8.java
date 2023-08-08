package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$3$1$1 */
public final class C23266xc4353ee8 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $isExpanded;
    final /* synthetic */ String $talkbackBackdropClose;
    final /* synthetic */ String $talkbackBackdropOpen;
    final /* synthetic */ String $talkbackBackdropStateClosed;
    final /* synthetic */ String $talkbackBackdropStateOpened;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23266xc4353ee8(C8700z0<Boolean> z0Var, String str, String str2, String str3, String str4) {
        super(1);
        this.$isExpanded = z0Var;
        this.$talkbackBackdropClose = str;
        this.$talkbackBackdropOpen = str2;
        this.$talkbackBackdropStateOpened = str3;
        this.$talkbackBackdropStateClosed = str4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71959G0(qVar, this.$isExpanded.getValue().booleanValue() ? this.$talkbackBackdropClose : this.$talkbackBackdropOpen);
        SemanticsPropertiesKt.m71989V0(qVar, this.$isExpanded.getValue().booleanValue() ? this.$talkbackBackdropStateOpened : this.$talkbackBackdropStateClosed);
    }
}
