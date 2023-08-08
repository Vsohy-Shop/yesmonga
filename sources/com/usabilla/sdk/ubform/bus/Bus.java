package com.usabilla.sdk.ubform.bus;

import com.usabilla.sdk.ubform.bus.C9744a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.C11079d2;
import kotlin.collections.C10994x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class Bus implements C9744a {
    @C12579k

    /* renamed from: a */
    public static final Bus f26721a = new Bus();
    @C12579k

    /* renamed from: b */
    public static final LinkedHashMap<BusEvent, C9746b> f26722b = new LinkedHashMap<>();
    @C12579k

    /* renamed from: c */
    public static final ArrayList<C9744a.C9745a<?>> f26723c = new ArrayList<>();

    @C12579k
    /* renamed from: a */
    public ArrayList<C9744a.C9745a<?>> mo19918a() {
        return f26723c;
    }

    /* renamed from: b */
    public void mo19919b(@C12579k BusEvent busEvent, @C12579k C9746b bVar) {
        Intrinsics.checkNotNullParameter(busEvent, "event");
        Intrinsics.checkNotNullParameter(bVar, "subscriber");
        if (!mo19922e().containsKey(busEvent)) {
            mo19922e().put(busEvent, bVar);
            for (C9744a.C9745a aVar : mo19918a()) {
                if (aVar.mo19927e() == busEvent) {
                    f26721a.mo19920c(aVar.mo19927e(), aVar.mo19929f());
                }
            }
            C10994x.m42348I0(mo19918a(), new Bus$subscribe$2(busEvent));
        }
    }

    /* renamed from: c */
    public <T> void mo19920c(@C12579k BusEvent busEvent, T t) {
        C11079d2 d2Var;
        Intrinsics.checkNotNullParameter(busEvent, "event");
        C9746b bVar = mo19922e().get(busEvent);
        if (bVar == null) {
            d2Var = null;
        } else {
            bVar.mo19932v(busEvent, t);
            d2Var = C11079d2.f28267a;
        }
        if (d2Var == null) {
            mo19918a().add(new C9744a.C9745a(busEvent, t));
        }
    }

    /* renamed from: d */
    public void mo19921d(@C12579k BusEvent busEvent) {
        Intrinsics.checkNotNullParameter(busEvent, "event");
        mo19922e().remove(busEvent);
    }

    @C12579k
    /* renamed from: e */
    public LinkedHashMap<BusEvent, C9746b> mo19922e() {
        return f26722b;
    }
}
