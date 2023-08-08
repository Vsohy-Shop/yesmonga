package com.google.android.gms.internal.measurement;

import androidx.core.app.C17075f2;
import com.usabilla.sdk.ubform.p007db.telemetry.TelemetryTable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.fg */
public final class C41956fg extends C42011j {

    /* renamed from: c */
    public final C42115of f106138c;

    public C41956fg(C42115of ofVar) {
        super("internal.logger");
        this.f106138c = ofVar;
        this.f106230b.put(TelemetryTable.f26835g, new C41938eg(this, false, true));
        this.f106230b.put(C17075f2.f45058Q0, new C42079md(this, C17075f2.f45058Q0));
        ((C42011j) this.f106230b.get(C17075f2.f45058Q0)).mo136748w(TelemetryTable.f26835g, new C41938eg(this, true, true));
        this.f106230b.put("unmonitored", new C42097ne(this, "unmonitored"));
        ((C42011j) this.f106230b.get("unmonitored")).mo136748w(TelemetryTable.f26835g, new C41938eg(this, false, false));
    }

    /* renamed from: a */
    public final C42133q mo136725a(C41909d5 d5Var, List list) {
        return C42133q.f106351H;
    }
}
