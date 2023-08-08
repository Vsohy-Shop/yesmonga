package com.carrefour.fid.android.shared.extension;

import com.carrefour.fid.android.shared.util.C28935i;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C10864b0;
import kotlin.C11661u0;
import kotlin.C11677z;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

public final class DateExtensionsKt {
    @C12579k

    /* renamed from: a */
    public static final String f70327a = "yyyy-MM-dd'T'HH:mm:ssXXX";
    @C12579k

    /* renamed from: b */
    public static final String f70328b = "yyyy-MM-dd'T'HH:mm:ss";
    @C12579k

    /* renamed from: c */
    public static final String f70329c = "yyyy-MM-dd";
    @C12579k

    /* renamed from: d */
    public static final String f70330d = "dd/MM/yyyy";
    @C12579k

    /* renamed from: e */
    public static final String f70331e = "HH:mm:ss";
    @C12579k

    /* renamed from: f */
    public static final String f70332f = "yyyyMMdd";
    @C12579k

    /* renamed from: g */
    public static final String f70333g = "MM/yyyy";
    @C12579k

    /* renamed from: h */
    public static final String f70334h = "MMMM yyyy";
    @C12579k

    /* renamed from: i */
    public static final String f70335i = "dd-MM-yyyy HH:mm:ss";
    @C12579k

    /* renamed from: j */
    public static final String f70336j = "yyyy-MM-dd HH:mm";
    @C12579k

    /* renamed from: k */
    public static final String f70337k = "2195899200";
    @C12579k

    /* renamed from: l */
    public static final C11677z f70338l = C10864b0.m38748c(DateExtensionsKt$slotCvgConverter$2.f70357f);
    @C12579k

    /* renamed from: m */
    public static final C11677z f70339m = C10864b0.m38748c(DateExtensionsKt$simpleDateConverter$2.f70355f);
    @C12579k

    /* renamed from: n */
    public static final C11677z f70340n = C10864b0.m38748c(DateExtensionsKt$hourSimpleDateFormat$2.f70352f);
    @C12579k

    /* renamed from: o */
    public static final C11677z f70341o = C10864b0.m38748c(DateExtensionsKt$daySimpleDateFormat$2.f70350f);
    @C12579k

    /* renamed from: p */
    public static final C11677z f70342p = C10864b0.m38748c(DateExtensionsKt$apimV3SimpleDateFormat$2.f70348f);
    @C12579k

    /* renamed from: q */
    public static final C11677z f70343q = C10864b0.m38748c(DateExtensionsKt$monthYearFormatter$2.f70354f);
    @C12579k

    /* renamed from: r */
    public static final C11677z f70344r = C10864b0.m38748c(DateExtensionsKt$fullMonthYearFormatter$2.f70351f);
    @C12579k

    /* renamed from: s */
    public static final C11677z f70345s = C10864b0.m38748c(DateExtensionsKt$couponFormatter$2.f70349f);
    @C12579k

    /* renamed from: t */
    public static final C11677z f70346t = C10864b0.m38748c(DateExtensionsKt$simpleSlashDateFormatter$2.f70356f);
    @C12579k

    /* renamed from: u */
    public static final C11677z f70347u = C10864b0.m38748c(DateExtensionsKt$luckyCartSlotFormatter$2.f70353f);

    @C12580l
    /* renamed from: A */
    public static final Date m118754A(@C12580l String str) {
        if (str == null) {
            return null;
        }
        try {
            return m118778x().parse(str);
        } catch (ParseException e) {
            ParseException parseException = e;
            C28935i iVar = C28935i.f70940a;
            String message = parseException.getMessage();
            if (message == null) {
                message = "";
            }
            C28935i.m119705e(iVar, message, parseException, 0, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: b */
    public static final SimpleDateFormat m118756b(String str) {
        return new SimpleDateFormat(str, Locale.FRANCE);
    }

    @C12579k
    /* renamed from: c */
    public static final String m118757c(@C12579k String str) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            DateTime dateTime = new DateTime(Math.abs(Long.parseLong(str)));
            if (dateTime.mo27755k2().mo29047c() < 10) {
                str2 = "0" + dateTime.mo27755k2().mo29047c();
            } else {
                str2 = String.valueOf(dateTime.mo27755k2().mo29047c());
            }
            if (dateTime.mo27712I2().mo29047c() < 10) {
                str3 = "0" + dateTime.mo27712I2().mo29047c();
            } else {
                str3 = String.valueOf(dateTime.mo27712I2().mo29047c());
            }
            return str2 + str3 + String.valueOf(dateTime.mo27738X3().mo29047c());
        } catch (Exception unused) {
            return m118757c(f70337k);
        }
    }

    @C12579k
    /* renamed from: d */
    public static final String m118758d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m118760f(str, m118770p(), m118775u());
    }

    @C12579k
    /* renamed from: e */
    public static final String m118759e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m118761g(str, CollectionsKt__CollectionsKt.m40448L(m118766l(), m118776v()), m118777w());
    }

    @C12579k
    /* renamed from: f */
    public static final String m118760f(@C12579k String str, @C12579k SimpleDateFormat simpleDateFormat, @C12579k SimpleDateFormat simpleDateFormat2) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(simpleDateFormat, "inputFormatter");
        Intrinsics.checkNotNullParameter(simpleDateFormat2, "outputFormatter");
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                str2 = simpleDateFormat2.format(parse);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                return str;
            }
            return str2;
        } catch (ParseException unused) {
            return str;
        }
    }

    @C12579k
    /* renamed from: g */
    public static final String m118761g(@C12579k String str, @C12579k List<? extends SimpleDateFormat> list, @C12579k SimpleDateFormat simpleDateFormat) {
        String format;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(list, "inputFormatters");
        Intrinsics.checkNotNullParameter(simpleDateFormat, "outputFormatter");
        for (SimpleDateFormat simpleDateFormat2 : list) {
            try {
                Result.C10852a aVar = Result.f28060a;
                Date parse = simpleDateFormat2.parse(str);
                if (parse != null && (format = simpleDateFormat.format(parse)) != null) {
                    return format;
                }
                Result.m38702b((Object) null);
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                Result.m38702b(C11661u0.m45734a(th));
            }
        }
        return str;
    }

    @C12579k
    /* renamed from: h */
    public static final String m118762h(@C12580l String str) {
        String str2;
        if (str != null) {
            try {
                Date parse = m118778x().parse(str);
                if (parse != null) {
                    Intrinsics.checkNotNullExpressionValue(parse, "parse(it)");
                    str2 = m118774t().format(Long.valueOf(parse.getTime()));
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (ParseException unused) {
                return new String();
            }
        }
        return new String();
    }

    @C12579k
    /* renamed from: i */
    public static final String m118763i(@C12579k Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        try {
            String format = m118778x().format(Long.valueOf(date.getTime()));
            Intrinsics.checkNotNullExpressionValue(format, "{\n        slotCvgConverter.format(this.time)\n    }");
            return format;
        } catch (ParseException e) {
            ParseException parseException = e;
            C28935i iVar = C28935i.f70940a;
            String message = parseException.getMessage();
            if (message == null) {
                message = "";
            }
            C28935i.m119705e(iVar, message, parseException, 0, 4, (Object) null);
            return new String();
        }
    }

    @C12579k
    /* renamed from: j */
    public static final String m118764j(@C12580l String str) {
        String str2;
        if (str == null) {
            return new String();
        }
        try {
            Date parse = m118778x().parse(str);
            if (parse != null) {
                Intrinsics.checkNotNullExpressionValue(parse, "parse(it)");
                str2 = m118776v().format(Long.valueOf(parse.getTime()));
            } else {
                str2 = null;
            }
            if (str2 == null) {
                return new String();
            }
            return str2;
        } catch (ParseException unused) {
            return new String();
        }
    }

    /* renamed from: k */
    public static final SimpleDateFormat m118765k() {
        return (SimpleDateFormat) f70342p.getValue();
    }

    /* renamed from: l */
    public static final SimpleDateFormat m118766l() {
        return (SimpleDateFormat) f70345s.getValue();
    }

    @C12579k
    /* renamed from: m */
    public static final String m118767m(@C12579k Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        try {
            String format = m118769o().format(Long.valueOf(date.getTime()));
            Intrinsics.checkNotNullExpressionValue(format, "{\n        daySimpleDateF…t.format(this.time)\n    }");
            return format;
        } catch (ParseException e) {
            ParseException parseException = e;
            C28935i iVar = C28935i.f70940a;
            String message = parseException.getMessage();
            if (message == null) {
                message = "";
            }
            C28935i.m119705e(iVar, message, parseException, 0, 4, (Object) null);
            return new String();
        }
    }

    @C12579k
    /* renamed from: n */
    public static final String m118768n(@C12580l String str) {
        String str2;
        Date A = m118754A(str);
        if (A != null) {
            try {
                str2 = m118769o().format(A);
            } catch (ParseException e) {
                ParseException parseException = e;
                C28935i iVar = C28935i.f70940a;
                String message = parseException.getMessage();
                if (message == null) {
                    message = "";
                }
                C28935i.m119705e(iVar, message, parseException, 0, 4, (Object) null);
                str2 = new String();
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return new String();
        }
        return str2;
    }

    /* renamed from: o */
    public static final SimpleDateFormat m118769o() {
        return (SimpleDateFormat) f70341o.getValue();
    }

    /* renamed from: p */
    public static final SimpleDateFormat m118770p() {
        return (SimpleDateFormat) f70344r.getValue();
    }

    @C12579k
    /* renamed from: q */
    public static final String m118771q(@C12579k Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        try {
            String format = m118773s().format(Long.valueOf(date.getTime()));
            Intrinsics.checkNotNullExpressionValue(format, "{\n        hourSimpleDate…t.format(this.time)\n    }");
            return format;
        } catch (ParseException e) {
            ParseException parseException = e;
            C28935i iVar = C28935i.f70940a;
            String message = parseException.getMessage();
            if (message == null) {
                message = "";
            }
            C28935i.m119705e(iVar, message, parseException, 0, 4, (Object) null);
            return new String();
        }
    }

    @C12579k
    /* renamed from: r */
    public static final String m118772r(@C12580l String str) {
        String str2;
        Date A = m118754A(str);
        if (A != null) {
            try {
                str2 = m118773s().format(A);
            } catch (ParseException e) {
                ParseException parseException = e;
                C28935i iVar = C28935i.f70940a;
                String message = parseException.getMessage();
                if (message == null) {
                    message = "";
                }
                C28935i.m119705e(iVar, message, parseException, 0, 4, (Object) null);
                str2 = new String();
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return new String();
        }
        return str2;
    }

    /* renamed from: s */
    public static final SimpleDateFormat m118773s() {
        return (SimpleDateFormat) f70340n.getValue();
    }

    /* renamed from: t */
    public static final SimpleDateFormat m118774t() {
        return (SimpleDateFormat) f70347u.getValue();
    }

    /* renamed from: u */
    public static final SimpleDateFormat m118775u() {
        return (SimpleDateFormat) f70343q.getValue();
    }

    /* renamed from: v */
    public static final SimpleDateFormat m118776v() {
        return (SimpleDateFormat) f70339m.getValue();
    }

    /* renamed from: w */
    public static final SimpleDateFormat m118777w() {
        return (SimpleDateFormat) f70346t.getValue();
    }

    /* renamed from: x */
    public static final SimpleDateFormat m118778x() {
        return (SimpleDateFormat) f70338l.getValue();
    }

    @C12580l
    /* renamed from: y */
    public static final Date m118779y(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "slotDate");
        try {
            return m118776v().parse(str);
        } catch (ParseException e) {
            ParseException parseException = e;
            C28935i iVar = C28935i.f70940a;
            String message = parseException.getMessage();
            if (message == null) {
                message = "";
            }
            C28935i.m119705e(iVar, message, parseException, 0, 4, (Object) null);
            return null;
        }
    }

    @C12580l
    /* renamed from: z */
    public static final Date m118780z(@C12580l String str) {
        if (str == null) {
            return null;
        }
        try {
            return m118765k().parse(str);
        } catch (ParseException e) {
            ParseException parseException = e;
            C28935i iVar = C28935i.f70940a;
            String message = parseException.getMessage();
            if (message == null) {
                message = "";
            }
            C28935i.m119705e(iVar, message, parseException, 0, 4, (Object) null);
            return null;
        }
    }
}
