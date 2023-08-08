package p073j$.time.format;

import androidx.compose.p004ui.graphics.vector.C15369g;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.C12361b;
import p073j$.time.ZoneId;
import p073j$.time.chrono.C42608p;
import p073j$.time.chrono.Chronology;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42670i;
import p073j$.time.temporal.C42675n;

/* renamed from: j$.time.format.DateTimeFormatterBuilder */
public final class DateTimeFormatterBuilder {

    /* renamed from: h */
    private static final C42627a f107830h = new C42627a();

    /* renamed from: i */
    private static final Map f107831i;

    /* renamed from: j */
    public static final /* synthetic */ int f107832j = 0;

    /* renamed from: a */
    private DateTimeFormatterBuilder f107833a;

    /* renamed from: b */
    private final DateTimeFormatterBuilder f107834b;

    /* renamed from: c */
    private final List f107835c;

    /* renamed from: d */
    private final boolean f107836d;

    /* renamed from: e */
    private int f107837e;

    /* renamed from: f */
    private char f107838f;

    /* renamed from: g */
    private int f107839g;

    static {
        HashMap hashMap = new HashMap();
        f107831i = hashMap;
        hashMap.put('G', C42662a.ERA);
        hashMap.put('y', C42662a.YEAR_OF_ERA);
        hashMap.put(Character.valueOf(C12361b.f30265p), C42662a.YEAR);
        Character valueOf = Character.valueOf(C15369g.f37990p);
        C42675n nVar = C42670i.f107957a;
        hashMap.put(valueOf, nVar);
        hashMap.put(Character.valueOf(C15369g.f37989o), nVar);
        Character valueOf2 = Character.valueOf(C15369g.f37978d);
        C42662a aVar = C42662a.MONTH_OF_YEAR;
        hashMap.put(valueOf2, aVar);
        hashMap.put(Character.valueOf(C15369g.f37980f), aVar);
        hashMap.put('D', C42662a.DAY_OF_YEAR);
        hashMap.put('d', C42662a.DAY_OF_MONTH);
        hashMap.put('F', C42662a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        C42662a aVar2 = C42662a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put(Character.valueOf(C15369g.f37985k), aVar2);
        hashMap.put('e', aVar2);
        hashMap.put(Character.valueOf(C15369g.f37993s), C42662a.AMPM_OF_DAY);
        hashMap.put(Character.valueOf(C15369g.f37982h), C42662a.HOUR_OF_DAY);
        hashMap.put('k', C42662a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', C42662a.HOUR_OF_AMPM);
        hashMap.put(Character.valueOf(C15369g.f37981g), C42662a.CLOCK_HOUR_OF_AMPM);
        hashMap.put(Character.valueOf(C15369g.f37977c), C42662a.MINUTE_OF_HOUR);
        hashMap.put(Character.valueOf(C15369g.f37987m), C42662a.SECOND_OF_MINUTE);
        Character valueOf3 = Character.valueOf(C15369g.f37988n);
        C42662a aVar3 = C42662a.NANO_OF_SECOND;
        hashMap.put(valueOf3, aVar3);
        hashMap.put(Character.valueOf(C15369g.f37994t), C42662a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', C42662a.NANO_OF_DAY);
    }

    public DateTimeFormatterBuilder() {
        this.f107833a = this;
        this.f107835c = new ArrayList();
        this.f107839g = -1;
        this.f107834b = null;
        this.f107836d = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f107833a = this;
        this.f107835c = new ArrayList();
        this.f107839g = -1;
        this.f107834b = dateTimeFormatterBuilder;
        this.f107836d = true;
    }

    /* renamed from: d */
    private int m172311d(C42633g gVar) {
        Objects.requireNonNull(gVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f107833a;
        int i = dateTimeFormatterBuilder.f107837e;
        if (i > 0) {
            C42639m mVar = new C42639m(gVar, i, dateTimeFormatterBuilder.f107838f);
            dateTimeFormatterBuilder.f107837e = 0;
            dateTimeFormatterBuilder.f107838f = 0;
            gVar = mVar;
        }
        ((ArrayList) dateTimeFormatterBuilder.f107835c).add(gVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f107833a;
        dateTimeFormatterBuilder2.f107839g = -1;
        return ((ArrayList) dateTimeFormatterBuilder2.f107835c).size() - 1;
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        DateFormat dateInstance = formatStyle2 == null ? DateFormat.getDateInstance(formatStyle.ordinal(), locale) : formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        if (dateInstance instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateInstance).toPattern();
            if (pattern == null) {
                return null;
            }
            boolean z = true;
            int i = 0;
            boolean z2 = pattern.indexOf(66) != -1;
            if (pattern.indexOf(98) == -1) {
                z = false;
            }
            if (!z2 && !z) {
                return pattern;
            }
            StringBuilder sb = new StringBuilder(pattern.length());
            char c = ' ';
            while (i < pattern.length()) {
                char charAt = pattern.charAt(i);
                if (charAt == ' ' ? i == 0 || !(c == 'B' || c == 'b') : !(charAt == 'B' || charAt == 'b')) {
                    sb.append(charAt);
                }
                i++;
                c = charAt;
            }
            int length = sb.length() - 1;
            if (length >= 0 && sb.charAt(length) == ' ') {
                sb.deleteCharAt(length);
            }
            return sb.toString();
        }
        throw new UnsupportedOperationException("Can't determine pattern from " + dateInstance);
    }

    /* renamed from: m */
    private void m172312m(C42637k kVar) {
        C42637k kVar2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f107833a;
        int i = dateTimeFormatterBuilder.f107839g;
        if (i >= 0) {
            C42637k kVar3 = (C42637k) ((ArrayList) dateTimeFormatterBuilder.f107835c).get(i);
            int i2 = kVar.f107869b;
            int i3 = kVar.f107870c;
            if (i2 == i3 && kVar.f107871d == C42625D.NOT_NEGATIVE) {
                kVar2 = kVar3.mo138147f(i3);
                m172311d(kVar.mo138146e());
                this.f107833a.f107839g = i;
            } else {
                kVar2 = kVar3.mo138146e();
                this.f107833a.f107839g = m172311d(kVar);
            }
            ((ArrayList) this.f107833a.f107835c).set(i, kVar2);
            return;
        }
        dateTimeFormatterBuilder.f107839g = m172311d(kVar);
    }

    /* renamed from: w */
    private DateTimeFormatter m172313w(Locale locale, C42624C c, C42608p pVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f107833a.f107834b != null) {
            mo138117p();
        }
        return new DateTimeFormatter(new C42632f(this.f107835c, false), locale, DecimalStyle.f107840e, c, (Set) null, pVar, (ZoneId) null);
    }

    /* renamed from: a */
    public final void mo138104a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        m172311d(dateTimeFormatter.mo138100g());
    }

    /* renamed from: b */
    public final void mo138105b(C42662a aVar, int i, int i2, boolean z) {
        m172311d(new C42634h(aVar, i, i2, z));
    }

    /* renamed from: c */
    public final void mo138106c() {
        m172311d(new C42635i());
    }

    /* renamed from: e */
    public final void mo138107e(char c) {
        m172311d(new C42631e(c));
    }

    /* renamed from: f */
    public final void mo138108f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.length() > 0) {
            m172311d(str.length() == 1 ? new C42631e(str.charAt(0)) : new C42636j(str, 1));
        }
    }

    /* renamed from: g */
    public final void mo138109g(String str, String str2) {
        m172311d(new C42638l(str, str2));
    }

    /* renamed from: h */
    public final void mo138110h() {
        m172311d(C42638l.f107874d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00df, code lost:
        if (r3 == 1) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0281 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x03a9 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138111i(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "pattern"
            java.util.Objects.requireNonNull(r1, r2)
            r2 = 0
            r3 = r2
        L_0x000b:
            int r4 = r17.length()
            if (r3 >= r4) goto L_0x03fc
            char r4 = r1.charAt(r3)
            r5 = 1
            r6 = 65
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 90
            r9 = 97
            if (r4 < r6) goto L_0x0022
            if (r4 <= r8) goto L_0x0026
        L_0x0022:
            if (r4 < r9) goto L_0x0364
            if (r4 > r7) goto L_0x0364
        L_0x0026:
            int r10 = r3 + 1
        L_0x0028:
            int r11 = r17.length()
            if (r10 >= r11) goto L_0x0037
            char r11 = r1.charAt(r10)
            if (r11 != r4) goto L_0x0037
            int r10 = r10 + 1
            goto L_0x0028
        L_0x0037:
            int r3 = r10 - r3
            r11 = 112(0x70, float:1.57E-43)
            r12 = -1
            if (r4 != r11) goto L_0x0098
            int r11 = r17.length()
            if (r10 >= r11) goto L_0x0064
            char r4 = r1.charAt(r10)
            if (r4 < r6) goto L_0x004c
            if (r4 <= r8) goto L_0x0050
        L_0x004c:
            if (r4 < r9) goto L_0x0064
            if (r4 > r7) goto L_0x0064
        L_0x0050:
            int r6 = r10 + 1
        L_0x0052:
            int r11 = r17.length()
            if (r6 >= r11) goto L_0x0061
            char r11 = r1.charAt(r6)
            if (r11 != r4) goto L_0x0061
            int r6 = r6 + 1
            goto L_0x0052
        L_0x0061:
            int r10 = r6 - r10
            goto L_0x0067
        L_0x0064:
            r6 = r10
            r10 = r3
            r3 = r2
        L_0x0067:
            if (r3 == 0) goto L_0x008c
            if (r3 < r5) goto L_0x0078
            j$.time.format.DateTimeFormatterBuilder r11 = r0.f107833a
            r11.f107837e = r3
            r3 = 32
            r11.f107838f = r3
            r11.f107839g = r12
            r3 = r10
            r10 = r6
            goto L_0x0098
        L_0x0078:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "The pad width must be at least one but was "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x008c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Pad letter 'p' must be followed by valid pad pattern: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0098:
            java.util.Map r6 = f107831i
            java.lang.Character r11 = java.lang.Character.valueOf(r4)
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r11)
            j$.time.temporal.n r6 = (p073j$.time.temporal.C42675n) r6
            r11 = 2
            r13 = 5
            r14 = 4
            java.lang.String r15 = "Too many pattern letters: "
            if (r6 == 0) goto L_0x01f2
            r7 = 19
            r8 = 81
            r12 = 3
            if (r4 == r8) goto L_0x0193
            r8 = 83
            if (r4 == r8) goto L_0x018b
            if (r4 == r9) goto L_0x0176
            r8 = 104(0x68, float:1.46E-43)
            if (r4 == r8) goto L_0x015a
            r8 = 107(0x6b, float:1.5E-43)
            if (r4 == r8) goto L_0x015a
            r8 = 109(0x6d, float:1.53E-43)
            if (r4 == r8) goto L_0x015a
            r8 = 113(0x71, float:1.58E-43)
            if (r4 == r8) goto L_0x0158
            r8 = 115(0x73, float:1.61E-43)
            if (r4 == r8) goto L_0x015a
            r8 = 117(0x75, float:1.64E-43)
            if (r4 == r8) goto L_0x013b
            r8 = 121(0x79, float:1.7E-43)
            if (r4 == r8) goto L_0x013b
            switch(r4) {
                case 68: goto L_0x0117;
                case 69: goto L_0x0193;
                case 70: goto L_0x0101;
                case 71: goto L_0x00e3;
                case 72: goto L_0x015a;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            switch(r4) {
                case 75: goto L_0x015a;
                case 76: goto L_0x0158;
                case 77: goto L_0x0193;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            switch(r4) {
                case 99: goto L_0x0130;
                case 100: goto L_0x015a;
                case 101: goto L_0x0193;
                default: goto L_0x00df;
            }
        L_0x00df:
            if (r3 != r5) goto L_0x0160
            goto L_0x01da
        L_0x00e3:
            if (r3 == r5) goto L_0x01d2
            if (r3 == r11) goto L_0x01d2
            if (r3 == r12) goto L_0x01d2
            if (r3 == r14) goto L_0x01bd
            if (r3 != r13) goto L_0x00ef
            goto L_0x01a3
        L_0x00ef:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0101:
            if (r3 != r5) goto L_0x0105
            goto L_0x01da
        L_0x0105:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0117:
            if (r3 != r5) goto L_0x011b
            goto L_0x01da
        L_0x011b:
            if (r3 > r12) goto L_0x011e
            goto L_0x0160
        L_0x011e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0130:
            if (r3 == r11) goto L_0x0133
            goto L_0x0158
        L_0x0133:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid pattern \"cc\""
            r1.<init>(r2)
            throw r1
        L_0x013b:
            if (r3 != r11) goto L_0x014d
            j$.time.LocalDate r3 = p073j$.time.format.C42643q.f107891i
            java.lang.String r4 = "baseDate"
            java.util.Objects.requireNonNull(r3, r4)
            j$.time.format.q r4 = new j$.time.format.q
            r4.<init>(r6, r3)
            r0.m172312m(r4)
            goto L_0x0190
        L_0x014d:
            if (r3 >= r14) goto L_0x0152
            j$.time.format.D r4 = p073j$.time.format.C42625D.NORMAL
            goto L_0x0154
        L_0x0152:
            j$.time.format.D r4 = p073j$.time.format.C42625D.EXCEEDS_PAD
        L_0x0154:
            r0.mo138114l(r6, r3, r7, r4)
            goto L_0x0190
        L_0x0158:
            r8 = r5
            goto L_0x0194
        L_0x015a:
            if (r3 != r5) goto L_0x015e
            goto L_0x01da
        L_0x015e:
            if (r3 != r11) goto L_0x0164
        L_0x0160:
            r0.mo138115n(r6, r3)
            goto L_0x0190
        L_0x0164:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0176:
            if (r3 != r5) goto L_0x0179
            goto L_0x01d2
        L_0x0179:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x018b:
            j$.time.temporal.a r4 = p073j$.time.temporal.C42662a.NANO_OF_SECOND
            r0.mo138105b(r4, r3, r3, r2)
        L_0x0190:
            r3 = -1
            goto L_0x034d
        L_0x0193:
            r8 = r2
        L_0x0194:
            if (r3 == r5) goto L_0x01c5
            if (r3 == r11) goto L_0x01c5
            if (r3 == r12) goto L_0x01c0
            if (r3 == r14) goto L_0x01b8
            if (r3 != r13) goto L_0x01a6
            if (r8 == 0) goto L_0x01a3
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.NARROW_STANDALONE
            goto L_0x01d4
        L_0x01a3:
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.NARROW
            goto L_0x01d4
        L_0x01a6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01b8:
            if (r8 == 0) goto L_0x01bd
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.FULL_STANDALONE
            goto L_0x01d4
        L_0x01bd:
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.FULL
            goto L_0x01d4
        L_0x01c0:
            if (r8 == 0) goto L_0x01d2
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.SHORT_STANDALONE
            goto L_0x01d4
        L_0x01c5:
            r8 = 99
            if (r4 == r8) goto L_0x01e9
            r8 = 101(0x65, float:1.42E-43)
            if (r4 != r8) goto L_0x01ce
            goto L_0x01e9
        L_0x01ce:
            r8 = 69
            if (r4 != r8) goto L_0x01d8
        L_0x01d2:
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.SHORT
        L_0x01d4:
            r0.mo138113k(r6, r3)
            goto L_0x0190
        L_0x01d8:
            if (r3 != r5) goto L_0x01e5
        L_0x01da:
            j$.time.format.k r3 = new j$.time.format.k
            j$.time.format.D r4 = p073j$.time.format.C42625D.NORMAL
            r3.<init>(r6, r5, r7, r4)
            r0.m172312m(r3)
            goto L_0x0190
        L_0x01e5:
            r0.mo138115n(r6, r11)
            goto L_0x0190
        L_0x01e9:
            j$.time.format.t r6 = new j$.time.format.t
            r6.<init>(r4, r3)
            r0.m172311d(r6)
            goto L_0x0190
        L_0x01f2:
            if (r4 != r7) goto L_0x0218
            if (r3 > r14) goto L_0x0206
            if (r3 != r14) goto L_0x01fb
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.FULL
            goto L_0x01fd
        L_0x01fb:
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.SHORT
        L_0x01fd:
            j$.time.format.v r4 = new j$.time.format.v
            r4.<init>(r3)
            r0.m172311d(r4)
            goto L_0x0190
        L_0x0206:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0218:
            r6 = 86
            if (r4 != r6) goto L_0x0242
            if (r3 != r11) goto L_0x022e
            j$.time.format.u r3 = new j$.time.format.u
            j$.time.temporal.m r4 = p073j$.time.temporal.C42676o.m172522g()
            java.lang.String r6 = "ZoneId()"
            r3.<init>(r4, r6)
            r0.m172311d(r3)
            goto L_0x0190
        L_0x022e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern letter count must be 2: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0242:
            java.lang.String r6 = "+0000"
            if (r4 != r8) goto L_0x0266
            if (r3 >= r14) goto L_0x024c
            java.lang.String r3 = "+HHMM"
            goto L_0x02ec
        L_0x024c:
            if (r3 != r14) goto L_0x024f
            goto L_0x0271
        L_0x024f:
            if (r3 != r13) goto L_0x0254
            java.lang.String r3 = "+HH:MM:ss"
            goto L_0x02b7
        L_0x0254:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0266:
            r7 = 79
            if (r4 != r7) goto L_0x02a7
            if (r3 != r5) goto L_0x026f
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.SHORT
            goto L_0x0273
        L_0x026f:
            if (r3 != r14) goto L_0x0293
        L_0x0271:
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.FULL
        L_0x0273:
            java.lang.String r4 = "style"
            java.util.Objects.requireNonNull(r3, r4)
            j$.time.format.TextStyle r4 = p073j$.time.format.TextStyle.FULL
            if (r3 == r4) goto L_0x0289
            j$.time.format.TextStyle r4 = p073j$.time.format.TextStyle.SHORT
            if (r3 != r4) goto L_0x0281
            goto L_0x0289
        L_0x0281:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Style must be either full or short"
            r1.<init>(r2)
            throw r1
        L_0x0289:
            j$.time.format.j r4 = new j$.time.format.j
            r4.<init>(r3, r2)
            r0.m172311d(r4)
            goto L_0x0190
        L_0x0293:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern letter count must be 1 or 4: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02a7:
            r7 = 88
            if (r4 != r7) goto L_0x02d0
            if (r3 > r13) goto L_0x02be
            java.lang.String[] r4 = p073j$.time.format.C42638l.f107873c
            if (r3 != r5) goto L_0x02b3
            r6 = r2
            goto L_0x02b4
        L_0x02b3:
            r6 = r5
        L_0x02b4:
            int r3 = r3 + r6
            r3 = r4[r3]
        L_0x02b7:
            java.lang.String r4 = "Z"
            r0.mo138109g(r3, r4)
            goto L_0x0190
        L_0x02be:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02d0:
            r7 = 120(0x78, float:1.68E-43)
            if (r4 != r7) goto L_0x0303
            if (r3 > r13) goto L_0x02f1
            if (r3 != r5) goto L_0x02db
            java.lang.String r6 = "+00"
            goto L_0x02e2
        L_0x02db:
            int r4 = r3 % 2
            if (r4 != 0) goto L_0x02e0
            goto L_0x02e2
        L_0x02e0:
            java.lang.String r6 = "+00:00"
        L_0x02e2:
            java.lang.String[] r4 = p073j$.time.format.C42638l.f107873c
            if (r3 != r5) goto L_0x02e8
            r7 = r2
            goto L_0x02e9
        L_0x02e8:
            r7 = r5
        L_0x02e9:
            int r3 = r3 + r7
            r3 = r4[r3]
        L_0x02ec:
            r0.mo138109g(r3, r6)
            goto L_0x0190
        L_0x02f1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0303:
            r6 = 87
            if (r4 != r6) goto L_0x0321
            if (r3 > r5) goto L_0x030f
            j$.time.format.t r6 = new j$.time.format.t
            r6.<init>(r4, r3)
            goto L_0x0348
        L_0x030f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0321:
            r6 = 119(0x77, float:1.67E-43)
            if (r4 != r6) goto L_0x033f
            if (r3 > r11) goto L_0x032d
            j$.time.format.t r6 = new j$.time.format.t
            r6.<init>(r4, r3)
            goto L_0x0348
        L_0x032d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x033f:
            r6 = 89
            if (r4 != r6) goto L_0x0350
            j$.time.format.t r6 = new j$.time.format.t
            r6.<init>(r4, r3)
        L_0x0348:
            r0.m172311d(r6)
            goto L_0x0190
        L_0x034d:
            int r3 = r3 + r10
            goto L_0x03e2
        L_0x0350:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown pattern letter: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0364:
            java.lang.String r6 = "'"
            r7 = 39
            if (r4 != r7) goto L_0x03b5
            int r3 = r3 + 1
            r4 = r3
        L_0x036d:
            int r8 = r17.length()
            if (r4 >= r8) goto L_0x038a
            char r8 = r1.charAt(r4)
            if (r8 != r7) goto L_0x0388
            int r8 = r4 + 1
            int r9 = r17.length()
            if (r8 >= r9) goto L_0x038a
            char r9 = r1.charAt(r8)
            if (r9 != r7) goto L_0x038a
            r4 = r8
        L_0x0388:
            int r4 = r4 + r5
            goto L_0x036d
        L_0x038a:
            int r8 = r17.length()
            if (r4 >= r8) goto L_0x03a9
            java.lang.String r3 = r1.substring(r3, r4)
            int r8 = r3.length()
            if (r8 != 0) goto L_0x039e
            r0.mo138107e(r7)
            goto L_0x03a7
        L_0x039e:
            java.lang.String r7 = "''"
            java.lang.String r3 = r3.replace(r7, r6)
            r0.mo138108f(r3)
        L_0x03a7:
            r3 = r4
            goto L_0x03e2
        L_0x03a9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Pattern ends with an incomplete string literal: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x03b5:
            r7 = 91
            if (r4 != r7) goto L_0x03bd
            r16.mo138118q()
            goto L_0x03e2
        L_0x03bd:
            r7 = 93
            if (r4 != r7) goto L_0x03d3
            j$.time.format.DateTimeFormatterBuilder r4 = r0.f107833a
            j$.time.format.DateTimeFormatterBuilder r4 = r4.f107834b
            if (r4 == 0) goto L_0x03cb
            r16.mo138117p()
            goto L_0x03e2
        L_0x03cb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern invalid as it contains ] without previous ["
            r1.<init>(r2)
            throw r1
        L_0x03d3:
            r7 = 123(0x7b, float:1.72E-43)
            if (r4 == r7) goto L_0x03e5
            r7 = 125(0x7d, float:1.75E-43)
            if (r4 == r7) goto L_0x03e5
            r7 = 35
            if (r4 == r7) goto L_0x03e5
            r0.mo138107e(r4)
        L_0x03e2:
            int r3 = r3 + r5
            goto L_0x000b
        L_0x03e5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern includes reserved character: '"
            r2.<init>(r3)
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.DateTimeFormatterBuilder.mo138111i(java.lang.String):void");
    }

    /* renamed from: j */
    public final void mo138112j(C42662a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        m172311d(new C42645s(aVar, textStyle, new C42628b(new C42652z(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    /* renamed from: k */
    public final void mo138113k(C42675n nVar, TextStyle textStyle) {
        Objects.requireNonNull(nVar, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        m172311d(new C42645s(nVar, textStyle, new C42622A()));
    }

    /* renamed from: l */
    public final DateTimeFormatterBuilder mo138114l(C42675n nVar, int i, int i2, C42625D d) {
        if (i == i2 && d == C42625D.NOT_NEGATIVE) {
            mo138115n(nVar, i2);
            return this;
        }
        Objects.requireNonNull(nVar, "field");
        Objects.requireNonNull(d, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            m172312m(new C42637k(nVar, i, i2, d));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: n */
    public final void mo138115n(C42675n nVar, int i) {
        Objects.requireNonNull(nVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        m172312m(new C42637k(nVar, i, i, C42625D.NOT_NEGATIVE));
    }

    /* renamed from: o */
    public final void mo138116o() {
        m172311d(new C42647u(f107830h, "ZoneRegionId()"));
    }

    /* renamed from: p */
    public final void mo138117p() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f107833a;
        if (dateTimeFormatterBuilder.f107834b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        } else if (((ArrayList) dateTimeFormatterBuilder.f107835c).size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f107833a;
            C42632f fVar = new C42632f(dateTimeFormatterBuilder2.f107835c, dateTimeFormatterBuilder2.f107836d);
            this.f107833a = this.f107833a.f107834b;
            m172311d(fVar);
        } else {
            this.f107833a = this.f107833a.f107834b;
        }
    }

    /* renamed from: q */
    public final void mo138118q() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f107833a;
        dateTimeFormatterBuilder.f107839g = -1;
        this.f107833a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    /* renamed from: r */
    public final void mo138119r() {
        m172311d(C42644r.INSENSITIVE);
    }

    /* renamed from: s */
    public final void mo138120s() {
        m172311d(C42644r.SENSITIVE);
    }

    /* renamed from: t */
    public final void mo138121t() {
        m172311d(C42644r.LENIENT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final DateTimeFormatter mo138122u(C42624C c, C42608p pVar) {
        return m172313w(Locale.getDefault(), c, pVar);
    }

    /* renamed from: v */
    public final DateTimeFormatter mo138123v(Locale locale) {
        return m172313w(locale, C42624C.SMART, (C42608p) null);
    }
}
