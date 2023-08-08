package com.google.android.play.core.splitinstall.testing;

import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.testing.i */
public final /* synthetic */ class C32208i implements Runnable {

    /* renamed from: a */
    public final C32200a f78535a;

    /* renamed from: b */
    public final List f78536b;

    /* renamed from: c */
    public final List f78537c;

    /* renamed from: d */
    public final List f78538d;

    /* renamed from: e */
    public final long f78539e;

    /* renamed from: f */
    public final /* synthetic */ int f78540f = 1;

    public C32208i(C32200a aVar, long j, List list, List list2, List list3) {
        this.f78535a = aVar;
        this.f78539e = j;
        this.f78536b = list;
        this.f78537c = list2;
        this.f78538d = list3;
    }

    public final void run() {
        if (this.f78540f != 0) {
            this.f78535a.mo93000s(this.f78539e, this.f78536b, this.f78537c, this.f78538d);
        } else {
            this.f78535a.mo92999r(this.f78536b, this.f78537c, this.f78538d, this.f78539e);
        }
    }

    public C32208i(C32200a aVar, List list, List list2, List list3, long j) {
        this.f78535a = aVar;
        this.f78536b = list;
        this.f78537c = list2;
        this.f78538d = list3;
        this.f78539e = j;
    }
}
