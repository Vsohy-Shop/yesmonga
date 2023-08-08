package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C38042l;
import com.carrefour.fid.android.domain.models.C38049m;
import com.carrefour.fid.android.shared.base.C28486g;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.i0 */
public final class C36496i0 extends C28486g<C38042l, C38049m> {

    /* renamed from: b */
    public static final int f90186b = 0;

    @C12579k
    /* renamed from: d */
    public C38049m mo72340a(@C12579k C38042l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "entity");
        return new C38049m(lVar.mo117791d(), new JSONObject(C10977s0.m41430D0(lVar.mo117788a())));
    }
}
