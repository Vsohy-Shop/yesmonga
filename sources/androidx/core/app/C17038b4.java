package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.C0376v0;
import androidx.core.app.C17075f2;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@C0376v0(16)
/* renamed from: androidx.core.app.b4 */
public class C17038b4 {

    /* renamed from: a */
    public static final String f44969a = "NotificationCompat";

    /* renamed from: b */
    public static final String f44970b = "android.support.dataRemoteInputs";

    /* renamed from: c */
    public static final String f44971c = "android.support.allowGeneratedReplies";

    /* renamed from: d */
    public static final String f44972d = "icon";

    /* renamed from: e */
    public static final String f44973e = "title";

    /* renamed from: f */
    public static final String f44974f = "actionIntent";

    /* renamed from: g */
    public static final String f44975g = "extras";

    /* renamed from: h */
    public static final String f44976h = "remoteInputs";

    /* renamed from: i */
    public static final String f44977i = "dataOnlyRemoteInputs";

    /* renamed from: j */
    public static final String f44978j = "resultKey";

    /* renamed from: k */
    public static final String f44979k = "label";

    /* renamed from: l */
    public static final String f44980l = "choices";

    /* renamed from: m */
    public static final String f44981m = "allowFreeFormInput";

    /* renamed from: n */
    public static final String f44982n = "allowedDataTypes";

    /* renamed from: o */
    public static final String f44983o = "semanticAction";

    /* renamed from: p */
    public static final String f44984p = "showsUserInterface";

    /* renamed from: q */
    public static final Object f44985q = new Object();

    /* renamed from: r */
    public static Field f44986r;

    /* renamed from: s */
    public static boolean f44987s;

    /* renamed from: t */
    public static final Object f44988t = new Object();

    /* renamed from: u */
    public static Field f44989u;

    /* renamed from: v */
    public static Field f44990v;

    /* renamed from: w */
    public static Field f44991w;

    /* renamed from: x */
    public static Field f44992x;

    /* renamed from: y */
    public static boolean f44993y;

    /* renamed from: a */
    public static SparseArray<Bundle> m78785a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    public static boolean m78786b() {
        if (f44993y) {
            return false;
        }
        try {
            if (f44989u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f44990v = cls.getDeclaredField("icon");
                f44991w = cls.getDeclaredField("title");
                f44992x = cls.getDeclaredField(f44974f);
                Field declaredField = Notification.class.getDeclaredField("actions");
                f44989u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException unused) {
            f44993y = true;
        } catch (NoSuchFieldException unused2) {
            f44993y = true;
        }
        return true ^ f44993y;
    }

    /* renamed from: c */
    public static C17230s5 m78787c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f44982n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new C17230s5(bundle.getString(f44978j), bundle.getCharSequence("label"), bundle.getCharSequenceArray(f44980l), bundle.getBoolean(f44981m), 0, bundle.getBundle("extras"), hashSet);
    }

    /* renamed from: d */
    public static C17230s5[] m78788d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        C17230s5[] s5VarArr = new C17230s5[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            s5VarArr[i] = m78787c(bundleArr[i]);
        }
        return s5VarArr;
    }

    /* renamed from: e */
    public static C17075f2.C17077b m78789e(Notification notification, int i) {
        Bundle bundle;
        SparseArray sparseParcelableArray;
        synchronized (f44988t) {
            try {
                Object[] h = m78792h(notification);
                if (h != null) {
                    Object obj = h[i];
                    Bundle k = m78795k(notification);
                    if (k == null || (sparseParcelableArray = k.getSparseParcelableArray(C17013a4.f44959e)) == null) {
                        bundle = null;
                    } else {
                        bundle = (Bundle) sparseParcelableArray.get(i);
                    }
                    C17075f2.C17077b l = m78796l(f44990v.getInt(obj), (CharSequence) f44991w.get(obj), (PendingIntent) f44992x.get(obj), bundle);
                    return l;
                }
            } catch (IllegalAccessException unused) {
                f44993y = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m78790f(Notification notification) {
        int i;
        synchronized (f44988t) {
            Object[] h = m78792h(notification);
            if (h != null) {
                i = h.length;
            } else {
                i = 0;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static C17075f2.C17077b m78791g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean(f44971c, false);
        }
        return new C17075f2.C17077b(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f44974f), bundle.getBundle("extras"), m78788d(m78793i(bundle, f44976h)), m78788d(m78793i(bundle, f44977i)), z, bundle.getInt(f44983o), bundle.getBoolean(f44984p), false, false);
    }

    /* renamed from: h */
    public static Object[] m78792h(Notification notification) {
        synchronized (f44988t) {
            if (!m78786b()) {
                return null;
            }
            try {
                Object[] objArr = (Object[]) f44989u.get(notification);
                return objArr;
            } catch (IllegalAccessException unused) {
                f44993y = true;
                return null;
            }
        }
    }

    /* renamed from: i */
    public static Bundle[] m78793i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    /* renamed from: j */
    public static Bundle m78794j(C17075f2.C17077b bVar) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat f = bVar.mo51274f();
        if (f != null) {
            i = f.mo51947y();
        } else {
            i = 0;
        }
        bundle2.putInt("icon", i);
        bundle2.putCharSequence("title", bVar.mo51278j());
        bundle2.putParcelable(f44974f, bVar.mo51269a());
        if (bVar.mo51272d() != null) {
            bundle = new Bundle(bVar.mo51272d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(f44971c, bVar.mo51270b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray(f44976h, m78798n(bVar.mo51275g()));
        bundle2.putBoolean(f44984p, bVar.mo51277i());
        bundle2.putInt(f44983o, bVar.mo51276h());
        return bundle2;
    }

    /* renamed from: k */
    public static Bundle m78795k(Notification notification) {
        synchronized (f44985q) {
            if (f44987s) {
                return null;
            }
            try {
                if (f44986r == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f44987s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f44986r = declaredField;
                }
                Bundle bundle = (Bundle) f44986r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f44986r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f44987s = true;
                return null;
            }
        }
    }

    /* renamed from: l */
    public static C17075f2.C17077b m78796l(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z;
        C17230s5[] s5VarArr;
        C17230s5[] s5VarArr2;
        Bundle bundle2 = bundle;
        if (bundle2 != null) {
            s5VarArr2 = m78788d(m78793i(bundle2, C17013a4.f44960f));
            s5VarArr = m78788d(m78793i(bundle2, f44970b));
            z = bundle2.getBoolean(f44971c);
        } else {
            s5VarArr2 = null;
            s5VarArr = null;
            z = false;
        }
        return new C17075f2.C17077b(i, charSequence, pendingIntent, bundle, s5VarArr2, s5VarArr, z, 0, true, false, false);
    }

    /* renamed from: m */
    public static Bundle m78797m(C17230s5 s5Var) {
        Bundle bundle = new Bundle();
        bundle.putString(f44978j, s5Var.mo51680o());
        bundle.putCharSequence("label", s5Var.mo51679n());
        bundle.putCharSequenceArray(f44980l, s5Var.mo51676h());
        bundle.putBoolean(f44981m, s5Var.mo51674f());
        bundle.putBundle("extras", s5Var.mo51678m());
        Set<String> g = s5Var.mo51675g();
        if (g != null && !g.isEmpty()) {
            ArrayList arrayList = new ArrayList(g.size());
            for (String add : g) {
                arrayList.add(add);
            }
            bundle.putStringArrayList(f44982n, arrayList);
        }
        return bundle;
    }

    /* renamed from: n */
    public static Bundle[] m78798n(C17230s5[] s5VarArr) {
        if (s5VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[s5VarArr.length];
        for (int i = 0; i < s5VarArr.length; i++) {
            bundleArr[i] = m78797m(s5VarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: o */
    public static Bundle m78799o(Notification.Builder builder, C17075f2.C17077b bVar) {
        int i;
        IconCompat f = bVar.mo51274f();
        if (f != null) {
            i = f.mo51947y();
        } else {
            i = 0;
        }
        builder.addAction(i, bVar.mo51278j(), bVar.mo51269a());
        Bundle bundle = new Bundle(bVar.mo51272d());
        if (bVar.mo51275g() != null) {
            bundle.putParcelableArray(C17013a4.f44960f, m78798n(bVar.mo51275g()));
        }
        if (bVar.mo51271c() != null) {
            bundle.putParcelableArray(f44970b, m78798n(bVar.mo51271c()));
        }
        bundle.putBoolean(f44971c, bVar.mo51270b());
        return bundle;
    }
}
