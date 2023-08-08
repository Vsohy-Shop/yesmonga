package com.google.android.play.core.internal;

import com.google.android.play.core.splitinstall.C32174i0;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.v */
public final class C32095v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f78303a;

    /* renamed from: b */
    public final /* synthetic */ C32174i0 f78304b;

    /* renamed from: c */
    public final /* synthetic */ C32098w f78305c;

    public C32095v(C32098w wVar, List list, C32174i0 i0Var) {
        this.f78305c = wVar;
        this.f78303a = list;
        this.f78304b = i0Var;
    }

    public final void run() {
        try {
            if (this.f78305c.f78309c.mo92845c(this.f78303a)) {
                C32098w.m129970c(this.f78305c, this.f78304b);
            } else {
                C32098w.m129971d(this.f78305c, this.f78303a, this.f78304b);
            }
        } catch (Exception unused) {
            this.f78304b.mo92976b(-11);
        }
    }
}
