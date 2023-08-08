package androidx.compose.material3;

import androidx.annotation.C0376v0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.time.DayOfWeek;
import p073j$.time.Instant;
import p073j$.time.LocalDate;
import p073j$.time.LocalTime;
import p073j$.time.ZoneId;
import p073j$.time.ZoneOffset;
import p073j$.time.chrono.Chronology;
import p073j$.time.format.DateTimeFormatter;
import p073j$.time.format.DateTimeFormatterBuilder;
import p073j$.time.format.DateTimeParseException;
import p073j$.time.format.DecimalStyle;
import p073j$.time.format.FormatStyle;
import p073j$.time.format.TextStyle;
import p073j$.time.temporal.WeekFields;

@C0376v0(26)
@C11363r0({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,213:1\n11335#2:214\n11670#2,3:215\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n*L\n61#1:214\n61#1:215,3\n*E\n"})
/* renamed from: androidx.compose.material3.n */
public final class C8249n implements C8244m {
    @C12579k

    /* renamed from: c */
    public static final C8250a f20370c = new C8250a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final ZoneId f20371d;

    /* renamed from: a */
    public final int f20372a = WeekFields.m172453of(Locale.getDefault()).getFirstDayOfWeek().getValue();
    @C12579k

    /* renamed from: b */
    public final List<Pair<String, String>> f20373b;

    /* renamed from: androidx.compose.material3.n$a */
    public static final class C8250a {
        public /* synthetic */ C8250a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final String mo12865a(long j, @C12579k String str, @C12579k Locale locale) {
            Intrinsics.checkNotNullParameter(str, "pattern");
            Intrinsics.checkNotNullParameter(locale, "locale");
            DateTimeFormatter withDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.m172334of(locale));
            Intrinsics.checkNotNullExpressionValue(withDecimalStyle, "ofPattern(pattern, local…(DecimalStyle.of(locale))");
            String format = Instant.ofEpochMilli(j).atZone(mo12866b()).mo138017m().format(withDecimalStyle);
            Intrinsics.checkNotNullExpressionValue(format, "ofEpochMilli(utcTimeMill…       .format(formatter)");
            return format;
        }

        @C12579k
        /* renamed from: b */
        public final ZoneId mo12866b() {
            return C8249n.f20371d;
        }

        public C8250a() {
        }
    }

    static {
        ZoneId of = ZoneId.m171932of("UTC");
        Intrinsics.checkNotNullExpressionValue(of, "of(\"UTC\")");
        f20371d = of;
    }

    public C8249n() {
        Locale locale = Locale.getDefault();
        DayOfWeek[] values = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (DayOfWeek dayOfWeek : values) {
            arrayList.add(C11078d1.m42659a(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.f20373b = arrayList;
    }

    @C12580l
    /* renamed from: a */
    public C8238l mo12485a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "pattern");
        try {
            LocalDate parse = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
            return new C8238l(parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth(), parse.mo137918N(LocalTime.MIDNIGHT).mo137951J(f20371d).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @C12579k
    /* renamed from: b */
    public C8266q mo12486b(@C12579k C8238l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "date");
        LocalDate of = LocalDate.m171813of(lVar.getYear(), lVar.mo12762W(), 1);
        Intrinsics.checkNotNullExpressionValue(of, "of(date.year, date.month, 1)");
        return mo12861t(of);
    }

    @C12579k
    /* renamed from: c */
    public C8238l mo12487c() {
        LocalDate now = LocalDate.now();
        return new C8238l(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.mo137918N(LocalTime.MIDNIGHT).mo137951J(f20371d).toInstant().toEpochMilli());
    }

    @C12579k
    /* renamed from: d */
    public C8266q mo12488d(@C12579k C8266q qVar, int i) {
        Intrinsics.checkNotNullParameter(qVar, "from");
        if (i <= 0) {
            return qVar;
        }
        LocalDate minusMonths = mo12864v(qVar).minusMonths((long) i);
        Intrinsics.checkNotNullExpressionValue(minusMonths, "earlierMonth");
        return mo12861t(minusMonths);
    }

    @C12579k
    /* renamed from: e */
    public C8266q mo12489e(@C12579k C8266q qVar, int i) {
        Intrinsics.checkNotNullParameter(qVar, "from");
        if (i <= 0) {
            return qVar;
        }
        LocalDate plusMonths = mo12864v(qVar).plusMonths((long) i);
        Intrinsics.checkNotNullExpressionValue(plusMonths, "laterMonth");
        return mo12861t(plusMonths);
    }

    @C12579k
    /* renamed from: g */
    public C8266q mo12490g(int i, int i2) {
        LocalDate of = LocalDate.m171813of(i, i2, 1);
        Intrinsics.checkNotNullExpressionValue(of, "of(year, month, 1)");
        return mo12861t(of);
    }

    @C12579k
    /* renamed from: h */
    public C8238l mo12491h(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(f20371d).mo138017m();
        return new C8238l(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * ((long) 1000));
    }

    @C12579k
    /* renamed from: i */
    public C8266q mo12492i(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(f20371d).withDayOfMonth(1).mo138017m();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofEpochMilli(timeInMilli…           .toLocalDate()");
        return mo12861t(localDate);
    }

    @C12579k
    /* renamed from: j */
    public String mo12493j(long j, @C12579k String str, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(str, "pattern");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return f20370c.mo12865a(j, str, locale);
    }

    /* renamed from: k */
    public int mo12494k() {
        return this.f20372a;
    }

    @C12579k
    /* renamed from: l */
    public List<Pair<String, String>> mo12495l() {
        return this.f20373b;
    }

    @C12579k
    /* renamed from: p */
    public C8169a0 mo12496p(@C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, (FormatStyle) null, Chronology.ofLocale(locale), locale);
        Intrinsics.checkNotNullExpressionValue(localizedDateTimePattern, "getLocalizedDateTimePatt…= */ locale\n            )");
        return C8255o.m27418a(localizedDateTimePattern);
    }

    /* renamed from: q */
    public int mo12497q(@C12579k C8238l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "date");
        return mo12863u(lVar).getDayOfWeek().getValue();
    }

    /* renamed from: t */
    public final C8266q mo12861t(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - mo12494k();
        if (value < 0) {
            value += 7;
        }
        return new C8266q(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.mo137918N(LocalTime.MIDNIGHT).mo137951J(f20371d).toInstant().toEpochMilli());
    }

    @C12579k
    public String toString() {
        return "CalendarModel";
    }

    /* renamed from: u */
    public final LocalDate mo12863u(C8238l lVar) {
        LocalDate of = LocalDate.m171813of(lVar.getYear(), lVar.mo12762W(), lVar.mo12761R1());
        Intrinsics.checkNotNullExpressionValue(of, "of(\n            this.yea…this.dayOfMonth\n        )");
        return of;
    }

    /* renamed from: v */
    public final LocalDate mo12864v(C8266q qVar) {
        LocalDate localDate = Instant.ofEpochMilli(qVar.mo12921n()).atZone(f20371d).mo138017m();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofEpochMilli(startUtcTim…TimeZoneId).toLocalDate()");
        return localDate;
    }
}
