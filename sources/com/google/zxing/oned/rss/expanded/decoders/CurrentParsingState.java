package com.google.zxing.oned.rss.expanded.decoders;

public final class CurrentParsingState {

    /* renamed from: a */
    public int f84463a = 0;

    /* renamed from: b */
    public State f84464b = State.NUMERIC;

    public enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* renamed from: a */
    public int mo102969a() {
        return this.f84463a;
    }

    /* renamed from: b */
    public void mo102970b(int i) {
        this.f84463a += i;
    }

    /* renamed from: c */
    public boolean mo102971c() {
        return this.f84464b == State.ALPHA;
    }

    /* renamed from: d */
    public boolean mo102972d() {
        return this.f84464b == State.ISO_IEC_646;
    }

    /* renamed from: e */
    public boolean mo102973e() {
        return this.f84464b == State.NUMERIC;
    }

    /* renamed from: f */
    public void mo102974f() {
        this.f84464b = State.ALPHA;
    }

    /* renamed from: g */
    public void mo102975g() {
        this.f84464b = State.ISO_IEC_646;
    }

    /* renamed from: h */
    public void mo102976h() {
        this.f84464b = State.NUMERIC;
    }

    /* renamed from: i */
    public void mo102977i(int i) {
        this.f84463a = i;
    }
}
