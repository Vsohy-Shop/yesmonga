package com.urbanairship.util;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.io.Closeable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.s0 */
public class C9678s0 extends C9648f implements Closeable {

    /* renamed from: c */
    public final XmlResourceParser f26500c;

    public C9678s0(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet, @C0359n0 XmlResourceParser xmlResourceParser) {
        super(context, attributeSet);
        this.f26500c = xmlResourceParser;
    }

    @C0359n0
    /* renamed from: l */
    public static C9678s0 m36243l(@C0359n0 Context context, int i, @C0359n0 String str) throws IOException, XmlPullParserException {
        AttributeSet attributeSet;
        XmlResourceParser xml = context.getResources().getXml(i);
        while (true) {
            try {
                int next = xml.next();
                if (next != 2 || !xml.getName().equals(str)) {
                    if (next == 1) {
                        attributeSet = null;
                        break;
                    }
                } else {
                    attributeSet = Xml.asAttributeSet(xml);
                    break;
                }
            } catch (IOException | XmlPullParserException e) {
                xml.close();
                throw e;
            }
        }
        if (attributeSet != null) {
            return new C9678s0(context, attributeSet, xml);
        }
        xml.close();
        throw new IOException("Element " + str + " not found");
    }

    public void close() {
        XmlResourceParser xmlResourceParser = this.f26500c;
        if (xmlResourceParser != null) {
            xmlResourceParser.close();
        }
    }
}
