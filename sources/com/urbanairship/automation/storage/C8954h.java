package com.urbanairship.automation.storage;

import androidx.annotation.RestrictTo;
import androidx.room.C20340m0;
import androidx.room.C20351p;
import androidx.room.Index;
import com.urbanairship.automation.C8814b;
import com.urbanairship.automation.C8828d0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

@C20351p(indices = {@Index(unique = true, value = {"scheduleId"})}, tableName = "schedules")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.storage.h */
public class C8954h {
    @C20340m0(autoGenerate = true)

    /* renamed from: a */
    public int f24010a;

    /* renamed from: b */
    public String f24011b;

    /* renamed from: c */
    public String f24012c;

    /* renamed from: d */
    public C9323b f24013d;

    /* renamed from: e */
    public int f24014e;

    /* renamed from: f */
    public int f24015f;

    /* renamed from: g */
    public long f24016g;

    /* renamed from: h */
    public long f24017h;

    /* renamed from: i */
    public long f24018i;

    /* renamed from: j */
    public long f24019j;

    /* renamed from: k */
    public String f24020k;

    /* renamed from: l */
    public JsonValue f24021l;

    /* renamed from: m */
    public int f24022m;

    /* renamed from: n */
    public int f24023n;

    /* renamed from: o */
    public long f24024o;

    /* renamed from: p */
    public C8828d0 f24025p;

    /* renamed from: q */
    public int f24026q;

    /* renamed from: r */
    public List<String> f24027r;

    /* renamed from: s */
    public long f24028s;

    /* renamed from: t */
    public String f24029t;

    /* renamed from: u */
    public C8814b f24030u;

    /* renamed from: v */
    public JsonValue f24031v;

    /* renamed from: w */
    public JsonValue f24032w;

    /* renamed from: x */
    public List<String> f24033x;

    public String toString() {
        return "ScheduleEntity{id=" + this.f24010a + ", scheduleId='" + this.f24011b + '\'' + ", group='" + this.f24012c + '\'' + ", metadata=" + this.f24013d + ", limit=" + this.f24014e + ", priority=" + this.f24015f + ", scheduleStart=" + this.f24016g + ", scheduleEnd=" + this.f24017h + ", editGracePeriod=" + this.f24018i + ", interval=" + this.f24019j + ", scheduleType='" + this.f24020k + '\'' + ", data=" + this.f24021l + ", count=" + this.f24022m + ", executionState=" + this.f24023n + ", executionStateChangeDate=" + this.f24024o + ", triggerContext=" + this.f24025p + ", appState=" + this.f24026q + ", screens=" + this.f24027r + ", seconds=" + this.f24028s + ", regionId='" + this.f24029t + '\'' + ", audience=" + this.f24030u + ", campaigns=" + this.f24031v + ", reportingContext=" + this.f24032w + ", frequencyConstraintIds=" + this.f24033x + C12361b.f30259j;
    }
}
