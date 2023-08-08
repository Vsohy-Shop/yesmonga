package org.jsoup.nodes;

import com.google.firebase.messaging.C33168b1;
import java.io.IOException;
import java.util.Iterator;
import org.jsoup.SerializationException;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Document;

/* renamed from: org.jsoup.nodes.n */
public class C12784n extends C12778i {

    /* renamed from: f */
    public final boolean f31632f;

    public C12784n(String str, boolean z) {
        C12750d.m55073j(str);
        this.f31625e = str;
        this.f31632f = z;
    }

    /* renamed from: F */
    public /* bridge */ /* synthetic */ C12779j mo29699F() {
        return super.mo29699F();
    }

    /* renamed from: G0 */
    public C12784n clone() {
        return (C12784n) super.clone();
    }

    /* renamed from: H0 */
    public String mo29952H0() {
        StringBuilder b = C12759f.m55102b();
        try {
            mo29953I0(b, new Document.OutputSettings());
            return C12759f.m55116p(b).trim();
        } catch (IOException e) {
            throw new SerializationException((Throwable) e);
        }
    }

    /* renamed from: I0 */
    public final void mo29953I0(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        Iterator<C12766a> it = mo29784l().iterator();
        while (it.hasNext()) {
            C12766a next = it.next();
            String e = next.getKey();
            String h = next.getValue();
            if (!e.equals(mo29651S())) {
                appendable.append(' ');
                appendable.append(e);
                if (!h.isEmpty()) {
                    appendable.append("=\"");
                    Entities.m55326g(appendable, h, outputSettings, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    /* renamed from: J */
    public /* bridge */ /* synthetic */ boolean mo29892J(String str) {
        return super.mo29892J(str);
    }

    /* renamed from: J0 */
    public String mo29954J0() {
        return mo29913B0();
    }

    /* renamed from: S */
    public String mo29651S() {
        return "#declaration";
    }

    /* renamed from: Y */
    public void mo29751Y(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        String str;
        Appendable append = appendable.append("<");
        boolean z = this.f31632f;
        String str2 = C33168b1.f80509d;
        if (z) {
            str = str2;
        } else {
            str = "?";
        }
        append.append(str).append(mo29913B0());
        mo29953I0(appendable, outputSettings);
        if (!this.f31632f) {
            str2 = "?";
        }
        appendable.append(str2).append(">");
    }

    /* renamed from: Z */
    public void mo29753Z(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo29895b(String str) {
        return super.mo29895b(str);
    }

    /* renamed from: i0 */
    public /* bridge */ /* synthetic */ C12779j mo29778i0(String str) {
        return super.mo29778i0(str);
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ String mo29896j(String str) {
        return super.mo29896j(str);
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ C12779j mo29782k(String str, String str2) {
        return super.mo29782k(str, str2);
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ String mo29787n() {
        return super.mo29787n();
    }

    public String toString() {
        return mo29652U();
    }

    /* renamed from: u */
    public /* bridge */ /* synthetic */ int mo29805u() {
        return super.mo29805u();
    }
}
