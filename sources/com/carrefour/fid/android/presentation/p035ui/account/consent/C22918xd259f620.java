package com.carrefour.fid.android.presentation.p035ui.account.consent;

import androidx.compose.p004ui.text.C16156d;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22934l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsShareDataToPartnersComponent$1$1$1 */
public final class C22918xd259f620 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ C11300l<C22934l, C11079d2> $actioner;
    final /* synthetic */ C16156d $annotatedString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22918xd259f620(C16156d dVar, C11300l<? super C22934l, C11079d2> lVar) {
        super(1);
        this.$annotatedString = dVar;
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo67418a(int i) {
        C16156d.C16159b bVar = (C16156d.C16159b) CollectionsKt___CollectionsKt.m40479B2(this.$annotatedString.mo46682i(ConsentsOptinsComponentKt.f58515a, i, i));
        if (bVar != null) {
            this.$actioner.invoke(new C22934l.C22937c((String) bVar.mo46738h()));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67418a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
