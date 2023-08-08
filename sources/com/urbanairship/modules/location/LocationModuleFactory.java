package com.urbanairship.modules.location;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipVersionInfo;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.channel.C9008d;
import com.urbanairship.permission.C9439p;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface LocationModuleFactory extends AirshipVersionInfo {
    @C0359n0
    /* renamed from: d */
    LocationModule mo19113d(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9439p pVar);
}
