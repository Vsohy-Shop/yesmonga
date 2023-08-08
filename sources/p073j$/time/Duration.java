package p073j$.time;

import androidx.compose.p004ui.graphics.vector.C15369g;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* renamed from: j$.time.Duration */
public final class Duration implements Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);

    /* renamed from: a */
    private final long f107714a;

    /* renamed from: b */
    private final int f107715b;

    static {
        BigInteger.valueOf(1000000000);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private Duration(long j, int i) {
        this.f107714a = j;
        this.f107715b = i;
    }

    /* renamed from: n */
    private static Duration m171788n(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    /* renamed from: o */
    public static Duration m171789o(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m171788n(j2, i);
    }

    public static Duration ofSeconds(long j, long j2) {
        return m171788n(Math.addExact(j, Math.floorDiv(j2, 1000000000)), (int) Math.floorMod(j2, 1000000000));
    }

    /* renamed from: q */
    public static Duration m171790q(long j) {
        return m171788n(j, 0);
    }

    public int compareTo(Duration duration) {
        int compare = Long.compare(this.f107714a, duration.f107714a);
        return compare != 0 ? compare : this.f107715b - duration.f107715b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f107714a == duration.f107714a && this.f107715b == duration.f107715b;
    }

    public int getNano() {
        return this.f107715b;
    }

    public long getSeconds() {
        return this.f107714a;
    }

    public final int hashCode() {
        long j = this.f107714a;
        return (this.f107715b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public long toMillis() {
        return Math.addExact(Math.multiplyExact(this.f107714a, 1000), (long) (this.f107715b / 1000000));
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.f107714a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append(C15369g.f37982h);
        }
        if (i != 0) {
            sb.append(i);
            sb.append(C15369g.f37978d);
        }
        if (i2 == 0 && this.f107715b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.f107715b <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.f107715b > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - ((long) this.f107715b));
            } else {
                sb.append(((long) this.f107715b) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append(C15369g.f37988n);
        return sb.toString();
    }
}
