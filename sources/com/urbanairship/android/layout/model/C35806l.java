package com.urbanairship.android.layout.model;

import com.urbanairship.json.C9323b;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.model.l */
public interface C35806l {
    @C12579k

    /* renamed from: a */
    public static final C35807a f88426a = C35807a.f88427a;

    /* renamed from: com.urbanairship.android.layout.model.l$a */
    public static final class C35807a {

        /* renamed from: a */
        public static final /* synthetic */ C35807a f88427a = new C35807a();

        @C11384m
        /* renamed from: a */
        public final boolean mo107237a(@C12579k C9323b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "json");
            return bVar.mo18801A("ignore_safe_area").mo18757c(false);
        }
    }

    @C11384m
    /* renamed from: b */
    static boolean m147617b(@C12579k C9323b bVar) {
        return f88426a.mo107237a(bVar);
    }

    /* renamed from: a */
    boolean mo107236a();
}
