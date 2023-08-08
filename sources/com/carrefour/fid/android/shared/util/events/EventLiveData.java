package com.carrefour.fid.android.shared.util.events;

import androidx.compose.runtime.internal.C8567o;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nEventLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLiveData.kt\ncom/carrefour/fid/android/shared/util/events/EventLiveData\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,29:1\n361#2,7:30\n*S KotlinDebug\n*F\n+ 1 EventLiveData.kt\ncom/carrefour/fid/android/shared/util/events/EventLiveData\n*L\n25#1:30,7\n*E\n"})
public final class EventLiveData {
    @C12579k

    /* renamed from: b */
    public static final C28920a f70863b = new C28920a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f70864c = 8;
    @C12579k

    /* renamed from: d */
    public static final EventLiveData f70865d = new EventLiveData();
    @C12579k

    /* renamed from: a */
    public final C11677z f70866a = C10864b0.m38748c(EventLiveData$eventMap$2.f70867f);

    /* renamed from: com.carrefour.fid.android.shared.util.events.EventLiveData$a */
    public static final class C28920a {
        public /* synthetic */ C28920a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11384m
        /* renamed from: b */
        public static /* synthetic */ void m119621b() {
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final synchronized C28928c<String> mo84199a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "key");
            return EventLiveData.f70865d.mo84197c(str);
        }

        @C12579k
        @C11384m
        /* renamed from: c */
        public final EventLiveData mo84200c() {
            return EventLiveData.f70865d;
        }

        public C28920a() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: b */
    public static final synchronized C28928c<String> m119617b(@C12579k String str) {
        C28928c<String> a;
        synchronized (EventLiveData.class) {
            a = f70863b.mo84199a(str);
        }
        return a;
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final EventLiveData m119618e() {
        return f70863b.mo84200c();
    }

    @C12579k
    /* renamed from: c */
    public final C28928c<String> mo84197c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Map<String, C28928c<String>> d = mo84198d();
        C28928c<String> cVar = d.get(str);
        if (cVar == null) {
            cVar = new C28928c<>(str);
            d.put(str, cVar);
        }
        return cVar;
    }

    @C12579k
    /* renamed from: d */
    public final Map<String, C28928c<String>> mo84198d() {
        return (Map) this.f70866a.getValue();
    }
}
