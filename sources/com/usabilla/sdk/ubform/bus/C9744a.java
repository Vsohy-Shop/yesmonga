package com.usabilla.sdk.ubform.bus;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.bus.a */
public interface C9744a {

    /* renamed from: com.usabilla.sdk.ubform.bus.a$a */
    public static final class C9745a<T> {
        @C12579k

        /* renamed from: a */
        public final BusEvent f26727a;

        /* renamed from: b */
        public final T f26728b;

        public C9745a(@C12579k BusEvent busEvent, T t) {
            Intrinsics.checkNotNullParameter(busEvent, "event");
            this.f26727a = busEvent;
            this.f26728b = t;
        }

        /* renamed from: d */
        public static /* synthetic */ C9745a m36517d(C9745a aVar, BusEvent busEvent, T t, int i, Object obj) {
            if ((i & 1) != 0) {
                busEvent = aVar.f26727a;
            }
            if ((i & 2) != 0) {
                t = aVar.f26728b;
            }
            return aVar.mo19926c(busEvent, t);
        }

        @C12579k
        /* renamed from: a */
        public final BusEvent mo19924a() {
            return this.f26727a;
        }

        /* renamed from: b */
        public final T mo19925b() {
            return this.f26728b;
        }

        @C12579k
        /* renamed from: c */
        public final C9745a<T> mo19926c(@C12579k BusEvent busEvent, T t) {
            Intrinsics.checkNotNullParameter(busEvent, "event");
            return new C9745a<>(busEvent, t);
        }

        @C12579k
        /* renamed from: e */
        public final BusEvent mo19927e() {
            return this.f26727a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9745a)) {
                return false;
            }
            C9745a aVar = (C9745a) obj;
            return this.f26727a == aVar.f26727a && Intrinsics.areEqual((Object) this.f26728b, (Object) aVar.f26728b);
        }

        /* renamed from: f */
        public final T mo19929f() {
            return this.f26728b;
        }

        public int hashCode() {
            int hashCode = this.f26727a.hashCode() * 31;
            T t = this.f26728b;
            return hashCode + (t == null ? 0 : t.hashCode());
        }

        @C12579k
        public String toString() {
            return "QueuedBusEvent(event=" + this.f26727a + ", payload=" + this.f26728b + ')';
        }
    }

    @C12579k
    /* renamed from: a */
    ArrayList<C9745a<?>> mo19918a();

    /* renamed from: b */
    void mo19919b(@C12579k BusEvent busEvent, @C12579k C9746b bVar);

    /* renamed from: c */
    <T> void mo19920c(@C12579k BusEvent busEvent, T t);

    /* renamed from: d */
    void mo19921d(@C12579k BusEvent busEvent);

    @C12579k
    /* renamed from: e */
    LinkedHashMap<BusEvent, C9746b> mo19922e();
}
