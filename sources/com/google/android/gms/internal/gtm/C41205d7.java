package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import androidx.room.C20369t1;
import com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.constant.C28561l1;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.tagmanager.C31011k;
import com.google.android.gms.tagmanager.C31020t;
import com.google.firebase.remoteconfig.C33585u;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.p007db.telemetry.TelemetryTable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.d7 */
public final class C41205d7 {

    /* renamed from: a */
    public final Context f104516a;

    /* renamed from: b */
    public final String f104517b;

    /* renamed from: c */
    public final C41550rf f104518c;

    /* renamed from: d */
    public final C31020t f104519d;

    /* renamed from: e */
    public final C31011k f104520e;

    /* renamed from: f */
    public final C41277g7 f104521f;

    /* renamed from: g */
    public final C41527qg f104522g;

    /* renamed from: h */
    public final C41527qg f104523h;

    /* renamed from: i */
    public final Set<String> f104524i = new HashSet();

    /* renamed from: j */
    public int f104525j;

    /* renamed from: k */
    public C41211dd f104526k;

    /* renamed from: l */
    public C41132a6 f104527l;

    /* renamed from: m */
    public final C41181c7 f104528m;

    @C40974d0
    public C41205d7(Context context, String str, C41550rf rfVar, C41142ag agVar, C31020t tVar, C31011k kVar) {
        C41277g7 g7Var = new C41277g7();
        this.f104521f = g7Var;
        C41527qg qgVar = new C41527qg(new HashMap(50));
        this.f104522g = qgVar;
        C41527qg qgVar2 = new C41527qg(new HashMap(10));
        this.f104523h = qgVar2;
        C41685x6 x6Var = new C41685x6(this);
        this.f104528m = x6Var;
        C40843u.m166203m(rfVar, "Internal Error: Container resource cannot be null");
        C40843u.m166203m(agVar, "Internal Error: Runtime resource cannot be null");
        C40843u.m166199i(str, "Internal Error: ContainerId cannot be empty");
        C40843u.m166202l(tVar);
        C40843u.m166202l(kVar);
        this.f104516a = context;
        this.f104517b = str;
        this.f104518c = rfVar;
        this.f104519d = tVar;
        this.f104520e = kVar;
        g7Var.mo135408c("1", new C41383kg(new C41736z9()));
        g7Var.mo135408c("12", new C41383kg(new C41136aa()));
        g7Var.mo135408c("18", new C41383kg(new C41160ba()));
        g7Var.mo135408c("19", new C41383kg(new C41184ca()));
        g7Var.mo135408c("20", new C41383kg(new C41208da()));
        g7Var.mo135408c("21", new C41383kg(new C41232ea()));
        g7Var.mo135408c("23", new C41383kg(new C41256fa()));
        g7Var.mo135408c("24", new C41383kg(new C41280ga()));
        g7Var.mo135408c("27", new C41383kg(new C41328ia()));
        g7Var.mo135408c("28", new C41383kg(new C41352ja()));
        g7Var.mo135408c("29", new C41383kg(new C41377ka()));
        g7Var.mo135408c("30", new C41383kg(new C41401la()));
        g7Var.mo135408c("32", new C41383kg(new C41425ma()));
        g7Var.mo135408c("33", new C41383kg(new C41425ma()));
        g7Var.mo135408c("34", new C41383kg(new C41449na()));
        g7Var.mo135408c("35", new C41383kg(new C41449na()));
        g7Var.mo135408c("39", new C41383kg(new C41473oa()));
        g7Var.mo135408c("40", new C41383kg(new C41497pa()));
        g7Var.mo135408c("0", new C41383kg(new C41450nb()));
        g7Var.mo135408c(C28561l1.f69523p, new C41383kg(new C41474ob()));
        g7Var.mo135408c("25", new C41383kg(new C41498pb()));
        g7Var.mo135408c("26", new C41383kg(new C41522qb()));
        g7Var.mo135408c("37", new C41383kg(new C41546rb()));
        g7Var.mo135408c("2", new C41383kg(new C41521qa()));
        g7Var.mo135408c("3", new C41383kg(new C41545ra()));
        g7Var.mo135408c("4", new C41383kg(new C41569sa()));
        g7Var.mo135408c("5", new C41383kg(new C41593ta()));
        g7Var.mo135408c("6", new C41383kg(new C41617ua()));
        g7Var.mo135408c("7", new C41383kg(new C41641va()));
        g7Var.mo135408c("8", new C41383kg(new C41665wa()));
        g7Var.mo135408c("9", new C41383kg(new C41593ta()));
        g7Var.mo135408c("13", new C41383kg(new C41689xa()));
        g7Var.mo135408c("47", new C41383kg(new C41713ya()));
        g7Var.mo135408c("15", new C41383kg(new C41737za()));
        g7Var.mo135408c("48", new C41383kg(new C41137ab(this)));
        C41161bb bbVar = new C41161bb();
        g7Var.mo135408c(C36178i.f89319n, new C41383kg(bbVar));
        g7Var.mo135408c("17", new C41383kg(bbVar));
        g7Var.mo135408c(PaymentDataSource.f101593c, new C41383kg(new C41209db()));
        g7Var.mo135408c("45", new C41383kg(new C41233eb()));
        g7Var.mo135408c("46", new C41383kg(new C41257fb()));
        g7Var.mo135408c("36", new C41383kg(new C41281gb()));
        g7Var.mo135408c("43", new C41383kg(new C41305hb()));
        g7Var.mo135408c("38", new C41383kg(new C41353jb()));
        g7Var.mo135408c("44", new C41383kg(new C41378kb()));
        g7Var.mo135408c("41", new C41383kg(new C41402lb()));
        g7Var.mo135408c(C20369t1.f52541f, new C41383kg(new C41426mb()));
        mo135223l(zza.CONTAINS, new C41164be());
        mo135223l(zza.ENDS_WITH, new C41188ce());
        mo135223l(zza.EQUALS, new C41212de());
        mo135223l(zza.GREATER_EQUALS, new C41236ee());
        mo135223l(zza.GREATER_THAN, new C41260fe());
        mo135223l(zza.LESS_EQUALS, new C41284ge());
        mo135223l(zza.LESS_THAN, new C41308he());
        mo135223l(zza.REGEX, new C41356je());
        mo135223l(zza.STARTS_WITH, new C41381ke());
        qgVar.mo135439f("advertiserId", new C41383kg(new C41595tc(context)));
        qgVar.mo135439f("advertiserTrackingEnabled", new C41383kg(new C41619uc(context)));
        qgVar.mo135439f("adwordsClickReferrer", new C41383kg(new C41643vc(context, x6Var)));
        qgVar.mo135439f("applicationId", new C41383kg(new C41667wc(context)));
        qgVar.mo135439f("applicationName", new C41383kg(new C41691xc(context)));
        qgVar.mo135439f("applicationVersion", new C41383kg(new C41715yc(context)));
        qgVar.mo135439f("applicationVersionName", new C41383kg(new C41739zc(context)));
        qgVar.mo135439f("arbitraryPixieMacro", new C41383kg(new C41523qc(1, g7Var)));
        qgVar.mo135439f("carrier", new C41383kg(new C41139ad(context)));
        qgVar.mo135439f("constant", new C41383kg(new C41281gb()));
        qgVar.mo135439f("containerId", new C41383kg(new C41163bd(new C41599tg(str))));
        qgVar.mo135439f("containerVersion", new C41383kg(new C41163bd(new C41599tg(rfVar.mo135804b()))));
        qgVar.mo135439f("customMacro", new C41383kg(new C41499pc(new C41157b7(this, (C41133a7) null))));
        qgVar.mo135439f("deviceBrand", new C41383kg(new C41235ed()));
        qgVar.mo135439f("deviceId", new C41383kg(new C41259fd(context)));
        qgVar.mo135439f("deviceModel", new C41383kg(new C41283gd()));
        qgVar.mo135439f("deviceName", new C41383kg(new C41307hd()));
        qgVar.mo135439f("encode", new C41383kg(new C41331id()));
        qgVar.mo135439f("encrypt", new C41383kg(new C41355jd()));
        qgVar.mo135439f("event", new C41383kg(new C41187cd()));
        qgVar.mo135439f("eventParameters", new C41383kg(new C41404ld(x6Var)));
        qgVar.mo135439f("version", new C41383kg(new C41428md()));
        qgVar.mo135439f("hashcode", new C41383kg(new C41452nd()));
        qgVar.mo135439f("installReferrer", new C41383kg(new C41476od(context)));
        qgVar.mo135439f("join", new C41383kg(new C41500pd()));
        qgVar.mo135439f("language", new C41383kg(new C41524qd()));
        qgVar.mo135439f("locale", new C41383kg(new C41548rd()));
        qgVar.mo135439f("adWordsUniqueId", new C41383kg(new C41596td(context)));
        qgVar.mo135439f("osVersion", new C41383kg(new C41620ud()));
        qgVar.mo135439f("platform", new C41383kg(new C41644vd()));
        qgVar.mo135439f(BaseOptionModel.f27465E0, new C41383kg(new C41668wd()));
        qgVar.mo135439f("regexGroup", new C41383kg(new C41692xd()));
        qgVar.mo135439f(C9175a.f24920M, new C41383kg(new C41740zd(context)));
        qgVar.mo135439f("runtimeVersion", new C41383kg(new C41716yd()));
        qgVar.mo135439f(C33585u.C33587b.f81741w3, new C41383kg(new C41140ae()));
        this.f104526k = new C41211dd();
        qgVar.mo135439f("currentTime", new C41383kg(this.f104526k));
        qgVar.mo135439f("userProperty", new C41383kg(new C41572sd(context, x6Var)));
        qgVar.mo135439f("arbitraryPixel", new C41383kg(new C41477oe(C41708y5.m168850b(context))));
        qgVar.mo135439f("customTag", new C41383kg(new C41499pc(new C41733z6(this, (C41709y6) null))));
        qgVar.mo135439f("universalAnalytics", new C41383kg(new C41501pe(context, x6Var)));
        qgVar.mo135439f("queueRequest", new C41383kg(new C41429me(C41708y5.m168850b(context))));
        qgVar.mo135439f("sendMeasurement", new C41383kg(new C41453ne(tVar, x6Var)));
        qgVar.mo135439f("arbitraryPixieTag", new C41383kg(new C41523qc(0, g7Var)));
        qgVar.mo135439f("suppressPassthrough", new C41383kg(new C41571sc(context, x6Var)));
        qgVar2.mo135439f("decodeURI", new C41383kg(new C41330ic()));
        qgVar2.mo135439f("decodeURIComponent", new C41383kg(new C41379kc()));
        qgVar2.mo135439f("encodeURI", new C41383kg(new C41403lc()));
        qgVar2.mo135439f("encodeURIComponent", new C41383kg(new C41427mc()));
        qgVar2.mo135439f(TelemetryTable.f26835g, new C41383kg(new C41547rc()));
        qgVar2.mo135439f("isArray", new C41383kg(new C41451nc()));
        for (C41711y8 next : agVar.mo135006a()) {
            next.mo136102d(this.f104521f);
            this.f104521f.mo135408c(next.mo136101c(), new C41383kg(next));
        }
        C41527qg qgVar3 = new C41527qg(new HashMap(1));
        qgVar3.mo135439f(C28534f.f69158i, this.f104522g);
        qgVar3.mo135439f("common", this.f104523h);
        this.f104521f.mo135408c("gtmUtils", qgVar3);
        C41527qg qgVar4 = new C41527qg(new HashMap(this.f104522g.mo135785i()));
        qgVar4.mo135786j();
        C41527qg qgVar5 = new C41527qg(new HashMap(this.f104523h.mo135785i()));
        qgVar5.mo135786j();
        if (this.f104521f.mo135411f("main") && (this.f104521f.mo135407b("main") instanceof C41383kg)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(qgVar3);
            C41623ug.m168492d(this.f104521f, new C41551rg("main", arrayList));
        }
        this.f104522g.mo135439f("base", qgVar4);
        this.f104523h.mo135439f("base", qgVar5);
        qgVar3.mo135786j();
        this.f104522g.mo135786j();
        this.f104523h.mo135786j();
    }

    /* renamed from: c */
    public final C41310hg<?> mo135214c(String str) {
        if (!this.f104524i.contains(str)) {
            this.f104525j = 0;
            return mo135220i(str);
        }
        String obj = this.f104524i.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(obj).length());
        sb.append("Macro cycle detected.  Current macro reference: ");
        sb.append(str);
        sb.append(". Previous macro references: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    @C40974d0
    /* renamed from: d */
    public final C41310hg<?> mo135215d(C41622uf ufVar) {
        this.f104524i.clear();
        try {
            C41310hg<?> g = mo135218g(mo135222k(ufVar.mo135913a()));
            if (g instanceof C41334ig) {
                return g;
            }
            C41660w5.m168643a("Predicate must return a boolean value", this.f104516a);
            return new C41334ig(Boolean.FALSE);
        } catch (IllegalStateException unused) {
            C41493p6.m168149a("Error evaluating predicate.");
            return C41431mg.f104799g;
        }
    }

    /* renamed from: e */
    public final void mo135216e() {
        C41708y5.m168850b(this.f104516a);
        C41494p7.m168157f().mo135711i();
    }

    /* renamed from: f */
    public final void mo135217f(C41132a6 a6Var) {
        C41310hg<?> igVar;
        this.f104521f.mo135408c("gtm.globals.eventName", new C41599tg(a6Var.mo134998e()));
        this.f104526k.mo135225b(a6Var);
        this.f104527l = a6Var;
        HashSet<C41622uf> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        for (C41694xf next : this.f104518c.mo135805c()) {
            if (!next.mo136036a().isEmpty() || !next.mo136039d().isEmpty()) {
                String valueOf = String.valueOf(next);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Evaluating trigger ");
                sb.append(valueOf);
                C41493p6.m168152d(sb.toString());
                Iterator<C41622uf> it = next.mo136037b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<C41622uf> it2 = next.mo136038c().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                igVar = new C41334ig(Boolean.TRUE);
                                break;
                            }
                            C41622uf next2 = it2.next();
                            C41310hg<?> hgVar = (C41310hg) hashMap.get(next2);
                            if (hgVar == null) {
                                hgVar = mo135215d(next2);
                                hashMap.put(next2, hgVar);
                            }
                            igVar = C41431mg.f104799g;
                            if (hgVar != igVar) {
                                if (!((C41334ig) hgVar).mo135499i().booleanValue()) {
                                    igVar = new C41334ig(Boolean.FALSE);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        C41622uf next3 = it.next();
                        C41310hg<?> hgVar2 = (C41310hg) hashMap.get(next3);
                        if (hgVar2 == null) {
                            hgVar2 = mo135215d(next3);
                            hashMap.put(next3, hgVar2);
                        }
                        igVar = C41431mg.f104799g;
                        if (hgVar2 != igVar) {
                            if (((C41334ig) hgVar2).mo135499i().booleanValue()) {
                                igVar = new C41334ig(Boolean.FALSE);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (igVar == C41431mg.f104799g) {
                    String valueOf2 = String.valueOf(next);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 41);
                    sb2.append("Error encounted while evaluating trigger ");
                    sb2.append(valueOf2);
                    C41660w5.m168645c(sb2.toString(), this.f104516a);
                    if (!next.mo136039d().isEmpty()) {
                        String valueOf3 = String.valueOf(next.mo136039d());
                        StringBuilder sb3 = new StringBuilder(valueOf3.length() + 15);
                        sb3.append("Blocking tags: ");
                        sb3.append(valueOf3);
                        C41493p6.m168152d(sb3.toString());
                        hashSet2.addAll(next.mo136039d());
                    }
                } else if (((C41334ig) igVar).mo135499i().booleanValue()) {
                    String valueOf4 = String.valueOf(next);
                    StringBuilder sb4 = new StringBuilder(valueOf4.length() + 19);
                    sb4.append("Trigger is firing: ");
                    sb4.append(valueOf4);
                    C41493p6.m168152d(sb4.toString());
                    if (!next.mo136036a().isEmpty()) {
                        String valueOf5 = String.valueOf(next.mo136036a());
                        StringBuilder sb5 = new StringBuilder(valueOf5.length() + 34);
                        sb5.append("Adding tags to firing candidates: ");
                        sb5.append(valueOf5);
                        C41493p6.m168152d(sb5.toString());
                        hashSet.addAll(next.mo136036a());
                    }
                    if (!next.mo136039d().isEmpty()) {
                        String valueOf6 = String.valueOf(next.mo136039d());
                        StringBuilder sb6 = new StringBuilder(valueOf6.length() + 24);
                        sb6.append("Blocking disabled tags: ");
                        sb6.append(valueOf6);
                        C41493p6.m168152d(sb6.toString());
                        hashSet2.addAll(next.mo136039d());
                    }
                }
            } else {
                String valueOf7 = String.valueOf(next);
                StringBuilder sb7 = new StringBuilder(valueOf7.length() + 64);
                sb7.append("Trigger is not being evaluated since it has no associated tags: ");
                sb7.append(valueOf7);
                C41493p6.m168152d(sb7.toString());
            }
        }
        hashSet.removeAll(hashSet2);
        boolean z = false;
        for (C41622uf ufVar : hashSet) {
            this.f104524i.clear();
            String valueOf8 = String.valueOf(ufVar);
            StringBuilder sb8 = new StringBuilder(valueOf8.length() + 21);
            sb8.append("Executing firing tag ");
            sb8.append(valueOf8);
            C41493p6.m168152d(sb8.toString());
            try {
                mo135218g(mo135222k(ufVar.mo135913a()));
                C41214dg dgVar = ufVar.mo135913a().get(zzb.DISPATCH_ON_FIRE.toString());
                if (dgVar != null && dgVar.mo135230a() == 8 && ((Boolean) dgVar.mo135231b()).booleanValue()) {
                    z = true;
                    String valueOf9 = String.valueOf(ufVar);
                    StringBuilder sb9 = new StringBuilder(valueOf9.length() + 36);
                    sb9.append("Tag configured to dispatch on fire: ");
                    sb9.append(valueOf9);
                    C41493p6.m168152d(sb9.toString());
                }
            } catch (IllegalStateException e) {
                String valueOf10 = String.valueOf(ufVar);
                StringBuilder sb10 = new StringBuilder(valueOf10.length() + 19);
                sb10.append("Error firing tag ");
                sb10.append(valueOf10);
                sb10.append(": ");
                C41660w5.m168644b(sb10.toString(), e, this.f104516a);
            }
        }
        this.f104521f.mo135409d("gtm.globals.eventName");
        if (a6Var.mo135002i()) {
            String e2 = a6Var.mo134998e();
            StringBuilder sb11 = new StringBuilder(String.valueOf(e2).length() + 35);
            sb11.append("Log passthrough event ");
            sb11.append(e2);
            sb11.append(" to Firebase.");
            C41493p6.m168152d(sb11.toString());
            try {
                this.f104519d.mo87697o2(a6Var.mo134999f(), a6Var.mo134998e(), a6Var.mo134997d(), a6Var.mo134768a());
            } catch (RemoteException e3) {
                C41660w5.m168644b("Error calling measurement proxy: ", e3, this.f104516a);
            }
        } else {
            String e4 = a6Var.mo134998e();
            StringBuilder sb12 = new StringBuilder(String.valueOf(e4).length() + 63);
            sb12.append("Non-passthrough event ");
            sb12.append(e4);
            sb12.append(" doesn't get logged to Firebase directly.");
            C41493p6.m168152d(sb12.toString());
        }
        if (z) {
            C41493p6.m168152d("Dispatch called for dispatchOnFire tags.");
            mo135216e();
        }
    }

    /* renamed from: g */
    public final C41310hg mo135218g(Map<String, C41310hg<?>> map) {
        C41551rg rgVar;
        String str;
        C41310hg hgVar = map.get(zzb.FUNCTION.toString());
        if (!(hgVar instanceof C41599tg)) {
            C41660w5.m168643a("No function id in properties", this.f104516a);
            return C41431mg.f104800h;
        }
        String k = ((C41599tg) hgVar).mo135863k();
        if (this.f104521f.mo135411f(k)) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).startsWith("vtp_")) {
                    hashMap.put(((String) next.getKey()).substring(4), (C41310hg) next.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C41527qg(hashMap));
            rgVar = new C41551rg(k, arrayList);
        } else {
            String c = C41687x8.m168706c(k);
            if (c == null || !this.f104522g.mo135441h(c)) {
                StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 30);
                sb.append("functionId '");
                sb.append(k);
                sb.append("' is not supported");
                C41660w5.m168643a(sb.toString(), this.f104516a);
                return C41431mg.f104800h;
            }
            try {
                rgVar = C41687x8.m168704a(k, map, this.f104521f);
            } catch (RuntimeException e) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(k).length() + 30 + String.valueOf(message).length());
                sb2.append("Incorrect keys for function ");
                sb2.append(k);
                sb2.append(". ");
                sb2.append(message);
                C41493p6.m168149a(sb2.toString());
                rgVar = null;
            }
        }
        if (rgVar == null) {
            C41660w5.m168643a("Internal error: failed to convert function to a valid statement", this.f104516a);
            return C41431mg.f104800h;
        }
        String valueOf = String.valueOf(rgVar.mo135807i());
        if (valueOf.length() != 0) {
            str = "Executing: ".concat(valueOf);
        } else {
            str = new String("Executing: ");
        }
        C41493p6.m168152d(str);
        C41310hg d = C41623ug.m168492d(this.f104521f, rgVar);
        if (!(d instanceof C41431mg)) {
            return d;
        }
        C41431mg mgVar = (C41431mg) d;
        if (mgVar.mo135643j()) {
            return mgVar.mo135642i();
        }
        return d;
    }

    /* renamed from: h */
    public final C41310hg<?> mo135219h(C41214dg dgVar) {
        switch (dgVar.mo135230a()) {
            case 1:
                try {
                    return new C41358jg(Double.valueOf(Double.parseDouble((String) dgVar.mo135231b())));
                } catch (NumberFormatException unused) {
                    return new C41599tg((String) dgVar.mo135231b());
                }
            case 2:
                List<C41214dg> list = (List) dgVar.mo135231b();
                ArrayList arrayList = new ArrayList(list.size());
                for (C41214dg h : list) {
                    arrayList.add(mo135219h(h));
                }
                return new C41503pg(arrayList);
            case 3:
                Map map = (Map) dgVar.mo135231b();
                HashMap hashMap = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    C41310hg<?> h2 = mo135219h((C41214dg) entry.getKey());
                    hashMap.put(C41135a9.m167070d(h2), mo135219h((C41214dg) entry.getValue()));
                }
                return new C41527qg(hashMap);
            case 4:
                C41310hg<?> i = mo135220i((String) dgVar.mo135231b());
                if (!(i instanceof C41599tg) || dgVar.mo135232c().isEmpty()) {
                    return i;
                }
                String k = ((C41599tg) i).mo135863k();
                for (Integer intValue : dgVar.mo135232c()) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 != 12) {
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unsupported Value Escaping: ");
                        sb.append(intValue2);
                        C41493p6.m168149a(sb.toString());
                    } else {
                        try {
                            k = URLEncoder.encode(k, "UTF-8").replaceAll("\\+", "%20");
                        } catch (UnsupportedEncodingException e) {
                            C41493p6.m168150b("Escape URI: unsupported encoding", e);
                        }
                    }
                }
                return new C41599tg(k);
            case 5:
                return new C41599tg((String) dgVar.mo135231b());
            case 6:
                return new C41358jg(Double.valueOf(((Integer) dgVar.mo135231b()).doubleValue()));
            case 7:
                StringBuilder sb2 = new StringBuilder();
                for (C41214dg h3 : (List) dgVar.mo135231b()) {
                    sb2.append(C41135a9.m167070d(mo135219h(h3)));
                }
                return new C41599tg(sb2.toString());
            case 8:
                return new C41334ig((Boolean) dgVar.mo135231b());
            default:
                int a = dgVar.mo135230a();
                StringBuilder sb3 = new StringBuilder(52);
                sb3.append("Attempting to expand unknown Value type ");
                sb3.append(a);
                sb3.append(".");
                throw new IllegalStateException(sb3.toString());
        }
    }

    /* renamed from: i */
    public final C41310hg<?> mo135220i(String str) {
        this.f104525j++;
        String j = mo135221j();
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 31 + String.valueOf(str).length());
        sb.append(j);
        sb.append("Beginning to evaluate variable ");
        sb.append(str);
        C41493p6.m168152d(sb.toString());
        if (!this.f104524i.contains(str)) {
            this.f104524i.add(str);
            C41622uf a = this.f104518c.mo135803a(str);
            if (a != null) {
                C41310hg<?> g = mo135218g(mo135222k(a.mo135913a()));
                String j2 = mo135221j();
                StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 25 + String.valueOf(str).length());
                sb2.append(j2);
                sb2.append("Done evaluating variable ");
                sb2.append(str);
                C41493p6.m168152d(sb2.toString());
                this.f104525j--;
                this.f104524i.remove(str);
                return g;
            }
            this.f104525j--;
            this.f104524i.remove(str);
            String j3 = mo135221j();
            StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 36 + String.valueOf(str).length());
            sb3.append(j3);
            sb3.append("Attempting to resolve unknown macro ");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
        this.f104525j--;
        String obj = this.f104524i.toString();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(obj).length());
        sb4.append("Macro cycle detected.  Current macro reference: ");
        sb4.append(str);
        sb4.append(". Previous macro references: ");
        sb4.append(obj);
        throw new IllegalStateException(sb4.toString());
    }

    /* renamed from: j */
    public final String mo135221j() {
        if (this.f104525j <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.f104525j));
        for (int i = 2; i < this.f104525j; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    /* renamed from: k */
    public final Map<String, C41310hg<?>> mo135222k(Map<String, C41214dg> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), mo135219h((C41214dg) next.getValue()));
        }
        return hashMap;
    }

    /* renamed from: l */
    public final void mo135223l(zza zza, C41735z8 z8Var) {
        this.f104522g.mo135439f(C41687x8.m168705b(zza), new C41383kg(z8Var));
    }
}
