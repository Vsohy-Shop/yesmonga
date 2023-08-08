package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.carrefour.fid.android.design.components.compose.C36965b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInputComponent$2$1 extends Lambda implements C11300l<C36965b, C11079d2> {
    final /* synthetic */ SnapshotStateList<String> $digitList;
    final /* synthetic */ SnapshotStateList<Boolean> $isFocusState;
    final /* synthetic */ C11289a<C11079d2> $onHelperLinkClicked;
    final /* synthetic */ C11300l<String, C11079d2> $onValidateButtonClicked;
    final /* synthetic */ C8700z0<Boolean> $passwordVisibilityState$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInputComponent$2$1(C11289a<C11079d2> aVar, C11300l<? super String, C11079d2> lVar, SnapshotStateList<String> snapshotStateList, SnapshotStateList<Boolean> snapshotStateList2, C8700z0<Boolean> z0Var) {
        super(1);
        this.$onHelperLinkClicked = aVar;
        this.$onValidateButtonClicked = lVar;
        this.$digitList = snapshotStateList;
        this.$isFocusState = snapshotStateList2;
        this.$passwordVisibilityState$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo111993a(@C12579k C36965b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "action");
        if (Intrinsics.areEqual((Object) bVar, (Object) C36965b.C36968c.f92352a)) {
            this.$onHelperLinkClicked.invoke();
        } else if (bVar instanceof C36965b.C36970e) {
            this.$onValidateButtonClicked.invoke(((C36965b.C36970e) bVar).mo112344d());
        } else if (bVar instanceof C36965b.C36969d) {
            CodeDigitsFieldComponentKt.m151375c(this.$passwordVisibilityState$delegate, ((C36965b.C36969d) bVar).mo112338d());
        } else if (bVar instanceof C36965b.C36966a) {
            C36965b.C36966a aVar = (C36965b.C36966a) bVar;
            this.$digitList.set(aVar.mo112325f(), aVar.mo112323e());
        } else if (bVar instanceof C36965b.C36967b) {
            C36965b.C36967b bVar2 = (C36965b.C36967b) bVar;
            this.$isFocusState.set(bVar2.mo112331e(), Boolean.valueOf(bVar2.mo112333f()));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo111993a((C36965b) obj);
        return C11079d2.f28267a;
    }
}
