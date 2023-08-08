package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.account.Address;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.AddressComponentKt$FilledAddressComponent$3 */
public final class AddressComponentKt$FilledAddressComponent$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Address $address;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onEditClicked;
    final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressComponentKt$FilledAddressComponent$3(C8767m mVar, String str, Address address, C11289a<C11079d2> aVar, int i) {
        super(2);
        this.$modifier = mVar;
        this.$title = str;
        this.$address = address;
        this.$onEditClicked = aVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AddressComponentKt.m104986d(this.$modifier, this.$title, this.$address, this.$onEditClicked, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
