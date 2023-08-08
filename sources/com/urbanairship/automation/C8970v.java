package com.urbanairship.automation;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36045e;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.C36071u;
import com.urbanairship.UAirship;
import com.urbanairship.automation.C8820c0;
import com.urbanairship.automation.C8996y;
import com.urbanairship.automation.actions.C8801a;
import com.urbanairship.automation.deferred.C8829a;
import com.urbanairship.automation.limits.C8906b;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.reactive.C9588g;
import com.urbanairship.reactive.C9595j;
import com.urbanairship.reactive.C9596k;
import com.urbanairship.remotedata.C9619j;
import com.urbanairship.remotedata.C9625m;
import com.urbanairship.util.C9668o;
import com.urbanairship.util.C9669o0;
import com.urbanairship.util.C9674q0;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.automation.v */
public class C8970v {

    /* renamed from: A */
    public static final String f24082A = "message_id";

    /* renamed from: B */
    public static final String f24083B = "message";

    /* renamed from: C */
    public static final String f24084C = "deferred";

    /* renamed from: D */
    public static final String f24085D = "actions";

    /* renamed from: E */
    public static final String f24086E = "campaigns";

    /* renamed from: F */
    public static final String f24087F = "reporting_context";

    /* renamed from: G */
    public static final String f24088G = "frequency_constraint_ids";

    /* renamed from: H */
    public static final String f24089H = "com.urbanairship.iam.data.LAST_PAYLOAD_TIMESTAMP";

    /* renamed from: I */
    public static final String f24090I = "com.urbanairship.iam.data.LAST_PAYLOAD_METADATA";

    /* renamed from: J */
    public static final String f24091J = "com.urbanairship.iam.data.NEW_USER_TIME";

    /* renamed from: K */
    public static final String f24092K = "com.urbanairship.iaa.REMOTE_DATA_METADATA";

    /* renamed from: L */
    public static final String f24093L = "com.urbanairship.iaa.last_sdk_version";

    /* renamed from: M */
    public static final String f24094M = "min_sdk_version";

    /* renamed from: f */
    public static final String f24095f = "in_app_messages";

    /* renamed from: g */
    public static final String f24096g = "in_app_messages";

    /* renamed from: h */
    public static final String f24097h = "frequency_constraints";

    /* renamed from: i */
    public static final String f24098i = "period";

    /* renamed from: j */
    public static final String f24099j = "id";

    /* renamed from: k */
    public static final String f24100k = "range";

    /* renamed from: l */
    public static final String f24101l = "boundary";

    /* renamed from: m */
    public static final String f24102m = "created";

    /* renamed from: n */
    public static final String f24103n = "last_updated";

    /* renamed from: o */
    public static final String f24104o = "limit";

    /* renamed from: p */
    public static final String f24105p = "priority";

    /* renamed from: q */
    public static final String f24106q = "group";

    /* renamed from: r */
    public static final String f24107r = "end";

    /* renamed from: s */
    public static final String f24108s = "start";

    /* renamed from: t */
    public static final String f24109t = "delay";

    /* renamed from: u */
    public static final String f24110u = "triggers";

    /* renamed from: v */
    public static final String f24111v = "edit_grace_period";

    /* renamed from: w */
    public static final String f24112w = "interval";

    /* renamed from: x */
    public static final String f24113x = "audience";

    /* renamed from: y */
    public static final String f24114y = "type";

    /* renamed from: z */
    public static final String f24115z = "id";

    /* renamed from: a */
    public final C36071u f24116a;

    /* renamed from: b */
    public final C9619j f24117b;

    /* renamed from: c */
    public final List<C8974d> f24118c = new ArrayList();

    /* renamed from: d */
    public final String f24119d;

    /* renamed from: e */
    public final Looper f24120e;

    /* renamed from: com.urbanairship.automation.v$a */
    public class C8971a extends C9595j<C9625m> {

        /* renamed from: a */
        public final /* synthetic */ C8973c f24121a;

        public C8971a(C8973c cVar) {
            this.f24121a = cVar;
        }

        /* renamed from: d */
        public void mo17490c(@C0359n0 C9625m mVar) {
            try {
                C8970v.this.mo17720w(mVar, this.f24121a);
                C36059m.m148406b("Finished processing messages.", new Object[0]);
            } catch (Exception e) {
                C36059m.m148411g(e, "InAppRemoteDataObserver - Failed to process payload: ", new Object[0]);
            }
        }
    }

    /* renamed from: com.urbanairship.automation.v$b */
    public class C8972b implements C8974d {

        /* renamed from: a */
        public final /* synthetic */ Runnable f24123a;

        public C8972b(Runnable runnable) {
            this.f24123a = runnable;
        }

        /* renamed from: a */
        public void mo17725a() {
            C8970v.this.mo17721x(this);
            this.f24123a.run();
        }
    }

    /* renamed from: com.urbanairship.automation.v$c */
    public interface C8973c {
        @C0359n0
        /* renamed from: a */
        C36062p<Collection<C8996y<? extends C8800a0>>> mo17630a();

        @C0359n0
        /* renamed from: b */
        C36062p<Boolean> mo17631b(@C0359n0 String str, @C0359n0 C8820c0<? extends C8800a0> c0Var);

        @C0359n0
        /* renamed from: c */
        C36062p<Boolean> mo17632c(@C0359n0 List<C8996y<? extends C8800a0>> list);

        /* renamed from: d */
        Future<Boolean> mo17633d(@C0359n0 Collection<C8906b> collection);
    }

    /* renamed from: com.urbanairship.automation.v$d */
    public interface C8974d {
        /* renamed from: a */
        void mo17725a();
    }

    public C8970v(@C0359n0 C36071u uVar, @C0359n0 C9619j jVar) {
        this.f24116a = uVar;
        this.f24117b = jVar;
        this.f24119d = UAirship.m146181I();
        this.f24120e = C36045e.m148371a();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m33377m(Runnable runnable, Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            C36059m.m148406b("Failed to refresh remote-data.", new Object[0]);
        }
        if (mo17717l()) {
            runnable.run();
        } else {
            mo17709d(new C8972b(runnable));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ boolean m33378n(C9625m mVar) {
        if (mVar.mo19566d() != this.f24116a.mo107846i(f24089H, -1)) {
            return true;
        }
        return !mVar.mo19565c().equals(mo17712g());
    }

    @C0363p0
    /* renamed from: o */
    public static C8814b m33379o(@C0359n0 JsonValue jsonValue) throws JsonException {
        JsonValue k = jsonValue.mo18749A().mo18812k("audience");
        if (k == null) {
            k = jsonValue.mo18749A().mo18801A("message").mo18749A().mo18812k("audience");
        }
        if (k == null) {
            return null;
        }
        return C8814b.m32733a(k);
    }

    @C0359n0
    /* renamed from: q */
    public static List<String> m33380q(@C0359n0 C9322a aVar) throws JsonException {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonValue> it = aVar.iterator();
        while (it.hasNext()) {
            JsonValue next = it.next();
            if (next.mo18783y()) {
                arrayList.add(next.mo18750B());
            } else {
                throw new JsonException("Invalid constraint ID: " + next);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: s */
    public static C8820c0<? extends C8800a0> m33381s(@C0359n0 JsonValue jsonValue, @C0363p0 C9323b bVar) throws JsonException {
        C8820c0.C8822b bVar2;
        C9323b A = jsonValue.mo18749A();
        String m = A.mo18801A("type").mo18770m("in_app_message");
        m.hashCode();
        char c = 65535;
        switch (m.hashCode()) {
            case -1161803523:
                if (m.equals("actions")) {
                    c = 0;
                    break;
                }
                break;
            case -379237425:
                if (m.equals("in_app_message")) {
                    c = 1;
                    break;
                }
                break;
            case 647890911:
                if (m.equals("deferred")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C9323b j = A.mo18801A("actions").mo18767j();
                if (j != null) {
                    bVar2 = C8820c0.m32784B(new C8801a(j));
                    break;
                } else {
                    throw new JsonException("Missing actions payload");
                }
            case 1:
                bVar2 = C8820c0.m32786D(InAppMessage.m34088k(A.mo18801A("message"), InAppMessage.f24674L0));
                break;
            case 2:
                bVar2 = C8820c0.m32785C(C8829a.m32848a(A.mo18801A("deferred")));
                break;
            default:
                throw new JsonException("Unexpected schedule type: " + m);
        }
        bVar2.mo17377v(bVar).mo17376u(A.mo18801A("limit").mo18762f(1)).mo17378w(A.mo18801A("priority").mo18762f(0)).mo17372q(A.mo18801A(f24111v).mo18766i(0), TimeUnit.DAYS).mo17375t(A.mo18801A("interval").mo18766i(0), TimeUnit.SECONDS).mo17370o(m33379o(jsonValue)).mo17371p(A.mo18801A("campaigns")).mo17379x(A.mo18801A("reporting_context")).mo17380y(m33384v(A.mo18801A("start").mo18769l())).mo17373r(m33384v(A.mo18801A("end").mo18769l())).mo17374s(m33380q(A.mo18801A(f24088G).mo18784z()));
        return bVar2.mo17369n();
    }

    /* renamed from: t */
    public static C8996y<? extends C8800a0> m33382t(@C0359n0 String str, @C0359n0 JsonValue jsonValue, @C0359n0 C9323b bVar) throws JsonException {
        C8996y.C8998b bVar2;
        C9323b A = jsonValue.mo18749A();
        String m = A.mo18801A("type").mo18770m("in_app_message");
        m.hashCode();
        char c = 65535;
        switch (m.hashCode()) {
            case -1161803523:
                if (m.equals("actions")) {
                    c = 0;
                    break;
                }
                break;
            case -379237425:
                if (m.equals("in_app_message")) {
                    c = 1;
                    break;
                }
                break;
            case 647890911:
                if (m.equals("deferred")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C9323b j = A.mo18801A("actions").mo18767j();
                if (j != null) {
                    bVar2 = C8996y.m33416L(new C8801a(j));
                    break;
                } else {
                    throw new JsonException("Missing actions payload");
                }
            case 1:
                bVar2 = C8996y.m33418N(InAppMessage.m34088k(A.mo18801A("message"), InAppMessage.f24674L0));
                break;
            case 2:
                bVar2 = C8996y.m33417M(C8829a.m32848a(A.mo18801A("deferred")));
                break;
            default:
                throw new JsonException("Unexpected type: " + m);
        }
        bVar2.mo17755B(str).mo17758E(bVar).mo17754A(A.mo18801A("group").mo18769l()).mo17757D(A.mo18801A("limit").mo18762f(1)).mo17759F(A.mo18801A("priority").mo18762f(0)).mo17767v(A.mo18801A("campaigns")).mo17760G(A.mo18801A("reporting_context")).mo17766u(m33379o(jsonValue)).mo17769x(A.mo18801A(f24111v).mo18766i(0), TimeUnit.DAYS).mo17756C(A.mo18801A("interval").mo18766i(0), TimeUnit.SECONDS).mo17761H(m33384v(A.mo18801A("start").mo18769l())).mo17770y(m33384v(A.mo18801A("end").mo18769l())).mo17771z(m33380q(A.mo18801A(f24088G).mo18784z()));
        Iterator<JsonValue> it = A.mo18801A("triggers").mo18784z().iterator();
        while (it.hasNext()) {
            bVar2.mo17763r(Trigger.m32681c(it.next()));
        }
        if (A.mo18805e("delay")) {
            bVar2.mo17768w(ScheduleDelay.m32656a(A.mo18801A("delay")));
        }
        try {
            return bVar2.mo17765t();
        } catch (IllegalArgumentException e) {
            throw new JsonException("Invalid schedule", e);
        }
    }

    @C0363p0
    /* renamed from: u */
    public static String m33383u(JsonValue jsonValue) {
        String l = jsonValue.mo18749A().mo18801A("id").mo18769l();
        if (l == null) {
            return jsonValue.mo18749A().mo18801A("message").mo18749A().mo18801A("message_id").mo18769l();
        }
        return l;
    }

    /* renamed from: v */
    public static long m33384v(@C0363p0 String str) throws JsonException {
        if (str == null) {
            return -1;
        }
        try {
            return C9668o.m36218b(str);
        } catch (ParseException e) {
            throw new JsonException("Invalid timestamp: " + str, e);
        }
    }

    /* renamed from: A */
    public C9596k mo17708A(@C0359n0 C8973c cVar) {
        return this.f24117b.mo19552f0("in_app_messages").mo19463l(new C8969u(this)).mo19466t(C9588g.m35926a(this.f24120e)).mo19468v(C9588g.m35926a(this.f24120e)).mo19467u(new C8971a(cVar));
    }

    /* renamed from: d */
    public void mo17709d(C8974d dVar) {
        synchronized (this.f24118c) {
            this.f24118c.add(dVar);
        }
    }

    /* renamed from: e */
    public void mo17710e(boolean z, @C0359n0 Runnable runnable) {
        this.f24117b.mo19556j0(z).mo107826e(new C8957t(this, runnable));
    }

    @C0359n0
    /* renamed from: f */
    public final Set<String> mo17711f(@C0363p0 Collection<C8996y<? extends C8800a0>> collection) {
        if (collection == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C8996y next : collection) {
            if (mo17715j(next)) {
                hashSet.add(next.mo17733B());
            }
        }
        return hashSet;
    }

    /* renamed from: g */
    public final C9323b mo17712g() {
        return this.f24116a.mo107845h(f24090I).mo18749A();
    }

    /* renamed from: h */
    public long mo17713h() {
        return this.f24116a.mo107846i(f24091J, -1);
    }

    /* renamed from: i */
    public final boolean mo17714i(@C0363p0 String str, @C0363p0 String str2, long j, long j2) {
        if (j > j2) {
            return true;
        }
        if (C9669o0.m36224e(str)) {
            return false;
        }
        if (C9669o0.m36224e(str2)) {
            return C9674q0.m36240e("16.2.0", str);
        }
        return C9674q0.m36239d(str2, str);
    }

    /* renamed from: j */
    public boolean mo17715j(@C0359n0 C8996y<? extends C8800a0> yVar) {
        if (yVar.mo17736E().mo18805e(f24092K)) {
            return true;
        }
        if ("in_app_message".equals(yVar.mo17741J())) {
            return InAppMessage.f24674L0.equals(((InAppMessage) yVar.mo17744r()).mo18186s());
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo17716k(@C0359n0 C8996y<? extends C8800a0> yVar) {
        return this.f24117b.mo19548T(yVar.mo17736E().mo18801A(f24092K).mo18749A());
    }

    /* renamed from: l */
    public final boolean mo17717l() {
        return this.f24117b.mo19548T(mo17712g());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        if (r1.equals("months") == false) goto L_0x0042;
     */
    @androidx.annotation.C0359n0
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.urbanairship.automation.limits.C8906b mo17718p(@androidx.annotation.C0359n0 com.urbanairship.json.C9323b r8) throws com.urbanairship.json.JsonException {
        /*
            r7 = this;
            com.urbanairship.automation.limits.b$b r0 = com.urbanairship.automation.limits.C8906b.m33042d()
            java.lang.String r1 = "id"
            com.urbanairship.json.JsonValue r1 = r8.mo18801A(r1)
            java.lang.String r1 = r1.mo18769l()
            com.urbanairship.automation.limits.b$b r0 = r0.mo17546f(r1)
            java.lang.String r1 = "boundary"
            com.urbanairship.json.JsonValue r1 = r8.mo18801A(r1)
            r2 = 0
            int r1 = r1.mo18762f(r2)
            com.urbanairship.automation.limits.b$b r0 = r0.mo17545e(r1)
            java.lang.String r1 = "range"
            com.urbanairship.json.JsonValue r1 = r8.mo18801A(r1)
            r3 = 0
            long r3 = r1.mo18766i(r3)
            java.lang.String r1 = "period"
            com.urbanairship.json.JsonValue r1 = r8.mo18801A(r1)
            java.lang.String r1 = r1.mo18750B()
            r1.hashCode()
            int r5 = r1.hashCode()
            r6 = -1
            switch(r5) {
                case -1068487181: goto L_0x0086;
                case 3076183: goto L_0x007b;
                case 99469071: goto L_0x0070;
                case 113008383: goto L_0x0065;
                case 114851798: goto L_0x005a;
                case 1064901855: goto L_0x004f;
                case 1970096767: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            r2 = r6
            goto L_0x008f
        L_0x0044:
            java.lang.String r2 = "seconds"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x004d
            goto L_0x0042
        L_0x004d:
            r2 = 6
            goto L_0x008f
        L_0x004f:
            java.lang.String r2 = "minutes"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0058
            goto L_0x0042
        L_0x0058:
            r2 = 5
            goto L_0x008f
        L_0x005a:
            java.lang.String r2 = "years"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0063
            goto L_0x0042
        L_0x0063:
            r2 = 4
            goto L_0x008f
        L_0x0065:
            java.lang.String r2 = "weeks"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x006e
            goto L_0x0042
        L_0x006e:
            r2 = 3
            goto L_0x008f
        L_0x0070:
            java.lang.String r2 = "hours"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0079
            goto L_0x0042
        L_0x0079:
            r2 = 2
            goto L_0x008f
        L_0x007b:
            java.lang.String r2 = "days"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0084
            goto L_0x0042
        L_0x0084:
            r2 = 1
            goto L_0x008f
        L_0x0086:
            java.lang.String r5 = "months"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x008f
            goto L_0x0042
        L_0x008f:
            switch(r2) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x00cd;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00be;
                case 4: goto L_0x00b5;
                case 5: goto L_0x00af;
                case 6: goto L_0x00a9;
                default: goto L_0x0092;
            }
        L_0x0092:
            com.urbanairship.json.JsonException r8 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid period: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x00a9:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.mo17547g(r1, r3)
            goto L_0x00db
        L_0x00af:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            r0.mo17547g(r1, r3)
            goto L_0x00db
        L_0x00b5:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
            r5 = 365(0x16d, double:1.803E-321)
            long r3 = r3 * r5
            r0.mo17547g(r1, r3)
            goto L_0x00db
        L_0x00be:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
            r5 = 7
            long r3 = r3 * r5
            r0.mo17547g(r1, r3)
            goto L_0x00db
        L_0x00c7:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS
            r0.mo17547g(r1, r3)
            goto L_0x00db
        L_0x00cd:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
            r0.mo17547g(r1, r3)
            goto L_0x00db
        L_0x00d3:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
            r5 = 30
            long r3 = r3 * r5
            r0.mo17547g(r1, r3)
        L_0x00db:
            com.urbanairship.automation.limits.b r8 = r0.mo17544d()     // Catch:{ IllegalArgumentException -> 0x00e0 }
            return r8
        L_0x00e0:
            r0 = move-exception
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid constraint: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.C8970v.mo17718p(com.urbanairship.json.b):com.urbanairship.automation.limits.b");
    }

    @C0359n0
    /* renamed from: r */
    public final Collection<C8906b> mo17719r(@C0359n0 C9322a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonValue> it = aVar.iterator();
        while (it.hasNext()) {
            JsonValue next = it.next();
            try {
                arrayList.add(mo17718p(next.mo18749A()));
            } catch (JsonException e) {
                C36059m.m148411g(e, "Invalid constraint: " + next, new Object[0]);
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public final void mo17720w(@C0359n0 C9625m mVar, @C0359n0 C8973c cVar) throws ExecutionException, InterruptedException {
        Set<String> set;
        ArrayList arrayList;
        boolean z;
        C8973c cVar2 = cVar;
        long i = this.f24116a.mo107846i(f24089H, -1);
        C9323b g = mo17712g();
        C9323b a = C9323b.m35017y().mo18822f(f24092K, mVar.mo19565c()).mo18817a();
        boolean equals = mVar.mo19565c().equals(g);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Set<String> f = mo17711f(cVar.mo17630a().get());
        if (cVar2.mo17633d(mo17719r(mVar.mo19564b().mo18801A(f24097h).mo18784z())).get().booleanValue()) {
            String k = this.f24116a.mo107848k(f24093L, (String) null);
            Iterator<JsonValue> it = mVar.mo19564b().mo18801A("in_app_messages").mo18784z().iterator();
            while (it.hasNext()) {
                JsonValue next = it.next();
                try {
                    long b = C9668o.m36218b(next.mo18749A().mo18801A(f24102m).mo18769l());
                    long b2 = C9668o.m36218b(next.mo18749A().mo18801A(f24103n).mo18769l());
                    String u = m33383u(next);
                    if (C9669o0.m36224e(u)) {
                        C36059m.m148409e("Missing schedule ID: %s", next);
                    } else {
                        arrayList3.add(u);
                        if (!equals || b2 > i) {
                            if (f.contains(u)) {
                                try {
                                    C8820c0<? extends C8800a0> s = m33381s(next, a);
                                    Boolean bool = cVar2.mo17631b(u, s).get();
                                    if (bool != null && bool.booleanValue()) {
                                        C36059m.m148406b("Updated in-app automation: %s with edits: %s", u, s);
                                    }
                                } catch (JsonException e) {
                                    C36059m.m148411g(e, "Failed to parse in-app automation edits: %s", u);
                                }
                                set = f;
                                z = equals;
                                arrayList = arrayList3;
                            } else {
                                long j = b;
                                z = equals;
                                arrayList = arrayList3;
                                String str = u;
                                set = f;
                                JsonValue jsonValue = next;
                                if (mo17714i(next.mo18749A().mo18801A(f24094M).mo18750B(), k, j, i)) {
                                    try {
                                        C8996y<? extends C8800a0> t = m33382t(str, jsonValue, a);
                                        if (mo17723z(t, j)) {
                                            arrayList2.add(t);
                                            C36059m.m148406b("New in-app automation: %s", t);
                                        }
                                    } catch (Exception e2) {
                                        C36059m.m148411g(e2, "Failed to parse in-app automation: %s", jsonValue);
                                    }
                                }
                            }
                            equals = z;
                            arrayList3 = arrayList;
                            f = set;
                        }
                    }
                } catch (ParseException e3) {
                    set = f;
                    z = equals;
                    arrayList = arrayList3;
                    C36059m.m148411g(e3, "Failed to parse in-app message timestamps: %s", next);
                }
            }
            Set<String> set2 = f;
            ArrayList arrayList4 = arrayList3;
            if (!arrayList2.isEmpty()) {
                cVar2.mo17632c(arrayList2).get();
            }
            HashSet<String> hashSet = new HashSet<>(set2);
            hashSet.removeAll(arrayList4);
            if (!hashSet.isEmpty()) {
                C8820c0<?> n = C8820c0.m32799z().mo17377v(a).mo17380y(mVar.mo19566d()).mo17373r(mVar.mo19566d()).mo17369n();
                for (String b3 : hashSet) {
                    cVar2.mo17631b(b3, n).get();
                }
            }
            this.f24116a.mo107853r(f24089H, mVar.mo19566d());
            this.f24116a.mo107854s(f24090I, mVar.mo19565c());
            this.f24116a.mo107856u(f24093L, this.f24119d);
            synchronized (this.f24118c) {
                if (!this.f24118c.isEmpty()) {
                    for (C8974d a2 : new ArrayList(this.f24118c)) {
                        a2.mo17725a();
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public void mo17721x(C8974d dVar) {
        synchronized (this.f24118c) {
            this.f24118c.remove(dVar);
        }
    }

    /* renamed from: y */
    public void mo17722y(long j) {
        this.f24116a.mo107853r(f24091J, j);
    }

    /* renamed from: z */
    public final boolean mo17723z(C8996y<? extends C8800a0> yVar, long j) {
        boolean z;
        Context l = UAirship.m146200l();
        C8814b s = yVar.mo17745s();
        if (j <= mo17713h()) {
            z = true;
        } else {
            z = false;
        }
        return C8819c.m32777b(l, s, z);
    }

    public C8970v(@C0359n0 C36071u uVar, @C0359n0 C9619j jVar, @C0359n0 String str, @C0359n0 Looper looper) {
        this.f24116a = uVar;
        this.f24117b = jVar;
        this.f24119d = str;
        this.f24120e = looper;
    }
}
