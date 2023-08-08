package com.carrefour.fid.android.presentation.p035ui.account.consent;

import com.carrefour.fid.android.domain.models.consent.ChoiceOptIn;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22934l;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nConsentsOptinsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentsOptinsComponent.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/ConsentsOptinsComponentKt$ToComponent$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,454:1\n766#2:455\n857#2,2:456\n1549#2:458\n1620#2,3:459\n*S KotlinDebug\n*F\n+ 1 ConsentsOptinsComponent.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/ConsentsOptinsComponentKt$ToComponent$4\n*L\n412#1:455\n412#1:456,2\n413#1:458\n413#1:459,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ToComponent$4 */
public final class ConsentsOptinsComponentKt$ToComponent$4 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ C11300l<C22934l, C11079d2> $actioner;
    final /* synthetic */ List<ConsentOptIn> $this_ToComponent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentsOptinsComponentKt$ToComponent$4(C11300l<? super C22934l, C11079d2> lVar, List<ConsentOptIn> list) {
        super(1);
        this.$actioner = lVar;
        this.$this_ToComponent = list;
    }

    /* renamed from: a */
    public final void mo67423a(boolean z) {
        boolean z2;
        C11300l<C22934l, C11079d2> lVar = this.$actioner;
        ArrayList<ConsentOptIn> arrayList = new ArrayList<>();
        for (Object next : this.$this_ToComponent) {
            if (((ConsentOptIn) next).mo117324f().mo117315r() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (ConsentOptIn h : arrayList) {
            arrayList2.add(h.mo117326h());
        }
        lVar.invoke(new C22934l.C22935a(arrayList2, ChoiceOptIn.f95635a.mo117316a(z)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67423a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
