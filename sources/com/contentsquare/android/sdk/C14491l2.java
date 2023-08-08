package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14218ba;

/* renamed from: com.contentsquare.android.sdk.l2 */
public abstract class C14491l2<MessageType extends C14218ba> implements C14311ee<MessageType> {

    /* renamed from: a */
    public static final C14787v2 f35841a = C14787v2.m63752a();

    /* renamed from: c */
    public final MessageType mo35799c(MessageType messagetype) {
        if (messagetype == null || messagetype.mo35315f()) {
            return messagetype;
        }
        throw mo35800d(messagetype).mo34546a().mo35491a(messagetype);
    }

    /* renamed from: d */
    public final C14189ae mo35800d(MessageType messagetype) {
        return messagetype instanceof C14288e1 ? ((C14288e1) messagetype).mo35017h() : new C14189ae(messagetype);
    }

    /* renamed from: e */
    public MessageType mo35090b(C14719t0 t0Var, C14787v2 v2Var) {
        return mo35799c(mo35802f(t0Var, v2Var));
    }

    /* renamed from: f */
    public MessageType mo35802f(C14719t0 t0Var, C14787v2 v2Var) {
        C14231c n0 = t0Var.mo36436n0();
        MessageType messagetype = (C14218ba) mo35089a(n0, v2Var);
        try {
            n0.mo34728f(0);
            return messagetype;
        } catch (C14394h5 e) {
            throw e.mo35491a(messagetype);
        }
    }
}
