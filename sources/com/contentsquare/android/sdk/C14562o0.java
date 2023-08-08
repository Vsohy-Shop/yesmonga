package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.o0 */
public class C14562o0 {

    /* renamed from: a */
    public final C14705sb f36046a;

    public C14562o0(C14705sb sbVar) {
        this.f36046a = sbVar;
    }

    /* renamed from: a */
    public void mo36005a(long j) {
        this.f36046a.mo36001i("last_event_timestamp", j);
    }

    /* renamed from: b */
    public void mo36006b(String str) {
        this.f36046a.mo36002j("scheduled_app_hide_event", str);
    }

    /* renamed from: c */
    public void mo36007c(boolean z) {
        this.f36046a.mo36003k("is_hide_event_pending", z);
    }

    /* renamed from: d */
    public boolean mo36008d() {
        return this.f36046a.mo35999f("is_hide_event_pending", false);
    }

    /* renamed from: e */
    public long mo36009e() {
        return this.f36046a.mo35995b("last_event_timestamp", 0);
    }

    /* renamed from: f */
    public void mo36010f() {
        this.f36046a.mo36004l("is_hide_event_pending");
    }

    /* renamed from: g */
    public void mo36011g() {
        this.f36046a.mo36004l("scheduled_app_hide_event");
    }

    /* renamed from: h */
    public void mo36012h() {
        this.f36046a.mo36004l("scheduled_app_hide_event");
        this.f36046a.mo36004l("last_event_timestamp");
        this.f36046a.mo36004l("is_hide_event_pending");
    }

    /* renamed from: i */
    public String mo36013i() {
        return this.f36046a.mo35997d("scheduled_app_hide_event", (String) null);
    }
}
