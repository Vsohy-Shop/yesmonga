package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.design.components.compose.C36995l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarComponentKt$SearchBar$actioner$1 extends Lambda implements C11300l<C36995l, C11079d2> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarLongClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchBarScanClick;
    final /* synthetic */ C11300l<String, C11079d2> $onValidSearch;
    final /* synthetic */ C11300l<String, C11079d2> $onValueChange;
    final /* synthetic */ C8700z0<TextFieldValue> $textFieldValue$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarComponentKt$SearchBar$actioner$1(C12074o0 o0Var, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super String, C11079d2> lVar2, C8700z0<TextFieldValue> z0Var) {
        super(1);
        this.$coroutineScope = o0Var;
        this.$onValueChange = lVar;
        this.$onSearchBarClick = aVar;
        this.$onSearchBarLongClick = aVar2;
        this.$onSearchBarScanClick = aVar3;
        this.$onValidSearch = lVar2;
        this.$textFieldValue$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo112283a(@C12579k C36995l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "it");
        if (Intrinsics.areEqual((Object) lVar, (Object) C36995l.C36996a.f92404a)) {
            SearchBarComponentKt.m151613s(this.$coroutineScope, this.$onValueChange, SearchBarComponentKt.m151598d(this.$textFieldValue$delegate), "");
            SearchBarComponentKt.m151599e(this.$textFieldValue$delegate, new TextFieldValue("", 0, (C16356n0) null, 6, (DefaultConstructorMarker) null));
        } else if (Intrinsics.areEqual((Object) lVar, (Object) C36995l.C36997b.f92406a)) {
            C11289a<C11079d2> aVar = this.$onSearchBarClick;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (Intrinsics.areEqual((Object) lVar, (Object) C36995l.C36998c.f92408a)) {
            C11289a<C11079d2> aVar2 = this.$onSearchBarLongClick;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (Intrinsics.areEqual((Object) lVar, (Object) C36995l.C36999d.f92410a)) {
            C11289a<C11079d2> aVar3 = this.$onSearchBarScanClick;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (lVar instanceof C36995l.C37000e) {
            C11300l<String, C11079d2> lVar2 = this.$onValidSearch;
            if (lVar2 != null) {
                lVar2.invoke(((C36995l.C37000e) lVar).mo112436d());
            }
        } else if (lVar instanceof C36995l.C37001f) {
            C36995l.C37001f fVar = (C36995l.C37001f) lVar;
            SearchBarComponentKt.m151613s(this.$coroutineScope, this.$onValueChange, SearchBarComponentKt.m151598d(this.$textFieldValue$delegate), fVar.mo112442d().mo47115i());
            SearchBarComponentKt.m151599e(this.$textFieldValue$delegate, fVar.mo112442d());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo112283a((C36995l) obj);
        return C11079d2.f28267a;
    }
}
