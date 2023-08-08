package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class m10 extends C29245g {
    public m10(int i) {
        super(i, (C29208f) null);
    }

    /* renamed from: a */
    public final void mo84615a() {
        if (!mo84626l()) {
            for (int i = 0; i < mo84616b(); i++) {
                Map.Entry h = mo84624h(i);
                if (((C29096bz) h.getKey()).mo84539S0()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo84617c()) {
                if (((C29096bz) entry.getKey()).mo84539S0()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo84615a();
    }
}
