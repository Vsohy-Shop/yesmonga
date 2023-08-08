package com.urbanairship.analytics.data;

import androidx.annotation.RestrictTo;
import androidx.room.C20282b0;
import androidx.room.C20293d2;
import androidx.room.C20312g;
import androidx.room.C20334l;
import androidx.room.C20352p0;
import com.urbanairship.C36059m;
import com.urbanairship.analytics.data.C35543e;
import com.urbanairship.util.C9669o0;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C20312g
/* renamed from: com.urbanairship.analytics.data.c */
public abstract class C35536c {
    @C20352p0("SELECT COUNT(*) FROM events")
    /* renamed from: a */
    public abstract int mo106455a();

    @C20352p0("SELECT SUM(eventSize) FROM events")
    /* renamed from: b */
    public abstract int mo106456b();

    @C20352p0("DELETE FROM events WHERE eventId = :eventId")
    /* renamed from: c */
    public abstract void mo106457c(String str);

    @C20334l
    /* renamed from: d */
    public abstract void mo106458d(C35543e... eVarArr);

    @C20352p0("DELETE FROM events")
    /* renamed from: e */
    public abstract void mo106459e();

    @C20293d2
    /* renamed from: f */
    public void mo106460f(List<C35543e.C35544a> list) {
        for (C35543e.C35544a aVar : list) {
            mo106457c(aVar.f87684b);
        }
    }

    @C20352p0("DELETE FROM events WHERE sessionId = :sessionId")
    /* renamed from: g */
    public abstract int mo106461g(String str);

    @C20293d2
    @C20352p0("SELECT * FROM events ORDER BY id ASC")
    /* renamed from: h */
    public abstract List<C35543e> mo106462h();

    @C20293d2
    @C20352p0("SELECT id, eventId, data FROM events ORDER BY id ASC LIMIT :limit")
    /* renamed from: i */
    public abstract List<C35543e.C35544a> mo106463i(int i);

    @C20282b0(onConflict = 1)
    /* renamed from: j */
    public abstract void mo106464j(C35543e eVar);

    @C20352p0("SELECT sessionId FROM events ORDER BY id ASC LIMIT 1")
    /* renamed from: k */
    public abstract String mo106465k();

    @C20293d2
    /* renamed from: l */
    public void mo106466l(int i) {
        while (mo106456b() > i) {
            String k = mo106465k();
            if (!C9669o0.m36224e(k)) {
                C36059m.m148406b("Event database size exceeded. Deleting oldest session: %s", k);
                int g = mo106461g(k);
                C36059m.m148406b("Deleted %d rows with session ID %s", Integer.valueOf(g), k);
                if (g == 0) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
