package org.joda.time.convert;

import org.joda.time.C12589a;
import org.joda.time.C12708h;
import org.joda.time.C12709i;
import org.joda.time.C12714n;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

/* renamed from: org.joda.time.convert.s */
public class C12640s extends C12621a implements C12629h, C12633l, C12628g, C12634m, C12630i {

    /* renamed from: a */
    public static final C12640s f31119a = new C12640s();

    /* renamed from: c */
    public long mo29025c(Object obj) {
        long j;
        long j2;
        long j3;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i = length - 1;
            if (str.charAt(i) == 'S' || str.charAt(i) == 's') {
                String substring = str.substring(2, i);
                int i2 = 0;
                int i3 = -1;
                for (int i4 = 0; i4 < substring.length(); i4++) {
                    if (substring.charAt(i4) < '0' || substring.charAt(i4) > '9') {
                        if (i4 == 0 && substring.charAt(0) == '-') {
                            i2 = 1;
                        } else if (i4 > i2 && substring.charAt(i4) == '.' && i3 == -1) {
                            i3 = i4;
                        } else {
                            throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
                        }
                    }
                }
                if (i3 > 0) {
                    j = Long.parseLong(substring.substring(i2, i3));
                    String substring2 = substring.substring(i3 + 1);
                    if (substring2.length() != 3) {
                        substring2 = (substring2 + "000").substring(0, 3);
                    }
                    j2 = (long) Integer.parseInt(substring2);
                } else {
                    if (i2 != 0) {
                        j3 = Long.parseLong(substring.substring(i2, substring.length()));
                    } else {
                        j3 = Long.parseLong(substring);
                    }
                    j2 = 0;
                    j = j3;
                }
                if (i2 != 0) {
                    return C12652e.m53795e(C12652e.m53799i(-j, 1000), -j2);
                }
                return C12652e.m53795e(C12652e.m53799i(j, 1000), j2);
            }
        }
        throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
    }

    /* renamed from: f */
    public void mo29026f(C12708h hVar, Object obj, C12589a aVar) {
        long j;
        Period period;
        long j2;
        C12708h hVar2 = hVar;
        C12589a aVar2 = aVar;
        String str = (String) obj;
        int indexOf = str.indexOf(47);
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            if (substring.length() > 0) {
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    C12674b N = C12683i.m54174D().mo29230N(aVar2);
                    C12692p e = C12685j.m54341e();
                    char charAt = substring.charAt(0);
                    C12589a aVar3 = null;
                    if (charAt == 'P' || charAt == 'p') {
                        period = e.mo29327q(mo28986d(substring)).mo29322l(substring);
                        j = 0;
                    } else {
                        DateTime n = N.mo29251n(substring);
                        j = n.mo27912k();
                        aVar3 = n.mo27913m();
                        period = null;
                    }
                    char charAt2 = substring2.charAt(0);
                    if (charAt2 != 'P' && charAt2 != 'p') {
                        DateTime n2 = N.mo29251n(substring2);
                        j2 = n2.mo27912k();
                        if (aVar3 == null) {
                            aVar3 = n2.mo27913m();
                        }
                        if (aVar2 != null) {
                            aVar3 = aVar2;
                        }
                        if (period != null) {
                            j = aVar3.mo28636b(period, j2, -1);
                        }
                    } else if (period == null) {
                        Period l = e.mo29327q(mo28986d(substring2)).mo29322l(substring2);
                        if (aVar2 != null) {
                            aVar3 = aVar2;
                        }
                        j2 = aVar3.mo28636b(l, j, 1);
                    } else {
                        throw new IllegalArgumentException("Interval composed of two durations: " + str);
                    }
                    hVar2.mo28323o(j, j2);
                    hVar2.mo28314H(aVar3);
                    return;
                }
                throw new IllegalArgumentException("Format invalid: " + str);
            }
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        throw new IllegalArgumentException("Format requires a '/' separator: " + str);
    }

    /* renamed from: h */
    public long mo28989h(Object obj, C12589a aVar) {
        return C12683i.m54174D().mo29230N(aVar).mo29256s((String) obj);
    }

    /* renamed from: i */
    public void mo29028i(C12709i iVar, Object obj, C12589a aVar) {
        String str = (String) obj;
        C12692p e = C12685j.m54341e();
        iVar.clear();
        int j = e.mo29320j(iVar, str, 0);
        if (j < str.length()) {
            if (j < 0) {
                e.mo29327q(iVar.mo27841F1()).mo29321k(str);
            }
            throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
        }
    }

    /* renamed from: j */
    public Class<?> mo28992j() {
        return String.class;
    }

    /* renamed from: k */
    public int[] mo28990k(C12714n nVar, Object obj, C12589a aVar, C12674b bVar) {
        if (bVar.mo29247j() != null) {
            aVar = aVar.mo27835R(bVar.mo29247j());
        }
        return aVar.mo28647m(nVar, bVar.mo29230N(aVar).mo29256s((String) obj));
    }
}
