package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.kb */
public final class C42041kb extends C42230vb {
    public C42041kb(int i) {
        super(i, (C42213ub) null);
    }

    /* renamed from: a */
    public final void mo137087a() {
        if (!mo137383l()) {
            for (int i = 0; i < mo137373b(); i++) {
                Map.Entry h = mo137381h(i);
                if (((C42003i9) h.getKey()).mo137033d()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo137374c()) {
                if (((C42003i9) entry.getKey()).mo137033d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo137087a();
    }
}
