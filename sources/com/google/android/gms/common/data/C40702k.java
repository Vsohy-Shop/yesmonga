package com.google.android.gms.common.data;

import androidx.annotation.C0359n0;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.k */
public final class C40702k {
    @C0359n0
    /* renamed from: a */
    public static <T, E extends C40701j<T>> ArrayList<T> m165632a(@C0359n0 ArrayList<E> arrayList) {
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C40701j) arrayList.get(i)).mo134185b());
        }
        return arrayList2;
    }

    @C0359n0
    /* renamed from: b */
    public static <T, E extends C40701j<T>> ArrayList<T> m165633b(@C0359n0 E[] eArr) {
        ArrayList<T> arrayList = new ArrayList<>(eArr.length);
        for (E b : eArr) {
            arrayList.add(b.mo134185b());
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: c */
    public static <T, E extends C40701j<T>> ArrayList<T> m165634c(@C0359n0 Iterable<E> iterable) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (E b : iterable) {
            arrayList.add(b.mo134185b());
        }
        return arrayList;
    }
}
