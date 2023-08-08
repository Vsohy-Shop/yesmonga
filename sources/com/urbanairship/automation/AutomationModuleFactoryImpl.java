package com.urbanairship.automation;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.automation.C8978x;
import com.urbanairship.channel.C9008d;
import com.urbanairship.config.C9061a;
import com.urbanairship.contacts.C9074e;
import com.urbanairship.iam.C9262y;
import com.urbanairship.modules.Module;
import com.urbanairship.modules.automation.AutomationModuleFactory;
import com.urbanairship.push.C9537t;
import com.urbanairship.remotedata.C9619j;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AutomationModuleFactoryImpl implements AutomationModuleFactory {
    @C0359n0
    public Module build(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar, @C0359n0 C35518b bVar, @C0359n0 C9619j jVar, @C0359n0 C9074e eVar) {
        Context context2 = context;
        C36071u uVar2 = uVar;
        C8928r rVar = new C8928r(context2, uVar2, aVar, vVar, bVar, jVar, dVar, eVar);
        return Module.multipleComponents(Arrays.asList(new C36040b[]{rVar, new C9262y(context2, uVar2, rVar, bVar, tVar)}), C8978x.C8995q.ua_automation_actions);
    }

    @C0359n0
    public String getAirshipVersion() {
        return "16.9.2";
    }

    @C0359n0
    public String getPackageVersion() {
        return C8892h.f23848e;
    }
}
