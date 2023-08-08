package org.jsoup.parser;

import androidx.appcompat.view.C0543g;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.carrefour.fid.android.design.components.widgets.C37254k1;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23948c;
import com.carrefour.fid.android.shared.constant.C28549i0;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.urbanairship.iam.C9166d;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.C12775f;
import org.jsoup.nodes.C12777h;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

enum HtmlTreeBuilderState {
    Initial {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (HtmlTreeBuilderState.m55591X(token)) {
                return true;
            }
            if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
            } else if (token.mo29983i()) {
                Token.C12816e c = token.mo29977c();
                C12775f fVar = new C12775f(bVar.f31909h.mo30171d(c.mo29997p()), c.mo29999r(), c.mo30000s());
                fVar.mo29904J0(c.mo29998q());
                bVar.mo30090H().mo29713J0(fVar);
                if (c.mo30001t()) {
                    bVar.mo30090H().mo29646E3(Document.QuirksMode.quirks);
                }
                bVar.mo30115T0(HtmlTreeBuilderState.BeforeHtml);
            } else {
                bVar.mo30115T0(HtmlTreeBuilderState.BeforeHtml);
                return bVar.mo30137k(token);
            }
            return true;
        }
    },
    BeforeHtml {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.mo29983i()) {
                bVar.mo30163z(this);
                return false;
            } else if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
                return true;
            } else if (HtmlTreeBuilderState.m55591X(token)) {
                bVar.mo30120Y(token.mo29975a());
                return true;
            } else if (token.mo29986l() && token.mo29979e().mo30013G().equals("html")) {
                bVar.mo30118W(token.mo29979e());
                bVar.mo30115T0(HtmlTreeBuilderState.BeforeHead);
                return true;
            } else if (token.mo29985k() && C12759f.m55104d(token.mo29978d().mo30013G(), C12811b.f31679e)) {
                return mo29964e0(token, bVar);
            } else {
                if (!token.mo29985k()) {
                    return mo29964e0(token, bVar);
                }
                bVar.mo30163z(this);
                return false;
            }
        }

        /* renamed from: e0 */
        public final boolean mo29964e0(Token token, C12889b bVar) {
            bVar.mo30131g0("html");
            bVar.mo30115T0(HtmlTreeBuilderState.BeforeHead);
            return bVar.mo30137k(token);
        }
    },
    BeforeHead {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (HtmlTreeBuilderState.m55591X(token)) {
                bVar.mo30120Y(token.mo29975a());
                return true;
            } else if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
                return true;
            } else if (token.mo29983i()) {
                bVar.mo30163z(this);
                return false;
            } else if (token.mo29986l() && token.mo29979e().mo30013G().equals("html")) {
                return HtmlTreeBuilderState.InBody.mo29955Z(token, bVar);
            } else {
                if (token.mo29986l() && token.mo29979e().mo30013G().equals("head")) {
                    bVar.mo30109Q0(bVar.mo30118W(token.mo29979e()));
                    bVar.mo30115T0(HtmlTreeBuilderState.InHead);
                    return true;
                } else if (token.mo29985k() && C12759f.m55104d(token.mo29978d().mo30013G(), C12811b.f31679e)) {
                    bVar.mo30268m("head");
                    return bVar.mo30137k(token);
                } else if (token.mo29985k()) {
                    bVar.mo30163z(this);
                    return false;
                } else {
                    bVar.mo30268m("head");
                    return bVar.mo30137k(token);
                }
            }
        }
    },
    InHead {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (HtmlTreeBuilderState.m55591X(token)) {
                bVar.mo30120Y(token.mo29975a());
                return true;
            }
            int i = C12810a.f31660a[token.f31702a.ordinal()];
            if (i == 1) {
                bVar.mo30121Z(token.mo29976b());
            } else if (i == 2) {
                bVar.mo30163z(this);
                return false;
            } else if (i == 3) {
                Token.C12819h e = token.mo29979e();
                String G = e.mo30013G();
                if (G.equals("html")) {
                    return HtmlTreeBuilderState.InBody.mo29955Z(token, bVar);
                }
                if (C12759f.m55104d(G, C12811b.f31675a)) {
                    Element a0 = bVar.mo30122a0(e);
                    if (G.equals("base") && a0.mo29892J("href")) {
                        bVar.mo30143o0(a0);
                    }
                } else if (G.equals("meta")) {
                    bVar.mo30122a0(e);
                } else if (G.equals("title")) {
                    HtmlTreeBuilderState.m55589Q(e, bVar);
                } else if (C12759f.m55104d(G, C12811b.f31676b)) {
                    HtmlTreeBuilderState.m55588M(e, bVar);
                } else if (G.equals("noscript")) {
                    bVar.mo30118W(e);
                    bVar.mo30115T0(HtmlTreeBuilderState.InHeadNoscript);
                } else if (G.equals("script")) {
                    bVar.f31904c.mo30234B(TokeniserState.ScriptData);
                    bVar.mo30142n0();
                    bVar.mo30115T0(HtmlTreeBuilderState.Text);
                    bVar.mo30118W(e);
                } else if (G.equals("head")) {
                    bVar.mo30163z(this);
                    return false;
                } else if (!G.equals(C9166d.f24876q0)) {
                    return mo29965e0(token, bVar);
                } else {
                    bVar.mo30118W(e);
                    bVar.mo30126d0();
                    bVar.mo30076A(false);
                    HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTemplate;
                    bVar.mo30115T0(htmlTreeBuilderState);
                    bVar.mo30085E0(htmlTreeBuilderState);
                }
            } else if (i != 4) {
                return mo29965e0(token, bVar);
            } else {
                String G2 = token.mo29978d().mo30013G();
                if (G2.equals("head")) {
                    bVar.mo30156v0();
                    bVar.mo30115T0(HtmlTreeBuilderState.AfterHead);
                } else if (C12759f.m55104d(G2, C12811b.f31677c)) {
                    return mo29965e0(token, bVar);
                } else {
                    if (!G2.equals(C9166d.f24876q0)) {
                        bVar.mo30163z(this);
                        return false;
                    } else if (!bVar.mo30148r0(G2)) {
                        bVar.mo30163z(this);
                    } else {
                        bVar.mo30084E(true);
                        if (!G2.equals(bVar.mo30262a().mo29799r2())) {
                            bVar.mo30163z(this);
                        }
                        bVar.mo30160x0(G2);
                        bVar.mo30149s();
                        bVar.mo30164z0();
                        bVar.mo30103N0();
                    }
                }
            }
            return true;
        }

        /* renamed from: e0 */
        public final boolean mo29965e0(Token token, C12896i iVar) {
            iVar.mo30267l("head");
            return iVar.mo30137k(token);
        }
    },
    InHeadNoscript {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.mo29983i()) {
                bVar.mo30163z(this);
                return true;
            } else if (token.mo29986l() && token.mo29979e().mo30013G().equals("html")) {
                return bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
            } else {
                if (token.mo29985k() && token.mo29978d().mo30013G().equals("noscript")) {
                    bVar.mo30156v0();
                    bVar.mo30115T0(HtmlTreeBuilderState.InHead);
                    return true;
                } else if (HtmlTreeBuilderState.m55591X(token) || token.mo29982h() || (token.mo29986l() && C12759f.m55104d(token.mo29979e().mo30013G(), C12811b.f31680f))) {
                    return bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                } else {
                    if (token.mo29985k() && token.mo29978d().mo30013G().equals("br")) {
                        return mo29966e0(token, bVar);
                    }
                    if ((!token.mo29986l() || !C12759f.m55104d(token.mo29979e().mo30013G(), C12811b.f31671K)) && !token.mo29985k()) {
                        return mo29966e0(token, bVar);
                    }
                    bVar.mo30163z(this);
                    return false;
                }
            }
        }

        /* renamed from: e0 */
        public final boolean mo29966e0(Token token, C12889b bVar) {
            bVar.mo30163z(this);
            bVar.mo30120Y(new Token.C12814c().mo29990p(token.toString()));
            return true;
        }
    },
    AfterHead {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (HtmlTreeBuilderState.m55591X(token)) {
                bVar.mo30120Y(token.mo29975a());
                return true;
            } else if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
                return true;
            } else if (token.mo29983i()) {
                bVar.mo30163z(this);
                return true;
            } else if (token.mo29986l()) {
                Token.C12819h e = token.mo29979e();
                String G = e.mo30013G();
                if (G.equals("html")) {
                    return bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
                }
                if (G.equals("body")) {
                    bVar.mo30118W(e);
                    bVar.mo30076A(false);
                    bVar.mo30115T0(HtmlTreeBuilderState.InBody);
                    return true;
                } else if (G.equals("frameset")) {
                    bVar.mo30118W(e);
                    bVar.mo30115T0(HtmlTreeBuilderState.InFrameset);
                    return true;
                } else if (C12759f.m55104d(G, C12811b.f31681g)) {
                    bVar.mo30163z(this);
                    Element K = bVar.mo30096K();
                    bVar.mo30081C0(K);
                    bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                    bVar.mo30093I0(K);
                    return true;
                } else if (G.equals("head")) {
                    bVar.mo30163z(this);
                    return false;
                } else {
                    mo29967e0(token, bVar);
                    return true;
                }
            } else if (token.mo29985k()) {
                String G2 = token.mo29978d().mo30013G();
                if (C12759f.m55104d(G2, C12811b.f31678d)) {
                    mo29967e0(token, bVar);
                    return true;
                } else if (G2.equals(C9166d.f24876q0)) {
                    bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                    return true;
                } else {
                    bVar.mo30163z(this);
                    return false;
                }
            } else {
                mo29967e0(token, bVar);
                return true;
            }
        }

        /* renamed from: e0 */
        public final boolean mo29967e0(Token token, C12889b bVar) {
            bVar.mo30268m("body");
            bVar.mo30076A(true);
            return bVar.mo30137k(token);
        }
    },
    InBody {

        /* renamed from: P0 */
        public static final int f31659P0 = 24;

        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            switch (C12810a.f31660a[token.f31702a.ordinal()]) {
                case 1:
                    bVar.mo30121Z(token.mo29976b());
                    return true;
                case 2:
                    bVar.mo30163z(this);
                    return false;
                case 3:
                    return mo29971n0(token, bVar);
                case 4:
                    return mo29969f0(token, bVar);
                case 5:
                    Token.C12814c a = token.mo29975a();
                    if (a.mo29991q().equals(HtmlTreeBuilderState.f31642N0)) {
                        bVar.mo30163z(this);
                        return false;
                    } else if (!bVar.mo30078B() || !HtmlTreeBuilderState.m55591X(a)) {
                        bVar.mo30089G0();
                        bVar.mo30120Y(a);
                        bVar.mo30076A(false);
                        return true;
                    } else {
                        bVar.mo30089G0();
                        bVar.mo30120Y(a);
                        return true;
                    }
                case 6:
                    if (bVar.mo30113S0() > 0) {
                        return bVar.mo30079B0(token, HtmlTreeBuilderState.InTemplate);
                    }
                    return true;
                default:
                    return true;
            }
        }

        /* renamed from: e0 */
        public boolean mo29968e0(Token token, C12889b bVar) {
            String str = token.mo29978d().f31721c;
            ArrayList<Element> M = bVar.mo30100M();
            if (bVar.mo30094J(str) == null) {
                bVar.mo30163z(this);
                return false;
            }
            int size = M.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Element element = M.get(size);
                if (element.mo29799r2().equals(str)) {
                    bVar.mo30082D(str);
                    if (!bVar.mo30263b(str)) {
                        bVar.mo30163z(this);
                    }
                    bVar.mo30160x0(str);
                } else if (bVar.mo30139l0(element)) {
                    bVar.mo30163z(this);
                    return false;
                } else {
                    size--;
                }
            }
            return true;
        }

        /* renamed from: f0 */
        public final boolean mo29969f0(Token token, C12889b bVar) {
            Token.C12818g d = token.mo29978d();
            String G = d.mo30013G();
            G.hashCode();
            char c = 65535;
            switch (G.hashCode()) {
                case -1321546630:
                    if (G.equals(C9166d.f24876q0)) {
                        c = 0;
                        break;
                    }
                    break;
                case 112:
                    if (G.equals("p")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3152:
                    if (G.equals("br")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3200:
                    if (G.equals(C37254k1.f93426c)) {
                        c = 3;
                        break;
                    }
                    break;
                case 3216:
                    if (G.equals("dt")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3273:
                    if (G.equals("h1")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3274:
                    if (G.equals("h2")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3275:
                    if (G.equals("h3")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3276:
                    if (G.equals("h4")) {
                        c = 8;
                        break;
                    }
                    break;
                case 3277:
                    if (G.equals("h5")) {
                        c = 9;
                        break;
                    }
                    break;
                case 3278:
                    if (G.equals("h6")) {
                        c = 10;
                        break;
                    }
                    break;
                case 3453:
                    if (G.equals("li")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3029410:
                    if (G.equals("body")) {
                        c = 12;
                        break;
                    }
                    break;
                case 3148996:
                    if (G.equals("form")) {
                        c = 13;
                        break;
                    }
                    break;
                case 3213227:
                    if (G.equals("html")) {
                        c = 14;
                        break;
                    }
                    break;
                case 3536714:
                    if (G.equals("span")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1869063452:
                    if (G.equals("sarcasm")) {
                        c = 16;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                    break;
                case 1:
                    if (bVar.mo30102N(G)) {
                        bVar.mo30082D(G);
                        if (!bVar.mo30263b(G)) {
                            bVar.mo30163z(this);
                        }
                        bVar.mo30160x0(G);
                        break;
                    } else {
                        bVar.mo30163z(this);
                        bVar.mo30268m(G);
                        return bVar.mo30137k(d);
                    }
                case 2:
                    bVar.mo30163z(this);
                    bVar.mo30268m("br");
                    return false;
                case 3:
                case 4:
                    if (bVar.mo30106P(G)) {
                        bVar.mo30082D(G);
                        if (!bVar.mo30263b(G)) {
                            bVar.mo30163z(this);
                        }
                        bVar.mo30160x0(G);
                        break;
                    } else {
                        bVar.mo30163z(this);
                        return false;
                    }
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String[] strArr = C12811b.f31683i;
                    if (bVar.mo30110R(strArr)) {
                        bVar.mo30082D(G);
                        if (!bVar.mo30263b(G)) {
                            bVar.mo30163z(this);
                        }
                        bVar.mo30162y0(strArr);
                        break;
                    } else {
                        bVar.mo30163z(this);
                        return false;
                    }
                case 11:
                    if (bVar.mo30104O(G)) {
                        bVar.mo30082D(G);
                        if (!bVar.mo30263b(G)) {
                            bVar.mo30163z(this);
                        }
                        bVar.mo30160x0(G);
                        break;
                    } else {
                        bVar.mo30163z(this);
                        return false;
                    }
                case 12:
                    if (bVar.mo30106P("body")) {
                        bVar.mo30115T0(HtmlTreeBuilderState.AfterBody);
                        break;
                    } else {
                        bVar.mo30163z(this);
                        return false;
                    }
                case 13:
                    if (bVar.mo30148r0(C9166d.f24876q0)) {
                        if (bVar.mo30106P(G)) {
                            bVar.mo30080C();
                            if (!bVar.mo30263b(G)) {
                                bVar.mo30163z(this);
                            }
                            bVar.mo30160x0(G);
                            break;
                        } else {
                            bVar.mo30163z(this);
                            return false;
                        }
                    } else {
                        C12777h I = bVar.mo30092I();
                        bVar.mo30105O0((C12777h) null);
                        if (I != null && bVar.mo30106P(G)) {
                            bVar.mo30080C();
                            if (!bVar.mo30263b(G)) {
                                bVar.mo30163z(this);
                            }
                            bVar.mo30093I0(I);
                            break;
                        } else {
                            bVar.mo30163z(this);
                            return false;
                        }
                    }
                case 14:
                    if (bVar.mo30267l("body")) {
                        return bVar.mo30137k(d);
                    }
                    break;
                case 15:
                case 16:
                    return mo29968e0(token, bVar);
                default:
                    if (C12759f.m55104d(G, C12811b.f31693s)) {
                        return mo29970m0(token, bVar);
                    }
                    if (C12759f.m55104d(G, C12811b.f31692r)) {
                        if (bVar.mo30106P(G)) {
                            bVar.mo30080C();
                            if (!bVar.mo30263b(G)) {
                                bVar.mo30163z(this);
                            }
                            bVar.mo30160x0(G);
                            break;
                        } else {
                            bVar.mo30163z(this);
                            return false;
                        }
                    } else if (C12759f.m55104d(G, C12811b.f31687m)) {
                        if (!bVar.mo30106P("name")) {
                            if (bVar.mo30106P(G)) {
                                bVar.mo30080C();
                                if (!bVar.mo30263b(G)) {
                                    bVar.mo30163z(this);
                                }
                                bVar.mo30160x0(G);
                                bVar.mo30149s();
                                break;
                            } else {
                                bVar.mo30163z(this);
                                return false;
                            }
                        }
                    } else {
                        return mo29968e0(token, bVar);
                    }
                    break;
            }
            return true;
        }

        /* renamed from: m0 */
        public final boolean mo29970m0(Token token, C12889b bVar) {
            C12889b bVar2 = bVar;
            String G = token.mo29978d().mo30013G();
            ArrayList<Element> M = bVar.mo30100M();
            boolean z = false;
            int i = 0;
            while (i < 8) {
                Element F = bVar2.mo30086F(G);
                if (F == null) {
                    return mo29968e0(token, bVar);
                }
                if (!bVar2.mo30151t0(F)) {
                    bVar2.mo30163z(this);
                    bVar2.mo30091H0(F);
                    return true;
                } else if (!bVar2.mo30106P(F.mo29799r2())) {
                    bVar2.mo30163z(this);
                    return z;
                } else {
                    if (bVar.mo30262a() != F) {
                        bVar2.mo30163z(this);
                    }
                    int size = M.size();
                    Element element = null;
                    int i2 = -1;
                    boolean z2 = z;
                    int i3 = 1;
                    Element element2 = null;
                    while (true) {
                        if (i3 >= size || i3 >= 64) {
                            break;
                        }
                        Element element3 = M.get(i3);
                        if (element3 != F) {
                            if (z2 && bVar2.mo30139l0(element3)) {
                                element = element3;
                                break;
                            }
                        } else {
                            element2 = M.get(i3 - 1);
                            i2 = bVar2.mo30077A0(element3);
                            z2 = true;
                        }
                        i3++;
                    }
                    if (element == null) {
                        bVar2.mo30160x0(F.mo29799r2());
                        bVar2.mo30091H0(F);
                        return true;
                    }
                    Element element4 = element;
                    Element element5 = element4;
                    for (int i4 = z; i4 < 3; i4++) {
                        if (bVar2.mo30151t0(element4)) {
                            element4 = bVar2.mo30145q(element4);
                        }
                        if (!bVar2.mo30136j0(element4)) {
                            bVar2.mo30093I0(element4);
                        } else if (element4 == F) {
                            break;
                        } else {
                            Element element6 = new Element(bVar2.mo30270p(element4.mo29651S(), C12891d.f31854d), bVar.mo30088G());
                            bVar2.mo30097K0(element4, element6);
                            bVar2.mo30101M0(element4, element6);
                            if (element5 == element) {
                                i2 = bVar2.mo30077A0(element6) + 1;
                            }
                            if (element5.mo29760b0() != null) {
                                element5.mo29932h0();
                            }
                            element6.mo29713J0(element5);
                            element4 = element6;
                            element5 = element4;
                        }
                    }
                    if (element2 != null) {
                        if (C12759f.m55104d(element2.mo29799r2(), C12811b.f31694t)) {
                            if (element5.mo29760b0() != null) {
                                element5.mo29932h0();
                            }
                            bVar2.mo30125c0(element5);
                        } else {
                            if (element5.mo29760b0() != null) {
                                element5.mo29932h0();
                            }
                            element2.mo29713J0(element5);
                        }
                    }
                    Element element7 = new Element(F.mo29742U2(), bVar.mo30088G());
                    element7.mo29784l().mo29843H(F.mo29784l());
                    element7.mo29718L0(element.mo29942v());
                    element.mo29713J0(element7);
                    bVar2.mo30091H0(F);
                    bVar2.mo30087F0(element7, i2);
                    bVar2.mo30093I0(F);
                    bVar2.mo30129f0(element, element7);
                    i++;
                    z = false;
                }
            }
            return true;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d6, code lost:
            r16 = r4;
         */
        /* renamed from: n0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo29971n0(org.jsoup.parser.Token r18, org.jsoup.parser.C12889b r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                org.jsoup.parser.Token$h r2 = r18.mo29979e()
                java.lang.String r3 = r2.mo30013G()
                r3.hashCode()
                int r4 = r3.hashCode()
                java.lang.String r5 = "isindex"
                java.lang.String r6 = "input"
                java.lang.String r7 = "svg"
                java.lang.String r8 = "nobr"
                java.lang.String r10 = "form"
                java.lang.String r11 = "body"
                java.lang.String r12 = "li"
                java.lang.String r13 = "hr"
                java.lang.String r14 = "option"
                java.lang.String r9 = "button"
                java.lang.String r15 = "a"
                r16 = -1
                switch(r4) {
                    case -1644953643: goto L_0x01ef;
                    case -1377687758: goto L_0x01e5;
                    case -1191214428: goto L_0x01d9;
                    case -1010136971: goto L_0x01ce;
                    case -1003243718: goto L_0x01c3;
                    case -906021636: goto L_0x01b8;
                    case -80773204: goto L_0x01ad;
                    case 97: goto L_0x01a4;
                    case 3200: goto L_0x0197;
                    case 3216: goto L_0x018a;
                    case 3273: goto L_0x017d;
                    case 3274: goto L_0x0170;
                    case 3275: goto L_0x0162;
                    case 3276: goto L_0x0154;
                    case 3277: goto L_0x0146;
                    case 3278: goto L_0x0138;
                    case 3338: goto L_0x012c;
                    case 3453: goto L_0x0120;
                    case 3646: goto L_0x0112;
                    case 3650: goto L_0x0104;
                    case 111267: goto L_0x00f6;
                    case 114276: goto L_0x00ea;
                    case 118811: goto L_0x00dc;
                    case 3029410: goto L_0x00d0;
                    case 3148996: goto L_0x00c4;
                    case 3213227: goto L_0x00b6;
                    case 3344136: goto L_0x00a8;
                    case 3386833: goto L_0x009c;
                    case 3536714: goto L_0x008e;
                    case 100313435: goto L_0x0080;
                    case 100358090: goto L_0x0074;
                    case 110115790: goto L_0x0066;
                    case 181975684: goto L_0x0058;
                    case 1973234167: goto L_0x004a;
                    case 2091304424: goto L_0x003e;
                    case 2115613112: goto L_0x0030;
                    default: goto L_0x002e;
                }
            L_0x002e:
                goto L_0x01fa
            L_0x0030:
                java.lang.String r4 = "noembed"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x003a
                goto L_0x01fa
            L_0x003a:
                r4 = 35
                goto L_0x01d6
            L_0x003e:
                boolean r4 = r3.equals(r5)
                if (r4 != 0) goto L_0x0046
                goto L_0x01fa
            L_0x0046:
                r4 = 34
                goto L_0x01d6
            L_0x004a:
                java.lang.String r4 = "plaintext"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0054
                goto L_0x01fa
            L_0x0054:
                r4 = 33
                goto L_0x01d6
            L_0x0058:
                java.lang.String r4 = "listing"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0062
                goto L_0x01fa
            L_0x0062:
                r4 = 32
                goto L_0x01d6
            L_0x0066:
                java.lang.String r4 = "table"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0070
                goto L_0x01fa
            L_0x0070:
                r4 = 31
                goto L_0x01d6
            L_0x0074:
                boolean r4 = r3.equals(r6)
                if (r4 != 0) goto L_0x007c
                goto L_0x01fa
            L_0x007c:
                r4 = 30
                goto L_0x01d6
            L_0x0080:
                java.lang.String r4 = "image"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x008a
                goto L_0x01fa
            L_0x008a:
                r4 = 29
                goto L_0x01d6
            L_0x008e:
                java.lang.String r4 = "span"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0098
                goto L_0x01fa
            L_0x0098:
                r4 = 28
                goto L_0x01d6
            L_0x009c:
                boolean r4 = r3.equals(r8)
                if (r4 != 0) goto L_0x00a4
                goto L_0x01fa
            L_0x00a4:
                r4 = 27
                goto L_0x01d6
            L_0x00a8:
                java.lang.String r4 = "math"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x00b2
                goto L_0x01fa
            L_0x00b2:
                r4 = 26
                goto L_0x01d6
            L_0x00b6:
                java.lang.String r4 = "html"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x00c0
                goto L_0x01fa
            L_0x00c0:
                r4 = 25
                goto L_0x01d6
            L_0x00c4:
                boolean r4 = r3.equals(r10)
                if (r4 != 0) goto L_0x00cc
                goto L_0x01fa
            L_0x00cc:
                r16 = 24
                goto L_0x01fa
            L_0x00d0:
                boolean r4 = r3.equals(r11)
                if (r4 != 0) goto L_0x00d8
                goto L_0x01fa
            L_0x00d8:
                r4 = 23
                goto L_0x01d6
            L_0x00dc:
                java.lang.String r4 = "xmp"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x00e6
                goto L_0x01fa
            L_0x00e6:
                r4 = 22
                goto L_0x01d6
            L_0x00ea:
                boolean r4 = r3.equals(r7)
                if (r4 != 0) goto L_0x00f2
                goto L_0x01fa
            L_0x00f2:
                r4 = 21
                goto L_0x01d6
            L_0x00f6:
                java.lang.String r4 = "pre"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0100
                goto L_0x01fa
            L_0x0100:
                r4 = 20
                goto L_0x01d6
            L_0x0104:
                java.lang.String r4 = "rt"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x010e
                goto L_0x01fa
            L_0x010e:
                r4 = 19
                goto L_0x01d6
            L_0x0112:
                java.lang.String r4 = "rp"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x011c
                goto L_0x01fa
            L_0x011c:
                r4 = 18
                goto L_0x01d6
            L_0x0120:
                boolean r4 = r3.equals(r12)
                if (r4 != 0) goto L_0x0128
                goto L_0x01fa
            L_0x0128:
                r4 = 17
                goto L_0x01d6
            L_0x012c:
                boolean r4 = r3.equals(r13)
                if (r4 != 0) goto L_0x0134
                goto L_0x01fa
            L_0x0134:
                r4 = 16
                goto L_0x01d6
            L_0x0138:
                java.lang.String r4 = "h6"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0142
                goto L_0x01fa
            L_0x0142:
                r4 = 15
                goto L_0x01d6
            L_0x0146:
                java.lang.String r4 = "h5"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0150
                goto L_0x01fa
            L_0x0150:
                r4 = 14
                goto L_0x01d6
            L_0x0154:
                java.lang.String r4 = "h4"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x015e
                goto L_0x01fa
            L_0x015e:
                r4 = 13
                goto L_0x01d6
            L_0x0162:
                java.lang.String r4 = "h3"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x016c
                goto L_0x01fa
            L_0x016c:
                r4 = 12
                goto L_0x01d6
            L_0x0170:
                java.lang.String r4 = "h2"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x017a
                goto L_0x01fa
            L_0x017a:
                r4 = 11
                goto L_0x01d6
            L_0x017d:
                java.lang.String r4 = "h1"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0187
                goto L_0x01fa
            L_0x0187:
                r4 = 10
                goto L_0x01d6
            L_0x018a:
                java.lang.String r4 = "dt"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0194
                goto L_0x01fa
            L_0x0194:
                r4 = 9
                goto L_0x01d6
            L_0x0197:
                java.lang.String r4 = "dd"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01a1
                goto L_0x01fa
            L_0x01a1:
                r4 = 8
                goto L_0x01d6
            L_0x01a4:
                boolean r4 = r3.equals(r15)
                if (r4 != 0) goto L_0x01ab
                goto L_0x01fa
            L_0x01ab:
                r4 = 7
                goto L_0x01d6
            L_0x01ad:
                java.lang.String r4 = "optgroup"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01b6
                goto L_0x01fa
            L_0x01b6:
                r4 = 6
                goto L_0x01d6
            L_0x01b8:
                java.lang.String r4 = "select"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01c1
                goto L_0x01fa
            L_0x01c1:
                r4 = 5
                goto L_0x01d6
            L_0x01c3:
                java.lang.String r4 = "textarea"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01cc
                goto L_0x01fa
            L_0x01cc:
                r4 = 4
                goto L_0x01d6
            L_0x01ce:
                boolean r4 = r3.equals(r14)
                if (r4 != 0) goto L_0x01d5
                goto L_0x01fa
            L_0x01d5:
                r4 = 3
            L_0x01d6:
                r16 = r4
                goto L_0x01fa
            L_0x01d9:
                java.lang.String r4 = "iframe"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01e2
                goto L_0x01fa
            L_0x01e2:
                r16 = 2
                goto L_0x01fa
            L_0x01e5:
                boolean r4 = r3.equals(r9)
                if (r4 != 0) goto L_0x01ec
                goto L_0x01fa
            L_0x01ec:
                r16 = 1
                goto L_0x01fa
            L_0x01ef:
                java.lang.String r4 = "frameset"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01f8
                goto L_0x01fa
            L_0x01f8:
                r16 = 0
            L_0x01fa:
                java.lang.String r4 = "template"
                java.lang.String r0 = "p"
                switch(r16) {
                    case 0: goto L_0x06bd;
                    case 1: goto L_0x069f;
                    case 2: goto L_0x0693;
                    case 3: goto L_0x067f;
                    case 4: goto L_0x065e;
                    case 5: goto L_0x0610;
                    case 6: goto L_0x067f;
                    case 7: goto L_0x05e9;
                    case 8: goto L_0x0591;
                    case 9: goto L_0x0591;
                    case 10: goto L_0x056a;
                    case 11: goto L_0x056a;
                    case 12: goto L_0x056a;
                    case 13: goto L_0x056a;
                    case 14: goto L_0x056a;
                    case 15: goto L_0x056a;
                    case 16: goto L_0x0555;
                    case 17: goto L_0x050b;
                    case 18: goto L_0x04ec;
                    case 19: goto L_0x04ec;
                    case 20: goto L_0x04d0;
                    case 21: goto L_0x04c5;
                    case 22: goto L_0x04ad;
                    case 23: goto L_0x0449;
                    case 24: goto L_0x0427;
                    case 25: goto L_0x03da;
                    case 26: goto L_0x03d0;
                    case 27: goto L_0x03b3;
                    case 28: goto L_0x03a7;
                    case 29: goto L_0x038f;
                    case 30: goto L_0x0372;
                    case 31: goto L_0x034d;
                    case 32: goto L_0x04d0;
                    case 33: goto L_0x0336;
                    case 34: goto L_0x029f;
                    case 35: goto L_0x0297;
                    default: goto L_0x0201;
                }
            L_0x0201:
                boolean r4 = org.jsoup.parser.C12893f.m55947m(r3)
                if (r4 != 0) goto L_0x020f
                r1.mo30118W(r2)
            L_0x020a:
                r3 = r17
                r4 = 1
                goto L_0x0713
            L_0x020f:
                java.lang.String[] r4 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31688n
                boolean r4 = org.jsoup.internal.C12759f.m55104d(r3, r4)
                if (r4 == 0) goto L_0x0222
                r19.mo30089G0()
                r1.mo30122a0(r2)
                r0 = 0
                r1.mo30076A(r0)
                goto L_0x020a
            L_0x0222:
                java.lang.String[] r4 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31682h
                boolean r4 = org.jsoup.internal.C12759f.m55104d(r3, r4)
                if (r4 == 0) goto L_0x0237
                boolean r3 = r1.mo30102N(r0)
                if (r3 == 0) goto L_0x0233
                r1.mo30267l(r0)
            L_0x0233:
                r1.mo30118W(r2)
                goto L_0x020a
            L_0x0237:
                java.lang.String[] r0 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31681g
                boolean r0 = org.jsoup.internal.C12759f.m55104d(r3, r0)
                if (r0 == 0) goto L_0x0248
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InHead
                r2 = r18
                boolean r0 = r1.mo30079B0(r2, r0)
                return r0
            L_0x0248:
                java.lang.String[] r0 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31686l
                boolean r0 = org.jsoup.internal.C12759f.m55104d(r3, r0)
                if (r0 == 0) goto L_0x025b
                r19.mo30089G0()
                org.jsoup.nodes.Element r0 = r1.mo30118W(r2)
                r1.mo30083D0(r0)
                goto L_0x020a
            L_0x025b:
                java.lang.String[] r0 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31687m
                boolean r0 = org.jsoup.internal.C12759f.m55104d(r3, r0)
                if (r0 == 0) goto L_0x0271
                r19.mo30089G0()
                r1.mo30118W(r2)
                r19.mo30126d0()
                r0 = 0
                r1.mo30076A(r0)
                goto L_0x020a
            L_0x0271:
                r0 = 0
                java.lang.String[] r4 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31689o
                boolean r4 = org.jsoup.internal.C12759f.m55104d(r3, r4)
                if (r4 == 0) goto L_0x027e
                r1.mo30122a0(r2)
                goto L_0x020a
            L_0x027e:
                java.lang.String[] r4 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31691q
                boolean r3 = org.jsoup.internal.C12759f.m55104d(r3, r4)
                if (r3 == 0) goto L_0x028c
                r3 = r17
                r1.mo30163z(r3)
                return r0
            L_0x028c:
                r3 = r17
                r9 = 1
                r19.mo30089G0()
                r1.mo30118W(r2)
                goto L_0x03b0
            L_0x0297:
                r3 = r17
                r9 = 1
                org.jsoup.parser.HtmlTreeBuilderState.m55588M(r2, r1)
                goto L_0x03b0
            L_0x029f:
                r3 = r17
                r0 = 0
                r9 = 1
                r1.mo30163z(r3)
                org.jsoup.nodes.h r4 = r19.mo30092I()
                if (r4 == 0) goto L_0x02ad
                return r0
            L_0x02ad:
                r1.mo30268m(r10)
                java.lang.String r0 = "action"
                boolean r4 = r2.mo30007A(r0)
                if (r4 == 0) goto L_0x02d1
                org.jsoup.nodes.h r4 = r19.mo30092I()
                if (r4 == 0) goto L_0x02d1
                boolean r7 = r2.mo30007A(r0)
                if (r7 == 0) goto L_0x02d1
                org.jsoup.nodes.b r7 = r2.f31730l
                java.lang.String r7 = r7.mo29863o0(r0)
                org.jsoup.nodes.b r4 = r4.mo29784l()
                r4.mo29846J0(r0, r7)
            L_0x02d1:
                r1.mo30268m(r13)
                java.lang.String r0 = "label"
                r1.mo30268m(r0)
                java.lang.String r4 = "prompt"
                boolean r7 = r2.mo30007A(r4)
                if (r7 == 0) goto L_0x02e8
                org.jsoup.nodes.b r7 = r2.f31730l
                java.lang.String r4 = r7.mo29863o0(r4)
                goto L_0x02ea
            L_0x02e8:
                java.lang.String r4 = "This is a searchable index. Enter search keywords: "
            L_0x02ea:
                org.jsoup.parser.Token$c r7 = new org.jsoup.parser.Token$c
                r7.<init>()
                org.jsoup.parser.Token$c r4 = r7.mo29990p(r4)
                r1.mo30137k(r4)
                org.jsoup.nodes.b r4 = new org.jsoup.nodes.b
                r4.<init>()
                boolean r7 = r2.mo30008B()
                if (r7 == 0) goto L_0x0323
                org.jsoup.nodes.b r2 = r2.f31730l
                java.util.Iterator r2 = r2.iterator()
            L_0x0307:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x0323
                java.lang.Object r7 = r2.next()
                org.jsoup.nodes.a r7 = (org.jsoup.nodes.C12766a) r7
                java.lang.String r8 = r7.getKey()
                java.lang.String[] r11 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31690p
                boolean r8 = org.jsoup.internal.C12759f.m55104d(r8, r11)
                if (r8 != 0) goto L_0x0307
                r4.mo29848M0(r7)
                goto L_0x0307
            L_0x0323:
                java.lang.String r2 = "name"
                r4.mo29846J0(r2, r5)
                r1.mo30141n(r6, r4)
                r1.mo30267l(r0)
                r1.mo30268m(r13)
                r1.mo30267l(r10)
                goto L_0x03b0
            L_0x0336:
                r3 = r17
                r9 = 1
                boolean r4 = r1.mo30102N(r0)
                if (r4 == 0) goto L_0x0342
                r1.mo30267l(r0)
            L_0x0342:
                r1.mo30118W(r2)
                org.jsoup.parser.h r0 = r1.f31904c
                org.jsoup.parser.TokeniserState r1 = org.jsoup.parser.TokeniserState.PLAINTEXT
                r0.mo30234B(r1)
                goto L_0x03b0
            L_0x034d:
                r3 = r17
                r9 = 1
                org.jsoup.nodes.Document r4 = r19.mo30090H()
                org.jsoup.nodes.Document$QuirksMode r4 = r4.mo29645D3()
                org.jsoup.nodes.Document$QuirksMode r5 = org.jsoup.nodes.Document.QuirksMode.quirks
                if (r4 == r5) goto L_0x0365
                boolean r4 = r1.mo30102N(r0)
                if (r4 == 0) goto L_0x0365
                r1.mo30267l(r0)
            L_0x0365:
                r1.mo30118W(r2)
                r0 = 0
                r1.mo30076A(r0)
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InTable
                r1.mo30115T0(r0)
                goto L_0x03b0
            L_0x0372:
                r3 = r17
                r0 = 0
                r9 = 1
                r19.mo30089G0()
                org.jsoup.nodes.Element r2 = r1.mo30122a0(r2)
                java.lang.String r4 = "type"
                java.lang.String r2 = r2.mo29896j(r4)
                java.lang.String r4 = "hidden"
                boolean r2 = r2.equalsIgnoreCase(r4)
                if (r2 != 0) goto L_0x03b0
                r1.mo30076A(r0)
                goto L_0x03b0
            L_0x038f:
                r3 = r17
                r9 = 1
                org.jsoup.nodes.Element r0 = r1.mo30094J(r7)
                if (r0 != 0) goto L_0x03a3
                java.lang.String r0 = "img"
                org.jsoup.parser.Token$i r0 = r2.mo30011E(r0)
                boolean r0 = r1.mo30137k(r0)
                return r0
            L_0x03a3:
                r1.mo30118W(r2)
                goto L_0x03b0
            L_0x03a7:
                r3 = r17
                r9 = 1
                r19.mo30089G0()
                r1.mo30118W(r2)
            L_0x03b0:
                r4 = r9
                goto L_0x0713
            L_0x03b3:
                r3 = r17
                r9 = 1
                r19.mo30089G0()
                boolean r0 = r1.mo30106P(r8)
                if (r0 == 0) goto L_0x03c8
                r1.mo30163z(r3)
                r1.mo30267l(r8)
                r19.mo30089G0()
            L_0x03c8:
                org.jsoup.nodes.Element r0 = r1.mo30118W(r2)
                r1.mo30083D0(r0)
                goto L_0x03b0
            L_0x03d0:
                r3 = r17
                r9 = 1
                r19.mo30089G0()
                r1.mo30118W(r2)
                goto L_0x03b0
            L_0x03da:
                r3 = r17
                r9 = 1
                r1.mo30163z(r3)
                boolean r0 = r1.mo30148r0(r4)
                if (r0 == 0) goto L_0x03e8
                r0 = 0
                return r0
            L_0x03e8:
                r0 = 0
                java.util.ArrayList r4 = r19.mo30100M()
                int r4 = r4.size()
                if (r4 <= 0) goto L_0x03b0
                java.util.ArrayList r1 = r19.mo30100M()
                java.lang.Object r0 = r1.get(r0)
                org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
                boolean r1 = r2.mo30008B()
                if (r1 == 0) goto L_0x03b0
                org.jsoup.nodes.b r1 = r2.f31730l
                java.util.Iterator r1 = r1.iterator()
            L_0x0409:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x03b0
                java.lang.Object r2 = r1.next()
                org.jsoup.nodes.a r2 = (org.jsoup.nodes.C12766a) r2
                java.lang.String r4 = r2.getKey()
                boolean r4 = r0.mo29892J(r4)
                if (r4 != 0) goto L_0x0409
                org.jsoup.nodes.b r4 = r0.mo29784l()
                r4.mo29848M0(r2)
                goto L_0x0409
            L_0x0427:
                r3 = r17
                r9 = 1
                org.jsoup.nodes.h r5 = r19.mo30092I()
                if (r5 == 0) goto L_0x043b
                boolean r4 = r1.mo30148r0(r4)
                if (r4 != 0) goto L_0x043b
                r1.mo30163z(r3)
                r0 = 0
                return r0
            L_0x043b:
                boolean r4 = r1.mo30102N(r0)
                if (r4 == 0) goto L_0x0444
                r1.mo30159x(r0)
            L_0x0444:
                r1.mo30123b0(r2, r9, r9)
                goto L_0x03b0
            L_0x0449:
                r3 = r17
                r9 = 1
                r1.mo30163z(r3)
                java.util.ArrayList r0 = r19.mo30100M()
                int r5 = r0.size()
                if (r5 == r9) goto L_0x04ab
                int r5 = r0.size()
                r6 = 2
                if (r5 <= r6) goto L_0x0470
                java.lang.Object r5 = r0.get(r9)
                org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
                java.lang.String r5 = r5.mo29799r2()
                boolean r5 = r5.equals(r11)
                if (r5 == 0) goto L_0x04ab
            L_0x0470:
                boolean r4 = r1.mo30148r0(r4)
                if (r4 == 0) goto L_0x0477
                goto L_0x04ab
            L_0x0477:
                r4 = 0
                r1.mo30076A(r4)
                java.lang.Object r0 = r0.get(r9)
                org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
                boolean r1 = r2.mo30008B()
                if (r1 == 0) goto L_0x03b0
                org.jsoup.nodes.b r1 = r2.f31730l
                java.util.Iterator r1 = r1.iterator()
            L_0x048d:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x03b0
                java.lang.Object r2 = r1.next()
                org.jsoup.nodes.a r2 = (org.jsoup.nodes.C12766a) r2
                java.lang.String r4 = r2.getKey()
                boolean r4 = r0.mo29892J(r4)
                if (r4 != 0) goto L_0x048d
                org.jsoup.nodes.b r4 = r0.mo29784l()
                r4.mo29848M0(r2)
                goto L_0x048d
            L_0x04ab:
                r4 = 0
                return r4
            L_0x04ad:
                r3 = r17
                r4 = 0
                r9 = 1
                boolean r5 = r1.mo30102N(r0)
                if (r5 == 0) goto L_0x04ba
                r1.mo30267l(r0)
            L_0x04ba:
                r19.mo30089G0()
                r1.mo30076A(r4)
                org.jsoup.parser.HtmlTreeBuilderState.m55588M(r2, r1)
                goto L_0x03b0
            L_0x04c5:
                r3 = r17
                r9 = 1
                r19.mo30089G0()
                r1.mo30118W(r2)
                goto L_0x03b0
            L_0x04d0:
                r3 = r17
                r9 = 1
                boolean r4 = r1.mo30102N(r0)
                if (r4 == 0) goto L_0x04dc
                r1.mo30267l(r0)
            L_0x04dc:
                r1.mo30118W(r2)
                org.jsoup.parser.a r0 = r1.f31903b
                java.lang.String r2 = "\n"
                r0.mo30031C(r2)
                r0 = 0
                r1.mo30076A(r0)
                goto L_0x03b0
            L_0x04ec:
                r3 = r17
                r9 = 1
                java.lang.String r0 = "ruby"
                boolean r4 = r1.mo30106P(r0)
                if (r4 == 0) goto L_0x03b0
                r19.mo30080C()
                boolean r4 = r1.mo30263b(r0)
                if (r4 != 0) goto L_0x0506
                r1.mo30163z(r3)
                r1.mo30158w0(r0)
            L_0x0506:
                r1.mo30118W(r2)
                goto L_0x03b0
            L_0x050b:
                r3 = r17
                r4 = 0
                r9 = 1
                r1.mo30076A(r4)
                java.util.ArrayList r4 = r19.mo30100M()
                int r5 = r4.size()
                int r5 = r5 - r9
            L_0x051b:
                if (r5 <= 0) goto L_0x0547
                java.lang.Object r6 = r4.get(r5)
                org.jsoup.nodes.Element r6 = (org.jsoup.nodes.Element) r6
                java.lang.String r7 = r6.mo29799r2()
                boolean r7 = r7.equals(r12)
                if (r7 == 0) goto L_0x0531
                r1.mo30267l(r12)
                goto L_0x0547
            L_0x0531:
                boolean r7 = r1.mo30139l0(r6)
                if (r7 == 0) goto L_0x0544
                java.lang.String r6 = r6.mo29799r2()
                java.lang.String[] r7 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31684j
                boolean r6 = org.jsoup.internal.C12759f.m55104d(r6, r7)
                if (r6 != 0) goto L_0x0544
                goto L_0x0547
            L_0x0544:
                int r5 = r5 + -1
                goto L_0x051b
            L_0x0547:
                boolean r4 = r1.mo30102N(r0)
                if (r4 == 0) goto L_0x0550
                r1.mo30267l(r0)
            L_0x0550:
                r1.mo30118W(r2)
                goto L_0x03b0
            L_0x0555:
                r3 = r17
                r9 = 1
                boolean r4 = r1.mo30102N(r0)
                if (r4 == 0) goto L_0x0561
                r1.mo30267l(r0)
            L_0x0561:
                r1.mo30122a0(r2)
                r0 = 0
                r1.mo30076A(r0)
                goto L_0x03b0
            L_0x056a:
                r3 = r17
                r9 = 1
                boolean r4 = r1.mo30102N(r0)
                if (r4 == 0) goto L_0x0576
                r1.mo30267l(r0)
            L_0x0576:
                org.jsoup.nodes.Element r0 = r19.mo30262a()
                java.lang.String r0 = r0.mo29799r2()
                java.lang.String[] r4 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31683i
                boolean r0 = org.jsoup.internal.C12759f.m55104d(r0, r4)
                if (r0 == 0) goto L_0x058c
                r1.mo30163z(r3)
                r19.mo30156v0()
            L_0x058c:
                r1.mo30118W(r2)
                goto L_0x03b0
            L_0x0591:
                r3 = r17
                r4 = 0
                r9 = 1
                r1.mo30076A(r4)
                java.util.ArrayList r4 = r19.mo30100M()
                int r5 = r4.size()
                int r5 = r5 - r9
                r6 = 24
                if (r5 < r6) goto L_0x05a8
                int r6 = r5 + -24
                goto L_0x05a9
            L_0x05a8:
                r6 = 0
            L_0x05a9:
                if (r5 < r6) goto L_0x05db
                java.lang.Object r7 = r4.get(r5)
                org.jsoup.nodes.Element r7 = (org.jsoup.nodes.Element) r7
                java.lang.String r8 = r7.mo29799r2()
                java.lang.String[] r10 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31685k
                boolean r8 = org.jsoup.internal.C12759f.m55104d(r8, r10)
                if (r8 == 0) goto L_0x05c5
                java.lang.String r4 = r7.mo29799r2()
                r1.mo30267l(r4)
                goto L_0x05db
            L_0x05c5:
                boolean r8 = r1.mo30139l0(r7)
                if (r8 == 0) goto L_0x05d8
                java.lang.String r7 = r7.mo29799r2()
                java.lang.String[] r8 = org.jsoup.parser.HtmlTreeBuilderState.C12811b.f31684j
                boolean r7 = org.jsoup.internal.C12759f.m55104d(r7, r8)
                if (r7 != 0) goto L_0x05d8
                goto L_0x05db
            L_0x05d8:
                int r5 = r5 + -1
                goto L_0x05a9
            L_0x05db:
                boolean r4 = r1.mo30102N(r0)
                if (r4 == 0) goto L_0x05e4
                r1.mo30267l(r0)
            L_0x05e4:
                r1.mo30118W(r2)
                goto L_0x03b0
            L_0x05e9:
                r3 = r17
                r9 = 1
                org.jsoup.nodes.Element r0 = r1.mo30086F(r15)
                if (r0 == 0) goto L_0x0604
                r1.mo30163z(r3)
                r1.mo30267l(r15)
                org.jsoup.nodes.Element r0 = r1.mo30094J(r15)
                if (r0 == 0) goto L_0x0604
                r1.mo30091H0(r0)
                r1.mo30093I0(r0)
            L_0x0604:
                r19.mo30089G0()
                org.jsoup.nodes.Element r0 = r1.mo30118W(r2)
                r1.mo30083D0(r0)
                goto L_0x03b0
            L_0x0610:
                r3 = r17
                r9 = 1
                r19.mo30089G0()
                r1.mo30118W(r2)
                r0 = 0
                r1.mo30076A(r0)
                boolean r0 = r2.f31729k
                if (r0 == 0) goto L_0x0623
                goto L_0x03b0
            L_0x0623:
                org.jsoup.parser.HtmlTreeBuilderState r0 = r19.mo30111R0()
                org.jsoup.parser.HtmlTreeBuilderState r2 = org.jsoup.parser.HtmlTreeBuilderState.InTable
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x0657
                org.jsoup.parser.HtmlTreeBuilderState r2 = org.jsoup.parser.HtmlTreeBuilderState.InCaption
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x0657
                org.jsoup.parser.HtmlTreeBuilderState r2 = org.jsoup.parser.HtmlTreeBuilderState.InTableBody
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x0657
                org.jsoup.parser.HtmlTreeBuilderState r2 = org.jsoup.parser.HtmlTreeBuilderState.InRow
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x0657
                org.jsoup.parser.HtmlTreeBuilderState r2 = org.jsoup.parser.HtmlTreeBuilderState.InCell
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0650
                goto L_0x0657
            L_0x0650:
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InSelect
                r1.mo30115T0(r0)
                goto L_0x03b0
            L_0x0657:
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable
                r1.mo30115T0(r0)
                goto L_0x03b0
            L_0x065e:
                r3 = r17
                r9 = 1
                r1.mo30118W(r2)
                boolean r0 = r2.mo30009C()
                if (r0 != 0) goto L_0x03b0
                org.jsoup.parser.h r0 = r1.f31904c
                org.jsoup.parser.TokeniserState r2 = org.jsoup.parser.TokeniserState.Rcdata
                r0.mo30234B(r2)
                r19.mo30142n0()
                r0 = 0
                r1.mo30076A(r0)
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.Text
                r1.mo30115T0(r0)
                goto L_0x03b0
            L_0x067f:
                r3 = r17
                r9 = 1
                boolean r0 = r1.mo30263b(r14)
                if (r0 == 0) goto L_0x068b
                r1.mo30267l(r14)
            L_0x068b:
                r19.mo30089G0()
                r1.mo30118W(r2)
                goto L_0x03b0
            L_0x0693:
                r3 = r17
                r0 = 0
                r9 = 1
                r1.mo30076A(r0)
                org.jsoup.parser.HtmlTreeBuilderState.m55588M(r2, r1)
                goto L_0x03b0
            L_0x069f:
                r3 = r17
                r0 = 0
                r4 = 1
                boolean r5 = r1.mo30102N(r9)
                if (r5 == 0) goto L_0x06b3
                r1.mo30163z(r3)
                r1.mo30267l(r9)
                r1.mo30137k(r2)
                goto L_0x0713
            L_0x06b3:
                r19.mo30089G0()
                r1.mo30118W(r2)
                r1.mo30076A(r0)
                goto L_0x0713
            L_0x06bd:
                r3 = r17
                r4 = 1
                r1.mo30163z(r3)
                java.util.ArrayList r0 = r19.mo30100M()
                int r5 = r0.size()
                if (r5 == r4) goto L_0x0714
                int r5 = r0.size()
                r6 = 2
                if (r5 <= r6) goto L_0x06e5
                java.lang.Object r5 = r0.get(r4)
                org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
                java.lang.String r5 = r5.mo29799r2()
                boolean r5 = r5.equals(r11)
                if (r5 != 0) goto L_0x06e5
                goto L_0x0714
            L_0x06e5:
                boolean r5 = r19.mo30078B()
                if (r5 != 0) goto L_0x06ed
                r5 = 0
                return r5
            L_0x06ed:
                java.lang.Object r5 = r0.get(r4)
                org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
                org.jsoup.nodes.Element r6 = r5.mo29760b0()
                if (r6 == 0) goto L_0x06fc
                r5.mo29932h0()
            L_0x06fc:
                int r5 = r0.size()
                if (r5 <= r4) goto L_0x070b
                int r5 = r0.size()
                int r5 = r5 - r4
                r0.remove(r5)
                goto L_0x06fc
            L_0x070b:
                r1.mo30118W(r2)
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset
                r1.mo30115T0(r0)
            L_0x0713:
                return r4
            L_0x0714:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C128077.mo29971n0(org.jsoup.parser.Token, org.jsoup.parser.b):boolean");
        }
    },
    Text {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.mo29981g()) {
                bVar.mo30120Y(token.mo29975a());
                return true;
            } else if (token.mo29984j()) {
                bVar.mo30163z(this);
                bVar.mo30156v0();
                bVar.mo30115T0(bVar.mo30154u0());
                return bVar.mo30137k(token);
            } else if (!token.mo29985k()) {
                return true;
            } else {
                bVar.mo30156v0();
                bVar.mo30115T0(bVar.mo30154u0());
                return true;
            }
        }
    },
    InTable {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.mo29981g() && C12759f.m55104d(bVar.mo30262a().mo29799r2(), C12811b.f31663C)) {
                bVar.mo30146q0();
                bVar.mo30142n0();
                bVar.mo30115T0(HtmlTreeBuilderState.InTableText);
                return bVar.mo30137k(token);
            } else if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
                return true;
            } else if (token.mo29983i()) {
                bVar.mo30163z(this);
                return false;
            } else if (token.mo29986l()) {
                Token.C12819h e = token.mo29979e();
                String G = e.mo30013G();
                if (G.equals("caption")) {
                    bVar.mo30155v();
                    bVar.mo30126d0();
                    bVar.mo30118W(e);
                    bVar.mo30115T0(HtmlTreeBuilderState.InCaption);
                } else if (G.equals("colgroup")) {
                    bVar.mo30155v();
                    bVar.mo30118W(e);
                    bVar.mo30115T0(HtmlTreeBuilderState.InColumnGroup);
                } else if (G.equals("col")) {
                    bVar.mo30155v();
                    bVar.mo30268m("colgroup");
                    return bVar.mo30137k(token);
                } else if (C12759f.m55104d(G, C12811b.f31695u)) {
                    bVar.mo30155v();
                    bVar.mo30118W(e);
                    bVar.mo30115T0(HtmlTreeBuilderState.InTableBody);
                } else if (C12759f.m55104d(G, C12811b.f31696v)) {
                    bVar.mo30155v();
                    bVar.mo30268m("tbody");
                    return bVar.mo30137k(token);
                } else if (G.equals("table")) {
                    bVar.mo30163z(this);
                    if (!bVar.mo30117V(G)) {
                        return false;
                    }
                    bVar.mo30160x0(G);
                    bVar.mo30103N0();
                    if (bVar.mo30111R0() != HtmlTreeBuilderState.InTable) {
                        return bVar.mo30137k(token);
                    }
                    bVar.mo30118W(e);
                    return true;
                } else if (C12759f.m55104d(G, C12811b.f31697w)) {
                    return bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                } else {
                    if (G.equals("input")) {
                        if (!e.mo30008B() || !e.f31730l.mo29863o0("type").equalsIgnoreCase("hidden")) {
                            return mo29972e0(token, bVar);
                        }
                        bVar.mo30122a0(e);
                    } else if (!G.equals("form")) {
                        return mo29972e0(token, bVar);
                    } else {
                        bVar.mo30163z(this);
                        if (bVar.mo30092I() != null || bVar.mo30148r0(C9166d.f24876q0)) {
                            return false;
                        }
                        bVar.mo30123b0(e, false, false);
                    }
                }
                return true;
            } else if (token.mo29985k()) {
                String G2 = token.mo29978d().mo30013G();
                if (G2.equals("table")) {
                    if (!bVar.mo30117V(G2)) {
                        bVar.mo30163z(this);
                        return false;
                    }
                    bVar.mo30160x0("table");
                    bVar.mo30103N0();
                } else if (C12759f.m55104d(G2, C12811b.f31662B)) {
                    bVar.mo30163z(this);
                    return false;
                } else if (!G2.equals(C9166d.f24876q0)) {
                    return mo29972e0(token, bVar);
                } else {
                    bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                }
                return true;
            } else if (!token.mo29984j()) {
                return mo29972e0(token, bVar);
            } else {
                if (bVar.mo30263b("html")) {
                    bVar.mo30163z(this);
                }
                return true;
            }
        }

        /* renamed from: e0 */
        public boolean mo29972e0(Token token, C12889b bVar) {
            bVar.mo30163z(this);
            bVar.mo30107P0(true);
            bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
            bVar.mo30107P0(false);
            return true;
        }
    },
    InTableText {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.f31702a == Token.TokenType.Character) {
                Token.C12814c a = token.mo29975a();
                if (a.mo29991q().equals(HtmlTreeBuilderState.f31642N0)) {
                    bVar.mo30163z(this);
                    return false;
                }
                bVar.mo30098L().add(a.mo29991q());
                return true;
            }
            if (bVar.mo30098L().size() > 0) {
                for (String next : bVar.mo30098L()) {
                    if (!HtmlTreeBuilderState.m55590W(next)) {
                        bVar.mo30163z(this);
                        if (C12759f.m55104d(bVar.mo30262a().mo29799r2(), C12811b.f31663C)) {
                            bVar.mo30107P0(true);
                            bVar.mo30079B0(new Token.C12814c().mo29990p(next), HtmlTreeBuilderState.InBody);
                            bVar.mo30107P0(false);
                        } else {
                            bVar.mo30079B0(new Token.C12814c().mo29990p(next), HtmlTreeBuilderState.InBody);
                        }
                    } else {
                        bVar.mo30120Y(new Token.C12814c().mo29990p(next));
                    }
                }
                bVar.mo30146q0();
            }
            bVar.mo30115T0(bVar.mo30154u0());
            return bVar.mo30137k(token);
        }
    },
    InCaption {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (!token.mo29985k() || !token.mo29978d().mo30013G().equals("caption")) {
                if ((token.mo29986l() && C12759f.m55104d(token.mo29979e().mo30013G(), C12811b.f31661A)) || (token.mo29985k() && token.mo29978d().mo30013G().equals("table"))) {
                    bVar.mo30163z(this);
                    if (bVar.mo30267l("caption")) {
                        return bVar.mo30137k(token);
                    }
                    return true;
                } else if (!token.mo29985k() || !C12759f.m55104d(token.mo29978d().mo30013G(), C12811b.f31672L)) {
                    return bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
                } else {
                    bVar.mo30163z(this);
                    return false;
                }
            } else if (!bVar.mo30117V(token.mo29978d().mo30013G())) {
                bVar.mo30163z(this);
                return false;
            } else {
                bVar.mo30080C();
                if (!bVar.mo30263b("caption")) {
                    bVar.mo30163z(this);
                }
                bVar.mo30160x0("caption");
                bVar.mo30149s();
                bVar.mo30115T0(HtmlTreeBuilderState.InTable);
                return true;
            }
        }
    },
    InColumnGroup {
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
            if (r3.equals("html") == false) goto L_0x0087;
         */
        /* renamed from: Z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo29955Z(org.jsoup.parser.Token r10, org.jsoup.parser.C12889b r11) {
            /*
                r9 = this;
                boolean r0 = org.jsoup.parser.HtmlTreeBuilderState.m55591X(r10)
                r1 = 1
                if (r0 == 0) goto L_0x000f
                org.jsoup.parser.Token$c r10 = r10.mo29975a()
                r11.mo30120Y(r10)
                return r1
            L_0x000f:
                int[] r0 = org.jsoup.parser.HtmlTreeBuilderState.C12810a.f31660a
                org.jsoup.parser.Token$TokenType r2 = r10.f31702a
                int r2 = r2.ordinal()
                r0 = r0[r2]
                if (r0 == r1) goto L_0x00c0
                r2 = 2
                if (r0 == r2) goto L_0x00bc
                r3 = 3
                java.lang.String r4 = "html"
                r5 = 0
                java.lang.String r6 = "template"
                if (r0 == r3) goto L_0x0074
                r2 = 4
                if (r0 == r2) goto L_0x003d
                r2 = 6
                if (r0 == r2) goto L_0x0031
                boolean r10 = r9.mo29956e0(r10, r11)
                return r10
            L_0x0031:
                boolean r0 = r11.mo30263b(r4)
                if (r0 == 0) goto L_0x0038
                return r1
            L_0x0038:
                boolean r10 = r9.mo29956e0(r10, r11)
                return r10
            L_0x003d:
                org.jsoup.parser.Token$g r0 = r10.mo29978d()
                java.lang.String r0 = r0.mo30013G()
                r0.hashCode()
                boolean r2 = r0.equals(r6)
                if (r2 != 0) goto L_0x006e
                java.lang.String r2 = "colgroup"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x005b
                boolean r10 = r9.mo29956e0(r10, r11)
                return r10
            L_0x005b:
                boolean r10 = r11.mo30263b(r0)
                if (r10 != 0) goto L_0x0065
                r11.mo30163z(r9)
                return r5
            L_0x0065:
                r11.mo30156v0()
                org.jsoup.parser.HtmlTreeBuilderState r10 = org.jsoup.parser.HtmlTreeBuilderState.InTable
                r11.mo30115T0(r10)
                goto L_0x00c7
            L_0x006e:
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InHead
                r11.mo30079B0(r10, r0)
                goto L_0x00c7
            L_0x0074:
                org.jsoup.parser.Token$h r0 = r10.mo29979e()
                java.lang.String r3 = r0.mo30013G()
                r3.hashCode()
                int r7 = r3.hashCode()
                r8 = -1
                switch(r7) {
                    case -1321546630: goto L_0x009b;
                    case 98688: goto L_0x0090;
                    case 3213227: goto L_0x0089;
                    default: goto L_0x0087;
                }
            L_0x0087:
                r2 = r8
                goto L_0x00a3
            L_0x0089:
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x00a3
                goto L_0x0087
            L_0x0090:
                java.lang.String r2 = "col"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L_0x0099
                goto L_0x0087
            L_0x0099:
                r2 = r1
                goto L_0x00a3
            L_0x009b:
                boolean r2 = r3.equals(r6)
                if (r2 != 0) goto L_0x00a2
                goto L_0x0087
            L_0x00a2:
                r2 = r5
            L_0x00a3:
                switch(r2) {
                    case 0: goto L_0x00b6;
                    case 1: goto L_0x00b2;
                    case 2: goto L_0x00ab;
                    default: goto L_0x00a6;
                }
            L_0x00a6:
                boolean r10 = r9.mo29956e0(r10, r11)
                return r10
            L_0x00ab:
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InBody
                boolean r10 = r11.mo30079B0(r10, r0)
                return r10
            L_0x00b2:
                r11.mo30122a0(r0)
                goto L_0x00c7
            L_0x00b6:
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InHead
                r11.mo30079B0(r10, r0)
                goto L_0x00c7
            L_0x00bc:
                r11.mo30163z(r9)
                goto L_0x00c7
            L_0x00c0:
                org.jsoup.parser.Token$d r10 = r10.mo29976b()
                r11.mo30121Z(r10)
            L_0x00c7:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C1278912.mo29955Z(org.jsoup.parser.Token, org.jsoup.parser.b):boolean");
        }

        /* renamed from: e0 */
        public final boolean mo29956e0(Token token, C12889b bVar) {
            if (!bVar.mo30263b("colgroup")) {
                bVar.mo30163z(this);
                return false;
            }
            bVar.mo30156v0();
            bVar.mo30115T0(HtmlTreeBuilderState.InTable);
            bVar.mo30137k(token);
            return true;
        }
    },
    InTableBody {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            int i = C12810a.f31660a[token.f31702a.ordinal()];
            if (i == 3) {
                Token.C12819h e = token.mo29979e();
                String G = e.mo30013G();
                if (G.equals("tr")) {
                    bVar.mo30153u();
                    bVar.mo30118W(e);
                    bVar.mo30115T0(HtmlTreeBuilderState.InRow);
                    return true;
                } else if (C12759f.m55104d(G, C12811b.f31698x)) {
                    bVar.mo30163z(this);
                    bVar.mo30268m("tr");
                    return bVar.mo30137k(e);
                } else if (C12759f.m55104d(G, C12811b.f31664D)) {
                    return mo29958f0(token, bVar);
                } else {
                    return mo29957e0(token, bVar);
                }
            } else if (i != 4) {
                return mo29957e0(token, bVar);
            } else {
                String G2 = token.mo29978d().mo30013G();
                if (C12759f.m55104d(G2, C12811b.f31670J)) {
                    if (!bVar.mo30117V(G2)) {
                        bVar.mo30163z(this);
                        return false;
                    }
                    bVar.mo30153u();
                    bVar.mo30156v0();
                    bVar.mo30115T0(HtmlTreeBuilderState.InTable);
                    return true;
                } else if (G2.equals("table")) {
                    return mo29958f0(token, bVar);
                } else {
                    if (!C12759f.m55104d(G2, C12811b.f31665E)) {
                        return mo29957e0(token, bVar);
                    }
                    bVar.mo30163z(this);
                    return false;
                }
            }
        }

        /* renamed from: e0 */
        public final boolean mo29957e0(Token token, C12889b bVar) {
            return bVar.mo30079B0(token, HtmlTreeBuilderState.InTable);
        }

        /* renamed from: f0 */
        public final boolean mo29958f0(Token token, C12889b bVar) {
            if (bVar.mo30117V("tbody") || bVar.mo30117V("thead") || bVar.mo30106P("tfoot")) {
                bVar.mo30153u();
                bVar.mo30267l(bVar.mo30262a().mo29799r2());
                return bVar.mo30137k(token);
            }
            bVar.mo30163z(this);
            return false;
        }
    },
    InRow {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.mo29986l()) {
                Token.C12819h e = token.mo29979e();
                String G = e.mo30013G();
                if (C12759f.m55104d(G, C12811b.f31698x)) {
                    bVar.mo30157w();
                    bVar.mo30118W(e);
                    bVar.mo30115T0(HtmlTreeBuilderState.InCell);
                    bVar.mo30126d0();
                    return true;
                } else if (C12759f.m55104d(G, C12811b.f31666F)) {
                    return mo29960f0(token, bVar);
                } else {
                    return mo29959e0(token, bVar);
                }
            } else if (!token.mo29985k()) {
                return mo29959e0(token, bVar);
            } else {
                String G2 = token.mo29978d().mo30013G();
                if (G2.equals("tr")) {
                    if (!bVar.mo30117V(G2)) {
                        bVar.mo30163z(this);
                        return false;
                    }
                    bVar.mo30157w();
                    bVar.mo30156v0();
                    bVar.mo30115T0(HtmlTreeBuilderState.InTableBody);
                    return true;
                } else if (G2.equals("table")) {
                    return mo29960f0(token, bVar);
                } else {
                    if (C12759f.m55104d(G2, C12811b.f31695u)) {
                        if (!bVar.mo30117V(G2) || !bVar.mo30117V("tr")) {
                            bVar.mo30163z(this);
                            return false;
                        }
                        bVar.mo30157w();
                        bVar.mo30156v0();
                        bVar.mo30115T0(HtmlTreeBuilderState.InTableBody);
                        return true;
                    } else if (!C12759f.m55104d(G2, C12811b.f31667G)) {
                        return mo29959e0(token, bVar);
                    } else {
                        bVar.mo30163z(this);
                        return false;
                    }
                }
            }
        }

        /* renamed from: e0 */
        public final boolean mo29959e0(Token token, C12889b bVar) {
            return bVar.mo30079B0(token, HtmlTreeBuilderState.InTable);
        }

        /* renamed from: f0 */
        public final boolean mo29960f0(Token token, C12896i iVar) {
            if (iVar.mo30267l("tr")) {
                return iVar.mo30137k(token);
            }
            return false;
        }
    },
    InCell {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.mo29985k()) {
                String G = token.mo29978d().mo30013G();
                if (C12759f.m55104d(G, C12811b.f31698x)) {
                    if (!bVar.mo30117V(G)) {
                        bVar.mo30163z(this);
                        bVar.mo30115T0(HtmlTreeBuilderState.InRow);
                        return false;
                    }
                    bVar.mo30080C();
                    if (!bVar.mo30263b(G)) {
                        bVar.mo30163z(this);
                    }
                    bVar.mo30160x0(G);
                    bVar.mo30149s();
                    bVar.mo30115T0(HtmlTreeBuilderState.InRow);
                    return true;
                } else if (C12759f.m55104d(G, C12811b.f31699y)) {
                    bVar.mo30163z(this);
                    return false;
                } else if (!C12759f.m55104d(G, C12811b.f31700z)) {
                    return mo29961e0(token, bVar);
                } else {
                    if (!bVar.mo30117V(G)) {
                        bVar.mo30163z(this);
                        return false;
                    }
                    mo29962f0(bVar);
                    return bVar.mo30137k(token);
                }
            } else if (!token.mo29986l() || !C12759f.m55104d(token.mo29979e().mo30013G(), C12811b.f31661A)) {
                return mo29961e0(token, bVar);
            } else {
                if (bVar.mo30117V("td") || bVar.mo30117V("th")) {
                    mo29962f0(bVar);
                    return bVar.mo30137k(token);
                }
                bVar.mo30163z(this);
                return false;
            }
        }

        /* renamed from: e0 */
        public final boolean mo29961e0(Token token, C12889b bVar) {
            return bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
        }

        /* renamed from: f0 */
        public final void mo29962f0(C12889b bVar) {
            if (bVar.mo30117V("td")) {
                bVar.mo30267l("td");
            } else {
                bVar.mo30267l("th");
            }
        }
    },
    InSelect {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            switch (C12810a.f31660a[token.f31702a.ordinal()]) {
                case 1:
                    bVar.mo30121Z(token.mo29976b());
                    break;
                case 2:
                    bVar.mo30163z(this);
                    return false;
                case 3:
                    Token.C12819h e = token.mo29979e();
                    String G = e.mo30013G();
                    if (G.equals("html")) {
                        return bVar.mo30079B0(e, HtmlTreeBuilderState.InBody);
                    }
                    if (G.equals("option")) {
                        if (bVar.mo30263b("option")) {
                            bVar.mo30267l("option");
                        }
                        bVar.mo30118W(e);
                        break;
                    } else if (G.equals("optgroup")) {
                        if (bVar.mo30263b("option")) {
                            bVar.mo30267l("option");
                        }
                        if (bVar.mo30263b("optgroup")) {
                            bVar.mo30267l("optgroup");
                        }
                        bVar.mo30118W(e);
                        break;
                    } else if (G.equals("select")) {
                        bVar.mo30163z(this);
                        return bVar.mo30267l("select");
                    } else if (C12759f.m55104d(G, C12811b.f31668H)) {
                        bVar.mo30163z(this);
                        if (!bVar.mo30112S("select")) {
                            return false;
                        }
                        bVar.mo30267l("select");
                        return bVar.mo30137k(e);
                    } else if (G.equals("script") || G.equals(C9166d.f24876q0)) {
                        return bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                    } else {
                        return mo29963e0(token, bVar);
                    }
                    break;
                case 4:
                    String G2 = token.mo29978d().mo30013G();
                    G2.hashCode();
                    char c = 65535;
                    switch (G2.hashCode()) {
                        case -1321546630:
                            if (G2.equals(C9166d.f24876q0)) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1010136971:
                            if (G2.equals("option")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (G2.equals("select")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -80773204:
                            if (G2.equals("optgroup")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            return bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                        case 1:
                            if (!bVar.mo30263b("option")) {
                                bVar.mo30163z(this);
                                break;
                            } else {
                                bVar.mo30156v0();
                                break;
                            }
                        case 2:
                            if (bVar.mo30112S(G2)) {
                                bVar.mo30160x0(G2);
                                bVar.mo30103N0();
                                break;
                            } else {
                                bVar.mo30163z(this);
                                return false;
                            }
                        case 3:
                            if (bVar.mo30263b("option") && bVar.mo30145q(bVar.mo30262a()) != null && bVar.mo30145q(bVar.mo30262a()).mo29799r2().equals("optgroup")) {
                                bVar.mo30267l("option");
                            }
                            if (!bVar.mo30263b("optgroup")) {
                                bVar.mo30163z(this);
                                break;
                            } else {
                                bVar.mo30156v0();
                                break;
                            }
                        default:
                            return mo29963e0(token, bVar);
                    }
                case 5:
                    Token.C12814c a = token.mo29975a();
                    if (!a.mo29991q().equals(HtmlTreeBuilderState.f31642N0)) {
                        bVar.mo30120Y(a);
                        break;
                    } else {
                        bVar.mo30163z(this);
                        return false;
                    }
                case 6:
                    if (!bVar.mo30263b("html")) {
                        bVar.mo30163z(this);
                        break;
                    }
                    break;
                default:
                    return mo29963e0(token, bVar);
            }
            return true;
        }

        /* renamed from: e0 */
        public final boolean mo29963e0(Token token, C12889b bVar) {
            bVar.mo30163z(this);
            return false;
        }
    },
    InSelectInTable {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.mo29986l() && C12759f.m55104d(token.mo29979e().mo30013G(), C12811b.f31669I)) {
                bVar.mo30163z(this);
                bVar.mo30160x0("select");
                bVar.mo30103N0();
                return bVar.mo30137k(token);
            } else if (!token.mo29985k() || !C12759f.m55104d(token.mo29978d().mo30013G(), C12811b.f31669I)) {
                return bVar.mo30079B0(token, HtmlTreeBuilderState.InSelect);
            } else {
                bVar.mo30163z(this);
                if (!bVar.mo30117V(token.mo29978d().mo30013G())) {
                    return false;
                }
                bVar.mo30160x0("select");
                bVar.mo30103N0();
                return bVar.mo30137k(token);
            }
        }
    },
    InTemplate {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            switch (C12810a.f31660a[token.f31702a.ordinal()]) {
                case 1:
                case 2:
                case 5:
                    bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
                    break;
                case 3:
                    String G = token.mo29979e().mo30013G();
                    if (C12759f.m55104d(G, C12811b.f31673M)) {
                        bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                        break;
                    } else if (C12759f.m55104d(G, C12811b.f31674N)) {
                        bVar.mo30164z0();
                        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
                        bVar.mo30085E0(htmlTreeBuilderState);
                        bVar.mo30115T0(htmlTreeBuilderState);
                        return bVar.mo30137k(token);
                    } else if (G.equals("col")) {
                        bVar.mo30164z0();
                        HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InColumnGroup;
                        bVar.mo30085E0(htmlTreeBuilderState2);
                        bVar.mo30115T0(htmlTreeBuilderState2);
                        return bVar.mo30137k(token);
                    } else if (G.equals("tr")) {
                        bVar.mo30164z0();
                        HtmlTreeBuilderState htmlTreeBuilderState3 = HtmlTreeBuilderState.InTableBody;
                        bVar.mo30085E0(htmlTreeBuilderState3);
                        bVar.mo30115T0(htmlTreeBuilderState3);
                        return bVar.mo30137k(token);
                    } else if (G.equals("td") || G.equals("th")) {
                        bVar.mo30164z0();
                        HtmlTreeBuilderState htmlTreeBuilderState4 = HtmlTreeBuilderState.InRow;
                        bVar.mo30085E0(htmlTreeBuilderState4);
                        bVar.mo30115T0(htmlTreeBuilderState4);
                        return bVar.mo30137k(token);
                    } else {
                        bVar.mo30164z0();
                        HtmlTreeBuilderState htmlTreeBuilderState5 = HtmlTreeBuilderState.InBody;
                        bVar.mo30085E0(htmlTreeBuilderState5);
                        bVar.mo30115T0(htmlTreeBuilderState5);
                        return bVar.mo30137k(token);
                    }
                case 4:
                    if (token.mo29978d().mo30013G().equals(C9166d.f24876q0)) {
                        bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                        break;
                    } else {
                        bVar.mo30163z(this);
                        return false;
                    }
                case 6:
                    if (!bVar.mo30148r0(C9166d.f24876q0)) {
                        return true;
                    }
                    bVar.mo30163z(this);
                    bVar.mo30160x0(C9166d.f24876q0);
                    bVar.mo30149s();
                    bVar.mo30164z0();
                    bVar.mo30103N0();
                    if (bVar.mo30111R0() == HtmlTreeBuilderState.InTemplate || bVar.mo30113S0() >= 12) {
                        return true;
                    }
                    return bVar.mo30137k(token);
            }
            return true;
        }
    },
    AfterBody {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (HtmlTreeBuilderState.m55591X(token)) {
                bVar.mo30120Y(token.mo29975a());
                return true;
            } else if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
                return true;
            } else if (token.mo29983i()) {
                bVar.mo30163z(this);
                return false;
            } else if (token.mo29986l() && token.mo29979e().mo30013G().equals("html")) {
                return bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
            } else {
                if (!token.mo29985k() || !token.mo29978d().mo30013G().equals("html")) {
                    if (token.mo29984j()) {
                        return true;
                    }
                    bVar.mo30163z(this);
                    bVar.mo30115T0(HtmlTreeBuilderState.InBody);
                    return bVar.mo30137k(token);
                } else if (bVar.mo30134i0()) {
                    bVar.mo30163z(this);
                    return false;
                } else {
                    bVar.mo30115T0(HtmlTreeBuilderState.AfterAfterBody);
                    return true;
                }
            }
        }
    },
    InFrameset {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (HtmlTreeBuilderState.m55591X(token)) {
                bVar.mo30120Y(token.mo29975a());
            } else if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
            } else if (token.mo29983i()) {
                bVar.mo30163z(this);
                return false;
            } else if (token.mo29986l()) {
                Token.C12819h e = token.mo29979e();
                String G = e.mo30013G();
                G.hashCode();
                char c = 65535;
                switch (G.hashCode()) {
                    case -1644953643:
                        if (G.equals("frameset")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (G.equals("html")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (G.equals(C16717v.C16718a.f42148L)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (G.equals("noframes")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        bVar.mo30118W(e);
                        break;
                    case 1:
                        return bVar.mo30079B0(e, HtmlTreeBuilderState.InBody);
                    case 2:
                        bVar.mo30122a0(e);
                        break;
                    case 3:
                        return bVar.mo30079B0(e, HtmlTreeBuilderState.InHead);
                    default:
                        bVar.mo30163z(this);
                        return false;
                }
            } else if (!token.mo29985k() || !token.mo29978d().mo30013G().equals("frameset")) {
                if (!token.mo29984j()) {
                    bVar.mo30163z(this);
                    return false;
                } else if (!bVar.mo30263b("html")) {
                    bVar.mo30163z(this);
                }
            } else if (bVar.mo30263b("html")) {
                bVar.mo30163z(this);
                return false;
            } else {
                bVar.mo30156v0();
                if (!bVar.mo30134i0() && !bVar.mo30263b("frameset")) {
                    bVar.mo30115T0(HtmlTreeBuilderState.AfterFrameset);
                }
            }
            return true;
        }
    },
    AfterFrameset {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (HtmlTreeBuilderState.m55591X(token)) {
                bVar.mo30120Y(token.mo29975a());
                return true;
            } else if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
                return true;
            } else if (token.mo29983i()) {
                bVar.mo30163z(this);
                return false;
            } else if (token.mo29986l() && token.mo29979e().mo30013G().equals("html")) {
                return bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
            } else {
                if (token.mo29985k() && token.mo29978d().mo30013G().equals("html")) {
                    bVar.mo30115T0(HtmlTreeBuilderState.AfterAfterFrameset);
                    return true;
                } else if (token.mo29986l() && token.mo29979e().mo30013G().equals("noframes")) {
                    return bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                } else {
                    if (token.mo29984j()) {
                        return true;
                    }
                    bVar.mo30163z(this);
                    return false;
                }
            }
        }
    },
    AfterAfterBody {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
                return true;
            } else if (token.mo29983i() || (token.mo29986l() && token.mo29979e().mo30013G().equals("html"))) {
                return bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
            } else {
                if (HtmlTreeBuilderState.m55591X(token)) {
                    Element x0 = bVar.mo30160x0("html");
                    bVar.mo30120Y(token.mo29975a());
                    if (x0 == null) {
                        return true;
                    }
                    bVar.f31906e.add(x0);
                    Element N2 = x0.mo29722N2("body");
                    if (N2 == null) {
                        return true;
                    }
                    bVar.f31906e.add(N2);
                    return true;
                } else if (token.mo29984j()) {
                    return true;
                } else {
                    bVar.mo30163z(this);
                    bVar.mo30115T0(HtmlTreeBuilderState.InBody);
                    return bVar.mo30137k(token);
                }
            }
        }
    },
    AfterAfterFrameset {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            if (token.mo29982h()) {
                bVar.mo30121Z(token.mo29976b());
                return true;
            } else if (token.mo29983i() || HtmlTreeBuilderState.m55591X(token) || (token.mo29986l() && token.mo29979e().mo30013G().equals("html"))) {
                return bVar.mo30079B0(token, HtmlTreeBuilderState.InBody);
            } else {
                if (token.mo29984j()) {
                    return true;
                }
                if (token.mo29986l() && token.mo29979e().mo30013G().equals("noframes")) {
                    return bVar.mo30079B0(token, HtmlTreeBuilderState.InHead);
                }
                bVar.mo30163z(this);
                return false;
            }
        }
    },
    ForeignContent {
        /* renamed from: Z */
        public boolean mo29955Z(Token token, C12889b bVar) {
            return true;
        }
    };
    

    /* renamed from: N0 */
    public static final String f31642N0 = null;

    /* renamed from: org.jsoup.parser.HtmlTreeBuilderState$a */
    public static /* synthetic */ class C12810a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31660a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.jsoup.parser.Token$TokenType[] r0 = org.jsoup.parser.Token.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31660a = r0
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Comment     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31660a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Doctype     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31660a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.StartTag     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31660a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EndTag     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31660a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Character     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31660a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C12810a.<clinit>():void");
        }
    }

    /* renamed from: org.jsoup.parser.HtmlTreeBuilderState$b */
    public static final class C12811b {

        /* renamed from: A */
        public static final String[] f31661A = null;

        /* renamed from: B */
        public static final String[] f31662B = null;

        /* renamed from: C */
        public static final String[] f31663C = null;

        /* renamed from: D */
        public static final String[] f31664D = null;

        /* renamed from: E */
        public static final String[] f31665E = null;

        /* renamed from: F */
        public static final String[] f31666F = null;

        /* renamed from: G */
        public static final String[] f31667G = null;

        /* renamed from: H */
        public static final String[] f31668H = null;

        /* renamed from: I */
        public static final String[] f31669I = null;

        /* renamed from: J */
        public static final String[] f31670J = null;

        /* renamed from: K */
        public static final String[] f31671K = null;

        /* renamed from: L */
        public static final String[] f31672L = null;

        /* renamed from: M */
        public static final String[] f31673M = null;

        /* renamed from: N */
        public static final String[] f31674N = null;

        /* renamed from: a */
        public static final String[] f31675a = null;

        /* renamed from: b */
        public static final String[] f31676b = null;

        /* renamed from: c */
        public static final String[] f31677c = null;

        /* renamed from: d */
        public static final String[] f31678d = null;

        /* renamed from: e */
        public static final String[] f31679e = null;

        /* renamed from: f */
        public static final String[] f31680f = null;

        /* renamed from: g */
        public static final String[] f31681g = null;

        /* renamed from: h */
        public static final String[] f31682h = null;

        /* renamed from: i */
        public static final String[] f31683i = null;

        /* renamed from: j */
        public static final String[] f31684j = null;

        /* renamed from: k */
        public static final String[] f31685k = null;

        /* renamed from: l */
        public static final String[] f31686l = null;

        /* renamed from: m */
        public static final String[] f31687m = null;

        /* renamed from: n */
        public static final String[] f31688n = null;

        /* renamed from: o */
        public static final String[] f31689o = null;

        /* renamed from: p */
        public static final String[] f31690p = null;

        /* renamed from: q */
        public static final String[] f31691q = null;

        /* renamed from: r */
        public static final String[] f31692r = null;

        /* renamed from: s */
        public static final String[] f31693s = null;

        /* renamed from: t */
        public static final String[] f31694t = null;

        /* renamed from: u */
        public static final String[] f31695u = null;

        /* renamed from: v */
        public static final String[] f31696v = null;

        /* renamed from: w */
        public static final String[] f31697w = null;

        /* renamed from: x */
        public static final String[] f31698x = null;

        /* renamed from: y */
        public static final String[] f31699y = null;

        /* renamed from: z */
        public static final String[] f31700z = null;

        static {
            f31675a = new String[]{"base", "basefont", "bgsound", "command", "link"};
            f31676b = new String[]{"noframes", "style"};
            f31677c = new String[]{"body", "br", "html"};
            f31678d = new String[]{"body", "br", "html"};
            f31679e = new String[]{"body", "br", "head", "html"};
            f31680f = new String[]{"basefont", "bgsound", "link", "meta", "noframes", "style"};
            f31681g = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", C9166d.f24876q0, "title"};
            f31682h = new String[]{"address", "article", "aside", "blockquote", C9168d0.f24881F0, C23948c.f60118a, "dir", "div", "dl", "fieldset", "figcaption", "figure", C9166d.f24877r0, C28549i0.f69374H, "hgroup", C0543g.f1415f, "nav", "ol", "p", "section", "summary", "ul"};
            f31683i = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            f31684j = new String[]{"address", "div", "p"};
            f31685k = new String[]{C37254k1.f93426c, "dt"};
            f31686l = new String[]{"b", "big", "code", "em", "font", "i", C34935s.f84988a, "small", "strike", "strong", "tt", "u"};
            f31687m = new String[]{"applet", "marquee", "object"};
            f31688n = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
            f31689o = new String[]{"param", "source", "track"};
            f31690p = new String[]{"action", "name", "prompt"};
            f31691q = new String[]{"caption", "col", "colgroup", C16717v.C16718a.f42148L, "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f31692r = new String[]{"address", "article", "aside", "blockquote", C9175a.f24945j0, C9168d0.f24881F0, C23948c.f60118a, "dir", "div", "dl", "fieldset", "figcaption", "figure", C9166d.f24877r0, C28549i0.f69374H, "hgroup", "listing", C0543g.f1415f, "nav", "ol", "pre", "section", "summary", "ul"};
            f31693s = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", C34935s.f84988a, "small", "strike", "strong", "tt", "u"};
            f31694t = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            f31695u = new String[]{"tbody", "tfoot", "thead"};
            f31696v = new String[]{"td", "th", "tr"};
            f31697w = new String[]{"script", "style", C9166d.f24876q0};
            f31698x = new String[]{"td", "th"};
            f31699y = new String[]{"body", "caption", "col", "colgroup", "html"};
            f31700z = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            f31661A = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f31662B = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f31663C = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            f31664D = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
            f31665E = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
            f31666F = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
            f31667G = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
            f31668H = new String[]{"input", "keygen", "textarea"};
            f31669I = new String[]{"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f31670J = new String[]{"tbody", "tfoot", "thead"};
            f31671K = new String[]{"head", "noscript"};
            f31672L = new String[]{"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f31673M = new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", C9166d.f24876q0, "title"};
            f31674N = new String[]{"caption", "colgroup", "tbody", "tfoot", "thead"};
        }
    }

    /* access modifiers changed from: public */
    static {
        f31642N0 = String.valueOf(0);
    }

    /* renamed from: M */
    public static void m55588M(Token.C12819h hVar, C12889b bVar) {
        bVar.f31904c.mo30234B(TokeniserState.Rawtext);
        bVar.mo30142n0();
        bVar.mo30115T0(Text);
        bVar.mo30118W(hVar);
    }

    /* renamed from: Q */
    public static void m55589Q(Token.C12819h hVar, C12889b bVar) {
        bVar.f31904c.mo30234B(TokeniserState.Rcdata);
        bVar.mo30142n0();
        bVar.mo30115T0(Text);
        bVar.mo30118W(hVar);
    }

    /* renamed from: W */
    public static boolean m55590W(String str) {
        return C12759f.m55107g(str);
    }

    /* renamed from: X */
    public static boolean m55591X(Token token) {
        if (token.mo29981g()) {
            return C12759f.m55107g(token.mo29975a().mo29991q());
        }
        return false;
    }

    /* renamed from: Z */
    public abstract boolean mo29955Z(Token token, C12889b bVar);
}
