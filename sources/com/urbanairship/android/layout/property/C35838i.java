package com.urbanairship.android.layout.property;

import com.urbanairship.android.layout.property.EventHandler;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.property.i */
public final class C35838i {
    /* renamed from: a */
    public static final boolean m147765a(@C12580l List<EventHandler> list) {
        boolean z;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        Iterable<EventHandler> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (EventHandler f : iterable) {
            if (f.mo107266f() == EventHandler.Type.FORM_INPUT) {
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
    public static final boolean m147766b(@C12580l List<EventHandler> list) {
        boolean z;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        Iterable<EventHandler> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (EventHandler f : iterable) {
            if (f.mo107266f() == EventHandler.Type.TAP) {
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
