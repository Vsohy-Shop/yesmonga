package org.jsoup.nodes;

import java.util.List;
import org.jsoup.helper.C12750d;

/* renamed from: org.jsoup.nodes.i */
public abstract class C12778i extends C12779j {

    /* renamed from: e */
    public Object f31625e;

    /* renamed from: B0 */
    public String mo29913B0() {
        return mo29896j(mo29651S());
    }

    /* renamed from: D0 */
    public void mo29914D0(String str) {
        mo29782k(mo29651S(), str);
    }

    /* renamed from: E */
    public void mo29696E(String str) {
    }

    /* renamed from: E0 */
    public C12778i mo29694D(C12779j jVar) {
        C12778i iVar = (C12778i) super.mo29694D(jVar);
        if (mo29715K()) {
            iVar.f31625e = ((C12767b) this.f31625e).clone();
        }
        return iVar;
    }

    /* renamed from: F */
    public C12779j mo29699F() {
        return this;
    }

    /* renamed from: F0 */
    public final void mo29916F0() {
        if (!mo29715K()) {
            Object obj = this.f31625e;
            C12767b bVar = new C12767b();
            this.f31625e = bVar;
            if (obj != null) {
                bVar.mo29846J0(mo29651S(), (String) obj);
            }
        }
    }

    /* renamed from: G */
    public List<C12779j> mo29703G() {
        return C12779j.f31626c;
    }

    /* renamed from: J */
    public boolean mo29892J(String str) {
        mo29916F0();
        return super.mo29892J(str);
    }

    /* renamed from: K */
    public final boolean mo29715K() {
        return this.f31625e instanceof C12767b;
    }

    /* renamed from: b */
    public String mo29895b(String str) {
        mo29916F0();
        return super.mo29895b(str);
    }

    /* renamed from: i0 */
    public C12779j mo29778i0(String str) {
        mo29916F0();
        return super.mo29778i0(str);
    }

    /* renamed from: j */
    public String mo29896j(String str) {
        C12750d.m55073j(str);
        if (mo29715K()) {
            return super.mo29896j(str);
        }
        if (str.equals(mo29651S())) {
            return (String) this.f31625e;
        }
        return "";
    }

    /* renamed from: k */
    public C12779j mo29782k(String str, String str2) {
        if (mo29715K() || !str.equals(mo29651S())) {
            mo29916F0();
            super.mo29782k(str, str2);
        } else {
            this.f31625e = str2;
        }
        return this;
    }

    /* renamed from: l */
    public final C12767b mo29784l() {
        mo29916F0();
        return (C12767b) this.f31625e;
    }

    /* renamed from: n */
    public String mo29787n() {
        return mo29919L() ? mo29760b0().mo29787n() : "";
    }

    /* renamed from: u */
    public int mo29805u() {
        return 0;
    }
}
