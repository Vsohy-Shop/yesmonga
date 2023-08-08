package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.e */
public final class C34807e extends C34811i {

    /* renamed from: f */
    public static final int f84474f = 8;

    /* renamed from: g */
    public static final int f84475g = 20;

    /* renamed from: h */
    public static final int f84476h = 16;

    /* renamed from: d */
    public final String f84477d;

    /* renamed from: e */
    public final String f84478e;

    public C34807e(C34709a aVar, String str, String str2) {
        super(aVar);
        this.f84477d = str2;
        this.f84478e = str;
    }

    /* renamed from: d */
    public String mo102980d() throws NotFoundException {
        if (mo102986c().mo102649o() == 84) {
            StringBuilder sb = new StringBuilder();
            mo102982f(sb, 8);
            mo102984j(sb, 48, 20);
            mo102981k(sb, 68);
            return sb.toString();
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: h */
    public void mo102978h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f84478e);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* renamed from: i */
    public int mo102979i(int i) {
        return i % 100000;
    }

    /* renamed from: k */
    public final void mo102981k(StringBuilder sb, int i) {
        int f = mo102985b().mo103005f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f84477d);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }
}
