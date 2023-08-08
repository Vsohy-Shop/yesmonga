package com.urbanairship.messagecenter;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.channel.C9008d;
import com.urbanairship.config.C9061a;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.job.C9304f;
import com.urbanairship.job.JobResult;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.urbanairship.messagecenter.e */
public class C9369e {

    /* renamed from: g */
    public static final String f25603g = "ACTION_RICH_PUSH_MESSAGES_UPDATE";

    /* renamed from: h */
    public static final String f25604h = "ACTION_SYNC_MESSAGE_STATE";

    /* renamed from: i */
    public static final String f25605i = "ACTION_RICH_PUSH_USER_UPDATE";

    /* renamed from: j */
    public static final String f25606j = "EXTRA_FORCEFULLY";

    /* renamed from: k */
    public static final String f25607k = "com.urbanairship.user.LAST_MESSAGE_REFRESH_TIME";

    /* renamed from: l */
    public static final String f25608l = "com.urbanairship.user.LAST_UPDATE_TIME";

    /* renamed from: m */
    public static final long f25609m = 86400000;

    /* renamed from: a */
    public final C9378j f25610a;

    /* renamed from: b */
    public final C9420z f25611b;

    /* renamed from: c */
    public final C9353c f25612c;

    /* renamed from: d */
    public final C36071u f25613d;

    /* renamed from: e */
    public final C9008d f25614e;

    /* renamed from: f */
    public final C9366d f25615f;

    public C9369e(@C0359n0 Context context, @C0359n0 C9353c cVar, @C0359n0 C9420z zVar, @C0359n0 C9008d dVar, @C0359n0 C9061a aVar, @C0359n0 C36071u uVar, @C0359n0 C9378j jVar) {
        this(cVar, zVar, dVar, uVar, jVar, new C9366d(aVar));
    }

    /* renamed from: a */
    public final boolean mo18964a() {
        String Z = this.f25614e.mo17793Z();
        if (C9669o0.m36224e(Z)) {
            C36059m.m148406b("No Channel. User will be created after channel registrations finishes.", new Object[0]);
            return false;
        }
        try {
            C9116c<C9351a0> c = this.f25615f.mo18955c(Z);
            if (c.mo18150l()) {
                C9351a0 f = c.mo18144f();
                C36059m.m148413i("InboxJobHandler - Created Rich Push user: %s", f.mo18904b());
                this.f25613d.mo107853r(f25608l, System.currentTimeMillis());
                this.f25613d.mo107859x(f25607k);
                this.f25611b.mo19092i(f.mo18904b(), f.mo18903a(), Z);
                return true;
            }
            C36059m.m148406b("Rich Push user creation failed: %s", c);
            return false;
        } catch (RequestException e) {
            C36059m.m148407c(e, "User creation failed.", new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo18965b() {
        mo18971h();
        mo18970g();
    }

    /* renamed from: c */
    public final void mo18966c() {
        if (!this.f25611b.mo19091h()) {
            C36059m.m148406b("User has not been created, canceling messages update", new Object[0]);
            this.f25612c.mo18914C(false);
            return;
        }
        boolean j = mo18973j();
        this.f25612c.mo18915D(true);
        this.f25612c.mo18914C(j);
        mo18971h();
        mo18970g();
    }

    /* renamed from: d */
    public final void mo18967d(boolean z) {
        boolean z2;
        if (!z) {
            long i = this.f25613d.mo107846i(f25608l, 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (i <= currentTimeMillis && i + 86400000 >= currentTimeMillis) {
                return;
            }
        }
        if (!this.f25611b.mo19091h()) {
            z2 = mo18964a();
        } else {
            z2 = mo18974k();
        }
        this.f25611b.mo19094k(z2);
    }

    @C0359n0
    /* renamed from: e */
    public JobResult mo18968e(@C0359n0 C9304f fVar) {
        String a = fVar.mo18712a();
        a.hashCode();
        char c = 65535;
        switch (a.hashCode()) {
            case -2142275554:
                if (a.equals(f25604h)) {
                    c = 0;
                    break;
                }
                break;
            case -1764334927:
                if (a.equals(f25603g)) {
                    c = 1;
                    break;
                }
                break;
            case 1960281554:
                if (a.equals(f25605i)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo18965b();
                break;
            case 1:
                mo18966c();
                break;
            case 2:
                mo18967d(fVar.mo18715d().mo18801A(f25606j).mo18757c(false));
                break;
        }
        return JobResult.SUCCESS;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public void mo18969f() {
        this.f25613d.mo107859x(f25607k);
        this.f25613d.mo107859x(f25608l);
    }

    /* renamed from: g */
    public final void mo18970g() {
        String Z = this.f25614e.mo17793Z();
        if (!C9669o0.m36224e(Z)) {
            List<C9383m> g = this.f25610a.mo19018g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C9383m next : g) {
                if (next.mo19043e() != null) {
                    arrayList2.add(next.mo19043e());
                    arrayList.add(next.mo19042d());
                }
            }
            if (arrayList.size() != 0) {
                C36059m.m148419o("Found %s messages to delete.", Integer.valueOf(arrayList.size()));
                try {
                    C9116c<Void> g2 = this.f25615f.mo18959g(this.f25611b, Z, arrayList2);
                    C36059m.m148419o("Delete inbox messages response: %s", g2);
                    if (g2.mo18147i() == 200) {
                        this.f25610a.mo19015d(arrayList);
                    }
                } catch (RequestException e) {
                    C36059m.m148407c(e, "Deleted message state synchronize failed.", new Object[0]);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo18971h() {
        String Z = this.f25614e.mo17793Z();
        if (!C9669o0.m36224e(Z)) {
            List<C9383m> i = this.f25610a.mo19020i();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C9383m next : i) {
                if (next.mo19043e() != null) {
                    arrayList2.add(next.mo19043e());
                    arrayList.add(next.mo19042d());
                }
            }
            if (!arrayList.isEmpty()) {
                C36059m.m148419o("Found %s messages to mark read.", Integer.valueOf(arrayList.size()));
                try {
                    C9116c<Void> h = this.f25615f.mo18960h(this.f25611b, Z, arrayList2);
                    C36059m.m148419o("Mark inbox messages read response: %s", h);
                    if (h.mo18147i() == 200) {
                        this.f25610a.mo19034x(arrayList);
                    }
                } catch (RequestException e) {
                    C36059m.m148407c(e, "Read message state synchronize failed.", new Object[0]);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo18972i(C9322a aVar) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<JsonValue> it = aVar.iterator();
        while (it.hasNext()) {
            JsonValue next = it.next();
            if (!next.mo18778u()) {
                C36059m.m148409e("InboxJobHandler - Invalid message payload: %s", next);
            } else {
                String l = next.mo18749A().mo18801A("message_id").mo18769l();
                if (l == null) {
                    C36059m.m148409e("InboxJobHandler - Invalid message payload, missing message ID: %s", next);
                } else {
                    hashSet.add(l);
                    C9383m b = C9383m.m35326b(l, next);
                    if (b == null) {
                        C36059m.m148409e("InboxJobHandler - Message Entity is null", new Object[0]);
                    } else if (!this.f25610a.mo19011B(b.f25662b)) {
                        arrayList.add(next);
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            this.f25610a.mo19028q(C9383m.m35327c(arrayList));
        }
        List<String> k = this.f25610a.mo19022k();
        k.removeAll(hashSet);
        this.f25610a.mo19015d(k);
    }

    /* renamed from: j */
    public final boolean mo18973j() {
        C36059m.m148413i("Refreshing inbox messages.", new Object[0]);
        String Z = this.f25614e.mo17793Z();
        if (C9669o0.m36224e(Z)) {
            C36059m.m148419o("The channel ID does not exist.", new Object[0]);
            return false;
        }
        C36059m.m148419o("Fetching inbox messages.", new Object[0]);
        try {
            C9116c<C9322a> d = this.f25615f.mo18956d(this.f25611b, Z, this.f25613d.mo107846i(f25607k, 0));
            C36059m.m148419o("Fetch inbox messages response: %s", d);
            if (d.mo18150l()) {
                C9322a f = d.mo18144f();
                C36059m.m148413i("InboxJobHandler - Received %s inbox messages.", Integer.valueOf(d.mo18144f().size()));
                mo18972i(d.mo18144f());
                this.f25613d.mo107853r(f25607k, d.mo18139a());
                return true;
            } else if (d.mo18147i() == 304) {
                C36059m.m148406b("Inbox messages already up-to-date. ", new Object[0]);
                return true;
            } else {
                C36059m.m148406b("Unable to update inbox messages %s.", d);
                return false;
            }
        } catch (RequestException e) {
            C36059m.m148407c(e, "Update Messages failed.", new Object[0]);
            return false;
        }
    }

    /* renamed from: k */
    public final boolean mo18974k() {
        String Z = this.f25614e.mo17793Z();
        if (C9669o0.m36224e(Z)) {
            C36059m.m148406b("No Channel. Skipping Rich Push user update.", new Object[0]);
            return false;
        }
        try {
            C9116c<Void> i = this.f25615f.mo18961i(this.f25611b, Z);
            C36059m.m148419o("Update Rich Push user response: %s", i);
            int i2 = i.mo18147i();
            if (i2 == 200) {
                C36059m.m148413i("Rich Push user updated.", new Object[0]);
                this.f25613d.mo107853r(f25608l, System.currentTimeMillis());
                this.f25611b.mo19093j(Z);
                return true;
            } else if (i2 == 401) {
                C36059m.m148406b("Re-creating Rich Push user.", new Object[0]);
                this.f25613d.mo107852q(f25608l, 0);
                return mo18964a();
            } else {
                this.f25613d.mo107852q(f25608l, 0);
                return false;
            }
        } catch (RequestException e) {
            C36059m.m148407c(e, "User update failed.", new Object[0]);
            return false;
        }
    }

    @C0344h1
    public C9369e(@C0359n0 C9353c cVar, @C0359n0 C9420z zVar, @C0359n0 C9008d dVar, @C0359n0 C36071u uVar, @C0359n0 C9378j jVar, @C0359n0 C9366d dVar2) {
        this.f25612c = cVar;
        this.f25611b = zVar;
        this.f25614e = dVar;
        this.f25613d = uVar;
        this.f25610a = jVar;
        this.f25615f = dVar2;
    }
}
