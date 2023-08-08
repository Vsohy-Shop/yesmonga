package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose;

import androidx.compose.p004ui.focus.C15087z;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.compose.C24390b;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.compose.CreateLoyaltyCardStepTwoScreenKt$UserInformationField$2 */
public final class CreateLoyaltyCardStepTwoScreenKt$UserInformationField$2 extends Lambda implements C11300l<C15087z, C11079d2> {
    final /* synthetic */ String $birthDateText;
    final /* synthetic */ C11304p<String, C24390b, C11079d2> $onTextFieldStateChanged;
    final /* synthetic */ Map<String, C24390b> $textFieldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoScreenKt$UserInformationField$2(String str, C11304p<? super String, ? super C24390b, C11079d2> pVar, Map<String, ? extends C24390b> map) {
        super(1);
        this.$birthDateText = str;
        this.$onTextFieldStateChanged = pVar;
        this.$textFieldState = map;
    }

    /* renamed from: a */
    public final void mo71320a(@C12579k C15087z zVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(zVar, "it");
        boolean z2 = true;
        if (!zVar.mo42156g()) {
            if (this.$birthDateText.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (StringKt.m118919a0(this.$birthDateText)) {
                    this.$onTextFieldStateChanged.invoke(CreateLoyaltyCardStepTwoScreenKt.f60829a, C24390b.C24395e.f60857a);
                    return;
                } else {
                    this.$onTextFieldStateChanged.invoke(CreateLoyaltyCardStepTwoScreenKt.f60829a, C24390b.C24393c.f60853a);
                    return;
                }
            }
        }
        if (!zVar.mo42156g() && (this.$textFieldState.get(CreateLoyaltyCardStepTwoScreenKt.f60829a) instanceof C24390b.C24391a)) {
            this.$onTextFieldStateChanged.invoke(CreateLoyaltyCardStepTwoScreenKt.f60829a, C24390b.C24392b.f60851a);
        } else if (zVar.mo42156g()) {
            if (this.$birthDateText.length() != 0) {
                z2 = false;
            }
            if (z2) {
                this.$onTextFieldStateChanged.invoke(CreateLoyaltyCardStepTwoScreenKt.f60829a, C24390b.C24391a.f60849a);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo71320a((C15087z) obj);
        return C11079d2.f28267a;
    }
}
