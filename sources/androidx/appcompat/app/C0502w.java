package androidx.appcompat.app;

import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.app.w */
public class C0502w {
    @C0359n0

    /* renamed from: a */
    public final Deque<WeakReference<XmlPullParser>> f1283a = new ArrayDeque();

    /* renamed from: b */
    public static boolean m2332b(@C0363p0 XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            if (xmlPullParser.getEventType() == 3 || xmlPullParser.getEventType() == 1) {
                return true;
            }
            return false;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    @C0363p0
    /* renamed from: c */
    public static XmlPullParser m2333c(@C0359n0 Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = (XmlPullParser) deque.peek().get();
            if (!m2332b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m2334d(@C0359n0 XmlPullParser xmlPullParser, @C0363p0 XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo1560a(@C0359n0 AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser c = m2333c(this.f1283a);
        this.f1283a.push(new WeakReference(xmlPullParser));
        if (m2334d(xmlPullParser, c)) {
            return true;
        }
        return false;
    }
}
