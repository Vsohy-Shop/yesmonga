package com.google.android.gms.internal.gtm;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.android.gms.internal.gtm.C41488p1;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.gms.internal.gtm.r1 */
public class C41536r1<T extends C41488p1> extends C41511q0 {

    /* renamed from: b */
    public final C41512q1<T> f104917b;

    public C41536r1(C41607u0 u0Var, C41512q1<T> q1Var) {
        super(u0Var);
        this.f104917b = q1Var;
    }

    /* renamed from: T */
    public final T mo135797T(int i) {
        try {
            return mo135798U(mo135739M().mo135892b().getResources().getXml(i));
        } catch (Resources.NotFoundException e) {
            mo135763z("inflate() called with unknown resourceId", e);
            return null;
        }
    }

    /* renamed from: U */
    public final T mo135798U(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim)) {
                            this.f104917b.mo135767f(attributeValue, trim);
                        }
                    } else if (lowerCase.equals(C16717v.C16719b.f42182e)) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            this.f104917b.mo135764a(attributeValue2, trim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                this.f104917b.mo135765b(attributeValue3, Boolean.parseBoolean(trim3));
                            } catch (NumberFormatException e) {
                                mo135731B("Error parsing bool configuration value", trim3, e);
                            }
                        }
                    } else if (lowerCase.equals(C16717v.C16719b.f42179b)) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                this.f104917b.mo135766c(attributeValue4, Integer.parseInt(trim4));
                            } catch (NumberFormatException e2) {
                                mo135731B("Error parsing int configuration value", trim4, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            mo135755r("Error parsing tracker configuration file", e3);
        } catch (IOException e4) {
            mo135755r("Error parsing tracker configuration file", e4);
        }
        return this.f104917b.zza();
    }
}
