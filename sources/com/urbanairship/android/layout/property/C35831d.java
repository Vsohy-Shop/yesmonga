package com.urbanairship.android.layout.property;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.property.d */
public final class C35831d {
    /* renamed from: a */
    public static final boolean m147741a(@C12579k List<? extends ButtonClickBehaviorType> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.contains(ButtonClickBehaviorType.CANCEL);
    }

    /* renamed from: b */
    public static final boolean m147742b(@C12579k List<? extends ButtonClickBehaviorType> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (m147741a(list) || m147743c(list)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m147743c(@C12579k List<? extends ButtonClickBehaviorType> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.contains(ButtonClickBehaviorType.DISMISS);
    }

    /* renamed from: d */
    public static final boolean m147744d(@C12579k List<? extends ButtonClickBehaviorType> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.contains(ButtonClickBehaviorType.FORM_SUBMIT);
    }

    /* renamed from: e */
    public static final boolean m147745e(@C12579k List<? extends ButtonClickBehaviorType> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.contains(ButtonClickBehaviorType.PAGER_NEXT);
    }

    /* renamed from: f */
    public static final boolean m147746f(@C12579k List<? extends ButtonClickBehaviorType> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.contains(ButtonClickBehaviorType.PAGER_PREVIOUS);
    }
}
