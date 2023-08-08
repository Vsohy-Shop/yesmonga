package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C34959u;
import java.util.List;

/* renamed from: com.journeyapps.barcodescanner.camera.n */
public class C34929n {

    /* renamed from: e */
    public static final String f84978e = "n";

    /* renamed from: a */
    public C34959u f84979a;

    /* renamed from: b */
    public int f84980b;

    /* renamed from: c */
    public boolean f84981c = false;

    /* renamed from: d */
    public C34935s f84982d = new C34930o();

    public C34929n(int i) {
        this.f84980b = i;
    }

    /* renamed from: a */
    public C34959u mo103485a(List<C34959u> list, boolean z) {
        return this.f84982d.mo103492b(list, mo103486b(z));
    }

    /* renamed from: b */
    public C34959u mo103486b(boolean z) {
        C34959u uVar = this.f84979a;
        if (uVar == null) {
            return null;
        }
        if (z) {
            return uVar.mo103555q();
        }
        return uVar;
    }

    /* renamed from: c */
    public C34935s mo103487c() {
        return this.f84982d;
    }

    /* renamed from: d */
    public int mo103488d() {
        return this.f84980b;
    }

    /* renamed from: e */
    public C34959u mo103489e() {
        return this.f84979a;
    }

    /* renamed from: f */
    public Rect mo103490f(C34959u uVar) {
        return this.f84982d.mo103484d(uVar, this.f84979a);
    }

    /* renamed from: g */
    public void mo103491g(C34935s sVar) {
        this.f84982d = sVar;
    }

    public C34929n(int i, C34959u uVar) {
        this.f84980b = i;
        this.f84979a = uVar;
    }
}
