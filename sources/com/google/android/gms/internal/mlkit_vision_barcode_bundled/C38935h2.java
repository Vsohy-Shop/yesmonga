package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38935h2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h2 */
public class C38935h2<MessageType extends C39003o2<MessageType, BuilderType>, BuilderType extends C38935h2<MessageType, BuilderType>> extends C39082x0<MessageType, BuilderType> {

    /* renamed from: a */
    public final MessageType f98857a;

    /* renamed from: b */
    public MessageType f98858b;

    /* renamed from: c */
    public boolean f98859c = false;

    public C38935h2(MessageType messagetype) {
        this.f98857a = messagetype;
        this.f98858b = (C39003o2) messagetype.mo94469z(4, (Object) null, (Object) null);
    }

    /* renamed from: j */
    public static final void m160522j(MessageType messagetype, MessageType messagetype2) {
        C38917f4.m160495a().mo122883b(messagetype.getClass()).mo122790d(messagetype, messagetype2);
    }

    /* renamed from: b */
    public final boolean mo122908b() {
        throw null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C39076w3 mo122909c() {
        return this.f98857a;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C39082x0 mo122912i(C39091y0 y0Var) {
        mo122914l((C39003o2) y0Var);
        return this;
    }

    /* renamed from: k */
    public final BuilderType mo122911h() {
        BuilderType buildertype = (C38935h2) this.f98857a.mo94469z(5, (Object) null, (Object) null);
        buildertype.mo122914l(mo122919r());
        return buildertype;
    }

    /* renamed from: l */
    public final BuilderType mo122914l(MessageType messagetype) {
        if (this.f98859c) {
            mo122917o();
            this.f98859c = false;
        }
        m160522j(this.f98858b, messagetype);
        return this;
    }

    /* renamed from: m */
    public final MessageType mo122918q() {
        MessageType n = mo122919r();
        if (n.mo122908b()) {
            return n;
        }
        throw new zzgy(n);
    }

    /* renamed from: n */
    public MessageType mo122919r() {
        if (this.f98859c) {
            return this.f98858b;
        }
        MessageType messagetype = this.f98858b;
        C38917f4.m160495a().mo122883b(messagetype.getClass()).mo122789c(messagetype);
        this.f98859c = true;
        return this.f98858b;
    }

    /* renamed from: o */
    public void mo122917o() {
        MessageType messagetype = (C39003o2) this.f98858b.mo94469z(4, (Object) null, (Object) null);
        m160522j(messagetype, this.f98858b);
        this.f98858b = messagetype;
    }
}
