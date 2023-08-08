package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12641d;
import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/* renamed from: org.joda.time.format.d */
public class C12676d {

    /* renamed from: a */
    public final C12589a f31221a;

    /* renamed from: b */
    public final long f31222b;

    /* renamed from: c */
    public final Locale f31223c;

    /* renamed from: d */
    public final int f31224d;

    /* renamed from: e */
    public final DateTimeZone f31225e;

    /* renamed from: f */
    public final Integer f31226f;

    /* renamed from: g */
    public DateTimeZone f31227g;

    /* renamed from: h */
    public Integer f31228h;

    /* renamed from: i */
    public Integer f31229i;

    /* renamed from: j */
    public C12677a[] f31230j;

    /* renamed from: k */
    public int f31231k;

    /* renamed from: l */
    public boolean f31232l;

    /* renamed from: m */
    public Object f31233m;

    /* renamed from: org.joda.time.format.d$a */
    public static class C12677a implements Comparable<C12677a> {

        /* renamed from: a */
        public C12599c f31234a;

        /* renamed from: b */
        public int f31235b;

        /* renamed from: c */
        public String f31236c;

        /* renamed from: d */
        public Locale f31237d;

        /* renamed from: b */
        public int compareTo(C12677a aVar) {
            C12599c cVar = aVar.f31234a;
            int j = C12676d.m54113j(this.f31234a.mo28805H(), cVar.mo28805H());
            if (j != 0) {
                return j;
            }
            return C12676d.m54113j(this.f31234a.mo28841t(), cVar.mo28841t());
        }

        /* renamed from: g */
        public void mo29291g(C12599c cVar, int i) {
            this.f31234a = cVar;
            this.f31235b = i;
            this.f31236c = null;
            this.f31237d = null;
        }

        /* renamed from: q */
        public void mo29292q(C12599c cVar, String str, Locale locale) {
            this.f31234a = cVar;
            this.f31235b = 0;
            this.f31236c = str;
            this.f31237d = locale;
        }

        /* renamed from: r */
        public long mo29293r(long j, boolean z) {
            long j2;
            String str = this.f31236c;
            if (str == null) {
                j2 = this.f31234a.mo28821X(j, this.f31235b);
            } else {
                j2 = this.f31234a.mo28818U(j, str, this.f31237d);
            }
            if (z) {
                return this.f31234a.mo28812O(j2);
            }
            return j2;
        }
    }

    /* renamed from: org.joda.time.format.d$b */
    public class C12678b {

        /* renamed from: a */
        public final DateTimeZone f31238a;

        /* renamed from: b */
        public final Integer f31239b;

        /* renamed from: c */
        public final C12677a[] f31240c;

        /* renamed from: d */
        public final int f31241d;

        public C12678b() {
            this.f31238a = C12676d.this.f31227g;
            this.f31239b = C12676d.this.f31228h;
            this.f31240c = C12676d.this.f31230j;
            this.f31241d = C12676d.this.f31231k;
        }

        /* renamed from: a */
        public boolean mo29294a(C12676d dVar) {
            if (dVar != C12676d.this) {
                return false;
            }
            DateTimeZone unused = dVar.f31227g = this.f31238a;
            Integer unused2 = dVar.f31228h = this.f31239b;
            C12677a[] unused3 = dVar.f31230j = this.f31240c;
            if (this.f31241d < dVar.f31231k) {
                boolean unused4 = dVar.f31232l = true;
            }
            int unused5 = dVar.f31231k = this.f31241d;
            return true;
        }
    }

    @Deprecated
    public C12676d(long j, C12589a aVar, Locale locale) {
        this(j, aVar, locale, (Integer) null, 2000);
    }

    /* renamed from: H */
    public static void m54103H(C12677a[] aVarArr, int i) {
        if (i > 10) {
            Arrays.sort(aVarArr, 0, i);
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = i2; i3 > 0; i3--) {
                int i4 = i3 - 1;
                if (aVarArr[i4].compareTo(aVarArr[i3]) <= 0) {
                    break;
                }
                C12677a aVar = aVarArr[i3];
                aVarArr[i3] = aVarArr[i4];
                aVarArr[i4] = aVar;
            }
        }
    }

    /* renamed from: j */
    public static int m54113j(C12646e eVar, C12646e eVar2) {
        if (eVar == null || !eVar.mo29037o0()) {
            if (eVar2 == null || !eVar2.mo29037o0()) {
                return 0;
            }
            return -1;
        } else if (eVar2 == null || !eVar2.mo29037o0()) {
            return 1;
        } else {
            return -eVar.compareTo(eVar2);
        }
    }

    /* renamed from: A */
    public void mo29266A(DateTimeFieldType dateTimeFieldType, int i) {
        mo29284v().mo29291g(dateTimeFieldType.mo27802F(this.f31221a), i);
    }

    /* renamed from: B */
    public void mo29267B(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        mo29284v().mo29292q(dateTimeFieldType.mo27802F(this.f31221a), str, locale);
    }

    /* renamed from: C */
    public Object mo29268C() {
        if (this.f31233m == null) {
            this.f31233m = new C12678b();
        }
        return this.f31233m;
    }

    @Deprecated
    /* renamed from: D */
    public void mo29269D(int i) {
        this.f31233m = null;
        this.f31228h = Integer.valueOf(i);
    }

    /* renamed from: E */
    public void mo29270E(Integer num) {
        this.f31233m = null;
        this.f31228h = num;
    }

    @Deprecated
    /* renamed from: F */
    public void mo29271F(Integer num) {
        this.f31229i = num;
    }

    /* renamed from: G */
    public void mo29272G(DateTimeZone dateTimeZone) {
        this.f31233m = null;
        this.f31227g = dateTimeZone;
    }

    /* renamed from: k */
    public long mo29273k() {
        return mo29275m(false, (CharSequence) null);
    }

    /* renamed from: l */
    public long mo29274l(boolean z) {
        return mo29275m(z, (CharSequence) null);
    }

    /* renamed from: m */
    public long mo29275m(boolean z, CharSequence charSequence) {
        boolean z2;
        C12677a[] aVarArr = this.f31230j;
        int i = this.f31231k;
        if (this.f31232l) {
            aVarArr = (C12677a[]) aVarArr.clone();
            this.f31230j = aVarArr;
            this.f31232l = false;
        }
        m54103H(aVarArr, i);
        if (i > 0) {
            C12646e d = DurationFieldType.m51462k().mo27877d(this.f31221a);
            C12646e d2 = DurationFieldType.m51456b().mo27877d(this.f31221a);
            C12646e t = aVarArr[0].f31234a.mo28841t();
            if (m54113j(t, d) >= 0 && m54113j(t, d2) <= 0) {
                mo29266A(DateTimeFieldType.m51322W(), this.f31224d);
                return mo29275m(z, charSequence);
            }
        }
        long j = this.f31222b;
        int i2 = 0;
        while (i2 < i) {
            try {
                j = aVarArr[i2].mo29293r(j, z);
                i2++;
            } catch (IllegalFieldValueException e) {
                if (charSequence != null) {
                    e.mo27907k("Cannot parse \"" + charSequence + '\"');
                }
                throw e;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < i; i3++) {
                if (!aVarArr[i3].f31234a.mo28808K()) {
                    C12677a aVar = aVarArr[i3];
                    if (i3 == i - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    j = aVar.mo29293r(j, z2);
                }
            }
        }
        Integer num = this.f31228h;
        if (num != null) {
            return j - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.f31227g;
        if (dateTimeZone == null) {
            return j;
        }
        int y = dateTimeZone.mo27833y(j);
        long j2 = j - ((long) y);
        if (y == this.f31227g.mo27830w(j2)) {
            return j2;
        }
        String str = "Illegal instant due to time zone offset transition (" + this.f31227g + ')';
        if (charSequence != null) {
            str = "Cannot parse \"" + charSequence + "\": " + str;
        }
        throw new IllegalInstantException(str);
    }

    /* renamed from: n */
    public long mo29276n(boolean z, String str) {
        return mo29275m(z, str);
    }

    /* renamed from: o */
    public long mo29277o(C12686k kVar, CharSequence charSequence) {
        int b = kVar.mo29196b(this, charSequence, 0);
        if (b < 0) {
            b = ~b;
        } else if (b >= charSequence.length()) {
            return mo29275m(true, charSequence);
        }
        throw new IllegalArgumentException(C12682h.m54165j(charSequence.toString(), b));
    }

    /* renamed from: p */
    public C12589a mo29278p() {
        return this.f31221a;
    }

    /* renamed from: q */
    public Locale mo29279q() {
        return this.f31223c;
    }

    @Deprecated
    /* renamed from: r */
    public int mo29280r() {
        Integer num = this.f31228h;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: s */
    public Integer mo29281s() {
        return this.f31228h;
    }

    /* renamed from: t */
    public Integer mo29282t() {
        return this.f31229i;
    }

    /* renamed from: u */
    public DateTimeZone mo29283u() {
        return this.f31227g;
    }

    /* renamed from: v */
    public final C12677a mo29284v() {
        int i;
        C12677a[] aVarArr = this.f31230j;
        int i2 = this.f31231k;
        if (i2 == aVarArr.length || this.f31232l) {
            if (i2 == aVarArr.length) {
                i = i2 * 2;
            } else {
                i = aVarArr.length;
            }
            C12677a[] aVarArr2 = new C12677a[i];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i2);
            this.f31230j = aVarArr2;
            this.f31232l = false;
            aVarArr = aVarArr2;
        }
        this.f31233m = null;
        C12677a aVar = aVarArr[i2];
        if (aVar == null) {
            aVar = new C12677a();
            aVarArr[i2] = aVar;
        }
        this.f31231k = i2 + 1;
        return aVar;
    }

    /* renamed from: w */
    public long mo29285w(C12675c cVar, CharSequence charSequence) {
        mo29286x();
        return mo29277o(C12679e.m54142c(cVar), charSequence);
    }

    /* renamed from: x */
    public void mo29286x() {
        this.f31227g = this.f31225e;
        this.f31228h = null;
        this.f31229i = this.f31226f;
        this.f31231k = 0;
        this.f31232l = false;
        this.f31233m = null;
    }

    /* renamed from: y */
    public boolean mo29287y(Object obj) {
        if (!(obj instanceof C12678b) || !((C12678b) obj).mo29294a(this)) {
            return false;
        }
        this.f31233m = obj;
        return true;
    }

    /* renamed from: z */
    public void mo29288z(C12599c cVar, int i) {
        mo29284v().mo29291g(cVar, i);
    }

    @Deprecated
    public C12676d(long j, C12589a aVar, Locale locale, Integer num) {
        this(j, aVar, locale, num, 2000);
    }

    public C12676d(long j, C12589a aVar, Locale locale, Integer num, int i) {
        C12589a e = C12641d.m53370e(aVar);
        this.f31222b = j;
        DateTimeZone s = e.mo27836s();
        this.f31225e = s;
        this.f31221a = e.mo27834Q();
        this.f31223c = locale == null ? Locale.getDefault() : locale;
        this.f31224d = i;
        this.f31226f = num;
        this.f31227g = s;
        this.f31229i = num;
        this.f31230j = new C12677a[8];
    }
}
