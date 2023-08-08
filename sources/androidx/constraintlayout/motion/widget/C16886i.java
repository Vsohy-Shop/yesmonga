package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.i */
public class C16886i {

    /* renamed from: b */
    public static final int f43494b = -1;

    /* renamed from: c */
    public static final String f43495c = "CustomMethod";

    /* renamed from: d */
    public static final String f43496d = "CustomAttribute";

    /* renamed from: e */
    public static HashMap<String, Constructor<? extends C16881f>> f43497e = null;

    /* renamed from: f */
    public static final String f43498f = "KeyFrames";

    /* renamed from: a */
    public HashMap<Integer, ArrayList<C16881f>> f43499a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends C16881f>> hashMap = new HashMap<>();
        f43497e = hashMap;
        try {
            hashMap.put("KeyAttribute", C16882g.class.getConstructor(new Class[0]));
            f43497e.put("KeyPosition", C16887j.class.getConstructor(new Class[0]));
            f43497e.put("KeyCycle", C16884h.class.getConstructor(new Class[0]));
            f43497e.put("KeyTimeCycle", C16890l.class.getConstructor(new Class[0]));
            f43497e.put("KeyTrigger", C16892m.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public C16886i() {
    }

    /* renamed from: f */
    public static String m77728f(int i, Context context) {
        return context.getResources().getResourceEntryName(i);
    }

    /* renamed from: a */
    public void mo50174a(C16895o oVar) {
        ArrayList arrayList = this.f43499a.get(-1);
        if (arrayList != null) {
            oVar.mo50241b(arrayList);
        }
    }

    /* renamed from: b */
    public void mo50175b(C16895o oVar) {
        ArrayList arrayList = this.f43499a.get(Integer.valueOf(oVar.f43717c));
        if (arrayList != null) {
            oVar.mo50241b(arrayList);
        }
        ArrayList arrayList2 = this.f43499a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C16881f fVar = (C16881f) it.next();
                if (fVar.mo50163g(((ConstraintLayout.C16926b) oVar.f43716b.getLayoutParams()).f44255c0)) {
                    oVar.mo50239a(fVar);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo50176c(C16881f fVar) {
        if (!this.f43499a.containsKey(Integer.valueOf(fVar.f43394b))) {
            this.f43499a.put(Integer.valueOf(fVar.f43394b), new ArrayList());
        }
        ArrayList arrayList = this.f43499a.get(Integer.valueOf(fVar.f43394b));
        if (arrayList != null) {
            arrayList.add(fVar);
        }
    }

    /* renamed from: d */
    public ArrayList<C16881f> mo50177d(int i) {
        return this.f43499a.get(Integer.valueOf(i));
    }

    /* renamed from: e */
    public Set<Integer> mo50178e() {
        return this.f43499a.keySet();
    }

    public C16886i(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        try {
            int eventType = xmlPullParser.getEventType();
            C16881f fVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f43497e.containsKey(name)) {
                        try {
                            Constructor constructor = f43497e.get(name);
                            if (constructor != null) {
                                C16881f fVar2 = (C16881f) constructor.newInstance(new Object[0]);
                                try {
                                    fVar2.mo50162f(context, Xml.asAttributeSet(xmlPullParser));
                                    mo50176c(fVar2);
                                } catch (Exception unused) {
                                }
                                fVar = fVar2;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (!(fVar == null || (hashMap2 = fVar.f43397e) == null)) {
                            ConstraintAttribute.m78206q(context, xmlPullParser, hashMap2);
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomMethod") || fVar == null || (hashMap = fVar.f43397e) == null)) {
                        ConstraintAttribute.m78206q(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
