package p073j$.time.temporal;

/* renamed from: j$.time.temporal.a */
public enum C42662a implements C42675n {
    NANO_OF_SECOND("NanoOfSecond", C42679r.m172526j(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", C42679r.m172526j(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", C42679r.m172526j(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", C42679r.m172526j(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", C42679r.m172526j(0, 999)),
    MILLI_OF_DAY("MilliOfDay", C42679r.m172526j(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", C42679r.m172526j(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", C42679r.m172526j(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", C42679r.m172526j(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", C42679r.m172526j(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", C42679r.m172526j(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", C42679r.m172526j(1, 12)),
    HOUR_OF_DAY("HourOfDay", C42679r.m172526j(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", C42679r.m172526j(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", C42679r.m172526j(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", C42679r.m172526j(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", C42679r.m172526j(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", C42679r.m172526j(1, 7)),
    DAY_OF_MONTH("DayOfMonth", C42679r.m172528l(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", C42679r.m172528l(365, 366)),
    EPOCH_DAY("EpochDay", C42679r.m172526j(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", C42679r.m172528l(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", C42679r.m172526j(1, 53)),
    PROLEPTIC_MONTH("ProlepticMonth", C42679r.m172526j(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", C42679r.m172528l(999999999, 1000000000)),
    YEAR("Year", C42679r.m172526j(-999999999, 999999999), 0),
    ERA("Era", C42679r.m172526j(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", C42679r.m172526j(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", C42679r.m172526j(-64800, 64800));
    

    /* renamed from: a */
    private final String f107950a;

    /* renamed from: b */
    private final C42679r f107951b;

    private C42662a(String str, C42679r rVar) {
        this.f107950a = str;
        this.f107951b = rVar;
    }

    private C42662a(String str, C42679r rVar, int i) {
        this.f107950a = str;
        this.f107951b = rVar;
    }

    /* renamed from: E */
    public final C42679r mo138210E() {
        return this.f107951b;
    }

    /* renamed from: K */
    public final boolean mo138211K() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    /* renamed from: L */
    public final C42679r mo138212L(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo137889i(this);
    }

    /* renamed from: Y */
    public final boolean mo138213Y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo137885f(this);
    }

    /* renamed from: a0 */
    public final int mo138214a0(long j) {
        return this.f107951b.mo138226a(j, this);
    }

    /* renamed from: b0 */
    public final void mo138215b0(long j) {
        this.f107951b.mo138227b(j, this);
    }

    /* renamed from: n */
    public final boolean mo138216n() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    /* renamed from: o */
    public final C42671j mo138217o(C42671j jVar, long j) {
        return jVar.mo137902a(j, this);
    }

    /* renamed from: q */
    public final long mo138218q(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo137886g(this);
    }

    public final String toString() {
        return this.f107950a;
    }
}
