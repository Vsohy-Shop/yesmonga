package androidx.window.core;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class Version implements Comparable<Version> {
    @C12579k

    /* renamed from: f */
    public static final C20990a f54142f = new C20990a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final Version f54143g = new Version(0, 0, 0, "");
    @C12579k

    /* renamed from: v */
    public static final Version f54144v = new Version(0, 1, 0, "");
    @C12579k

    /* renamed from: w */
    public static final Version f54145w;
    @C12579k

    /* renamed from: x */
    public static final Version f54146x;
    @C12579k

    /* renamed from: y */
    public static final String f54147y = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* renamed from: a */
    public final int f54148a;

    /* renamed from: b */
    public final int f54149b;

    /* renamed from: c */
    public final int f54150c;
    @C12579k

    /* renamed from: d */
    public final String f54151d;
    @C12579k

    /* renamed from: e */
    public final C11677z f54152e;

    /* renamed from: androidx.window.core.Version$a */
    public static final class C20990a {
        public /* synthetic */ C20990a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final Version mo62757a() {
            return Version.f54146x;
        }

        @C12579k
        /* renamed from: b */
        public final Version mo62758b() {
            return Version.f54143g;
        }

        @C12579k
        /* renamed from: c */
        public final Version mo62759c() {
            return Version.f54144v;
        }

        @C12579k
        /* renamed from: d */
        public final Version mo62760d() {
            return Version.f54145w;
        }

        @C12580l
        @C11384m
        /* renamed from: e */
        public final Version mo62761e(@C12580l String str) {
            Integer num;
            Integer num2;
            Integer num3;
            String str2;
            if (str == null || C11622t.isBlank(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile(Version.f54147y).matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            if (group == null) {
                num = null;
            } else {
                num = Integer.valueOf(Integer.parseInt(group));
            }
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            String group2 = matcher.group(2);
            if (group2 == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(Integer.parseInt(group2));
            }
            if (num2 == null) {
                return null;
            }
            int intValue2 = num2.intValue();
            String group3 = matcher.group(3);
            if (group3 == null) {
                num3 = null;
            } else {
                num3 = Integer.valueOf(Integer.parseInt(group3));
            }
            if (num3 == null) {
                return null;
            }
            int intValue3 = num3.intValue();
            if (matcher.group(4) != null) {
                str2 = matcher.group(4);
            } else {
                str2 = "";
            }
            String str3 = str2;
            Intrinsics.checkNotNullExpressionValue(str3, "description");
            return new Version(intValue, intValue2, intValue3, str3, (DefaultConstructorMarker) null);
        }

        public C20990a() {
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        f54145w = version;
        f54146x = version;
    }

    public /* synthetic */ Version(int i, int i2, int i3, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str);
    }

    @C12580l
    @C11384m
    /* renamed from: Z */
    public static final Version m97131Z(@C12580l String str) {
        return f54142f.mo62761e(str);
    }

    @C12579k
    /* renamed from: M */
    public final String mo62747M() {
        return this.f54151d;
    }

    /* renamed from: Q */
    public final int mo62748Q() {
        return this.f54148a;
    }

    /* renamed from: W */
    public final int mo62749W() {
        return this.f54149b;
    }

    /* renamed from: X */
    public final int mo62750X() {
        return this.f54150c;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        if (this.f54148a == version.f54148a && this.f54149b == version.f54149b && this.f54150c == version.f54150c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f54148a) * 31) + this.f54149b) * 31) + this.f54150c;
    }

    @C12579k
    public String toString() {
        String str;
        if (!C11622t.isBlank(this.f54151d)) {
            str = Intrinsics.stringPlus("-", this.f54151d);
        } else {
            str = "";
        }
        return this.f54148a + '.' + this.f54149b + '.' + this.f54150c + str;
    }

    /* renamed from: y */
    public int compareTo(@C12579k Version version) {
        Intrinsics.checkNotNullParameter(version, "other");
        return mo62756z().compareTo(version.mo62756z());
    }

    /* renamed from: z */
    public final BigInteger mo62756z() {
        Object value = this.f54152e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public Version(int i, int i2, int i3, String str) {
        this.f54148a = i;
        this.f54149b = i2;
        this.f54150c = i3;
        this.f54151d = str;
        this.f54152e = C10864b0.m38748c(new Version$bigInteger$2(this));
    }
}
