package com.urbanairship.automation;

import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.automation.C8800a0;
import com.urbanairship.automation.actions.C8801a;
import com.urbanairship.automation.deferred.C8829a;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.automation.c0 */
public class C8820c0<T extends C8800a0> {

    /* renamed from: a */
    public final Integer f23627a;

    /* renamed from: b */
    public final Long f23628b;

    /* renamed from: c */
    public final Long f23629c;

    /* renamed from: d */
    public final T f23630d;

    /* renamed from: e */
    public final Integer f23631e;

    /* renamed from: f */
    public final Long f23632f;

    /* renamed from: g */
    public final Long f23633g;

    /* renamed from: h */
    public final C9323b f23634h;

    /* renamed from: i */
    public final C8814b f23635i;

    /* renamed from: j */
    public final String f23636j;

    /* renamed from: k */
    public final JsonValue f23637k;

    /* renamed from: l */
    public final JsonValue f23638l;

    /* renamed from: m */
    public final List<String> f23639m;

    @C0359n0
    /* renamed from: A */
    public static <T extends C8800a0> C8822b<T> m32783A(@C0359n0 C8820c0<T> c0Var) {
        return new C8822b<>();
    }

    @C0359n0
    /* renamed from: B */
    public static C8822b<C8801a> m32784B(@C0359n0 C8801a aVar) {
        return new C8822b<>("actions", aVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: C */
    public static C8822b<C8829a> m32785C(@C0359n0 C8829a aVar) {
        return new C8822b<>("deferred", aVar);
    }

    @C0359n0
    /* renamed from: D */
    public static C8822b<InAppMessage> m32786D(@C0359n0 InAppMessage inAppMessage) {
        return new C8822b<>("in_app_message", inAppMessage);
    }

    @C0359n0
    /* renamed from: z */
    public static C8822b<?> m32799z() {
        return new C8822b<>();
    }

    @C0363p0
    /* renamed from: m */
    public C8814b mo17356m() {
        return this.f23635i;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public JsonValue mo17357n() {
        return this.f23637k;
    }

    @C0363p0
    /* renamed from: o */
    public T mo17358o() {
        return this.f23630d;
    }

    @C0363p0
    /* renamed from: p */
    public Long mo17359p() {
        return this.f23632f;
    }

    @C0363p0
    /* renamed from: q */
    public Long mo17360q() {
        return this.f23629c;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public List<String> mo17361r() {
        return this.f23639m;
    }

    @C0363p0
    /* renamed from: s */
    public Long mo17362s() {
        return this.f23633g;
    }

    @C0363p0
    /* renamed from: t */
    public Integer mo17363t() {
        return this.f23627a;
    }

    @C0363p0
    /* renamed from: u */
    public C9323b mo17364u() {
        return this.f23634h;
    }

    @C0363p0
    /* renamed from: v */
    public Integer mo17365v() {
        return this.f23631e;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w */
    public JsonValue mo17366w() {
        return this.f23638l;
    }

    @C0363p0
    /* renamed from: x */
    public Long mo17367x() {
        return this.f23628b;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public String mo17368y() {
        return this.f23636j;
    }

    public C8820c0(@C0359n0 C8822b<T> bVar) {
        this.f23627a = bVar.f23640a;
        this.f23628b = bVar.f23641b;
        this.f23629c = bVar.f23642c;
        this.f23630d = bVar.f23647h;
        this.f23636j = bVar.f23651l;
        this.f23631e = bVar.f23643d;
        this.f23633g = bVar.f23645f;
        this.f23632f = bVar.f23644e;
        this.f23634h = bVar.f23646g;
        this.f23635i = bVar.f23652m;
        this.f23639m = bVar.f23650k;
        this.f23637k = bVar.f23648i;
        this.f23638l = bVar.f23649j;
    }

    /* renamed from: com.urbanairship.automation.c0$b */
    public static class C8822b<T extends C8800a0> {

        /* renamed from: a */
        public Integer f23640a;

        /* renamed from: b */
        public Long f23641b;

        /* renamed from: c */
        public Long f23642c;

        /* renamed from: d */
        public Integer f23643d;

        /* renamed from: e */
        public Long f23644e;

        /* renamed from: f */
        public Long f23645f;

        /* renamed from: g */
        public C9323b f23646g;

        /* renamed from: h */
        public T f23647h;

        /* renamed from: i */
        public JsonValue f23648i;

        /* renamed from: j */
        public JsonValue f23649j;

        /* renamed from: k */
        public List<String> f23650k;

        /* renamed from: l */
        public String f23651l;

        /* renamed from: m */
        public C8814b f23652m;

        @C0359n0
        /* renamed from: n */
        public C8820c0<T> mo17369n() {
            return new C8820c0<>(this);
        }

        /* renamed from: o */
        public C8822b<T> mo17370o(@C0363p0 C8814b bVar) {
            this.f23652m = bVar;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: p */
        public C8822b<T> mo17371p(@C0363p0 JsonValue jsonValue) {
            this.f23648i = jsonValue;
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C8822b<T> mo17372q(@C0337f0(from = 0) long j, @C0359n0 TimeUnit timeUnit) {
            this.f23644e = Long.valueOf(timeUnit.toMillis(j));
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C8822b<T> mo17373r(long j) {
            this.f23642c = Long.valueOf(j);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: s */
        public C8822b<T> mo17374s(@C0363p0 List<String> list) {
            this.f23650k = list == null ? null : new ArrayList(list);
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C8822b<T> mo17375t(@C0337f0(from = 0) long j, @C0359n0 TimeUnit timeUnit) {
            this.f23645f = Long.valueOf(timeUnit.toMillis(j));
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C8822b<T> mo17376u(int i) {
            this.f23640a = Integer.valueOf(i);
            return this;
        }

        @C0359n0
        /* renamed from: v */
        public C8822b<T> mo17377v(@C0363p0 C9323b bVar) {
            this.f23646g = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C8822b<T> mo17378w(int i) {
            this.f23643d = Integer.valueOf(i);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: x */
        public C8822b<T> mo17379x(@C0363p0 JsonValue jsonValue) {
            this.f23649j = jsonValue;
            return this;
        }

        @C0359n0
        /* renamed from: y */
        public C8822b<T> mo17380y(long j) {
            this.f23641b = Long.valueOf(j);
            return this;
        }

        public C8822b() {
        }

        public C8822b(@C0359n0 String str, @C0359n0 T t) {
            this.f23651l = str;
            this.f23647h = t;
        }

        public C8822b(@C0359n0 C8820c0<T> c0Var) {
            this.f23640a = c0Var.f23627a;
            this.f23641b = c0Var.f23628b;
            this.f23642c = c0Var.f23629c;
            this.f23647h = c0Var.f23630d;
            this.f23643d = c0Var.f23631e;
            this.f23651l = c0Var.f23636j;
            this.f23644e = c0Var.f23632f;
            this.f23645f = c0Var.f23633g;
            this.f23646g = c0Var.f23634h;
            this.f23648i = c0Var.f23637k;
            this.f23650k = c0Var.f23639m;
            this.f23649j = c0Var.f23638l;
        }
    }
}
