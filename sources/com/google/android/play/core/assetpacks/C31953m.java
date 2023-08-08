package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.m */
public final class C31953m extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ int f77958b;

    /* renamed from: c */
    public final /* synthetic */ String f77959c;

    /* renamed from: d */
    public final /* synthetic */ String f77960d;

    /* renamed from: e */
    public final /* synthetic */ int f77961e;

    /* renamed from: f */
    public final /* synthetic */ C32239p f77962f;

    /* renamed from: g */
    public final /* synthetic */ C31993v f77963g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31953m(C31993v vVar, C32239p pVar, int i, String str, String str2, int i2, C32239p pVar2) {
        super(pVar);
        this.f77963g = vVar;
        this.f77958b = i;
        this.f77959c = str;
        this.f77960d = str2;
        this.f77961e = i2;
        this.f77962f = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            ((C32094u1) this.f77963g.f78146c.mo92831c()).mo92817E2(this.f77963g.f78144a, C31993v.m129692t(this.f77958b, this.f77959c, this.f77960d, this.f77961e), C31993v.m129684k(), new C31969p(this.f77963g, this.f77962f));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92776b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f77959c, this.f77960d, Integer.valueOf(this.f77961e), Integer.valueOf(this.f77958b));
            this.f77962f.mo93033d(new RuntimeException(e));
        }
    }
}
