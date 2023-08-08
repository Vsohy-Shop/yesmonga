package androidx.compose.material3;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.util.DesugarTimeZone;

@C11363r0({"SMAP\nLegacyCalendarModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1864#2,3:222\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n*L\n57#1:222,3\n*E\n"})
/* renamed from: androidx.compose.material3.c1 */
public final class C8181c1 implements C8244m {
    @C12579k

    /* renamed from: c */
    public static final C8182a f20030c = new C8182a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final TimeZone f20031d;

    /* renamed from: a */
    public final int f20032a = mo12498t(Calendar.getInstance().getFirstDayOfWeek());
    @C12579k

    /* renamed from: b */
    public final List<Pair<String, String>> f20033b;

    /* renamed from: androidx.compose.material3.c1$a */
    public static final class C8182a {
        public /* synthetic */ C8182a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final String mo12503a(long j, @C12579k String str, @C12579k Locale locale) {
            Intrinsics.checkNotNullParameter(str, "pattern");
            Intrinsics.checkNotNullParameter(locale, "locale");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(mo12504b());
            Calendar instance = Calendar.getInstance(mo12504b());
            instance.setTimeInMillis(j);
            String format = simpleDateFormat.format(Long.valueOf(instance.getTimeInMillis()));
            Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(calendar.timeInMillis)");
            return format;
        }

        @C12579k
        /* renamed from: b */
        public final TimeZone mo12504b() {
            return C8181c1.f20031d;
        }

        public C8182a() {
        }
    }

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"UTC\")");
        f20031d = timeZone;
    }

    public C8181c1() {
        List i = C10976s.m41417i();
        String[] weekdays = new DateFormatSymbols(Locale.getDefault()).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(Locale.getDefault()).getShortWeekdays();
        Intrinsics.checkNotNullExpressionValue(weekdays, "weekdays");
        int i2 = 0;
        for (Object next : ArraysKt___ArraysKt.m39165M9(weekdays, 2)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            i.add(new Pair((String) next, shortWeekdays[i2 + 2]));
            i2 = i3;
        }
        i.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.f20033b = C10976s.m41409a(i);
    }

    @C12580l
    /* renamed from: a */
    public C8238l mo12485a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = f20031d;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return null;
            }
            Calendar instance = Calendar.getInstance(timeZone);
            instance.setTime(parse);
            return new C8238l(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @C12579k
    /* renamed from: b */
    public C8266q mo12486b(@C12579k C8238l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "date");
        return mo12490g(lVar.getYear(), lVar.mo12762W());
    }

    @C12579k
    /* renamed from: c */
    public C8238l mo12487c() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return new C8238l(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis() + ((long) (instance.get(15) + instance.get(16))));
    }

    @C12579k
    /* renamed from: d */
    public C8266q mo12488d(@C12579k C8266q qVar, int i) {
        Intrinsics.checkNotNullParameter(qVar, "from");
        if (i <= 0) {
            return qVar;
        }
        Calendar w = mo12502w(qVar);
        w.add(2, -i);
        return mo12500u(w);
    }

    @C12579k
    /* renamed from: e */
    public C8266q mo12489e(@C12579k C8266q qVar, int i) {
        Intrinsics.checkNotNullParameter(qVar, "from");
        if (i <= 0) {
            return qVar;
        }
        Calendar w = mo12502w(qVar);
        w.add(2, i);
        return mo12500u(w);
    }

    @C12579k
    /* renamed from: g */
    public C8266q mo12490g(int i, int i2) {
        Calendar instance = Calendar.getInstance(f20031d);
        instance.clear();
        instance.set(1, i);
        instance.set(2, i2 - 1);
        instance.set(5, 1);
        Intrinsics.checkNotNullExpressionValue(instance, "firstDayCalendar");
        return mo12500u(instance);
    }

    @C12579k
    /* renamed from: h */
    public C8238l mo12491h(long j) {
        Calendar instance = Calendar.getInstance(f20031d);
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return new C8238l(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis());
    }

    @C12579k
    /* renamed from: i */
    public C8266q mo12492i(long j) {
        Calendar instance = Calendar.getInstance(f20031d);
        instance.setTimeInMillis(j);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Intrinsics.checkNotNullExpressionValue(instance, "firstDayCalendar");
        return mo12500u(instance);
    }

    @C12579k
    /* renamed from: j */
    public String mo12493j(long j, @C12579k String str, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(str, "pattern");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return f20030c.mo12503a(j, str, locale);
    }

    /* renamed from: k */
    public int mo12494k() {
        return this.f20032a;
    }

    @C12579k
    /* renamed from: l */
    public List<Pair<String, String>> mo12495l() {
        return this.f20033b;
    }

    @C12579k
    /* renamed from: p */
    public C8169a0 mo12496p(@C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        Intrinsics.checkNotNull(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String pattern = ((SimpleDateFormat) dateInstance).toPattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "DateFormat.getDateInstan…leDateFormat).toPattern()");
        return C8255o.m27418a(pattern);
    }

    /* renamed from: q */
    public int mo12497q(@C12579k C8238l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "date");
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        return mo12498t(mo12501v(lVar, timeZone).get(7));
    }

    /* renamed from: t */
    public final int mo12498t(int i) {
        int i2 = (i + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    @C12579k
    public String toString() {
        return "LegacyCalendarModel";
    }

    /* renamed from: u */
    public final C8266q mo12500u(Calendar calendar) {
        int t = mo12498t(calendar.get(7)) - mo12494k();
        if (t < 0) {
            t += 7;
        }
        return new C8266q(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), t, calendar.getTimeInMillis());
    }

    /* renamed from: v */
    public final Calendar mo12501v(C8238l lVar, TimeZone timeZone) {
        Calendar instance = Calendar.getInstance(timeZone);
        instance.clear();
        instance.set(1, lVar.getYear());
        instance.set(2, lVar.mo12762W() - 1);
        instance.set(5, lVar.mo12761R1());
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        return instance;
    }

    /* renamed from: w */
    public final Calendar mo12502w(C8266q qVar) {
        Calendar instance = Calendar.getInstance(f20031d);
        instance.setTimeInMillis(qVar.mo12921n());
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        return instance;
    }
}
