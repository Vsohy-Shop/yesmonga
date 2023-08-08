package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.C11076d0;
import kotlin.C11097g2;
import kotlin.C11665v0;
import org.jetbrains.annotations.C12579k;

@C11665v0(version = "1.6")
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo22516d2 = {"Lkotlin/time/DurationUnit;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "q", "()Ljava/util/concurrent/TimeUnit;", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "a", "b", "c", "d", "e", "f", "g", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11097g2(markerClass = {C11646k.class})
public enum DurationUnit {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    @C12579k
    private final TimeUnit timeUnit;

    /* access modifiers changed from: public */
    DurationUnit(TimeUnit timeUnit2) {
        this.timeUnit = timeUnit2;
    }

    @C12579k
    /* renamed from: q */
    public final TimeUnit mo23409q() {
        return this.timeUnit;
    }
}
