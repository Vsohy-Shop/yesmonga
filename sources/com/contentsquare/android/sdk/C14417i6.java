package com.contentsquare.android.sdk;

import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.contentsquare.android.sdk.i6 */
public class C14417i6 {

    /* renamed from: a */
    public final C14213b7 f35636a;

    /* renamed from: b */
    public final Map<View, Boolean> f35637b = new WeakHashMap();

    /* renamed from: c */
    public final List<C14418a> f35638c;

    /* renamed from: com.contentsquare.android.sdk.i6$a */
    public static class C14418a {

        /* renamed from: a */
        public final Class<?> f35639a;

        /* renamed from: b */
        public final Boolean f35640b;

        public C14418a(Class<?> cls) {
            this.f35639a = cls;
            this.f35640b = Boolean.FALSE;
        }

        /* renamed from: a */
        public Class<?> mo35529a() {
            return this.f35639a;
        }

        /* renamed from: b */
        public Boolean mo35530b() {
            return this.f35640b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f35639a.equals(((C14418a) obj).f35639a);
        }

        public int hashCode() {
            return this.f35639a.hashCode();
        }

        public C14418a(Class<?> cls, Boolean bool) {
            this.f35639a = cls;
            this.f35640b = bool;
        }
    }

    public C14417i6(C14213b7 b7Var) {
        ArrayList arrayList = new ArrayList();
        this.f35638c = arrayList;
        this.f35636a = b7Var;
        Boolean bool = Boolean.TRUE;
        arrayList.add(new C14418a(EditText.class, bool));
        arrayList.add(new C14418a(WebView.class, bool));
    }

    /* renamed from: a */
    public void mo35521a(View view) {
        this.f35637b.put(view, Boolean.TRUE);
    }

    /* renamed from: b */
    public void mo35522b(Class<?> cls) {
        this.f35638c.remove(new C14418a(cls));
        this.f35638c.add(new C14418a(cls, Boolean.TRUE));
    }

    /* renamed from: c */
    public void mo35523c(boolean z) {
        this.f35636a.mo34683o(C14477k8.SESSION_REPLAY_DEFAULT_MASKING, z);
    }

    /* renamed from: d */
    public boolean mo35524d() {
        return this.f35636a.mo34676h(C14477k8.SESSION_REPLAY_DEFAULT_MASKING, true);
    }

    /* renamed from: e */
    public boolean mo35525e(View view, boolean z) {
        Boolean bool = this.f35637b.get(view);
        return bool != null ? bool.booleanValue() : mo35528h(view, z);
    }

    /* renamed from: f */
    public void mo35526f(View view) {
        this.f35637b.put(view, Boolean.FALSE);
    }

    /* renamed from: g */
    public void mo35527g(Class<?> cls) {
        this.f35638c.remove(new C14418a(cls));
        this.f35638c.add(new C14418a(cls, Boolean.FALSE));
    }

    /* renamed from: h */
    public final boolean mo35528h(View view, boolean z) {
        int size = this.f35638c.size();
        for (int i = 0; i < size; i++) {
            if (this.f35638c.get(i).mo35529a().isInstance(view)) {
                if (this.f35638c.get(i).mo35530b().booleanValue()) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }
}
