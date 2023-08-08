package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;

/* renamed from: org.joda.time.format.h */
public class C12682h {

    /* renamed from: a */
    public static final double f31245a = Math.log(10.0d);

    /* renamed from: a */
    public static void m54156a(Appendable appendable, int i, int i2) throws IOException {
        int i3;
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
        } else if (i < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            int i4 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i4 + 48));
            appendable.append((char) (((i - (i4 << 3)) - (i4 << 1)) + 48));
        } else {
            if (i < 1000) {
                i3 = 3;
            } else if (i < 10000) {
                i3 = 4;
            } else {
                i3 = ((int) (Math.log((double) i) / f31245a)) + 1;
            }
            while (i2 > i3) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i));
        }
    }

    /* renamed from: b */
    public static void m54157b(Appendable appendable, long j, int i) throws IOException {
        int i2 = (int) j;
        if (((long) i2) == j) {
            m54156a(appendable, i2, i);
        } else if (i <= 19) {
            appendable.append(Long.toString(j));
        } else {
            if (j < 0) {
                appendable.append('-');
                if (j != Long.MIN_VALUE) {
                    j = -j;
                } else {
                    while (i > 19) {
                        appendable.append('0');
                        i--;
                    }
                    appendable.append("9223372036854775808");
                    return;
                }
            }
            int log = ((int) (Math.log((double) j) / f31245a)) + 1;
            while (i > log) {
                appendable.append('0');
                i--;
            }
            appendable.append(Long.toString(j));
        }
    }

    /* renamed from: c */
    public static void m54158c(StringBuffer stringBuffer, int i, int i2) {
        try {
            m54156a(stringBuffer, i, i2);
        } catch (IOException unused) {
        }
    }

    /* renamed from: d */
    public static void m54159d(StringBuffer stringBuffer, long j, int i) {
        try {
            m54157b(stringBuffer, j, i);
        } catch (IOException unused) {
        }
    }

    /* renamed from: e */
    public static void m54160e(Appendable appendable, int i) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        } else {
            appendable.append(Integer.toString(i));
        }
    }

    /* renamed from: f */
    public static void m54161f(Appendable appendable, long j) throws IOException {
        int i = (int) j;
        if (((long) i) == j) {
            m54160e(appendable, i);
        } else {
            appendable.append(Long.toString(j));
        }
    }

    /* renamed from: g */
    public static void m54162g(StringBuffer stringBuffer, int i) {
        try {
            m54160e(stringBuffer, i);
        } catch (IOException unused) {
        }
    }

    /* renamed from: h */
    public static void m54163h(StringBuffer stringBuffer, long j) {
        try {
            m54161f(stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    /* renamed from: i */
    public static int m54164i(long j) {
        if (j < 0) {
            if (j != Long.MIN_VALUE) {
                return m54164i(-j) + 1;
            }
            return 20;
        } else if (j < 10) {
            return 1;
        } else {
            if (j < 100) {
                return 2;
            }
            if (j < 1000) {
                return 3;
            }
            if (j < 10000) {
                return 4;
            }
            return 1 + ((int) (Math.log((double) j) / f31245a));
        }
    }

    /* renamed from: j */
    public static String m54165j(String str, int i) {
        String str2;
        int i2 = i + 32;
        if (str.length() <= i2 + 3) {
            str2 = str;
        } else {
            str2 = str.substring(0, i2).concat("...");
        }
        if (i <= 0) {
            return "Invalid format: \"" + str2 + '\"';
        } else if (i >= str.length()) {
            return "Invalid format: \"" + str2 + "\" is too short";
        } else {
            return "Invalid format: \"" + str2 + "\" is malformed at \"" + str2.substring(i) + '\"';
        }
    }

    /* renamed from: k */
    public static int m54166k(CharSequence charSequence, int i) {
        int charAt = charSequence.charAt(i) - '0';
        return (((charAt << 3) + (charAt << 1)) + charSequence.charAt(i + 1)) - 48;
    }

    /* renamed from: l */
    public static void m54167l(Writer writer, int i, int i2) throws IOException {
        int i3;
        if (i < 0) {
            writer.write(45);
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    writer.write(48);
                    i2--;
                }
                writer.write("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                writer.write(48);
                i2--;
            }
            writer.write(i + 48);
        } else if (i < 100) {
            while (i2 > 2) {
                writer.write(48);
                i2--;
            }
            int i4 = ((i + 1) * 13421772) >> 27;
            writer.write(i4 + 48);
            writer.write(((i - (i4 << 3)) - (i4 << 1)) + 48);
        } else {
            if (i < 1000) {
                i3 = 3;
            } else if (i < 10000) {
                i3 = 4;
            } else {
                i3 = ((int) (Math.log((double) i) / f31245a)) + 1;
            }
            while (i2 > i3) {
                writer.write(48);
                i2--;
            }
            writer.write(Integer.toString(i));
        }
    }

    /* renamed from: m */
    public static void m54168m(Writer writer, long j, int i) throws IOException {
        int i2 = (int) j;
        if (((long) i2) == j) {
            m54167l(writer, i2, i);
        } else if (i <= 19) {
            writer.write(Long.toString(j));
        } else {
            if (j < 0) {
                writer.write(45);
                if (j != Long.MIN_VALUE) {
                    j = -j;
                } else {
                    while (i > 19) {
                        writer.write(48);
                        i--;
                    }
                    writer.write("9223372036854775808");
                    return;
                }
            }
            int log = ((int) (Math.log((double) j) / f31245a)) + 1;
            while (i > log) {
                writer.write(48);
                i--;
            }
            writer.write(Long.toString(j));
        }
    }

    /* renamed from: n */
    public static void m54169n(Writer writer, int i) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                writer.write("2147483648");
                return;
            }
        }
        if (i < 10) {
            writer.write(i + 48);
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            writer.write(i2 + 48);
            writer.write(((i - (i2 << 3)) - (i2 << 1)) + 48);
        } else {
            writer.write(Integer.toString(i));
        }
    }

    /* renamed from: o */
    public static void m54170o(Writer writer, long j) throws IOException {
        int i = (int) j;
        if (((long) i) == j) {
            m54169n(writer, i);
        } else {
            writer.write(Long.toString(j));
        }
    }
}
