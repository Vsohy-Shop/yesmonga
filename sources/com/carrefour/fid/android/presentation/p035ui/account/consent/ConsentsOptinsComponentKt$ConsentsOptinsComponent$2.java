package com.carrefour.fid.android.presentation.p035ui.account.consent;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsOptinsComponent$2 */
public final class ConsentsOptinsComponentKt$ConsentsOptinsComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C22934l, C11079d2> $actioner;
    final /* synthetic */ boolean $areNotificationsEnabled;
    final /* synthetic */ String $carrefourPartnerUrl;
    final /* synthetic */ boolean $hasCardFid;
    final /* synthetic */ List<ConsentOptIn> $loyaltyConsents;
    final /* synthetic */ List<ConsentOptIn> $userConsents;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentsOptinsComponentKt$ConsentsOptinsComponent$2(List<ConsentOptIn> list, List<ConsentOptIn> list2, String str, boolean z, boolean z2, C11300l<? super C22934l, C11079d2> lVar, int i) {
        super(2);
        this.$userConsents = list;
        this.$loyaltyConsents = list2;
        this.$carrefourPartnerUrl = str;
        this.$areNotificationsEnabled = z;
        this.$hasCardFid = z2;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ConsentsOptinsComponentKt.m103246g(this.$userConsents, this.$loyaltyConsents, this.$carrefourPartnerUrl, this.$areNotificationsEnabled, this.$hasCardFid, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
