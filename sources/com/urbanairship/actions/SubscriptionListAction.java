package com.urbanairship.actions;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.urbanairship.base.C9002b;
import com.urbanairship.channel.C9049r;
import com.urbanairship.contacts.C9101t;
import com.urbanairship.contacts.Scope;
import com.urbanairship.json.JsonException;

public class SubscriptionListAction extends C35487a {

    /* renamed from: j */
    public static final String f87482j = "type";

    /* renamed from: k */
    public static final String f87483k = "list";

    /* renamed from: l */
    public static final String f87484l = "action";

    /* renamed from: m */
    public static final String f87485m = "scope";

    /* renamed from: n */
    public static final String f87486n = "subscribe";

    /* renamed from: o */
    public static final String f87487o = "unsubscribe";

    /* renamed from: p */
    public static final String f87488p = "channel";

    /* renamed from: q */
    public static final String f87489q = "contact";
    @C0359n0

    /* renamed from: r */
    public static final String f87490r = "subscription_list_action";
    @C0359n0

    /* renamed from: s */
    public static final String f87491s = "^sla";
    @C0359n0

    /* renamed from: t */
    public static final String f87492t = "^sl";
    @C0359n0

    /* renamed from: u */
    public static final String f87493u = "edit_subscription_list_action";

    /* renamed from: h */
    public final C9002b<C9049r> f87494h;

    /* renamed from: i */
    public final C9002b<C9101t> f87495i;

    public SubscriptionListAction() {
        this(new C35512r(), new C35513s());
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        return !bVar.mo106349c().mo106311i() && bVar.mo106348b() != 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082 A[Catch:{ JsonException -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093 A[Catch:{ JsonException -> 0x0097 }] */
    @androidx.annotation.C0359n0
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.urbanairship.actions.C35495f mo17302d(@androidx.annotation.C0359n0 com.urbanairship.actions.C35489b r12) {
        /*
            r11 = this;
            com.urbanairship.base.b<com.urbanairship.channel.r> r0 = r11.f87494h
            java.lang.Object r0 = r0.get()
            com.urbanairship.channel.r r0 = (com.urbanairship.channel.C9049r) r0
            java.lang.Object r0 = androidx.core.util.C17992m.m81743d(r0)
            com.urbanairship.channel.r r0 = (com.urbanairship.channel.C9049r) r0
            com.urbanairship.base.b<com.urbanairship.contacts.t> r1 = r11.f87495i
            java.lang.Object r1 = r1.get()
            com.urbanairship.contacts.t r1 = (com.urbanairship.contacts.C9101t) r1
            java.lang.Object r1 = androidx.core.util.C17992m.m81743d(r1)
            com.urbanairship.contacts.t r1 = (com.urbanairship.contacts.C9101t) r1
            com.urbanairship.actions.ActionValue r2 = r12.mo106349c()
            com.urbanairship.json.JsonValue r2 = r2.mo17264q()
            com.urbanairship.json.a r2 = r2.mo18784z()
            java.util.Iterator r2 = r2.iterator()
        L_0x002c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r3 = r2.next()
            com.urbanairship.json.JsonValue r3 = (com.urbanairship.json.JsonValue) r3
            r4 = 0
            com.urbanairship.json.b r3 = r3.mo18752E()     // Catch:{ JsonException -> 0x0097 }
            java.lang.String r5 = "list"
            com.urbanairship.json.JsonValue r5 = r3.mo18802H(r5)     // Catch:{ JsonException -> 0x0097 }
            java.lang.String r5 = r5.mo18753F()     // Catch:{ JsonException -> 0x0097 }
            java.lang.String r6 = "type"
            com.urbanairship.json.JsonValue r6 = r3.mo18802H(r6)     // Catch:{ JsonException -> 0x0097 }
            java.lang.String r6 = r6.mo18753F()     // Catch:{ JsonException -> 0x0097 }
            java.lang.String r7 = "action"
            com.urbanairship.json.JsonValue r7 = r3.mo18802H(r7)     // Catch:{ JsonException -> 0x0097 }
            java.lang.String r7 = r7.mo18753F()     // Catch:{ JsonException -> 0x0097 }
            int r8 = r6.hashCode()     // Catch:{ JsonException -> 0x0097 }
            r9 = 738950403(0x2c0b7d03, float:1.9822483E-12)
            r10 = 1
            if (r8 == r9) goto L_0x0075
            r9 = 951526432(0x38b72420, float:8.732849E-5)
            if (r8 == r9) goto L_0x006b
            goto L_0x007f
        L_0x006b:
            java.lang.String r8 = "contact"
            boolean r6 = r6.equals(r8)     // Catch:{ JsonException -> 0x0097 }
            if (r6 == 0) goto L_0x007f
            r6 = r10
            goto L_0x0080
        L_0x0075:
            java.lang.String r8 = "channel"
            boolean r6 = r6.equals(r8)     // Catch:{ JsonException -> 0x0097 }
            if (r6 == 0) goto L_0x007f
            r6 = r4
            goto L_0x0080
        L_0x007f:
            r6 = -1
        L_0x0080:
            if (r6 == 0) goto L_0x0093
            if (r6 == r10) goto L_0x0085
            goto L_0x002c
        L_0x0085:
            java.lang.String r6 = "scope"
            com.urbanairship.json.JsonValue r3 = r3.mo18802H(r6)     // Catch:{ JsonException -> 0x0097 }
            com.urbanairship.contacts.Scope r3 = com.urbanairship.contacts.Scope.m33817b(r3)     // Catch:{ JsonException -> 0x0097 }
            r11.mo106340j(r1, r5, r7, r3)     // Catch:{ JsonException -> 0x0097 }
            goto L_0x002c
        L_0x0093:
            r11.mo106339i(r0, r5, r7)     // Catch:{ JsonException -> 0x0097 }
            goto L_0x002c
        L_0x0097:
            r12 = move-exception
            java.lang.String r0 = "Invalid argument"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.urbanairship.C36059m.m148411g(r12, r0, r1)
            com.urbanairship.actions.f r12 = com.urbanairship.actions.C35495f.m146458f(r12)
            return r12
        L_0x00a4:
            r0.mo17904a()
            r1.mo18094a()
            com.urbanairship.actions.ActionValue r12 = r12.mo106349c()
            com.urbanairship.actions.f r12 = com.urbanairship.actions.C35495f.m146459g(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.actions.SubscriptionListAction.mo17302d(com.urbanairship.actions.b):com.urbanairship.actions.f");
    }

    /* renamed from: i */
    public final void mo106339i(@C0359n0 C9049r rVar, @C0359n0 String str, @C0359n0 String str2) throws JsonException {
        str2.hashCode();
        if (str2.equals("subscribe")) {
            rVar.mo17906d(str);
        } else if (str2.equals("unsubscribe")) {
            rVar.mo17908f(str);
        } else {
            throw new JsonException("Invalid action: " + str2);
        }
    }

    /* renamed from: j */
    public final void mo106340j(@C0359n0 C9101t tVar, @C0359n0 String str, @C0359n0 String str2, @C0359n0 Scope scope) throws JsonException {
        str2.hashCode();
        if (str2.equals("subscribe")) {
            tVar.mo18096d(str, scope);
        } else if (str2.equals("unsubscribe")) {
            tVar.mo18098f(str, scope);
        } else {
            throw new JsonException("Invalid action: " + str2);
        }
    }

    @C0344h1
    public SubscriptionListAction(@C0359n0 C9002b<C9049r> bVar, @C0359n0 C9002b<C9101t> bVar2) {
        this.f87494h = bVar;
        this.f87495i = bVar2;
    }
}
