package com.urbanairship.android.layout.property;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.property.h */
public final class C35837h {
    /* renamed from: a */
    public static final boolean m147763a(@C12580l List<? extends EnableBehaviorType> list) {
        boolean z;
        if (list == null) {
            return false;
        }
        Iterable<EnableBehaviorType> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (EnableBehaviorType enableBehaviorType : iterable) {
            if (enableBehaviorType == EnableBehaviorType.FORM_VALIDATION || enableBehaviorType == EnableBehaviorType.FORM_SUBMISSION) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m147764b(@C12580l List<? extends EnableBehaviorType> list) {
        boolean z;
        if (list == null) {
            return false;
        }
        Iterable<EnableBehaviorType> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (EnableBehaviorType enableBehaviorType : iterable) {
            if (enableBehaviorType == EnableBehaviorType.PAGER_NEXT || enableBehaviorType == EnableBehaviorType.PAGER_PREVIOUS) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
