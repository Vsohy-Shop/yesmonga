package com.urbanairship.automation;

import androidx.annotation.C0359n0;
import com.urbanairship.automation.C8996y;
import com.urbanairship.automation.ScheduleDelay;
import com.urbanairship.automation.actions.C8801a;
import com.urbanairship.automation.deferred.C8829a;
import com.urbanairship.automation.storage.C8946e;
import com.urbanairship.automation.storage.C8954h;
import com.urbanairship.automation.storage.C8956j;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.automation.z */
public class C9000z {
    @C0359n0
    /* renamed from: a */
    public static <T extends C8800a0> C8996y<T> m33490a(@C0359n0 C8946e eVar) throws JsonException, IllegalArgumentException, ClassCastException {
        C8954h hVar = eVar.f23968a;
        C8996y.C8998b F = m33495f(hVar.f24021l, hVar.f24020k).mo17755B(eVar.f23968a.f24011b).mo17758E(eVar.f23968a.f24013d).mo17754A(eVar.f23968a.f24012c).mo17770y(eVar.f23968a.f24017h).mo17761H(eVar.f23968a.f24016g).mo17757D(eVar.f23968a.f24014e).mo17759F(eVar.f23968a.f24015f);
        long j = eVar.f23968a.f24019j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C8996y.C8998b<T> z = F.mo17756C(j, timeUnit).mo17769x(eVar.f23968a.f24018i, timeUnit).mo17766u(eVar.f23968a.f24030u).mo17767v(eVar.f23968a.f24031v).mo17760G(eVar.f23968a.f24032w).mo17771z(eVar.f23968a.f24033x);
        ScheduleDelay.C8795c m = ScheduleDelay.m32657g().mo17273h(eVar.f23968a.f24026q).mo17274i(eVar.f23968a.f24029t).mo17277l(eVar.f23968a.f24027r).mo17278m(eVar.f23968a.f24028s);
        for (C8956j next : eVar.f23969b) {
            if (next.f24045e) {
                m.mo17271f(m33491b(next));
            } else {
                z.mo17763r(m33491b(next));
            }
        }
        return z.mo17768w(m.mo17272g()).mo17765t();
    }

    @C0359n0
    /* renamed from: b */
    public static Trigger m33491b(@C0359n0 C8956j jVar) {
        return new Trigger(jVar.f24042b, jVar.f24043c, jVar.f24044d);
    }

    @C0359n0
    /* renamed from: c */
    public static C8946e m33492c(@C0359n0 C8996y<?> yVar) {
        C8954h hVar = new C8954h();
        ArrayList arrayList = new ArrayList();
        hVar.f24011b = yVar.mo17733B();
        hVar.f24012c = yVar.mo17732A();
        hVar.f24013d = yVar.mo17736E();
        hVar.f24017h = yVar.mo17752y();
        hVar.f24016g = yVar.mo17739H();
        hVar.f24014e = yVar.mo17735D();
        hVar.f24015f = yVar.mo17737F();
        hVar.f24019j = yVar.mo17734C();
        hVar.f24018i = yVar.mo17751x();
        hVar.f24030u = yVar.mo17745s();
        hVar.f24020k = yVar.mo17741J();
        hVar.f24021l = yVar.mo17749v();
        hVar.f24031v = yVar.mo17746t();
        hVar.f24032w = yVar.mo17738G();
        hVar.f24033x = yVar.mo17753z();
        for (Trigger d : yVar.mo17740I()) {
            arrayList.add(m33493d(d, false, yVar.mo17733B()));
        }
        ScheduleDelay w = yVar.mo17750w();
        if (w != null) {
            hVar.f24027r = w.mo17260e();
            hVar.f24029t = w.mo17258d();
            hVar.f24026q = w.mo17256b();
            hVar.f24028s = w.mo17262f();
            for (Trigger d2 : w.mo17257c()) {
                arrayList.add(m33493d(d2, true, yVar.mo17733B()));
            }
        }
        return new C8946e(hVar, arrayList);
    }

    @C0359n0
    /* renamed from: d */
    public static C8956j m33493d(@C0359n0 Trigger trigger, boolean z, @C0359n0 String str) {
        C8956j jVar = new C8956j();
        jVar.f24043c = trigger.mo17279d();
        jVar.f24045e = z;
        jVar.f24042b = trigger.mo17284g();
        jVar.f24044d = trigger.mo17281e();
        jVar.f24047g = str;
        return jVar;
    }

    @C0359n0
    /* renamed from: e */
    public static List<C8946e> m33494e(@C0359n0 Collection<C8996y<? extends C8800a0>> collection) {
        ArrayList arrayList = new ArrayList();
        for (C8996y<? extends C8800a0> c : collection) {
            arrayList.add(m33492c(c));
        }
        return arrayList;
    }

    /* renamed from: f */
    public static <T extends C8800a0> C8996y.C8998b<T> m33495f(@C0359n0 JsonValue jsonValue, String str) throws JsonException {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1161803523:
                if (str.equals("actions")) {
                    c = 0;
                    break;
                }
                break;
            case -379237425:
                if (str.equals("in_app_message")) {
                    c = 1;
                    break;
                }
                break;
            case 647890911:
                if (str.equals("deferred")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C8996y.m33416L(new C8801a(jsonValue.mo18749A()));
            case 1:
                return C8996y.m33418N(InAppMessage.m34087j(jsonValue));
            case 2:
                return C8996y.m33417M(C8829a.m32848a(jsonValue));
            default:
                throw new IllegalArgumentException("Invalid type: " + str);
        }
    }
}
