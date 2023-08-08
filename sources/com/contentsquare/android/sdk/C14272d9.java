package com.contentsquare.android.sdk;

import java.util.ArrayList;

/* renamed from: com.contentsquare.android.sdk.d9 */
public class C14272d9 implements Comparable<C14272d9> {

    /* renamed from: a */
    public final ArrayList<Integer> f35231a = new ArrayList<>();

    /* renamed from: b */
    public final int f35232b;

    public C14272d9(String str, int i) {
        mo34913g(str);
        this.f35232b = i;
    }

    /* renamed from: b */
    public int compareTo(C14272d9 d9Var) {
        if (this.f35231a.size() != 3 || d9Var.f35231a.size() != 3) {
            return this.f35232b;
        }
        int compareTo = this.f35231a.get(0).compareTo(d9Var.f35231a.get(0));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.f35231a.get(1).compareTo(d9Var.f35231a.get(1));
        return compareTo2 != 0 ? compareTo2 : this.f35231a.get(2).compareTo(d9Var.f35231a.get(2));
    }

    /* renamed from: g */
    public final void mo34913g(String str) {
        try {
            for (String decode : str.split("\\.")) {
                this.f35231a.add(Integer.decode(decode));
            }
            if (this.f35231a.size() != 3) {
                this.f35231a.clear();
            }
        } catch (NumberFormatException unused) {
            this.f35231a.clear();
        }
    }
}
