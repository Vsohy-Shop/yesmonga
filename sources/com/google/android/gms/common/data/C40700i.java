package com.google.android.gms.common.data;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;

@C40473a
/* renamed from: com.google.android.gms.common.data.i */
public abstract class C40700i<T> extends C40691a<T> {

    /* renamed from: b */
    public boolean f103681b = false;

    /* renamed from: c */
    public ArrayList f103682c;

    @C40473a
    public C40700i(@C0359n0 DataHolder dataHolder) {
        super(dataHolder);
    }

    @C40473a
    @C0359n0
    public final T get(int i) {
        int i2;
        int i3;
        mo134183w();
        int r = mo134182r(i);
        int i4 = 0;
        if (i >= 0 && i != this.f103682c.size()) {
            if (i == this.f103682c.size() - 1) {
                i3 = ((DataHolder) C40843u.m166202l(this.f103670a)).getCount();
                i2 = ((Integer) this.f103682c.get(i)).intValue();
            } else {
                i3 = ((Integer) this.f103682c.get(i + 1)).intValue();
                i2 = ((Integer) this.f103682c.get(i)).intValue();
            }
            int i5 = i3 - i2;
            if (i5 == 1) {
                int r2 = mo134182r(i);
                int t0 = ((DataHolder) C40843u.m166202l(this.f103670a)).mo134144t0(r2);
                String i6 = mo134179i();
                if (i6 == null || this.f103670a.mo134143p0(i6, r2, t0) != null) {
                    i4 = 1;
                }
            } else {
                i4 = i5;
            }
        }
        return mo134180k(r, i4);
    }

    @C40473a
    public int getCount() {
        mo134183w();
        return this.f103682c.size();
    }

    @C0363p0
    @C40473a
    /* renamed from: i */
    public String mo134179i() {
        return null;
    }

    @C40473a
    @C0359n0
    /* renamed from: k */
    public abstract T mo134180k(int i, int i2);

    @C40473a
    @C0359n0
    /* renamed from: q */
    public abstract String mo134181q();

    /* renamed from: r */
    public final int mo134182r(int i) {
        if (i >= 0 && i < this.f103682c.size()) {
            return ((Integer) this.f103682c.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    /* renamed from: w */
    public final void mo134183w() {
        synchronized (this) {
            if (!this.f103681b) {
                int count = ((DataHolder) C40843u.m166202l(this.f103670a)).getCount();
                ArrayList arrayList = new ArrayList();
                this.f103682c = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String q = mo134181q();
                    String p0 = this.f103670a.mo134143p0(q, 0, this.f103670a.mo134144t0(0));
                    int i = 1;
                    while (i < count) {
                        int t0 = this.f103670a.mo134144t0(i);
                        String p02 = this.f103670a.mo134143p0(q, i, t0);
                        if (p02 != null) {
                            if (!p02.equals(p0)) {
                                this.f103682c.add(Integer.valueOf(i));
                                p0 = p02;
                            }
                            i++;
                        } else {
                            throw new NullPointerException("Missing value for markerColumn: " + q + ", at row: " + i + ", for window: " + t0);
                        }
                    }
                }
                this.f103681b = true;
            }
        }
    }
}
