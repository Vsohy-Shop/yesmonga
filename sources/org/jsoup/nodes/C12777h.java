package org.jsoup.nodes;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C12085q0;
import org.jsoup.C12739a;
import org.jsoup.Connection;
import org.jsoup.helper.C12744c;
import org.jsoup.helper.C12750d;
import org.jsoup.parser.C12893f;
import org.jsoup.select.Elements;

/* renamed from: org.jsoup.nodes.h */
public class C12777h extends Element {

    /* renamed from: z */
    public final Elements f31624z = new Elements();

    public C12777h(C12893f fVar, String str, C12767b bVar) {
        super(fVar, str, bVar);
    }

    /* renamed from: g3 */
    public C12777h mo29907g3(Element element) {
        this.f31624z.add(element);
        return this;
    }

    /* renamed from: h3 */
    public C12777h mo29655e1() {
        return (C12777h) super.clone();
    }

    /* renamed from: i3 */
    public Elements mo29909i3() {
        return this.f31624z;
    }

    /* renamed from: j0 */
    public void mo29910j0(C12779j jVar) {
        super.mo29910j0(jVar);
        this.f31624z.remove(jVar);
    }

    /* renamed from: j3 */
    public List<Connection.C12736b> mo29911j3() {
        String str;
        Element N2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f31624z.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.mo29742U2().mo30195j() && !element.mo29892J("disabled")) {
                String j = element.mo29896j("name");
                if (j.length() != 0) {
                    String j2 = element.mo29896j("type");
                    if (!j2.equalsIgnoreCase(C9175a.f24945j0)) {
                        if ("select".equals(element.mo29799r2())) {
                            Iterator it2 = element.mo29717K2("option[selected]").iterator();
                            boolean z = false;
                            while (it2.hasNext()) {
                                arrayList.add(C12744c.C12747c.m54967f(j, ((Element) it2.next()).mo29764c3()));
                                z = true;
                            }
                            if (!z && (N2 = element.mo29722N2("option")) != null) {
                                arrayList.add(C12744c.C12747c.m54967f(j, N2.mo29764c3()));
                            }
                        } else if (!"checkbox".equalsIgnoreCase(j2) && !"radio".equalsIgnoreCase(j2)) {
                            arrayList.add(C12744c.C12747c.m54967f(j, element.mo29764c3()));
                        } else if (element.mo29892J("checked")) {
                            if (element.mo29764c3().length() > 0) {
                                str = element.mo29764c3();
                            } else {
                                str = C12085q0.f29740d;
                            }
                            arrayList.add(C12744c.C12747c.m54967f(j, str));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k3 */
    public Connection mo29912k3() {
        String str;
        Connection.Method method;
        Connection connection;
        if (mo29892J("action")) {
            str = mo29895b("action");
        } else {
            str = mo29787n();
        }
        C12750d.m55072i(str, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        if (mo29896j(FirebaseAnalytics.C32532b.f78973v).equalsIgnoreCase("POST")) {
            method = Connection.Method.POST;
        } else {
            method = Connection.Method.GET;
        }
        Document a0 = mo29924a0();
        if (a0 != null) {
            connection = a0.mo29660k3().mo29516s();
        } else {
            connection = C12739a.m54869j();
        }
        return connection.mo29521x(str).mo29499e(mo29911j3()).mo29509m(method);
    }
}
