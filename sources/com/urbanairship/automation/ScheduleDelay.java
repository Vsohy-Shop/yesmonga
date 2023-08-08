package com.urbanairship.automation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;

public class ScheduleDelay implements Parcelable, C9333e {
    @C0359n0
    public static final Parcelable.Creator<ScheduleDelay> CREATOR = new C8793a();

    /* renamed from: E0 */
    public static final int f23494E0 = 3;

    /* renamed from: X */
    public static final String f23495X = "cancellation_triggers";

    /* renamed from: Y */
    public static final int f23496Y = 1;

    /* renamed from: Z */
    public static final int f23497Z = 2;

    /* renamed from: f */
    public static final String f23498f = "seconds";

    /* renamed from: g */
    public static final String f23499g = "app_state";

    /* renamed from: v */
    public static final String f23500v = "any";

    /* renamed from: w */
    public static final String f23501w = "foreground";

    /* renamed from: x */
    public static final String f23502x = "background";

    /* renamed from: y */
    public static final String f23503y = "screen";

    /* renamed from: z */
    public static final String f23504z = "region_id";

    /* renamed from: a */
    public final long f23505a;

    /* renamed from: b */
    public final List<String> f23506b;

    /* renamed from: c */
    public final int f23507c;

    /* renamed from: d */
    public final String f23508d;

    /* renamed from: e */
    public final List<Trigger> f23509e;

    /* renamed from: com.urbanairship.automation.ScheduleDelay$a */
    public class C8793a implements Parcelable.Creator<ScheduleDelay> {
        /* renamed from: a */
        public ScheduleDelay createFromParcel(@C0359n0 Parcel parcel) {
            return new ScheduleDelay(parcel);
        }

        /* renamed from: b */
        public ScheduleDelay[] newArray(int i) {
            return new ScheduleDelay[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.automation.ScheduleDelay$b */
    public @interface C8794b {
    }

    /* renamed from: com.urbanairship.automation.ScheduleDelay$c */
    public static class C8795c {

        /* renamed from: a */
        public long f23510a;

        /* renamed from: b */
        public List<String> f23511b;

        /* renamed from: c */
        public int f23512c = 1;

        /* renamed from: d */
        public String f23513d = null;

        /* renamed from: e */
        public final List<Trigger> f23514e = new ArrayList();

        @C0359n0
        /* renamed from: f */
        public C8795c mo17271f(@C0359n0 Trigger trigger) {
            this.f23514e.add(trigger);
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public ScheduleDelay mo17272g() {
            if (((long) this.f23514e.size()) <= 10) {
                return new ScheduleDelay(this);
            }
            throw new IllegalArgumentException("No more than 10 cancellation triggers allowed.");
        }

        @C0359n0
        /* renamed from: h */
        public C8795c mo17273h(int i) {
            this.f23512c = i;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C8795c mo17274i(@C0363p0 String str) {
            this.f23513d = str;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C8795c mo17275j(@C0359n0 String str) {
            this.f23511b = Collections.singletonList(str);
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C8795c mo17276k(@C0359n0 C9322a aVar) {
            this.f23511b = new ArrayList();
            Iterator<JsonValue> it = aVar.iterator();
            while (it.hasNext()) {
                JsonValue next = it.next();
                if (next.mo18769l() != null) {
                    this.f23511b.add(next.mo18769l());
                }
            }
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C8795c mo17277l(@C0359n0 List<String> list) {
            this.f23511b = list;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C8795c mo17278m(long j) {
            this.f23510a = j;
            return this;
        }
    }

    public ScheduleDelay(@C0359n0 C8795c cVar) {
        this.f23505a = cVar.f23510a;
        this.f23506b = cVar.f23511b == null ? Collections.emptyList() : new ArrayList<>(cVar.f23511b);
        this.f23507c = cVar.f23512c;
        this.f23508d = cVar.f23513d;
        this.f23509e = cVar.f23514e;
    }

    @C0359n0
    /* renamed from: a */
    public static ScheduleDelay m32656a(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        C8795c m = m32657g().mo17278m(A.mo18801A(f23498f).mo18766i(0));
        String lowerCase = A.mo18801A(f23499g).mo18770m(f23500v).toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        int i = 2;
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1332194002:
                if (lowerCase.equals("background")) {
                    c = 0;
                    break;
                }
                break;
            case 96748:
                if (lowerCase.equals(f23500v)) {
                    c = 1;
                    break;
                }
                break;
            case 1984457027:
                if (lowerCase.equals("foreground")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = 3;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                break;
            default:
                throw new JsonException("Invalid app state: " + lowerCase);
        }
        m.mo17273h(i);
        if (A.mo18805e("screen")) {
            JsonValue A2 = A.mo18801A("screen");
            if (A2.mo18783y()) {
                m.mo17275j(A2.mo18750B());
            } else {
                m.mo17276k(A2.mo18784z());
            }
        }
        if (A.mo18805e("region_id")) {
            m.mo17274i(A.mo18801A("region_id").mo18750B());
        }
        Iterator<JsonValue> it = A.mo18801A(f23495X).mo18784z().iterator();
        while (it.hasNext()) {
            m.mo17271f(Trigger.m32681c(it.next()));
        }
        try {
            return m.mo17272g();
        } catch (IllegalArgumentException e) {
            throw new JsonException("Invalid schedule delay info", e);
        }
    }

    @C0359n0
    /* renamed from: g */
    public static C8795c m32657g() {
        return new C8795c();
    }

    /* renamed from: b */
    public int mo17256b() {
        return this.f23507c;
    }

    @C0359n0
    /* renamed from: c */
    public List<Trigger> mo17257c() {
        return this.f23509e;
    }

    @C0363p0
    /* renamed from: d */
    public String mo17258d() {
        return this.f23508d;
    }

    public int describeContents() {
        return 0;
    }

    @C0363p0
    /* renamed from: e */
    public List<String> mo17260e() {
        return this.f23506b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleDelay scheduleDelay = (ScheduleDelay) obj;
        if (this.f23505a != scheduleDelay.f23505a || this.f23507c != scheduleDelay.f23507c) {
            return false;
        }
        List<String> list = this.f23506b;
        if (list == null ? scheduleDelay.f23506b != null : !list.equals(scheduleDelay.f23506b)) {
            return false;
        }
        String str = this.f23508d;
        if (str == null ? scheduleDelay.f23508d == null : str.equals(scheduleDelay.f23508d)) {
            return this.f23509e.equals(scheduleDelay.f23509e);
        }
        return false;
    }

    /* renamed from: f */
    public long mo17262f() {
        return this.f23505a;
    }

    public int hashCode() {
        int i;
        long j = this.f23505a;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        List<String> list = this.f23506b;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (((i2 + i) * 31) + this.f23507c) * 31;
        String str = this.f23508d;
        if (str != null) {
            i3 = str.hashCode();
        }
        return ((i4 + i3) * 31) + this.f23509e.hashCode();
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        String str;
        int b = mo17256b();
        if (b == 1) {
            str = f23500v;
        } else if (b == 2) {
            str = "foreground";
        } else if (b != 3) {
            str = null;
        } else {
            str = "background";
        }
        return C9323b.m35017y().mo18821e(f23498f, mo17262f()).mo18823g(f23499g, str).mo18822f("screen", JsonValue.m34975U(mo17260e())).mo18823g("region_id", mo17258d()).mo18822f(f23495X, JsonValue.m34975U(mo17257c())).mo18817a().mo17264q();
    }

    @C0359n0
    public String toString() {
        return "ScheduleDelay{seconds=" + this.f23505a + ", screens=" + this.f23506b + ", appState=" + this.f23507c + ", regionId='" + this.f23508d + '\'' + ", cancellationTriggers=" + this.f23509e + C12361b.f30259j;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeLong(this.f23505a);
        parcel.writeList(this.f23506b);
        parcel.writeInt(this.f23507c);
        parcel.writeString(this.f23508d);
        parcel.writeTypedList(this.f23509e);
    }

    public ScheduleDelay(@C0359n0 Parcel parcel) {
        this.f23505a = parcel.readLong();
        ArrayList arrayList = new ArrayList();
        this.f23506b = arrayList;
        parcel.readList(arrayList, String.class.getClassLoader());
        int readInt = parcel.readInt();
        int i = 1;
        if (readInt != 1) {
            i = 2;
            if (readInt != 2) {
                i = 3;
                if (readInt != 3) {
                    throw new IllegalStateException("Invalid app state from parcel.");
                }
            }
        }
        this.f23507c = i;
        this.f23508d = parcel.readString();
        this.f23509e = parcel.createTypedArrayList(Trigger.CREATOR);
    }
}
