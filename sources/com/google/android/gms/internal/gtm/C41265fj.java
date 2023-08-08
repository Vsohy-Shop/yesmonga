package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.C41265fj;
import com.google.android.gms.internal.gtm.C41410lj;

/* renamed from: com.google.android.gms.internal.gtm.fj */
public class C41265fj<MessageType extends C41410lj<MessageType, BuilderType>, BuilderType extends C41265fj<MessageType, BuilderType>> extends C41671wg<MessageType, BuilderType> {

    /* renamed from: a */
    public final MessageType f104599a;

    /* renamed from: b */
    public MessageType f104600b;

    /* renamed from: c */
    public boolean f104601c = false;

    public C41265fj(MessageType messagetype) {
        this.f104599a = messagetype;
        this.f104600b = (C41410lj) messagetype.mo134974A(4, (Object) null, (Object) null);
    }

    /* renamed from: s */
    public static final void m167488s(MessageType messagetype, MessageType messagetype2) {
        C41219dl.m167407a().mo135299b(messagetype.getClass()).mo135458d(messagetype, messagetype2);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C41627uk mo135365h() {
        return this.f104599a;
    }

    /* renamed from: i */
    public final boolean mo135366i() {
        throw null;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C41671wg mo135368l(C41695xg xgVar) {
        mo135373u((C41410lj) xgVar);
        return this;
    }

    /* renamed from: m */
    public final MessageType mo135375y() {
        MessageType n = mo135374w();
        if (n.mo135366i()) {
            return n;
        }
        throw new zzxn(n);
    }

    /* renamed from: n */
    public MessageType mo135374w() {
        if (this.f104601c) {
            return this.f104600b;
        }
        MessageType messagetype = this.f104600b;
        C41219dl.m167407a().mo135299b(messagetype.getClass()).mo135457c(messagetype);
        this.f104601c = true;
        return this.f104600b;
    }

    /* renamed from: o */
    public void mo135371o() {
        MessageType messagetype = (C41410lj) this.f104600b.mo134974A(4, (Object) null, (Object) null);
        m167488s(messagetype, this.f104600b);
        this.f104600b = messagetype;
    }

    /* renamed from: t */
    public final BuilderType mo135367k() {
        BuilderType buildertype = (C41265fj) this.f104599a.mo134974A(5, (Object) null, (Object) null);
        buildertype.mo135373u(mo135374w());
        return buildertype;
    }

    /* renamed from: u */
    public final BuilderType mo135373u(MessageType messagetype) {
        if (this.f104601c) {
            mo135371o();
            this.f104601c = false;
        }
        m167488s(this.f104600b, messagetype);
        return this;
    }
}
