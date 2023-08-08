package com.urbanairship.push;

import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.Calendar;
import java.util.Date;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.urbanairship.push.w */
public class C9545w implements C9333e {

    /* renamed from: e */
    public static final String f26129e = "start_hour";

    /* renamed from: f */
    public static final String f26130f = "start_min";

    /* renamed from: g */
    public static final String f26131g = "end_hour";

    /* renamed from: v */
    public static final String f26132v = "end_min";

    /* renamed from: w */
    public static final int f26133w = -1;

    /* renamed from: a */
    public final int f26134a;

    /* renamed from: b */
    public final int f26135b;

    /* renamed from: c */
    public final int f26136c;

    /* renamed from: d */
    public final int f26137d;

    /* renamed from: com.urbanairship.push.w$b */
    public static class C9547b {

        /* renamed from: a */
        public int f26138a = -1;

        /* renamed from: b */
        public int f26139b = -1;

        /* renamed from: c */
        public int f26140c = -1;

        /* renamed from: d */
        public int f26141d = -1;

        @C0359n0
        /* renamed from: e */
        public C9545w mo19450e() {
            return new C9545w(this);
        }

        @C0359n0
        /* renamed from: f */
        public C9547b mo19451f(@C0337f0(from = 0, mo995to = 23) int i) {
            this.f26140c = i;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C9547b mo19452g(@C0337f0(from = 0, mo995to = 59) int i) {
            this.f26141d = i;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9547b mo19453h(@C0359n0 Date date, @C0359n0 Date date2) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            this.f26138a = instance.get(11);
            this.f26139b = instance.get(12);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(date2);
            this.f26140c = instance2.get(11);
            this.f26141d = instance2.get(12);
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9547b mo19454i(@C0337f0(from = 0, mo995to = 23) int i) {
            this.f26138a = i;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C9547b mo19455j(@C0337f0(from = 0, mo995to = 59) int i) {
            this.f26139b = i;
            return this;
        }
    }

    /* renamed from: a */
    public static C9545w m35836a(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        if (!A.isEmpty()) {
            return new C9547b().mo19454i(A.mo18801A(f26129e).mo18762f(-1)).mo19455j(A.mo18801A(f26130f).mo18762f(-1)).mo19451f(A.mo18801A(f26131g).mo18762f(-1)).mo19452g(A.mo18801A(f26132v).mo18762f(-1)).mo19450e();
        }
        throw new JsonException("Invalid quiet time interval: " + jsonValue);
    }

    /* renamed from: d */
    public static C9547b m35837d() {
        return new C9547b();
    }

    @C0363p0
    /* renamed from: b */
    public Date[] mo19445b() {
        if (this.f26134a == -1 || this.f26135b == -1 || this.f26136c == -1 || this.f26137d == -1) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, this.f26134a);
        instance.set(12, this.f26135b);
        instance.set(13, 0);
        instance.set(14, 0);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, this.f26136c);
        instance2.set(12, this.f26137d);
        instance2.set(13, 0);
        instance2.set(14, 0);
        return new Date[]{instance.getTime(), instance2.getTime()};
    }

    /* renamed from: c */
    public boolean mo19446c(@C0359n0 Calendar calendar) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, this.f26134a);
        instance.set(12, this.f26135b);
        instance.set(13, 0);
        instance.set(14, 0);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, this.f26136c);
        instance2.set(12, this.f26137d);
        instance2.set(13, 0);
        instance2.set(14, 0);
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        if (calendar2.compareTo(instance) == 0 || calendar2.compareTo(instance2) == 0) {
            return true;
        }
        if (instance2.compareTo(instance) == 0) {
            return false;
        }
        if (instance2.after(instance)) {
            if (!calendar2.after(instance) || !calendar2.before(instance2)) {
                return false;
            }
            return true;
        } else if (calendar2.before(instance2) || calendar2.after(instance)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9545w wVar = (C9545w) obj;
        if (this.f26134a != wVar.f26134a || this.f26135b != wVar.f26135b || this.f26136c != wVar.f26136c) {
            return false;
        }
        if (this.f26137d == wVar.f26137d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f26134a * 31) + this.f26135b) * 31) + this.f26136c) * 31) + this.f26137d;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18820d(f26129e, this.f26134a).mo18820d(f26130f, this.f26135b).mo18820d(f26131g, this.f26136c).mo18820d(f26132v, this.f26137d).mo18817a().mo17264q();
    }

    @C0359n0
    public String toString() {
        return "QuietTimeInterval{startHour=" + this.f26134a + ", startMin=" + this.f26135b + ", endHour=" + this.f26136c + ", endMin=" + this.f26137d + C12361b.f30259j;
    }

    public C9545w(C9547b bVar) {
        this.f26134a = bVar.f26138a;
        this.f26135b = bVar.f26139b;
        this.f26136c = bVar.f26140c;
        this.f26137d = bVar.f26141d;
    }
}
