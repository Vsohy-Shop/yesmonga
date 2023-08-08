package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29281gz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29502mz;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.gz */
public class C29281gz<MessageType extends C29502mz<MessageType, BuilderType>, BuilderType extends C29281gz<MessageType, BuilderType>> extends C29611px<MessageType, BuilderType> {

    /* renamed from: a */
    public final MessageType f71267a;

    /* renamed from: b */
    public MessageType f71268b;

    /* renamed from: c */
    public boolean f71269c = false;

    public C29281gz(MessageType messagetype) {
        this.f71267a = messagetype;
        this.f71268b = (C29502mz) messagetype.mo84505l(4, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public static final void m120438l(MessageType messagetype, MessageType messagetype2) {
        g10.m120414a().mo84636b(messagetype.getClass()).mo84484b(messagetype, messagetype2);
    }

    /* renamed from: h */
    public final boolean mo84648h() {
        throw null;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ x00 mo84649i() {
        return this.f71267a;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C29611px mo84651k(C29648qx qxVar) {
        mo84653n((C29502mz) qxVar);
        return this;
    }

    /* renamed from: m */
    public final BuilderType mo84650j() {
        BuilderType buildertype = (C29281gz) this.f71267a.mo84505l(5, (Object) null, (Object) null);
        buildertype.mo84653n(mo84647e0());
        return buildertype;
    }

    /* renamed from: n */
    public final BuilderType mo84653n(MessageType messagetype) {
        if (this.f71269c) {
            mo84656t();
            this.f71269c = false;
        }
        m120438l(this.f71268b, messagetype);
        return this;
    }

    /* renamed from: o */
    public final MessageType mo84645D2() {
        MessageType s = mo84647e0();
        if (s.mo84648h()) {
            return s;
        }
        throw new zbaah(s);
    }

    /* renamed from: s */
    public MessageType mo84647e0() {
        if (this.f71269c) {
            return this.f71268b;
        }
        MessageType messagetype = this.f71268b;
        g10.m120414a().mo84636b(messagetype.getClass()).mo84487e(messagetype);
        this.f71269c = true;
        return this.f71268b;
    }

    /* renamed from: t */
    public void mo84656t() {
        MessageType messagetype = (C29502mz) this.f71268b.mo84505l(4, (Object) null, (Object) null);
        m120438l(messagetype, this.f71268b);
        this.f71268b = messagetype;
    }
}
