package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.UncheckedIOException;
import org.jsoup.nodes.Document;

/* renamed from: org.jsoup.nodes.c */
public class C12772c extends C12783m {
    public C12772c(String str) {
        super(str);
    }

    /* renamed from: Q0 */
    public String mo29887Q0() {
        return mo29947I0();
    }

    /* renamed from: S */
    public String mo29651S() {
        return "#cdata";
    }

    /* renamed from: S0 */
    public C12772c clone() {
        return (C12772c) super.clone();
    }

    /* renamed from: Y */
    public void mo29751Y(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("<![CDATA[").append(mo29947I0());
    }

    /* renamed from: Z */
    public void mo29753Z(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
