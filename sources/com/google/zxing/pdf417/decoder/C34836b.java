package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.C34830a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.zxing.pdf417.decoder.b */
public final class C34836b {

    /* renamed from: a */
    public final Map<Integer, Integer> f84595a = new HashMap();

    /* renamed from: a */
    public Integer mo103051a(int i) {
        return this.f84595a.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public int[] mo103052b() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f84595a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
                arrayList.add(next.getKey());
            } else if (((Integer) next.getValue()).intValue() == i) {
                arrayList.add(next.getKey());
            }
        }
        return C34830a.m142211c(arrayList);
    }

    /* renamed from: c */
    public void mo103053c(int i) {
        Integer num = this.f84595a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f84595a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
