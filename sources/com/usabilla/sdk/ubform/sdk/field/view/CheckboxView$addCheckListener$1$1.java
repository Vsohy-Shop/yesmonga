package com.usabilla.sdk.ubform.sdk.field.view;

import com.usabilla.sdk.ubform.customViews.CheckOption;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CheckboxView$addCheckListener$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ CheckboxView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxView$addCheckListener$1$1(CheckboxView checkboxView) {
        super(0);
        this.this$0 = checkboxView;
    }

    public final void invoke() {
        ArrayList<CheckOption> arrayList = new ArrayList<>();
        for (Object next : this.this$0.f27521E0) {
            if (((CheckOption) next).getCheckIcon().isChecked()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (CheckOption tag : arrayList) {
            Object tag2 = tag.getTag();
            if (tag2 != null) {
                arrayList2.add((String) tag2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        CheckboxView.m37791o(this.this$0).mo20824R(arrayList2);
    }
}
