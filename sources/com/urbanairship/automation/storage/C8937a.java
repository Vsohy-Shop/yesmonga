package com.urbanairship.automation.storage;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.room.C20282b0;
import androidx.room.C20293d2;
import androidx.room.C20312g;
import androidx.room.C20323i2;
import androidx.room.C20334l;
import androidx.room.C20352p0;
import java.util.Collection;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C20312g
/* renamed from: com.urbanairship.automation.storage.a */
public abstract class C8937a {
    /* renamed from: a */
    public void mo17637a(@C0359n0 C8946e eVar) {
        mo17638b(eVar.f23968a);
    }

    @C20334l
    /* renamed from: b */
    public abstract void mo17638b(@C0359n0 C8954h hVar);

    /* renamed from: c */
    public void mo17639c(@C0359n0 Collection<C8946e> collection) {
        for (C8946e next : collection) {
            if (next != null) {
                mo17637a(next);
            }
        }
    }

    @C20293d2
    @C20352p0("SELECT * FROM schedules WHERE (executionState != 4) AND (scheduleEnd >= 0) AND (scheduleEnd <= strftime('%s', 'now') * 1000)")
    @C0359n0
    /* renamed from: d */
    public abstract List<C8946e> mo17640d();

    @C20352p0("SELECT triggers.* FROM triggers JOIN schedules ON schedules.scheduleId = triggers.parentScheduleId AND (triggers.triggerType = :type) AND ((triggers.isCancellation = 1 AND + schedules.executionState IN (1,5,6))OR (triggers.isCancellation = 0 AND + schedules.executionState = 0))AND (schedules.scheduleStart < 0 OR schedules.scheduleStart <= strftime('%s', 'now') * 1000)")
    @C0359n0
    /* renamed from: e */
    public abstract List<C8956j> mo17641e(int i);

    @C20352p0("SELECT triggers.* FROM triggers JOIN schedules ON schedules.scheduleId = triggers.parentScheduleId WHERE (schedules.scheduleId = :scheduleId)AND (triggers.triggerType = :type) AND ((triggers.isCancellation = 1 AND + schedules.executionState IN (1,5,6))OR (triggers.isCancellation = 0 AND + schedules.executionState = 0))AND (schedules.scheduleStart < 0 OR schedules.scheduleStart <= strftime('%s', 'now') * 1000)")
    @C0359n0
    /* renamed from: f */
    public abstract List<C8956j> mo17642f(int i, @C0359n0 String str);

    @C0363p0
    @C20293d2
    @C20352p0("SELECT * FROM schedules WHERE (scheduleId == :scheduleId)")
    /* renamed from: g */
    public abstract C8946e mo17643g(@C0359n0 String str);

    @C0363p0
    @C20293d2
    @C20352p0("SELECT * FROM schedules WHERE (scheduleId == :scheduleId) AND (scheduleType = :type)")
    /* renamed from: h */
    public abstract C8946e mo17644h(@C0359n0 String str, @C0359n0 String str2);

    @C20352p0("SELECT COUNT(*) FROM schedules")
    /* renamed from: i */
    public abstract int mo17645i();

    @C20293d2
    @C20352p0("SELECT * FROM schedules")
    @C0359n0
    /* renamed from: j */
    public abstract List<C8946e> mo17646j();

    @C20293d2
    @C20352p0("SELECT * FROM schedules WHERE (scheduleId IN (:scheduleIds))")
    @C0359n0
    /* renamed from: k */
    public abstract List<C8946e> mo17647k(@C0359n0 Collection<String> collection);

    @C20293d2
    @C20352p0("SELECT * FROM schedules WHERE (scheduleId IN (:scheduleIds)) AND (scheduleType = :type)")
    @C0359n0
    /* renamed from: l */
    public abstract List<C8946e> mo17648l(@C0359n0 Collection<String> collection, @C0359n0 String str);

    @C20293d2
    @C20352p0("SELECT * FROM schedules WHERE (scheduleType = :type)")
    @C0359n0
    /* renamed from: m */
    public abstract List<C8946e> mo17649m(@C0359n0 String str);

    @C20293d2
    @C20352p0("SELECT * FROM schedules WHERE (`group` == :group)")
    @C0359n0
    /* renamed from: n */
    public abstract List<C8946e> mo17650n(@C0359n0 String str);

    @C20293d2
    @C20352p0("SELECT * FROM schedules WHERE (`group` == :group) AND (scheduleType = :type)")
    @C0359n0
    /* renamed from: o */
    public abstract List<C8946e> mo17651o(@C0359n0 String str, @C0359n0 String str2);

    @C20293d2
    @C20352p0("SELECT * FROM schedules WHERE (executionState IN (:executionStates))")
    @C0359n0
    /* renamed from: p */
    public abstract List<C8946e> mo17652p(int... iArr);

    /* renamed from: q */
    public void mo17653q(@C0359n0 C8946e eVar) {
        mo17654r(eVar.f23968a, eVar.f23969b);
    }

    @C20282b0(onConflict = 1)
    @C20293d2
    /* renamed from: r */
    public abstract void mo17654r(@C0359n0 C8954h hVar, @C0359n0 List<C8956j> list);

    @C20293d2
    /* renamed from: s */
    public void mo17655s(@C0359n0 Collection<C8946e> collection) {
        for (C8946e next : collection) {
            if (next != null) {
                mo17653q(next);
            }
        }
    }

    /* renamed from: t */
    public void mo17656t(@C0359n0 C8946e eVar) {
        mo17657u(eVar.f23968a, eVar.f23969b);
    }

    @C20293d2
    @C20323i2
    /* renamed from: u */
    public abstract void mo17657u(@C0359n0 C8954h hVar, @C0359n0 List<C8956j> list);

    /* renamed from: v */
    public void mo17658v(@C0359n0 Collection<C8946e> collection) {
        for (C8946e next : collection) {
            if (next != null) {
                mo17656t(next);
            }
        }
    }

    @C20293d2
    @C20323i2
    /* renamed from: w */
    public abstract void mo17659w(@C0359n0 List<C8956j> list);
}
