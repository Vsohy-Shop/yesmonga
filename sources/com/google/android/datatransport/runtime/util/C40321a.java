package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.C0359n0;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* renamed from: com.google.android.datatransport.runtime.util.a */
public final class C40321a {

    /* renamed from: a */
    public static SparseArray<Priority> f102685a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<Priority, Integer> f102686b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f102686b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f102686b.put(Priority.VERY_LOW, 1);
        f102686b.put(Priority.HIGHEST, 2);
        for (Priority next : f102686b.keySet()) {
            f102685a.append(f102686b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m163826a(@C0359n0 Priority priority) {
        Integer num = f102686b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @C0359n0
    /* renamed from: b */
    public static Priority m163827b(int i) {
        Priority priority = f102685a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
