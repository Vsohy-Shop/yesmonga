package com.carrefour.fid.android.shared.util.events;

import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class EventLifecycleObserverKt$EventLifecycleObserver$8$observer$1 implements C19470t {

    /* renamed from: a */
    public final /* synthetic */ C11289a<C11079d2> f70856a;

    /* renamed from: b */
    public final /* synthetic */ C11289a<C11079d2> f70857b;

    /* renamed from: c */
    public final /* synthetic */ C11289a<C11079d2> f70858c;

    /* renamed from: d */
    public final /* synthetic */ C11289a<C11079d2> f70859d;

    /* renamed from: e */
    public final /* synthetic */ C11289a<C11079d2> f70860e;

    /* renamed from: f */
    public final /* synthetic */ C11289a<C11079d2> f70861f;

    /* renamed from: g */
    public final /* synthetic */ C11289a<C11079d2> f70862g;

    /* renamed from: com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$8$observer$1$a */
    public /* synthetic */ class C28919a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.C19372Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt$EventLifecycleObserver$8$observer$1.C28919a.<clinit>():void");
        }
    }

    public EventLifecycleObserverKt$EventLifecycleObserver$8$observer$1(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7) {
        this.f70856a = aVar;
        this.f70857b = aVar2;
        this.f70858c = aVar3;
        this.f70859d = aVar4;
        this.f70860e = aVar5;
        this.f70861f = aVar6;
        this.f70862g = aVar7;
    }

    /* renamed from: i */
    public final void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (C28919a.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                this.f70856a.invoke();
                return;
            case 2:
                this.f70857b.invoke();
                return;
            case 3:
                this.f70858c.invoke();
                return;
            case 4:
                this.f70859d.invoke();
                return;
            case 5:
                this.f70860e.invoke();
                return;
            case 6:
                this.f70861f.invoke();
                return;
            case 7:
                this.f70862g.invoke();
                return;
            default:
                return;
        }
    }
}
