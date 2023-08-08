package com.urbanairship.push;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.C36080x;
import com.urbanairship.push.notifications.C9504e;
import com.urbanairship.push.notifications.C9507f;
import com.urbanairship.util.C9669o0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.urbanairship.push.a */
public class C9447a {

    /* renamed from: a */
    public static final String f25855a = "UrbanAirshipActionButtonGroup";

    /* renamed from: b */
    public static final String f25856b = "UrbanAirshipActionButton";

    /* renamed from: c */
    public static final String f25857c = "id";

    /* renamed from: d */
    public static final String f25858d = "description";

    /* renamed from: e */
    public static final String f25859e = "foreground";

    @C0359n0
    /* renamed from: a */
    public static Map<String, C9507f> m35525a(@C0359n0 Context context, @C0351j1 int i) {
        try {
            return m35526b(context, context.getResources().getXml(i));
        } catch (Resources.NotFoundException | IOException | NullPointerException | XmlPullParserException e) {
            C36059m.m148411g(e, "Failed to parse NotificationActionButtonGroups.", new Object[0]);
            return new HashMap();
        }
    }

    /* renamed from: b */
    public static Map<String, C9507f> m35526b(@C0359n0 Context context, XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        HashMap hashMap = new HashMap();
        String str = null;
        C9507f.C9509b bVar = null;
        while (xmlResourceParser.next() != 1) {
            int eventType = xmlResourceParser.getEventType();
            String name = xmlResourceParser.getName();
            if (eventType == 2 && f25855a.equals(name)) {
                String attributeValue = xmlResourceParser.getAttributeValue((String) null, "id");
                if (C9669o0.m36224e(attributeValue)) {
                    C36059m.m148409e("%s missing id.", f25855a);
                } else {
                    bVar = C9507f.m35651c();
                    str = attributeValue;
                }
            } else if (!C9669o0.m36224e(str)) {
                if (eventType == 2 && f25856b.equals(name)) {
                    String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "id");
                    if (C9669o0.m36224e(attributeValue2)) {
                        C36059m.m148409e("%s missing id.", f25856b);
                    } else {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C36080x.C36096p.UrbanAirshipActionButton);
                        C9504e.C9506b k = C9504e.m35627i(attributeValue2).mo19308o(xmlResourceParser.getAttributeBooleanValue((String) null, "foreground", true)).mo19305l(obtainStyledAttributes.getResourceId(C36080x.C36096p.UrbanAirshipActionButton_android_icon, 0)).mo19304k(xmlResourceParser.getAttributeValue((String) null, "description"));
                        int i = C36080x.C36096p.UrbanAirshipActionButton_android_label;
                        int resourceId = obtainStyledAttributes.getResourceId(i, 0);
                        if (resourceId != 0) {
                            k.mo19306m(resourceId);
                        } else {
                            k.mo19307n(obtainStyledAttributes.getString(i));
                        }
                        bVar.mo19311a(k.mo19302i());
                        obtainStyledAttributes.recycle();
                    }
                } else if (eventType == 3 && f25855a.equals(name)) {
                    C9507f b = bVar.mo19312b();
                    if (b.mo19310b().isEmpty()) {
                        C36059m.m148409e("%s %s missing action buttons.", f25855a, str);
                    } else {
                        hashMap.put(str, b);
                    }
                }
            }
        }
        return hashMap;
    }
}
