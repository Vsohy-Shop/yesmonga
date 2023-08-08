package com.urbanairship.modules;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.AirshipVersionInfo;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.channel.C9008d;
import com.urbanairship.config.C9061a;
import com.urbanairship.contacts.C9074e;
import com.urbanairship.modules.aaid.AdIdModuleFactory;
import com.urbanairship.modules.accengage.AccengageModule;
import com.urbanairship.modules.accengage.AccengageModuleFactory;
import com.urbanairship.modules.automation.AutomationModuleFactory;
import com.urbanairship.modules.chat.ChatModuleFactory;
import com.urbanairship.modules.debug.DebugModuleFactory;
import com.urbanairship.modules.location.LocationModule;
import com.urbanairship.modules.location.LocationModuleFactory;
import com.urbanairship.modules.messagecenter.MessageCenterModuleFactory;
import com.urbanairship.modules.preferencecenter.PreferenceCenterModuleFactory;
import com.urbanairship.permission.C9439p;
import com.urbanairship.push.C9537t;
import com.urbanairship.remotedata.C9619j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Modules {

    /* renamed from: a */
    public static final String f25728a = "com.urbanairship.accengage.AccengageModuleFactoryImpl";

    /* renamed from: b */
    public static final String f25729b = "com.urbanairship.messagecenter.MessageCenterModuleFactoryImpl";

    /* renamed from: c */
    public static final String f25730c = "com.urbanairship.location.LocationModuleFactoryImpl";

    /* renamed from: d */
    public static final String f25731d = "com.urbanairship.automation.AutomationModuleFactoryImpl";

    /* renamed from: e */
    public static final String f25732e = "com.urbanairship.debug.DebugModuleFactoryImpl";

    /* renamed from: f */
    public static final String f25733f = "com.urbanairship.aaid.AdIdModuleFactoryImpl";

    /* renamed from: g */
    public static final String f25734g = "com.urbanairship.chat.ChatModuleFactoryImpl";

    /* renamed from: h */
    public static final String f25735h = "com.urbanairship.preferencecenter.PreferenceCenterModuleFactoryImpl";

    @C0363p0
    /* renamed from: a */
    public static AccengageModule m35399a(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar) {
        try {
            AccengageModuleFactory accengageModuleFactory = (AccengageModuleFactory) m35403e(f25728a, AccengageModuleFactory.class);
            if (accengageModuleFactory != null) {
                return accengageModuleFactory.build(context, airshipConfigOptions, uVar, vVar, dVar, tVar);
            }
            return null;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to build Accengage module", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public static Module m35400b(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C35518b bVar) {
        try {
            AdIdModuleFactory adIdModuleFactory = (AdIdModuleFactory) m35403e(f25733f, AdIdModuleFactory.class);
            if (adIdModuleFactory != null) {
                return adIdModuleFactory.mo19101e(context, uVar, aVar, vVar, bVar);
            }
            return null;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to build Ad Id module", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: c */
    public static Module m35401c(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar, @C0359n0 C35518b bVar, @C0359n0 C9619j jVar, @C0359n0 C9074e eVar) {
        try {
            AutomationModuleFactory automationModuleFactory = (AutomationModuleFactory) m35403e(f25731d, AutomationModuleFactory.class);
            if (automationModuleFactory != null) {
                return automationModuleFactory.build(context, uVar, aVar, vVar, dVar, tVar, bVar, jVar, eVar);
            }
            return null;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to build Automation module", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: d */
    public static Module m35402d(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar) {
        try {
            ChatModuleFactory chatModuleFactory = (ChatModuleFactory) m35403e(f25734g, ChatModuleFactory.class);
            if (chatModuleFactory != null) {
                return chatModuleFactory.mo19105c(context, uVar, aVar, vVar, dVar, tVar);
            }
            return null;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to build Chat module", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: e */
    public static <T extends AirshipVersionInfo> T m35403e(@C0359n0 String str, @C0359n0 Class<T> cls) {
        try {
            T t = (AirshipVersionInfo) Class.forName(str).asSubclass(cls).newInstance();
            if (UAirship.m146181I().equals(t.getAirshipVersion())) {
                return t;
            }
            C36059m.m148409e("Unable to load module with factory %s, versions do not match. Core Version: %s, Module Version: %s.", cls, UAirship.m146181I(), t.getAirshipVersion());
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            C36059m.m148411g(e, "Unable to create module factory %s", cls);
            return null;
        }
    }

    @C0363p0
    /* renamed from: f */
    public static Module m35404f(@C0359n0 Context context, @C0359n0 C36071u uVar) {
        try {
            DebugModuleFactory debugModuleFactory = (DebugModuleFactory) m35403e(f25732e, DebugModuleFactory.class);
            if (debugModuleFactory != null) {
                return debugModuleFactory.mo19106b(context, uVar);
            }
            return null;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to build Debug module", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: g */
    public static LocationModule m35405g(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9439p pVar) {
        try {
            LocationModuleFactory locationModuleFactory = (LocationModuleFactory) m35403e(f25730c, LocationModuleFactory.class);
            if (locationModuleFactory != null) {
                return locationModuleFactory.mo19113d(context, uVar, vVar, dVar, pVar);
            }
            return null;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to build Location module", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: h */
    public static Module m35406h(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9008d dVar, @C0359n0 C9537t tVar, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        try {
            MessageCenterModuleFactory messageCenterModuleFactory = (MessageCenterModuleFactory) m35403e(f25729b, MessageCenterModuleFactory.class);
            if (messageCenterModuleFactory != null) {
                return messageCenterModuleFactory.build(context, uVar, vVar, dVar, tVar, airshipConfigOptions);
            }
            return null;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to build Message Center module", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: i */
    public static Module m35407i(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9619j jVar) {
        try {
            PreferenceCenterModuleFactory preferenceCenterModuleFactory = (PreferenceCenterModuleFactory) m35403e(f25735h, PreferenceCenterModuleFactory.class);
            if (preferenceCenterModuleFactory != null) {
                return preferenceCenterModuleFactory.mo19114a(context, uVar, vVar, jVar);
            }
            return null;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to build Preference Center module", new Object[0]);
            return null;
        }
    }
}
