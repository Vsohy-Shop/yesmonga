package org.jsoup.parser;

import kotlin.text.C11626x;
import org.jsoup.nodes.C12775f;
import org.jsoup.parser.Token;

enum TokeniserState {
    Data {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char u = aVar.mo30070u();
            if (u == 0) {
                hVar.mo30259x(this);
                hVar.mo30247l(aVar.mo30054f());
            } else if (u == '&') {
                hVar.mo30236a(TokeniserState.CharacterReferenceInData);
            } else if (u == '<') {
                hVar.mo30236a(TokeniserState.TagOpen);
            } else if (u != 65535) {
                hVar.mo30248m(aVar.mo30056h());
            } else {
                hVar.mo30250o(new Token.C12817f());
            }
        }
    },
    CharacterReferenceInData {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55703Z(hVar, TokeniserState.Data);
        }
    },
    Rcdata {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char u = aVar.mo30070u();
            if (u == 0) {
                hVar.mo30259x(this);
                aVar.mo30050a();
                hVar.mo30247l(65533);
            } else if (u == '&') {
                hVar.mo30236a(TokeniserState.CharacterReferenceInRcdata);
            } else if (u == '<') {
                hVar.mo30236a(TokeniserState.RcdataLessthanSign);
            } else if (u != 65535) {
                hVar.mo30248m(aVar.mo30056h());
            } else {
                hVar.mo30250o(new Token.C12817f());
            }
        }
    },
    CharacterReferenceInRcdata {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55703Z(hVar, TokeniserState.Rcdata);
        }
    },
    Rawtext {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55705f0(hVar, aVar, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55705f0(hVar, aVar, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char u = aVar.mo30070u();
            if (u == 0) {
                hVar.mo30259x(this);
                aVar.mo30050a();
                hVar.mo30247l(65533);
            } else if (u != 65535) {
                hVar.mo30248m(aVar.mo30063o(0));
            } else {
                hVar.mo30250o(new Token.C12817f());
            }
        }
    },
    TagOpen {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char u = aVar.mo30070u();
            if (u == '!') {
                hVar.mo30236a(TokeniserState.MarkupDeclarationOpen);
            } else if (u == '/') {
                hVar.mo30236a(TokeniserState.EndTagOpen);
            } else if (u == '?') {
                hVar.mo30241f();
                hVar.mo30234B(TokeniserState.BogusComment);
            } else if (aVar.mo30037I()) {
                hVar.mo30244i(true);
                hVar.mo30234B(TokeniserState.TagName);
            } else {
                hVar.mo30259x(this);
                hVar.mo30247l(C11626x.f28914e);
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    EndTagOpen {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30072w()) {
                hVar.mo30256u(this);
                hVar.mo30248m("</");
                hVar.mo30234B(TokeniserState.Data);
            } else if (aVar.mo30037I()) {
                hVar.mo30244i(false);
                hVar.mo30234B(TokeniserState.TagName);
            } else if (aVar.mo30033E(C11626x.f28915f)) {
                hVar.mo30259x(this);
                hVar.mo30236a(TokeniserState.Data);
            } else {
                hVar.mo30259x(this);
                hVar.mo30241f();
                hVar.f31897n.mo29992p('/');
                hVar.mo30234B(TokeniserState.BogusComment);
            }
        }
    },
    TagName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            hVar.f31892i.mo30023w(aVar.mo30062n());
            char f = aVar.mo30054f();
            if (f != 0) {
                if (f != ' ') {
                    if (f != '/') {
                        if (f == '<') {
                            aVar.mo30048U();
                            hVar.mo30259x(this);
                        } else if (f != '>') {
                            if (f == 65535) {
                                hVar.mo30256u(this);
                                hVar.mo30234B(TokeniserState.Data);
                                return;
                            } else if (!(f == 9 || f == 10 || f == 12 || f == 13)) {
                                hVar.f31892i.mo30022v(f);
                                return;
                            }
                        }
                        hVar.mo30255t();
                        hVar.mo30234B(TokeniserState.Data);
                        return;
                    }
                    hVar.mo30234B(TokeniserState.SelfClosingStartTag);
                    return;
                }
                hVar.mo30234B(TokeniserState.BeforeAttributeName);
                return;
            }
            hVar.f31892i.mo30023w(TokeniserState.f31744I1);
        }
    },
    RcdataLessthanSign {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30033E('/')) {
                hVar.mo30245j();
                hVar.mo30236a(TokeniserState.RCDATAEndTagOpen);
            } else if (!aVar.mo30037I() || hVar.mo30237b() == null || aVar.mo30068t(hVar.mo30238c())) {
                hVar.mo30248m("<");
                hVar.mo30234B(TokeniserState.Rcdata);
            } else {
                hVar.f31892i = hVar.mo30244i(false).mo30011E(hVar.mo30237b());
                hVar.mo30255t();
                hVar.mo30234B(TokeniserState.TagOpen);
            }
        }
    },
    RCDATAEndTagOpen {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30037I()) {
                hVar.mo30244i(false);
                hVar.f31892i.mo30022v(aVar.mo30070u());
                hVar.f31891h.append(aVar.mo30070u());
                hVar.mo30236a(TokeniserState.RCDATAEndTagName);
                return;
            }
            hVar.mo30248m("</");
            hVar.mo30234B(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30037I()) {
                String k = aVar.mo30059k();
                hVar.f31892i.mo30023w(k);
                hVar.f31891h.append(k);
                return;
            }
            char f = aVar.mo30054f();
            if (f == 9 || f == 10 || f == 12 || f == 13 || f == ' ') {
                if (hVar.mo30261z()) {
                    hVar.mo30234B(TokeniserState.BeforeAttributeName);
                } else {
                    mo30028m0(hVar, aVar);
                }
            } else if (f != '/') {
                if (f != '>') {
                    mo30028m0(hVar, aVar);
                } else if (hVar.mo30261z()) {
                    hVar.mo30255t();
                    hVar.mo30234B(TokeniserState.Data);
                } else {
                    mo30028m0(hVar, aVar);
                }
            } else if (hVar.mo30261z()) {
                hVar.mo30234B(TokeniserState.SelfClosingStartTag);
            } else {
                mo30028m0(hVar, aVar);
            }
        }

        /* renamed from: m0 */
        public final void mo30028m0(C12895h hVar, C12888a aVar) {
            hVar.mo30248m("</");
            hVar.mo30249n(hVar.f31891h);
            aVar.mo30048U();
            hVar.mo30234B(TokeniserState.Rcdata);
        }
    },
    RawtextLessthanSign {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30033E('/')) {
                hVar.mo30245j();
                hVar.mo30236a(TokeniserState.RawtextEndTagOpen);
                return;
            }
            hVar.mo30247l(C11626x.f28914e);
            hVar.mo30234B(TokeniserState.Rawtext);
        }
    },
    RawtextEndTagOpen {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55704e0(hVar, aVar, TokeniserState.RawtextEndTagName, TokeniserState.Rawtext);
        }
    },
    RawtextEndTagName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55702W(hVar, aVar, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == '!') {
                hVar.mo30248m("<!");
                hVar.mo30234B(TokeniserState.ScriptDataEscapeStart);
            } else if (f == '/') {
                hVar.mo30245j();
                hVar.mo30234B(TokeniserState.ScriptDataEndTagOpen);
            } else if (f != 65535) {
                hVar.mo30248m("<");
                aVar.mo30048U();
                hVar.mo30234B(TokeniserState.ScriptData);
            } else {
                hVar.mo30248m("<");
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    ScriptDataEndTagOpen {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55704e0(hVar, aVar, TokeniserState.ScriptDataEndTagName, TokeniserState.ScriptData);
        }
    },
    ScriptDataEndTagName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55702W(hVar, aVar, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30033E('-')) {
                hVar.mo30247l('-');
                hVar.mo30236a(TokeniserState.ScriptDataEscapeStartDash);
                return;
            }
            hVar.mo30234B(TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStartDash {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30033E('-')) {
                hVar.mo30247l('-');
                hVar.mo30236a(TokeniserState.ScriptDataEscapedDashDash);
                return;
            }
            hVar.mo30234B(TokeniserState.ScriptData);
        }
    },
    ScriptDataEscaped {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30072w()) {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
                return;
            }
            char u = aVar.mo30070u();
            if (u == 0) {
                hVar.mo30259x(this);
                aVar.mo30050a();
                hVar.mo30247l(65533);
            } else if (u == '-') {
                hVar.mo30247l('-');
                hVar.mo30236a(TokeniserState.ScriptDataEscapedDash);
            } else if (u != '<') {
                hVar.mo30248m(aVar.mo30065q('-', C11626x.f28914e, 0));
            } else {
                hVar.mo30236a(TokeniserState.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDash {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30072w()) {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
                return;
            }
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.mo30247l(65533);
                hVar.mo30234B(TokeniserState.ScriptDataEscaped);
            } else if (f == '-') {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptDataEscapedDashDash);
            } else if (f != '<') {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptDataEscaped);
            } else {
                hVar.mo30234B(TokeniserState.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDashDash {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30072w()) {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
                return;
            }
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.mo30247l(65533);
                hVar.mo30234B(TokeniserState.ScriptDataEscaped);
            } else if (f == '-') {
                hVar.mo30247l(f);
            } else if (f == '<') {
                hVar.mo30234B(TokeniserState.ScriptDataEscapedLessthanSign);
            } else if (f != '>') {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptDataEscaped);
            } else {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEscapedLessthanSign {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30037I()) {
                hVar.mo30245j();
                hVar.f31891h.append(aVar.mo30070u());
                hVar.mo30248m("<");
                hVar.mo30247l(aVar.mo30070u());
                hVar.mo30236a(TokeniserState.ScriptDataDoubleEscapeStart);
            } else if (aVar.mo30033E('/')) {
                hVar.mo30245j();
                hVar.mo30236a(TokeniserState.ScriptDataEscapedEndTagOpen);
            } else {
                hVar.mo30247l(C11626x.f28914e);
                hVar.mo30234B(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30037I()) {
                hVar.mo30244i(false);
                hVar.f31892i.mo30022v(aVar.mo30070u());
                hVar.f31891h.append(aVar.mo30070u());
                hVar.mo30236a(TokeniserState.ScriptDataEscapedEndTagName);
                return;
            }
            hVar.mo30248m("</");
            hVar.mo30234B(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55702W(hVar, aVar, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55701Q(hVar, aVar, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char u = aVar.mo30070u();
            if (u == 0) {
                hVar.mo30259x(this);
                aVar.mo30050a();
                hVar.mo30247l(65533);
            } else if (u == '-') {
                hVar.mo30247l(u);
                hVar.mo30236a(TokeniserState.ScriptDataDoubleEscapedDash);
            } else if (u == '<') {
                hVar.mo30247l(u);
                hVar.mo30236a(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (u != 65535) {
                hVar.mo30248m(aVar.mo30065q('-', C11626x.f28914e, 0));
            } else {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDash {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.mo30247l(65533);
                hVar.mo30234B(TokeniserState.ScriptDataDoubleEscaped);
            } else if (f == '-') {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptDataDoubleEscapedDashDash);
            } else if (f == '<') {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (f != 65535) {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptDataDoubleEscaped);
            } else {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.mo30247l(65533);
                hVar.mo30234B(TokeniserState.ScriptDataDoubleEscaped);
            } else if (f == '-') {
                hVar.mo30247l(f);
            } else if (f == '<') {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (f == '>') {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptData);
            } else if (f != 65535) {
                hVar.mo30247l(f);
                hVar.mo30234B(TokeniserState.ScriptDataDoubleEscaped);
            } else {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30033E('/')) {
                hVar.mo30247l('/');
                hVar.mo30245j();
                hVar.mo30236a(TokeniserState.ScriptDataDoubleEscapeEnd);
                return;
            }
            hVar.mo30234B(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            TokeniserState.m55701Q(hVar, aVar, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
            r3.mo30255t();
            r3.mo30234B(org.jsoup.parser.TokeniserState.f31767a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* renamed from: X */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30027X(org.jsoup.parser.C12895h r3, org.jsoup.parser.C12888a r4) {
            /*
                r2 = this;
                char r0 = r4.mo30054f()
                if (r0 == 0) goto L_0x006d
                r1 = 32
                if (r0 == r1) goto L_0x007d
                r1 = 34
                if (r0 == r1) goto L_0x005a
                r1 = 39
                if (r0 == r1) goto L_0x005a
                r1 = 47
                if (r0 == r1) goto L_0x0054
                r1 = 65535(0xffff, float:9.1834E-41)
                if (r0 == r1) goto L_0x004b
                r1 = 9
                if (r0 == r1) goto L_0x007d
                r1 = 10
                if (r0 == r1) goto L_0x007d
                r1 = 12
                if (r0 == r1) goto L_0x007d
                r1 = 13
                if (r0 == r1) goto L_0x007d
                switch(r0) {
                    case 60: goto L_0x003c;
                    case 61: goto L_0x005a;
                    case 62: goto L_0x0042;
                    default: goto L_0x002e;
                }
            L_0x002e:
                org.jsoup.parser.Token$i r0 = r3.f31892i
                r0.mo30012F()
                r4.mo30048U()
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.AttributeName
                r3.mo30234B(r4)
                goto L_0x007d
            L_0x003c:
                r4.mo30048U()
                r3.mo30259x(r2)
            L_0x0042:
                r3.mo30255t()
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.Data
                r3.mo30234B(r4)
                goto L_0x007d
            L_0x004b:
                r3.mo30256u(r2)
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.Data
                r3.mo30234B(r4)
                goto L_0x007d
            L_0x0054:
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.SelfClosingStartTag
                r3.mo30234B(r4)
                goto L_0x007d
            L_0x005a:
                r3.mo30259x(r2)
                org.jsoup.parser.Token$i r4 = r3.f31892i
                r4.mo30012F()
                org.jsoup.parser.Token$i r4 = r3.f31892i
                r4.mo30016p(r0)
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.AttributeName
                r3.mo30234B(r4)
                goto L_0x007d
            L_0x006d:
                r4.mo30048U()
                r3.mo30259x(r2)
                org.jsoup.parser.Token$i r4 = r3.f31892i
                r4.mo30012F()
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.AttributeName
                r3.mo30234B(r4)
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokeniserState.C1284834.mo30027X(org.jsoup.parser.h, org.jsoup.parser.a):void");
        }
    },
    AttributeName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            hVar.f31892i.mo30017q(aVar.mo30066r(TokeniserState.f31738F1));
            char f = aVar.mo30054f();
            if (f == 9 || f == 10 || f == 12 || f == 13 || f == ' ') {
                hVar.mo30234B(TokeniserState.AfterAttributeName);
                return;
            }
            if (!(f == '\"' || f == '\'')) {
                if (f == '/') {
                    hVar.mo30234B(TokeniserState.SelfClosingStartTag);
                    return;
                } else if (f != 65535) {
                    switch (f) {
                        case '<':
                            break;
                        case '=':
                            hVar.mo30234B(TokeniserState.BeforeAttributeValue);
                            return;
                        case '>':
                            hVar.mo30255t();
                            hVar.mo30234B(TokeniserState.Data);
                            return;
                        default:
                            hVar.f31892i.mo30016p(f);
                            return;
                    }
                } else {
                    hVar.mo30256u(this);
                    hVar.mo30234B(TokeniserState.Data);
                    return;
                }
            }
            hVar.mo30259x(this);
            hVar.f31892i.mo30016p(f);
        }
    },
    AfterAttributeName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31892i.mo30016p(65533);
                hVar.mo30234B(TokeniserState.AttributeName);
            } else if (f != ' ') {
                if (!(f == '\"' || f == '\'')) {
                    if (f == '/') {
                        hVar.mo30234B(TokeniserState.SelfClosingStartTag);
                        return;
                    } else if (f == 65535) {
                        hVar.mo30256u(this);
                        hVar.mo30234B(TokeniserState.Data);
                        return;
                    } else if (f != 9 && f != 10 && f != 12 && f != 13) {
                        switch (f) {
                            case '<':
                                break;
                            case '=':
                                hVar.mo30234B(TokeniserState.BeforeAttributeValue);
                                return;
                            case '>':
                                hVar.mo30255t();
                                hVar.mo30234B(TokeniserState.Data);
                                return;
                            default:
                                hVar.f31892i.mo30012F();
                                aVar.mo30048U();
                                hVar.mo30234B(TokeniserState.AttributeName);
                                return;
                        }
                    } else {
                        return;
                    }
                }
                hVar.mo30259x(this);
                hVar.f31892i.mo30012F();
                hVar.f31892i.mo30016p(f);
                hVar.mo30234B(TokeniserState.AttributeName);
            }
        }
    },
    BeforeAttributeValue {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31892i.mo30018r(65533);
                hVar.mo30234B(TokeniserState.AttributeValue_unquoted);
            } else if (f == ' ') {
            } else {
                if (f != '\"') {
                    if (f != '`') {
                        if (f == 65535) {
                            hVar.mo30256u(this);
                            hVar.mo30255t();
                            hVar.mo30234B(TokeniserState.Data);
                            return;
                        } else if (f != 9 && f != 10 && f != 12 && f != 13) {
                            if (f == '&') {
                                aVar.mo30048U();
                                hVar.mo30234B(TokeniserState.AttributeValue_unquoted);
                                return;
                            } else if (f != '\'') {
                                switch (f) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        hVar.mo30259x(this);
                                        hVar.mo30255t();
                                        hVar.mo30234B(TokeniserState.Data);
                                        return;
                                    default:
                                        aVar.mo30048U();
                                        hVar.mo30234B(TokeniserState.AttributeValue_unquoted);
                                        return;
                                }
                            } else {
                                hVar.mo30234B(TokeniserState.AttributeValue_singleQuoted);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    hVar.mo30259x(this);
                    hVar.f31892i.mo30018r(f);
                    hVar.mo30234B(TokeniserState.AttributeValue_unquoted);
                    return;
                }
                hVar.mo30234B(TokeniserState.AttributeValue_doubleQuoted);
            }
        }
    },
    AttributeValue_doubleQuoted {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            String g = aVar.mo30055g(false);
            if (g.length() > 0) {
                hVar.f31892i.mo30019s(g);
            } else {
                hVar.f31892i.mo30014I();
            }
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31892i.mo30018r(65533);
            } else if (f == '\"') {
                hVar.mo30234B(TokeniserState.AfterAttributeValue_quoted);
            } else if (f == '&') {
                int[] e = hVar.mo30240e('\"', true);
                if (e != null) {
                    hVar.f31892i.mo30021u(e);
                } else {
                    hVar.f31892i.mo30018r(C11626x.f28913d);
                }
            } else if (f != 65535) {
                hVar.f31892i.mo30018r(f);
            } else {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    AttributeValue_singleQuoted {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            String g = aVar.mo30055g(true);
            if (g.length() > 0) {
                hVar.f31892i.mo30019s(g);
            } else {
                hVar.f31892i.mo30014I();
            }
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31892i.mo30018r(65533);
            } else if (f == 65535) {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
            } else if (f == '&') {
                int[] e = hVar.mo30240e('\'', true);
                if (e != null) {
                    hVar.f31892i.mo30021u(e);
                } else {
                    hVar.f31892i.mo30018r(C11626x.f28913d);
                }
            } else if (f != '\'') {
                hVar.f31892i.mo30018r(f);
            } else {
                hVar.mo30234B(TokeniserState.AfterAttributeValue_quoted);
            }
        }
    },
    AttributeValue_unquoted {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            String r = aVar.mo30066r(TokeniserState.f31740G1);
            if (r.length() > 0) {
                hVar.f31892i.mo30019s(r);
            }
            char f = aVar.mo30054f();
            if (f != 0) {
                if (f != ' ') {
                    if (!(f == '\"' || f == '`')) {
                        if (f == 65535) {
                            hVar.mo30256u(this);
                            hVar.mo30234B(TokeniserState.Data);
                            return;
                        } else if (!(f == 9 || f == 10 || f == 12 || f == 13)) {
                            if (f == '&') {
                                int[] e = hVar.mo30240e(Character.valueOf(C11626x.f28915f), true);
                                if (e != null) {
                                    hVar.f31892i.mo30021u(e);
                                    return;
                                } else {
                                    hVar.f31892i.mo30018r(C11626x.f28913d);
                                    return;
                                }
                            } else if (f != '\'') {
                                switch (f) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        hVar.mo30255t();
                                        hVar.mo30234B(TokeniserState.Data);
                                        return;
                                    default:
                                        hVar.f31892i.mo30018r(f);
                                        return;
                                }
                            }
                        }
                    }
                    hVar.mo30259x(this);
                    hVar.f31892i.mo30018r(f);
                    return;
                }
                hVar.mo30234B(TokeniserState.BeforeAttributeName);
                return;
            }
            hVar.mo30259x(this);
            hVar.f31892i.mo30018r(65533);
        }
    },
    AfterAttributeValue_quoted {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 9 || f == 10 || f == 12 || f == 13 || f == ' ') {
                hVar.mo30234B(TokeniserState.BeforeAttributeName);
            } else if (f == '/') {
                hVar.mo30234B(TokeniserState.SelfClosingStartTag);
            } else if (f == '>') {
                hVar.mo30255t();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                aVar.mo30048U();
                hVar.mo30259x(this);
                hVar.mo30234B(TokeniserState.BeforeAttributeName);
            } else {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    SelfClosingStartTag {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == '>') {
                hVar.f31892i.f31729k = true;
                hVar.mo30255t();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                aVar.mo30048U();
                hVar.mo30259x(this);
                hVar.mo30234B(TokeniserState.BeforeAttributeName);
            } else {
                hVar.mo30256u(this);
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    BogusComment {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            hVar.f31897n.mo29993q(aVar.mo30063o(C11626x.f28915f));
            char u = aVar.mo30070u();
            if (u == '>' || u == 65535) {
                aVar.mo30054f();
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    MarkupDeclarationOpen {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30031C("--")) {
                hVar.mo30242g();
                hVar.mo30234B(TokeniserState.CommentStart);
            } else if (aVar.mo30032D("DOCTYPE")) {
                hVar.mo30234B(TokeniserState.Doctype);
            } else if (aVar.mo30031C("[CDATA[")) {
                hVar.mo30245j();
                hVar.mo30234B(TokeniserState.CdataSection);
            } else {
                hVar.mo30259x(this);
                hVar.mo30241f();
                hVar.mo30234B(TokeniserState.BogusComment);
            }
        }
    },
    CommentStart {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31897n.mo29992p(65533);
                hVar.mo30234B(TokeniserState.Comment);
            } else if (f == '-') {
                hVar.mo30234B(TokeniserState.CommentStartDash);
            } else if (f == '>') {
                hVar.mo30259x(this);
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                aVar.mo30048U();
                hVar.mo30234B(TokeniserState.Comment);
            } else {
                hVar.mo30256u(this);
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    CommentStartDash {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31897n.mo29992p(65533);
                hVar.mo30234B(TokeniserState.Comment);
            } else if (f == '-') {
                hVar.mo30234B(TokeniserState.CommentStartDash);
            } else if (f == '>') {
                hVar.mo30259x(this);
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.f31897n.mo29992p(f);
                hVar.mo30234B(TokeniserState.Comment);
            } else {
                hVar.mo30256u(this);
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    Comment {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char u = aVar.mo30070u();
            if (u == 0) {
                hVar.mo30259x(this);
                aVar.mo30050a();
                hVar.f31897n.mo29992p(65533);
            } else if (u == '-') {
                hVar.mo30236a(TokeniserState.CommentEndDash);
            } else if (u != 65535) {
                hVar.f31897n.mo29993q(aVar.mo30065q('-', 0));
            } else {
                hVar.mo30256u(this);
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    CommentEndDash {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31897n.mo29992p('-').mo29992p(65533);
                hVar.mo30234B(TokeniserState.Comment);
            } else if (f == '-') {
                hVar.mo30234B(TokeniserState.CommentEnd);
            } else if (f != 65535) {
                hVar.f31897n.mo29992p('-').mo29992p(f);
                hVar.mo30234B(TokeniserState.Comment);
            } else {
                hVar.mo30256u(this);
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    CommentEnd {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31897n.mo29993q("--").mo29992p(65533);
                hVar.mo30234B(TokeniserState.Comment);
            } else if (f == '!') {
                hVar.mo30259x(this);
                hVar.mo30234B(TokeniserState.CommentEndBang);
            } else if (f == '-') {
                hVar.mo30259x(this);
                hVar.f31897n.mo29992p('-');
            } else if (f == '>') {
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.mo30259x(this);
                hVar.f31897n.mo29993q("--").mo29992p(f);
                hVar.mo30234B(TokeniserState.Comment);
            } else {
                hVar.mo30256u(this);
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    CommentEndBang {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31897n.mo29993q("--!").mo29992p(65533);
                hVar.mo30234B(TokeniserState.Comment);
            } else if (f == '-') {
                hVar.f31897n.mo29993q("--!");
                hVar.mo30234B(TokeniserState.CommentEndDash);
            } else if (f == '>') {
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.f31897n.mo29993q("--!").mo29992p(f);
                hVar.mo30234B(TokeniserState.Comment);
            } else {
                hVar.mo30256u(this);
                hVar.mo30253r();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    Doctype {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 9 || f == 10 || f == 12 || f == 13 || f == ' ') {
                hVar.mo30234B(TokeniserState.BeforeDoctypeName);
                return;
            }
            if (f != '>') {
                if (f != 65535) {
                    hVar.mo30259x(this);
                    hVar.mo30234B(TokeniserState.BeforeDoctypeName);
                    return;
                }
                hVar.mo30256u(this);
            }
            hVar.mo30259x(this);
            hVar.mo30243h();
            hVar.f31896m.f31718f = true;
            hVar.mo30254s();
            hVar.mo30234B(TokeniserState.Data);
        }
    },
    BeforeDoctypeName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30037I()) {
                hVar.mo30243h();
                hVar.mo30234B(TokeniserState.DoctypeName);
                return;
            }
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.mo30243h();
                hVar.f31896m.f31714b.append(65533);
                hVar.mo30234B(TokeniserState.DoctypeName);
            } else if (f == ' ') {
            } else {
                if (f == 65535) {
                    hVar.mo30256u(this);
                    hVar.mo30243h();
                    hVar.f31896m.f31718f = true;
                    hVar.mo30254s();
                    hVar.mo30234B(TokeniserState.Data);
                } else if (f != 9 && f != 10 && f != 12 && f != 13) {
                    hVar.mo30243h();
                    hVar.f31896m.f31714b.append(f);
                    hVar.mo30234B(TokeniserState.DoctypeName);
                }
            }
        }
    },
    DoctypeName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30040L()) {
                hVar.f31896m.f31714b.append(aVar.mo30059k());
                return;
            }
            char f = aVar.mo30054f();
            if (f != 0) {
                if (f != ' ') {
                    if (f == '>') {
                        hVar.mo30254s();
                        hVar.mo30234B(TokeniserState.Data);
                        return;
                    } else if (f == 65535) {
                        hVar.mo30256u(this);
                        hVar.f31896m.f31718f = true;
                        hVar.mo30254s();
                        hVar.mo30234B(TokeniserState.Data);
                        return;
                    } else if (!(f == 9 || f == 10 || f == 12 || f == 13)) {
                        hVar.f31896m.f31714b.append(f);
                        return;
                    }
                }
                hVar.mo30234B(TokeniserState.AfterDoctypeName);
                return;
            }
            hVar.mo30259x(this);
            hVar.f31896m.f31714b.append(65533);
        }
    },
    AfterDoctypeName {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            if (aVar.mo30072w()) {
                hVar.mo30256u(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            } else if (aVar.mo30035G(9, 10, 13, 12, ' ')) {
                aVar.mo30050a();
            } else if (aVar.mo30033E(C11626x.f28915f)) {
                hVar.mo30254s();
                hVar.mo30236a(TokeniserState.Data);
            } else if (aVar.mo30032D(C12775f.f31615f)) {
                hVar.f31896m.f31715c = C12775f.f31615f;
                hVar.mo30234B(TokeniserState.AfterDoctypePublicKeyword);
            } else if (aVar.mo30032D(C12775f.f31616g)) {
                hVar.f31896m.f31715c = C12775f.f31616g;
                hVar.mo30234B(TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30236a(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 9 || f == 10 || f == 12 || f == 13 || f == ' ') {
                hVar.mo30234B(TokeniserState.BeforeDoctypePublicIdentifier);
            } else if (f == '\"') {
                hVar.mo30259x(this);
                hVar.mo30234B(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
            } else if (f == '\'') {
                hVar.mo30259x(this);
                hVar.mo30234B(TokeniserState.DoctypePublicIdentifier_singleQuoted);
            } else if (f == '>') {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30234B(TokeniserState.BogusDoctype);
            } else {
                hVar.mo30256u(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    BeforeDoctypePublicIdentifier {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f != 9 && f != 10 && f != 12 && f != 13 && f != ' ') {
                if (f == '\"') {
                    hVar.mo30234B(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                } else if (f == '\'') {
                    hVar.mo30234B(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                } else if (f == '>') {
                    hVar.mo30259x(this);
                    hVar.f31896m.f31718f = true;
                    hVar.mo30254s();
                    hVar.mo30234B(TokeniserState.Data);
                } else if (f != 65535) {
                    hVar.mo30259x(this);
                    hVar.f31896m.f31718f = true;
                    hVar.mo30234B(TokeniserState.BogusDoctype);
                } else {
                    hVar.mo30256u(this);
                    hVar.f31896m.f31718f = true;
                    hVar.mo30254s();
                    hVar.mo30234B(TokeniserState.Data);
                }
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31896m.f31716d.append(65533);
            } else if (f == '\"') {
                hVar.mo30234B(TokeniserState.AfterDoctypePublicIdentifier);
            } else if (f == '>') {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.f31896m.f31716d.append(f);
            } else {
                hVar.mo30256u(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31896m.f31716d.append(65533);
            } else if (f == '\'') {
                hVar.mo30234B(TokeniserState.AfterDoctypePublicIdentifier);
            } else if (f == '>') {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.f31896m.f31716d.append(f);
            } else {
                hVar.mo30256u(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    AfterDoctypePublicIdentifier {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 9 || f == 10 || f == 12 || f == 13 || f == ' ') {
                hVar.mo30234B(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
            } else if (f == '\"') {
                hVar.mo30259x(this);
                hVar.mo30234B(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            } else if (f == '\'') {
                hVar.mo30259x(this);
                hVar.mo30234B(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
            } else if (f == '>') {
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30234B(TokeniserState.BogusDoctype);
            } else {
                hVar.mo30256u(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f != 9 && f != 10 && f != 12 && f != 13 && f != ' ') {
                if (f == '\"') {
                    hVar.mo30259x(this);
                    hVar.mo30234B(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                } else if (f == '\'') {
                    hVar.mo30259x(this);
                    hVar.mo30234B(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                } else if (f == '>') {
                    hVar.mo30254s();
                    hVar.mo30234B(TokeniserState.Data);
                } else if (f != 65535) {
                    hVar.mo30259x(this);
                    hVar.f31896m.f31718f = true;
                    hVar.mo30234B(TokeniserState.BogusDoctype);
                } else {
                    hVar.mo30256u(this);
                    hVar.f31896m.f31718f = true;
                    hVar.mo30254s();
                    hVar.mo30234B(TokeniserState.Data);
                }
            }
        }
    },
    AfterDoctypeSystemKeyword {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 9 || f == 10 || f == 12 || f == 13 || f == ' ') {
                hVar.mo30234B(TokeniserState.BeforeDoctypeSystemIdentifier);
            } else if (f == '\"') {
                hVar.mo30259x(this);
                hVar.mo30234B(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            } else if (f == '\'') {
                hVar.mo30259x(this);
                hVar.mo30234B(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
            } else if (f == '>') {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
            } else {
                hVar.mo30256u(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    BeforeDoctypeSystemIdentifier {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f != 9 && f != 10 && f != 12 && f != 13 && f != ' ') {
                if (f == '\"') {
                    hVar.mo30234B(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                } else if (f == '\'') {
                    hVar.mo30234B(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                } else if (f == '>') {
                    hVar.mo30259x(this);
                    hVar.f31896m.f31718f = true;
                    hVar.mo30254s();
                    hVar.mo30234B(TokeniserState.Data);
                } else if (f != 65535) {
                    hVar.mo30259x(this);
                    hVar.f31896m.f31718f = true;
                    hVar.mo30234B(TokeniserState.BogusDoctype);
                } else {
                    hVar.mo30256u(this);
                    hVar.f31896m.f31718f = true;
                    hVar.mo30254s();
                    hVar.mo30234B(TokeniserState.Data);
                }
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31896m.f31717e.append(65533);
            } else if (f == '\"') {
                hVar.mo30234B(TokeniserState.AfterDoctypeSystemIdentifier);
            } else if (f == '>') {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.f31896m.f31717e.append(f);
            } else {
                hVar.mo30256u(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == 0) {
                hVar.mo30259x(this);
                hVar.f31896m.f31717e.append(65533);
            } else if (f == '\'') {
                hVar.mo30234B(TokeniserState.AfterDoctypeSystemIdentifier);
            } else if (f == '>') {
                hVar.mo30259x(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f != 65535) {
                hVar.f31896m.f31717e.append(f);
            } else {
                hVar.mo30256u(this);
                hVar.f31896m.f31718f = true;
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    AfterDoctypeSystemIdentifier {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f != 9 && f != 10 && f != 12 && f != 13 && f != ' ') {
                if (f == '>') {
                    hVar.mo30254s();
                    hVar.mo30234B(TokeniserState.Data);
                } else if (f != 65535) {
                    hVar.mo30259x(this);
                    hVar.mo30234B(TokeniserState.BogusDoctype);
                } else {
                    hVar.mo30256u(this);
                    hVar.f31896m.f31718f = true;
                    hVar.mo30254s();
                    hVar.mo30234B(TokeniserState.Data);
                }
            }
        }
    },
    BogusDoctype {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            char f = aVar.mo30054f();
            if (f == '>') {
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            } else if (f == 65535) {
                hVar.mo30254s();
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    },
    CdataSection {
        /* renamed from: X */
        public void mo30027X(C12895h hVar, C12888a aVar) {
            hVar.f31891h.append(aVar.mo30064p("]]>"));
            if (aVar.mo30031C("]]>") || aVar.mo30072w()) {
                hVar.mo30250o(new Token.C12813b(hVar.f31891h.toString()));
                hVar.mo30234B(TokeniserState.Data);
            }
        }
    };
    

    /* renamed from: E1 */
    public static final char f31736E1 = '\u0000';

    /* renamed from: F1 */
    public static final char[] f31738F1 = null;

    /* renamed from: G1 */
    public static final char[] f31740G1 = null;

    /* renamed from: H1 */
    public static final char f31742H1 = '�';

    /* renamed from: I1 */
    public static final String f31744I1 = null;

    /* renamed from: J1 */
    public static final char f31746J1 = '￿';

    /* access modifiers changed from: public */
    static {
        f31738F1 = new char[]{9, 10, 12, 13, ' ', '\"', '\'', '/', C11626x.f28914e, '=', C11626x.f28915f};
        f31740G1 = new char[]{0, 9, 10, 12, 13, ' ', '\"', C11626x.f28913d, '\'', C11626x.f28914e, '=', C11626x.f28915f, '`'};
        f31744I1 = String.valueOf(65533);
    }

    /* renamed from: Q */
    public static void m55701Q(C12895h hVar, C12888a aVar, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (aVar.mo30040L()) {
            String k = aVar.mo30059k();
            hVar.f31891h.append(k);
            hVar.mo30248m(k);
            return;
        }
        char f = aVar.mo30054f();
        if (f == 9 || f == 10 || f == 12 || f == 13 || f == ' ' || f == '/' || f == '>') {
            if (hVar.f31891h.toString().equals("script")) {
                hVar.mo30234B(tokeniserState);
            } else {
                hVar.mo30234B(tokeniserState2);
            }
            hVar.mo30247l(f);
            return;
        }
        aVar.mo30048U();
        hVar.mo30234B(tokeniserState2);
    }

    /* renamed from: W */
    public static void m55702W(C12895h hVar, C12888a aVar, TokeniserState tokeniserState) {
        if (aVar.mo30040L()) {
            String k = aVar.mo30059k();
            hVar.f31892i.mo30023w(k);
            hVar.f31891h.append(k);
            return;
        }
        boolean z = true;
        if (hVar.mo30261z() && !aVar.mo30072w()) {
            char f = aVar.mo30054f();
            if (f == 9 || f == 10 || f == 12 || f == 13 || f == ' ') {
                hVar.mo30234B(BeforeAttributeName);
            } else if (f == '/') {
                hVar.mo30234B(SelfClosingStartTag);
            } else if (f != '>') {
                hVar.f31891h.append(f);
            } else {
                hVar.mo30255t();
                hVar.mo30234B(Data);
            }
            z = false;
        }
        if (z) {
            hVar.mo30248m("</");
            hVar.mo30249n(hVar.f31891h);
            hVar.mo30234B(tokeniserState);
        }
    }

    /* renamed from: Z */
    public static void m55703Z(C12895h hVar, TokeniserState tokeniserState) {
        int[] e = hVar.mo30240e((Character) null, false);
        if (e == null) {
            hVar.mo30247l(C11626x.f28913d);
        } else {
            hVar.mo30252q(e);
        }
        hVar.mo30234B(tokeniserState);
    }

    /* renamed from: e0 */
    public static void m55704e0(C12895h hVar, C12888a aVar, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (aVar.mo30037I()) {
            hVar.mo30244i(false);
            hVar.mo30234B(tokeniserState);
            return;
        }
        hVar.mo30248m("</");
        hVar.mo30234B(tokeniserState2);
    }

    /* renamed from: f0 */
    public static void m55705f0(C12895h hVar, C12888a aVar, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char u = aVar.mo30070u();
        if (u == 0) {
            hVar.mo30259x(tokeniserState);
            aVar.mo30050a();
            hVar.mo30247l(65533);
        } else if (u == '<') {
            hVar.mo30236a(tokeniserState2);
        } else if (u != 65535) {
            hVar.mo30248m(aVar.mo30061m());
        } else {
            hVar.mo30250o(new Token.C12817f());
        }
    }

    /* renamed from: X */
    public abstract void mo30027X(C12895h hVar, C12888a aVar);
}
