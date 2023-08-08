package com.urbanairship.messagecenter;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.channel.C9008d;
import com.urbanairship.messagecenter.C9401y;
import com.urbanairship.modules.Module;
import com.urbanairship.modules.messagecenter.MessageCenterModuleFactory;
import com.urbanairship.push.C9537t;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MessageCenterModuleFactoryImpl implements MessageCenterModuleFactory {
    @C0359n0
    public Module build(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        return Module.singleComponent(new C9372h(context, uVar, vVar, dVar, tVar, airshipConfigOptions), C9401y.C9419r.ua_message_center_actions);
    }

    @C0359n0
    public String getAirshipVersion() {
        return "16.9.2";
    }

    @C0359n0
    public String getPackageVersion() {
        return C9350a.f25542e;
    }
}
