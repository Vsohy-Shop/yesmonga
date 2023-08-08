package com.urbanairship.android.layout.environment;

import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.android.layout.C35700k;
import com.urbanairship.android.layout.reporting.C35868d;
import com.urbanairship.json.JsonValue;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.environment.g */
public final class C35597g implements C35591a {
    @C12579k

    /* renamed from: a */
    public final C35700k f88007a;

    public C35597g(@C12579k C35700k kVar) {
        Intrinsics.checkNotNullParameter(kVar, C40852x.C40853a.f103958a);
        this.f88007a = kVar;
    }

    /* renamed from: a */
    public void mo106638a(@C12579k Map<String, ? extends JsonValue> map, @C12579k C35868d dVar) {
        Intrinsics.checkNotNullParameter(map, "actions");
        Intrinsics.checkNotNullParameter(dVar, "state");
        this.f88007a.mo18503h(map, dVar);
    }

    @C12579k
    /* renamed from: b */
    public final C35700k mo106646b() {
        return this.f88007a;
    }
}
