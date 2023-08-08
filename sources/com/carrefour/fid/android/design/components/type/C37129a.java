package com.carrefour.fid.android.design.components.type;

import com.carrefour.fid.android.design.components.widgets.CheckboxComponent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.type.a */
public final class C37129a {
    /* renamed from: a */
    public static final boolean m152197a(@C12579k CheckboxState checkboxState) {
        Intrinsics.checkNotNullParameter(checkboxState, "<this>");
        if (checkboxState == CheckboxState.CHECKED) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: b */
    public static final CheckboxComponent.C37150a m152198b(@C12579k CheckboxComponent.C37150a aVar) {
        CheckboxState checkboxState;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        CheckboxState i = aVar.mo112843i();
        CheckboxState checkboxState2 = CheckboxState.CHECKED;
        if (i == checkboxState2) {
            checkboxState = CheckboxState.UNCHECKED;
        } else {
            checkboxState = checkboxState2;
        }
        return CheckboxComponent.C37150a.m152294g(aVar, false, checkboxState, (String) null, false, (Integer) null, 29, (Object) null);
    }
}
