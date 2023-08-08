package com.urbanairship.actions;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.actions.C35492e;
import com.urbanairship.util.C9669o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.urbanairship.actions.d */
public class C35491d {

    /* renamed from: a */
    public static final String f87523a = "ActionEntry";

    /* renamed from: b */
    public static final String f87524b = "name";

    /* renamed from: c */
    public static final String f87525c = "class";

    /* renamed from: d */
    public static final String f87526d = "predicate";

    @C0359n0
    /* renamed from: a */
    public static List<C35492e.C35493a> m146433a(@C0359n0 Context context, @C0351j1 int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            return m146434b(xml);
        } catch (Resources.NotFoundException | IOException | NullPointerException | XmlPullParserException e) {
            C36059m.m148411g(e, "Failed to parse action entries.", new Object[0]);
            return new ArrayList();
        } finally {
            xml.close();
        }
    }

    /* renamed from: b */
    public static List<C35492e.C35493a> m146434b(XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        C35492e.C35493a c;
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 1) {
            int eventType = xmlResourceParser.getEventType();
            String name = xmlResourceParser.getName();
            if (eventType == 2 && f87523a.equals(name) && (c = m146435c(xmlResourceParser)) != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: c */
    public static C35492e.C35493a m146435c(XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        String d;
        String attributeValue = xmlResourceParser.getAttributeValue((String) null, f87525c);
        String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "predicate");
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 1) {
            int eventType = xmlResourceParser.getEventType();
            String name = xmlResourceParser.getName();
            if (eventType == 2 && "name".equals(name) && (d = m146436d(xmlResourceParser)) != null) {
                arrayList.add(d);
            }
            if (eventType == 3 && f87523a.equals(name)) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C36059m.m148409e("Action names not found.", new Object[0]);
            return null;
        }
        try {
            C35492e.C35493a aVar = new C35492e.C35493a((Class) Class.forName(attributeValue).asSubclass(C35487a.class), (List<String>) arrayList);
            if (!C9669o0.m36224e(attributeValue2)) {
                try {
                    aVar.mo106366i((C35492e.C35494b) Class.forName(attributeValue2).asSubclass(C35492e.C35494b.class).newInstance());
                } catch (Exception unused) {
                    C36059m.m148409e("Predicate class %s not found. Skipping predicate.", attributeValue2);
                }
            }
            return aVar;
        } catch (ClassNotFoundException unused2) {
            C36059m.m148409e("Action class %s not found.", attributeValue);
            return null;
        }
    }

    @C0363p0
    /* renamed from: d */
    public static String m146436d(XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        while (xmlResourceParser.next() != 1) {
            int eventType = xmlResourceParser.getEventType();
            String name = xmlResourceParser.getName();
            if (eventType == 4) {
                return xmlResourceParser.getText();
            }
            if (eventType == 3 && "name".equals(name)) {
                return null;
            }
        }
        return null;
    }
}
