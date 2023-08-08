package com.urbanairship.automation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9329d;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;

public class Trigger implements Parcelable, C9333e {
    @C0359n0
    public static final Parcelable.Creator<Trigger> CREATOR = new C8796a();

    /* renamed from: E0 */
    public static final String f23515E0 = "version";

    /* renamed from: F0 */
    public static final int f23516F0 = 1;

    /* renamed from: G0 */
    public static final int f23517G0 = 2;

    /* renamed from: H0 */
    public static final int f23518H0 = 3;

    /* renamed from: I0 */
    public static final int f23519I0 = 4;

    /* renamed from: J0 */
    public static final int f23520J0 = 5;

    /* renamed from: K0 */
    public static final int f23521K0 = 6;

    /* renamed from: L0 */
    public static final int f23522L0 = 7;

    /* renamed from: M0 */
    public static final int f23523M0 = 8;

    /* renamed from: N0 */
    public static final int f23524N0 = 9;

    /* renamed from: O0 */
    public static final int f23525O0 = 10;

    /* renamed from: X */
    public static final String f23526X = "region_enter";

    /* renamed from: Y */
    public static final String f23527Y = "region_exit";

    /* renamed from: Z */
    public static final String f23528Z = "active_session";

    /* renamed from: d */
    public static final String f23529d = "goal";

    /* renamed from: e */
    public static final String f23530e = "type";

    /* renamed from: f */
    public static final String f23531f = "predicate";

    /* renamed from: g */
    public static final String f23532g = "custom_event_count";

    /* renamed from: v */
    public static final String f23533v = "custom_event_value";

    /* renamed from: w */
    public static final String f23534w = "foreground";

    /* renamed from: x */
    public static final String f23535x = "background";

    /* renamed from: y */
    public static final String f23536y = "app_init";

    /* renamed from: z */
    public static final String f23537z = "screen";

    /* renamed from: a */
    public final int f23538a;

    /* renamed from: b */
    public final double f23539b;

    /* renamed from: c */
    public final C9329d f23540c;

    /* renamed from: com.urbanairship.automation.Trigger$a */
    public class C8796a implements Parcelable.Creator<Trigger> {
        @C0359n0
        /* renamed from: a */
        public Trigger createFromParcel(@C0359n0 Parcel parcel) {
            return new Trigger(parcel);
        }

        @C0359n0
        /* renamed from: b */
        public Trigger[] newArray(int i) {
            return new Trigger[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.automation.Trigger$b */
    public @interface C8797b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Trigger(int i, double d, @C0363p0 C9329d dVar) {
        this.f23538a = i;
        this.f23539b = d;
        this.f23540c = dVar;
    }

    /* renamed from: a */
    public static int m32679a(@C0359n0 String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1566014583:
                if (str.equals(f23527Y)) {
                    c = 0;
                    break;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    c = 1;
                    break;
                }
                break;
            case -1302099507:
                if (str.equals(f23526X)) {
                    c = 2;
                    break;
                }
                break;
            case -907689876:
                if (str.equals("screen")) {
                    c = 3;
                    break;
                }
                break;
            case 351608024:
                if (str.equals("version")) {
                    c = 4;
                    break;
                }
                break;
            case 1167511662:
                if (str.equals(f23536y)) {
                    c = 5;
                    break;
                }
                break;
            case 1607242588:
                if (str.equals(f23532g)) {
                    c = 6;
                    break;
                }
                break;
            case 1624363966:
                if (str.equals(f23533v)) {
                    c = 7;
                    break;
                }
                break;
            case 1984457027:
                if (str.equals("foreground")) {
                    c = 8;
                    break;
                }
                break;
            case 2075869789:
                if (str.equals(f23528Z)) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 4;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 7;
            case 4:
                return 10;
            case 5:
                return 8;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 1;
            case 9:
                return 9;
            default:
                throw new IllegalArgumentException("Invalid trigger type: " + str);
        }
    }

    @C0359n0
    /* renamed from: b */
    public static String m32680b(int i) {
        switch (i) {
            case 1:
                return "foreground";
            case 2:
                return "background";
            case 3:
                return f23526X;
            case 4:
                return f23527Y;
            case 5:
                return f23532g;
            case 6:
                return f23533v;
            case 7:
                return "screen";
            case 8:
                return f23536y;
            case 9:
                return f23528Z;
            case 10:
                return "version";
            default:
                throw new IllegalArgumentException("Invalid trigger type: " + i);
        }
    }

    @C0359n0
    /* renamed from: c */
    public static Trigger m32681c(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9329d dVar;
        C9323b A = jsonValue.mo18749A();
        if (A.mo18805e("predicate")) {
            dVar = C9329d.m35055d(A.mo18801A("predicate"));
        } else {
            dVar = null;
        }
        double d = A.mo18801A("goal").mo18758d(-1.0d);
        if (d > 0.0d) {
            String lowerCase = A.mo18801A("type").mo18750B().toLowerCase(Locale.ROOT);
            try {
                return new Trigger(m32679a(lowerCase), d, dVar);
            } catch (IllegalArgumentException unused) {
                throw new JsonException("Invalid trigger type: " + lowerCase);
            }
        } else {
            throw new JsonException("Trigger goal must be defined and greater than 0.");
        }
    }

    /* renamed from: d */
    public double mo17279d() {
        return this.f23539b;
    }

    public int describeContents() {
        return 0;
    }

    @C0363p0
    /* renamed from: e */
    public C9329d mo17281e() {
        return this.f23540c;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Trigger trigger = (Trigger) obj;
        if (this.f23538a != trigger.f23538a || Double.compare(trigger.f23539b, this.f23539b) != 0) {
            return false;
        }
        C9329d dVar = this.f23540c;
        C9329d dVar2 = trigger.f23540c;
        if (dVar != null) {
            return dVar.equals(dVar2);
        }
        if (dVar2 == null) {
            return true;
        }
        return false;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public String mo17283f() {
        return m32680b(this.f23538a);
    }

    /* renamed from: g */
    public int mo17284g() {
        return this.f23538a;
    }

    public int hashCode() {
        int i;
        int i2 = this.f23538a;
        long doubleToLongBits = Double.doubleToLongBits(this.f23539b);
        int i3 = ((i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        C9329d dVar = this.f23540c;
        if (dVar != null) {
            i = dVar.hashCode();
        } else {
            i = 0;
        }
        return i3 + i;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g("type", m32680b(this.f23538a)).mo18819c("goal", this.f23539b).mo18822f("predicate", this.f23540c).mo18817a().mo17264q();
    }

    public String toString() {
        return "Trigger{type=" + m32680b(this.f23538a) + ", goal=" + this.f23539b + ", predicate=" + this.f23540c + C12361b.f30259j;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        JsonValue jsonValue;
        parcel.writeInt(this.f23538a);
        parcel.writeDouble(this.f23539b);
        C9329d dVar = this.f23540c;
        if (dVar == null) {
            jsonValue = null;
        } else {
            jsonValue = dVar.mo17264q();
        }
        parcel.writeParcelable(jsonValue, i);
    }

    public Trigger(@C0359n0 Parcel parcel) {
        int i;
        C9329d dVar;
        switch (parcel.readInt()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            default:
                throw new IllegalStateException("Invalid trigger type from parcel.");
        }
        double readDouble = parcel.readDouble();
        JsonValue jsonValue = (JsonValue) parcel.readParcelable(JsonValue.class.getClassLoader());
        if (jsonValue != null) {
            try {
                dVar = C9329d.m35055d(jsonValue);
            } catch (JsonException e) {
                throw new IllegalStateException("Invalid trigger predicate from parcel.", e);
            }
        } else {
            dVar = null;
        }
        this.f23538a = i;
        this.f23539b = readDouble;
        this.f23540c = dVar;
    }
}
