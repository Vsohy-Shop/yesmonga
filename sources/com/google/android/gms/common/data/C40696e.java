package com.google.android.gms.common.data;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.data.C40694d;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.e */
public final class C40696e implements C40694d, C40694d.C40695a {

    /* renamed from: a */
    public HashSet f103673a = new HashSet();

    /* renamed from: a */
    public void mo134153a(int i, int i2) {
        Iterator it = this.f103673a.iterator();
        while (it.hasNext()) {
            ((C40694d) it.next()).mo134153a(i, i2);
        }
    }

    /* renamed from: b */
    public void mo134154b(int i, int i2) {
        Iterator it = this.f103673a.iterator();
        while (it.hasNext()) {
            ((C40694d) it.next()).mo134154b(i, i2);
        }
    }

    /* renamed from: c */
    public void mo134158c(@C0359n0 C40694d dVar) {
        this.f103673a.remove(dVar);
    }

    /* renamed from: d */
    public void mo134159d(@C0359n0 C40694d dVar) {
        this.f103673a.add(dVar);
    }

    /* renamed from: e */
    public void mo134155e(int i, int i2, int i3) {
        Iterator it = this.f103673a.iterator();
        while (it.hasNext()) {
            ((C40694d) it.next()).mo134155e(i, i2, i3);
        }
    }

    /* renamed from: f */
    public void mo134156f(int i, int i2) {
        Iterator it = this.f103673a.iterator();
        while (it.hasNext()) {
            ((C40694d) it.next()).mo134156f(i, i2);
        }
    }

    /* renamed from: g */
    public void mo134157g() {
        Iterator it = this.f103673a.iterator();
        while (it.hasNext()) {
            ((C40694d) it.next()).mo134157g();
        }
    }

    /* renamed from: h */
    public void mo134160h() {
        this.f103673a.clear();
    }

    /* renamed from: i */
    public boolean mo134161i() {
        return !this.f103673a.isEmpty();
    }
}
