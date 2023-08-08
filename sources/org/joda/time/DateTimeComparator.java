package org.joda.time;

import java.io.Serializable;
import java.util.Comparator;
import org.joda.time.convert.C12624d;
import org.joda.time.convert.C12629h;

public class DateTimeComparator implements Comparator<Object>, Serializable {

    /* renamed from: a */
    public static final DateTimeComparator f30600a = new DateTimeComparator((DateTimeFieldType) null, (DateTimeFieldType) null);

    /* renamed from: b */
    public static final DateTimeComparator f30601b = new DateTimeComparator(DateTimeFieldType.m51307C(), (DateTimeFieldType) null);

    /* renamed from: c */
    public static final DateTimeComparator f30602c = new DateTimeComparator((DateTimeFieldType) null, DateTimeFieldType.m51307C());
    private static final long serialVersionUID = -6097339773320178364L;
    private final DateTimeFieldType iLowerLimit;
    private final DateTimeFieldType iUpperLimit;

    public DateTimeComparator(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        this.iLowerLimit = dateTimeFieldType;
        this.iUpperLimit = dateTimeFieldType2;
    }

    /* renamed from: a */
    public static DateTimeComparator m51298a() {
        return f30601b;
    }

    /* renamed from: b */
    public static DateTimeComparator m51299b() {
        return f30600a;
    }

    /* renamed from: c */
    public static DateTimeComparator m51300c(DateTimeFieldType dateTimeFieldType) {
        return m51301d(dateTimeFieldType, (DateTimeFieldType) null);
    }

    /* renamed from: d */
    public static DateTimeComparator m51301d(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        if (dateTimeFieldType == null && dateTimeFieldType2 == null) {
            return f30600a;
        }
        if (dateTimeFieldType == DateTimeFieldType.m51307C() && dateTimeFieldType2 == null) {
            return f30601b;
        }
        if (dateTimeFieldType == null && dateTimeFieldType2 == DateTimeFieldType.m51307C()) {
            return f30602c;
        }
        return new DateTimeComparator(dateTimeFieldType, dateTimeFieldType2);
    }

    /* renamed from: f */
    public static DateTimeComparator m51302f() {
        return f30602c;
    }

    private Object readResolve() {
        return m51301d(this.iLowerLimit, this.iUpperLimit);
    }

    public int compare(Object obj, Object obj2) {
        C12629h n = C12624d.m53287m().mo29005n(obj);
        C12589a a = n.mo28984a(obj, (C12589a) null);
        long h = n.mo28989h(obj, a);
        if (obj == obj2) {
            return 0;
        }
        C12629h n2 = C12624d.m53287m().mo29005n(obj2);
        C12589a a2 = n2.mo28984a(obj2, (C12589a) null);
        long h2 = n2.mo28989h(obj2, a2);
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        if (dateTimeFieldType != null) {
            h = dateTimeFieldType.mo27802F(a).mo28812O(h);
            h2 = this.iLowerLimit.mo27802F(a2).mo28812O(h2);
        }
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            h = dateTimeFieldType2.mo27802F(a).mo28810M(h);
            h2 = this.iUpperLimit.mo27802F(a2).mo28810M(h2);
        }
        int i = (h > h2 ? 1 : (h == h2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: e */
    public DateTimeFieldType mo27796e() {
        return this.iLowerLimit;
    }

    public boolean equals(Object obj) {
        DateTimeFieldType dateTimeFieldType;
        DateTimeFieldType dateTimeFieldType2;
        if (!(obj instanceof DateTimeComparator)) {
            return false;
        }
        DateTimeComparator dateTimeComparator = (DateTimeComparator) obj;
        if (this.iLowerLimit != dateTimeComparator.mo27796e() && ((dateTimeFieldType2 = this.iLowerLimit) == null || !dateTimeFieldType2.equals(dateTimeComparator.mo27796e()))) {
            return false;
        }
        if (this.iUpperLimit == dateTimeComparator.mo27798g() || ((dateTimeFieldType = this.iUpperLimit) != null && dateTimeFieldType.equals(dateTimeComparator.mo27798g()))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public DateTimeFieldType mo27798g() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        int i;
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        int i2 = 0;
        if (dateTimeFieldType == null) {
            i = 0;
        } else {
            i = dateTimeFieldType.hashCode();
        }
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            i2 = dateTimeFieldType2.hashCode();
        }
        return i + (i2 * 123);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (this.iLowerLimit == this.iUpperLimit) {
            StringBuilder sb = new StringBuilder();
            sb.append("DateTimeComparator[");
            DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
            if (dateTimeFieldType != null) {
                str2 = dateTimeFieldType.mo27803G();
            }
            sb.append(str2);
            sb.append("]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DateTimeComparator[");
        DateTimeFieldType dateTimeFieldType2 = this.iLowerLimit;
        if (dateTimeFieldType2 == null) {
            str = str2;
        } else {
            str = dateTimeFieldType2.mo27803G();
        }
        sb2.append(str);
        sb2.append("-");
        DateTimeFieldType dateTimeFieldType3 = this.iUpperLimit;
        if (dateTimeFieldType3 != null) {
            str2 = dateTimeFieldType3.mo27803G();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }
}
