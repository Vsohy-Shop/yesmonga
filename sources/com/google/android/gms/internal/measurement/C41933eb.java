package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.eb */
public final class C41933eb {

    /* renamed from: c */
    public static final C41933eb f106099c = new C41933eb();

    /* renamed from: a */
    public final C42005ib f106100a = new C42127pa();

    /* renamed from: b */
    public final ConcurrentMap f106101b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C41933eb m169828a() {
        return f106099c;
    }

    /* renamed from: b */
    public final C41987hb mo136721b(Class cls) {
        C41860aa.m169668c(cls, "messageType");
        C41987hb hbVar = (C41987hb) this.f106101b.get(cls);
        if (hbVar == null) {
            hbVar = this.f106100a.mo137036a(cls);
            C41860aa.m169668c(cls, "messageType");
            C41860aa.m169668c(hbVar, "schema");
            C41987hb hbVar2 = (C41987hb) this.f106101b.putIfAbsent(cls, hbVar);
            if (hbVar2 == null) {
                return hbVar;
            }
            return hbVar2;
        }
        return hbVar;
    }
}
