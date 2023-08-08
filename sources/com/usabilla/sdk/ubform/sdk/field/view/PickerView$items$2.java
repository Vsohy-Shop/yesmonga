package com.usabilla.sdk.ubform.sdk.field.view;

import com.usabilla.sdk.ubform.sdk.field.model.common.Option;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, mo22516d2 = {"", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PickerView$items$2 extends Lambda implements C11289a<List<String>> {
    final /* synthetic */ PickerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickerView$items$2(PickerView pickerView) {
        super(0);
        this.this$0 = pickerView;
    }

    @C12579k
    public final List<String> invoke() {
        List<String> P = CollectionsKt__CollectionsKt.m40452P(PickerView.m37832p(this.this$0).mo20849M());
        Iterable<Option> options = PickerView.m37832p(this.this$0).getOptions();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(options, 10));
        for (Option a : options) {
            arrayList.add(a.mo21005a());
        }
        P.addAll(arrayList);
        return P;
    }
}
