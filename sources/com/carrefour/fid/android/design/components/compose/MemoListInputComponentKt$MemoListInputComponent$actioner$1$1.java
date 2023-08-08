package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.design.components.compose.C36990j;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MemoListInputComponentKt$MemoListInputComponent$actioner$1$1 extends Lambda implements C11300l<C36990j, C11079d2> {
    final /* synthetic */ C11300l<String, C11079d2> $onMemoAddClick;
    final /* synthetic */ C11289a<C11079d2> $onMemoInputClick;
    final /* synthetic */ C8700z0<TextFieldValue> $textFieldValue$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoListInputComponentKt$MemoListInputComponent$actioner$1$1(C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar, C8700z0<TextFieldValue> z0Var) {
        super(1);
        this.$onMemoAddClick = lVar;
        this.$onMemoInputClick = aVar;
        this.$textFieldValue$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo112225a(@C12579k C36990j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "it");
        if (jVar instanceof C36990j.C36991a) {
            this.$onMemoAddClick.invoke(((C36990j.C36991a) jVar).mo112418d());
            MemoListInputComponentKt.m151534d(this.$textFieldValue$delegate, new TextFieldValue("", 0, (C16356n0) null, 6, (DefaultConstructorMarker) null));
        } else if (jVar instanceof C36990j.C36993c) {
            MemoListInputComponentKt.m151534d(this.$textFieldValue$delegate, ((C36990j.C36993c) jVar).mo112424d());
        } else if (Intrinsics.areEqual((Object) jVar, (Object) C36990j.C36992b.f92398a)) {
            this.$onMemoInputClick.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo112225a((C36990j) obj);
        return C11079d2.f28267a;
    }
}
