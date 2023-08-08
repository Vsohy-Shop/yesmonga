package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.play.core.splitcompat.C32150r;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.splitinstall.p0 */
public final class C32191p0 {

    /* renamed from: a */
    public static C32193q0 f78486a;

    /* renamed from: a */
    public static synchronized C32193q0 m130238a(Context context) {
        C32193q0 q0Var;
        synchronized (C32191p0.class) {
            if (f78486a == null) {
                C32170g0 g0Var = new C32170g0((byte[]) null);
                g0Var.mo92968b(new C32157b1(C32150r.m130103c(context)));
                f78486a = g0Var.mo92967a();
            }
            q0Var = f78486a;
        }
        return q0Var;
    }

    @Nullable
    /* renamed from: b */
    public static C32182m0 m130239b(XmlPullParser xmlPullParser, C32180l0 l0Var) {
        String c;
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (!xmlPullParser.getName().equals("module") || (c = m130240c("name", xmlPullParser)) == null) {
                                    m130241d(xmlPullParser);
                                } else {
                                    while (xmlPullParser.next() != 3) {
                                        if (xmlPullParser.getEventType() == 2) {
                                            if (xmlPullParser.getName().equals("language")) {
                                                while (xmlPullParser.next() != 3) {
                                                    if (xmlPullParser.getEventType() == 2) {
                                                        if (xmlPullParser.getName().equals(C33541p.f81644a)) {
                                                            String c2 = m130240c("key", xmlPullParser);
                                                            String c3 = m130240c("split", xmlPullParser);
                                                            m130241d(xmlPullParser);
                                                            if (!(c2 == null || c3 == null)) {
                                                                l0Var.mo92980b(c, c2, c3);
                                                            }
                                                        } else {
                                                            m130241d(xmlPullParser);
                                                        }
                                                    }
                                                }
                                            } else {
                                                m130241d(xmlPullParser);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        m130241d(xmlPullParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        return l0Var.mo92979a();
    }

    @Nullable
    /* renamed from: c */
    public static String m130240c(String str, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m130241d(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
