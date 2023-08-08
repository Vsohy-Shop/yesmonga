package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.C11097g2;
import kotlin.C11665v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.time.i */
public class C11641i {

    /* renamed from: kotlin.time.i$a */
    public /* synthetic */ class C11642a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.time.C11641i.C11642a.<clinit>():void");
        }
    }

    @C11665v0(version = "1.3")
    /* renamed from: a */
    public static final double m45653a(double d, @C12579k DurationUnit durationUnit, @C12579k DurationUnit durationUnit2) {
        Intrinsics.checkNotNullParameter(durationUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(durationUnit2, "targetUnit");
        long convert = durationUnit2.mo23409q().convert(1, durationUnit.mo23409q());
        if (convert > 0) {
            return d * ((double) convert);
        }
        return d / ((double) durationUnit.mo23409q().convert(1, durationUnit2.mo23409q()));
    }

    @C11665v0(version = "1.5")
    /* renamed from: b */
    public static final long m45654b(long j, @C12579k DurationUnit durationUnit, @C12579k DurationUnit durationUnit2) {
        Intrinsics.checkNotNullParameter(durationUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(durationUnit2, "targetUnit");
        return durationUnit2.mo23409q().convert(j, durationUnit.mo23409q());
    }

    @C11665v0(version = "1.5")
    /* renamed from: c */
    public static final long m45655c(long j, @C12579k DurationUnit durationUnit, @C12579k DurationUnit durationUnit2) {
        Intrinsics.checkNotNullParameter(durationUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(durationUnit2, "targetUnit");
        return durationUnit2.mo23409q().convert(j, durationUnit.mo23409q());
    }

    @C11097g2(markerClass = {C11646k.class})
    @C11665v0(version = "1.8")
    @C12579k
    /* renamed from: d */
    public static final DurationUnit m45656d(@C12579k TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "<this>");
        switch (C11642a.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                return DurationUnit.NANOSECONDS;
            case 2:
                return DurationUnit.MICROSECONDS;
            case 3:
                return DurationUnit.MILLISECONDS;
            case 4:
                return DurationUnit.SECONDS;
            case 5:
                return DurationUnit.MINUTES;
            case 6:
                return DurationUnit.HOURS;
            case 7:
                return DurationUnit.DAYS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @C11097g2(markerClass = {C11646k.class})
    @C11665v0(version = "1.8")
    @C12579k
    /* renamed from: e */
    public static final TimeUnit m45657e(@C12579k DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "<this>");
        return durationUnit.mo23409q();
    }
}
