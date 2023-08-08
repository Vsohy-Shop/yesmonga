package org.joda.time.field;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.joda.time.C12599c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* renamed from: org.joda.time.field.e */
public class C12652e {
    /* renamed from: a */
    public static boolean m53791a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m53792b(int i, int i2, int i3) {
        if (i2 < i3) {
            int i4 = (i3 - i2) + 1;
            int i5 = i - i2;
            if (i5 >= 0) {
                return (i5 % i4) + i2;
            }
            int i6 = (-i5) % i4;
            if (i6 == 0) {
                return i2 + 0;
            }
            return (i4 - i6) + i2;
        }
        throw new IllegalArgumentException("MIN > MAX");
    }

    /* renamed from: c */
    public static int m53793c(int i, int i2, int i3, int i4) {
        return m53792b(i + i2, i3, i4);
    }

    /* renamed from: d */
    public static int m53794d(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + i + " + " + i2);
    }

    /* renamed from: e */
    public static long m53795e(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j + " + " + j2);
    }

    /* renamed from: f */
    public static long m53796f(long j, long j2) {
        if (j != Long.MIN_VALUE || j2 != -1) {
            return j / j2;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " / " + j2);
    }

    /* renamed from: g */
    public static long m53797g(long j, long j2, RoundingMode roundingMode) {
        if (j != Long.MIN_VALUE || j2 != -1) {
            return new BigDecimal(j).divide(new BigDecimal(j2), roundingMode).longValue();
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " / " + j2);
    }

    /* renamed from: h */
    public static int m53798h(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Multiplication overflows an int: " + i + " * " + i2);
    }

    /* renamed from: i */
    public static long m53799i(long j, int i) {
        if (i != -1) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return j;
            }
            long j2 = (long) i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        }
    }

    /* renamed from: j */
    public static long m53800j(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + j2);
    }

    /* renamed from: k */
    public static int m53801k(long j, long j2) {
        return m53804n(m53800j(j, j2));
    }

    /* renamed from: l */
    public static int m53802l(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }

    /* renamed from: m */
    public static long m53803m(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j + " - " + j2);
    }

    /* renamed from: n */
    public static int m53804n(long j) {
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Value cannot fit in an int: " + j);
    }

    /* renamed from: o */
    public static void m53805o(String str, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(str, (Number) Integer.valueOf(i), (Number) Integer.valueOf(i2), (Number) Integer.valueOf(i3));
        }
    }

    /* renamed from: p */
    public static void m53806p(C12599c cVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(cVar.mo28806I(), (Number) Integer.valueOf(i), (Number) Integer.valueOf(i2), (Number) Integer.valueOf(i3));
        }
    }

    /* renamed from: q */
    public static void m53807q(DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeFieldType, (Number) Integer.valueOf(i), (Number) Integer.valueOf(i2), (Number) Integer.valueOf(i3));
        }
    }
}
