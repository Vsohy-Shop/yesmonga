package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.C32046e1;
import com.google.android.play.core.internal.C32052g1;
import com.google.android.play.core.internal.C32063k0;

/* renamed from: com.google.android.play.core.assetpacks.x2 */
public final class C32004x2 implements C32052g1<C31905c> {

    /* renamed from: a */
    public final C32052g1 f78179a;

    /* renamed from: b */
    public final C32052g1 f78180b;

    /* renamed from: c */
    public final /* synthetic */ int f78181c = 0;

    public C32004x2(C32052g1<C31984s2> g1Var, C32052g1<Context> g1Var2) {
        this.f78179a = g1Var;
        this.f78180b = g1Var2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo92416a() {
        int i = this.f78181c;
        if (i == 0) {
            Object a = this.f78179a.mo92416a();
            Context b = ((C32012z2) this.f78180b).mo92416a();
            C31984s2 s2Var = (C31984s2) a;
            C32063k0.m129855h(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            C32063k0.m129855h(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            PlayCoreDialogWrapperActivity.m129736a(b);
            C32063k0.m129858k(s2Var);
            return s2Var;
        } else if (i == 1) {
            return new C31936i0(((C32012z2) this.f78180b).mo92416a(), (C31906c0) this.f78179a.mo92416a());
        } else {
            if (i == 2) {
                return new C31993v(((C32012z2) this.f78179a).mo92416a(), (C31998w0) this.f78180b.mo92416a());
            }
            if (i == 3) {
                return new C31906c0(((C32012z2) this.f78179a).mo92416a(), (C31918e2) this.f78180b.mo92416a());
            }
            return new C31928g2((C31906c0) this.f78180b.mo92416a(), C32046e1.m129796c(this.f78179a));
        }
    }

    public C32004x2(C32052g1<Context> g1Var, C32052g1<C31906c0> g1Var2, byte[] bArr) {
        this.f78180b = g1Var;
        this.f78179a = g1Var2;
    }

    public C32004x2(C32052g1<Context> g1Var, C32052g1<C31998w0> g1Var2, char[] cArr) {
        this.f78179a = g1Var;
        this.f78180b = g1Var2;
    }

    public C32004x2(C32052g1<C31906c0> g1Var, C32052g1<C31914d3> g1Var2, int[] iArr) {
        this.f78180b = g1Var;
        this.f78179a = g1Var2;
    }

    public C32004x2(C32052g1<Context> g1Var, C32052g1<C31918e2> g1Var2, short[] sArr) {
        this.f78179a = g1Var;
        this.f78180b = g1Var2;
    }
}
