package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.google.android.datatransport.cct.C40045d;
import com.google.firebase.crashlytics.internal.model.C32806a;
import com.google.firebase.crashlytics.internal.model.C32833b0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.C32937f;
import com.google.firebase.encoders.C32994a;
import com.google.firebase.encoders.json.C33013e;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.C33585u;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.assets.Assets;
import com.usabilla.sdk.ubform.p007db.telemetry.TelemetryTable;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.h */
public class C32896h {

    /* renamed from: a */
    public static final C32994a f79869a = new C33013e().mo95639k(C32806a.f79563b).mo95640l(true).mo95638j();

    /* renamed from: com.google.firebase.crashlytics.internal.model.serialization.h$a */
    public interface C32897a<T> {
        /* renamed from: a */
        T mo95503a(@C0359n0 JsonReader jsonReader) throws IOException;
    }

    @C0359n0
    /* renamed from: A */
    public static CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e m132921A(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32794a a = CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.m132578a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95330b(m132937n(jsonReader, new C32889a()));
                    break;
                case 1:
                    a.mo95332d(jsonReader.nextString());
                    break;
                case 2:
                    a.mo95331c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95329a();
    }

    @C0359n0
    /* renamed from: B */
    public static CrashlyticsReport.C32770e.C32772b m132922B(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32770e.C32772b.C32773a a = CrashlyticsReport.C32770e.C32772b.m132435a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a.mo95198c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a.mo95197b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo95196a();
    }

    @C0359n0
    /* renamed from: C */
    public static CrashlyticsReport.C32770e m132923C(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32770e.C32771a a = CrashlyticsReport.C32770e.m132428a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals(Assets.f24729v)) {
                a.mo95192b(m132937n(jsonReader, new C32893e()));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a.mo95193c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo95191a();
    }

    @C0359n0
    /* renamed from: D */
    public static CrashlyticsReport.C32774f.C32802e m132924D(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32802e.C32803a a = CrashlyticsReport.C32774f.C32802e.m132622a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95371b(jsonReader.nextString());
                    break;
                case 1:
                    a.mo95372c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a.mo95374e(jsonReader.nextString());
                    break;
                case 3:
                    a.mo95373d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95370a();
    }

    @C0359n0
    /* renamed from: E */
    public static CrashlyticsReport m132925E(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32767c b = CrashlyticsReport.m132370b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals(C33585u.C33587b.f81741w3)) {
                        c = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals(C32937f.f80028b)) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo95179f(m132923C(jsonReader));
                    break;
                case 1:
                    b.mo95181h(jsonReader.nextString());
                    break;
                case 2:
                    b.mo95175b(jsonReader.nextString());
                    break;
                case 3:
                    b.mo95177d(jsonReader.nextString());
                    break;
                case 4:
                    b.mo95178e(jsonReader.nextString());
                    break;
                case 5:
                    b.mo95180g(jsonReader.nextInt());
                    break;
                case 6:
                    b.mo95176c(jsonReader.nextString());
                    break;
                case 7:
                    b.mo95182i(m132926F(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo95174a();
    }

    @C0359n0
    /* renamed from: F */
    public static CrashlyticsReport.C32774f m132926F(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32779b a = CrashlyticsReport.C32774f.m132441a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(FirebaseMessaging.f80405r)) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals(C38212b.f96784D)) {
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 9;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95247l(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo95245j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo95240e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a.mo95239d(m132940q(jsonReader));
                    break;
                case 4:
                    a.mo95241f(m132937n(jsonReader, new C32890b()));
                    break;
                case 5:
                    a.mo95246k(m132924D(jsonReader));
                    break;
                case 6:
                    a.mo95237b(m132935l(jsonReader));
                    break;
                case 7:
                    a.mo95248m(m132927G(jsonReader));
                    break;
                case 8:
                    a.mo95242g(jsonReader.nextString());
                    break;
                case 9:
                    a.mo95238c(jsonReader.nextBoolean());
                    break;
                case 10:
                    a.mo95243h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95236a();
    }

    @C0359n0
    /* renamed from: G */
    public static CrashlyticsReport.C32774f.C32804f m132927G(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32804f.C32805a a = CrashlyticsReport.C32774f.C32804f.m132632a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a.mo95377b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo95376a();
    }

    @C0359n0
    /* renamed from: l */
    public static CrashlyticsReport.C32774f.C32775a m132935l(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32775a.C32776a a = CrashlyticsReport.C32774f.C32775a.m132458a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95228e(jsonReader.nextString());
                    break;
                case 1:
                    a.mo95225b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo95226c(jsonReader.nextString());
                    break;
                case 3:
                    a.mo95231h(jsonReader.nextString());
                    break;
                case 4:
                    a.mo95229f(jsonReader.nextString());
                    break;
                case 5:
                    a.mo95227d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95224a();
    }

    @C0359n0
    /* renamed from: m */
    public static CrashlyticsReport.C32762a m132936m(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32762a.C32765b a = CrashlyticsReport.C32762a.m132385a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95165b(m132937n(jsonReader, new C32895g()));
                    break;
                case 1:
                    a.mo95167d(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo95169f(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo95171h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo95172i(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo95168e(jsonReader.nextString());
                    break;
                case 6:
                    a.mo95170g(jsonReader.nextInt());
                    break;
                case 7:
                    a.mo95173j(jsonReader.nextString());
                    break;
                case 8:
                    a.mo95166c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95164a();
    }

    @C0359n0
    /* renamed from: n */
    public static <T> C32833b0<T> m132937n(@C0359n0 JsonReader jsonReader, @C0359n0 C32897a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo95503a(jsonReader));
        }
        jsonReader.endArray();
        return C32833b0.m132702e(arrayList);
    }

    @C0359n0
    /* renamed from: o */
    public static CrashlyticsReport.C32762a.C32763a m132938o(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32762a.C32763a.C32764a a = CrashlyticsReport.C32762a.C32763a.m132395a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95163d(jsonReader.nextString());
                    break;
                case 1:
                    a.mo95161b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo95162c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95160a();
    }

    @C0359n0
    /* renamed from: p */
    public static CrashlyticsReport.C32768d m132939p(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32768d.C32769a a = CrashlyticsReport.C32768d.m132422a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a.mo95186b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a.mo95187c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo95185a();
    }

    @C0359n0
    /* renamed from: q */
    public static CrashlyticsReport.C32774f.C32780c m132940q(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32780c.C32781a a = CrashlyticsReport.C32774f.C32780c.m132494a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals(C40045d.f102104u)) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95266i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a.mo95262e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo95265h(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo95259b(jsonReader.nextInt());
                    break;
                case 4:
                    a.mo95261d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo95260c(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo95263f(jsonReader.nextString());
                    break;
                case 7:
                    a.mo95267j(jsonReader.nextInt());
                    break;
                case 8:
                    a.mo95264g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95258a();
    }

    @C0359n0
    /* renamed from: r */
    public static CrashlyticsReport.C32774f.C32782d m132941r(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32797b a = CrashlyticsReport.C32774f.C32782d.m132514a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(FirebaseMessaging.f80405r)) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals(TelemetryTable.f26835g)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95346c(m132944u(jsonReader));
                    break;
                case 1:
                    a.mo95345b(m132942s(jsonReader));
                    break;
                case 2:
                    a.mo95347d(m132948y(jsonReader));
                    break;
                case 3:
                    a.mo95349f(jsonReader.nextString());
                    break;
                case 4:
                    a.mo95348e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95344a();
    }

    @C0359n0
    /* renamed from: s */
    public static CrashlyticsReport.C32774f.C32782d.C32783a m132942s(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32783a.C32784a a = CrashlyticsReport.C32774f.C32782d.C32783a.m132521a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95281b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a.mo95283d(m132945v(jsonReader));
                    break;
                case 2:
                    a.mo95284e(m132937n(jsonReader, new C32894f()));
                    break;
                case 3:
                    a.mo95282c(m132937n(jsonReader, new C32894f()));
                    break;
                case 4:
                    a.mo95285f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95280a();
    }

    @C0359n0
    /* renamed from: t */
    public static CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a m132943t(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a.C32787a a = CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a.m132540a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals(C9168d0.f24889w)) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95298c(jsonReader.nextString());
                    break;
                case 1:
                    a.mo95299d(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo95301f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a.mo95297b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95296a();
    }

    @C0359n0
    /* renamed from: u */
    public static CrashlyticsReport.C32774f.C32782d.C32798c m132944u(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32798c.C32799a a = CrashlyticsReport.C32774f.C32782d.C32798c.m132604a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95357b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a.mo95358c(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo95360e(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo95359d(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo95362g(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo95361f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95356a();
    }

    @C0359n0
    /* renamed from: v */
    public static CrashlyticsReport.C32774f.C32782d.C32783a.C32785b m132945v(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32788b a = CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.m132534a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95303b(m132936m(jsonReader));
                    break;
                case 1:
                    a.mo95307f(m132937n(jsonReader, new C32891c()));
                    break;
                case 2:
                    a.mo95306e(m132949z(jsonReader));
                    break;
                case 3:
                    a.mo95304c(m132937n(jsonReader, new C32892d()));
                    break;
                case 4:
                    a.mo95305d(m132946w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95302a();
    }

    @C0359n0
    /* renamed from: w */
    public static CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c m132946w(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.C32790a a = CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.m132558a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95315c(m132937n(jsonReader, new C32889a()));
                    break;
                case 1:
                    a.mo95317e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo95318f(jsonReader.nextString());
                    break;
                case 3:
                    a.mo95314b(m132946w(jsonReader));
                    break;
                case 4:
                    a.mo95316d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95313a();
    }

    @C0359n0
    /* renamed from: x */
    public static CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b m132947x(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.C32796a a = CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.m132586a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(C16717v.C16720c.f42211R)) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95341d(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo95343f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo95342e(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo95339b(jsonReader.nextString());
                    break;
                case 4:
                    a.mo95340c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95338a();
    }

    @C0359n0
    /* renamed from: y */
    public static CrashlyticsReport.C32774f.C32782d.C32800d m132948y(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32800d.C32801a a = CrashlyticsReport.C32774f.C32782d.C32800d.m132618a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a.mo95365b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo95364a();
    }

    @C0359n0
    /* renamed from: z */
    public static CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d m132949z(@C0359n0 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d.C32792a a = CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d.m132570a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo95323b(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo95324c(jsonReader.nextString());
                    break;
                case 2:
                    a.mo95325d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo95322a();
    }

    @C0359n0
    /* renamed from: H */
    public CrashlyticsReport mo95504H(@C0359n0 String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport E = m132925E(jsonReader);
            jsonReader.close();
            return E;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C0359n0
    /* renamed from: I */
    public String mo95505I(@C0359n0 CrashlyticsReport crashlyticsReport) {
        return f79869a.mo95627b(crashlyticsReport);
    }

    @C0359n0
    /* renamed from: h */
    public CrashlyticsReport.C32762a mo95506h(@C0359n0 String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport.C32762a m = m132936m(jsonReader);
            jsonReader.close();
            return m;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C0359n0
    /* renamed from: i */
    public String mo95507i(@C0359n0 CrashlyticsReport.C32762a aVar) {
        return f79869a.mo95627b(aVar);
    }

    @C0359n0
    /* renamed from: j */
    public CrashlyticsReport.C32774f.C32782d mo95508j(@C0359n0 String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport.C32774f.C32782d r = m132941r(jsonReader);
            jsonReader.close();
            return r;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C0359n0
    /* renamed from: k */
    public String mo95509k(@C0359n0 CrashlyticsReport.C32774f.C32782d dVar) {
        return f79869a.mo95627b(dVar);
    }
}
