package org.joda.time.p014tz;

import com.contentsquare.android.api.C14092c;
import com.urbanairship.AirshipConfigOptions;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.internal.C12027x;
import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* renamed from: org.joda.time.tz.DateTimeZoneBuilder */
public class DateTimeZoneBuilder {

    /* renamed from: a */
    public final ArrayList<C12720d> f31385a = new ArrayList<>(10);

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$DSTZone */
    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final C12718b iEndRecurrence;
        final int iStandardOffset;
        final C12718b iStartRecurrence;

        public DSTZone(String str, int i, C12718b bVar, C12718b bVar2) {
            super(str);
            this.iStandardOffset = i;
            this.iStartRecurrence = bVar;
            this.iEndRecurrence = bVar2;
        }

        /* renamed from: Q */
        public static DSTZone m54649Q(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.m54638h(dataInput), C12718b.m54677f(dataInput), C12718b.m54677f(dataInput));
        }

        /* renamed from: C */
        public int mo27811C(long j) {
            return this.iStandardOffset;
        }

        /* renamed from: D */
        public boolean mo27812D() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (r5 < 0) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* renamed from: G */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo27815G(long r9) {
            /*
                r8 = this;
                int r0 = r8.iStandardOffset
                org.joda.time.tz.DateTimeZoneBuilder$b r1 = r8.iStartRecurrence
                org.joda.time.tz.DateTimeZoneBuilder$b r2 = r8.iEndRecurrence
                r3 = 0
                int r5 = r2.mo29425c()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
                long r5 = r1.mo29426d(r9, r0, r5)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
                int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x0019
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x0019
            L_0x0018:
                r5 = r9
            L_0x0019:
                int r1 = r1.mo29425c()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002b }
                long r0 = r2.mo29426d(r9, r0, r1)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002b }
                int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r2 <= 0) goto L_0x002a
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r2 >= 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r9 = r0
            L_0x002b:
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x0030
                r5 = r9
            L_0x0030:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p014tz.DateTimeZoneBuilder.DSTZone.mo27815G(long):long");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r7 > 0) goto L_0x001b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo27816I(long r11) {
            /*
                r10 = this;
                r0 = 1
                long r11 = r11 + r0
                int r2 = r10.iStandardOffset
                org.joda.time.tz.DateTimeZoneBuilder$b r3 = r10.iStartRecurrence
                org.joda.time.tz.DateTimeZoneBuilder$b r4 = r10.iEndRecurrence
                r5 = 0
                int r7 = r4.mo29425c()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
                long r7 = r3.mo29427e(r11, r2, r7)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
                int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r9 >= 0) goto L_0x001c
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 <= 0) goto L_0x001c
            L_0x001b:
                r7 = r11
            L_0x001c:
                int r3 = r3.mo29425c()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002e }
                long r2 = r4.mo29427e(r11, r2, r3)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002e }
                int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r4 >= 0) goto L_0x002d
                int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r4 <= 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r11 = r2
            L_0x002e:
                int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r2 <= 0) goto L_0x0033
                goto L_0x0034
            L_0x0033:
                r7 = r11
            L_0x0034:
                long r7 = r7 - r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p014tz.DateTimeZoneBuilder.DSTZone.mo27816I(long):long");
        }

        /* renamed from: P */
        public final C12718b mo29409P(long j) {
            long j2;
            int i = this.iStandardOffset;
            C12718b bVar = this.iStartRecurrence;
            C12718b bVar2 = this.iEndRecurrence;
            try {
                j2 = bVar.mo29426d(j, i, bVar2.mo29425c());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                j2 = j;
            }
            try {
                j = bVar2.mo29426d(j, i, bVar.mo29425c());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (j2 > j) {
                return bVar;
            }
            return bVar2;
        }

        /* renamed from: R */
        public void mo29410R(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.m54639l(dataOutput, (long) this.iStandardOffset);
            this.iStartRecurrence.mo29431i(dataOutput);
            this.iEndRecurrence.mo29431i(dataOutput);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            if (!mo27824q().equals(dSTZone.mo27824q()) || this.iStandardOffset != dSTZone.iStandardOffset || !this.iStartRecurrence.equals(dSTZone.iStartRecurrence) || !this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                return false;
            }
            return true;
        }

        /* renamed from: u */
        public String mo27829u(long j) {
            return mo29409P(j).mo29423a();
        }

        /* renamed from: w */
        public int mo27830w(long j) {
            return this.iStandardOffset + mo29409P(j).mo29425c();
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone */
    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        public PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        /* renamed from: P */
        public static PrecalculatedZone m54658P(String str, boolean z, ArrayList<C12721e> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            DSTZone dSTZone3;
            String str2 = str;
            DSTZone dSTZone4 = dSTZone;
            int size = arrayList.size();
            if (size != 0) {
                long[] jArr = new long[size];
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                String[] strArr = new String[size];
                int i = 0;
                C12721e eVar = null;
                int i2 = 0;
                while (i2 < size) {
                    C12721e eVar2 = arrayList.get(i2);
                    if (eVar2.mo29455f(eVar)) {
                        jArr[i2] = eVar2.mo29450a();
                        iArr[i2] = eVar2.mo29454e();
                        iArr2[i2] = eVar2.mo29453d();
                        strArr[i2] = eVar2.mo29451b();
                        i2++;
                        eVar = eVar2;
                    } else {
                        throw new IllegalArgumentException(str2);
                    }
                }
                String[] strArr2 = new String[5];
                String[][] zoneStrings = new DateFormatSymbols(Locale.ENGLISH).getZoneStrings();
                for (String[] strArr3 : zoneStrings) {
                    if (strArr3 != null && strArr3.length == 5 && str2.equals(strArr3[0])) {
                        strArr2 = strArr3;
                    }
                }
                ISOChronology c0 = ISOChronology.m52935c0();
                while (i < size - 1) {
                    String str3 = strArr[i];
                    int i3 = i + 1;
                    String str4 = strArr[i3];
                    long j = (long) iArr[i];
                    long j2 = (long) iArr[i3];
                    String[] strArr4 = strArr;
                    String[] strArr5 = strArr2;
                    long j3 = (long) iArr2[i];
                    int[] iArr3 = iArr;
                    int[] iArr4 = iArr2;
                    long j4 = (long) iArr2[i3];
                    int i4 = size;
                    String str5 = str4;
                    Period period = new Period(jArr[i], jArr[i3], PeriodType.m52143E(), (C12589a) c0);
                    int i5 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i5 != 0 && j3 == j4 && str3.equals(str5) && period.mo28427g0() == 0 && period.mo28421b0() > 4 && period.mo28421b0() < 8 && str3.equals(strArr5[2]) && str3.equals(strArr5[4])) {
                        if (C12731f.m54754b()) {
                            System.out.println("Fixing duplicate name key - " + str5);
                            System.out.println("     - " + new DateTime(jArr[i], (C12589a) c0) + " - " + new DateTime(jArr[i3], (C12589a) c0));
                        }
                        if (i5 > 0) {
                            strArr4[i] = (str3 + "-Summer").intern();
                        } else if (i5 < 0) {
                            strArr4[i3] = (str5 + "-Summer").intern();
                            i = i3;
                        }
                    }
                    i++;
                    String str6 = str;
                    strArr2 = strArr5;
                    dSTZone4 = dSTZone;
                    strArr = strArr4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    size = i4;
                }
                DSTZone dSTZone5 = dSTZone4;
                int[] iArr5 = iArr;
                int[] iArr6 = iArr2;
                String[] strArr6 = strArr;
                if (dSTZone5 == null || !dSTZone5.iStartRecurrence.mo29423a().equals(dSTZone5.iEndRecurrence.mo29423a())) {
                    dSTZone2 = dSTZone5;
                } else {
                    if (C12731f.m54754b()) {
                        System.out.println("Fixing duplicate recurrent name key - " + dSTZone5.iStartRecurrence.mo29423a());
                    }
                    if (dSTZone5.iStartRecurrence.mo29425c() > 0) {
                        dSTZone3 = new DSTZone(dSTZone.mo27824q(), dSTZone5.iStandardOffset, dSTZone5.iStartRecurrence.mo29430h("-Summer"), dSTZone5.iEndRecurrence);
                    } else {
                        dSTZone3 = new DSTZone(dSTZone.mo27824q(), dSTZone5.iStandardOffset, dSTZone5.iStartRecurrence, dSTZone5.iEndRecurrence.mo29430h("-Summer"));
                    }
                    dSTZone2 = dSTZone3;
                }
                return new PrecalculatedZone(z ? str : "", jArr, iArr5, iArr6, strArr6, dSTZone2);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: R */
        public static PrecalculatedZone m54659R(DataInput dataInput, String str) throws IOException {
            DSTZone dSTZone;
            int i;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i2 = 0; i2 < readUnsignedShort; i2++) {
                strArr[i2] = dataInput.readUTF();
            }
            int readInt = dataInput.readInt();
            long[] jArr = new long[readInt];
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            String[] strArr2 = new String[readInt];
            for (int i3 = 0; i3 < readInt; i3++) {
                jArr[i3] = DateTimeZoneBuilder.m54638h(dataInput);
                iArr[i3] = (int) DateTimeZoneBuilder.m54638h(dataInput);
                iArr2[i3] = (int) DateTimeZoneBuilder.m54638h(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        i = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    i = dataInput.readUnsignedShort();
                }
                strArr2[i3] = strArr[i];
            }
            if (dataInput.readBoolean()) {
                dSTZone = DSTZone.m54649Q(dataInput, str);
            } else {
                dSTZone = null;
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dSTZone);
        }

        /* renamed from: C */
        public int mo27811C(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iStandardOffsets[binarySearch];
            }
            int i = ~binarySearch;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone == null) {
                    return this.iStandardOffsets[i - 1];
                }
                return dSTZone.mo27811C(j);
            } else if (i > 0) {
                return this.iStandardOffsets[i - 1];
            } else {
                return 0;
            }
        }

        /* renamed from: D */
        public boolean mo27812D() {
            return false;
        }

        /* renamed from: G */
        public long mo27815G(long j) {
            int i;
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                i = binarySearch + 1;
            } else {
                i = ~binarySearch;
            }
            if (i < jArr.length) {
                return jArr[i];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j;
            }
            long j2 = jArr[jArr.length - 1];
            if (j < j2) {
                j = j2;
            }
            return dSTZone.mo27815G(j);
        }

        /* renamed from: I */
        public long mo27816I(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch < 0) {
                int i = ~binarySearch;
                if (i < jArr.length) {
                    if (i > 0) {
                        long j2 = jArr[i - 1];
                        if (j2 > Long.MIN_VALUE) {
                            return j2 - 1;
                        }
                    }
                    return j;
                }
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone != null) {
                    long I = dSTZone.mo27816I(j);
                    if (I < j) {
                        return I;
                    }
                }
                long j3 = jArr[i - 1];
                if (j3 > Long.MIN_VALUE) {
                    return j3 - 1;
                }
                return j;
            } else if (j > Long.MIN_VALUE) {
                return j - 1;
            } else {
                return j;
            }
        }

        /* renamed from: Q */
        public boolean mo29411Q() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d = 0.0d;
            int i = 0;
            for (int i2 = 1; i2 < jArr.length; i2++) {
                long j = jArr[i2] - jArr[i2 - 1];
                if (j < 63158400000L) {
                    d += (double) j;
                    i++;
                }
            }
            if (i <= 0 || (d / ((double) i)) / 8.64E7d < 25.0d) {
                return false;
            }
            return true;
        }

        /* renamed from: S */
        public void mo29412S(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet<String> hashSet = new HashSet<>();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                hashSet.add(this.iNameKeys[i]);
            }
            int size = hashSet.size();
            if (size <= 65535) {
                String[] strArr = new String[size];
                int i2 = 0;
                for (String str : hashSet) {
                    strArr[i2] = str;
                    i2++;
                }
                dataOutput.writeShort(size);
                for (int i3 = 0; i3 < size; i3++) {
                    dataOutput.writeUTF(strArr[i3]);
                }
                dataOutput.writeInt(length);
                for (int i4 = 0; i4 < length; i4++) {
                    DateTimeZoneBuilder.m54639l(dataOutput, this.iTransitions[i4]);
                    DateTimeZoneBuilder.m54639l(dataOutput, (long) this.iWallOffsets[i4]);
                    DateTimeZoneBuilder.m54639l(dataOutput, (long) this.iStandardOffsets[i4]);
                    String str2 = this.iNameKeys[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        } else if (!strArr[i5].equals(str2)) {
                            i5++;
                        } else if (size < 256) {
                            dataOutput.writeByte(i5);
                        } else {
                            dataOutput.writeShort(i5);
                        }
                    }
                }
                if (this.iTailZone != null) {
                    z = true;
                }
                dataOutput.writeBoolean(z);
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone != null) {
                    dSTZone.mo29410R(dataOutput);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("String pool is too large");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (mo27824q().equals(precalculatedZone.mo27824q()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                if (dSTZone == null) {
                    if (dSTZone2 == null) {
                        return true;
                    }
                } else if (dSTZone.equals(dSTZone2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: u */
        public String mo27829u(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iNameKeys[binarySearch];
            }
            int i = ~binarySearch;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone == null) {
                    return this.iNameKeys[i - 1];
                }
                return dSTZone.mo27829u(j);
            } else if (i > 0) {
                return this.iNameKeys[i - 1];
            } else {
                return "UTC";
            }
        }

        /* renamed from: w */
        public int mo27830w(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iWallOffsets[binarySearch];
            }
            int i = ~binarySearch;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone == null) {
                    return this.iWallOffsets[i - 1];
                }
                return dSTZone.mo27830w(j);
            } else if (i > 0) {
                return this.iWallOffsets[i - 1];
            } else {
                return 0;
            }
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$a */
    public static final class C12717a {

        /* renamed from: a */
        public final char f31386a;

        /* renamed from: b */
        public final int f31387b;

        /* renamed from: c */
        public final int f31388c;

        /* renamed from: d */
        public final int f31389d;

        /* renamed from: e */
        public final boolean f31390e;

        /* renamed from: f */
        public final int f31391f;

        public C12717a(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c == 'u' || c == 'w' || c == 's') {
                this.f31386a = c;
                this.f31387b = i;
                this.f31388c = i2;
                this.f31389d = i3;
                this.f31390e = z;
                this.f31391f = i4;
                return;
            }
            throw new IllegalArgumentException("Unknown mode: " + c);
        }

        /* renamed from: c */
        public static C12717a m54668c(DataInput dataInput) throws IOException {
            return new C12717a((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.m54638h(dataInput));
        }

        /* renamed from: a */
        public long mo29413a(long j, int i, int i2) {
            char c = this.f31386a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            long j3 = j + j2;
            ISOChronology c0 = ISOChronology.m52935c0();
            long e = mo29416e(c0, c0.mo28659z().mo28822a(c0.mo28659z().mo28816S(c0.mo28619E().mo28816S(j3, this.f31387b), 0), Math.min(this.f31391f, DateTimeZone.f30652b)));
            if (this.f31389d != 0) {
                e = mo29419g(c0, e);
                if (e <= j3) {
                    e = mo29419g(c0, mo29416e(c0, c0.mo28619E().mo28816S(c0.mo28631S().mo28822a(e, 1), this.f31387b)));
                }
            } else if (e <= j3) {
                e = mo29416e(c0, c0.mo28631S().mo28822a(e, 1));
            }
            return c0.mo28659z().mo28822a(c0.mo28659z().mo28816S(e, 0), this.f31391f) - j2;
        }

        /* renamed from: b */
        public long mo29414b(long j, int i, int i2) {
            char c = this.f31386a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            long j3 = j + j2;
            ISOChronology c0 = ISOChronology.m52935c0();
            long f = mo29418f(c0, c0.mo28659z().mo28822a(c0.mo28659z().mo28816S(c0.mo28619E().mo28816S(j3, this.f31387b), 0), this.f31391f));
            if (this.f31389d != 0) {
                f = mo29419g(c0, f);
                if (f >= j3) {
                    f = mo29419g(c0, mo29418f(c0, c0.mo28619E().mo28816S(c0.mo28631S().mo28822a(f, -1), this.f31387b)));
                }
            } else if (f >= j3) {
                f = mo29418f(c0, c0.mo28631S().mo28822a(f, -1));
            }
            return c0.mo28659z().mo28822a(c0.mo28659z().mo28816S(f, 0), this.f31391f) - j2;
        }

        /* renamed from: d */
        public final long mo29415d(C12589a aVar, long j) {
            if (this.f31388c >= 0) {
                return aVar.mo28641g().mo28816S(j, this.f31388c);
            }
            return aVar.mo28641g().mo28822a(aVar.mo28619E().mo28822a(aVar.mo28641g().mo28816S(j, 1), 1), this.f31388c);
        }

        /* renamed from: e */
        public final long mo29416e(C12589a aVar, long j) {
            try {
                return mo29415d(aVar, j);
            } catch (IllegalArgumentException e) {
                if (this.f31387b == 2 && this.f31388c == 29) {
                    while (!aVar.mo28631S().mo28807J(j)) {
                        j = aVar.mo28631S().mo28822a(j, 1);
                    }
                    return mo29415d(aVar, j);
                }
                throw e;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12717a)) {
                return false;
            }
            C12717a aVar = (C12717a) obj;
            if (this.f31386a == aVar.f31386a && this.f31387b == aVar.f31387b && this.f31388c == aVar.f31388c && this.f31389d == aVar.f31389d && this.f31390e == aVar.f31390e && this.f31391f == aVar.f31391f) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final long mo29418f(C12589a aVar, long j) {
            try {
                return mo29415d(aVar, j);
            } catch (IllegalArgumentException e) {
                if (this.f31387b == 2 && this.f31388c == 29) {
                    while (!aVar.mo28631S().mo28807J(j)) {
                        j = aVar.mo28631S().mo28822a(j, -1);
                    }
                    return mo29415d(aVar, j);
                }
                throw e;
            }
        }

        /* renamed from: g */
        public final long mo29419g(C12589a aVar, long j) {
            int g = this.f31389d - aVar.mo28642h().mo28828g(j);
            if (g == 0) {
                return j;
            }
            if (this.f31390e) {
                if (g < 0) {
                    g += 7;
                }
            } else if (g > 0) {
                g -= 7;
            }
            return aVar.mo28642h().mo28822a(j, g);
        }

        /* renamed from: h */
        public long mo29420h(int i, int i2, int i3) {
            char c = this.f31386a;
            if (c == 'w') {
                i2 += i3;
            } else if (c != 's') {
                i2 = 0;
            }
            ISOChronology c0 = ISOChronology.m52935c0();
            long d = mo29415d(c0, c0.mo28659z().mo28816S(c0.mo28619E().mo28816S(c0.mo28631S().mo28816S(0, i), this.f31387b), this.f31391f));
            if (this.f31389d != 0) {
                d = mo29419g(c0, d);
            }
            return d - ((long) i2);
        }

        /* renamed from: i */
        public void mo29421i(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.f31386a);
            dataOutput.writeByte(this.f31387b);
            dataOutput.writeByte(this.f31388c);
            dataOutput.writeByte(this.f31389d);
            dataOutput.writeBoolean(this.f31390e);
            DateTimeZoneBuilder.m54639l(dataOutput, (long) this.f31391f);
        }

        public String toString() {
            return "[OfYear]\nMode: " + this.f31386a + 10 + "MonthOfYear: " + this.f31387b + 10 + "DayOfMonth: " + this.f31388c + 10 + "DayOfWeek: " + this.f31389d + 10 + "AdvanceDayOfWeek: " + this.f31390e + 10 + "MillisOfDay: " + this.f31391f + 10;
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$b */
    public static final class C12718b {

        /* renamed from: a */
        public final C12717a f31392a;

        /* renamed from: b */
        public final String f31393b;

        /* renamed from: c */
        public final int f31394c;

        public C12718b(C12717a aVar, String str, int i) {
            this.f31392a = aVar;
            this.f31393b = str;
            this.f31394c = i;
        }

        /* renamed from: f */
        public static C12718b m54677f(DataInput dataInput) throws IOException {
            return new C12718b(C12717a.m54668c(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.m54638h(dataInput));
        }

        /* renamed from: a */
        public String mo29423a() {
            return this.f31393b;
        }

        /* renamed from: b */
        public C12717a mo29424b() {
            return this.f31392a;
        }

        /* renamed from: c */
        public int mo29425c() {
            return this.f31394c;
        }

        /* renamed from: d */
        public long mo29426d(long j, int i, int i2) {
            return this.f31392a.mo29413a(j, i, i2);
        }

        /* renamed from: e */
        public long mo29427e(long j, int i, int i2) {
            return this.f31392a.mo29414b(j, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12718b)) {
                return false;
            }
            C12718b bVar = (C12718b) obj;
            if (this.f31394c != bVar.f31394c || !this.f31393b.equals(bVar.f31393b) || !this.f31392a.equals(bVar.f31392a)) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public C12718b mo29429g(String str) {
            return new C12718b(this.f31392a, str, this.f31394c);
        }

        /* renamed from: h */
        public C12718b mo29430h(String str) {
            return mo29429g((this.f31393b + str).intern());
        }

        /* renamed from: i */
        public void mo29431i(DataOutput dataOutput) throws IOException {
            this.f31392a.mo29421i(dataOutput);
            dataOutput.writeUTF(this.f31393b);
            DateTimeZoneBuilder.m54639l(dataOutput, (long) this.f31394c);
        }

        public String toString() {
            return this.f31392a + " named " + this.f31393b + " at " + this.f31394c;
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$c */
    public static final class C12719c {

        /* renamed from: a */
        public final C12718b f31395a;

        /* renamed from: b */
        public final int f31396b;

        /* renamed from: c */
        public final int f31397c;

        public C12719c(C12718b bVar, int i, int i2) {
            this.f31395a = bVar;
            this.f31396b = i;
            this.f31397c = i2;
        }

        /* renamed from: a */
        public int mo29433a() {
            return this.f31396b;
        }

        /* renamed from: b */
        public String mo29434b() {
            return this.f31395a.mo29423a();
        }

        /* renamed from: c */
        public C12717a mo29435c() {
            return this.f31395a.mo29424b();
        }

        /* renamed from: d */
        public int mo29436d() {
            return this.f31395a.mo29425c();
        }

        /* renamed from: e */
        public int mo29437e() {
            return this.f31397c;
        }

        /* renamed from: f */
        public long mo29438f(long j, int i, int i2) {
            int i3;
            long j2;
            ISOChronology c0 = ISOChronology.m52935c0();
            int i4 = i + i2;
            if (j == Long.MIN_VALUE) {
                i3 = Integer.MIN_VALUE;
            } else {
                i3 = c0.mo28631S().mo28828g(((long) i4) + j);
            }
            if (i3 < this.f31396b) {
                j2 = (c0.mo28631S().mo28816S(0, this.f31396b) - ((long) i4)) - 1;
            } else {
                j2 = j;
            }
            long d = this.f31395a.mo29426d(j2, i, i2);
            if (d <= j || c0.mo28631S().mo28828g(((long) i4) + d) <= this.f31397c) {
                return d;
            }
            return j;
        }

        public String toString() {
            return this.f31396b + " to " + this.f31397c + " using " + this.f31395a;
        }
    }

    /* renamed from: d */
    public static DateTimeZone m54635d(String str, String str2, int i, int i2) {
        if (!"UTC".equals(str) || !str.equals(str2) || i != 0 || i2 != 0) {
            return new FixedDateTimeZone(str, str2, i, i2);
        }
        return DateTimeZone.f30651a;
    }

    /* renamed from: f */
    public static DateTimeZone m54636f(DataInput dataInput, String str) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return CachedDateTimeZone.m54622Q(PrecalculatedZone.m54659R(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) m54638h(dataInput), (int) m54638h(dataInput));
            DateTimeZone dateTimeZone = DateTimeZone.f30651a;
            if (fixedDateTimeZone.equals(dateTimeZone)) {
                return dateTimeZone;
            }
            return fixedDateTimeZone;
        } else if (readUnsignedByte == 80) {
            return PrecalculatedZone.m54659R(dataInput, str);
        } else {
            throw new IOException("Invalid encoding");
        }
    }

    /* renamed from: g */
    public static DateTimeZone m54637g(InputStream inputStream, String str) throws IOException {
        if (inputStream instanceof DataInput) {
            return m54636f((DataInput) inputStream, str);
        }
        return m54636f(new DataInputStream(inputStream), str);
    }

    /* renamed from: h */
    public static long m54638h(DataInput dataInput) throws IOException {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = (long) (dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8));
            j = AirshipConfigOptions.f87111Y;
        } else if (i == 2) {
            readUnsignedByte = ((((long) readUnsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            readUnsignedByte = (long) ((readUnsignedByte2 << 26) >> 26);
            j = 1800000;
        }
        return readUnsignedByte * j;
    }

    /* renamed from: l */
    public static void m54639l(DataOutput dataOutput, long j) throws IOException {
        int i;
        if (j % 1800000 == 0) {
            long j2 = j / 1800000;
            if (((j2 << 58) >> 58) == j2) {
                dataOutput.writeByte((int) (j2 & 63));
                return;
            }
        }
        if (j % AirshipConfigOptions.f87111Y == 0) {
            long j3 = j / AirshipConfigOptions.f87111Y;
            if (((j3 << 34) >> 34) == j3) {
                dataOutput.writeInt(((int) (C12027x.f29644l & j3)) | 1073741824);
                return;
            }
        }
        if (j % 1000 == 0) {
            long j4 = j / 1000;
            if (((j4 << 26) >> 26) == j4) {
                dataOutput.writeByte(((int) ((j4 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) (-1 & j4));
                return;
            }
        }
        if (j < 0) {
            i = 255;
        } else {
            i = C14092c.f34560U;
        }
        dataOutput.writeByte(i);
        dataOutput.writeLong(j);
    }

    /* renamed from: a */
    public DateTimeZoneBuilder mo29400a(int i, char c, int i2, int i3, int i4, boolean z, int i5) {
        if (this.f31385a.size() > 0) {
            C12717a aVar = new C12717a(c, i2, i3, i4, z, i5);
            ArrayList<C12720d> arrayList = this.f31385a;
            arrayList.get(arrayList.size() - 1).mo29448i(i, aVar);
        }
        this.f31385a.add(new C12720d());
        return this;
    }

    /* renamed from: b */
    public DateTimeZoneBuilder mo29401b(String str, int i, int i2, int i3, char c, int i4, int i5, int i6, boolean z, int i7) {
        if (i2 <= i3) {
            String str2 = str;
            int i8 = i;
            mo29403e().mo29440a(new C12719c(new C12718b(new C12717a(c, i4, i5, i6, z, i7), str, i), i2, i3));
        }
        return this;
    }

    /* renamed from: c */
    public final boolean mo29402c(ArrayList<C12721e> arrayList, C12721e eVar) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(eVar);
            return true;
        }
        int i = size - 1;
        C12721e eVar2 = arrayList.get(i);
        int i2 = 0;
        if (!eVar.mo29455f(eVar2)) {
            return false;
        }
        if (size >= 2) {
            i2 = arrayList.get(size - 2).mo29454e();
        }
        if (eVar.mo29450a() + ((long) eVar2.mo29454e()) == eVar2.mo29450a() + ((long) i2)) {
            return mo29402c(arrayList, eVar.mo29456g(arrayList.remove(i).mo29450a()));
        }
        arrayList.add(eVar);
        return true;
    }

    /* renamed from: e */
    public final C12720d mo29403e() {
        if (this.f31385a.size() == 0) {
            mo29400a(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        ArrayList<C12720d> arrayList = this.f31385a;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: i */
    public DateTimeZoneBuilder mo29404i(String str, int i) {
        mo29403e().mo29446g(str, i);
        return this;
    }

    /* renamed from: j */
    public DateTimeZoneBuilder mo29405j(int i) {
        mo29403e().mo29447h(i);
        return this;
    }

    /* renamed from: k */
    public DateTimeZone mo29406k(String str, boolean z) {
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            int size = this.f31385a.size();
            DSTZone dSTZone = null;
            long j = Long.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                C12720d dVar = this.f31385a.get(i);
                C12721e c = dVar.mo29442c(j);
                if (c != null) {
                    mo29402c(arrayList, c);
                    long a = c.mo29450a();
                    int c2 = c.mo29452c();
                    C12720d dVar2 = new C12720d(dVar);
                    while (true) {
                        C12721e f = dVar2.mo29445f(a, c2);
                        if (f == null || (mo29402c(arrayList, f) && dSTZone != null)) {
                            j = dVar2.mo29444e(c2);
                        } else {
                            long a2 = f.mo29450a();
                            int c3 = f.mo29452c();
                            if (dSTZone == null && i == size - 1) {
                                dSTZone = dVar2.mo29441b(str);
                            }
                            c2 = c3;
                            a = a2;
                        }
                    }
                    j = dVar2.mo29444e(c2);
                }
            }
            if (arrayList.size() == 0) {
                if (dSTZone != null) {
                    return dSTZone;
                }
                return m54635d(str, "UTC", 0, 0);
            } else if (arrayList.size() == 1 && dSTZone == null) {
                C12721e eVar = (C12721e) arrayList.get(0);
                return m54635d(str, eVar.mo29451b(), eVar.mo29454e(), eVar.mo29453d());
            } else {
                PrecalculatedZone P = PrecalculatedZone.m54658P(str, z, arrayList, dSTZone);
                if (P.mo29411Q()) {
                    return CachedDateTimeZone.m54622Q(P);
                }
                return P;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: m */
    public void mo29407m(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone k = mo29406k(str, false);
        if (k instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(k.mo27829u(0));
            m54639l(dataOutput, (long) k.mo27830w(0));
            m54639l(dataOutput, (long) k.mo27811C(0));
            return;
        }
        if (k instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            k = ((CachedDateTimeZone) k).mo29396S();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) k).mo29412S(dataOutput);
    }

    /* renamed from: n */
    public void mo29408n(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            mo29407m(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        mo29407m(str, dataOutputStream);
        dataOutputStream.flush();
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$d */
    public static final class C12720d {

        /* renamed from: g */
        public static final int f31398g = (ISOChronology.m52935c0().mo28631S().mo28828g(C12641d.m53368c()) + 100);

        /* renamed from: a */
        public int f31399a;

        /* renamed from: b */
        public ArrayList<C12719c> f31400b;

        /* renamed from: c */
        public String f31401c;

        /* renamed from: d */
        public int f31402d;

        /* renamed from: e */
        public int f31403e;

        /* renamed from: f */
        public C12717a f31404f;

        public C12720d() {
            this.f31400b = new ArrayList<>(10);
            this.f31403e = Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public void mo29440a(C12719c cVar) {
            if (!this.f31400b.contains(cVar)) {
                this.f31400b.add(cVar);
            }
        }

        /* renamed from: b */
        public DSTZone mo29441b(String str) {
            if (this.f31400b.size() != 2) {
                return null;
            }
            C12719c cVar = this.f31400b.get(0);
            C12719c cVar2 = this.f31400b.get(1);
            if (cVar.mo29437e() == Integer.MAX_VALUE && cVar2.mo29437e() == Integer.MAX_VALUE) {
                return new DSTZone(str, this.f31399a, cVar.f31395a, cVar2.f31395a);
            }
            return null;
        }

        /* renamed from: c */
        public C12721e mo29442c(long j) {
            String str = this.f31401c;
            if (str != null) {
                int i = this.f31399a;
                return new C12721e(j, str, i + this.f31402d, i);
            }
            ArrayList<C12719c> arrayList = new ArrayList<>(this.f31400b);
            long j2 = Long.MIN_VALUE;
            int i2 = 0;
            C12721e eVar = null;
            while (true) {
                C12721e f = mo29445f(j2, i2);
                if (f == null) {
                    break;
                }
                long a = f.mo29450a();
                int i3 = (a > j ? 1 : (a == j ? 0 : -1));
                if (i3 == 0) {
                    eVar = new C12721e(j, f);
                    break;
                } else if (i3 > 0) {
                    if (eVar == null) {
                        Iterator<C12719c> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C12719c next = it.next();
                            if (next.mo29436d() == 0) {
                                eVar = new C12721e(j, next, this.f31399a);
                                break;
                            }
                        }
                    }
                    if (eVar == null) {
                        String b = f.mo29451b();
                        int i4 = this.f31399a;
                        eVar = new C12721e(j, b, i4, i4);
                    }
                } else {
                    eVar = new C12721e(j, f);
                    i2 = f.mo29452c();
                    j2 = a;
                }
            }
            this.f31400b = arrayList;
            return eVar;
        }

        /* renamed from: d */
        public int mo29443d() {
            return this.f31399a;
        }

        /* renamed from: e */
        public long mo29444e(int i) {
            int i2 = this.f31403e;
            if (i2 == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.f31404f.mo29420h(i2, this.f31399a, i);
        }

        /* renamed from: f */
        public C12721e mo29445f(long j, int i) {
            ISOChronology c0 = ISOChronology.m52935c0();
            Iterator<C12719c> it = this.f31400b.iterator();
            long j2 = Long.MAX_VALUE;
            C12719c cVar = null;
            while (it.hasNext()) {
                C12719c next = it.next();
                long f = next.mo29438f(j, this.f31399a, i);
                if (f <= j) {
                    it.remove();
                } else if (f <= j2) {
                    cVar = next;
                    j2 = f;
                }
            }
            if (cVar == null || c0.mo28631S().mo28828g(j2) >= f31398g) {
                return null;
            }
            int i2 = this.f31403e;
            if (i2 >= Integer.MAX_VALUE || j2 < this.f31404f.mo29420h(i2, this.f31399a, i)) {
                return new C12721e(j2, cVar, this.f31399a);
            }
            return null;
        }

        /* renamed from: g */
        public void mo29446g(String str, int i) {
            this.f31401c = str;
            this.f31402d = i;
        }

        /* renamed from: h */
        public void mo29447h(int i) {
            this.f31399a = i;
        }

        /* renamed from: i */
        public void mo29448i(int i, C12717a aVar) {
            this.f31403e = i;
            this.f31404f = aVar;
        }

        public String toString() {
            return this.f31401c + " initial: " + this.f31402d + " std: " + this.f31399a + " upper: " + this.f31403e + " " + this.f31404f + " " + this.f31400b;
        }

        public C12720d(C12720d dVar) {
            this.f31399a = dVar.f31399a;
            this.f31400b = new ArrayList<>(dVar.f31400b);
            this.f31401c = dVar.f31401c;
            this.f31402d = dVar.f31402d;
            this.f31403e = dVar.f31403e;
            this.f31404f = dVar.f31404f;
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$e */
    public static final class C12721e {

        /* renamed from: a */
        public final long f31405a;

        /* renamed from: b */
        public final String f31406b;

        /* renamed from: c */
        public final int f31407c;

        /* renamed from: d */
        public final int f31408d;

        public C12721e(long j, C12721e eVar) {
            this.f31405a = j;
            this.f31406b = eVar.f31406b;
            this.f31407c = eVar.f31407c;
            this.f31408d = eVar.f31408d;
        }

        /* renamed from: a */
        public long mo29450a() {
            return this.f31405a;
        }

        /* renamed from: b */
        public String mo29451b() {
            return this.f31406b;
        }

        /* renamed from: c */
        public int mo29452c() {
            return this.f31407c - this.f31408d;
        }

        /* renamed from: d */
        public int mo29453d() {
            return this.f31408d;
        }

        /* renamed from: e */
        public int mo29454e() {
            return this.f31407c;
        }

        /* renamed from: f */
        public boolean mo29455f(C12721e eVar) {
            if (eVar == null) {
                return true;
            }
            if (this.f31405a <= eVar.f31405a || (this.f31407c == eVar.f31407c && this.f31408d == eVar.f31408d && this.f31406b.equals(eVar.f31406b))) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public C12721e mo29456g(long j) {
            return new C12721e(j, this.f31406b, this.f31407c, this.f31408d);
        }

        public String toString() {
            return new DateTime(this.f31405a, DateTimeZone.f30651a) + " " + this.f31408d + " " + this.f31407c;
        }

        public C12721e(long j, C12719c cVar, int i) {
            this.f31405a = j;
            this.f31406b = cVar.mo29434b();
            this.f31407c = cVar.mo29436d() + i;
            this.f31408d = i;
        }

        public C12721e(long j, String str, int i, int i2) {
            this.f31405a = j;
            this.f31406b = str;
            this.f31407c = i;
            this.f31408d = i2;
        }
    }
}
