package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.C41854a4;
import com.google.android.gms.internal.measurement.C42188t3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.gb */
public abstract class C30737gb {

    /* renamed from: a */
    public final String f73475a;

    /* renamed from: b */
    public final int f73476b;

    /* renamed from: c */
    public Boolean f73477c;

    /* renamed from: d */
    public Boolean f73478d;

    /* renamed from: e */
    public Long f73479e;

    /* renamed from: f */
    public Long f73480f;

    public C30737gb(String str, int i) {
        this.f73475a = str;
        this.f73476b = i;
    }

    /* renamed from: d */
    public static Boolean m123784d(String str, int i, boolean z, String str2, List list, String str3, C30899u3 u3Var) {
        int i2;
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z) {
                    i2 = 66;
                } else {
                    i2 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i2).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (u3Var != null) {
                        u3Var.mo87494w().mo87464b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @C40974d0
    /* renamed from: e */
    public static Boolean m123785e(BigDecimal bigDecimal, C42188t3 t3Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C40843u.m166202l(t3Var);
        if (t3Var.mo137296H()) {
            boolean z = true;
            if (t3Var.mo137301M() != 1) {
                if (t3Var.mo137301M() == 5) {
                    if (!t3Var.mo137300L() || !t3Var.mo137299K()) {
                        return null;
                    }
                } else if (!t3Var.mo137297I()) {
                    return null;
                }
                int M = t3Var.mo137301M();
                if (t3Var.mo137301M() == 5) {
                    if (C30846pa.m124115N(t3Var.mo137294F()) && C30846pa.m124115N(t3Var.mo137293E())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(t3Var.mo137294F());
                            bigDecimal3 = new BigDecimal(t3Var.mo137293E());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C30846pa.m124115N(t3Var.mo137292D())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(t3Var.mo137292D());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (M == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i = M - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }

    @C40974d0
    /* renamed from: f */
    public static Boolean m123786f(String str, C41854a4 a4Var, C30899u3 u3Var) {
        String str2;
        List list;
        String str3;
        C40843u.m166202l(a4Var);
        if (str == null || !a4Var.mo136508J() || a4Var.mo136509K() == 1) {
            return null;
        }
        if (a4Var.mo136509K() == 7) {
            if (a4Var.mo136502B() == 0) {
                return null;
            }
        } else if (!a4Var.mo136507I()) {
            return null;
        }
        int K = a4Var.mo136509K();
        boolean G = a4Var.mo136505G();
        if (G || K == 2 || K == 7) {
            str2 = a4Var.mo136503E();
        } else {
            str2 = a4Var.mo136503E().toUpperCase(Locale.ENGLISH);
        }
        String str4 = str2;
        if (a4Var.mo136502B() == 0) {
            list = null;
        } else {
            List<String> F = a4Var.mo136504F();
            if (!G) {
                ArrayList arrayList = new ArrayList(F.size());
                for (String upperCase : F) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                F = Collections.unmodifiableList(arrayList);
            }
            list = F;
        }
        if (K == 2) {
            str3 = str4;
        } else {
            str3 = null;
        }
        return m123784d(str, K, G, str4, list, str3, u3Var);
    }

    /* renamed from: g */
    public static Boolean m123787g(double d, C42188t3 t3Var) {
        try {
            return m123785e(new BigDecimal(d), t3Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Boolean m123788h(long j, C42188t3 t3Var) {
        try {
            return m123785e(new BigDecimal(j), t3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Boolean m123789i(String str, C42188t3 t3Var) {
        if (!C30846pa.m124115N(str)) {
            return null;
        }
        try {
            return m123785e(new BigDecimal(str), t3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @C40974d0
    /* renamed from: j */
    public static Boolean m123790j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    public abstract int mo87065a();

    /* renamed from: b */
    public abstract boolean mo87066b();

    /* renamed from: c */
    public abstract boolean mo87067c();
}
