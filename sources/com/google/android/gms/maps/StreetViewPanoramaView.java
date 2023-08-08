package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41012a;

public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: a */
    public final C30454h0 f72928a;

    public StreetViewPanoramaView(@C0359n0 Context context) {
        super((Context) C40843u.m166203m(context, "context must not be null"));
        this.f72928a = new C30454h0(this, context, (StreetViewPanoramaOptions) null);
    }

    /* renamed from: a */
    public void mo85853a(@C0359n0 C30453h hVar) {
        C40843u.m166203m(hVar, "callback must not be null");
        C40843u.m166197g("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f72928a.mo86003v(hVar);
    }

    /* renamed from: b */
    public final void mo85854b(@C0363p0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f72928a.mo134798d(bundle);
            if (this.f72928a.mo134796b() == null) {
                C41012a.m166725o(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: c */
    public void mo85855c() {
        this.f72928a.mo134800f();
    }

    /* renamed from: d */
    public final void mo85856d() {
        this.f72928a.mo134803i();
    }

    /* renamed from: e */
    public final void mo85857e() {
        this.f72928a.mo134804j();
    }

    /* renamed from: f */
    public void mo85858f() {
        this.f72928a.mo134805k();
    }

    /* renamed from: g */
    public final void mo85859g(@C0359n0 Bundle bundle) {
        this.f72928a.mo134806l(bundle);
    }

    /* renamed from: h */
    public void mo85860h() {
        this.f72928a.mo134807m();
    }

    /* renamed from: i */
    public void mo85861i() {
        this.f72928a.mo134808n();
    }

    public StreetViewPanoramaView(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super((Context) C40843u.m166203m(context, "context must not be null"), attributeSet);
        this.f72928a = new C30454h0(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet, int i) {
        super((Context) C40843u.m166203m(context, "context must not be null"), attributeSet, i);
        this.f72928a = new C30454h0(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(@C0359n0 Context context, @C0363p0 StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super((Context) C40843u.m166203m(context, "context must not be null"));
        this.f72928a = new C30454h0(this, context, streetViewPanoramaOptions);
    }
}
