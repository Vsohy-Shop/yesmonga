package com.journeyapps.barcodescanner.camera;

public class CameraSettings {

    /* renamed from: a */
    public int f84891a = -1;

    /* renamed from: b */
    public boolean f84892b = false;

    /* renamed from: c */
    public boolean f84893c = false;

    /* renamed from: d */
    public boolean f84894d = false;

    /* renamed from: e */
    public boolean f84895e = true;

    /* renamed from: f */
    public boolean f84896f = false;

    /* renamed from: g */
    public boolean f84897g = false;

    /* renamed from: h */
    public boolean f84898h = false;

    /* renamed from: i */
    public FocusMode f84899i = FocusMode.AUTO;

    public enum FocusMode {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    /* renamed from: a */
    public FocusMode mo103387a() {
        return this.f84899i;
    }

    /* renamed from: b */
    public int mo103388b() {
        return this.f84891a;
    }

    /* renamed from: c */
    public boolean mo103389c() {
        return this.f84895e;
    }

    /* renamed from: d */
    public boolean mo103390d() {
        return this.f84898h;
    }

    /* renamed from: e */
    public boolean mo103391e() {
        return this.f84893c;
    }

    /* renamed from: f */
    public boolean mo103392f() {
        return this.f84896f;
    }

    /* renamed from: g */
    public boolean mo103393g() {
        return this.f84897g;
    }

    /* renamed from: h */
    public boolean mo103394h() {
        return this.f84894d;
    }

    /* renamed from: i */
    public boolean mo103395i() {
        return this.f84892b;
    }

    /* renamed from: j */
    public void mo103396j(boolean z) {
        this.f84895e = z;
        if (z && this.f84896f) {
            this.f84899i = FocusMode.CONTINUOUS;
        } else if (z) {
            this.f84899i = FocusMode.AUTO;
        } else {
            this.f84899i = null;
        }
    }

    /* renamed from: k */
    public void mo103397k(boolean z) {
        this.f84898h = z;
    }

    /* renamed from: l */
    public void mo103398l(boolean z) {
        this.f84893c = z;
    }

    /* renamed from: m */
    public void mo103399m(boolean z) {
        this.f84896f = z;
        if (z) {
            this.f84899i = FocusMode.CONTINUOUS;
        } else if (this.f84895e) {
            this.f84899i = FocusMode.AUTO;
        } else {
            this.f84899i = null;
        }
    }

    /* renamed from: n */
    public void mo103400n(boolean z) {
        this.f84897g = z;
    }

    /* renamed from: o */
    public void mo103401o(FocusMode focusMode) {
        this.f84899i = focusMode;
    }

    /* renamed from: p */
    public void mo103402p(boolean z) {
        this.f84894d = z;
    }

    /* renamed from: q */
    public void mo103403q(int i) {
        this.f84891a = i;
    }

    /* renamed from: r */
    public void mo103404r(boolean z) {
        this.f84892b = z;
    }
}
