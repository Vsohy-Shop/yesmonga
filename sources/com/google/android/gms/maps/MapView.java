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

public class MapView extends FrameLayout {

    /* renamed from: a */
    public final C30627w f72911a;

    public MapView(@C0359n0 Context context) {
        super(context);
        this.f72911a = new C30627w(this, context, (GoogleMapOptions) null);
        setClickable(true);
    }

    /* renamed from: a */
    public void mo85819a(@C0359n0 C30447f fVar) {
        C40843u.m166197g("getMapAsync() must be called on the main thread");
        C40843u.m166203m(fVar, "callback must not be null.");
        this.f72911a.mo86713v(fVar);
    }

    /* renamed from: b */
    public void mo85820b(@C0363p0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f72911a.mo134798d(bundle);
            if (this.f72911a.mo134796b() == null) {
                C41012a.m166725o(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: c */
    public void mo85821c() {
        this.f72911a.mo134800f();
    }

    /* renamed from: d */
    public void mo85822d(@C0363p0 Bundle bundle) {
        C40843u.m166197g("onEnterAmbient() must be called on the main thread");
        C30627w wVar = this.f72911a;
        if (wVar.mo134796b() != null) {
            ((C30625v) wVar.mo134796b()).mo86711f(bundle);
        }
    }

    /* renamed from: e */
    public void mo85823e() {
        C40843u.m166197g("onExitAmbient() must be called on the main thread");
        C30627w wVar = this.f72911a;
        if (wVar.mo134796b() != null) {
            ((C30625v) wVar.mo134796b()).mo86712h();
        }
    }

    /* renamed from: f */
    public void mo85824f() {
        this.f72911a.mo134803i();
    }

    /* renamed from: g */
    public void mo85825g() {
        this.f72911a.mo134804j();
    }

    /* renamed from: h */
    public void mo85826h() {
        this.f72911a.mo134805k();
    }

    /* renamed from: i */
    public void mo85827i(@C0359n0 Bundle bundle) {
        this.f72911a.mo134806l(bundle);
    }

    /* renamed from: j */
    public void mo85828j() {
        this.f72911a.mo134807m();
    }

    /* renamed from: k */
    public void mo85829k() {
        this.f72911a.mo134808n();
    }

    public MapView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72911a = new C30627w(this, context, GoogleMapOptions.m122236e0(context, attributeSet));
        setClickable(true);
    }

    public MapView(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72911a = new C30627w(this, context, GoogleMapOptions.m122236e0(context, attributeSet));
        setClickable(true);
    }

    public MapView(@C0359n0 Context context, @C0363p0 GoogleMapOptions googleMapOptions) {
        super(context);
        this.f72911a = new C30627w(this, context, googleMapOptions);
        setClickable(true);
    }
}
