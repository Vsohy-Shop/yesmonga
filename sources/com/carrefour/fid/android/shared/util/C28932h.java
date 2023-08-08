package com.carrefour.fid.android.shared.util;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.extension.DateExtensionsKt;
import com.google.firebase.installations.C33124s;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;
import org.joda.time.format.C12671a;
import org.joda.time.format.C12683i;
import p073j$.util.DesugarTimeZone;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.util.h */
public final class C28932h {
    @C12579k

    /* renamed from: A */
    public static final String f70891A = "EEEE dd MMMM 'à' H'h'";
    @C12579k

    /* renamed from: B */
    public static final String f70892B = "EEEE dd MMMM";
    @C12579k

    /* renamed from: C */
    public static final String f70893C = "kk:mm";
    @C12579k

    /* renamed from: D */
    public static final String f70894D = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    @C12579k

    /* renamed from: E */
    public static final String f70895E = "^\\d{4}-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\d(\\.\\d+)?(([+-]\\d\\d:\\d\\d)|Z)?$";
    @C12579k

    /* renamed from: F */
    public static final SimpleDateFormat f70896F = new SimpleDateFormat(DateExtensionsKt.f70331e);
    @C12579k

    /* renamed from: G */
    public static final SimpleDateFormat f70897G = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.FRANCE);
    @C12579k

    /* renamed from: H */
    public static final SimpleDateFormat f70898H = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
    @C12579k

    /* renamed from: I */
    public static final DateFormat f70899I = new SimpleDateFormat(f70893C, Locale.FRANCE);
    @C12579k

    /* renamed from: J */
    public static final DateFormat f70900J = new SimpleDateFormat(f70937x, Locale.FRANCE);
    @C12579k

    /* renamed from: K */
    public static final DateFormat f70901K = new SimpleDateFormat(f70939z, Locale.FRANCE);
    @C12579k

    /* renamed from: L */
    public static final DateFormat f70902L = new SimpleDateFormat(f70891A, Locale.FRANCE);
    @C12579k

    /* renamed from: M */
    public static final DateFormat f70903M = new SimpleDateFormat("EEEE dd MMMM", Locale.FRANCE);
    @C12579k

    /* renamed from: N */
    public static SimpleDateFormat f70904N = new SimpleDateFormat(f70920g, Locale.FRANCE);
    @C12579k

    /* renamed from: O */
    public static SimpleDateFormat f70905O = new SimpleDateFormat("MMMM yyyy", Locale.FRANCE);

    /* renamed from: P */
    public static final long f70906P = 1000;

    /* renamed from: Q */
    public static final int f70907Q = 15;
    @C12579k

    /* renamed from: R */
    public static final String f70908R = " 12:00:00";

    /* renamed from: S */
    public static final int f70909S = 0;

    /* renamed from: T */
    public static final int f70910T = 1;

    /* renamed from: U */
    public static final int f70911U = 2;
    @C12579k

    /* renamed from: V */
    public static final String f70912V = "UTC";
    @C12579k

    /* renamed from: W */
    public static final String f70913W = "GMT";
    @C12579k

    /* renamed from: a */
    public static final C28933a f70914a = new C28933a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f70915b = 0;
    @C12579k

    /* renamed from: c */
    public static final String f70916c = "DateUtil";
    @C12579k

    /* renamed from: d */
    public static final String f70917d = "yyyy-MM-dd'T'HH:mm:sss";
    @C12579k

    /* renamed from: e */
    public static final String f70918e = "yyyy-MM-dd'T'HH:mm:ss";
    @C12579k

    /* renamed from: f */
    public static final String f70919f = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    @C12579k

    /* renamed from: g */
    public static final String f70920g = "yyyy-MM-dd HH:mm:ss zzz";
    @C12579k

    /* renamed from: h */
    public static final String f70921h = "dd-MM-yyyy HH:mm:ss";
    @C12579k

    /* renamed from: i */
    public static final String f70922i = "yyyy-MM-dd";
    @C12579k

    /* renamed from: j */
    public static final String f70923j = "dd/MM/yy";
    @C12579k

    /* renamed from: k */
    public static final String f70924k = "d MMMM yyyy";
    @C12579k

    /* renamed from: l */
    public static final String f70925l = "MMMM yyyy";
    @C12579k

    /* renamed from: m */
    public static final String f70926m = "dd/MM/yyyy";
    @C12579k

    /* renamed from: n */
    public static final String f70927n = "dd/MM";
    @C12579k

    /* renamed from: o */
    public static final String f70928o = "yyyyMMdd";
    @C12579k

    /* renamed from: p */
    public static final String f70929p = "MM/dd/yyyy";
    @C12579k

    /* renamed from: q */
    public static final String f70930q = "dd MMM yyyy";
    @C12579k

    /* renamed from: r */
    public static final String f70931r = "dd-MM-yyyy";
    @C12579k

    /* renamed from: s */
    public static final String f70932s = "MM/yyyy";
    @C12579k

    /* renamed from: t */
    public static final String f70933t = "yyyy-MM-dd";
    @C12579k

    /* renamed from: u */
    public static final String f70934u = "yyyyMMdd";
    @C12579k

    /* renamed from: v */
    public static final String f70935v = "yyyyMMdd'T'HHmmss";
    @C12579k

    /* renamed from: w */
    public static final String f70936w = "yyyy-MM-dd'T'HH:mm:ss";
    @C12579k

    /* renamed from: x */
    public static final String f70937x = "EEE dd MMM yyyy";
    @C12579k

    /* renamed from: y */
    public static final String f70938y = "dd MMM yyyy HH:mm";
    @C12579k

    /* renamed from: z */
    public static final String f70939z = "EEE dd MMM";

    @C11363r0({"SMAP\nDateUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateUtil.kt\ncom/carrefour/fid/android/shared/util/DateUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,516:1\n731#2,9:517\n1054#2:528\n37#3,2:526\n*S KotlinDebug\n*F\n+ 1 DateUtil.kt\ncom/carrefour/fid/android/shared/util/DateUtil$Companion\n*L\n350#1:517,9\n363#1:528\n350#1:526,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.util.h$a */
    public static final class C28933a {

        @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 DateUtil.kt\ncom/carrefour/fid/android/shared/util/DateUtil$Companion\n*L\n1#1,328:1\n363#2:329\n*E\n"})
        /* renamed from: com.carrefour.fid.android.shared.util.h$a$a */
        public static final class C28934a<T> implements Comparator {
            public final int compare(T t, T t2) {
                C28933a aVar = C28932h.f70914a;
                return C11006g.m42424l(aVar.mo84225P((String) t2), aVar.mo84225P((String) t));
            }
        }

        public /* synthetic */ C28933a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: W */
        public static /* synthetic */ long m119655W(C28933a aVar, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "dd-MM-yyyy HH:mm:ss";
            }
            return aVar.mo84231V(str, str2);
        }

        /* renamed from: d */
        public static /* synthetic */ boolean m119656d(C28933a aVar, String str, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 15;
            }
            return aVar.mo84234c(str, i);
        }

        /* renamed from: v */
        public static /* synthetic */ String m119657v(C28933a aVar, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = new Date();
            }
            return aVar.mo84251u(date);
        }

        /* renamed from: x */
        public static /* synthetic */ ArrayList m119658x(C28933a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 12;
            }
            return aVar.mo84252w(i);
        }

        @C12579k
        /* renamed from: A */
        public final String mo84210A(@C12579k Date date, @C12579k String str) {
            List list;
            boolean z;
            Intrinsics.checkNotNullParameter(date, "dateStart");
            Intrinsics.checkNotNullParameter(str, "separator");
            String format = C28932h.f70900J.format(date);
            Intrinsics.checkNotNullExpressionValue(format, "dateStartString");
            List<String> p = new Regex(" ").mo23339p(format, 0);
            if (!p.isEmpty()) {
                ListIterator<String> listIterator = p.listIterator(p.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        list = CollectionsKt___CollectionsKt.m40497E5(p, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                String[] strArr = (String[]) list.toArray(new String[0]);
                String substring = strArr[0].substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = substring.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                String substring2 = strArr[0].substring(1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                String str2 = upperCase + substring2;
                String format2 = C28932h.f70899I.format(date);
                Intrinsics.checkNotNullExpressionValue(format2, "sTimeStart");
                String replace$default = C11622t.replace$default(format2, C33124s.f80355c, "h", false, 4, (Object) null);
                return str2 + " " + strArr[1] + " " + strArr[2] + " " + str + " " + replace$default;
            }
            list = CollectionsKt__CollectionsKt.m40441E();
            String[] strArr2 = (String[]) list.toArray(new String[0]);
            String substring3 = strArr2[0].substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
            String upperCase2 = substring3.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            String substring22 = strArr2[0].substring(1);
            Intrinsics.checkNotNullExpressionValue(substring22, "this as java.lang.String).substring(startIndex)");
            String str22 = upperCase2 + substring22;
            String format22 = C28932h.f70899I.format(date);
            Intrinsics.checkNotNullExpressionValue(format22, "sTimeStart");
            String replace$default2 = C11622t.replace$default(format22, C33124s.f80355c, "h", false, 4, (Object) null);
            return str22 + " " + strArr2[1] + " " + strArr2[2] + " " + str + " " + replace$default2;
        }

        @C12579k
        /* renamed from: B */
        public final String mo84211B(@C12579k Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String format = C28932h.f70899I.format(date);
            Intrinsics.checkNotNullExpressionValue(format, "HOUR_SIMPLE_DATE_FORMAT.format(date)");
            return format;
        }

        @C12579k
        /* renamed from: C */
        public final Regex mo84212C() {
            return new Regex(C28932h.f70895E);
        }

        @C12579k
        /* renamed from: D */
        public final String mo84213D(@C12579k Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String format = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(date);
            Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(FORMAT_…etDefault()).format(date)");
            return format;
        }

        @C11384m
        /* renamed from: E */
        public final long mo84214E(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "englishFormatDate");
            try {
                Date parse = new SimpleDateFormat(C28932h.f70935v, Locale.getDefault()).parse(str);
                if (parse != null) {
                    return parse.getTime();
                }
                return 0;
            } catch (Exception e) {
                C28935i iVar = C28935i.f70940a;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C28935i.m119705e(iVar, message, (Throwable) null, 0, 6, (Object) null);
                return 0;
            }
        }

        @C12579k
        @C11384m
        /* renamed from: F */
        public final String mo84215F(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "englishFormatDate");
            try {
                String format = C28932h.f70904N.format(DateTime.m51195N2(str).mo28744O0());
                Intrinsics.checkNotNullExpressionValue(format, "{\n            TRACKING_D…Date).toDate())\n        }");
                return format;
            } catch (Exception e) {
                C28935i iVar = C28935i.f70940a;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C28935i.m119705e(iVar, message, (Throwable) null, 0, 6, (Object) null);
                return new String();
            }
        }

        @C12579k
        @C11384m
        /* renamed from: G */
        public final String mo84216G(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "englishFormatDate");
            try {
                Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(str);
                SimpleDateFormat j = C28932h.f70904N;
                Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
                String format = j.format(parse);
                Intrinsics.checkNotNullExpressionValue(format, "{\n                val in…ed as Date)\n            }");
                return format;
            } catch (Exception e) {
                C28935i iVar = C28935i.f70940a;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C28935i.m119705e(iVar, message, (Throwable) null, 0, 6, (Object) null);
                return new String();
            }
        }

        @C12579k
        @C11384m
        /* renamed from: H */
        public final String mo84217H(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "timeStampInSecond");
            try {
                String format = C28932h.f70904N.format(new Date(Long.parseLong(str) * 1000));
                Intrinsics.checkNotNullExpressionValue(format, "{\n                val ne…at(netDate)\n            }");
                return format;
            } catch (Exception e) {
                C28935i iVar = C28935i.f70940a;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C28935i.m119705e(iVar, message, (Throwable) null, 0, 6, (Object) null);
                return new String();
            }
        }

        @C12579k
        /* renamed from: I */
        public final Date mo84218I(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderDate");
            Date parse = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            return parse;
        }

        @C12580l
        /* renamed from: J */
        public final Date mo84219J(@C12579k String str) {
            String str2;
            Intrinsics.checkNotNullParameter(str, "date");
            new Regex("\\+0([0-9]):00").mo23336m(str, "+0$100");
            new Regex(C33124s.f80355c).mo23336m(str, "");
            new Regex("-").mo23336m(str, "");
            try {
                Date parse = C28932h.f70897G.parse(str);
                Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
                return parse;
            } catch (Exception e) {
                C28935i iVar = C28935i.f70940a;
                String message = e.getMessage();
                if (message == null) {
                    str2 = "";
                } else {
                    str2 = message;
                }
                C28935i.m119705e(iVar, str2, (Throwable) null, 0, 6, (Object) null);
                return null;
            }
        }

        @C12579k
        /* renamed from: K */
        public final Date mo84220K(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "date");
            SimpleDateFormat b = C28932h.f70897G;
            b.setTimeZone(DesugarTimeZone.getTimeZone(C28932h.f70913W));
            Date parse = b.parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            new Regex("\\+0([0-9]){1}:00").mo23336m(str, "+0$100");
            new Regex(C33124s.f80355c).mo23336m(str, "");
            return parse;
        }

        @C12579k
        /* renamed from: L */
        public final String mo84221L(@C12580l String str) {
            String replaceFirst$default;
            String substringBefore$default;
            if (str == null || (replaceFirst$default = C11622t.replaceFirst$default(str, (String) C33124s.f80355c, "h", false, 4, (Object) null)) == null || (substringBefore$default = StringsKt__StringsKt.substringBefore$default(replaceFirst$default, (String) C33124s.f80355c, (String) null, 2, (Object) null)) == null) {
                return new String();
            }
            return substringBefore$default;
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: M */
        public final Date mo84222M(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "sdate");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setLenient(false);
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            return parse;
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: N */
        public final Date mo84223N(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "sdate");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C28932h.f70931r);
            simpleDateFormat.setLenient(false);
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            return parse;
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: O */
        public final String mo84224O(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "dateInString");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new String();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C28932h.f70917d);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(C28932h.f70927n);
            String str2 = new String();
            try {
                Date parse = simpleDateFormat.parse(str);
                Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
                String format = simpleDateFormat2.format(parse);
                Intrinsics.checkNotNullExpressionValue(format, "format.format(df as Date)");
                return format;
            } catch (ParseException unused) {
                return str2;
            }
        }

        @C12580l
        @SuppressLint({"SimpleDateFormat"})
        /* renamed from: P */
        public final Date mo84225P(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "dateInString");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    return new SimpleDateFormat(C28932h.f70917d).parse(str);
                } catch (ParseException unused) {
                }
            }
            return null;
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: Q */
        public final String mo84226Q(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "dateInString");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new String();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C28932h.f70917d);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd");
            try {
                Date parse = simpleDateFormat.parse(str);
                Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
                String format = simpleDateFormat2.format(parse);
                Intrinsics.checkNotNullExpressionValue(format, "format.format(df as Date)");
                return format;
            } catch (ParseException unused) {
                return "";
            }
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: R */
        public final String mo84227R(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "dateInString");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new String();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C28932h.f70917d);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(C28932h.f70938y, Locale.FRANCE);
            String str2 = new String();
            try {
                Date parse = simpleDateFormat.parse(str);
                Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
                String format = simpleDateFormat2.format(parse);
                Intrinsics.checkNotNullExpressionValue(format, "format.format(df as Date)");
                return format;
            } catch (ParseException unused) {
                return str2;
            }
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: S */
        public final String mo84228S(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "dateInString");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new String();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C28932h.f70917d);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
            String str2 = new String();
            try {
                Date parse = simpleDateFormat.parse(str);
                Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
                String format = simpleDateFormat2.format(parse);
                Intrinsics.checkNotNullExpressionValue(format, "format.format(df as Date)");
                return format;
            } catch (ParseException unused) {
                return str2;
            }
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: T */
        public final String mo84229T(@C12579k Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String format = new SimpleDateFormat(C28932h.f70930q).format(date);
            Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(date)");
            return format;
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: U */
        public final Date mo84230U(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "date");
            Date parse = new SimpleDateFormat(C28932h.f70929p).parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            return parse;
        }

        @SuppressLint({"SimpleDateFormat"})
        /* renamed from: V */
        public final long mo84231V(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "sdate");
            Intrinsics.checkNotNullParameter(str2, "pattern");
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            Date parse = new SimpleDateFormat(str2).parse(str + C28932h.f70908R);
            Calendar instance = Calendar.getInstance();
            instance.setTimeZone(timeZone);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            instance.setTime(parse);
            return instance.getTimeInMillis() / 1000;
        }

        @C12579k
        /* renamed from: a */
        public final String mo84232a(int i) {
            Calendar instance = Calendar.getInstance();
            instance.add(5, i);
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).format(instance.getTime());
            Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(datePat…()).format(calendar.time)");
            return format;
        }

        @SuppressLint({"SimpleDateFormat"})
        /* renamed from: b */
        public final boolean mo84233b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "openingDate");
            Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(new Date());
            Calendar instance3 = Calendar.getInstance();
            instance3.setTime(new Date());
            instance3.add(5, -91);
            if (!instance2.after(instance) || !instance3.before(instance)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"SimpleDateFormat"})
        /* renamed from: c */
        public final boolean mo84234c(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "stringDate");
            Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            Date date = new Date();
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(date);
            Calendar instance3 = Calendar.getInstance();
            instance3.add(6, i);
            if (!instance.after(instance2) || !instance.before(instance3)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"SimpleDateFormat"})
        /* renamed from: e */
        public final boolean mo84235e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "endDate");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C28932h.f70917d);
            Calendar instance = Calendar.getInstance();
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            instance.setTime(parse);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(new Date());
            return instance2.before(instance);
        }

        @SuppressLint({"SimpleDateFormat"})
        /* renamed from: f */
        public final boolean mo84236f(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "stringDate");
            Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            Calendar instance2 = Calendar.getInstance();
            instance2.set(11, 0);
            instance2.set(12, 0);
            instance2.set(13, 0);
            Date time = instance2.getTime();
            instance.add(6, i);
            if (!time.after(parse) || !time.before(instance.getTime())) {
                return false;
            }
            return true;
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: g */
        public final String mo84237g(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "date");
            Intrinsics.checkNotNullParameter(str2, "inputPatern");
            Intrinsics.checkNotNullParameter(str3, "outputPatern");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3);
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            String format = simpleDateFormat2.format(parse);
            Intrinsics.checkNotNullExpressionValue(format, "outputFormat.format(parsed as Date)");
            return format;
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: h */
        public final String mo84238h(@C12579k Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(date);
            Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(date)");
            return format;
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: i */
        public final String mo84239i(@C12579k Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String format = new SimpleDateFormat("dd/MM/yyyy").format(date);
            Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(date)");
            return format;
        }

        /* renamed from: j */
        public final int mo84240j(@C12579k Calendar calendar, @C12579k Date date) {
            Intrinsics.checkNotNullParameter(calendar, "calendar");
            Intrinsics.checkNotNullParameter(date, "endTime");
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(date.getTime());
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            return (int) ((instance.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 86400000));
        }

        @C12579k
        /* renamed from: k */
        public final String mo84241k(long j) {
            return mo84242l(new DateTime(j));
        }

        @C12579k
        /* renamed from: l */
        public final String mo84242l(@C12579k DateTime dateTime) {
            Intrinsics.checkNotNullParameter(dateTime, "dateTime");
            String v = C12683i.m54172B().mo29237U().mo29259v(dateTime);
            Intrinsics.checkNotNullExpressionValue(v, "formatter.print(dateTime)");
            return v;
        }

        @C12579k
        /* renamed from: m */
        public final String mo84243m(@C12579k DateTime dateTime) {
            Intrinsics.checkNotNullParameter(dateTime, "dateTime");
            String v = C12671a.m54028f("dd/MM/yyyy").mo29259v(dateTime);
            Intrinsics.checkNotNullExpressionValue(v, "formatter.print(dateTime)");
            return v;
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: n */
        public final String mo84244n(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "dateFormat");
            String format = new SimpleDateFormat(str).format(Calendar.getInstance().getTime());
            Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(dateFor…endar.getInstance().time)");
            return format;
        }

        @C12579k
        /* renamed from: o */
        public final String mo84245o() {
            return mo84242l(new DateTime());
        }

        @SuppressLint({"SimpleDateFormat"})
        @C12579k
        /* renamed from: p */
        public final String mo84246p(@C12579k String str, @C12579k String str2) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "dateInString");
            Intrinsics.checkNotNullParameter(str2, "format");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return "";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2);
            try {
                Date parse = simpleDateFormat.parse(str);
                Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
                String format = simpleDateFormat2.format(parse);
                Intrinsics.checkNotNullExpressionValue(format, "sdFormat.format(df as Date)");
                return format;
            } catch (ParseException unused) {
                return "";
            }
        }

        @C12579k
        /* renamed from: q */
        public final String mo84247q(@C12580l Date date) {
            String format = date != null ? C28932h.f70903M.format(date) : null;
            return format == null ? "" : format;
        }

        @C12579k
        /* renamed from: r */
        public final String mo84248r(@C12580l Date date) {
            String format = date != null ? C28932h.f70902L.format(date) : null;
            return format == null ? "" : format;
        }

        @C12579k
        /* renamed from: s */
        public final String mo84249s(@C12579k Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String format = C28932h.f70898H.format(date);
            Intrinsics.checkNotNullExpressionValue(format, "DATE_FORMATTER_FULL_TEXT_SLASH.format(date)");
            return format;
        }

        @C12579k
        /* renamed from: t */
        public final SimpleDateFormat mo84250t() {
            return C28932h.f70896F;
        }

        @C12579k
        /* renamed from: u */
        public final String mo84251u(@C12579k Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()).format(date);
            Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(FORMAT_…etDefault()).format(date)");
            return format;
        }

        @C12579k
        /* renamed from: w */
        public final ArrayList<String> mo84252w(int i) {
            Calendar instance = Calendar.getInstance();
            ArrayList<String> arrayList = new ArrayList<>();
            int i2 = 1;
            if (1 <= i) {
                while (true) {
                    String format = C28932h.f70905O.format(instance.getTime());
                    Intrinsics.checkNotNullExpressionValue(format, "DATE_FORMAT_MONTH_YEAR.format(calendar.time)");
                    arrayList.add(format);
                    instance.add(2, -1);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return arrayList;
        }

        @C12579k
        /* renamed from: y */
        public final String mo84253y(@C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(list, "fuelPriceList");
            String S = mo84228S((String) CollectionsKt___CollectionsKt.m40675p5(list, new C28934a()).get(0));
            if (!C11622t.isBlank(S)) {
                return S;
            }
            return mo84244n("dd/MM/yyyy");
        }

        @C12579k
        /* renamed from: z */
        public final String mo84254z(@C12579k Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String format = C28932h.f70901K.format(date);
            Intrinsics.checkNotNullExpressionValue(format, "OFFLINE_ORDER_DATE_FORMAT.format(date)");
            return format;
        }

        public C28933a() {
        }
    }

    @C11384m
    /* renamed from: k */
    public static final long m119651k(@C12579k String str) {
        return f70914a.mo84214E(str);
    }

    @C12579k
    @C11384m
    /* renamed from: l */
    public static final String m119652l(@C12579k String str) {
        return f70914a.mo84215F(str);
    }

    @C12579k
    @C11384m
    /* renamed from: m */
    public static final String m119653m(@C12579k String str) {
        return f70914a.mo84216G(str);
    }

    @C12579k
    @C11384m
    /* renamed from: n */
    public static final String m119654n(@C12579k String str) {
        return f70914a.mo84217H(str);
    }
}
