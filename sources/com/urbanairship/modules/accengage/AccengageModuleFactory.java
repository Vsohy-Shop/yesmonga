package com.urbanairship.modules.accengage;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.AirshipVersionInfo;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.channel.C9008d;
import com.urbanairship.push.C9537t;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface AccengageModuleFactory extends AirshipVersionInfo {
    @C0359n0
    AccengageModule build(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar);
}
