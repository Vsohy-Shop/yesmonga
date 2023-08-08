package com.google.android.gms.internal.gtm;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.ll */
public final class C41412ll extends C41652vl {
    public C41412ll(int i) {
        super(i, (C41628ul) null);
    }

    /* renamed from: a */
    public final void mo135633a() {
        if (!mo135998l()) {
            for (int i = 0; i < mo135988b(); i++) {
                ((C41145aj) mo135996h(i).getKey()).mo135029h();
            }
            for (Map.Entry key : mo135989c()) {
                ((C41145aj) key.getKey()).mo135029h();
            }
        }
        super.mo135633a();
    }
}
