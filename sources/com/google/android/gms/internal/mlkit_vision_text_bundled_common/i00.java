package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

public final class i00 extends k00 {
    public /* synthetic */ i00(h00 h00) {
        super((j00) null);
    }

    /* renamed from: a */
    public final void mo84634a(Object obj, long j) {
        ((C29872wz) C29725t.m121139k(obj, j)).mo84834I();
    }

    /* renamed from: b */
    public final <E> void mo84635b(Object obj, Object obj2, long j) {
        C29872wz wzVar = (C29872wz) C29725t.m121139k(obj, j);
        C29872wz wzVar2 = (C29872wz) C29725t.m121139k(obj2, j);
        int size = wzVar.size();
        int size2 = wzVar2.size();
        if (size > 0 && size2 > 0) {
            if (!wzVar.mo84839z()) {
                wzVar = wzVar.mo84516P1(size2 + size);
            }
            wzVar.addAll(wzVar2);
        }
        if (size > 0) {
            wzVar2 = wzVar;
        }
        C29725t.m121152x(obj, j, wzVar2);
    }

    public i00() {
        super((j00) null);
    }
}
