package com.urbanairship.automation;

import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import com.urbanairship.automation.C8800a0;
import com.urbanairship.automation.actions.C8801a;
import com.urbanairship.automation.deferred.C8829a;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.urbanairship.automation.y */
public final class C8996y<T extends C8800a0> {
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: r */
    public static final String f24156r = "in_app_message";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: s */
    public static final String f24157s = "actions";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: t */
    public static final String f24158t = "deferred";

    /* renamed from: u */
    public static final long f24159u = 10;

    /* renamed from: a */
    public final String f24160a;

    /* renamed from: b */
    public final C9323b f24161b;

    /* renamed from: c */
    public final int f24162c;

    /* renamed from: d */
    public final long f24163d;

    /* renamed from: e */
    public final long f24164e;

    /* renamed from: f */
    public final List<Trigger> f24165f;

    /* renamed from: g */
    public final ScheduleDelay f24166g;

    /* renamed from: h */
    public final int f24167h;

    /* renamed from: i */
    public final long f24168i;

    /* renamed from: j */
    public final long f24169j;

    /* renamed from: k */
    public final String f24170k;

    /* renamed from: l */
    public final C8814b f24171l;

    /* renamed from: m */
    public final JsonValue f24172m;

    /* renamed from: n */
    public final JsonValue f24173n;

    /* renamed from: o */
    public final List<String> f24174o;

    /* renamed from: p */
    public final String f24175p;

    /* renamed from: q */
    public final T f24176q;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.automation.y$c */
    public @interface C8999c {
    }

    @C0359n0
    /* renamed from: K */
    public static <T extends C8800a0> C8998b<T> m33415K(@C0359n0 C8996y<T> yVar) {
        return new C8998b<>();
    }

    @C0359n0
    /* renamed from: L */
    public static C8998b<C8801a> m33416L(@C0359n0 C8801a aVar) {
        return new C8998b<>("actions", aVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: M */
    public static C8998b<C8829a> m33417M(C8829a aVar) {
        return new C8998b<>("deferred", aVar);
    }

    @C0359n0
    /* renamed from: N */
    public static C8998b<InAppMessage> m33418N(@C0359n0 InAppMessage inAppMessage) {
        return new C8998b<>("in_app_message", inAppMessage);
    }

    @C0363p0
    /* renamed from: A */
    public String mo17732A() {
        return this.f24170k;
    }

    @C0359n0
    /* renamed from: B */
    public String mo17733B() {
        return this.f24160a;
    }

    /* renamed from: C */
    public long mo17734C() {
        return this.f24169j;
    }

    /* renamed from: D */
    public int mo17735D() {
        return this.f24162c;
    }

    @C0359n0
    /* renamed from: E */
    public C9323b mo17736E() {
        return this.f24161b;
    }

    /* renamed from: F */
    public int mo17737F() {
        return this.f24167h;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: G */
    public JsonValue mo17738G() {
        return this.f24173n;
    }

    /* renamed from: H */
    public long mo17739H() {
        return this.f24163d;
    }

    @C0359n0
    /* renamed from: I */
    public List<Trigger> mo17740I() {
        return this.f24165f;
    }

    /* renamed from: J */
    public String mo17741J() {
        return this.f24175p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8996y.class != obj.getClass()) {
            return false;
        }
        C8996y yVar = (C8996y) obj;
        if (this.f24162c != yVar.f24162c || this.f24163d != yVar.f24163d || this.f24164e != yVar.f24164e || this.f24167h != yVar.f24167h || this.f24168i != yVar.f24168i || this.f24169j != yVar.f24169j || !this.f24160a.equals(yVar.f24160a)) {
            return false;
        }
        C9323b bVar = this.f24161b;
        if (bVar == null ? yVar.f24161b != null : !bVar.equals(yVar.f24161b)) {
            return false;
        }
        if (!this.f24165f.equals(yVar.f24165f)) {
            return false;
        }
        ScheduleDelay scheduleDelay = this.f24166g;
        if (scheduleDelay == null ? yVar.f24166g != null : !scheduleDelay.equals(yVar.f24166g)) {
            return false;
        }
        String str = this.f24170k;
        if (str == null ? yVar.f24170k != null : !str.equals(yVar.f24170k)) {
            return false;
        }
        C8814b bVar2 = this.f24171l;
        if (bVar2 == null ? yVar.f24171l != null : !bVar2.equals(yVar.f24171l)) {
            return false;
        }
        JsonValue jsonValue = this.f24172m;
        if (jsonValue == null ? yVar.f24172m != null : !jsonValue.equals(yVar.f24172m)) {
            return false;
        }
        if (!C17992m.m81740a(this.f24173n, yVar.f24173n)) {
            return false;
        }
        List<String> list = this.f24174o;
        if (list == null ? yVar.f24174o != null : !list.equals(yVar.f24174o)) {
            return false;
        }
        if (!this.f24175p.equals(yVar.f24175p)) {
            return false;
        }
        return this.f24176q.equals(yVar.f24176q);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = this.f24160a.hashCode() * 31;
        C9323b bVar = this.f24161b;
        int i6 = 0;
        if (bVar != null) {
            i = bVar.hashCode();
        } else {
            i = 0;
        }
        long j = this.f24163d;
        long j2 = this.f24164e;
        int hashCode2 = (((((((((hashCode + i) * 31) + this.f24162c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f24165f.hashCode()) * 31;
        ScheduleDelay scheduleDelay = this.f24166g;
        if (scheduleDelay != null) {
            i2 = scheduleDelay.hashCode();
        } else {
            i2 = 0;
        }
        long j3 = this.f24168i;
        long j4 = this.f24169j;
        int i7 = (((((((hashCode2 + i2) * 31) + this.f24167h) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        String str = this.f24170k;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        C8814b bVar2 = this.f24171l;
        if (bVar2 != null) {
            i4 = bVar2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        JsonValue jsonValue = this.f24172m;
        if (jsonValue != null) {
            i5 = jsonValue.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        List<String> list = this.f24174o;
        if (list != null) {
            i6 = list.hashCode();
        }
        return ((((((i10 + i6) * 31) + this.f24175p.hashCode()) * 31) + this.f24176q.hashCode()) * 31) + this.f24173n.hashCode();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public <S extends C8800a0> S mo17744r() {
        try {
            return this.f24176q;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Unexpected data", e);
        }
    }

    @C0363p0
    /* renamed from: s */
    public C8814b mo17745s() {
        return this.f24171l;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: t */
    public JsonValue mo17746t() {
        return this.f24172m;
    }

    @C0359n0
    public String toString() {
        return "Schedule{id='" + this.f24160a + '\'' + ", metadata=" + this.f24161b + ", limit=" + this.f24162c + ", start=" + this.f24163d + ", end=" + this.f24164e + ", triggers=" + this.f24165f + ", delay=" + this.f24166g + ", priority=" + this.f24167h + ", editGracePeriod=" + this.f24168i + ", interval=" + this.f24169j + ", group='" + this.f24170k + '\'' + ", audience=" + this.f24171l + ", type='" + this.f24175p + '\'' + ", data=" + this.f24176q + ", campaigns=" + this.f24172m + ", reportingContext=" + this.f24173n + ", frequencyConstraintIds=" + this.f24174o + C12361b.f30259j;
    }

    /* renamed from: u */
    public T mo17748u() {
        return this.f24176q;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public JsonValue mo17749v() {
        return this.f24176q.mo17264q();
    }

    @C0363p0
    /* renamed from: w */
    public ScheduleDelay mo17750w() {
        return this.f24166g;
    }

    /* renamed from: x */
    public long mo17751x() {
        return this.f24168i;
    }

    /* renamed from: y */
    public long mo17752y() {
        return this.f24164e;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: z */
    public List<String> mo17753z() {
        return this.f24174o;
    }

    /* renamed from: com.urbanairship.automation.y$b */
    public static class C8998b<T extends C8800a0> {

        /* renamed from: a */
        public int f24177a;

        /* renamed from: b */
        public long f24178b;

        /* renamed from: c */
        public long f24179c;

        /* renamed from: d */
        public final List<Trigger> f24180d;

        /* renamed from: e */
        public ScheduleDelay f24181e;

        /* renamed from: f */
        public int f24182f;

        /* renamed from: g */
        public long f24183g;

        /* renamed from: h */
        public long f24184h;

        /* renamed from: i */
        public T f24185i;

        /* renamed from: j */
        public String f24186j;

        /* renamed from: k */
        public String f24187k;

        /* renamed from: l */
        public C9323b f24188l;

        /* renamed from: m */
        public String f24189m;

        /* renamed from: n */
        public C8814b f24190n;

        /* renamed from: o */
        public JsonValue f24191o;

        /* renamed from: p */
        public JsonValue f24192p;

        /* renamed from: q */
        public List<String> f24193q;

        @C0359n0
        /* renamed from: A */
        public C8998b<T> mo17754A(@C0363p0 String str) {
            this.f24187k = str;
            return this;
        }

        @C0359n0
        /* renamed from: B */
        public C8998b<T> mo17755B(@C0359n0 String str) {
            this.f24189m = str;
            return this;
        }

        @C0359n0
        /* renamed from: C */
        public C8998b<T> mo17756C(@C0337f0(from = 0) long j, @C0359n0 TimeUnit timeUnit) {
            this.f24184h = timeUnit.toMillis(j);
            return this;
        }

        @C0359n0
        /* renamed from: D */
        public C8998b<T> mo17757D(int i) {
            this.f24177a = i;
            return this;
        }

        @C0359n0
        /* renamed from: E */
        public C8998b<T> mo17758E(@C0359n0 C9323b bVar) {
            this.f24188l = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: F */
        public C8998b<T> mo17759F(int i) {
            this.f24182f = i;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: G */
        public C8998b<T> mo17760G(@C0363p0 JsonValue jsonValue) {
            this.f24192p = jsonValue;
            return this;
        }

        @C0359n0
        /* renamed from: H */
        public C8998b<T> mo17761H(long j) {
            this.f24178b = j;
            return this;
        }

        @C0359n0
        /* renamed from: I */
        public C8998b<T> mo17762I(@C0363p0 List<Trigger> list) {
            this.f24180d.clear();
            if (list != null) {
                this.f24180d.addAll(list);
            }
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C8998b<T> mo17763r(@C0359n0 Trigger trigger) {
            this.f24180d.add(trigger);
            return this;
        }

        @C0359n0
        /* renamed from: s */
        public C8998b<T> mo17764s(@C0359n0 List<Trigger> list) {
            this.f24180d.addAll(list);
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        @androidx.annotation.C0359n0
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.urbanairship.automation.C8996y<T> mo17765t() {
            /*
                r9 = this;
                T r0 = r9.f24185i
                java.lang.String r1 = "Missing data."
                com.urbanairship.util.C9654i.m36166b(r0, r1)
                java.lang.String r0 = r9.f24186j
                java.lang.String r1 = "Missing type."
                com.urbanairship.util.C9654i.m36166b(r0, r1)
                long r0 = r9.f24178b
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r5 = 0
                r6 = 1
                if (r4 < 0) goto L_0x0025
                long r7 = r9.f24179c
                int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r2 < 0) goto L_0x0025
                int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r0 > 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                r0 = r5
                goto L_0x0026
            L_0x0025:
                r0 = r6
            L_0x0026:
                java.lang.String r1 = "End must be on or after start."
                com.urbanairship.util.C9654i.m36165a(r0, r1)
                java.util.List<com.urbanairship.automation.Trigger> r0 = r9.f24180d
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x0035
                r0 = r6
                goto L_0x0036
            L_0x0035:
                r0 = r5
            L_0x0036:
                java.lang.String r1 = "Must contain at least 1 trigger."
                com.urbanairship.util.C9654i.m36165a(r0, r1)
                java.util.List<com.urbanairship.automation.Trigger> r0 = r9.f24180d
                int r0 = r0.size()
                long r0 = (long) r0
                r2 = 10
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 > 0) goto L_0x0049
                r5 = r6
            L_0x0049:
                java.lang.String r0 = "No more than 10 triggers allowed."
                com.urbanairship.util.C9654i.m36165a(r5, r0)
                com.urbanairship.automation.y r0 = new com.urbanairship.automation.y
                r1 = 0
                r0.<init>(r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.C8996y.C8998b.mo17765t():com.urbanairship.automation.y");
        }

        @C0359n0
        /* renamed from: u */
        public C8998b<T> mo17766u(@C0363p0 C8814b bVar) {
            this.f24190n = bVar;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: v */
        public C8998b<T> mo17767v(@C0363p0 JsonValue jsonValue) {
            this.f24191o = jsonValue;
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C8998b<T> mo17768w(@C0363p0 ScheduleDelay scheduleDelay) {
            this.f24181e = scheduleDelay;
            return this;
        }

        @C0359n0
        /* renamed from: x */
        public C8998b<T> mo17769x(@C0337f0(from = 0) long j, @C0359n0 TimeUnit timeUnit) {
            this.f24183g = timeUnit.toMillis(j);
            return this;
        }

        @C0359n0
        /* renamed from: y */
        public C8998b<T> mo17770y(long j) {
            this.f24179c = j;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: z */
        public C8998b<T> mo17771z(@C0363p0 List<String> list) {
            this.f24193q = list;
            return this;
        }

        public C8998b(@C0359n0 C8996y<T> yVar) {
            this.f24177a = 1;
            this.f24178b = -1;
            this.f24179c = -1;
            ArrayList arrayList = new ArrayList();
            this.f24180d = arrayList;
            this.f24189m = yVar.f24160a;
            this.f24188l = yVar.f24161b == null ? C9323b.f25440b : yVar.f24161b;
            this.f24177a = yVar.f24162c;
            this.f24178b = yVar.f24163d;
            this.f24179c = yVar.f24164e;
            arrayList.addAll(yVar.f24165f);
            this.f24181e = yVar.f24166g;
            this.f24185i = yVar.f24176q;
            this.f24186j = yVar.f24175p;
            this.f24182f = yVar.f24167h;
            this.f24183g = yVar.f24168i;
            this.f24184h = yVar.f24169j;
            this.f24190n = yVar.f24171l;
            this.f24187k = yVar.f24170k;
            this.f24191o = yVar.f24172m;
            this.f24193q = yVar.f24174o;
            this.f24192p = yVar.f24173n;
        }

        public C8998b(@C0359n0 String str, @C0359n0 T t) {
            this.f24177a = 1;
            this.f24178b = -1;
            this.f24179c = -1;
            this.f24180d = new ArrayList();
            this.f24186j = str;
            this.f24185i = t;
        }
    }

    public C8996y(@C0359n0 C8998b<T> bVar) {
        this.f24160a = bVar.f24189m == null ? UUID.randomUUID().toString() : bVar.f24189m;
        this.f24161b = bVar.f24188l == null ? C9323b.f25440b : bVar.f24188l;
        this.f24162c = bVar.f24177a;
        this.f24163d = bVar.f24178b;
        this.f24164e = bVar.f24179c;
        this.f24165f = Collections.unmodifiableList(bVar.f24180d);
        this.f24166g = bVar.f24181e == null ? ScheduleDelay.m32657g().mo17272g() : bVar.f24181e;
        this.f24167h = bVar.f24182f;
        this.f24168i = bVar.f24183g;
        this.f24169j = bVar.f24184h;
        this.f24176q = bVar.f24185i;
        this.f24175p = bVar.f24186j;
        this.f24170k = bVar.f24187k;
        this.f24171l = bVar.f24190n;
        this.f24172m = bVar.f24191o == null ? JsonValue.f25436b : bVar.f24191o;
        this.f24173n = bVar.f24192p == null ? JsonValue.f25436b : bVar.f24192p;
        this.f24174o = bVar.f24193q == null ? Collections.emptyList() : Collections.unmodifiableList(bVar.f24193q);
    }
}
