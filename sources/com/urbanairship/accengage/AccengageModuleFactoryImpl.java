package com.urbanairship.accengage;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.channel.C9008d;
import com.urbanairship.modules.accengage.AccengageModule;
import com.urbanairship.modules.accengage.AccengageModuleFactory;
import com.urbanairship.modules.accengage.AccengageNotificationHandler;
import com.urbanairship.push.C9537t;
import com.urbanairship.push.notifications.C9524n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AccengageModuleFactoryImpl implements AccengageModuleFactory {

    /* renamed from: com.urbanairship.accengage.AccengageModuleFactoryImpl$a */
    public class C35447a implements AccengageNotificationHandler {

        /* renamed from: a */
        public final /* synthetic */ C35448a f87303a;

        public C35447a(C35448a aVar) {
            this.f87303a = aVar;
        }

        @C0359n0
        public C9524n getNotificationProvider() {
            return this.f87303a.mo106237E();
        }
    }

    @C0359n0
    public AccengageModule build(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar) {
        C35448a aVar = new C35448a(context, airshipConfigOptions, uVar, vVar, dVar, tVar);
        return new AccengageModule(aVar, new C35447a(aVar));
    }

    @C0359n0
    public String getAirshipVersion() {
        return "16.9.2";
    }

    @C0359n0
    public String getPackageVersion() {
        return C35455d.f87386e;
    }
}
