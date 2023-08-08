package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import javax.annotation.CheckForNull;

final class zzjf extends zzjb {

    /* renamed from: v */
    public static final Object[] f106700v;

    /* renamed from: w */
    public static final zzjf f106701w;

    /* renamed from: c */
    public final transient Object[] f106702c;

    /* renamed from: d */
    public final transient int f106703d;

    /* renamed from: e */
    public final transient Object[] f106704e;

    /* renamed from: f */
    public final transient int f106705f;

    /* renamed from: g */
    public final transient int f106706g;

    static {
        Object[] objArr = new Object[0];
        f106700v = objArr;
        f106701w = new zzjf(objArr, 0, objArr, 0, 0);
    }

    public zzjf(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f106702c = objArr;
        this.f106703d = i;
        this.f106704e = objArr2;
        this.f106705f = i2;
        this.f106706g = i3;
    }

    /* renamed from: H */
    public final boolean mo137580H() {
        return true;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f106704e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = C42209u7.m170902a(obj.hashCode());
        while (true) {
            int i = a & this.f106705f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* renamed from: e */
    public final int mo137554e(Object[] objArr, int i) {
        System.arraycopy(this.f106702c, 0, objArr, 0, this.f106706g);
        return this.f106706g;
    }

    /* renamed from: h */
    public final int mo137555h() {
        return this.f106706g;
    }

    public final int hashCode() {
        return this.f106703d;
    }

    /* renamed from: i */
    public final int mo137556i() {
        return 0;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo137583w().listIterator(0);
    }

    /* renamed from: k */
    public final C41894c8 mo137558k() {
        return mo137583w().listIterator(0);
    }

    /* renamed from: q */
    public final Object[] mo137559q() {
        return this.f106702c;
    }

    public final int size() {
        return this.f106706g;
    }

    /* renamed from: y */
    public final zzja mo137584y() {
        return zzja.m171321w(this.f106702c, this.f106706g);
    }
}
